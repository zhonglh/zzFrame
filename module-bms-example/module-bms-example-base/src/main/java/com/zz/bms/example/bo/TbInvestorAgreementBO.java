package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbInvestorAgreementEntity;

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
* 投资协议 BO , 扩展 TbInvestorAgreementEntity 对象
* @author Administrator
* @date 2019-5-8 10:49:24
*/
@EntityAnnotation(value="投资协议" , resource = "example.investoragreement"  ,haveTenant = true   ,businessName = ""    ,businessKey = { "" }    )
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



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "signDepId",  groupName = "部门" ,   dbColumnName = "dep_name" , dbColumnType = "VARCHAR" , dbColumnLength = 100   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "部门",sort = 901                      ,required=true )
    private String signDepName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "signUserId",  groupName = "签订人" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "签订人",sort = 1101                      ,required=true )
    private String signUserName ;



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

    public void setSignDepName(String signDepName){
        this.signDepName = signDepName;
    }

    public String getSignDepName(){
        return this.signDepName;
    }

    public void setSignUserName(String signUserName){
        this.signUserName = signUserName;
    }

    public String getSignUserName(){
        return this.signUserName;
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
