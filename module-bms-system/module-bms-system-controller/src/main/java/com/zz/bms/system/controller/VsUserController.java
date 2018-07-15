package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.system.base.entity.VsUserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 处理用户信息
 * @author Administrator
 */
@RequestMapping("sys/user")
@Controller
public class VsUserController extends DefaultController<VsUserEntity , String> {





    @Override
    public String getResourceIdentity() {
        return "sys:user";
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
    protected boolean isExist(VsUserEntity userEntity) {

        VsUserEntity ckEntity ;
        boolean isExist = false;


        VsUserEntity temp ;

        ckEntity = new VsUserEntity();
        ckEntity.setLoginName(userEntity.getLoginName());
        ckEntity.setId(userEntity.getId());
        temp = this.baseService.selectCheck(ckEntity);
        if (isEntityExist(temp)) {return true;}

        ckEntity = new VsUserEntity();
        ckEntity.setPhone(userEntity.getPhone());
        ckEntity.setId(userEntity.getId());
        temp = this.baseService.selectCheck(ckEntity);
        if (isEntityExist(temp)) {return true;}


        ckEntity = new VsUserEntity();
        ckEntity.setEmail(userEntity.getEmail());
        ckEntity.setId(userEntity.getId());
        temp = this.baseService.selectCheck(ckEntity);
        if (isEntityExist(temp)) {
            return true;
        }


        return isExist;
    }






}
