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
    @EntityAttrPageAnnotation(title = "用户名",sort = 201                      ,required=true )
    private String userName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "userId",  groupName = "用户" ,   dbColumnName = "phone" , dbColumnType = "VARCHAR" , dbColumnLength = 11   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "手机号",sort = 202                      ,required=true )
    private String userPhone ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "userId",  groupName = "用户" ,   dbColumnName = "email" , dbColumnType = "VARCHAR" , dbColumnLength = 60   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "邮箱",sort = 203                      ,required=true )
    private String userEmail ;


    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "roleId",  groupName = "角色" ,   dbColumnName = "role_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsRoleBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "角色名",sort = 301                      ,required=true )
    private String roleName ;


    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "roleId",  groupName = "角色" ,   dbColumnName = "role_code" , dbColumnType = "VARCHAR" , dbColumnLength = 20   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsRoleBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "角色编码",sort = 302                      ,required=true )
    private String roleCode ;



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


    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


        return super.toString();

    }
}
