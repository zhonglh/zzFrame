package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsNotificationEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.FilesAnnotation;
import com.zz.bms.system.bo.VsFileUseBO;

import org.apache.commons.lang3.StringUtils;


import java.util.List;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
* 系统通知 BO , 扩展 VsNotificationEntity 对象
* @author Administrator
* @date 2019-6-8 22:01:58
*/
@EntityAnnotation(value="系统通知" , resource = "system.notification"  ,haveTenant = true   ,businessName = "title"    ,businessKey = { "title" }    )
@TableName(value="vs_notification" , resultMap = "VsNotificationResultMap")
public class VsNotificationBO extends VsNotificationEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "isRead", groupName = "已读" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "yes_no")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "已读",sort = 1701                      ,required=true )
    private String isReadName ;



    /**
    * 通知文件 列表
    */
    @TableField(exist = false)
    @FilesAnnotation
    private List<VsFileUseBO> notifyFilesList ;






    public void setIsReadName(String isReadName){
        this.isReadName = isReadName;
    }

    public String getIsReadName(){
        return this.isReadName;
    }



    public void setNotifyFilesList(List<VsFileUseBO> notifyFilesList ){
        this.notifyFilesList = notifyFilesList;
    }


    public List<VsFileUseBO> getNotifyFilesList(){
        return this.notifyFilesList;
    }









    
    public boolean isTable() {
        return false;

    }


    @Override
    public boolean haveFile() {
        return true;
    }


    @Override
    public String toString() {


            return this.getTitle();
        
    }
}
