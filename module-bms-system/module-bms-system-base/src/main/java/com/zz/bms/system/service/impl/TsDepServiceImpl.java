package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.system.service.TsDepService;

import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.bo.TsOrganBO;
import com.zz.bms.system.dao.TsOrganDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 部门 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsDepServiceImpl extends BaseServiceImpl<TsDepBO,String> implements TsDepService {



    @Autowired
    private TsUserDAO tsUserDAO;
    @Autowired
    private TsTenantDAO tsTenantDAO;
    @Autowired
    private TsOrganDAO tsOrganDAO;


	@Autowired
	private TsDepDAO tsDepDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsDepDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsDepDAO ;
	}


	@Override
	public TsDepBO processResult(TsDepBO tsDepBO) {

            //todo 处理字典信息

		return tsDepBO;

	}


}