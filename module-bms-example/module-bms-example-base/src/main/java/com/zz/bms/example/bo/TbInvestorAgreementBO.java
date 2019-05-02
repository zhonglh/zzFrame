package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbInvestorAgreementEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;


/**
* 投资协议 BO , 扩展 TbInvestorAgreementEntity 对象
* @author Administrator
* @date 2019-5-1 17:49:21
*/
@EntityAnnotation(value="投资协议" , resource = "example.investoragreement"  ,businessName = "agreement_name"    ,businessKey = { "agreement_code" }    )
@TableName(value="tb_investor_agreement" , resultMap = "TbInvestorAgreementResultMap")
public class TbInvestorAgreementBO extends TbInvestorAgreementEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "fundId",  groupName = "认购基金" ,   dbColumnName = "fund_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "认购基金",sort = 401                      ,required=true )
    private String fundName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "investorId",  groupName = "投资人" ,   dbColumnName = "investor_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbInvestorBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "投资人",sort = 501                      ,required=true )
    private String investorName ;



    public void setFundName(String fundName){
        this.fundName = fundName;
    }

    public String getFundName(){
        return this.fundName;
    }

    public void setInvestorName(String investorName){
        this.investorName = investorName;
    }

    public String getInvestorName(){
        return this.investorName;
    }






    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getAgreementName();
        
    }
}