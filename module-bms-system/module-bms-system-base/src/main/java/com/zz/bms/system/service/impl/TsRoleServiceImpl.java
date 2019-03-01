package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.enums.EnumDictType;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.TsRoleBO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.system.dao.TsRoleDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.TsRoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 角色 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:25:13
 */
@Service
public class TsRoleServiceImpl extends SystemBaseServiceImpl<TsRoleBO,String> implements TsRoleService {



	@Autowired
	private TsDictService tsDictService;



	@Autowired
	private TsDepDAO tsDepDAO;


	@Autowired
	private TsRoleDAO tsRoleDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsRoleDAO ;
	}



	@Override
	public TsRoleBO processResult(TsRoleBO tsRoleBO) {


		if(StringUtils.isNotEmpty( tsRoleBO.getDepId())){
			TsDepBO temp = tsDepDAO.selectById( tsRoleBO.getDepId() );
			if(temp != null){
				tsRoleBO.setDepName(temp.getDepName());
			}
		}
		try {
			if(StringUtils.isEmpty(tsRoleBO.getRoleStatusName()) && StringUtils.isNotEmpty(tsRoleBO.getRoleStatus()) ) {
				String dictName = tsDictService.getDictName(tsRoleBO.getRoleStatus(),EnumDictType.ROLE_STATUS.getVal());
				tsRoleBO.setRoleStatusName(dictName);
			}
		}catch(Exception e){

		}
		try {
			if(StringUtils.isEmpty(tsRoleBO.getRoleTypeName()) && StringUtils.isNotEmpty(tsRoleBO.getRoleType()) ) {
				String dictName = tsDictService.getDictName(tsRoleBO.getRoleType(),EnumDictType.ROLE_TYPE.getVal());
				tsRoleBO.setRoleTypeName(dictName);
			}
		}catch(Exception e){

		}

		return tsRoleBO;

	}





	@Override
	public List<TsRoleBO> processResult(List<TsRoleBO> tsRoleBOs) {
		if(tsRoleBOs == null || tsRoleBOs.isEmpty()){
			return tsRoleBOs;
		}

		List<String> depIdList = new ArrayList<String>();

		for(TsRoleBO bo : tsRoleBOs)		{

			if(StringUtils.isNotEmpty( bo.getDepId())){
				depIdList.add(bo.getDepId());
			}
		}


		if(!depIdList.isEmpty()){
			List<TsDepBO> list =  tsDepDAO.selectBatchIds(depIdList);
			Map<String,TsDepBO> map = EntityUtil.list2Map(list);

			tsRoleBOs.forEach(tsRoleBO -> {
				if(StringUtils.isNotEmpty( tsRoleBO.getDepId())){
					TsDepBO temp = map.get( tsRoleBO.getDepId() );
					if(temp != null){
						tsRoleBO.setDepName(temp.getDepName());
					}
				}
			});
		}





		String[] dictTypes = new String[]{EnumDictType.ROLE_STATUS.getVal(),EnumDictType.ROLE_TYPE.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tsRoleBOs.forEach(tsRoleBO -> {
			if(StringUtils.isEmpty(tsRoleBO.getRoleStatusName()) && StringUtils.isNotEmpty(tsRoleBO.getRoleStatus()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.ROLE_STATUS.getVal() + tsRoleBO.getRoleStatus());
				if(dict != null) {
					tsRoleBO.setRoleStatusName(dict.getDictName());
				}
			}
			if(StringUtils.isEmpty(tsRoleBO.getRoleTypeName()) && StringUtils.isNotEmpty(tsRoleBO.getRoleType()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.ROLE_TYPE.getVal() + tsRoleBO.getRoleType());
				if(dict != null) {
					tsRoleBO.setRoleTypeName(dict.getDictName());
				}
			}
		});



		return tsRoleBOs;
	}




	@Override
	public void isExist(TsRoleBO tsRoleBO) {

		TsRoleBO ckBO ;
		TsRoleBO temp = null ;

		ckBO = new TsRoleBO();
		ckBO.setId( tsRoleBO.getId() );
		ckBO.setRoleName(tsRoleBO.getRoleName());
		ckBO.setTenantId(tsRoleBO.getTenantId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"    ");
		}

		ckBO = new TsRoleBO();
		ckBO.setId( tsRoleBO.getId() );
		ckBO.setRoleCode(tsRoleBO.getRoleCode());
		ckBO.setTenantId(tsRoleBO.getTenantId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"    ");
		}


	}


}