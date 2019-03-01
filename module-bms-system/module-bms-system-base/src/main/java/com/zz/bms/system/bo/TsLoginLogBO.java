package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsLoginLogEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 登陆日志 BO , 扩展 TsLoginLogEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:55
*/
@EntityAnnotation(value="登陆日志" , resource = "system.loginlog"  ,businessName = "operation_user_name"   , haveOrgan =  true , haveTenant = true   )
@TableName(value="ts_login_log" , resultMap = "TsLoginLogResultMap")
public class TsLoginLogBO extends TsLoginLogEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "operationType", groupName = "操作类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "operation_type")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "操作类型",sort = 201                      ,required=true )
    private String operationTypeName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "depId",  groupName = "部门" ,   dbColumnName = "dep_name" , dbColumnType = "VARCHAR" , dbColumnLength = 100   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "部门",sort = 401                      ,required=true )
    private String depName ;



    public void setOperationTypeName(String operationTypeName){
        this.operationTypeName = operationTypeName;
    }

    public String getOperationTypeName(){
        return this.operationTypeName;
    }

    public void setDepName(String depName){
        this.depName = depName;
    }

    public String getDepName(){
        return this.depName;
    }






    @Override
    public boolean isTable() {
        return true;
    }


    @Override
    public String toString() {


            return this.getOperationUserName();
        
    }
}
