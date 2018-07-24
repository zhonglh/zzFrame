package com.zz.bms.system.controller;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.zz.bms.controller.base.controller.DefaultController;
import com.zz.bms.core.enums.EnumYesNo;
import com.zz.bms.shiro.utils.ShiroUtils;
import com.zz.bms.system.base.bo.VsUserBO;
import com.zz.bms.system.base.query.impl.VsUserQueryWebImpl;
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
@RequestMapping("/sys/user")
@Controller
public class VsUserController extends DefaultController<VsUserBO, String , VsUserQueryWebImpl> {



    /**
     * 设置通用数据
     * 在新增 或编辑界面，  提供下拉数据等
     * @param model
     */
    @Override
    protected void setCommonData(ModelMap model) {

    }


    @Override
    protected boolean isExist(VsUserBO userEntity) {

        VsUserBO ckEntity ;
        boolean isExist = false;


        VsUserBO temp ;

        ckEntity = new VsUserBO();
        ckEntity.setLoginName(userEntity.getLoginName());
        ckEntity.setId(userEntity.getId());
        temp = this.baseService.selectCheck(ckEntity);
        if (isEntityExist(temp)) {return true;}

        ckEntity = new VsUserBO();
        ckEntity.setPhone(userEntity.getPhone());
        ckEntity.setId(userEntity.getId());
        temp = this.baseService.selectCheck(ckEntity);
        if (isEntityExist(temp)) {return true;}


        ckEntity = new VsUserBO();
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
    protected Wrapper buildWrapper(VsUserQueryWebImpl query , VsUserBO userEntity) {
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
    protected void processResult(List<VsUserBO> records) {

    }

    @Override
    protected void setCustomInfoByInsert(VsUserBO VsUserBO) {
        VsUserBO.setSystemAdmin(EnumYesNo.NO.getCode());
        VsUserBO.setSalt(IdUtils.getId().substring(0,10));
        VsUserBO.setLoginPassword(ShiroUtils.encodeSalt(VsUserBO.getLoginPassword(),VsUserBO.getSalt()));
        VsUserBO.setStatus(EnumYesNo.YES.getCode());

        //todo
        VsUserBO.setDepId("1");
        VsUserBO.setOrganId("1");
    }



}
