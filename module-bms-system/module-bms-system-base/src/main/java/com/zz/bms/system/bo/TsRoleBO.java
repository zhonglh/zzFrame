package com.zz.bms.system.bo;

import com.zz.bms.enums.EnumDefaultType;
import com.zz.bms.system.domain.TsRoleEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 角色 BO , 扩展 TsRoleEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:53
*/
@EntityAnnotation(value="角色" , resource = "system.role"  ,businessName = "role_name"    ,businessKey = { "role_code" }  , haveOrgan =  true , haveTenant = true)
@TableName(value="ts_role" , resultMap = "TsRoleResultMap")
public class TsRoleBO extends TsRoleEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "roleType", groupName = "角色类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "role_type")
    @EntityAttrExcelAnnotation(excelProcess= "2")
    @EntityAttrPageAnnotation(title = "角色类型",sort = 401                      ,required=true )
    private String roleTypeName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "depId",  groupName = "部门" ,   dbColumnName = "dep_name" , dbColumnType = "VARCHAR" , dbColumnLength = 100   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "2")
    @EntityAttrPageAnnotation(title = "部门",sort = 501                      ,required=true , defaultType = DefaultTypeConstant.CURRENT_USER_DEPTNAME)
    private String depName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "roleStatus", groupName = "角色状态" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "role_status")
    @EntityAttrExcelAnnotation(excelProcess= "2")
    @EntityAttrPageAnnotation(title = "角色状态",sort = 701                      ,required=true )
    private String roleStatusName ;



    public void setRoleTypeName(String roleTypeName){
        this.roleTypeName = roleTypeName;
    }

    public String getRoleTypeName(){
        return this.roleTypeName;
    }

    public void setDepName(String depName){
        this.depName = depName;
    }

    public String getDepName(){
        return this.depName;
    }

    public void setRoleStatusName(String roleStatusName){
        this.roleStatusName = roleStatusName;
    }

    public String getRoleStatusName(){
        return this.roleStatusName;
    }






    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getRoleName();
        
    }
}
