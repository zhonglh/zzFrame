package com.zz.bms.controller.base.controller;

import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 处理登录信息
 * @author Administrator
 */
@RequestMapping("/toLogin")
@Controller
public class LoginPageController extends BusinessController {


    @Autowired
    private Producer producer;


    @RequestMapping(method = RequestMethod.GET)
    public String toLogin() {
        return "login/login";
    }

}
