package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


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
	public BaseDAO getQueryDAO() {
		return tsTenantDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsTenantDAO ;
	}




}