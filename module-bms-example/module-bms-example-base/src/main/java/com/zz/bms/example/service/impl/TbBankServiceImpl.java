package com.zz.bms.example.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.enums.*;

import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.system.service.impl.SystemBaseServiceImpl;

import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.bo.TsDictBO;


import com.zz.bms.example.bo.TbBankBO;
import com.zz.bms.example.dao.TbBankDAO;
import com.zz.bms.example.service.TbBankService;





import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* 银行信息 ServiceImpl
* @author Administrator
* @date 2019-6-12 19:11:25
*/
@Service
public class TbBankServiceImpl extends SystemBaseServiceImpl<TbBankBO,String> implements TbBankService {



	@Autowired
	private TsDictService tsDictService;






    @Autowired
    private TbBankDAO tbBankDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tbBankDAO ;
    }





	@Override
	public void isExist(TbBankBO tbBankBO) {
	}





}