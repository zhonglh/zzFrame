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
import com.zz.bms.system.bo.TsMenuPermitBO;
import com.zz.bms.system.dao.TsMenuPermitDAO;
import com.zz.bms.system.service.TsMenuPermitService;

import com.zz.bms.system.bo.TsMenuBO;
import com.zz.bms.system.dao.TsMenuDAO;
import com.zz.bms.system.bo.TsPermitBO;
import com.zz.bms.system.dao.TsPermitDAO;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 菜单许可关联 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:25:12
 */
@Service
public class TsMenuPermitServiceImpl extends BaseServiceImpl<TsMenuPermitBO,String> implements TsMenuPermitService {



	@Autowired
	private TsDictService tsDictService;



	@Autowired
	private TsMenuDAO tsMenuDAO;
	@Autowired
	private TsPermitDAO tsPermitDAO;


	@Autowired
	private TsMenuPermitDAO tsMenuPermitDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsMenuPermitDAO ;
	}



	@Override
	public TsMenuPermitBO processResult(TsMenuPermitBO tsMenuPermitBO) {


		if(StringUtils.isNotEmpty( tsMenuPermitBO.getMenuId())){
			TsMenuBO temp = tsMenuDAO.selectById( tsMenuPermitBO.getMenuId() );
			if(temp != null){
				tsMenuPermitBO.setMenuName(temp.getMenuName());
			}
		}

		if(StringUtils.isNotEmpty( tsMenuPermitBO.getPermitId())){
			TsPermitBO temp = tsPermitDAO.selectById( tsMenuPermitBO.getPermitId() );
			if(temp != null){
				tsMenuPermitBO.setPermitName(temp.getPermitName());
			}
		}

		return tsMenuPermitBO;

	}





	@Override
	public List<TsMenuPermitBO> processResult(List<TsMenuPermitBO> tsMenuPermitBOs) {
		if(tsMenuPermitBOs == null || tsMenuPermitBOs.isEmpty()){
			return tsMenuPermitBOs;
		}

		List<String> menuIdList = new ArrayList<String>();
		List<String> permitIdList = new ArrayList<String>();

		for(TsMenuPermitBO bo : tsMenuPermitBOs)		{

			if(StringUtils.isNotEmpty( bo.getMenuId())){
				menuIdList.add(bo.getMenuId());
			}
			if(StringUtils.isNotEmpty( bo.getPermitId())){
				permitIdList.add(bo.getPermitId());
			}
		}


		if(!menuIdList.isEmpty()){
			List<TsMenuBO> list =  tsMenuDAO.selectBatchIds(menuIdList);
			Map<String,TsMenuBO> map = EntityUtil.list2Map(list);

			tsMenuPermitBOs.forEach(tsMenuPermitBO -> {
				if(StringUtils.isNotEmpty( tsMenuPermitBO.getMenuId())){
					TsMenuBO temp = map.get( tsMenuPermitBO.getMenuId() );
					if(temp != null){
						tsMenuPermitBO.setMenuName(temp.getMenuName());
					}
				}
			});
		}

		if(!permitIdList.isEmpty()){
			List<TsPermitBO> list =  tsPermitDAO.selectBatchIds(permitIdList);
			Map<String,TsPermitBO> map = EntityUtil.list2Map(list);

			tsMenuPermitBOs.forEach(tsMenuPermitBO -> {
				if(StringUtils.isNotEmpty( tsMenuPermitBO.getPermitId())){
					TsPermitBO temp = map.get( tsMenuPermitBO.getPermitId() );
					if(temp != null){
						tsMenuPermitBO.setPermitName(temp.getPermitName());
					}
				}
			});
		}








		return tsMenuPermitBOs;
	}




	@Override
	public void isExist(TsMenuPermitBO tsMenuPermitBO) {

		TsMenuPermitBO ckBO ;
		TsMenuPermitBO temp = null ;

		ckBO = new TsMenuPermitBO();
		ckBO.setId( tsMenuPermitBO.getId() );
		ckBO.setMenuId(tsMenuPermitBO.getMenuId());
		ckBO.setPermitId(tsMenuPermitBO.getPermitId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"不能多次分配给该菜单");
		}


	}


}