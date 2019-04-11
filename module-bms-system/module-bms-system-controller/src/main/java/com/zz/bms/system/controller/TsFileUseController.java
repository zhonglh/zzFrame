package com.zz.bms.system.controller;

import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.system.bo.TsFileUseBO;
import  com.zz.bms.system.query.impl.TsFileUseQueryWebImpl;

import  com.zz.bms.system.query.impl.VsFileUseQueryWebImpl;
import com.zz.bms.system.bo.VsFileUseBO;




import com.zz.bms.system.controller.ZzDefaultController;

import com.zz.bms.util.base.java.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 文件使用 控制层
* @author Administrator
* @date 2019-4-11 16:31:59
 */
@RequestMapping("/system/fileuse")
@Controller


public class TsFileUseController extends ZzDefaultController<TsFileUseBO,VsFileUseBO, String , TsFileUseQueryWebImpl , VsFileUseQueryWebImpl> {

	@Autowired
	private TsDictService tsDictService;

	@Override
	public void setCustomInfoByInsert(TsFileUseBO bo , ILoginUserEntity sessionUser){
	}





}
