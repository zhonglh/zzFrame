package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsFileEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 文件 BO , 扩展 TsFileEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:53
*/
@EntityAnnotation(value="文件" , resource = "system.file"  ,businessName = "file_name"    ,businessKey = { "" }    )
@TableName(value="ts_file" , resultMap = "TsFileResultMap")
public class TsFileBO extends TsFileEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "fileEngine", groupName = "文件引擎" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "file_engine")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "文件引擎",sort = 1001                      ,required=true )
    private String fileEngineName ;



    public void setFileEngineName(String fileEngineName){
        this.fileEngineName = fileEngineName;
    }

    public String getFileEngineName(){
        return this.fileEngineName;
    }






    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getFileName();
        
    }
}
