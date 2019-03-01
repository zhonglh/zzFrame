package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.enums.EnumDictType;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.TsOrganBO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsOrganDAO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.TsOrganService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 机构 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:25:12
 */
@Service
public class TsOrganServiceImpl extends SystemBaseServiceImpl<TsOrganBO,String> implements TsOrganService {



	@Autowired
	private TsDictService tsDictService;



	@Autowired
	private TsUserDAO tsUserDAO;


	@Autowired
	private TsOrganDAO tsOrganDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsOrganDAO ;
	}



	@Override
	public TsOrganBO processResult(TsOrganBO tsOrganBO) {

		try {
			if(StringUtils.isEmpty(tsOrganBO.getOrganTypeName()) && StringUtils.isNotEmpty(tsOrganBO.getOrganType()) ) {
				String dictName = tsDictService.getDictName(tsOrganBO.getOrganType(),EnumDictType.ORGAN_TYPE.getVal());
				tsOrganBO.setOrganTypeName(dictName);
			}
		}catch(Exception e){

		}


		try {
			if(StringUtils.isEmpty(tsOrganBO.getOrganStatusName()) && StringUtils.isNotEmpty(tsOrganBO.getOrganStatus()) ) {
				String dictName = tsDictService.getDictName(tsOrganBO.getOrganStatus(),EnumDictType.ORGAN_STATUS.getVal());
				tsOrganBO.setOrganStatusName(dictName);
			}
		}catch(Exception e){

		}

		if(StringUtils.isNotEmpty( tsOrganBO.getLeadUserId())){
			TsUserBO temp = tsUserDAO.selectById( tsOrganBO.getLeadUserId() );
			if(temp != null){
				tsOrganBO.setLeadUserName(temp.getUserName());
			}
		}


		if(StringUtils.isNotEmpty(tsOrganBO.getPid())){
			TsOrganBO temp = tsOrganDAO.selectById(tsOrganBO.getPid());
			if(temp != null){
				tsOrganBO.setPname(temp.getOrganName());
			}
		}

		return tsOrganBO;

	}





	@Override
	public List<TsOrganBO> processResult(List<TsOrganBO> tsOrganBOs) {
		if(tsOrganBOs == null || tsOrganBOs.isEmpty()){
			return tsOrganBOs;
		}

		List<String> leadUserIdList = new ArrayList<String>();
		List<String> pidList = new ArrayList<String>();

		for(TsOrganBO bo : tsOrganBOs)		{

			if(StringUtils.isNotEmpty( bo.getLeadUserId())){
				leadUserIdList.add(bo.getLeadUserId());
			}

			if(StringUtils.isNotEmpty( bo.getPid())){
				pidList.add(bo.getPid());
			}
		}


		if(!leadUserIdList.isEmpty()){
			List<TsUserBO> list =  tsUserDAO.selectBatchIds(leadUserIdList);
			Map<String,TsUserBO> map = EntityUtil.list2Map(list);

			tsOrganBOs.forEach(tsOrganBO -> {
				if(StringUtils.isNotEmpty( tsOrganBO.getLeadUserId())){
					TsUserBO temp = map.get( tsOrganBO.getLeadUserId() );
					if(temp != null){
						tsOrganBO.setLeadUserName(temp.getUserName());
					}
				}
			});
		}


		if(!pidList.isEmpty()){
			List<TsOrganBO> list =  tsOrganDAO.selectBatchIds(pidList);
			Map<String,TsOrganBO> map = EntityUtil.list2Map(list);

			tsOrganBOs.forEach(tsOrganBO -> {
				if(StringUtils.isNotEmpty( tsOrganBO.getPid())){
					TsOrganBO temp = map.get( tsOrganBO.getPid() );
					if(temp != null){
						tsOrganBO.setPname(temp.getOrganName());
					}
				}
			});
		}



		String[] dictTypes = new String[]{EnumDictType.ORGAN_TYPE.getVal(),EnumDictType.ORGAN_STATUS.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tsOrganBOs.forEach(tsOrganBO -> {
			if(StringUtils.isEmpty(tsOrganBO.getOrganTypeName()) && StringUtils.isNotEmpty(tsOrganBO.getOrganType()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.ORGAN_TYPE.getVal() + tsOrganBO.getOrganType());
				if(dict != null) {
					tsOrganBO.setOrganTypeName(dict.getDictName());
				}
			}

			if(StringUtils.isEmpty(tsOrganBO.getOrganStatusName()) && StringUtils.isNotEmpty(tsOrganBO.getOrganStatus()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.ORGAN_STATUS.getVal() + tsOrganBO.getOrganStatus());
				if(dict != null) {
					tsOrganBO.setOrganStatusName(dict.getDictName());
				}
			}
		});



		return tsOrganBOs;
	}




	@Override
	public void isExist(TsOrganBO tsOrganBO) {

		TsOrganBO ckBO ;
		TsOrganBO temp = null ;

		ckBO = new TsOrganBO();
		ckBO.setId( tsOrganBO.getId() );
		ckBO.setOrganName(tsOrganBO.getOrganName());
		ckBO.setTenantId(tsOrganBO.getTenantId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"机构名称已使用");
		}

		ckBO = new TsOrganBO();
		ckBO.setId( tsOrganBO.getId() );
		ckBO.setOrganCode(tsOrganBO.getOrganCode());
		ckBO.setTenantId(tsOrganBO.getTenantId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"机构编号已使用");
		}


	}


}