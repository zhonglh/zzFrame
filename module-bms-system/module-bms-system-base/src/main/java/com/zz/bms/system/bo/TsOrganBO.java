package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.system.domain.TsOrganEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 机构 BO , 扩展 TsOrganEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="机构" , resource = "")
@TableName(value="ts_organ" , resultMap = "TsOrganResultMap")
public class TsOrganBO extends TsOrganEntity implements Serializable {

    @TableField(exist = false)
    private String organTypeName ;

    @TableField(exist = false)
    private String organStatusName ;



    public void setOrganTypeName(String organTypeName){
        this.organTypeName = organTypeName;
    }

    public String getOrganTypeName(){
        return this.organTypeName;
    }

    public void setOrganStatusName(String organStatusName){
        this.organStatusName = organStatusName;
    }

    public String getOrganStatusName(){
        return this.organStatusName;
    }

}
