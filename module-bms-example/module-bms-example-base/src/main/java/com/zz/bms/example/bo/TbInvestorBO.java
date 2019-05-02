package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbInvestorEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;


/**
* 投资人 BO , 扩展 TbInvestorEntity 对象
* @author Administrator
* @date 2019-5-1 17:49:22
*/
@EntityAnnotation(value="投资人" , resource = "example.investor"  ,businessName = "investor_name"    ,businessKey = { "investor_code" }    )
@TableName(value="tb_investor" , resultMap = "TbInvestorResultMap")
public class TbInvestorBO extends TbInvestorEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "investorType", groupName = "投资人类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "investor_type")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "投资人类型",sort = 401                      ,required=true )
    private String investorTypeName ;



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
