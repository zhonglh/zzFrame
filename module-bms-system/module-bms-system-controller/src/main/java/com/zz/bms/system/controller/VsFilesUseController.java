package com.zz.bms.system.controller;


import com.zz.bms.system.bo.VsFilesUseBO;
import  com.zz.bms.system.query.impl.VsFilesUseQueryWebImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件使用 控制层
* @author Administrator
* @date 2018-9-6 23:56:31
 */
@RequestMapping("/system/filesuse")
@Controller
public class VsFilesUseController extends ZzDefaultController<VsFilesUseBO, String , VsFilesUseQueryWebImpl> {


    @Override
    protected void isExist(VsFilesUseBO vsFilesUseBO) {

    }
}
