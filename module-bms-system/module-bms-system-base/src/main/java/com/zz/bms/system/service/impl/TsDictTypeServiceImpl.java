package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsDictTypeBO;
import com.zz.bms.system.dao.TsDictTypeDAO;
import com.zz.bms.system.service.TsDictTypeService;

import com.zz.bms.system.bo.TsDictTypeBO;
import com.zz.bms.system.dao.TsDictTypeDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 字典类型 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsDictTypeServiceImpl extends BaseServiceImpl<TsDictTypeBO,String> implements TsDictTypeService {





	@Autowired
	private TsDictTypeDAO tsDictTypeDAO ;


	@Override
	public BaseDAO getDAO() {
		return tsDictTypeDAO ;
	}


	@Override
	public void isExist(TsDictTypeBO tsDictTypeBO) {

	}
}