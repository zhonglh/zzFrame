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
import com.zz.bms.system.bo.TsFileBO;
import com.zz.bms.system.dao.TsFileDAO;
import com.zz.bms.system.service.TsFileService;



import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文件 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:25:13
 */
@Service
public class TsFileServiceImpl extends BaseServiceImpl<TsFileBO,String> implements TsFileService {



	@Autowired
	private TsDictService tsDictService;





	@Autowired
	private TsFileDAO tsFileDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsFileDAO ;
	}



	@Override
	public TsFileBO processResult(TsFileBO tsFileBO) {

		try {
			if(StringUtils.isEmpty(tsFileBO.getFileEngineName()) && StringUtils.isNotEmpty(tsFileBO.getFileEngine()) ) {
				String dictName = tsDictService.getDictName(tsFileBO.getFileEngine(),EnumDictType.FILE_ENGINE.getVal());
				tsFileBO.setFileEngineName(dictName);
			}
		}catch(Exception e){

		}

		return tsFileBO;

	}





	@Override
	public List<TsFileBO> processResult(List<TsFileBO> tsFileBOs) {
		if(tsFileBOs == null || tsFileBOs.isEmpty()){
			return tsFileBOs;
		}


		String[] dictTypes = new String[]{EnumDictType.FILE_ENGINE.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tsFileBOs.forEach(tsFileBO -> {
			if(StringUtils.isEmpty(tsFileBO.getFileEngineName()) && StringUtils.isNotEmpty(tsFileBO.getFileEngine()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.FILE_ENGINE.getVal() + tsFileBO.getFileEngine());
				if(dict != null) {
					tsFileBO.setFileEngineName(dict.getDictName());
				}
			}
		});



		return tsFileBOs;
	}




	@Override
	public void isExist(TsFileBO tsFileBO) {
	}


}