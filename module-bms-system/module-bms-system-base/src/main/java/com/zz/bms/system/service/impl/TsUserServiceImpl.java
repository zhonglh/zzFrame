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
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.service.TsUserService;

import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.dao.TsDepDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:45:43
 */
@Service
public class TsUserServiceImpl extends BaseServiceImpl<TsUserBO,String> implements TsUserService {



	@Autowired
	private TsDictService tsDictService;



	@Autowired
	private TsDepDAO tsDepDAO;


	@Autowired
	private TsUserDAO tsUserDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsUserDAO ;
	}



	@Override
	public TsUserBO processResult(TsUserBO tsUserBO) {


		if(StringUtils.isNotEmpty( tsUserBO.getLeadUserId())){
			TsUserBO temp = tsUserDAO.selectById( tsUserBO.getLeadUserId() );
			if(temp != null){
				tsUserBO.setLeadUserName(temp.getUserName());
			}
		}
		try {
			if(StringUtils.isEmpty(tsUserBO.getSystemAdminName()) && StringUtils.isNotEmpty(tsUserBO.getSystemAdmin()) ) {
				String dictName = tsDictService.getDictName(tsUserBO.getSystemAdmin(),EnumDictType.YES_NO.getVal());
				tsUserBO.setSystemAdminName(dictName);
			}
		}catch(Exception e){

		}
		try {
			if(StringUtils.isEmpty(tsUserBO.getUserStatusName()) && StringUtils.isNotEmpty(tsUserBO.getUserStatus()) ) {
				String dictName = tsDictService.getDictName(tsUserBO.getUserStatus(),EnumDictType.USER_STATUS.getVal());
				tsUserBO.setUserStatusName(dictName);
			}
		}catch(Exception e){

		}

		if(StringUtils.isNotEmpty( tsUserBO.getDepId())){
			TsDepBO temp = tsDepDAO.selectById( tsUserBO.getDepId() );
			if(temp != null){
				tsUserBO.setDepName(temp.getDepName());
			}
		}

		return tsUserBO;

	}





	@Override
	public List<TsUserBO> processResult(List<TsUserBO> tsUserBOs) {
		if(tsUserBOs == null || tsUserBOs.isEmpty()){
			return tsUserBOs;
		}

		List<String> leadUserIdList = new ArrayList<String>();
		List<String> depIdList = new ArrayList<String>();

		for(TsUserBO bo : tsUserBOs)		{

			if(StringUtils.isNotEmpty( bo.getLeadUserId())){
				leadUserIdList.add(bo.getLeadUserId());
			}
			if(StringUtils.isNotEmpty( bo.getDepId())){
				depIdList.add(bo.getDepId());
			}
		}


		if(!leadUserIdList.isEmpty()){
			List<TsUserBO> list =  tsUserDAO.selectBatchIds(leadUserIdList);
			Map<String,TsUserBO> map = EntityUtil.list2Map(list);

			tsUserBOs.forEach(tsUserBO -> {
				if(StringUtils.isNotEmpty( tsUserBO.getLeadUserId())){
					TsUserBO temp = map.get( tsUserBO.getLeadUserId() );
					if(temp != null){
						tsUserBO.setLeadUserName(temp.getUserName());
					}
				}
			});
		}

		if(!depIdList.isEmpty()){
			List<TsDepBO> list =  tsDepDAO.selectBatchIds(depIdList);
			Map<String,TsDepBO> map = EntityUtil.list2Map(list);

			tsUserBOs.forEach(tsUserBO -> {
				if(StringUtils.isNotEmpty( tsUserBO.getDepId())){
					TsDepBO temp = map.get( tsUserBO.getDepId() );
					if(temp != null){
						tsUserBO.setDepName(temp.getDepName());
					}
				}
			});
		}





		String[] dictTypes = new String[]{EnumDictType.USER_STATUS.getVal(),EnumDictType.YES_NO.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tsUserBOs.forEach(tsUserBO -> {
			if(StringUtils.isEmpty(tsUserBO.getUserStatusName()) && StringUtils.isNotEmpty(tsUserBO.getUserStatus()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.USER_STATUS.getVal() + tsUserBO.getUserStatus());
				if(dict != null) {
					tsUserBO.setUserStatusName(dict.getDictName());
				}
			}
			if(StringUtils.isEmpty(tsUserBO.getSystemAdminName()) && StringUtils.isNotEmpty(tsUserBO.getSystemAdmin()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.YES_NO.getVal() + tsUserBO.getSystemAdmin());
				if(dict != null) {
					tsUserBO.setSystemAdminName(dict.getDictName());
				}
			}
		});



		return tsUserBOs;
	}




	@Override
	public void isExist(TsUserBO tsUserBO) {

		TsUserBO ckBO ;
		TsUserBO temp = null ;

		ckBO = new TsUserBO();
		ckBO.setId( tsUserBO.getId() );
		ckBO.setEmail(tsUserBO.getEmail());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该邮箱已经使用");
		}

		ckBO = new TsUserBO();
		ckBO.setId( tsUserBO.getId() );
		ckBO.setLoginName(tsUserBO.getLoginName());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该登陆名已经使用");
		}

		ckBO = new TsUserBO();
		ckBO.setId( tsUserBO.getId() );
		ckBO.setPhone(tsUserBO.getPhone());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"该电话已经使用");
		}


	}


}