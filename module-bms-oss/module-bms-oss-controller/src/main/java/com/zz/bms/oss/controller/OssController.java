package com.zz.bms.oss.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.controller.base.controller.BaseController;
import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.exceptions.InternalException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.oss.engine.engine.StorageProcess;
import com.zz.bms.oss.engine.enums.EnumFileEngine;
import com.zz.bms.oss.engine.enums.EnumFileType;
import com.zz.bms.oss.service.FileService;
import com.zz.bms.oss.vo.FileUseVO;
import com.zz.bms.oss.vo.FileVO;
import com.zz.bms.system.bo.TsFileBO;
import com.zz.bms.system.bo.TsFileUseBO;
import com.zz.bms.system.bo.VsFileUseBO;
import com.zz.bms.system.service.TsFileService;
import com.zz.bms.system.service.VsFileUseService;
import com.zz.bms.util.file.DownloadBaseUtil;
import com.zz.bms.util.file.FileKit;
import com.zz.bms.util.file.FileUtils;
import com.zz.bms.util.web.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理文件信息
 * @author Administrator
 */
@RequestMapping("oss/file")
@Controller
@Slf4j
public class OssController extends BaseController<String> {


    @Autowired
    private TsFileService tsFileService;


    @Autowired
    private VsFileUseService vsFileUseService;

    @Autowired
    private FileService fileService;


    @Autowired
    private StorageProcess[] storageProcesss;


    @RequestMapping(value = "/view/{id}" , method = RequestMethod.GET )
    public void viewFile(@PathVariable(value="id") String id, HttpServletResponse response, HttpServletRequest request) throws  Exception {

        QueryWrapper<VsFileUseBO> qw = new QueryWrapper<VsFileUseBO>();
        qw.lambda().eq(VsFileUseBO::getId , id) ;
        VsFileUseBO vsFileUseBO = vsFileUseService.getOne(qw);
        if(vsFileUseBO == null){
            return ;
        }
        try {
            FileUtils.print(request, response, vsFileUseBO.getFilePullName(), vsFileUseBO.getContentType(), vsFileUseBO.getShowName());
        }catch (Exception e) {
            File f = new File(vsFileUseBO.getFileName());
            DownloadBaseUtil.download(f, vsFileUseBO.getShowName(), response, false);
        }

    }


    @RequestMapping(value = "/download/{id}" , method = RequestMethod.GET )
    public void download(@PathVariable(value="id") String id, HttpServletResponse response, HttpServletRequest request) throws  Exception {

        QueryWrapper<VsFileUseBO> qw = new QueryWrapper<VsFileUseBO>();
        qw.lambda().eq(VsFileUseBO::getId , id) ;
        VsFileUseBO vsFileUseBO = vsFileUseService.getOne(qw);
        if(vsFileUseBO == null){
            return ;
        }
        try {
            FileUtils.download(request, response, vsFileUseBO.getFilePullName(), vsFileUseBO.getContentType(), vsFileUseBO.getShowName());
        }catch (Exception e) {
            File f = new File(vsFileUseBO.getFileName());
            DownloadBaseUtil.download(f, vsFileUseBO.getShowName(), response, false);
        }

    }

    /**
     * 上传文件
     * @param file
     * @param res
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/upload" , method = RequestMethod.POST )
    @ResponseBody
    public Object upload(@RequestParam(value="file") MultipartFile file, HttpServletResponse res, HttpServletRequest request) throws  Exception{


        if(file == null ) {
            return AjaxJson.errorAjax;
        }
        return saveFileInfo(file, request);
    }


    protected Object saveFileInfo(MultipartFile file, HttpServletRequest request) {
        try {
            return saveFileInfo(file.getInputStream() , file.getOriginalFilename() , file.getSize() , file.getContentType() , request);
        } catch (IOException e) {
            log.error(e.getMessage() ,e);
        }

        return AjaxJson.errorAjax;
    }

    protected Object saveFileInfo(InputStream inputStream,
                                String originalFilename,
                                long size ,
                                String contentType,
                                HttpServletRequest request) {


        String businessType = request.getParameter("businessType");
        String businessId = request.getParameter("businessId");
        String businessFileType = request.getParameter("businessFileType");
        String businessTempId = request.getParameter("businessTempId");
        String remark = request.getParameter("remark");
        StorageProcess sp = buildStorageProcess(businessType , businessFileType ,size) ;


        ILoginUserEntity<String> loginUser =  getSessionUser();

        List<FileUseVO> list = new ArrayList<FileUseVO>();

        TsFileBO oneFile = null ;
        TsFileUseBO bo = null;

        int index = 1;

        try {

                bo = new TsFileUseBO();

                String showName = originalFilename;
                String md5 = FileKit.getFileMD5(inputStream);

                bo.setShowName(showName);
                bo.setBusinessType(businessType);
                bo.setBusinessId(businessId);
                bo.setBusinessFileType(businessFileType);
                bo.setBusinessTempId(businessTempId);
                bo.setRemark(remark);
                bo.setFileOrder(index++);
                bo.setCreateTime(new Timestamp(System.currentTimeMillis()));
                bo.setCreateUserId(loginUser.getId());
                bo.setCreateUserName(loginUser.getUserName());
                bo.setTenantId(loginUser.getTenantId());
                bo.setOrganId(loginUser.getOrganId());
                bo.setVersionNo(Constant.INIT_VERSION);
                bo.setDeleteFlag(EnumYesNo.NO.getCode());

                QueryWrapper<TsFileBO> wrapper = new QueryWrapper<>();
                wrapper.eq("md5" , md5);
                wrapper.gt("use_frequency" , 0) ;
                oneFile = tsFileService.getOne(wrapper);
                if( oneFile == null ){
                    oneFile = new TsFileBO();

                    //保存文件
                    FileVO fileVO = saveFile(inputStream, sp);

                    String suffix = FileKit.getSuffix(showName);
                    long fileSize = size;

                    oneFile.setFileEngineName(sp.getEngine().getLabel());
                    oneFile.setFileEngine(sp.getEngine().getVal());
                    oneFile.setFileSize(fileSize);
                    oneFile.setMd5(md5);
                    oneFile.setContentType(contentType);
                    oneFile.setFileSuffix(suffix);
                    oneFile.setAccessUrlPrefix(fileVO.getAccessUrlPrefix());
                    oneFile.setAccessUrl(fileVO.getAccessUrl());
                    oneFile.setFileBasePath(fileVO.getFileBasePath());
                    oneFile.setFilePath(fileVO.getFilePath());
                    oneFile.setFileHost(IpUtil.getIp());
                    oneFile.setFileName(fileVO.getFileName());

                }
                list.add(new FileUseVO(oneFile ,bo));




            fileService.saveFiles(list);

        }catch(Exception e){
            logger.error(e.getMessage() ,e);
            return AjaxJson.errorAjax;
        }


        AjaxJson ajaxJson =  new AjaxJson(true);
        VsFileUseBO vsFileUseBO = new VsFileUseBO();
        vsFileUseBO.setId(bo.getId());
        vsFileUseBO.setFileId(oneFile.getId());
        vsFileUseBO.setShowName(bo.getShowName());
        vsFileUseBO.setAccessUrl(oneFile.getAccessUrl());
        vsFileUseBO.setFileEngine(sp.getEngine().getVal());
        ajaxJson.setObj(vsFileUseBO);

        return ajaxJson;
    }

    protected Object saveFileInfo(byte[] bs,
                                  String originalFilename,
                                  long size ,
                                  String contentType,
                                  HttpServletRequest request) {


        String businessType = request.getParameter("businessType");
        String businessId = request.getParameter("businessId");
        String businessFileType = request.getParameter("businessFileType");
        String businessTempId = request.getParameter("businessTempId");
        String remark = request.getParameter("remark");
        StorageProcess sp = buildStorageProcess(businessType , businessFileType ,size) ;


        ILoginUserEntity<String> loginUser =  getSessionUser();

        List<FileUseVO> list = new ArrayList<FileUseVO>();

        TsFileBO oneFile = null ;
        TsFileUseBO bo = null;

        int index = 1;

        try {

            bo = new TsFileUseBO();

            String showName = originalFilename;
            String md5 = null;

            bo.setShowName(showName);
            bo.setBusinessType(businessType);
            bo.setBusinessId(businessId);
            bo.setBusinessFileType(businessFileType);
            bo.setBusinessTempId(businessTempId);
            bo.setRemark(remark);
            bo.setFileOrder(index++);
            bo.setCreateTime(new Timestamp(System.currentTimeMillis()));
            bo.setCreateUserId(loginUser.getId());
            bo.setCreateUserName(loginUser.getUserName());
            bo.setTenantId(loginUser.getTenantId());
            bo.setOrganId(loginUser.getOrganId());
            bo.setVersionNo(Constant.INIT_VERSION);
            bo.setDeleteFlag(EnumYesNo.NO.getCode());

            oneFile = new TsFileBO();

            //保存文件
            FileVO fileVO = saveFile(bs, sp);

            String suffix = FileKit.getSuffix(showName);
            long fileSize = size;

            oneFile.setFileEngineName(sp.getEngine().getLabel());
            oneFile.setFileEngine(sp.getEngine().getVal());
            oneFile.setFileSize(fileSize);
            oneFile.setMd5(md5);
            oneFile.setContentType(contentType);
            oneFile.setFileSuffix(suffix);
            oneFile.setAccessUrlPrefix(fileVO.getAccessUrlPrefix());
            oneFile.setAccessUrl(fileVO.getAccessUrl());
            oneFile.setFileBasePath(fileVO.getFileBasePath());
            oneFile.setFilePath(fileVO.getFilePath());
            oneFile.setFileHost(IpUtil.getIp());
            oneFile.setFileName(fileVO.getFileName());


            list.add(new FileUseVO(oneFile ,bo));




            fileService.saveFiles(list);

        }catch(Exception e){
            logger.error(e.getMessage() ,e);
            return AjaxJson.errorAjax;
        }


        AjaxJson ajaxJson =  new AjaxJson(true);
        VsFileUseBO vsFileUseBO = new VsFileUseBO();
        vsFileUseBO.setId(bo.getId());
        vsFileUseBO.setFileId(oneFile.getId());
        vsFileUseBO.setShowName(bo.getShowName());
        vsFileUseBO.setAccessUrl(oneFile.getAccessUrl());
        vsFileUseBO.setFileEngine(sp.getEngine().getVal());
        ajaxJson.setObj(vsFileUseBO);

        return ajaxJson;
    }


    /**
     * 真正保存文件到本地
     * @param inputStream
     * @param sp
     * @return
     */
    protected FileVO saveFile(InputStream inputStream, StorageProcess sp) {
        return sp.store(inputStream , FileKit.buildFilePath("") , EnumFileType.FileType);
    }



    /**
     * 真正保存文件到本地
     * @param bs
     * @param sp
     * @return
     */
    protected FileVO saveFile(byte[] bs , StorageProcess sp) {
        return sp.store(bs , FileKit.buildFilePath("") , EnumFileType.ImageType);
    }



    /**
     *
     * 选择file storage 方式 ,  根据业务和已有的storage方式
     * @param businessType      业务类型
     * @param fileType          文件类型
     * @param fileSize          文件大小
     * @return
     */
    protected StorageProcess buildStorageProcess(String businessType , String fileType , long fileSize) {
        //因为没有其他的方式， 直接用本地文件系统的方式

        if(storageProcesss == null || storageProcesss.length == 0){
            throw new InternalException("OSS 没有配置正确");
        }

        if(storageProcesss.length == 1){
            return storageProcesss[0];
        }

        for(StorageProcess sp : storageProcesss){
            if(sp.isActive()){
                Component component = sp.getClass().getAnnotation(Component.class);
                if(component.value().equals(EnumFileEngine.FILESYSTEM.name())){
                    return sp;
                }
            }
        }

        throw new InternalException("OSS 没有配置正确");

    }


}
