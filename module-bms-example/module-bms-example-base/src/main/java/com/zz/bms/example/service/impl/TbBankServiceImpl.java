package com.zz.bms.example.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.example.bo.TbBankBO;
import com.zz.bms.example.dao.TbBankDAO;
import com.zz.bms.example.service.TbBankService;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.impl.SystemBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 银行信息 ServiceImpl
* @author Administrator
* @date 2019-5-8 13:45:41
*/
@Service
public class TbBankServiceImpl extends SystemBaseServiceImpl<TbBankBO,String> implements TbBankService {



	@Autowired
	private TsDictService tsDictService;





    @Autowired
    private TbBankDAO tbBankDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tbBankDAO ;
    }





	@Override
	public void isExist(TbBankBO tbBankBO) {
	}





}