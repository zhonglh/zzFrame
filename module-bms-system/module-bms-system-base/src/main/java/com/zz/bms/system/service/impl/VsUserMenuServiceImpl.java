package com.zz.bms.system.service.impl;

import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.enums.*;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.VsUserMenuBO;
import com.zz.bms.system.dao.VsUserMenuDAO;
import com.zz.bms.system.dao.TsMenuDAO;
import com.zz.bms.system.service.VsUserMenuService;

import com.zz.bms.system.bo.VsUserMenuBO;
import com.zz.bms.system.dao.VsUserMenuDAO;
import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;


import com.zz.bms.util.configs.AppConfig;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 菜单 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:56:24
 */
@Service
public class VsUserMenuServiceImpl extends BaseServiceImpl<VsUserMenuBO,String> implements VsUserMenuService {



	@Autowired
	private TsDictService tsDictService;



	@Autowired
	private VsUserDAO vsUserDAO;


	@Autowired
	private VsUserMenuDAO vsUserMenuDAO ;



	@Override
	public BaseDAO getDAO() {
		return vsUserMenuDAO ;
	}



	@Override
	public VsUserMenuBO processResult(VsUserMenuBO vsUserMenuBO) {

		try {
			if(StringUtils.isEmpty(vsUserMenuBO.getShortcutName()) && StringUtils.isNotEmpty(vsUserMenuBO.getShortcut()) ) {
				String dictName = tsDictService.getDictName(vsUserMenuBO.getShortcut(),EnumDictType.SHORTCUT.getVal());
				vsUserMenuBO.setShortcutName(dictName);
			}
		}catch(Exception e){

		}

		return vsUserMenuBO;

	}





	@Override
	public List<VsUserMenuBO> processResult(List<VsUserMenuBO> vsUserMenuBOs) {
		if(vsUserMenuBOs == null || vsUserMenuBOs.isEmpty()){
			return vsUserMenuBOs;
		}

		int n = AppConfig.MENU_MAX_LEVEL;
		Map<String , VsUserMenuBO> map = new HashMap<String , VsUserMenuBO>();
		vsUserMenuBOs.forEach(vsUserMenuBO -> {
			int count = (n - vsUserMenuBO.getLevel())*2;
			StringBuilder s = new StringBuilder(vsUserMenuBO.getSortno().toString());
			for(int index = 0 ; index < count ; index ++){
				s.append("0");
			}
			vsUserMenuBO.setSortIndex(Integer.parseInt(s.toString()));

			if(StringUtils.isNotEmpty(vsUserMenuBO.getPid())){
				VsUserMenuBO parent = map.get(vsUserMenuBO.getPid());
				if(parent != null){
					vsUserMenuBO.setSortIndex(vsUserMenuBO.getSortIndex() + parent.getSortIndex());
				}
			}
			map.put(vsUserMenuBO.getId() , vsUserMenuBO);

		});



		String[] dictTypes = new String[]{EnumDictType.SHORTCUT.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		vsUserMenuBOs.forEach(vsUserMenuBO -> {

			if(StringUtils.isEmpty(vsUserMenuBO.getShortcutName()) && StringUtils.isNotEmpty(vsUserMenuBO.getShortcut()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.SHORTCUT.getVal() + vsUserMenuBO.getShortcut());
				if(dict != null) {
					vsUserMenuBO.setShortcutName(dict.getDictName());
				}
			}
		});



		return vsUserMenuBOs;
	}




	@Override
	public void isExist(VsUserMenuBO vsUserMenuBO) {
	}


}