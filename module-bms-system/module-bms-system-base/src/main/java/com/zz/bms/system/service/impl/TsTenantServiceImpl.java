package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.service.TsTenantService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 租户 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsTenantServiceImpl extends BaseServiceImpl<TsTenantBO,String> implements TsTenantService {





	@Autowired
	private TsTenantDAO tsTenantDAO ;


	@Override
	public BaseDAO getDAO() {
		return tsTenantDAO ;
	}


	@Override
	public void isExist(TsTenantBO tsTenantBO) {

		TsTenantBO ckBO ;
		TsTenantBO temp = null ;

		ckBO = new TsTenantBO();
		ckBO.setId( tsTenantBO.getId() );
		ckBO.setTenantName(tsTenantBO.getTenantName());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"租户名称已使用");
		}
		ckBO = new TsTenantBO();
		ckBO.setId( tsTenantBO.getId() );
		ckBO.setTenantCode(tsTenantBO.getTenantCode());
		temp = this.selectCheck(ckBO);


		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"租户编号已使用");
		}
	}
}