package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.VsMenuPermitBO;
import com.zz.bms.system.dao.VsMenuPermitDAO;
import com.zz.bms.system.dao.TsMenuPermitDAO;
import com.zz.bms.system.service.VsMenuPermitService;



import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 菜单许可关联 ServiceImpl
* @author Administrator
* @date 2019-4-1 14:23:13
*/
@Service
public class VsMenuPermitServiceImpl extends BaseServiceImpl<VsMenuPermitBO,String> implements VsMenuPermitService {



	@Autowired
	private TsDictService tsDictService;




	@Override
	public void isExist(VsMenuPermitBO vsMenuPermitBO) {
	}




    @Autowired
    private VsMenuPermitDAO vsMenuPermitDAO ;



    @Override
    public BaseDAO getDAO() {
    	return vsMenuPermitDAO ;
    }






}