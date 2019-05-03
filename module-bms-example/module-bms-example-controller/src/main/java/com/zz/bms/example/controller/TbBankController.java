package com.zz.bms.example.controller;

import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.example.bo.TbBankBO;
import com.zz.bms.example.query.impl.TbBankQueryWebImpl;
import com.zz.bms.system.controller.ZzGroupDefaultSimpleController;
import com.zz.bms.system.service.TsDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 银行信息 控制层
* @author Administrator
* @date 2019-5-3 10:40:30
 */
@RequestMapping("/example/bank")
@Controller


public class TbBankController extends ZzGroupDefaultSimpleController<TbBankBO, String , TbBankQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;








	@Override
	public void setCustomInfoByInsert(TbBankBO bo , ILoginUserEntity sessionUser){
	}









}
