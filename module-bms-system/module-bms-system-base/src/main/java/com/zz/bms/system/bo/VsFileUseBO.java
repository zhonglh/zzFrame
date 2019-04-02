package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsFileUseEntity;

import com.baomidou.mybatisplus.annotation.TableField;

import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;



/**
* 文件使用 BO , 扩展 VsFileUseEntity 对象
* @author Administrator
* @date 2019-4-1 13:52:03
*/
@EntityAnnotation(value="文件使用" , resource = "system.fileuse"  ,businessName = "show_name"    ,businessKey = { "show_name" }  )
@TableName(value="vs_file_use" , resultMap = "VsFileUseResultMap")
public class VsFileUseBO extends VsFileUseEntity implements Serializable , IBoEntity {



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "businessType", groupName = "业务类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "business_type")
    
    @EntityAttrPageAnnotation(title = "业务类型",sort = 401                      ,required=true )
    private String businessTypeName ;








    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "fileEngine", groupName = "文件引擎" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "file_engine")
    
    @EntityAttrPageAnnotation(title = "文件引擎",sort = 1901                      ,required=true )
    private String fileEngineName ;








    public void setBusinessTypeName(String businessTypeName){
        this.businessTypeName = businessTypeName;
    }

    public String getBusinessTypeName(){
        return this.businessTypeName;
    }

    public void setFileEngineName(String fileEngineName){
        this.fileEngineName = fileEngineName;
    }

    public String getFileEngineName(){
        return this.fileEngineName;
    }



    @Override
    public boolean isTable() {
        return false;
    }


    @Override
    public String toString() {

            return this.getShowName();
        
    }
}
