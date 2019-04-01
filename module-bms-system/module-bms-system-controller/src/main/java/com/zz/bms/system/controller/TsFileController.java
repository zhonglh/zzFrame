package com.zz.bms.system.controller;


import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.system.bo.TsFileBO;
import  com.zz.bms.system.query.impl.TsFileQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/file")
@Controller
public class TsFileController extends ZzDefaultController<TsFileBO, String , TsFileQueryWebImpl> {







}
