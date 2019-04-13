package com.zz.bms.system.controller;


import com.zz.bms.system.service.TsDictService;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.system.bo.TsUserRoleBO;
import  com.zz.bms.system.query.impl.TsUserRoleQueryWebImpl;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 用户角色关联 控制层
* @author Administrator
* @date 2019-4-11 15:21:25
 */
@RequestMapping("/system/userrole")
@Controller


public class TsUserRoleController extends ZzDefaultSimpleController<TsUserRoleBO, String , TsUserRoleQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;

	public TsUserRoleController(){
		super();
		this.setResourceIdentity("system.role");
		this.setResourceIdentity("system.user");
	}

	@Override
	public void setCustomInfoByInsert(TsUserRoleBO bo , ILoginUserEntity sessionUser){

	}





}
