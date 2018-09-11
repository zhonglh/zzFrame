package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.zz.bms.system.domain.TsRoleEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 角色 BO , 扩展 TsRoleEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="角色" , resource = "")
@TableName(value="ts_role" , resultMap = "TsRoleResultMap")
public class TsRoleBO extends TsRoleEntity implements Serializable {

    @TableField(exist = false)
    private String roleTypeName ;

    @TableField(exist = false)
    private String roleStatusName ;



    public void setRoleTypeName(String roleTypeName){
        this.roleTypeName = roleTypeName;
    }

    public String getRoleTypeName(){
        return this.roleTypeName;
    }

    public void setRoleStatusName(String roleStatusName){
        this.roleStatusName = roleStatusName;
    }

    public String getRoleStatusName(){
        return this.roleStatusName;
    }

}
