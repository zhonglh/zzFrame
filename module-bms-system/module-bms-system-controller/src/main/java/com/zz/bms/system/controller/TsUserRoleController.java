package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.TsUserRoleBO;
import  com.zz.bms.system.query.impl.TsUserRoleQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 用户角色关联 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/userrole")
@Controller
public class TsUserRoleController extends DefaultController<TsUserRoleBO, String , TsUserRoleQueryWebImpl> {



	@Override
	protected boolean isExist(TsUserRoleBO tsUserRoleBO) {

		TsUserRoleBO ckBO ;
		boolean isExist = false;
		TsUserRoleBO temp = null ;

		ckBO = new TsUserRoleBO();
		ckBO.setId( tsUserRoleBO.getId() );
        ckBO.setRoleId(tsUserRoleBO.getRoleId());
        ckBO.setUserId(tsUserRoleBO.getUserId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
