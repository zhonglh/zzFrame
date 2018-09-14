package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.TsRolePermitBO;
import  com.zz.bms.system.query.impl.TsRolePermitQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 角色许可关联 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/rolepermit")
@Controller
public class TsRolePermitController extends ZzDefaultController<TsRolePermitBO, String , TsRolePermitQueryWebImpl> {



	@Override
	protected boolean isExist(TsRolePermitBO tsRolePermitBO) {

		TsRolePermitBO ckBO ;
		boolean isExist = false;
		TsRolePermitBO temp = null ;

		ckBO = new TsRolePermitBO();
		ckBO.setId( tsRolePermitBO.getId() );
        ckBO.setPermitId(tsRolePermitBO.getPermitId());
        ckBO.setRoleId(tsRolePermitBO.getRoleId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
