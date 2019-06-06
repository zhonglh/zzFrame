package com.zz.bms.oss.controller;


import com.zz.bms.core.vo.AjaxJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
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
     * 上传图片
     * @param imageData
     * @param res
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/upload" , method = RequestMethod.POST )
    @ResponseBody
    public Object uploadImage(String  imageData, HttpServletResponse res, HttpServletRequest request) throws  Exception{

        String imgBase64 = URLDecoder.decode(imageData,"UTF-8");
        imgBase64 = imgBase64.substring(22);
        try {
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] imgByte = decoder.decode(imgBase64);
            InputStream inputStream=new ByteArrayInputStream(imgByte);
            return this.saveFileInfo(inputStream , "" , new Long (imgBase64.length()) , "image" ,request );
        }catch (Exception e) {
            log.error(e.getMessage() , e);
        }
        return AjaxJson.errorAjax;
    }

}
