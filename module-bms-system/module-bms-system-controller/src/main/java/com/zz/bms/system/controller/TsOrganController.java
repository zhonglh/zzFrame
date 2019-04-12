package com.zz.bms.system.controller;

import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.system.bo.TsOrganBO;
import  com.zz.bms.system.query.impl.TsOrganQueryWebImpl;





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
 * 机构 控制层
* @author Administrator
* @date 2019-4-11 15:21:24
 */
@RequestMapping("/system/organ")
@Controller


public class TsOrganController extends ZzDefaultSimpleController<TsOrganBO, String , TsOrganQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;

	@Override
	public void setCustomInfoByInsert(TsOrganBO bo , ILoginUserEntity sessionUser){

		bo.setOrganStatus(EnumRoleStatus.normal.getVal());
		bo.setOrganStatusName(EnumRoleStatus.normal.getLabel());

	}


	@Override
	protected void setCommonData(TsOrganBO tsOrganBO ,ModelMap model) {
    	Map<String , List<TsDictBO>> dictMap = tsDictService.allDicts(EnumDictType.ORGAN_TYPE.getVal(),EnumDictType.ORGAN_STATUS.getVal());
        for(Map.Entry<String , List<TsDictBO>> dictObj : dictMap.entrySet()){
        	model.put(dictObj.getKey()+"_dicts", dictObj.getValue());
        }
	}



}
