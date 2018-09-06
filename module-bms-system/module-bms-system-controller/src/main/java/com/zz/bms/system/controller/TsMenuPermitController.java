package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.TsMenuPermitBO;
import  com.zz.bms.system.query.impl.TsMenuPermitQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 菜单许可关联 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/menupermit")
@Controller
public class TsMenuPermitController extends DefaultController<TsMenuPermitBO, String , TsMenuPermitQueryWebImpl> {



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
