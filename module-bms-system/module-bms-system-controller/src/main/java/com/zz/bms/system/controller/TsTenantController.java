package com.zz.bms.system.controller;

import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.system.bo.TsTenantBO;
import  com.zz.bms.system.query.impl.TsTenantQueryWebImpl;





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
 * 企业 控制层
* @author Administrator
* @date 2019-4-11 15:21:25
 */
@RequestMapping("/system/tenant")
@Controller


public class TsTenantController extends ZzDefaultSimpleController<TsTenantBO, String , TsTenantQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;

	@Override
	public void setCustomInfoByInsert(TsTenantBO bo , ILoginUserEntity sessionUser){
	}





}
