package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.system.bo.TsMyShortcutBO;
import com.zz.bms.system.dao.TsMenuDAO;
import com.zz.bms.system.dao.TsMyShortcutDAO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.query.TsMyShortcutQuery;
import com.zz.bms.system.query.impl.TsMyShortcutQueryImpl;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.TsMyShortcutService;
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
 * @date 2019-4-10 18:25:11
 */
@Service
public class TsMyShortcutServiceImpl extends SystemBaseServiceImpl<TsMyShortcutBO,String> implements TsMyShortcutService {



	@Autowired
	private TsDictService tsDictService;



	@Autowired
	private TsUserDAO tsUserDAO;
	@Autowired
	private TsMenuDAO tsMenuDAO;


	@Autowired
	private TsMyShortcutDAO tsMyShortcutDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsMyShortcutDAO ;
	}




	@Override
	@Transactional(
			rollbackFor = {Exception.class}
	)
	public void saveAll(String[] menuIds , String userId) {

		TsMyShortcutQuery query = new TsMyShortcutQueryImpl();
		query.userId(userId);
		this.remove(query.buildWrapper());

		if(menuIds != null && menuIds.length > 0 && StringUtils.isNotEmpty(userId)){
			List<TsMyShortcutBO> list = new ArrayList<TsMyShortcutBO>();
			for(String menuId : menuIds) {
				TsMyShortcutBO myShortcutBO = new TsMyShortcutBO();
				myShortcutBO.setId(IdUtils.getId());
				myShortcutBO.setMenuId(menuId);
				myShortcutBO.setUserId(userId);
			}

			this.saveBatch(list,1000);
		}
	}




	@Override
	public void isExist(TsMyShortcutBO tsMyShortcutBO) {

		TsMyShortcutBO ckBO ;
		TsMyShortcutBO temp = null ;

		ckBO = new TsMyShortcutBO();
		ckBO.setId( tsMyShortcutBO.getId() );
		ckBO.setMenuId(tsMyShortcutBO.getMenuId());
		ckBO.setUserId(tsMyShortcutBO.getUserId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"    ");
		}


	}


}