package com.zz.bms.example.controller;

import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.example.bo.TbInvestorAgreementBO;
import  com.zz.bms.example.query.impl.TbInvestorAgreementQueryWebImpl;





import com.zz.bms.system.controller.ZzDefaultSimpleController;




import com.zz.bms.util.base.java.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 投资协议 控制层
* @author Administrator
* @date 2019-5-2 18:36:10
 */
@RequestMapping("/example/investoragreement")
@Controller


public class TbInvestorAgreementController extends ZzDefaultSimpleController<TbInvestorAgreementBO, String , TbInvestorAgreementQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;








	@Override
	public void setCustomInfoByInsert(TbInvestorAgreementBO bo , ILoginUserEntity sessionUser){
	}









}
