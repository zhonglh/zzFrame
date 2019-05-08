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
import com.zz.bms.example.bo.TbFundBO;
import com.zz.bms.example.dao.TbFundDAO;
import com.zz.bms.example.service.TbFundService;

import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* 基金 ServiceImpl
* @author Administrator
* @date 2019-5-8 13:45:41
*/
@Service
public class TbFundServiceImpl extends BaseServiceImpl<TbFundBO,String> implements TbFundService {



	@Autowired
	private TsDictService tsDictService;



    @Autowired
    private TsUserDAO tsUserDAO;
    @Autowired
    private TsDepDAO tsDepDAO;


    @Autowired
    private TbFundDAO tbFundDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tbFundDAO ;
    }



	@Override
	public TbFundBO processResult(TbFundBO tbFundBO) {

		try {
			if(StringUtils.isEmpty(tbFundBO.getFundDirectionName()) && StringUtils.isNotEmpty(tbFundBO.getFundDirection()) ) {
				String dictName = tsDictService.getDictName(tbFundBO.getFundDirection(),EnumDictType.FUND_DIRECTION.getVal());
				tbFundBO.setFundDirectionName(dictName);
			}
		}catch(Exception e){

		}
		try {
			if(StringUtils.isEmpty(tbFundBO.getManagTypeName()) && StringUtils.isNotEmpty(tbFundBO.getManagType()) ) {
				String dictName = tsDictService.getDictName(tbFundBO.getManagType(),EnumDictType.MANAG_TYPE.getVal());
				tbFundBO.setManagTypeName(dictName);
			}
		}catch(Exception e){

		}
		try {
			if(StringUtils.isEmpty(tbFundBO.getFundTypeName()) && StringUtils.isNotEmpty(tbFundBO.getFundType()) ) {
				String dictName = tsDictService.getDictName(tbFundBO.getFundType(),EnumDictType.FUND_TYPE.getVal());
				tbFundBO.setFundTypeName(dictName);
			}
		}catch(Exception e){

		}

		if(StringUtils.isNotEmpty( tbFundBO.getManagerUserId())){
			TsUserBO temp = tsUserDAO.selectById( tbFundBO.getManagerUserId() );
			if(temp != null){
				tbFundBO.setManagerUserName(temp.getUserName());
			}
		}

		if(StringUtils.isNotEmpty( tbFundBO.getDepId())){
			TsDepBO temp = tsDepDAO.selectById( tbFundBO.getDepId() );
			if(temp != null){
				tbFundBO.setDepName(temp.getDepName());
			}
		}

		return tbFundBO;

	}





	@Override
	public List<TbFundBO> processResult(List<TbFundBO> tbFundBOs) {
		if(tbFundBOs == null || tbFundBOs.isEmpty()){
			return tbFundBOs;
		}

		List<String> managerUserIdList = new ArrayList<String>();
		List<String> depIdList = new ArrayList<String>();

		for(TbFundBO bo : tbFundBOs)		{

			if(StringUtils.isNotEmpty( bo.getManagerUserId())){
				managerUserIdList.add(bo.getManagerUserId());
			}
			if(StringUtils.isNotEmpty( bo.getDepId())){
				depIdList.add(bo.getDepId());
			}
		}


		if(!managerUserIdList.isEmpty()){
			List<TsUserBO> list =  tsUserDAO.selectBatchIds(managerUserIdList);
			Map<String,TsUserBO> map = EntityUtil.list2Map(list);

			tbFundBOs.forEach(tbFundBO -> {
				if(StringUtils.isNotEmpty( tbFundBO.getManagerUserId())){
					TsUserBO temp = map.get( tbFundBO.getManagerUserId() );
					if(temp != null){
							tbFundBO.setManagerUserName(temp.getUserName());
					}
				}
			});
		}

		if(!depIdList.isEmpty()){
			List<TsDepBO> list =  tsDepDAO.selectBatchIds(depIdList);
			Map<String,TsDepBO> map = EntityUtil.list2Map(list);

			tbFundBOs.forEach(tbFundBO -> {
				if(StringUtils.isNotEmpty( tbFundBO.getDepId())){
					TsDepBO temp = map.get( tbFundBO.getDepId() );
					if(temp != null){
							tbFundBO.setDepName(temp.getDepName());
					}
				}
			});
		}





		String[] dictTypes = new String[]{EnumDictType.FUND_DIRECTION.getVal(),EnumDictType.MANAG_TYPE.getVal(),EnumDictType.FUND_TYPE.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tbFundBOs.forEach(tbFundBO -> {
			if(StringUtils.isEmpty(tbFundBO.getFundDirectionName()) && StringUtils.isNotEmpty(tbFundBO.getFundDirection()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.FUND_DIRECTION.getVal() + tbFundBO.getFundDirection());
				if(dict != null) {
					tbFundBO.setFundDirectionName(dict.getDictName());
				}
			}
			if(StringUtils.isEmpty(tbFundBO.getManagTypeName()) && StringUtils.isNotEmpty(tbFundBO.getManagType()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.MANAG_TYPE.getVal() + tbFundBO.getManagType());
				if(dict != null) {
					tbFundBO.setManagTypeName(dict.getDictName());
				}
			}
			if(StringUtils.isEmpty(tbFundBO.getFundTypeName()) && StringUtils.isNotEmpty(tbFundBO.getFundType()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.FUND_TYPE.getVal() + tbFundBO.getFundType());
				if(dict != null) {
					tbFundBO.setFundTypeName(dict.getDictName());
				}
			}
		});
		return tbFundBOs;
	}


	@Override
	public void isExist(TbFundBO tbFundBO) {

		TbFundBO ckBO ;
		TbFundBO temp = null ;

			ckBO = new TbFundBO();
			ckBO.setId( tbFundBO.getId() );
				ckBO.setFundName(tbFundBO.getFundName());
				ckBO.setTenantId(tbFundBO.getTenantId());
			temp = this.selectCheck(ckBO);
			if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"    ");
			}

			ckBO = new TbFundBO();
			ckBO.setId( tbFundBO.getId() );
				ckBO.setFundCode(tbFundBO.getFundCode());
				ckBO.setTenantId(tbFundBO.getTenantId());
			temp = this.selectCheck(ckBO);
			if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"    ");
			}


	}





}