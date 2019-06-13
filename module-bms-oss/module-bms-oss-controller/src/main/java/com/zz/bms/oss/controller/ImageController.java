package com.zz.bms.oss.controller;


import com.sun.org.apache.xml.internal.security.utils.Base64;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 处理图片信息
 * @author Administrator
 */
@RequestMapping("oss/image")
@Controller
@Slf4j
public class ImageController extends OssController  {



    public String getSubUtilSimple(String soap,String rgex){
        Pattern pattern = Pattern.compile(rgex);
        Matcher m = pattern.matcher(soap);
        while(m.find()){
            return m.group(1);
        }
        return "";


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


        String rgex = "data:image/(.*?);base64";
        String type = getSubUtilSimple(imageData, rgex);
        //去除base64图片的前缀
        imageData = imageData.replaceFirst("data:(.+?);base64,", "");



        //把图片转换成二进制
        byte[] bytes = Base64.decode(imageData.replaceAll(" ", "+"));

        BASE64Decoder d = new BASE64Decoder();
        byte[] bs = d.decodeBuffer(Base64.encode(bytes));
        ByteArrayInputStream bais = new ByteArrayInputStream(bs);


        return this.saveFileInfo(bs , "header."+type , new Long (bytes.length) , "image/"+type ,request );

    }


    @Override
    protected FileVO saveFile(InputStream inputStream, StorageProcess sp) {
        return sp.store(inputStream , FileKit.buildFilePath("") , EnumFileType.ImageType);
    }

}
