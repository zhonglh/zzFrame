package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.TsDictTypeBO;
import  com.zz.bms.system.query.impl.TsDictTypeQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 字典类型 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/dicttype")
@Controller
public class TsDictTypeController extends DefaultController<TsDictTypeBO, String , TsDictTypeQueryWebImpl> {



	@Override
	protected boolean isExist(TsDictTypeBO tsDictTypeBO) {

		TsDictTypeBO ckBO ;
		boolean isExist = false;
		TsDictTypeBO temp = null ;

		ckBO = new TsDictTypeBO();
		ckBO.setId( tsDictTypeBO.getId() );
        ckBO.setDictTypeCode(tsDictTypeBO.getDictTypeCode());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}
		ckBO = new TsDictTypeBO();
		ckBO.setId( tsDictTypeBO.getId() );
        ckBO.setDictTypeName(tsDictTypeBO.getDictTypeName());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
