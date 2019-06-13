package com.zz.bms.oss.controller;


import com.zz.bms.oss.engine.engine.StorageProcess;
import com.zz.bms.oss.engine.enums.EnumFileType;
import com.zz.bms.oss.vo.FileVO;
import com.zz.bms.util.file.FileKit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 处理图片信息
 * @author Administrator
 */
@RequestMapping("oss/image")
@Controller
@Slf4j
public class ImageController extends OssController  {

    /**
     * 上传图片
     * @param imageData
     * @param res
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/uploadImage" , method = RequestMethod.POST )
    @ResponseBody
    public Object uploadImage(String  imageData, HttpServletResponse res, HttpServletRequest request) throws  Exception{

        imageData = imageData.substring(22);
        BASE64Decoder decoder = new sun.misc.BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(imageData);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);


        String businessType = request.getParameter("businessType");
        String businessId = request.getParameter("businessId");
        String businessFileType = request.getParameter("businessFileType");
        String businessTempId = request.getParameter("businessTempId");
        String remark = request.getParameter("remark");

        StorageProcess sp = buildStorageProcess(businessType , businessFileType , bytes.length) ;


        //保存文件
        FileVO fileVO = saveFile(bais, sp);


        return this.saveFileInfo(fileVO ,sp , "header.jpg" , new Long (bytes.length) , "image/jpg" ,request );

    }


    @Override
    protected FileVO saveFile(InputStream inputStream, StorageProcess sp) {
        return sp.store(inputStream , FileKit.buildFilePath("") , EnumFileType.ImageType);
    }

}
