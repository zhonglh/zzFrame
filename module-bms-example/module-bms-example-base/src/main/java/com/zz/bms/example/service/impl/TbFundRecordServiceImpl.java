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
import com.zz.bms.example.bo.TbFundRecordBO;
import com.zz.bms.example.dao.TbFundRecordDAO;
import com.zz.bms.example.service.TbFundRecordService;

import com.zz.bms.example.bo.TbFundBO;
import com.zz.bms.example.dao.TbFundDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* 基金备案 ServiceImpl
* @author Administrator
* @date 2019-5-2 18:36:10
*/
@Service
public class TbFundRecordServiceImpl extends BaseServiceImpl<TbFundRecordBO,String> implements TbFundRecordService {



	@Autowired
	private TsDictService tsDictService;



    @Autowired
    private TbFundDAO tbFundDAO;


    @Autowired
    private TbFundRecordDAO tbFundRecordDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tbFundRecordDAO ;
    }



	@Override
	public TbFundRecordBO processResult(TbFundRecordBO tbFundRecordBO) {


		if(StringUtils.isNotEmpty( tbFundRecordBO.getFundId())){
			TbFundBO temp = tbFundDAO.selectById( tbFundRecordBO.getFundId() );
			if(temp != null){
				tbFundRecordBO.setFundName(temp.getFundName());
			}
		}

		return tbFundRecordBO;

	}





	@Override
	public List<TbFundRecordBO> processResult(List<TbFundRecordBO> tbFundRecordBOs) {
		if(tbFundRecordBOs == null || tbFundRecordBOs.isEmpty()){
			return tbFundRecordBOs;
		}

		List<String> fundIdList = new ArrayList<String>();

		for(TbFundRecordBO bo : tbFundRecordBOs)		{

			if(StringUtils.isNotEmpty( bo.getFundId())){
				fundIdList.add(bo.getFundId());
			}
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