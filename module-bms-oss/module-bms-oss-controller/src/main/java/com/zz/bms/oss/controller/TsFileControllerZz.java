package com.zz.bms.oss.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.controller.base.controller.BaseCURDController;
import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.core.exceptions.InternalException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.oss.engine.engine.StorageProcess;
import com.zz.bms.oss.engine.enums.EnumFileEngine;
import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.util.file.FileKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理用户信息
 * @author Administrator
 */
@RequestMapping("oss/file")
@Controller
public class TsFileControllerZz  {

/*
    @Autowired
    private TsFileService tsFileService;


    @Autowired
    private VsFileUseService vsFileUseService;


    @Autowired
    private StorageProcess[] storageProcesss;



    *//**
     * 上传文件
     * @param file
     * @param res
     * @param request
     * @return
     * @throws Exception
     *//*
    @RequestMapping(value = "/upload" , method = RequestMethod.POST )
    @ResponseBody
    public Object upload(@RequestParam(value="file") MultipartFile[] file, HttpServletResponse res, HttpServletRequest request) throws  Exception{


        if(file == null || file.length == 0) {
            return AjaxJson.errorAjax;
        }

        String businessType = request.getParameter("businessType");
        String businessTmpId = request.getParameter("businessTmpId");
        String businessId = request.getParameter("businessId");
        String remark = request.getParameter("remark");

        StorageProcess sp = buildStorageProcess(null , null , 0) ;

        List<FileVO> list = new ArrayList<FileVO>();

        try {

            for(MultipartFile file : file){
                //处理每个文件

                VsFileUseEntity vsFileUseEntity = new VsFileUseEntity();

                String showName = file.getOriginalFilename();
                String md5 = FileKit.getFileMD5(file.getInputStream());

                vsFileUseEntity.setShowName(showName);
                vsFileUseEntity.setMd5(md5);
                vsFileUseEntity.setBusinessId(businessId);
                vsFileUseEntity.setBusinessTmpId(businessTmpId);
                vsFileUseEntity.setBusinessType(businessType);
                vsFileUseEntity.setRemark(remark);
                vsFileUseEntity.setId(IdUtils.getId());

                QueryWrapper<TsFileEntity> wrapper = new QueryWrapper<>();
                wrapper.eq("md5" , md5);
                wrapper.eq("delete_flag" , EnumYesNo.NO.getCode());
                wrapper.gt("use_frequency" , 0) ;
                TsFileEntity one = tsFileService.getOne(wrapper);
                if( one != null ){
                    list.add(FileVOUtil.toFileVO(one));
                    FileVOUtil.toVsFileUser(vsFileUseEntity , one);
                    vsFileUseService.save(vsFileUseEntity);
                    continue;
                }


                String accessUrl = sp.store(file.getInputStream() , sp.getPath(""));
                String suffix = FileKit.getSuffix(showName);
                long fileSize = file.getSize();
                String fileEngine = ((Component)(sp.getClass().getAnnotation(Component.class))).value();
                String contentType = file.getContentType();

                vsFileUseEntity.setMd5(md5);
                vsFileUseEntity.setAccessUrl(accessUrl);
                vsFileUseEntity.setContentType(contentType);
                vsFileUseEntity.setFileEngine(fileEngine);
                vsFileUseEntity.setFileHost("");
                vsFileUseEntity.setFileName("");
                vsFileUseEntity.setFilePath("");
                vsFileUseEntity.setFileSize(fileSize);
                vsFileUseEntity.setFileSuffix(suffix);
                vsFileUseEntity.setUseFrequency(0);
                vsFileUseService.save(vsFileUseEntity);


            }




        }catch(Exception e){
            logger.error(e);
            return AjaxJson.errorAjax;
        }


        return null;
    }


    *//**
     *
     * 选择file storage 方式 ,  根据业务和已有的storage方式
     * @param businessType      业务类型
     * @param fileType          文件类型
     * @param fileSize          文件大小
     * @return
     *//*
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


    @Override
    protected void isExist(TsFileEntity tsFileEntity) {

    }*/
}
