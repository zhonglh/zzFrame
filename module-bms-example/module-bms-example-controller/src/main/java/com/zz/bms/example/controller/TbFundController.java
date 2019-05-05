package com.zz.bms.example.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.enums.*;

import com.zz.bms.example.bo.TbFundAccountBO;
import com.zz.bms.example.query.impl.TbFundAccountQueryWebImpl;
import com.zz.bms.example.service.TbFundAccountService;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.example.bo.TbFundBO;
import  com.zz.bms.example.query.impl.TbFundQueryWebImpl;



import com.zz.bms.example.bo.TbFundGroupBO;


import com.zz.bms.system.controller.ZzGroupDefaultSimpleController;




import com.zz.bms.util.base.java.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 基金 控制层
* @author Administrator
* @date 2019-5-2 18:36:08
 */
@RequestMapping("/example/fund")
@Controller


public class TbFundController extends ZzGroupDefaultSimpleController<TbFundGroupBO, String , TbFundQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;


	@Autowired
	private TbFundAccountService tbFundAccountService;


	@RequestMapping(value = "/fundAccount/list" , method={ RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public List<TbFundAccountBO> fundAccountList(TbFundAccountBO m , TbFundAccountQueryWebImpl query,ModelMap modelMap){
		QueryWrapper wrapper =   query.buildWrapper();

		return tbFundAccountService.list(wrapper);
	}





	@Override
	public void setCustomInfoByInsert(TbFundGroupBO bo , ILoginUserEntity sessionUser){
	}

	@Override
	protected void setCommonData(TbFundGroupBO tbFundBO ,ModelMap model) {
    	Map<String , List<TsDictBO>> dictMap = tsDictService.allDicts(EnumDictType.FUND_TYPE.getVal(),EnumDictType.FUND_DIRECTION.getVal(),EnumDictType.MANAG_TYPE.getVal(),EnumDictType.FUND_ACCOUNT_TYPE.getVal());
        for(Map.Entry<String , List<TsDictBO>> dictObj : dictMap.entrySet()){
        	model.put(dictObj.getKey()+"_dicts", dictObj.getValue());
        }
	}








}
