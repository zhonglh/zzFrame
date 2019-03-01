package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.system.bo.TsNotificationBO;
import com.zz.bms.system.dao.TsNotificationDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.TsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 系统通知 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:25:11
 */
@Service
public class TsNotificationServiceImpl extends SystemBaseServiceImpl<TsNotificationBO,String> implements TsNotificationService {



	@Autowired
	private TsDictService tsDictService;





	@Autowired
	private TsNotificationDAO tsNotificationDAO ;



	@Override
	public BaseDAO getDAO() {
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


}