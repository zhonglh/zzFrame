package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.system.bo.TsDictTypeBO;
import  com.zz.bms.system.query.impl.TsDictTypeQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 字典类型 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/dicttype")
@Controller
public class TsDictTypeController extends ZzDefaultController<TsDictTypeBO, String , TsDictTypeQueryWebImpl> {



	@Override
	protected void isExist(TsDictTypeBO tsDictTypeBO) {

		TsDictTypeBO ckBO ;
		TsDictTypeBO temp = null ;

		ckBO = new TsDictTypeBO();
		ckBO.setId( tsDictTypeBO.getId() );
        ckBO.setDictTypeCode(tsDictTypeBO.getDictTypeCode());
        temp = this.baseService.selectCheck(ckBO);
		if (isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该编号已使用");
		}

		ckBO = new TsDictTypeBO();
		ckBO.setId( tsDictTypeBO.getId() );
        ckBO.setDictTypeName(tsDictTypeBO.getDictTypeName());
        temp = this.baseService.selectCheck(ckBO);
		if (isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该名称已使用");
		}

	}




}
