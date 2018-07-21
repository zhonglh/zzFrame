package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;
import com.zz.bms.system.base.entity.VsUserEntity;
import com.zz.bms.system.base.logic.query.impl.VsUserQueryWebImpl;
import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 处理用户信息
 * @author Administrator
 */
@RequestMapping("sys/user")
@Controller
public class VsUserController extends DefaultController<VsUserEntity , String , VsUserQueryWebImpl> {



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


    /**
     * 专门处理查询
     * @param query
     * @param userEntity
     * @return
     */
    @Override
    protected Wrapper buildWrapper(VsUserQueryWebImpl query , VsUserEntity userEntity) {
        if(StringUtils.isNotEmpty(userEntity.getKeyword())){
            VsUserQueryWebImpl tmpQuery = new VsUserQueryWebImpl();
            tmpQuery.setUserName_LIKE(userEntity.getKeyword());
            tmpQuery.setLoginName_LIKE(userEntity.getKeyword());
            tmpQuery.setPhone_LIKE(userEntity.getKeyword());
            tmpQuery.setEmail_LIKE(userEntity.getKeyword());
            query.orQuery(tmpQuery);
        }

        return super.buildWrapper(query, userEntity);
    }

    /**
     * 处理查询结果
     * @param records
     */
    @Override
    protected void processResult(List<VsUserEntity> records) {

    }

    @Override
    protected void setCustomInfoByInsert(VsUserEntity vsUserEntity) {
        vsUserEntity.setSystemAdmin(EnumYesNo.NO.getCode());
        vsUserEntity.setSalt(IdUtils.getId().substring(0,10));
        vsUserEntity.setLoginPassword(ShiroUtils.encodeSalt(vsUserEntity.getLoginPassword(),vsUserEntity.getSalt()));
        vsUserEntity.setStatus(EnumYesNo.YES.getCode());

        //todo
        vsUserEntity.setDepId("1");
        vsUserEntity.setOrganId("1");
    }



}
