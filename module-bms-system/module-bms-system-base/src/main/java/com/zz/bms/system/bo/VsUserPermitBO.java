package com.zz.bms.system.bo;

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
* 用户许可 BO , 扩展 VsUserPermitEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:55
*/
@EntityAnnotation(value="用户许可" , resource = "system.userpermit"  ,businessName = ""    ,businessKey = { "" }    )
@TableName(value="vs_user_permit" , resultMap = "VsUserPermitResultMap")
public class VsUserPermitBO extends VsUserPermitEntity implements Serializable , IBoEntity {









    @Override
    public boolean isTable() {


        return true;

    }


    @Override
    public String toString() {


        return super.toString();

    }
}
