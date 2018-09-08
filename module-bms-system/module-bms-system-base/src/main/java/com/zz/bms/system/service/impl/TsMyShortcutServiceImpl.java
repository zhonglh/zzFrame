package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.system.bo.TsMyShortcutBO;
import com.zz.bms.system.dao.TsMyShortcutDAO;
import com.zz.bms.system.query.TsMyShortcutQuery;
import com.zz.bms.system.query.impl.TsMyShortcutQueryImpl;
import com.zz.bms.system.service.TsMyShortcutService;

import com.zz.bms.system.bo.TsMenuBO;
import com.zz.bms.system.dao.TsMenuDAO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsUserDAO;

import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
* 置顶快捷菜单 ServiceImpl
* @author Administrator
* @date 2018-9-8 12:42:41
*/
@Service
public class TsMyShortcutServiceImpl extends BaseServiceImpl<TsMyShortcutBO,String> implements TsMyShortcutService {



    @Autowired
    private TsMenuDAO tsMenuDAO;
    @Autowired
    private TsUserDAO tsUserDAO;


	@Autowired
	private TsMyShortcutDAO tsMyShortcutDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsMyShortcutDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsMyShortcutDAO ;
	}



	@Override
	@Transactional(
			rollbackFor = {Exception.class}
	)
	public void saveAll(String[] menuIds , String userId) {

		TsMyShortcutQuery query = new TsMyShortcutQueryImpl();
		query.userId(userId);
		this.delete(query.buildWrapper());

		if(menuIds != null && menuIds.length > 0 && StringUtils.isNotEmpty(userId)){
			List<TsMyShortcutBO> list = new ArrayList<TsMyShortcutBO>();
			for(String menuId : menuIds) {
				TsMyShortcutBO myShortcutBO = new TsMyShortcutBO();
				myShortcutBO.setId(IdUtils.getId());
				myShortcutBO.setMenuId(menuId);
				myShortcutBO.setUserId(userId);
			}

			this.insertBatch(list);
		}
	}




}