package com.zz.bms.oss.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.controller.base.controller.BaseController;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.core.exceptions.InternalException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.oss.service.FileService;
import com.zz.bms.oss.vo.FileUseVO;
import com.zz.bms.oss.vo.FileVO;
import com.zz.bms.oss.engine.engine.StorageProcess;
import com.zz.bms.oss.engine.enums.EnumFileEngine;
import com.zz.bms.system.bo.TsFileBO;
import com.zz.bms.system.bo.TsFileUseBO;
import com.zz.bms.system.bo.VsFileUseBO;
import com.zz.bms.system.service.TsFileService;
import com.zz.bms.system.service.VsFileUseService;
import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.util.file.DownloadBaseUtil;
import com.zz.bms.util.file.FileKit;
import com.zz.bms.util.file.FileUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理用户信息
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
        try {
            FileUtils.download(request, response, vsFileUseBO.getFileName(), vsFileUseBO.getContentType(), vsFileUseBO.getShowName());
        }catch (Exception e) {
            File f = new File(vsFileUseBO.getFileName());
            DownloadBaseUtil.download(f, vsFileUseBO.getShowName(), response, false);
        }

    }

    /**
     * 上传文件
     * @param files
     * @param res
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/upload" , method = RequestMethod.POST )
    @ResponseBody
    public Object upload(@RequestParam(value="file") MultipartFile[] files, HttpServletResponse res, HttpServletRequest request) throws  Exception{


        if(files == null || files.length == 0) {
            return AjaxJson.errorAjax;
        }

        String businessType = request.getParameter("businessType");
        String businessId = request.getParameter("businessId");
        String businessFileType = request.getParameter("businessFileType");
        String businessTempId = request.getParameter("businessTempId");
        String remark = request.getParameter("remark");

        StorageProcess sp = buildStorageProcess(null , null , 0) ;


        ILoginUserEntity<String> loginUser =  getSessionUser();

        List<FileUseVO> list = new ArrayList<FileUseVO>();

        int index = 1;

        try {

            for(MultipartFile file : files){
                //处理每个文件

                TsFileUseBO bo = new TsFileUseBO();

                String showName = file.getOriginalFilename();
                String md5 = FileKit.getFileMD5(file.getInputStream());

                bo.setShowName(showName);
                bo.setBusinessType(businessType);
                bo.setBusinessId(businessId);
                bo.setBusinessFileType(businessFileType);
                bo.setBusinessTempId(businessTempId);
                bo.setRemark(remark);
                bo.setFileOrder(index++);

                QueryWrapper<TsFileBO> wrapper = new QueryWrapper<>();
                wrapper.eq("md5" , md5);
                wrapper.eq("delete_flag" , EnumYesNo.NO.getCode());
                wrapper.gt("use_frequency" , 0) ;
                TsFileBO oneFile = tsFileService.getOne(wrapper);
                if( oneFile == null ){
                    oneFile = new TsFileBO();

                    FileVO fileVO = sp.store(file.getInputStream() , FileKit.buildFilePath(""));
                    String suffix = FileKit.getSuffix(showName);
                    long fileSize = file.getSize();
                    String contentType = file.getContentType();

                    oneFile.setFileEngineName(sp.getEngine().getLabel());
                    oneFile.setFileEngine(sp.getEngine().getVal());
                    oneFile.setTenantId(loginUser.getTenantId());
                    oneFile.setFileSize(fileSize);
                    oneFile.setContentType(contentType);
                    oneFile.setFileSuffix(suffix);
                    oneFile.setAccessUrlPrefix(fileVO.getAccessUrlPrefix());
                    oneFile.setAccessUrl(fileVO.getAccessUrl());
                    oneFile.setFileBasePath(fileVO.getFileBasePath());
                    oneFile.setFilePath(fileVO.getFilePath());
                    oneFile.setFileName(fileVO.getFileName());
                }
                list.add(new FileUseVO(oneFile ,bo));
            }



            fileService.saveFiles(list);

        }catch(Exception e){
            logger.error(e);
            return AjaxJson.errorAjax;
        }


        return null;
    }


    /**
     *
     * 选择file storage 方式 ,  根据业务和已有的storage方式
     * @param businessType      业务类型
     * @param fileType          文件类型
     * @param fileSize          文件大小
     * @return
     */
    private StorageProcess buildStorageProcess(String businessType , String fileType , long fileSize) {
        //因为没有其他的方式， 直接用本地文件系统的方式

        if(storageProcesss == null || storageProcesss.length == 0){
            throw new InternalException("OSS 没有配置正确");
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
