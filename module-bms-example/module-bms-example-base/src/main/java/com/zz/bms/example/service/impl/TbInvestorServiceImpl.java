package com.zz.bms.example.service.impl;


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


import com.zz.bms.example.bo.TbInvestorBO;
import com.zz.bms.example.dao.TbInvestorDAO;
import com.zz.bms.example.service.TbInvestorService;

import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;




import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* 投资人 ServiceImpl
* @author Administrator
* @date 2019-6-12 19:11:24
*/
@Service
public class TbInvestorServiceImpl extends SystemBaseServiceImpl<TbInvestorBO,String> implements TbInvestorService {



	@Autowired
	private TsDictService tsDictService;


	@Autowired
	private VsFileUseService vsFileUseService;


    @Autowired
    private TsUserDAO tsUserDAO;


    @Autowired
    private TbInvestorDAO tbInvestorDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tbInvestorDAO ;
    }



	@Override
	public TbInvestorBO processResult(TbInvestorBO tbInvestorBO) {

		try {
			if(StringUtils.isEmpty(tbInvestorBO.getInvestorTypeName()) && StringUtils.isNotEmpty(tbInvestorBO.getInvestorType()) ) {
				String dictName = tsDictService.getDictName(tbInvestorBO.getInvestorType(),EnumDictType.INVESTOR_TYPE.getVal());
				tbInvestorBO.setInvestorTypeName(dictName);
			}
		}catch(Exception e){

		}

		if(StringUtils.isNotEmpty( tbInvestorBO.getManageUserId())){
			TsUserBO temp = tsUserDAO.selectById( tbInvestorBO.getManageUserId() );
			if(temp != null){
				tbInvestorBO.setManageUserName(temp.getUserName());
			}
		}
		try {
			if(StringUtils.isEmpty(tbInvestorBO.getCardTypeName()) && StringUtils.isNotEmpty(tbInvestorBO.getCardType()) ) {
				String dictName = tsDictService.getDictName(tbInvestorBO.getCardType(),EnumDictType.CARD_TYPE.getVal());
				tbInvestorBO.setCardTypeName(dictName);
			}
		}catch(Exception e){

		}


		try{
			if(StringUtils.isNotEmpty(tbInvestorBO.getInvestorFiles()) && tbInvestorBO.getInvestorFilesList() == null){
			QueryWrapper<VsFileUseBO> qw = new QueryWrapper<VsFileUseBO>();
			qw.lambda().eq(VsFileUseBO::getBusinessId , tbInvestorBO.getId());
			qw.lambda().eq(VsFileUseBO::getBusinessTempId , tbInvestorBO.getInvestorFiles());
			List<VsFileUseBO> list = vsFileUseService.list(qw);
				tbInvestorBO.setInvestorFilesList(list);
			}
		}catch(Exception e){}



		return tbInvestorBO;

	}





	@Override
	public List<TbInvestorBO> processResult(List<TbInvestorBO> tbInvestorBOs) {
		if(tbInvestorBOs == null || tbInvestorBOs.isEmpty()){
			return tbInvestorBOs;
		}

		List<String> manageUserIdList = new ArrayList<String>();

		for(TbInvestorBO bo : tbInvestorBOs)		{

			if(StringUtils.isNotEmpty( bo.getManageUserId())){
				manageUserIdList.add(bo.getManageUserId());
			}
		}


		if(!manageUserIdList.isEmpty()){
			List<TsUserBO> list =  tsUserDAO.selectBatchIds(manageUserIdList);
			Map<String,TsUserBO> map = EntityUtil.list2Map(list);

			tbInvestorBOs.forEach(tbInvestorBO -> {
				if(StringUtils.isNotEmpty( tbInvestorBO.getManageUserId())){
					TsUserBO temp = map.get( tbInvestorBO.getManageUserId() );
					if(temp != null){
							tbInvestorBO.setManageUserName(temp.getUserName());
					}
				}
			});
		}





		String[] dictTypes = new String[]{EnumDictType.INVESTOR_TYPE.getVal(),EnumDictType.CARD_TYPE.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tbInvestorBOs.forEach(tbInvestorBO -> {
			if(StringUtils.isEmpty(tbInvestorBO.getInvestorTypeName()) && StringUtils.isNotEmpty(tbInvestorBO.getInvestorType()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.INVESTOR_TYPE.getVal() + tbInvestorBO.getInvestorType());
				if(dict != null) {
					tbInvestorBO.setInvestorTypeName(dict.getDictName());
				}
			}
			if(StringUtils.isEmpty(tbInvestorBO.getCardTypeName()) && StringUtils.isNotEmpty(tbInvestorBO.getCardType()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.CARD_TYPE.getVal() + tbInvestorBO.getCardType());
				if(dict != null) {
					tbInvestorBO.setCardTypeName(dict.getDictName());
				}
			}
		});
		return tbInvestorBOs;
	}


	@Override
	public void isExist(TbInvestorBO tbInvestorBO) {
	}





}