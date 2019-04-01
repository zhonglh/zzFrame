package com.zz.bms.system.controller;


import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.system.bo.TsMsgTempletBO;
import  com.zz.bms.system.query.impl.TsMsgTempletQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 消息模板 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/msgtemplet")
@Controller
public class TsMsgTempletController extends ZzDefaultController<TsMsgTempletBO, String , TsMsgTempletQueryWebImpl> {





}
