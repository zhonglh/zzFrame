package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.dao.TsDictDAO;
import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.TsDictTypeBO;
import com.zz.bms.system.dao.TsDictTypeDAO;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 字典信息 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsDictServiceImpl extends BaseServiceImpl<TsDictBO,String> implements TsDictService {



    @Autowired
    private TsDictTypeDAO tsDictTypeDAO;
    @Autowired
    private TsTenantDAO tsTenantDAO;


	@Autowired
	private TsDictDAO tsDictDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsDictDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsDictDAO ;
	}




}