package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsMenuBO;
import com.zz.bms.system.dao.TsMenuDAO;
import com.zz.bms.system.service.TsMenuService;

import com.zz.bms.system.bo.TsMenuBO;
import com.zz.bms.system.dao.TsMenuDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 菜单 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsMenuServiceImpl extends BaseServiceImpl<TsMenuBO,String> implements TsMenuService {





	@Autowired
	private TsMenuDAO tsMenuDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsMenuDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsMenuDAO ;
	}




}