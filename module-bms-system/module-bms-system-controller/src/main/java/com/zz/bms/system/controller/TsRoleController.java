package com.zz.bms.system.controller;


import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.ui.easyui.EasyUiTree;
import com.zz.bms.system.bo.TsRoleBO;
import  com.zz.bms.system.query.impl.TsRoleQueryWebImpl;

import com.zz.bms.system.service.TsMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 角色 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/role")
@Controller
public class TsRoleController extends ZzDefaultController<TsRoleBO, String , TsRoleQueryWebImpl> {

	@Autowired
	private TsMenuService menuService;





	@RequestMapping(value = "/permittree" , method={ RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public List<EasyUiTree> permittree(){
		//todo
		return null;
	}




}
