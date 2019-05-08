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

import com.zz.bms.example.bo.TbInvestorBO;
import com.zz.bms.example.dao.TbInvestorDAO;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.example.bo.TbFundBO;
import com.zz.bms.example.dao.TbFundDAO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;


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
* @date 2019-5-8 13:19:38
*/
@Service
public class TbInvestorAgreementServiceImpl extends BaseServiceImpl<TbInvestorAgreementBO,String> implements TbInvestorAgreementService {



	@Autowired
	private TsDictService tsDictService;



    @Autowired
    private TbInvestorDAO tbInvestorDAO;
    @Autowired
    private TsDepDAO tsDepDAO;
    @Autowired
    private TbFundDAO tbFundDAO;
    @Autowired
    private TsUserDAO tsUserDAO;


    @Autowired
    private TbInvestorAgreementDAO tbInvestorAgreementDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tbInvestorAgreementDAO ;
    }



	@Override
	public TbInvestorAgreementBO processResult(TbInvestorAgreementBO tbInvestorAgreementBO) {


		if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getInvestorId())){
			TbInvestorBO temp = tbInvestorDAO.selectById( tbInvestorAgreementBO.getInvestorId() );
			if(temp != null){
				tbInvestorAgreementBO.setInvestorName(temp.getInvestorName());
			}
		}

		if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getSignUserId())){
			TsUserBO temp = tsUserDAO.selectById( tbInvestorAgreementBO.getSignUserId() );
			if(temp != null){
				tbInvestorAgreementBO.setSignUserName(temp.getUserName());
			}
		}

		if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getSignDepId())){
			TsDepBO temp = tsDepDAO.selectById( tbInvestorAgreementBO.getSignDepId() );
			if(temp != null){
				tbInvestorAgreementBO.setSignDepName(temp.getDepName());
			}
		}

		if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getFundId())){
			TbFundBO temp = tbFundDAO.selectById( tbInvestorAgreementBO.getFundId() );
			if(temp != null){
				tbInvestorAgreementBO.setFundName(temp.getFundName());
			}
		}

		return tbInvestorAgreementBO;

	}





	@Override
	public List<TbInvestorAgreementBO> processResult(List<TbInvestorAgreementBO> tbInvestorAgreementBOs) {
		if(tbInvestorAgreementBOs == null || tbInvestorAgreementBOs.isEmpty()){
			return tbInvestorAgreementBOs;
		}

		List<String> investorIdList = new ArrayList<String>();
		List<String> signUserIdList = new ArrayList<String>();
		List<String> signDepIdList = new ArrayList<String>();
		List<String> fundIdList = new ArrayList<String>();

		for(TbInvestorAgreementBO bo : tbInvestorAgreementBOs)		{

			if(StringUtils.isNotEmpty( bo.getInvestorId())){
				investorIdList.add(bo.getInvestorId());
			}
			if(StringUtils.isNotEmpty( bo.getSignUserId())){
				signUserIdList.add(bo.getSignUserId());
			}
			if(StringUtils.isNotEmpty( bo.getSignDepId())){
				signDepIdList.add(bo.getSignDepId());
			}
			if(StringUtils.isNotEmpty( bo.getFundId())){
				fundIdList.add(bo.getFundId());
			}
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

		if(!signUserIdList.isEmpty()){
			List<TsUserBO> list =  tsUserDAO.selectBatchIds(signUserIdList);
			Map<String,TsUserBO> map = EntityUtil.list2Map(list);

			tbInvestorAgreementBOs.forEach(tbInvestorAgreementBO -> {
				if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getSignUserId())){
					TsUserBO temp = map.get( tbInvestorAgreementBO.getSignUserId() );
					if(temp != null){
							tbInvestorAgreementBO.setSignUserName(temp.getUserName());
					}
				}
			});
		}

		if(!signDepIdList.isEmpty()){
			List<TsDepBO> list =  tsDepDAO.selectBatchIds(signDepIdList);
			Map<String,TsDepBO> map = EntityUtil.list2Map(list);

			tbInvestorAgreementBOs.forEach(tbInvestorAgreementBO -> {
				if(StringUtils.isNotEmpty( tbInvestorAgreementBO.getSignDepId())){
					TsDepBO temp = map.get( tbInvestorAgreementBO.getSignDepId() );
					if(temp != null){
							tbInvestorAgreementBO.setSignDepName(temp.getDepName());
					}
				}
			});
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





		return tbInvestorAgreementBOs;
	}


	@Override
	public void isExist(TbInvestorAgreementBO tbInvestorAgreementBO) {
	}





}