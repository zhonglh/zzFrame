package com.zz.bms.system.controller;

import com.zz.bms.enums.*;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.core.db.entity.*;

import com.zz.bms.system.bo.TsFileBO;
import  com.zz.bms.system.query.impl.TsFileQueryWebImpl;





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
 * 文件 控制层
* @author Administrator
* @date 2019-4-11 16:32:00
 */
@RequestMapping("/system/file")
@Controller


public class TsFileController extends ZzDefaultSimpleController<TsFileBO, String , TsFileQueryWebImpl > {

	@Autowired
	private TsDictService tsDictService;

	@Override
	public void setCustomInfoByInsert(TsFileBO bo , ILoginUserEntity<String> sessionUser){
	}


	@Override
	protected void setCommonData(TsFileBO tsFileBO ,ModelMap model) {
    	Map<String , List<TsDictBO>> dictMap = tsDictService.allDicts(EnumDictType.FILE_ENGINE.getVal());
        for(Map.Entry<String , List<TsDictBO>> dictObj : dictMap.entrySet()){
        	model.put(dictObj.getKey()+"_dicts", dictObj.getValue());
        }
	}



}
