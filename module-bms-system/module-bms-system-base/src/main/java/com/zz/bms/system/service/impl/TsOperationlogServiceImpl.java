package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsOperationlogBO;
import com.zz.bms.system.dao.TsOperationlogDAO;
import com.zz.bms.system.service.TsOperationlogService;

import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.bo.TsOrganBO;
import com.zz.bms.system.dao.TsOrganDAO;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 操作日志 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsOperationlogServiceImpl extends BaseServiceImpl<TsOperationlogBO,String> implements TsOperationlogService {



    @Autowired
    private TsUserDAO tsUserDAO;
    @Autowired
    private TsOrganDAO tsOrganDAO;
    @Autowired
    private TsTenantDAO tsTenantDAO;
    @Autowired
    private TsDepDAO tsDepDAO;


	@Autowired
	private TsOperationlogDAO tsOperationlogDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsOperationlogDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsOperationlogDAO ;
	}


	@Override
	public TsOperationlogBO processResult(TsOperationlogBO tsOperationlogBO) {

            //todo 处理字典信息
            //todo 处理字典信息

		return tsOperationlogBO;

	}


}