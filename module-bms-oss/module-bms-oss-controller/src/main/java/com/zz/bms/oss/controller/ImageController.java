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


        BASE64Decoder decoder = new sun.misc.BASE64Decoder();
        byte[] bytes = decoder.decodeBuffer(imageData);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);


        return this.saveFileInfo(bais , "header.jpg" , new Long (bytes.length) , "image/jpg" ,request );

        /*String imgBase64 = URLDecoder.decode(imageData,"UTF-8");
        imgBase64 = imgBase64.substring(22);
        InputStream inputStream = null;
        try {
            byte[] imgByte = base64StringToImage(imgBase64);
            inputStream = new ByteArrayInputStream(imgByte);
            return this.saveFileInfo(inputStream , "" , new Long (imgBase64.length()) , "image/png" ,request );
        }catch (Exception e) {
            log.error(e.getMessage() , e);
        }finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                }catch (Exception ee){

                }
            }
        }*/
        //return AjaxJson.errorAjax;
    }


    @Override
    protected FileVO saveFile(InputStream inputStream, StorageProcess sp) {
        return sp.store(inputStream , FileKit.buildFilePath("") , EnumFileType.ImageType);
    }

}
