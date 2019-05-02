package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbOutMoneyEntity;

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
* 出资明细 BO , 扩展 TbOutMoneyEntity 对象
* @author Administrator
* @date 2019-5-2 18:36:08
*/
@EntityAnnotation(value="出资明细" , resource = "example.outmoney"  ,haveTenant = true   ,businessName = ""    ,businessKey = { "" }    )
@TableName(value="tb_out_money" , resultMap = "TbOutMoneyResultMap")
public class TbOutMoneyBO extends TbOutMoneyEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "investorAgreementId",  groupName = "协议" ,   dbColumnName = "agreement_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbInvestorAgreementBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "协议",sort = 201                      ,required=true )
    private String investorAgreementName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "fundId",  groupName = "基金" ,   dbColumnName = "fund_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "基金",sort = 301                      ,required=true )
    private String fundName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "investorId",  groupName = "投资人" ,   dbColumnName = "investor_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbInvestorBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "投资人",sort = 401                      ,required=true )
    private String investorName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "handleDepId",  groupName = "部门" ,   dbColumnName = "dep_name" , dbColumnType = "VARCHAR" , dbColumnLength = 100   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "部门",sort = 601                      ,required=true )
    private String handleDepName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "handleUserId",  groupName = "经办人" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "经办人",sort = 801                      ,required=true )
    private String handleUserName ;



    public void setInvestorAgreementName(String investorAgreementName){
        this.investorAgreementName = investorAgreementName;
    }

    public String getInvestorAgreementName(){
        return this.investorAgreementName;
    }

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

    public void setHandleDepName(String handleDepName){
        this.handleDepName = handleDepName;
    }

    public String getHandleDepName(){
        return this.handleDepName;
    }

    public void setHandleUserName(String handleUserName){
        this.handleUserName = handleUserName;
    }

    public String getHandleUserName(){
        return this.handleUserName;
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
