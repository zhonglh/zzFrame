package com.zz.bms.system.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.enums.*;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.system.service.impl.SystemBaseServiceImpl;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.VsFileUseService;

import com.zz.bms.system.bo.VsFileUseBO;
import com.zz.bms.system.bo.TsDictBO;


import com.zz.bms.system.bo.VsNotificationBO;
import com.zz.bms.system.dao.VsNotificationDAO;
import com.zz.bms.system.service.VsNotificationService;

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
* 系统通知 ServiceImpl
* @author Administrator
* @date 2019-6-8 22:01:58
*/
@Service
public class VsNotificationServiceImpl extends SystemBaseServiceImpl<VsNotificationBO,String> implements VsNotificationService {



	@Autowired
	private TsDictService tsDictService;


	@Autowired
	private VsFileUseService vsFileUseService;


    @Autowired
    private VsUserDAO vsUserDAO;


    @Autowired
    private VsNotificationDAO vsNotificationDAO ;



    @Override
    public BaseDAO getDAO() {
    	return vsNotificationDAO ;
    }



	@Override
	public VsNotificationBO processResult(VsNotificationBO vsNotificationBO) {

		try {
			if(StringUtils.isEmpty(vsNotificationBO.getIsReadName()) && StringUtils.isNotEmpty(vsNotificationBO.getIsRead()) ) {
				String dictName = tsDictService.getDictName(vsNotificationBO.getIsRead(),EnumDictType.YES_NO.getVal());
				vsNotificationBO.setIsReadName(dictName);
			}
		}catch(Exception e){

		}


		try{
			if(StringUtils.isNotEmpty(vsNotificationBO.getNotifyFiles()) && vsNotificationBO.getNotifyFilesList() == null){
			QueryWrapper<VsFileUseBO> qw = new QueryWrapper<VsFileUseBO>();
			qw.lambda().eq(VsFileUseBO::getBusinessId , vsNotificationBO.getId());
			qw.lambda().eq(VsFileUseBO::getBusinessTempId , vsNotificationBO.getNotifyFiles());
			List<VsFileUseBO> list = vsFileUseService.list(qw);
				vsNotificationBO.setNotifyFilesList(list);
			}
		}catch(Exception e){}



		return vsNotificationBO;

	}





	@Override
	public List<VsNotificationBO> processResult(List<VsNotificationBO> vsNotificationBOs) {
		if(vsNotificationBOs == null || vsNotificationBOs.isEmpty()){
			return vsNotificationBOs;
		}






		String[] dictTypes = new String[]{EnumDictType.YES_NO.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		vsNotificationBOs.forEach(vsNotificationBO -> {
			if(StringUtils.isEmpty(vsNotificationBO.getIsReadName()) && StringUtils.isNotEmpty(vsNotificationBO.getIsRead()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.YES_NO.getVal() + vsNotificationBO.getIsRead());
				if(dict != null) {
					vsNotificationBO.setIsReadName(dict.getDictName());
				}
			}
		});
		return vsNotificationBOs;
	}


	@Override
	public void isExist(VsNotificationBO vsNotificationBO) {
	}





}