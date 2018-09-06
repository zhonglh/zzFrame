package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.TsFilesBO;
import  com.zz.bms.system.query.impl.TsFilesQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 文件 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/files")
@Controller
public class TsFilesController extends DefaultController<TsFilesBO, String , TsFilesQueryWebImpl> {



	@Override
	protected boolean isExist(TsFilesBO tsFilesBO) {

		TsFilesBO ckBO ;
		boolean isExist = false;
		TsFilesBO temp = null ;

		ckBO = new TsFilesBO();
		ckBO.setId( tsFilesBO.getId() );
        ckBO.setFilePath(tsFilesBO.getFilePath());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
