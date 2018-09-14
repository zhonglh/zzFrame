package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.VsNodeUserBO;
import  com.zz.bms.system.query.impl.VsNodeUserQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 有效用户 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/nodeuser")
@Controller
public class VsNodeUserController extends ZzDefaultController<VsNodeUserBO, String , VsNodeUserQueryWebImpl> {







}
