package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsNotificationBO;
import com.zz.bms.system.dao.TsNotificationDAO;
import com.zz.bms.system.service.TsNotificationService;

import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* 系统通知 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsNotificationServiceImpl extends BaseServiceImpl<TsNotificationBO,String> implements TsNotificationService {



    @Autowired
    private TsUserDAO tsUserDAO;
    @Autowired
    private TsTenantDAO tsTenantDAO;


	@Autowired
	private TsNotificationDAO tsNotificationDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsNotificationDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsNotificationDAO ;
	}



	@Override
	public List<Map<String,Object>> getUserNotReadCount(String[] userIds){
		if(userIds == null || userIds.length == 0){
			return null;
		}
		return this.tsNotificationDAO.getUserNotReadCount(userIds);
	}

	@Override
	public void isExist(TsNotificationBO tsNotificationBO) {

	}

	@Override
	public TsNotificationBO processResult(TsNotificationBO tsNotificationBO) {

            //todo 处理字典信息

		return tsNotificationBO;

	}


}