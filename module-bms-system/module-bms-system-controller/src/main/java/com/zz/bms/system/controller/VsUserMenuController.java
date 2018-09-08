package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.VsUserMenuBO;
import  com.zz.bms.system.query.impl.VsUserMenuQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 菜单 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/usermenu")
@Controller
public class VsUserMenuController extends DefaultController<VsUserMenuBO, String , VsUserMenuQueryWebImpl> {






}
