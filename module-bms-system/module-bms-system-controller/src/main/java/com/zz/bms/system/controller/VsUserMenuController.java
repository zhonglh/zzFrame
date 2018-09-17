package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;

import com.zz.bms.system.bo.VsUserMenuBO;
import  com.zz.bms.system.query.impl.VsUserMenuQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 菜单 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/usermenu")
@Controller
public class VsUserMenuController extends ZzDefaultController<VsUserMenuBO, String , VsUserMenuQueryWebImpl> {






}
