package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbInvestorEntity;

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
* 投资人 BO , 扩展 TbInvestorEntity 对象
* @author Administrator
* @date 2019-5-8 10:49:25
*/
@EntityAnnotation(value="投资人" , resource = "example.investor"  ,haveTenant = true   ,businessName = "investor_name"    ,businessKey = { "investor_code" }    )
@TableName(value="tb_investor" , resultMap = "TbInvestorResultMap")
public class TbInvestorBO extends TbInvestorEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "investorType", groupName = "投资人类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "investor_type")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "投资人类型",sort = 401                      ,required=true )
    private String investorTypeName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "manageUserId",  groupName = "投资经理" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "投资经理",sort = 501                      ,required=true )
    private String manageUserName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "cardType", groupName = "证件类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "card_type")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "证件类型",sort = 601                      ,required=true )
    private String cardTypeName ;



    public void setInvestorTypeName(String investorTypeName){
        this.investorTypeName = investorTypeName;
    }

    public String getInvestorTypeName(){
        return this.investorTypeName;
    }

    public void setManageUserName(String manageUserName){
        this.manageUserName = manageUserName;
    }

    public String getManageUserName(){
        return this.manageUserName;
    }

    public void setCardTypeName(String cardTypeName){
        this.cardTypeName = cardTypeName;
    }

    public String getCardTypeName(){
        return this.cardTypeName;
    }






    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getInvestorName();
        
    }
}
