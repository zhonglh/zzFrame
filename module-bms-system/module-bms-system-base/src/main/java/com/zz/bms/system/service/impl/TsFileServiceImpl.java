package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.system.bo.TsFileBO;
import com.zz.bms.system.dao.TsFileDAO;
import com.zz.bms.system.service.TsFileService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 文件 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsFileServiceImpl extends BaseServiceImpl<TsFileBO,String> implements TsFileService {





	@Autowired
	private TsFileDAO tsFileDAO ;


	@Override
	public BaseDAO getDAO() {
		return tsFileDAO ;
	}


	@Override
	public void isExist(TsFileBO tsFileBO) {

		TsFileBO ckBO ;
		BaseEntity temp = null ;

		ckBO = new TsFileBO();
		ckBO.setId( tsFileBO.getId() );
		ckBO.setFilePath(tsFileBO.getFilePath());
		temp = this.selectCheck(ckBO);

		if (EntityUtil.isEntityExist(temp)) {
			throw DbException.DB_SAVE_SAME;
		}
	}

	@Override
	public TsFileBO processResult(TsFileBO tsFileBO) {

            //todo 处理字典信息

		return tsFileBO;

	}


}