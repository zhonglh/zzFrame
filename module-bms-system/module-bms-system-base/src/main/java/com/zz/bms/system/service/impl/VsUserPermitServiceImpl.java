package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.VsUserPermitBO;
import com.zz.bms.system.dao.VsUserPermitDAO;
import com.zz.bms.system.service.VsUserPermitService;

import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 用户许可视图 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class VsUserPermitServiceImpl extends BaseServiceImpl<VsUserPermitBO,String> implements VsUserPermitService {



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


	@Override
	public void isExist(VsUserPermitBO vsUserPermitBO) {

	}
}