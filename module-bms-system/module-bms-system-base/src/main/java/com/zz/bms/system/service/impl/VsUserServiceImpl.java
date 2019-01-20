package com.zz.bms.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.enums.EnumDictType;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.TsDictDAO;
import com.zz.bms.system.dao.VsUserDAO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.VsUserService;

import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 用户 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class VsUserServiceImpl extends BaseServiceImpl<VsUserBO,String> implements VsUserService {




    @Autowired
    private TsDictService tsDictService;


    @Autowired
    private VsUserDAO vsUserDAO ;

    @Autowired
    private TsUserDAO tsUserDAO ;


    @Override
    public BaseDAO getQueryDAO() {
    	return vsUserDAO ;
    }

    @Override
    public BaseDAO getRwDAO() {
		return tsUserDAO ;
    }



	@Override
	public VsUserBO processResult(VsUserBO vsUserBO) {

        try {
            String dictName = tsDictService.getDictName(vsUserBO.getSystemAdmin(), EnumDictType.YES_NO.getVal());
            vsUserBO.setSystemAdminName(dictName);
        }catch(Exception e){
            e.printStackTrace();
        }

        try {
            String dictName = tsDictService.getDictName(vsUserBO.getUserStatus(), EnumDictType.USER_STATUS.getVal());
            vsUserBO.setUserStatusName(dictName);
        }catch(Exception e){

            e.printStackTrace();
        }


		return vsUserBO;

	}


}