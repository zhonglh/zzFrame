package com.zz.bms.system.controller;


import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.system.bo.TsPermitBO;
import  com.zz.bms.system.query.impl.TsPermitQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 许可 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/permit")
@Controller
public class TsPermitController extends ZzDefaultController<TsPermitBO, String , TsPermitQueryWebImpl> {



	@Override
	protected void isExist(TsPermitBO tsPermitBO) {

		TsPermitBO ckBO ;
		TsPermitBO temp = null ;

		ckBO = new TsPermitBO();
		ckBO.setId( tsPermitBO.getId() );
        ckBO.setPermitCode(tsPermitBO.getPermitCode());
        temp = this.baseService.selectCheck(ckBO);
		if (isEntityExist(temp)) {
			throw DbException.DB_SAVE_SAME;
		}
	}




}
