package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.ZzDefaultController;


import com.zz.bms.system.bo.VsUserPermitBO;
import  com.zz.bms.system.query.impl.VsUserPermitQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户许可视图 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/userpermit")
@Controller
public class VsUserPermitController extends ZzDefaultController<VsUserPermitBO, String , VsUserPermitQueryWebImpl> {


    @Override
    protected void isExist(VsUserPermitBO vsUserPermitBO) {

    }
}
