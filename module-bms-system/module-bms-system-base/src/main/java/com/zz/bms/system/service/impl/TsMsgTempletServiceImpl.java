package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsMsgTempletBO;
import com.zz.bms.system.dao.TsMsgTempletDAO;
import com.zz.bms.system.service.TsMsgTempletService;

import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.bo.TsOrganBO;
import com.zz.bms.system.dao.TsOrganDAO;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 消息模板 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsMsgTempletServiceImpl extends BaseServiceImpl<TsMsgTempletBO,String> implements TsMsgTempletService {



    @Autowired
    private TsTenantDAO tsTenantDAO;
    @Autowired
    private TsOrganDAO tsOrganDAO;
    @Autowired
    private TsDepDAO tsDepDAO;


	@Autowired
	private TsMsgTempletDAO tsMsgTempletDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsMsgTempletDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsMsgTempletDAO ;
	}


	@Override
	public TsMsgTempletBO processResult(TsMsgTempletBO tsMsgTempletBO) {

            //todo 处理字典信息
            //todo 处理字典信息
            //todo 处理字典信息

		return tsMsgTempletBO;

	}


}