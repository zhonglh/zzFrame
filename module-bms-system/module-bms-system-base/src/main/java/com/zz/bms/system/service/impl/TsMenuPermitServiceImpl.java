package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsMenuPermitBO;
import com.zz.bms.system.dao.TsMenuPermitDAO;
import com.zz.bms.system.service.TsMenuPermitService;

import com.zz.bms.system.bo.TsMenuBO;
import com.zz.bms.system.dao.TsMenuDAO;
import com.zz.bms.system.bo.TsPermitBO;
import com.zz.bms.system.dao.TsPermitDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 菜单许可关联 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsMenuPermitServiceImpl extends BaseServiceImpl<TsMenuPermitBO,String> implements TsMenuPermitService {



    @Autowired
    private TsMenuDAO tsMenuDAO;
    @Autowired
    private TsPermitDAO tsPermitDAO;


	@Autowired
	private TsMenuPermitDAO tsMenuPermitDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsMenuPermitDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsMenuPermitDAO ;
	}




}