package com.zz.bms.example.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;







/**
 * 银行信息 实体类
 * @author Administrator
 * @date 2019-5-8 13:19:37
 */
public class TbBankEntity extends com.zz.bms.core.db.entity.BaseEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrDBAnnotation(attrName="银行全称" ,attrColumn="bank_name"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = true )
    @EntityAttrPageAnnotation(title = "银行全称",sort = 200  , pageElement = "text"            , maxLength = 200        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  bankName ;





    @EntityAttrDBAnnotation(attrName="银行简称" ,attrColumn="bank_short_name"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "银行简称",sort = 300  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  bankShortName ;





    @EntityAttrDBAnnotation(attrName="服务电话" ,attrColumn="service_telephone"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = false )
    @EntityAttrPageAnnotation(title = "服务电话",sort = 400  , pageElement = "text"            , maxLength = 20        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  serviceTelephone ;





    @EntityAttrDBAnnotation(attrName="官网" ,attrColumn="official_website"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "官网",sort = 500  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  officialWebsite ;









	public void setBankName(String bankName){
		this.bankName = bankName;
	}

    public String getBankName(){
    	return this.bankName;
    }


	public void setBankShortName(String bankShortName){
		this.bankShortName = bankShortName;
	}

    public String getBankShortName(){
    	return this.bankShortName;
    }


	public void setServiceTelephone(String serviceTelephone){
		this.serviceTelephone = serviceTelephone;
	}

    public String getServiceTelephone(){
    	return this.serviceTelephone;
    }


	public void setOfficialWebsite(String officialWebsite){
		this.officialWebsite = officialWebsite;
	}

    public String getOfficialWebsite(){
    	return this.officialWebsite;
    }



}