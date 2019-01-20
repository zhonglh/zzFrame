package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.core.Constant;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.system.bo.TsDictTypeBO;
import com.zz.bms.system.bo.VsUserBO;
import com.zz.bms.system.query.impl.TsDictTypeQueryImpl;
import  com.zz.bms.system.query.impl.TsDictTypeQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 字典类型 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/dicttype")
@Controller
public class TsDictTypeController extends ZzDefaultController<TsDictTypeBO, String , TsDictTypeQueryWebImpl> {





	@Override
	protected void isExist(TsDictTypeBO tsDictTypeBO) {

	}




}
