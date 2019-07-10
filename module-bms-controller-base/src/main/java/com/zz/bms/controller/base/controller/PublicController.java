package com.zz.bms.controller.base.controller;


import com.zz.bms.core.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author admin
 */
@RequestMapping("/public")
@Controller
public class PublicController extends BaseController {


    @RequestMapping(value = "/icons" ,method = RequestMethod.GET)
    public String icons(ModelMap modelMap) {
        return "public/icons";
    }
}
