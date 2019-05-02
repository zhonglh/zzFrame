package com.zz.bms.example.service.impl;

import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.enums.*;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.example.bo.TbInvestorAgreementBO;
import com.zz.bms.example.dao.TbInvestorAgreementDAO;
import com.zz.bms.example.service.TbInvestorAgreementService;

import com.zz.bms.example.bo.TbFundBO;
import com.zz.bms.example.dao.TbFundDAO;
import com.zz.bms.example.bo.TbInvestorBO;
import com.zz.bms.example.dao.TbInvestorDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* 投资协议 ServiceImpl
* @author Administrator
* @date 2019-5-2 18:36:10
*/
@Service
public class TbInvestorAgreementServiceImpl extends BaseServiceImpl<TbInvestorAgreementBO,String> implements TbInvestorAgreementService {



	@Autowired
	private TsDictService tsDictService;



    @Autowired
    private TbFundDAO tbFundDAO;
    @Autowired
    private TbInvestorDAO tbInvestorDAO;


    @Autowired
    private TbInvestorAgreementDAO tbInvestorAgreementDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tbInvestorAgreementDAO ;
    }



	@Override
	public TbInvestorAgreementBO processResult(TbInvestorAgreementBO tbInvestorAgreementBO) {


		if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getFundId())){
			TbFundBO temp = tbFundDAO.selectById( tbInvestorAgreementBO.getFundId() );
			if(temp != null){
				tbInvestorAgreementBO.setFundName(temp.getFundName());
			}
		}

		if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getInvestorId())){
			TbInvestorBO temp = tbInvestorDAO.selectById( tbInvestorAgreementBO.getInvestorId() );
			if(temp != null){
				tbInvestorAgreementBO.setInvestorName(temp.getInvestorName());
			}
		}

		return tbInvestorAgreementBO;

	}





	@Override
	public List<TbInvestorAgreementBO> processResult(List<TbInvestorAgreementBO> tbInvestorAgreementBOs) {
		if(tbInvestorAgreementBOs == null || tbInvestorAgreementBOs.isEmpty()){
			return tbInvestorAgreementBOs;
		}

		List<String> fundIdList = new ArrayList<String>();
		List<String> investorIdList = new ArrayList<String>();

		for(TbInvestorAgreementBO bo : tbInvestorAgreementBOs)		{

			if(StringUtils.isNotEmpty( bo.getFundId())){
				fundIdList.add(bo.getFundId());
			}
			if(StringUtils.isNotEmpty( bo.getInvestorId())){
				investorIdList.add(bo.getInvestorId());
			}
		}


		if(!fundIdList.isEmpty()){
			List<TbFundBO> list =  tbFundDAO.selectBatchIds(fundIdList);
			Map<String,TbFundBO> map = EntityUtil.list2Map(list);

			tbInvestorAgreementBOs.forEach(tbInvestorAgreementBO -> {
				if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getFundId())){
					TbFundBO temp = map.get( tbInvestorAgreementBO.getFundId() );
					if(temp != null){
							tbInvestorAgreementBO.setFundName(temp.getFundName());
					}
				}
			});
		}

		if(!investorIdList.isEmpty()){
			List<TbInvestorBO> list =  tbInvestorDAO.selectBatchIds(investorIdList);
			Map<String,TbInvestorBO> map = EntityUtil.list2Map(list);

			tbInvestorAgreementBOs.forEach(tbInvestorAgreementBO -> {
				if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getInvestorId())){
					TbInvestorBO temp = map.get( tbInvestorAgreementBO.getInvestorId() );
					if(temp != null){
							tbInvestorAgreementBO.setInvestorName(temp.getInvestorName());
					}
				}
			});
		}





		return tbInvestorAgreementBOs;
	}


	@Override
	public void isExist(TbInvestorAgreementBO tbInvestorAgreementBO) {
	}





}