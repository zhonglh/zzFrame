package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsUserRoleEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 用户角色关联 BO , 扩展 TsUserRoleEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:54
*/
@EntityAnnotation(value="用户角色关联" , resource = "system.userrole"  ,businessName = ""    ,businessKey = { "" }    )
@TableName(value="ts_user_role" , resultMap = "TsUserRoleResultMap")
public class TsUserRoleBO extends TsUserRoleEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "userId",  groupName = "用户" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "用户",sort = 201                      ,required=true )
    private String userName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "roleId",  groupName = "角色" ,   dbColumnName = "role_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsRoleBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "角色",sort = 301                      ,required=true )
    private String roleName ;



    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setRoleName(String roleName){
        this.roleName = roleName;
    }

    public String getRoleName(){
        return this.roleName;
    }






    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


        return super.toString();

    }
}
