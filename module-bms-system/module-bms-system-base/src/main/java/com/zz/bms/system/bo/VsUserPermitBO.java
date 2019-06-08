package com.zz.bms.system.bo;

import com.zz.bms.core.db.entity.ILoginPermitEntity;
import com.zz.bms.system.domain.VsUserPermitEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;



/**
* 用户许可 BO , 扩展 VsUserPermitEntity 对象
* @author Administrator
* @date 2019-4-10 20:58:06
*/
@EntityAnnotation(value="用户许可" , resource = "system.userpermit"  ,businessName = ""    ,businessKey = { "" }    )
@TableName(value="vs_user_permit" , resultMap = "VsUserPermitResultMap")
public class VsUserPermitBO extends VsUserPermitEntity implements Serializable , IBoEntity , ILoginPermitEntity {


    public boolean isTable() {
        return false;

    }


    @Override
    public String toString() {


        return super.toString();

    }

    @Override
    public String getPermissionName() {
        return this.getPermitName();
    }

    @Override
    public String getPermissionCode() {
        return this.getPermitCode();
    }
}
