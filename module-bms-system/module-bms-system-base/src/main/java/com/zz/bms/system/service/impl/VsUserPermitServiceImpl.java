package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.system.bo.VsUserPermitBO;
import com.zz.bms.system.dao.VsUserDAO;
import com.zz.bms.system.dao.VsUserPermitDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.VsUserPermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户许可 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:56:24
 */
@Service
public class VsUserPermitServiceImpl extends SystemBaseServiceImpl<VsUserPermitBO,String> implements VsUserPermitService {



	@Autowired
	private TsDictService tsDictService;



	@Autowired
	private VsUserDAO vsUserDAO;


	@Autowired
	private VsUserPermitDAO vsUserPermitDAO ;



	@Override
	public BaseDAO getDAO() {
		return vsUserPermitDAO ;
	}







	@Override
	public void isExist(VsUserPermitBO vsUserPermitBO) {
	}


}