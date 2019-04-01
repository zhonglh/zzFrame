package com.zz.bms.system.controller;


import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.ui.easyui.EasyUiTree;
import com.zz.bms.system.bo.TsPermitBO;
import  com.zz.bms.system.query.impl.TsPermitQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 许可 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/permit")
@Controller
public class TsPermitController extends ZzDefaultController<TsPermitBO, String , TsPermitQueryWebImpl> {







}
