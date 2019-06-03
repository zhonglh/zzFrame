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


import java.util.List;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
* 基金备案 BO , 扩展 TbFundRecordEntity 对象
* @author Administrator
* @date 2019-6-3 10:12:54
*/
@EntityAnnotation(value="基金备案" , resource = "example.fundrecord"    ,businessName = ""    ,businessKey = { "" }    )
@TableName(value="tb_fund_record" , resultMap = "TbFundRecordResultMap")
public class TbFundRecordBO extends TbFundRecordEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "fundId",  groupName = "基金信息" ,   dbColumnName = "fund_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "基金信息",sort = 201                      ,required=true )
    private String fundName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "bankId",  groupName = "开户行" ,   dbColumnName = "bank_name" , dbColumnType = "VARCHAR" , dbColumnLength = 200   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbBankBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "开户行",sort = 501                      ,required=true )
    private String bankName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "cardType", groupName = "证件类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "card_type")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "证件类型",sort = 601                      ,required=true )
    private String cardTypeName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "recordUserId",  groupName = "备案人" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "备案人",sort = 701                      ,required=true )
    private String recordUserName ;







    public void setFundName(String fundName){
        this.fundName = fundName;
    }

    public String getFundName(){
        return this.fundName;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setCardTypeName(String cardTypeName){
        this.cardTypeName = cardTypeName;
    }

    public String getCardTypeName(){
        return this.cardTypeName;
    }

    public void setRecordUserName(String recordUserName){
        this.recordUserName = recordUserName;
    }

    public String getRecordUserName(){
        return this.recordUserName;
    }










    
    public boolean isTable() {

        return true;


    }


    @Override
    public boolean haveFile() {
        return false;
    }


    @Override
    public String toString() {


        return super.toString();

    }
}
