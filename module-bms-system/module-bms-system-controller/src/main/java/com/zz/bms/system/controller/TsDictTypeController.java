package com.zz.bms.system.controller;


import com.zz.bms.system.bo.TsDictTypeBO;
import  com.zz.bms.system.query.impl.TsDictTypeQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 字典类型 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/dicttype")
@Controller
public class TsDictTypeController extends ZzDefaultController<TsDictTypeBO, String , TsDictTypeQueryWebImpl> {







}
