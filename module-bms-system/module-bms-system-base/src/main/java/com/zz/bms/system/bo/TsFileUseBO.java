package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsFileUseEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 文件使用 BO , 扩展 TsFileUseEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:51
*/
@EntityAnnotation(value="文件使用" , resource = "system.fileuse"  ,businessName = "show_name"    ,businessKey = { "" }    )
@TableName(value="ts_file_use" , resultMap = "TsFileUseResultMap")
public class TsFileUseBO extends TsFileUseEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "fileId",  groupName = "文件ID" ,   dbColumnName = "file_name" , dbColumnType = "VARCHAR" , dbColumnLength = 100   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsFileBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "文件",sort = 201                      ,required=true )
    private String fileName ;



    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return this.fileName;
    }






    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getShowName();
        
    }
}
