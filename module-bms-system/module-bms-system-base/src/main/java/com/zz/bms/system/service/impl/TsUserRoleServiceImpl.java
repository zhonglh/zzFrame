package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.system.bo.TsUserRoleBO;
import com.zz.bms.system.dao.TsUserRoleDAO;
import com.zz.bms.system.service.TsUserRoleService;

import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.bo.TsRoleBO;
import com.zz.bms.system.dao.TsRoleDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 用户角色关联 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsUserRoleServiceImpl extends BaseServiceImpl<TsUserRoleBO,String> implements TsUserRoleService {



    @Autowired
    private TsUserDAO tsUserDAO;
    @Autowired
    private TsRoleDAO tsRoleDAO;


	@Autowired
	private TsUserRoleDAO tsUserRoleDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsUserRoleDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsUserRoleDAO ;
	}


	@Override
	public void isExist(TsUserRoleBO tsUserRoleBO) {

		TsUserRoleBO ckBO ;
		TsUserRoleBO temp = null ;

		ckBO = new TsUserRoleBO();
		ckBO.setId( tsUserRoleBO.getId() );
		ckBO.setRoleId(tsUserRoleBO.getRoleId());
		ckBO.setUserId(tsUserRoleBO.getUserId());
		temp = this.selectCheck(ckBO);

		if (EntityUtil.isEntityExist(temp)) {
			throw DbException.DB_SAVE_SAME;
		}
	}
}