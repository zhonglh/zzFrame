package com.zz.bms.system.service.impl;

import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.enums.*;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.VsFileUseBO;
import com.zz.bms.system.dao.VsFileUseDAO;
import com.zz.bms.system.dao.TsFileUseDAO;
import com.zz.bms.system.service.VsFileUseService;



import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文件使用 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:45:43
 */
@Service
public class VsFileUseServiceImpl extends BaseServiceImpl<VsFileUseBO,String> implements VsFileUseService {



	@Autowired
	private TsDictService tsDictService;





	@Autowired
	private VsFileUseDAO vsFileUseDAO ;



	@Override
	public BaseDAO getDAO() {
		return vsFileUseDAO ;
	}



	@Override
	public VsFileUseBO processResult(VsFileUseBO vsFileUseBO) {



		return vsFileUseBO;

	}





	@Override
	public List<VsFileUseBO> processResult(List<VsFileUseBO> vsFileUseBOs) {
		if(vsFileUseBOs == null || vsFileUseBOs.isEmpty()){
			return vsFileUseBOs;
		}

		return vsFileUseBOs;
	}




	@Override
	public void isExist(VsFileUseBO vsFileUseBO) {
	}


}