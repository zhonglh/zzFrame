package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbFundRecordEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
* 基金备案 BO , 扩展 TbFundRecordEntity 对象
* @author Administrator
* @date 2019-5-2 18:36:10
*/
@EntityAnnotation(value="基金备案" , resource = "example.fundrecord"    ,businessName = ""    ,businessKey = { "" }    )
@TableName(value="tb_fund_record" , resultMap = "TbFundRecordResultMap")
public class TbFundRecordBO extends TbFundRecordEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "fundId",  groupName = "基金信息" ,   dbColumnName = "fund_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "基金信息",sort = 201                      ,required=true )
    private String fundName ;



    public void setFundName(String fundName){
        this.fundName = fundName;
    }

    public String getFundName(){
        return this.fundName;
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
