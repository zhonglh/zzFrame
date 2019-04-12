package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.system.bo.TsMenuBO;
import  com.zz.bms.system.query.impl.TsMenuQueryWebImpl;





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
 * 菜单 控制层
* @author Administrator
* @date 2019-4-11 15:21:26
 */
@RequestMapping("/system/menu")
@Controller


public class TsMenuController extends ZzDefaultSimpleController<TsMenuBO, String , TsMenuQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;

	@Override
	public void setCustomInfoByInsert(TsMenuBO bo , ILoginUserEntity sessionUser){
	}

	@Override
	protected Wrapper buildQueryWrapper(TsMenuQueryWebImpl query , TsMenuBO m) {
		QueryWrapper wrapper =   query.buildWrapper();
		wrapper.orderByAsc(" menu_sort " );
		return wrapper;
	}


	@Override
	protected void setCommonData(TsMenuBO tsMenuBO ,ModelMap model) {
    	Map<String , List<TsDictBO>> dictMap = tsDictService.allDicts(EnumDictType.YES_NO.getVal());
        for(Map.Entry<String , List<TsDictBO>> dictObj : dictMap.entrySet()){
        	model.put(dictObj.getKey()+"_dicts", dictObj.getValue());
        }
	}



}
