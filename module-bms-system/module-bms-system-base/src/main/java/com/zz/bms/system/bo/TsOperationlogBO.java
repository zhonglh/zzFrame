package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.system.domain.TsOperationlogEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 操作日志 BO , 扩展 TsOperationlogEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="操作日志" , resource = "")
@TableName(value="ts_operationlog" , resultMap = "TsOperationlogResultMap")
public class TsOperationlogBO extends TsOperationlogEntity implements Serializable {

    @TableField(exist = false)
    private String operationTypeName ;

    @TableField(exist = false)
    private String entityTypeName ;



    public void setOperationTypeName(String operationTypeName){
        this.operationTypeName = operationTypeName;
    }

    public String getOperationTypeName(){
        return this.operationTypeName;
    }

    public void setEntityTypeName(String entityTypeName){
        this.entityTypeName = entityTypeName;
    }

    public String getEntityTypeName(){
        return this.entityTypeName;
    }

}
