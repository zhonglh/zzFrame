package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.zz.bms.system.domain.TsDepEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 部门 BO , 扩展 TsDepEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="部门" , resource = "")
@TableName(value="ts_dep" , resultMap = "TsDepResultMap")
public class TsDepBO extends TsDepEntity implements Serializable {

    @TableField(exist = false)
    private String depStatusName ;



    public void setDepStatusName(String depStatusName){
        this.depStatusName = depStatusName;
    }

    public String getDepStatusName(){
        return this.depStatusName;
    }

}
