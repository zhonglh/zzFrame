package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsPermitBO;
import com.zz.bms.system.dao.TsPermitDAO;
import com.zz.bms.system.service.TsPermitService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 许可 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsPermitServiceImpl extends BaseServiceImpl<TsPermitBO,String> implements TsPermitService {





	@Autowired
	private TsPermitDAO tsPermitDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsPermitDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsPermitDAO ;
	}




}