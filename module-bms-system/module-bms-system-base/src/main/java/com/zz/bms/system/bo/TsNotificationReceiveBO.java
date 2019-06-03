package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsNotificationReceiveEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 通知接收人 BO , 扩展 TsNotificationReceiveEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:55
*/
@EntityAnnotation(value="通知接收人" , resource = "system.notificationreceive"  ,businessName = ""    ,businessKey = { "" }    )
@TableName(value="ts_notification_receive" , resultMap = "TsNotificationReceiveResultMap")
public class TsNotificationReceiveBO extends TsNotificationReceiveEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "receiveUserId",  groupName = "接收人" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "接收人",sort = 301                      ,required=true )
    private String receiveUserName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "isRead", groupName = "已读" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "yes_no")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "已读",sort = 401                      ,required=true )
    private String isReadName ;



    public void setReceiveUserName(String receiveUserName){
        this.receiveUserName = receiveUserName;
    }

    public String getReceiveUserName(){
        return this.receiveUserName;
    }

    public void setIsReadName(String isReadName){
        this.isReadName = isReadName;
    }

    public String getIsReadName(){
        return this.isReadName;
    }






    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


        return super.toString();

    }
}
