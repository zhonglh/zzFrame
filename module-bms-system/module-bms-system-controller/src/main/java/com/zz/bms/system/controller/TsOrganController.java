package com.zz.bms.system.controller;


import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
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
	protected void isExist(TsOrganBO tsOrganBO) {

		TsOrganBO ckBO ;
		BaseEntity temp = null ;

		ckBO = new TsOrganBO();
		ckBO.setId( tsOrganBO.getId() );
        ckBO.setOrganCode(tsOrganBO.getOrganCode());
        ckBO.setTenantId(tsOrganBO.getTenantId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该机构编号已使用");
		}
		ckBO = new TsOrganBO();
		ckBO.setId( tsOrganBO.getId() );
        ckBO.setOrganName(tsOrganBO.getOrganName());
        ckBO.setTenantId(tsOrganBO.getTenantId());
        temp = this.baseService.selectCheck(ckBO);
		if (isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该机构名称已使用");
		}

	}




}
