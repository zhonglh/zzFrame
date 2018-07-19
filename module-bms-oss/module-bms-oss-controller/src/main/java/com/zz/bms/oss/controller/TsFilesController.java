package com.zz.bms.oss.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.exceptions.InternalException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.oss.base.entity.TsFilesEntity;
import com.zz.bms.oss.base.logic.vo.FileVO;
import com.zz.bms.oss.base.service.TsFilesService;
import com.zz.bms.oss.engine.engine.StorageProcess;
import com.zz.bms.oss.engine.enums.EnumFileEngine;
import com.zz.bms.oss.engine.util.FileVOUtil;
import com.zz.bms.util.base.files.FileKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
@RequestMapping("oss/files")
@Controller
public class TsFilesController extends DefaultController<TsFilesEntity, String> {


    @Autowired
    private TsFilesService tsFilesService;


    @Autowired
    private StorageProcess[] storageProcesss;



    /**
     * 上传文件 fastdfs
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

        StorageProcess sp = buildStorageProcess(null , null , 0) ;

        List<FileVO> list = new ArrayList<FileVO>();

        try {

            for(MultipartFile file : files){
                //处理每个文件

                String md5 = FileKit.getFileMD5(file.getInputStream());
                Wrapper<TsFilesEntity> wrapper = new EntityWrapper<TsFilesEntity>();
                wrapper.eq("md5" , md5);
                wrapper.eq("delete_flag" , EnumYesNo.NO.getCode());
                wrapper.gt("use_frequency" , 0) ;
                TsFilesEntity one = tsFilesService.selectOne(wrapper);
                if( one != null ){
                    list.add(FileVOUtil.toFileVO(one));
                    continue;
                }

                String suffix = FileKit.getSuffix(file.getOriginalFilename());

                String accessUrl = sp.store(file.getInputStream() , sp.getPath(""));




            }




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


    @Override
    public String getResourceIdentity() {
        return "oss:files";
    }

    /**
     * 设置通用数据
     * 在新增 或编辑界面，  提供下拉数据等
     * @param model
     */
    @Override
    protected void setCommonData(ModelMap model) {

    }


    @Override
    protected boolean isExist(TsFilesEntity tsFilesEntity) {
        return true;
    }





}
