package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.VsNodeUserBO;
import com.zz.bms.system.dao.VsNodeUserDAO;
import com.zz.bms.system.service.VsNodeUserService;

import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* VIEW ServiceImpl
* @author Administrator
* @date 2019-4-1 14:23:13
*/
@Service
public class VsNodeUserServiceImpl extends BaseServiceImpl<VsNodeUserBO,String> implements VsNodeUserService {



	@Autowired
	private TsDictService tsDictService;




	@Override
	public void isExist(VsNodeUserBO vsNodeUserBO) {
	}

    @Autowired
    private VsUserDAO vsUserDAO;


	@Autowired
	private VsNodeUserDAO vsNodeUserDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return vsNodeUserDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return vsNodeUserDAO ;
	}


	@Override
	public VsNodeUserBO processResult(VsNodeUserBO vsNodeUserBO) {

            try {
				if(StringUtils.isEmpty(vsNodeUserBO.getUserStatusName()) && StringUtils.isNotEmpty(vsNodeUserBO.getUserStatus()) ) {
					String dictName = tsDictService.getDictName(vsNodeUserBO.getUserStatus(), "user_status");
					vsNodeUserBO.setUserStatusName(dictName);
            	}
            }catch(Exception e){

            }
            try {
				if(StringUtils.isEmpty(vsNodeUserBO.getSystemAdminName()) && StringUtils.isNotEmpty(vsNodeUserBO.getSystemAdmin()) ) {
					String dictName = tsDictService.getDictName(vsNodeUserBO.getSystemAdmin(), "yes_no");
					vsNodeUserBO.setSystemAdminName(dictName);
            	}
            }catch(Exception e){

            }

		return vsNodeUserBO;

	}


}