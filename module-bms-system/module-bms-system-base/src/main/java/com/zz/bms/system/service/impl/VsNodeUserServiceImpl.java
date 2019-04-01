package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.VsNodeUserBO;
import com.zz.bms.system.dao.VsNodeUserDAO;
import com.zz.bms.system.service.VsNodeUserService;

import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 有效用户 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class VsNodeUserServiceImpl extends BaseServiceImpl<VsNodeUserBO,String> implements VsNodeUserService {



    @Autowired
    private VsUserDAO vsUserDAO;


	@Autowired
	private VsNodeUserDAO vsNodeUserDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return vsNodeUserDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return vsNodeUserDAO ;
	}


	@Override
	public void isExist(VsNodeUserBO vsNodeUserBO) {

	}

	@Override
	public VsNodeUserBO processResult(VsNodeUserBO vsNodeUserBO) {

            //todo 处理字典信息
            //todo 处理字典信息

		return vsNodeUserBO;

	}


}