package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.system.service.TsDepService;

import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;
import com.zz.bms.system.bo.TsOrganBO;
import com.zz.bms.system.dao.TsOrganDAO;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 部门 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@Service
public class TsDepServiceImpl extends BaseServiceImpl<TsDepBO,String> implements TsDepService {



    @Autowired
    private TsUserDAO tsUserDAO;
    @Autowired
    private TsTenantDAO tsTenantDAO;
    @Autowired
    private TsOrganDAO tsOrganDAO;


	@Autowired
	private TsDepDAO tsDepDAO ;

	@Override
	public BaseDAO getDAO() {
		return tsDepDAO ;
	}



	@Override
	public void isExist(TsDepBO tsDepBO) {
		TsDepBO ckBO ;
		TsDepBO temp = null ;

		ckBO = new TsDepBO();
		ckBO.setId( tsDepBO.getId() );
		ckBO.setDepCode(tsDepBO.getDepCode());
		ckBO.setOrganId(tsDepBO.getOrganId());
		temp = this.selectCheck(ckBO);

		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该部门编号已使用");
		}

		ckBO = new TsDepBO();
		ckBO.setId( tsDepBO.getId() );
		ckBO.setDepName(tsDepBO.getDepName());
		ckBO.setOrganId(tsDepBO.getOrganId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该部门名称已使用");
		}
	}

	@Override
	public TsDepBO processResult(TsDepBO tsDepBO) {

        if(StringUtils.isNotEmpty(tsDepBO.getLeadUserId())){
			TsUserBO tsUserBO = tsUserDAO.selectById(tsDepBO.getLeadUserId());
			if(tsUserBO != null){
				tsDepBO.setLeadUserName(tsUserBO.getUserName());
			}
		}


		if(StringUtils.isNotEmpty(tsDepBO.getPid())){
			TsDepBO parentDep = tsDepDAO.selectById(tsDepBO.getPid());
			if(parentDep != null){
				tsDepBO.setPname(parentDep.getDepName());
			}
		}

		return tsDepBO;

	}


}