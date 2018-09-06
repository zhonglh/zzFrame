package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.TsRolePermitBO;
import  com.zz.bms.system.query.impl.TsRolePermitQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 角色许可关联 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/rolepermit")
@Controller
public class TsRolePermitController extends DefaultController<TsRolePermitBO, String , TsRolePermitQueryWebImpl> {



	@Override
	protected boolean isExist(TsRolePermitBO tsRolePermitBO) {

		TsRolePermitBO ckBO ;
		boolean isExist = false;
		TsRolePermitBO temp = null ;

		ckBO = new TsRolePermitBO();
		ckBO.setId( tsRolePermitBO.getId() );
        ckBO.setPermitId(tsRolePermitBO.getPermitId());
        ckBO.setRoleId(tsRolePermitBO.getRoleId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
