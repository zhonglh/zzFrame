package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.VsFilesUseBO;
import com.zz.bms.system.dao.VsFilesUseDAO;
import com.zz.bms.system.service.VsFilesUseService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 文件使用 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class VsFilesUseServiceImpl extends BaseServiceImpl<VsFilesUseBO,String> implements VsFilesUseService {





	@Autowired
	private VsFilesUseDAO vsFilesUseDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return vsFilesUseDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return vsFilesUseDAO ;
	}


	@Override
	public VsFilesUseBO processResult(VsFilesUseBO vsFilesUseBO) {

            //todo 处理字典信息
            //todo 处理字典信息

		return vsFilesUseBO;

	}


}