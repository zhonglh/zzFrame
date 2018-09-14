package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


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
	protected boolean isExist(TsPermitBO tsPermitBO) {

		TsPermitBO ckBO ;
		boolean isExist = false;
		TsPermitBO temp = null ;

		ckBO = new TsPermitBO();
		ckBO.setId( tsPermitBO.getId() );
        ckBO.setPermitCode(tsPermitBO.getPermitCode());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
