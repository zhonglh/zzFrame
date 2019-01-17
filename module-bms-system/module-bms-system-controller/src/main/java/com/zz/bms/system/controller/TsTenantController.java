package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.exceptions.DbException;
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
	protected void isExist(TsTenantBO tsTenantBO) {

		TsTenantBO ckBO ;
		TsTenantBO temp = null ;

		ckBO = new TsTenantBO();
		ckBO.setId( tsTenantBO.getId() );
        ckBO.setTenantName(tsTenantBO.getTenantName());
        temp = this.baseService.selectCheck(ckBO);
		if (isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"租户名称已使用");
		}
		ckBO = new TsTenantBO();
		ckBO.setId( tsTenantBO.getId() );
        ckBO.setTenantCode(tsTenantBO.getTenantCode());
        temp = this.baseService.selectCheck(ckBO);


		if (isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"租户编号已使用");
		}
	}




}
