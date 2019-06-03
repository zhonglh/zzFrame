package com.zz.bms.example.controller;

import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.example.bo.TbOutMoneyBO;
import  com.zz.bms.example.query.impl.TbOutMoneyQueryWebImpl;





import com.zz.bms.system.controller.ZzDefaultSimpleController;







import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.util.poi.ExcelDictHolder;
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
 * 出资明细 控制层
* @author Administrator
* @date 2019-6-3 10:23:01
 */
@RequestMapping("/example/outmoney")
@Controller


public class TbOutMoneyController extends ZzDefaultSimpleController<TbOutMoneyBO, String , TbOutMoneyQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;










	@Override
	protected void customInfoByCreateForm(TbOutMoneyBO m, ModelMap model) {
		m.setOutMoneyFiles(IdUtils.getId());
	}

	@Override
	public void setCustomInfoByInsert(TbOutMoneyBO bo , ILoginUserEntity sessionUser){
	}









}
