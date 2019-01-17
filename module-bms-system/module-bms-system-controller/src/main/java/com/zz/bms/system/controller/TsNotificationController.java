package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.TsNotificationBO;
import  com.zz.bms.system.query.impl.TsNotificationQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统通知 控制层
* @author Administrator
* @date 2018-9-6 23:56:30
 */
@RequestMapping("/system/notification")
@Controller
public class TsNotificationController extends ZzDefaultController<TsNotificationBO, String , TsNotificationQueryWebImpl> {


    @Override
    protected void isExist(TsNotificationBO tsNotificationBO) {

    }
}
