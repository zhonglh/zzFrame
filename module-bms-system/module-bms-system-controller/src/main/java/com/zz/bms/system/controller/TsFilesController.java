package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.TsFilesBO;
import  com.zz.bms.system.query.impl.TsFilesQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/files")
@Controller
public class TsFilesController extends ZzDefaultController<TsFilesBO, String , TsFilesQueryWebImpl> {



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
