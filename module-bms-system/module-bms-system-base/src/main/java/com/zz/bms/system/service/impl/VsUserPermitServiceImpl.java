package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.VsUserPermitBO;
import com.zz.bms.system.dao.VsUserPermitDAO;
import com.zz.bms.system.service.VsUserPermitService;

import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* VIEW ServiceImpl
* @author Administrator
* @date 2019-4-1 14:23:14
*/
@Service
public class VsUserPermitServiceImpl extends BaseServiceImpl<VsUserPermitBO,String> implements VsUserPermitService {



	@Autowired
	private TsDictService tsDictService;




	@Override
	public void isExist(VsUserPermitBO vsUserPermitBO) {
	}

    @Autowired
    private VsUserDAO vsUserDAO;


	@Autowired
	private VsUserPermitDAO vsUserPermitDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return vsUserPermitDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return vsUserPermitDAO ;
	}




}