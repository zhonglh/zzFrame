package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;



import com.zz.bms.system.bo.TsDepBO;
import  com.zz.bms.system.query.impl.TsDepQueryWebImpl;

import com.zz.bms.util.base.java.IdUtils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 部门 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/dep")
@Controller
public class TsDepController extends DefaultController<TsDepBO, String , TsDepQueryWebImpl> {



	@Override
	protected boolean isExist(TsDepBO tsDepBO) {

		TsDepBO ckBO ;
		boolean isExist = false;
		TsDepBO temp = null ;

		ckBO = new TsDepBO();
		ckBO.setId( tsDepBO.getId() );
        ckBO.setDepCode(tsDepBO.getDepCode());
        ckBO.setOrganId(tsDepBO.getOrganId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}
		ckBO = new TsDepBO();
		ckBO.setId( tsDepBO.getId() );
        ckBO.setDepName(tsDepBO.getDepName());
        ckBO.setOrganId(tsDepBO.getOrganId());
        temp = this.baseService.selectCheck(ckBO);
        if (isEntityExist(temp)) {return true;}

		return isExist;
	}




}
