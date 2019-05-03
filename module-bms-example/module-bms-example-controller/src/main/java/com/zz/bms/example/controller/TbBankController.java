package com.zz.bms.example.controller;

import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.example.bo.TbBankBO;
import  com.zz.bms.example.query.impl.TbBankQueryWebImpl;



import com.zz.bms.example.bo.TbBankGroupBO;


import com.zz.bms.system.controller.ZzGroupDefaultSimpleController;




import com.zz.bms.util.base.java.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 银行信息 控制层
* @author Administrator
* @date 2019-5-3 10:40:30
 */
@RequestMapping("/example/bank")
@Controller


public class TbBankController extends ZzGroupDefaultSimpleController<TbBankGroupBO, String , TbBankQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;








	@Override
	public void setCustomInfoByInsert(TbBankGroupBO bo , ILoginUserEntity sessionUser){
	}









}
