package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.service.VsUserService;

import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 用户 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class VsUserServiceImpl extends BaseServiceImpl<VsUserBO,String> implements VsUserService {






    @Autowired
    private VsUserDAO vsUserDAO ;

    @Autowired
    private TsUserDAO tsUserDAO ;


    @Override
    public BaseDAO getQueryDAO() {
    	return vsUserDAO ;
    }

    @Override
    public BaseDAO getRwDAO() {
		return tsUserDAO ;
    }



	@Override
	public VsUserBO processResult(VsUserBO vsUserBO) {

            //todo 处理字典信息
            //todo 处理字典信息

		return vsUserBO;

	}


}