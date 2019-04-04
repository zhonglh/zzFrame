package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.VsUserMenuBO;
import com.zz.bms.system.dao.VsUserMenuDAO;
import com.zz.bms.system.service.VsUserMenuService;

import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;
import com.zz.bms.system.bo.VsUserMenuBO;
import com.zz.bms.system.dao.VsUserMenuDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* VIEW ServiceImpl
* @author Administrator
* @date 2019-4-1 14:23:14
*/
@Service
public class VsUserMenuServiceImpl extends BaseServiceImpl<VsUserMenuBO,String> implements VsUserMenuService {



	@Autowired
	private TsDictService tsDictService;




	@Override
	public void isExist(VsUserMenuBO vsUserMenuBO) {
	}

    @Autowired
    private VsUserDAO vsUserDAO;


	@Autowired
	private VsUserMenuDAO vsUserMenuDAO ;

	@Override
	public BaseDAO getDAO() {
		return vsUserMenuDAO ;
	}



	@Override
	public VsUserMenuBO processResult(VsUserMenuBO vsUserMenuBO) {

            try {
				if(StringUtils.isEmpty(vsUserMenuBO.getLeafName()) && StringUtils.isNotEmpty(vsUserMenuBO.getLeaf()) ) {
					String dictName = tsDictService.getDictName(vsUserMenuBO.getLeaf(), "leaf");
					vsUserMenuBO.setLeafName(dictName);
            	}
            }catch(Exception e){

            }
            try {
				if(StringUtils.isEmpty(vsUserMenuBO.getShortcutName()) && StringUtils.isNotEmpty(vsUserMenuBO.getShortcut()) ) {
					String dictName = tsDictService.getDictName(vsUserMenuBO.getShortcut(), "shortcut");
					vsUserMenuBO.setShortcutName(dictName);
            	}
            }catch(Exception e){

            }

		return vsUserMenuBO;

	}


}