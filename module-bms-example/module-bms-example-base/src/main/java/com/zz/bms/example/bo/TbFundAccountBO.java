package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbFundAccountEntity;

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
* 基金账户 BO , 扩展 TbFundAccountEntity 对象
* @author Administrator
* @date 2019-5-8 13:19:34
*/
@EntityAnnotation(value="基金账户" , resource = "example.fundaccount"    ,businessName = "account_no"    ,businessKey = { "account_no" }    )
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



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "bankId",  groupName = "开户行" ,   dbColumnName = "bank_name" , dbColumnType = "VARCHAR" , dbColumnLength = 200   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbBankBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "开户行",sort = 501                      ,required=true )
    private String bankName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "otherBankId",  groupName = "其他行" ,   dbColumnName = "bank_name" , dbColumnType = "VARCHAR" , dbColumnLength = 200   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbBankBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "其他行",sort = 801                      ,required=true )
    private String otherBankName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "userId",  groupName = "账户处理人" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "账户处理人",sort = 901                      ,required=true )
    private String userName ;



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

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setOtherBankName(String otherBankName){
        this.otherBankName = otherBankName;
    }

    public String getOtherBankName(){
        return this.otherBankName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }






    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getAccountNo();
        
    }
}
