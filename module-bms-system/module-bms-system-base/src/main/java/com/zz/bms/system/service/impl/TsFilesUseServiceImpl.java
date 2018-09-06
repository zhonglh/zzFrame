package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsFilesUseBO;
import com.zz.bms.system.dao.TsFilesUseDAO;
import com.zz.bms.system.service.TsFilesUseService;

import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 文件使用 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsFilesUseServiceImpl extends BaseServiceImpl<TsFilesUseBO,String> implements TsFilesUseService {



    @Autowired
    private TsTenantDAO tsTenantDAO;


	@Autowired
	private TsFilesUseDAO tsFilesUseDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsFilesUseDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsFilesUseDAO ;
	}




}