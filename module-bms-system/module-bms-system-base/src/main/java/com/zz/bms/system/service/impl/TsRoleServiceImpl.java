package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.system.bo.TsRoleBO;
import com.zz.bms.system.dao.TsRoleDAO;
import com.zz.bms.system.service.TsRoleService;

import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.bo.TsOrganBO;
import com.zz.bms.system.dao.TsOrganDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 角色 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsRoleServiceImpl extends BaseServiceImpl<TsRoleBO,String> implements TsRoleService {



    @Autowired
    private TsDepDAO tsDepDAO;
    @Autowired
    private TsTenantDAO tsTenantDAO;
    @Autowired
    private TsOrganDAO tsOrganDAO;


	@Autowired
	private TsRoleDAO tsRoleDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsRoleDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsRoleDAO ;
	}


	@Override
	public void isExist(TsRoleBO tsRoleBO) {


		TsRoleBO ckBO ;
		boolean isExist = false;
		TsRoleBO temp = null ;

		ckBO = new TsRoleBO();
		ckBO.setId( tsRoleBO.getId() );
		ckBO.setRoleCode(tsRoleBO.getRoleCode());
		ckBO.setTenantId(tsRoleBO.getTenantId());
		temp = this.selectCheck(ckBO);

		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"角色编号已使用");
		}

		ckBO = new TsRoleBO();
		ckBO.setId( tsRoleBO.getId() );
		ckBO.setRoleName(tsRoleBO.getRoleName());
		ckBO.setTenantId(tsRoleBO.getTenantId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"角色名称已使用");
		}
	}

	@Override
	public TsRoleBO processResult(TsRoleBO tsRoleBO) {

            //todo 处理字典信息
            //todo 处理字典信息

		return tsRoleBO;

	}


}