package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.system.bo.TsLoginLogBO;
import  com.zz.bms.system.query.impl.TsLoginLogQueryWebImpl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * 登陆日志 控制层
* @author Administrator
* @date 2019-4-11 15:21:26
 */
@RequestMapping("/system/loginlog")
@Controller
public class TsLoginLogController extends ZzDefaultSimpleController<TsLoginLogBO, String , TsLoginLogQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;

	@Override
	public void setCustomInfoByInsert(TsLoginLogBO bo , ILoginUserEntity sessionUser){
	}

	@Override
	protected Wrapper buildQueryWrapper(TsLoginLogQueryWebImpl query , TsLoginLogBO m) {
		QueryWrapper wrapper =   query.buildWrapper();
		wrapper.orderByDesc(" operation_time " );
		return wrapper;
	}



	@Override
	protected void setCommonData(TsLoginLogBO tsLoginLogBO ,ModelMap model) {
    	Map<String , List<TsDictBO>> dictMap = tsDictService.allDicts(EnumDictType.OPERATION_TYPE.getVal());
        for(Map.Entry<String , List<TsDictBO>> dictObj : dictMap.entrySet()){
        	model.put(dictObj.getKey()+"_dicts", dictObj.getValue());
        }
	}



}
