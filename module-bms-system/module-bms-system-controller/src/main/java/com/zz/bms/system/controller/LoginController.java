package com.zz.bms.system.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.zz.bms.controller.base.controller.BaseController;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.shiro.utils.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 * 处理登录信息
 * @author Administrator
 */
@RequestMapping("/login")
@Controller
public class LoginController extends BaseController {




    @Autowired
    private Producer producer;

    @RequestMapping("/captcha")
    public void captcha(HttpServletResponse response)throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //生成文字验证码
        String text = producer.createText();

        //生成图片验证码
        BufferedImage image = producer.createImage(text);

        //保存到shiro session
        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);

        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
    }




    @RequestMapping("/login")
    @ResponseBody
    public Object login(String loginName, String loginPassword) {
        try{
            Subject subject = ShiroUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(loginName, loginPassword);
            subject.login(token);
            return AjaxJson.successAjax;
        }catch (UnknownAccountException e) {
            return AjaxJson.fail(e.getMessage());
        }catch (IncorrectCredentialsException e) {
            return AjaxJson.fail("账号或密码不正确");
        }catch (LockedAccountException e) {
            return AjaxJson.fail("账号已被锁定,请联系管理员");
        }catch (AuthenticationException e) {
            return AjaxJson.fail(e.getMessage());
        }catch (Exception e) {
            return AjaxJson.fail(e.getMessage());
        }
    }



    @RequestMapping("/logout")
    public String logout() {
        try{
            Subject subject = ShiroUtils.getSubject();
            subject.logout();
        }catch (Exception e) {

        }
        return "redirect:/toLogin";
    }


}
