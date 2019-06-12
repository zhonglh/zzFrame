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


import com.zz.bms.example.bo.TbFundRecordBO;
import com.zz.bms.example.dao.TbFundRecordDAO;
import com.zz.bms.example.service.TbFundRecordService;

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
* 基金备案 ServiceImpl
* @author Administrator
* @date 2019-6-12 19:11:24
*/
@Service
public class TbFundRecordServiceImpl extends SystemBaseServiceImpl<TbFundRecordBO,String> implements TbFundRecordService {



	@Autowired
	private TsDictService tsDictService;




    @Autowired
    private TbBankDAO tbBankDAO;
    @Autowired
    private TbFundDAO tbFundDAO;
    @Autowired
    private TsUserDAO tsUserDAO;


    @Autowired
    private TbFundRecordDAO tbFundRecordDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tbFundRecordDAO ;
    }



	@Override
	public TbFundRecordBO processResult(TbFundRecordBO tbFundRecordBO) {


		if(StringUtils.isNotEmpty( tbFundRecordBO.getRecordUserId())){
			TsUserBO temp = tsUserDAO.selectById( tbFundRecordBO.getRecordUserId() );
			if(temp != null){
				tbFundRecordBO.setRecordUserName(temp.getUserName());
			}
		}

		if(StringUtils.isNotEmpty( tbFundRecordBO.getFundId())){
			TbFundBO temp = tbFundDAO.selectById( tbFundRecordBO.getFundId() );
			if(temp != null){
				tbFundRecordBO.setFundName(temp.getFundName());
			}
		}

		if(StringUtils.isNotEmpty( tbFundRecordBO.getBankId())){
			TbBankBO temp = tbBankDAO.selectById( tbFundRecordBO.getBankId() );
			if(temp != null){
				tbFundRecordBO.setBankName(temp.getBankName());
			}
		}
		try {
			if(StringUtils.isEmpty(tbFundRecordBO.getCardTypeName()) && StringUtils.isNotEmpty(tbFundRecordBO.getCardType()) ) {
				String dictName = tsDictService.getDictName(tbFundRecordBO.getCardType(),EnumDictType.CARD_TYPE.getVal());
				tbFundRecordBO.setCardTypeName(dictName);
			}
		}catch(Exception e){

		}




		return tbFundRecordBO;

	}





	@Override
	public List<TbFundRecordBO> processResult(List<TbFundRecordBO> tbFundRecordBOs) {
		if(tbFundRecordBOs == null || tbFundRecordBOs.isEmpty()){
			return tbFundRecordBOs;
		}

		List<String> recordUserIdList = new ArrayList<String>();
		List<String> fundIdList = new ArrayList<String>();
		List<String> bankIdList = new ArrayList<String>();

		for(TbFundRecordBO bo : tbFundRecordBOs)		{

			if(StringUtils.isNotEmpty( bo.getRecordUserId())){
				recordUserIdList.add(bo.getRecordUserId());
			}
			if(StringUtils.isNotEmpty( bo.getFundId())){
				fundIdList.add(bo.getFundId());
			}
			if(StringUtils.isNotEmpty( bo.getBankId())){
				bankIdList.add(bo.getBankId());
			}
		}


		if(!recordUserIdList.isEmpty()){
			List<TsUserBO> list =  tsUserDAO.selectBatchIds(recordUserIdList);
			Map<String,TsUserBO> map = EntityUtil.list2Map(list);

			tbFundRecordBOs.forEach(tbFundRecordBO -> {
				if(StringUtils.isNotEmpty( tbFundRecordBO.getRecordUserId())){
					TsUserBO temp = map.get( tbFundRecordBO.getRecordUserId() );
					if(temp != null){
							tbFundRecordBO.setRecordUserName(temp.getUserName());
					}
				}
			});
		}

		if(!fundIdList.isEmpty()){
			List<TbFundBO> list =  tbFundDAO.selectBatchIds(fundIdList);
			Map<String,TbFundBO> map = EntityUtil.list2Map(list);

			tbFundRecordBOs.forEach(tbFundRecordBO -> {
				if(StringUtils.isNotEmpty( tbFundRecordBO.getFundId())){
					TbFundBO temp = map.get( tbFundRecordBO.getFundId() );
					if(temp != null){
							tbFundRecordBO.setFundName(temp.getFundName());
					}
				}
			});
		}

		if(!bankIdList.isEmpty()){
			List<TbBankBO> list =  tbBankDAO.selectBatchIds(bankIdList);
			Map<String,TbBankBO> map = EntityUtil.list2Map(list);

			tbFundRecordBOs.forEach(tbFundRecordBO -> {
				if(StringUtils.isNotEmpty( tbFundRecordBO.getBankId())){
					TbBankBO temp = map.get( tbFundRecordBO.getBankId() );
					if(temp != null){
							tbFundRecordBO.setBankName(temp.getBankName());
					}
				}
			});
		}





		String[] dictTypes = new String[]{EnumDictType.CARD_TYPE.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tbFundRecordBOs.forEach(tbFundRecordBO -> {
			if(StringUtils.isEmpty(tbFundRecordBO.getCardTypeName()) && StringUtils.isNotEmpty(tbFundRecordBO.getCardType()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.CARD_TYPE.getVal() + tbFundRecordBO.getCardType());
				if(dict != null) {
					tbFundRecordBO.setCardTypeName(dict.getDictName());
				}
			}
		});
		return tbFundRecordBOs;
	}


	@Override
	public void isExist(TbFundRecordBO tbFundRecordBO) {

		TbFundRecordBO ckBO ;
		TbFundRecordBO temp = null ;

			ckBO = new TbFundRecordBO();
			ckBO.setId( tbFundRecordBO.getId() );
				ckBO.setFundId(tbFundRecordBO.getFundId());
			temp = this.selectCheck(ckBO);
			if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"    ");
			}


	}





}