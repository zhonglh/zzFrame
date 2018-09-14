package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.TsOrganBO;
import  com.zz.bms.system.query.impl.TsOrganQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 机构 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/organ")
@Controller
public class TsOrganController extends ZzDefaultController<TsOrganBO, String , TsOrganQueryWebImpl> {



	@Override
	protected boolean isExist(TsOrganBO tsOrganBO) {

		TsOrganBO ckBO ;
		boolean isExist = false;
		TsOrganBO temp = null ;

		ckBO = new TsOrganBO();
		ckBO.setId( tsOrganBO.getId() );
        ckBO.setOrganCode(tsOrganBO.getOrganCode());
        ckBO.setTenantId(tsOrganBO.getTenantId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}
		ckBO = new TsOrganBO();
		ckBO.setId( tsOrganBO.getId() );
        ckBO.setOrganName(tsOrganBO.getOrganName());
        ckBO.setTenantId(tsOrganBO.getTenantId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
