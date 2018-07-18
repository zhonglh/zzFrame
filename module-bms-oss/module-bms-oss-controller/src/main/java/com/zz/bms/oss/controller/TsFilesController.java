package com.zz.bms.oss.controller;

import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.oss.base.entity.TsFilesEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 处理用户信息
 * @author Administrator
 */
@RequestMapping("oss/files")
@Controller
public class TsFilesController extends DefaultController<TsFilesEntity, String> {





    @Override
    public String getResourceIdentity() {
        return "oss:files";
    }

    /**
     * 设置通用数据
     * 在新增 或编辑界面，  提供下拉数据等
     * @param model
     */
    @Override
    protected void setCommonData(ModelMap model) {

    }


    @Override
    protected boolean isExist(TsFilesEntity tsFilesEntity) {
        return true;
    }






}
