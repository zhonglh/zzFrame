package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.VsUserBO;
import  com.zz.bms.system.query.impl.VsUserQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 用户 控制层
* @author Administrator
* @date 2018-9-6 22:28:16
 */
@RequestMapping("/system/user")
@Controller
public class VsUserController extends DefaultController<VsUserBO, String , VsUserQueryWebImpl> {



	@Override
	protected boolean isExist(VsUserBO vsUserBO) {

		VsUserBO ckBO ;
		boolean isExist = false;
		VsUserBO temp = null ;

		ckBO = new VsUserBO();
		ckBO.setId( vsUserBO.getId() );
        ckBO.setLoginName(vsUserBO.getLoginName());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
