package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.system.bo.TsOrganBO;
import com.zz.bms.system.dao.TsOrganDAO;
import com.zz.bms.system.service.TsOrganService;

import com.zz.bms.system.bo.TsOrganBO;
import com.zz.bms.system.dao.TsOrganDAO;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 机构 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsOrganServiceImpl extends BaseServiceImpl<TsOrganBO,String> implements TsOrganService {



    @Autowired
    private TsTenantDAO tsTenantDAO;
    @Autowired
    private TsUserDAO tsUserDAO;


	@Autowired
	private TsOrganDAO tsOrganDAO ;


	@Override
	public BaseDAO getDAO() {
		return tsOrganDAO ;
	}


	@Override
	public void isExist(TsOrganBO tsOrganBO) {


		TsOrganBO ckBO ;
		BaseEntity temp = null ;

		ckBO = new TsOrganBO();
		ckBO.setId( tsOrganBO.getId() );
		ckBO.setOrganCode(tsOrganBO.getOrganCode());
		ckBO.setTenantId(tsOrganBO.getTenantId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该机构编号已使用");
		}
		ckBO = new TsOrganBO();
		ckBO.setId( tsOrganBO.getId() );
		ckBO.setOrganName(tsOrganBO.getOrganName());
		ckBO.setTenantId(tsOrganBO.getTenantId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该机构名称已使用");
		}
	}

	@Override
	public TsOrganBO processResult(TsOrganBO tsOrganBO) {

            //todo 处理字典信息
            //todo 处理字典信息

		return tsOrganBO;

	}


}