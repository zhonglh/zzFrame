package com.zz.bms.system.controller;


import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.ui.TreeModel;
import com.zz.bms.enums.EnumDepStatus;
import com.zz.bms.enums.EnumUserStatus;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.bo.VsUserBO;
import  com.zz.bms.system.query.impl.TsDepQueryWebImpl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 部门 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/dep")
@Controller
public class TsDepController extends ZzDefaultController<TsDepBO, String , TsDepQueryWebImpl> {



	@Override
	public void setCustomInfoByInsert(TsDepBO tsDepBO , ILoginUserEntity sessionUser){
		tsDepBO.setDepStatus(EnumDepStatus.normal.getVal());
		tsDepBO.setDepStatusName(EnumDepStatus.normal.getLabel());

		if(StringUtils.isEmpty(tsDepBO.getOrganId())){
			tsDepBO.setOrganId((String)sessionUser.getOrganId());
		}
	}


	@Override
	protected TreeModel buildTreeModel(){
		return new TreeModel().toTreeModel("pid" , "depName");
	}







}
