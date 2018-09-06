package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.TsMsgTempletBO;
import  com.zz.bms.system.query.impl.TsMsgTempletQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 消息模板 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/msgtemplet")
@Controller
public class TsMsgTempletController extends DefaultController<TsMsgTempletBO, String , TsMsgTempletQueryWebImpl> {



	@Override
	protected boolean isExist(TsMsgTempletBO tsMsgTempletBO) {

		TsMsgTempletBO ckBO ;
		boolean isExist = false;
		TsMsgTempletBO temp = null ;

		ckBO = new TsMsgTempletBO();
		ckBO.setId( tsMsgTempletBO.getId() );
        ckBO.setMsgTempletName(tsMsgTempletBO.getMsgTempletName());
        ckBO.setTenantId(tsMsgTempletBO.getTenantId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
