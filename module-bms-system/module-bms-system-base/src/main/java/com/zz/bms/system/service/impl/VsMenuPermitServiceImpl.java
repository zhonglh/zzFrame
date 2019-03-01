package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.system.bo.VsMenuPermitBO;
import com.zz.bms.system.dao.VsMenuPermitDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.VsMenuPermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 菜单许可关联 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:45:43
 */
@Service
public class VsMenuPermitServiceImpl extends SystemBaseServiceImpl<VsMenuPermitBO,String> implements VsMenuPermitService {



	@Autowired
	private TsDictService tsDictService;





	@Autowired
	private VsMenuPermitDAO vsMenuPermitDAO ;



	@Override
	public BaseDAO getDAO() {
		return vsMenuPermitDAO ;
	}







	@Override
	public void isExist(VsMenuPermitBO vsMenuPermitBO) {

		VsMenuPermitBO ckBO ;
		VsMenuPermitBO temp = null ;

		ckBO = new VsMenuPermitBO();
		ckBO.setId( vsMenuPermitBO.getId() );
		ckBO.setMenuId(vsMenuPermitBO.getMenuId());
		ckBO.setPermitId(vsMenuPermitBO.getPermitId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"    ");
		}


	}


}