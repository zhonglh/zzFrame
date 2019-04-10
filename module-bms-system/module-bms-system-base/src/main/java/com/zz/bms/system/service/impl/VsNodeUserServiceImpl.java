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
import com.zz.bms.system.bo.VsNodeUserBO;
import com.zz.bms.system.dao.VsNodeUserDAO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.service.VsNodeUserService;

import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.dao.VsUserDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:56:22
 */
@Service
public class VsNodeUserServiceImpl extends BaseServiceImpl<VsNodeUserBO,String> implements VsNodeUserService {



	@Autowired
	private TsDictService tsDictService;



	@Autowired
	private VsUserDAO vsUserDAO;


	@Autowired
	private VsNodeUserDAO vsNodeUserDAO ;



	@Override
	public BaseDAO getDAO() {
		return vsNodeUserDAO ;
	}



	@Override
	public VsNodeUserBO processResult(VsNodeUserBO vsNodeUserBO) {

		try {
			if(StringUtils.isEmpty(vsNodeUserBO.getUserStatusName()) && StringUtils.isNotEmpty(vsNodeUserBO.getUserStatus()) ) {
				String dictName = tsDictService.getDictName(vsNodeUserBO.getUserStatus(),EnumDictType.USER_STATUS.getVal());
				vsNodeUserBO.setUserStatusName(dictName);
			}
		}catch(Exception e){

		}
		try {
			if(StringUtils.isEmpty(vsNodeUserBO.getSystemAdminName()) && StringUtils.isNotEmpty(vsNodeUserBO.getSystemAdmin()) ) {
				String dictName = tsDictService.getDictName(vsNodeUserBO.getSystemAdmin(),EnumDictType.YES_NO.getVal());
				vsNodeUserBO.setSystemAdminName(dictName);
			}
		}catch(Exception e){

		}

		return vsNodeUserBO;

	}





	@Override
	public List<VsNodeUserBO> processResult(List<VsNodeUserBO> vsNodeUserBOs) {
		if(vsNodeUserBOs == null || vsNodeUserBOs.isEmpty()){
			return vsNodeUserBOs;
		}






		String[] dictTypes = new String[]{EnumDictType.USER_STATUS.getVal(),EnumDictType.YES_NO.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		vsNodeUserBOs.forEach(vsNodeUserBO -> {
			if(StringUtils.isEmpty(vsNodeUserBO.getUserStatusName()) && StringUtils.isNotEmpty(vsNodeUserBO.getUserStatus()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.USER_STATUS.getVal() + vsNodeUserBO.getUserStatus());
				if(dict != null) {
					vsNodeUserBO.setUserStatusName(dict.getDictName());
				}
			}
			if(StringUtils.isEmpty(vsNodeUserBO.getSystemAdminName()) && StringUtils.isNotEmpty(vsNodeUserBO.getSystemAdmin()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.YES_NO.getVal() + vsNodeUserBO.getSystemAdmin());
				if(dict != null) {
					vsNodeUserBO.setSystemAdminName(dict.getDictName());
				}
			}
		});



		return vsNodeUserBOs;
	}




	@Override
	public void isExist(VsNodeUserBO vsNodeUserBO) {
	}


}