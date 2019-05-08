package com.zz.bms.example.controller;

import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.example.bo.TbInvestorBO;
import  com.zz.bms.example.query.impl.TbInvestorQueryWebImpl;





import com.zz.bms.system.controller.ZzDefaultSimpleController;







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
 * 投资人 控制层
* @author Administrator
* @date 2019-5-8 13:45:42
 */
@RequestMapping("/example/investor")
@Controller


public class TbInvestorController extends ZzDefaultSimpleController<TbInvestorBO, String , TbInvestorQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;












	@Override
	public void setCustomInfoByInsert(TbInvestorBO bo , ILoginUserEntity sessionUser){
	}









}
