package com.zz.bms.system.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.system.domain.TsNotificationEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 系统通知 BO , 扩展 TsNotificationEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="系统通知" , resource = "")
@TableName(value="ts_notification" , resultMap = "TsNotificationResultMap")
public class TsNotificationBO extends TsNotificationEntity implements Serializable {

    @TableField(exist = false)
    private String isReadName ;



    public void setIsReadName(String isReadName){
        this.isReadName = isReadName;
    }

    public String getIsReadName(){
        return this.isReadName;
    }

}
