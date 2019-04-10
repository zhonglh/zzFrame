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
import com.zz.bms.system.bo.TsDictTypeBO;
import com.zz.bms.system.dao.TsDictTypeDAO;
import com.zz.bms.system.service.TsDictTypeService;

import com.zz.bms.system.bo.TsDictTypeBO;
import com.zz.bms.system.dao.TsDictTypeDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 字典类型 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:25:14
 */
@Service
public class TsDictTypeServiceImpl extends BaseServiceImpl<TsDictTypeBO,String> implements TsDictTypeService {



	@Autowired
	private TsDictService tsDictService;





	@Autowired
	private TsDictTypeDAO tsDictTypeDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsDictTypeDAO ;
	}







	@Override
	public void isExist(TsDictTypeBO tsDictTypeBO) {

		TsDictTypeBO ckBO ;
		TsDictTypeBO temp = null ;

		ckBO = new TsDictTypeBO();
		ckBO.setId( tsDictTypeBO.getId() );
		ckBO.setDictTypeName(tsDictTypeBO.getDictTypeName());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"字典类型名称已经使用");
		}

		ckBO = new TsDictTypeBO();
		ckBO.setId( tsDictTypeBO.getId() );
		ckBO.setDictTypeCode(tsDictTypeBO.getDictTypeCode());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"字典类型编码已经使用");
		}


	}


}