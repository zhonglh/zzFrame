package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;
import com.zz.bms.system.bo.TsFileUseBO;
import com.zz.bms.system.dao.TsFileUseDAO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.service.TsFileUseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 文件使用 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsFileUseServiceImpl extends BaseServiceImpl<TsFileUseBO,String> implements TsFileUseService {



    @Autowired
    private TsTenantDAO tsTenantDAO;


	@Autowired
	private TsFileUseDAO tsFileUseDAO ;


	@Override
	public BaseDAO getDAO() {
		return tsFileUseDAO ;
	}


	@Override
	public void isExist(TsFileUseBO tsFileUseBO) {

	}
}