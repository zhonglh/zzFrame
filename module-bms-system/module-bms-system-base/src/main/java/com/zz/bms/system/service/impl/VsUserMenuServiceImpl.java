package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.VsUserMenuBO;
import com.zz.bms.system.dao.VsUserMenuDAO;
import com.zz.bms.system.dao.TsMenuDAO;
import com.zz.bms.system.service.VsUserMenuService;

import com.zz.bms.system.bo.VsUserMenuBO;
import com.zz.bms.system.dao.VsUserMenuDAO;
import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 菜单 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class VsUserMenuServiceImpl extends BaseServiceImpl<VsUserMenuBO,String> implements VsUserMenuService {



    @Autowired
    private VsUserDAO vsUserDAO;



    @Autowired
    private VsUserMenuDAO vsUserMenuDAO ;

    @Autowired
    private TsMenuDAO tsMenuDAO ;


    @Override
    public BaseDAO getQueryDAO() {
    	return vsUserMenuDAO ;
    }

    @Override
    public BaseDAO getRwDAO() {
		return tsMenuDAO ;
    }





}