package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsNodeUserEntity;

import com.baomidou.mybatisplus.annotation.TableField;

import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;



/**
* VIEW BO , 扩展 VsNodeUserEntity 对象
* @author Administrator
* @date 2019-4-1 13:52:04
*/
@EntityAnnotation(value="VIEW" , resource = "system.nodeuser"      )
@TableName(value="vs_node_user" , resultMap = "VsNodeUserResultMap")
public class VsNodeUserBO extends VsNodeUserEntity implements Serializable , IBoEntity {



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "userStatus", groupName = "状态" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "user_status")
    
    @EntityAttrPageAnnotation(title = "状态",sort = 601                      ,required=true )
    private String userStatusName ;








    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "systemAdmin", groupName = "系统管理人员" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "yes_no")
    
    @EntityAttrPageAnnotation(title = "系统管理人员",sort = 1301                      ,required=true )
    private String systemAdminName ;








    public void setUserStatusName(String userStatusName){
        this.userStatusName = userStatusName;
    }

    public String getUserStatusName(){
        return this.userStatusName;
    }

    public void setSystemAdminName(String systemAdminName){
        this.systemAdminName = systemAdminName;
    }

    public String getSystemAdminName(){
        return this.systemAdminName;
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
