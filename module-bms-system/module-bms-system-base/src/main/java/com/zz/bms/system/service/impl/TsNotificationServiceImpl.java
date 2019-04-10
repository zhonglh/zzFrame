package com.zz.bms.system.service.impl;

import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.enums.*;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.TsNotificationBO;
import com.zz.bms.system.dao.TsNotificationDAO;
import com.zz.bms.system.service.TsNotificationService;



import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 系统通知 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:25:11
 */
@Service
public class TsNotificationServiceImpl extends BaseServiceImpl<TsNotificationBO,String> implements TsNotificationService {



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