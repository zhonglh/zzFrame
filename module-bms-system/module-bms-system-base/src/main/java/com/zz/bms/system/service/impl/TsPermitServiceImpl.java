package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.system.bo.TsPermitBO;
import com.zz.bms.system.dao.TsPermitDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.TsPermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 许可 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:25:11
 */
@Service
public class TsPermitServiceImpl extends SystemBaseServiceImpl<TsPermitBO,String> implements TsPermitService {



	@Autowired
	private TsDictService tsDictService;





	@Autowired
	private TsPermitDAO tsPermitDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsPermitDAO ;
	}







	@Override
	public void isExist(TsPermitBO tsPermitBO) {

		TsPermitBO ckBO ;
		TsPermitBO temp = null ;

		ckBO = new TsPermitBO();
		ckBO.setId( tsPermitBO.getId() );
		ckBO.setPermitCode(tsPermitBO.getPermitCode());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw new BizException(EnumErrorMsg.business_error.getCode(),"许可编码已使用");
		}


	}


}