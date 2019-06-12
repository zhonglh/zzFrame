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
import com.zz.bms.system.bo.TsDictBO;


import com.zz.bms.example.bo.TbFundAccountBO;
import com.zz.bms.example.dao.TbFundAccountDAO;
import com.zz.bms.example.service.TbFundAccountService;

import com.zz.bms.example.bo.TbBankBO;
import com.zz.bms.example.dao.TbBankDAO;
import com.zz.bms.example.bo.TbFundBO;
import com.zz.bms.example.dao.TbFundDAO;
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
* 基金账户 ServiceImpl
* @author Administrator
* @date 2019-6-12 19:11:18
*/
@Service
public class TbFundAccountServiceImpl extends SystemBaseServiceImpl<TbFundAccountBO,String> implements TbFundAccountService {



	@Autowired
	private TsDictService tsDictService;




    @Autowired
    private TbBankDAO tbBankDAO;
    @Autowired
    private TbFundDAO tbFundDAO;
    @Autowired
    private TsUserDAO tsUserDAO;


    @Autowired
    private TbFundAccountDAO tbFundAccountDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tbFundAccountDAO ;
    }



	@Override
	public TbFundAccountBO processResult(TbFundAccountBO tbFundAccountBO) {


		if(StringUtils.isNotEmpty( tbFundAccountBO.getOtherBankId())){
			TbBankBO temp = tbBankDAO.selectById( tbFundAccountBO.getOtherBankId() );
			if(temp != null){
				tbFundAccountBO.setOtherBankName(temp.getBankName());
			}
		}

		if(StringUtils.isNotEmpty( tbFundAccountBO.getBankId())){
			TbBankBO temp = tbBankDAO.selectById( tbFundAccountBO.getBankId() );
			if(temp != null){
				tbFundAccountBO.setBankName(temp.getBankName());
			}
		}

		if(StringUtils.isNotEmpty( tbFundAccountBO.getFundId())){
			TbFundBO temp = tbFundDAO.selectById( tbFundAccountBO.getFundId() );
			if(temp != null){
				tbFundAccountBO.setFundName(temp.getFundName());
			}
		}
		try {
			if(StringUtils.isEmpty(tbFundAccountBO.getFundAccountTypeName()) && StringUtils.isNotEmpty(tbFundAccountBO.getFundAccountType()) ) {
				String dictName = tsDictService.getDictName(tbFundAccountBO.getFundAccountType(),EnumDictType.FUND_ACCOUNT_TYPE.getVal());
				tbFundAccountBO.setFundAccountTypeName(dictName);
			}
		}catch(Exception e){

		}

		if(StringUtils.isNotEmpty( tbFundAccountBO.getUserId())){
			TsUserBO temp = tsUserDAO.selectById( tbFundAccountBO.getUserId() );
			if(temp != null){
				tbFundAccountBO.setUserName(temp.getUserName());
			}
		}




		return tbFundAccountBO;

	}





	@Override
	public List<TbFundAccountBO> processResult(List<TbFundAccountBO> tbFundAccountBOs) {
		if(tbFundAccountBOs == null || tbFundAccountBOs.isEmpty()){
			return tbFundAccountBOs;
		}

		List<String> otherBankIdList = new ArrayList<String>();
		List<String> bankIdList = new ArrayList<String>();
		List<String> fundIdList = new ArrayList<String>();
		List<String> userIdList = new ArrayList<String>();

		for(TbFundAccountBO bo : tbFundAccountBOs)		{

			if(StringUtils.isNotEmpty( bo.getOtherBankId())){
				otherBankIdList.add(bo.getOtherBankId());
			}
			if(StringUtils.isNotEmpty( bo.getBankId())){
				bankIdList.add(bo.getBankId());
			}
			if(StringUtils.isNotEmpty( bo.getFundId())){
				fundIdList.add(bo.getFundId());
			}
			if(StringUtils.isNotEmpty( bo.getUserId())){
				userIdList.add(bo.getUserId());
			}
		}


		if(!otherBankIdList.isEmpty()){
			List<TbBankBO> list =  tbBankDAO.selectBatchIds(otherBankIdList);
			Map<String,TbBankBO> map = EntityUtil.list2Map(list);

			tbFundAccountBOs.forEach(tbFundAccountBO -> {
				if(StringUtils.isNotEmpty( tbFundAccountBO.getOtherBankId())){
					TbBankBO temp = map.get( tbFundAccountBO.getOtherBankId() );
					if(temp != null){
							tbFundAccountBO.setOtherBankName(temp.getBankName());
					}
				}
			});
		}

		if(!bankIdList.isEmpty()){
			List<TbBankBO> list =  tbBankDAO.selectBatchIds(bankIdList);
			Map<String,TbBankBO> map = EntityUtil.list2Map(list);

			tbFundAccountBOs.forEach(tbFundAccountBO -> {
				if(StringUtils.isNotEmpty( tbFundAccountBO.getBankId())){
					TbBankBO temp = map.get( tbFundAccountBO.getBankId() );
					if(temp != null){
							tbFundAccountBO.setBankName(temp.getBankName());
					}
				}
			});
		}

		if(!fundIdList.isEmpty()){
			List<TbFundBO> list =  tbFundDAO.selectBatchIds(fundIdList);
			Map<String,TbFundBO> map = EntityUtil.list2Map(list);

			tbFundAccountBOs.forEach(tbFundAccountBO -> {
				if(StringUtils.isNotEmpty( tbFundAccountBO.getFundId())){
					TbFundBO temp = map.get( tbFundAccountBO.getFundId() );
					if(temp != null){
							tbFundAccountBO.setFundName(temp.getFundName());
					}
				}
			});
		}

		if(!userIdList.isEmpty()){
			List<TsUserBO> list =  tsUserDAO.selectBatchIds(userIdList);
			Map<String,TsUserBO> map = EntityUtil.list2Map(list);

			tbFundAccountBOs.forEach(tbFundAccountBO -> {
				if(StringUtils.isNotEmpty( tbFundAccountBO.getUserId())){
					TsUserBO temp = map.get( tbFundAccountBO.getUserId() );
					if(temp != null){
							tbFundAccountBO.setUserName(temp.getUserName());
					}
				}
			});
		}





		String[] dictTypes = new String[]{EnumDictType.FUND_ACCOUNT_TYPE.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tbFundAccountBOs.forEach(tbFundAccountBO -> {
			if(StringUtils.isEmpty(tbFundAccountBO.getFundAccountTypeName()) && StringUtils.isNotEmpty(tbFundAccountBO.getFundAccountType()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.FUND_ACCOUNT_TYPE.getVal() + tbFundAccountBO.getFundAccountType());
				if(dict != null) {
					tbFundAccountBO.setFundAccountTypeName(dict.getDictName());
				}
			}
		});
		return tbFundAccountBOs;
	}


	@Override
	public void isExist(TbFundAccountBO tbFundAccountBO) {
	}





}