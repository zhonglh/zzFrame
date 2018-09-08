package com.zz.bms.system.service.impl;

import com.zz.bms.core.IUserService;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.system.bo.*;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.query.TsUserQuery;
import com.zz.bms.system.query.VsFilesUseQuery;
import com.zz.bms.system.query.impl.TsUserQueryImpl;
import com.zz.bms.system.query.impl.VsFilesUseQueryImpl;
import com.zz.bms.system.service.TsFilesUseService;
import com.zz.bms.system.service.TsUserService;

import com.zz.bms.system.dao.TsOrganDAO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;

import com.zz.bms.system.service.VsFilesUseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 用户 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsUserServiceImpl extends BaseServiceImpl<TsUserBO,String> implements TsUserService {



    @Autowired
    private TsOrganDAO tsOrganDAO;
    @Autowired
    private TsDepDAO tsDepDAO;
    @Autowired
    private TsTenantDAO tsTenantDAO;

	//@Autowired
    //private VsFilesUseService filesUseService;


	@Autowired
	private TsUserDAO tsUserDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsUserDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsUserDAO ;
	}


	@Override
	public TsUserBO processResult(TsUserBO tsUserBO) {

            //todo 处理字典信息
            //todo 处理字典信息
		/*
		if(StringUtils.isNotEmpty(tsUserBO.getAvatarImage())){
			VsFilesUseQuery vsFilesUseQuery = new VsFilesUseQueryImpl();
			vsFilesUseQuery.businessTmpId(tsUserBO.getAvatarImage());
			List<VsFilesUseBO> vsFilesUseBOList = filesUseService.selectList(vsFilesUseQuery.buildWrapper().orderBy("file_order"));
			if(vsFilesUseBOList != null && vsFilesUseBOList.size() > 0){
				tsUserBO.setAvatarImageUrl(vsFilesUseBOList.get(0).getAccessUrl());
			}
		}
		*/
		return tsUserBO;

	}


}