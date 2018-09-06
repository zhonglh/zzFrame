package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


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
	public BaseDAO getQueryDAO() {
		return tsOrganDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsOrganDAO ;
	}


	@Override
	public TsOrganBO processResult(TsOrganBO tsOrganBO) {

            //todo 处理字典信息
            //todo 处理字典信息

		return tsOrganBO;

	}


}