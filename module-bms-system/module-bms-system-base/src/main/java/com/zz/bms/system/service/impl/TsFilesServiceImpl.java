package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsFilesBO;
import com.zz.bms.system.dao.TsFilesDAO;
import com.zz.bms.system.service.TsFilesService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 文件 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsFilesServiceImpl extends BaseServiceImpl<TsFilesBO,String> implements TsFilesService {





	@Autowired
	private TsFilesDAO tsFilesDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsFilesDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsFilesDAO ;
	}


	@Override
	public TsFilesBO processResult(TsFilesBO tsFilesBO) {

            //todo 处理字典信息

		return tsFilesBO;

	}


}