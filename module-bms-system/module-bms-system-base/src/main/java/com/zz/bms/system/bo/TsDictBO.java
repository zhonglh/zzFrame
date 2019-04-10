package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsDictEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 字典信息 BO , 扩展 TsDictEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:53
*/
@EntityAnnotation(value="字典信息" , resource = "system.dict"  ,businessName = ""    ,businessKey = { "" }    )
@TableName(value="ts_dict" , resultMap = "TsDictResultMap")
public class TsDictBO extends TsDictEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "dictTypeId",  groupName = "字典类型" ,   dbColumnName = "dict_type_name" , dbColumnType = "VARCHAR" , dbColumnLength = 60   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDictTypeBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "字典类型",sort = 201                      ,required=true )
    private String dictTypeName ;



    public void setDictTypeName(String dictTypeName){
        this.dictTypeName = dictTypeName;
    }

    public String getDictTypeName(){
        return this.dictTypeName;
    }






    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


        return super.toString();

    }
}
