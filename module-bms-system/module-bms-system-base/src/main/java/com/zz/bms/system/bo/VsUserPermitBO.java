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

import java.io.Serializable;



/**
* VIEW BO , 扩展 VsUserPermitEntity 对象
* @author Administrator
* @date 2019-4-1 13:52:05
*/
@EntityAnnotation(value="VIEW" , resource = "system.userpermit"      )
@TableName(value="vs_user_permit" , resultMap = "VsUserPermitResultMap")
public class VsUserPermitBO extends VsUserPermitEntity implements Serializable , ILoginPermitEntity , IBoEntity {



    @Override
    public String getPermissionName() {
        return this.getPermitName();
    }

    @Override
    public String getPermissionCode() {
        return this.getPermitCode();
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
