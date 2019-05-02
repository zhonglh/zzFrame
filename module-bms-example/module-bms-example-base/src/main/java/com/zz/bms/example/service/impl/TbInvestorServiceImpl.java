package com.zz.bms.example.service.impl;

import com.zz.bms.enums.*;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.example.bo.TbInvestorBO;
import com.zz.bms.example.dao.TbInvestorDAO;
import com.zz.bms.example.service.TbInvestorService;



import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* 投资人 ServiceImpl
* @author Administrator
* @date 2019-5-1 17:49:22
*/
@Service
public class TbInvestorServiceImpl extends BaseServiceImpl<TbInvestorBO,String> implements TbInvestorService {



	@Autowired
	private TsDictService tsDictService;





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
		try {
			if(StringUtils.isEmpty(tbInvestorBO.getCardTypeName()) && StringUtils.isNotEmpty(tbInvestorBO.getCardType()) ) {
				String dictName = tsDictService.getDictName(tbInvestorBO.getCardType(),EnumDictType.CARD_TYPE.getVal());
				tbInvestorBO.setCardTypeName(dictName);
			}
		}catch(Exception e){

		}

		return tbInvestorBO;

	}





	@Override
	public List<TbInvestorBO> processResult(List<TbInvestorBO> tbInvestorBOs) {
		if(tbInvestorBOs == null || tbInvestorBOs.isEmpty()){
			return tbInvestorBOs;
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