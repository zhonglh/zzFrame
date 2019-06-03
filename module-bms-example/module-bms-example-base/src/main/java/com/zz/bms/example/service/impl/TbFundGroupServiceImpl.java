package com.zz.bms.example.service.impl;

import com.zz.bms.core.db.base.service.impl.BaseGroupServiceImpl;
import com.zz.bms.core.db.base.service.BaseService;


import com.zz.bms.example.bo.TbFundGroupBO;
import com.zz.bms.example.service.TbFundGroupService;
import com.zz.bms.example.service.TbFundService;

import com.zz.bms.example.service.TbFundAccountService;
import com.zz.bms.example.service.TbFundRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 基金 ServiceImpl
* @author Administrator
* @date 2019-6-3 10:12:55
*/
@Service
public class TbFundGroupServiceImpl extends BaseGroupServiceImpl<TbFundGroupBO,String> implements TbFundGroupService {


	@Autowired
	TbFundService fundService;

	@Autowired
	private TbFundAccountService fundAccountService;

	@Autowired
	private TbFundRecordService fundRecordService;


	private BaseService[] bss = null;


	/**
	* 此数组需要和 TbFundGroupBO 对象对应
	* @return
	*/
	@Override
	public BaseService[] getServices() {
		if(bss == null) {
			bss = new BaseService[]{fundService,fundAccountService,fundRecordService};
		}
		return bss;
	}



}