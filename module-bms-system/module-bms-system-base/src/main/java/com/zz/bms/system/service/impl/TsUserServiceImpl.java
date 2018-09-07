package com.zz.bms.system.service.impl;

import com.zz.bms.core.IUserService;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.query.TsUserQuery;
import com.zz.bms.system.query.impl.TsUserQueryImpl;
import com.zz.bms.system.service.TsUserService;

import com.zz.bms.system.bo.TsOrganBO;
import com.zz.bms.system.dao.TsOrganDAO;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 用户 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsUserServiceImpl extends BaseServiceImpl<TsUserBO,String> implements TsUserService,IUserService {



    @Autowired
    private TsOrganDAO tsOrganDAO;
    @Autowired
    private TsDepDAO tsDepDAO;
    @Autowired
    private TsTenantDAO tsTenantDAO;


	@Autowired
	private TsUserDAO tsUserDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsUserDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsUserDAO ;
	}


	@Override
	public TsUserBO processResult(TsUserBO tsUserBO) {

            //todo 处理字典信息
            //todo 处理字典信息

		return tsUserBO;

	}


	@Override
	public ILoginUserEntity getUserEntityByLoginName(String loginName) {

		TsUserQuery userQuery = new TsUserQueryImpl();
		userQuery.loginName(loginName);
		return this.selectOne(userQuery.buildWrapper());

	}
}