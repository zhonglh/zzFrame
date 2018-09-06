package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsRolePermitBO;
import com.zz.bms.system.dao.TsRolePermitDAO;
import com.zz.bms.system.service.TsRolePermitService;

import com.zz.bms.system.bo.TsPermitBO;
import com.zz.bms.system.dao.TsPermitDAO;
import com.zz.bms.system.bo.TsRoleBO;
import com.zz.bms.system.dao.TsRoleDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 角色许可关联 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsRolePermitServiceImpl extends BaseServiceImpl<TsRolePermitBO,String> implements TsRolePermitService {



    @Autowired
    private TsPermitDAO tsPermitDAO;
    @Autowired
    private TsRoleDAO tsRoleDAO;


	@Autowired
	private TsRolePermitDAO tsRolePermitDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsRolePermitDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsRolePermitDAO ;
	}




}