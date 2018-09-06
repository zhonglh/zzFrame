package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.TsTenantBO;
import  com.zz.bms.system.query.impl.TsTenantQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 租户 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/tenant")
@Controller
public class TsTenantController extends DefaultController<TsTenantBO, String , TsTenantQueryWebImpl> {



	@Override
	protected boolean isExist(TsTenantBO tsTenantBO) {

		TsTenantBO ckBO ;
		boolean isExist = false;
		TsTenantBO temp = null ;

		ckBO = new TsTenantBO();
		ckBO.setId( tsTenantBO.getId() );
        ckBO.setTenantName(tsTenantBO.getTenantName());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}
		ckBO = new TsTenantBO();
		ckBO.setId( tsTenantBO.getId() );
        ckBO.setTenantCode(tsTenantBO.getTenantCode());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
