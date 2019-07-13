package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


import com.zz.bms.core.db.entity.BaseBusinessEntity;
import com.zz.bms.core.db.entity.BaseBusinessSimpleEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.TsDictTypeBO;
import  com.zz.bms.system.query.impl.TsDictQueryWebImpl;

import com.zz.bms.system.query.impl.TsDictTypeQueryImpl;
import com.zz.bms.system.service.TsDictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 字典信息 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/dict")
@Controller
public class TsDictController extends ZzDefaultSimpleController<TsDictBO, String , TsDictQueryWebImpl> {

	@Autowired
	private TsDictTypeService tsDictTypeService;


	@Override
	protected Wrapper buildQueryWrapper(TsDictQueryWebImpl query , TsDictBO m) {
		QueryWrapper wrapper =   query.buildWrapper();
		wrapper.orderByAsc("orderby");
		return wrapper;
	}


	/**
	 * 检查是否可以修改
	 * @param m
	 * @param sessionUserVO
	 */
	@Override
	protected void checkCanUpdate(TsDictBO m, ILoginUserEntity<String> sessionUserVO){
		m.setDictVal(null);
	}

	@RequestMapping(value = "/index" , method = RequestMethod.GET)
	public String index(ModelMap model , HttpServletRequest request, HttpServletResponse response) {
		processPath(model);
		TsDictTypeQueryImpl tsDictTypeQuery = new TsDictTypeQueryImpl();
		tsDictTypeQuery.dictTypeShowable(EnumYesNo.YES.getCode());
		QueryWrapper<TsDictTypeBO> queryWrapper = tsDictTypeQuery.buildWrapper();
		queryWrapper.lambda().orderByAsc(TsDictTypeBO::getOrderby) ;
		List<TsDictTypeBO> list = this.tsDictTypeService.list(queryWrapper);
		model.addAttribute("list" , list);
		if(list != null && !list.isEmpty()) {
			model.addAttribute("fistTypeId", list.get(0).getId());
		}
		return this.viewName("index");

	}





}
