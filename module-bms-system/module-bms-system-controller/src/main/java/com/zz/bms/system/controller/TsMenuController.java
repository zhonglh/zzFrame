package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.TsMenuBO;
import  com.zz.bms.system.query.impl.TsMenuQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 菜单 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/menu")
@Controller
public class TsMenuController extends DefaultController<TsMenuBO, String , TsMenuQueryWebImpl> {



	@Override
	protected boolean isExist(TsMenuBO tsMenuBO) {

		TsMenuBO ckBO ;
		boolean isExist = false;
		TsMenuBO temp = null ;

		ckBO = new TsMenuBO();
		ckBO.setId( tsMenuBO.getId() );
        ckBO.setMenuCode(tsMenuBO.getMenuCode());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
