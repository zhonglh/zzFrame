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
import com.zz.bms.system.bo.TsMenuBO;
import com.zz.bms.system.dao.TsMenuDAO;
import com.zz.bms.system.service.TsMenuService;

import com.zz.bms.system.bo.TsMenuBO;
import com.zz.bms.system.dao.TsMenuDAO;


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
 * @date 2019-4-10 18:25:15
 */
@Service
public class TsMenuServiceImpl extends BaseServiceImpl<TsMenuBO,String> implements TsMenuService {



	@Autowired
	private TsDictService tsDictService;





	@Autowired
	private TsMenuDAO tsMenuDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsMenuDAO ;
	}



	@Override
	public TsMenuBO processResult(TsMenuBO tsMenuBO) {

		try {
			if(StringUtils.isEmpty(tsMenuBO.getShortcutName()) && StringUtils.isNotEmpty(tsMenuBO.getShortcut()) ) {
				String dictName = tsDictService.getDictName(tsMenuBO.getShortcut(),EnumDictType.YES_NO.getVal());
				tsMenuBO.setShortcutName(dictName);
			}
		}catch(Exception e){

		}

		return tsMenuBO;

	}





	@Override
	public List<TsMenuBO> processResult(List<TsMenuBO> tsMenuBOs) {
		if(tsMenuBOs == null || tsMenuBOs.isEmpty()){
			return tsMenuBOs;
		}






		String[] dictTypes = new String[]{EnumDictType.YES_NO.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tsMenuBOs.forEach(tsMenuBO -> {
			if(StringUtils.isEmpty(tsMenuBO.getShortcutName()) && StringUtils.isNotEmpty(tsMenuBO.getShortcut()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.YES_NO.getVal() + tsMenuBO.getShortcut());
				if(dict != null) {
					tsMenuBO.setShortcutName(dict.getDictName());
				}
			}
		});



		return tsMenuBOs;
	}




	@Override
	public void isExist(TsMenuBO tsMenuBO) {

		TsMenuBO ckBO ;
		TsMenuBO temp = null ;

		ckBO = new TsMenuBO();
		ckBO.setId( tsMenuBO.getId() );
		ckBO.setMenuCode(tsMenuBO.getMenuCode());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"    ");
		}


	}


}