package com.zz.bms.example.service.impl;

import com.zz.bms.core.db.base.service.impl.BaseGroupServiceImpl;
import com.zz.bms.core.db.base.service.BaseService;


import com.zz.bms.example.bo.TbFundGroupBO;
import com.zz.bms.example.service.TbFundGroupService;
import com.zz.bms.example.service.TbFundService;

import com.zz.bms.example.service.TbFundRecordService;
import com.zz.bms.example.service.TbFundAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 基金 ServiceImpl
* @author Administrator
* @date 2019-5-2 19:20:45
*/
@Service
public class TbFundGroupServiceImpl extends BaseGroupServiceImpl<TbFundGroupBO,String> implements TbFundGroupService {


	@Autowired
	TbFundService fundService;

	@Autowired
	private TbFundRecordService fundRecordService;

	@Autowired
	private TbFundAccountService fundAccountService;


	private BaseService[] bss = null;


	/**
	* 此数组需要和 TbFundGroupBO 对象对应
	* @return
	*/
	@Override
	public BaseService[] getServices() {
		if(bss == null) {
			bss = new BaseService[]{fundService,fundRecordService,fundAccountService};
		}
		return bss;
	}



}