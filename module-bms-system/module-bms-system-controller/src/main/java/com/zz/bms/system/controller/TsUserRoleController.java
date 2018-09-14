package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.TsUserRoleBO;
import  com.zz.bms.system.query.impl.TsUserRoleQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户角色关联 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/userrole")
@Controller
public class TsUserRoleController extends ZzDefaultController<TsUserRoleBO, String , TsUserRoleQueryWebImpl> {



	@Override
	protected boolean isExist(TsUserRoleBO tsUserRoleBO) {

		TsUserRoleBO ckBO ;
		boolean isExist = false;
		TsUserRoleBO temp = null ;

		ckBO = new TsUserRoleBO();
		ckBO.setId( tsUserRoleBO.getId() );
        ckBO.setRoleId(tsUserRoleBO.getRoleId());
        ckBO.setUserId(tsUserRoleBO.getUserId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
