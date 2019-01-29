package com.zz.bms.system.controller;


import com.zz.bms.system.bo.TsOperationlogBO;
import  com.zz.bms.system.query.impl.TsOperationlogQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 操作日志 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/operationlog")
@Controller
public class TsOperationlogController extends ZzDefaultController<TsOperationlogBO, String , TsOperationlogQueryWebImpl> {


    @Override
    protected void isExist(TsOperationlogBO tsOperationlogBO) {

    }
}
