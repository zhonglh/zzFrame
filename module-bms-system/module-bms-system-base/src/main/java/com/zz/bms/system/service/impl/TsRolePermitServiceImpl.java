package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.system.bo.TsRolePermitBO;
import com.zz.bms.system.dao.TsRolePermitDAO;
import com.zz.bms.system.service.TsRolePermitService;

import com.zz.bms.system.bo.TsPermitBO;
import com.zz.bms.system.dao.TsPermitDAO;
import com.zz.bms.system.bo.TsRoleBO;
import com.zz.bms.system.dao.TsRoleDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 角色许可关联 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsRolePermitServiceImpl extends BaseServiceImpl<TsRolePermitBO,String> implements TsRolePermitService {



    @Autowired
    private TsPermitDAO tsPermitDAO;
    @Autowired
    private TsRoleDAO tsRoleDAO;


	@Autowired
	private TsRolePermitDAO tsRolePermitDAO ;


	@Override
	public BaseDAO getDAO() {
		return tsRolePermitDAO ;
	}


	@Override
	public void isExist(TsRolePermitBO tsRolePermitBO) {
		TsRolePermitBO ckBO ;
		boolean isExist = false;
		TsRolePermitBO temp = null ;

		ckBO = new TsRolePermitBO();
		ckBO.setId( tsRolePermitBO.getId() );
		ckBO.setPermitId(tsRolePermitBO.getPermitId());
		ckBO.setRoleId(tsRolePermitBO.getRoleId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw DbException.DB_SAVE_SAME;
		}
	}
}