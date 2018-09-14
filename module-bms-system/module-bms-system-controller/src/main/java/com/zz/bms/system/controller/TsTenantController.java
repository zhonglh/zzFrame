package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.TsTenantBO;
import  com.zz.bms.system.query.impl.TsTenantQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 租户 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/tenant")
@Controller
public class TsTenantController extends ZzDefaultController<TsTenantBO, String , TsTenantQueryWebImpl> {



	@Override
	protected boolean isExist(TsTenantBO tsTenantBO) {

		TsTenantBO ckBO ;
		boolean isExist = false;
		TsTenantBO temp = null ;

		ckBO = new TsTenantBO();
		ckBO.setId( tsTenantBO.getId() );
        ckBO.setTenantName(tsTenantBO.getTenantName());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}
		ckBO = new TsTenantBO();
		ckBO.setId( tsTenantBO.getId() );
        ckBO.setTenantCode(tsTenantBO.getTenantCode());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
