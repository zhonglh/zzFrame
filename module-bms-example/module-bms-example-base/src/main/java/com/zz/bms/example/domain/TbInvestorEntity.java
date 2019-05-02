package com.zz.bms.example.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;







/**
 * 投资人 实体类
 * @author Administrator
 * @date 2019-5-2 18:36:09
 */
public class TbInvestorEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrDBAnnotation(attrName="投资人名称" ,attrColumn="investor_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "投资人名称",sort = 200  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  investorName ;





    @EntityAttrDBAnnotation(attrName="投资人代码" ,attrColumn="investor_code"  , type = "VARCHAR"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "投资人代码",sort = 300  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  investorCode ;





    @EntityAttrDictAnnotation(group = "investorType", groupName = "投资人类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "investor_type")
    @EntityAttrDBAnnotation(attrName="投资人类型" ,attrColumn="investor_type"  , type = "VARCHAR"      ,  attrLength = 2 , notNull = true )
    @EntityAttrPageAnnotation(title = "投资人类型",sort = 400  , pageElement = "select"            , maxLength = 2        ,required=true )
	
    
    
	private String  investorType ;





    @EntityAttrFkAnnotation(group = "manageUserId",  groupName = "投资经理" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrDBAnnotation(attrName="投资经理" ,attrColumn="manage_user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "投资经理",sort = 500  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  manageUserId ;





    @EntityAttrDictAnnotation(group = "cardType", groupName = "证件类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "card_type")
    @EntityAttrDBAnnotation(attrName="证件类型" ,attrColumn="card_type"  , type = "VARCHAR"      ,  attrLength = 2 , notNull = false )
    @EntityAttrPageAnnotation(title = "证件类型",sort = 600  , pageElement = "select"            , maxLength = 2        ,required=false )
	
    
    
	private String  cardType ;





    @EntityAttrDBAnnotation(attrName="证件号码" ,attrColumn="card_no"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "证件号码",sort = 700  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  cardNo ;





    @EntityAttrDBAnnotation(attrName="附件" ,attrColumn="investor_files"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "附件",sort = 800  , pageElement = "multifile"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  investorFiles ;





    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 500 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 900  , pageElement = "textarea"            , maxLength = 500        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  remark ;









	public void setInvestorName(String investorName){
		this.investorName = investorName;
	}

    public String getInvestorName(){
    	return this.investorName;
    }


	public void setInvestorCode(String investorCode){
		this.investorCode = investorCode;
	}

    public String getInvestorCode(){
    	return this.investorCode;
    }


	public void setInvestorType(String investorType){
		this.investorType = investorType;
	}

    public String getInvestorType(){
    	return this.investorType;
    }


	public void setManageUserId(String manageUserId){
		this.manageUserId = manageUserId;
	}

    public String getManageUserId(){
    	return this.manageUserId;
    }


	public void setCardType(String cardType){
		this.cardType = cardType;
	}

    public String getCardType(){
    	return this.cardType;
    }


	public void setCardNo(String cardNo){
		this.cardNo = cardNo;
	}

    public String getCardNo(){
    	return this.cardNo;
    }


	public void setInvestorFiles(String investorFiles){
		this.investorFiles = investorFiles;
	}

    public String getInvestorFiles(){
    	return this.investorFiles;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }



}