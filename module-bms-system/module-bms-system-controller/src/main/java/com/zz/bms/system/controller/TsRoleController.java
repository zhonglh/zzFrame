package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.TsRoleBO;
import  com.zz.bms.system.query.impl.TsRoleQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 角色 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/role")
@Controller
public class TsRoleController extends ZzDefaultController<TsRoleBO, String , TsRoleQueryWebImpl> {



	@Override
	protected boolean isExist(TsRoleBO tsRoleBO) {

		TsRoleBO ckBO ;
		boolean isExist = false;
		TsRoleBO temp = null ;

		ckBO = new TsRoleBO();
		ckBO.setId( tsRoleBO.getId() );
        ckBO.setRoleCode(tsRoleBO.getRoleCode());
        ckBO.setTenantId(tsRoleBO.getTenantId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}
		ckBO = new TsRoleBO();
		ckBO.setId( tsRoleBO.getId() );
        ckBO.setRoleName(tsRoleBO.getRoleName());
        ckBO.setTenantId(tsRoleBO.getTenantId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
