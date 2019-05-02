package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbFundAccountEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;


/**
* 基金账户 BO , 扩展 TbFundAccountEntity 对象
* @author Administrator
* @date 2019-5-1 17:49:19
*/
@EntityAnnotation(value="基金账户" , resource = "example.fundaccount"  ,businessName = ""    ,businessKey = { "" }    )
@TableName(value="tb_fund_account" , resultMap = "TbFundAccountResultMap")
public class TbFundAccountBO extends TbFundAccountEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "fundId",  groupName = "基金信息" ,   dbColumnName = "fund_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "基金信息",sort = 201                      ,required=true )
    private String fundName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "fundAccountType", groupName = "基金账户类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "fund_account_type")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "基金账户类型",sort = 301                      ,required=true )
    private String fundAccountTypeName ;



    public void setFundName(String fundName){
        this.fundName = fundName;
    }

    public String getFundName(){
        return this.fundName;
    }

    public void setFundAccountTypeName(String fundAccountTypeName){
        this.fundAccountTypeName = fundAccountTypeName;
    }

    public String getFundAccountTypeName(){
        return this.fundAccountTypeName;
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