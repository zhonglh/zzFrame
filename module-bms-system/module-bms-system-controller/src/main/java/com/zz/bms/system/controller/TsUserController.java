package com.zz.bms.system.controller;

import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.query.impl.VsUserQueryWebImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户 控制层
 * @author Administrator
 */
@RequestMapping("/system/tsuser")
@Controller
public class TsUserController extends ZzDefaultController<TsUserBO, String , VsUserQueryWebImpl> {



}
