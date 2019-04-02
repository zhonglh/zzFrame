package com.zz.bms.system.service.impl;

import.com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;

import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.VsFileUseBO;
import com.zz.bms.system.dao.VsFileUseDAO;
import com.zz.bms.system.dao.TsFileUseDAO;
import com.zz.bms.system.service.VsFileUseService;



import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 文件使用 ServiceImpl
* @author Administrator
* @date 2019-4-1 14:23:12
*/
@Service
public class VsFileUseServiceImpl extends BaseServiceImpl<VsFileUseBO,String> implements VsFileUseService {



	@Autowired
	private TsDictService tsDictService;




	@Override
	protected void isExist(VsFileUseBO vsFileUseBO) {
	}




    @Autowired
    private VsFileUseDAO vsFileUseDAO ;

    @Autowired
    private TsFileUseDAO tsFileUseDAO ;


    @Override
    public BaseDAO getQueryDAO() {
    	return vsFileUseDAO ;
    }

    @Override
    public BaseDAO getRwDAO() {
		return tsFileUseDAO ;
    }



	@Override
	public VsFileUseBO processResult(VsFileUseBO vsFileUseBO) {

            try {
				if(StringUtils.isEmpty(vsFileUseBO.getBusinessTypeName()) && StringUtils.isNotEmpty(vsFileUseBO.getBusinessType()) ) {
					String dictName = tsDictService.getDictName(vsFileUseBO.getBusinessType(), "business_type");
					vsFileUseBO.setBusinessTypeName(dictName);
            	}
            }catch(Exception e){

            }
            try {
				if(StringUtils.isEmpty(vsFileUseBO.getFileEngineName()) && StringUtils.isNotEmpty(vsFileUseBO.getFileEngine()) ) {
					String dictName = tsDictService.getDictName(vsFileUseBO.getFileEngine(), "file_engine");
					vsFileUseBO.setFileEngineName(dictName);
            	}
            }catch(Exception e){

            }

		return vsFileUseBO;

	}


}