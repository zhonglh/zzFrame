package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.TsMenuPermitBO;
import  com.zz.bms.system.query.impl.TsMenuPermitQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 菜单许可关联 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/menupermit")
@Controller
public class TsMenuPermitController extends ZzDefaultController<TsMenuPermitBO, String , TsMenuPermitQueryWebImpl> {



	@Override
	protected boolean isExist(TsMenuPermitBO tsMenuPermitBO) {

		TsMenuPermitBO ckBO ;
		boolean isExist = false;
		TsMenuPermitBO temp = null ;

		ckBO = new TsMenuPermitBO();
		ckBO.setId( tsMenuPermitBO.getId() );
        ckBO.setMenuId(tsMenuPermitBO.getMenuId());
        ckBO.setPermitId(tsMenuPermitBO.getPermitId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
