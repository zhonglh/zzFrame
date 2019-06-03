package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsNotificationEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 系统通知 BO , 扩展 TsNotificationEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:51
*/
@EntityAnnotation(value="系统通知" , resource = "system.notification"  ,businessName = "title"    , haveTenant = true    )
@TableName(value="ts_notification" , resultMap = "TsNotificationResultMap")
public class TsNotificationBO extends TsNotificationEntity implements Serializable , IBoEntity {









    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getTitle();
        
    }
}
