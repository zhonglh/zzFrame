package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsUserEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;

import com.zz.bms.system.bo.TsUserBO;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;



/**
* 用户 BO , 扩展 TsUserBO 对象
* @author Administrator
* @date 2019-4-10 20:58:03
*/
@EntityAnnotation(value="用户" , resource = "system.user"  ,businessName = "user_name"    , haveOrgan =  true , haveTenant = true  )
@TableName(value="vs_user" , resultMap = "VsUserResultMap")
public class VsUserBO extends TsUserBO implements Serializable , IBoEntity {


    private String organName;

    private String tenantName;

    @Override
    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    @Override
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    @Override
    public boolean isTable() {


        return false;

    }


    @Override
    public String toString() {

        return super.toString();

    }
}
