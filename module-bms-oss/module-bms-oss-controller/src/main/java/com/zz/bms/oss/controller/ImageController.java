package com.zz.bms.oss.controller;


import com.zz.bms.core.vo.AjaxJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Base64;

/**
 * 处理图片信息
 * @author Administrator
 */
@RequestMapping("oss/image")
@Controller
@Slf4j
public class ImageController extends OssController  {


    /**
     * 将二进制转成图片
     * @param base64String
     * @return
     */
    public byte[] base64StringToImage(String base64String){
        try {
            BASE64Decoder decoder = new sun.misc.BASE64Decoder();
            return  decoder.decodeBuffer(base64String);
        } catch (IOException e) {
            log.error(e.getMessage(),e);
        }
        return null;
    }


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

        String imgBase64 = URLDecoder.decode(imageData,"UTF-8");
        imgBase64 = imgBase64.substring(22);
        try {
            byte[] imgByte = base64StringToImage(imgBase64);
            InputStream inputStream=new ByteArrayInputStream(imgByte);
            return this.saveFileInfo(inputStream , "" , new Long (imgBase64.length()) , "image" ,request );
        }catch (Exception e) {
            log.error(e.getMessage() , e);
        }
        return AjaxJson.errorAjax;
    }

}
