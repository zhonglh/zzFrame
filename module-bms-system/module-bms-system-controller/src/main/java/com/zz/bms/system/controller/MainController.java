package com.zz.bms.system.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.zz.bms.controller.base.controller.BaseBussinessController;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.shiro.utils.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 * 处理首页信息
 * @author Administrator
 */
@RequestMapping("/main")
@Controller
public class MainController extends BaseBussinessController {




    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(HttpServletRequest request , HttpServletResponse response){
        return "main/home";
    }




    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String home2(HttpServletRequest request , HttpServletResponse response){
        return "main/welcome";
    }

}
