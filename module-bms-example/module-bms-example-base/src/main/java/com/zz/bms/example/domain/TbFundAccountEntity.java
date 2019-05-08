package com.zz.bms.example.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.util.Date;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;







/**
 * 基金账户 实体类
 * @author Administrator
 * @date 2019-5-8 13:19:34
 */
public class TbFundAccountEntity extends com.zz.bms.core.db.entity.BaseEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrFkAnnotation(group = "fundId",  groupName = "基金信息" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
    @EntityAttrDBAnnotation(attrName="基金信息" ,attrColumn="fund_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金信息",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  fundId ;





    @EntityAttrDictAnnotation(group = "fundAccountType", groupName = "基金账户类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "fund_account_type")
    @EntityAttrDBAnnotation(attrName="基金账户类型" ,attrColumn="fund_account_type"  , type = "VARCHAR"      ,  attrLength = 2 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金账户类型",sort = 300  , pageElement = "select"            , maxLength = 2        ,required=true )
	
    
    
	private String  fundAccountType ;





    @EntityAttrDBAnnotation(attrName="户名" ,attrColumn="account_name"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = true )
    @EntityAttrPageAnnotation(title = "户名",sort = 400  , pageElement = "text"            , maxLength = 100        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  accountName ;





    @EntityAttrFkAnnotation(group = "bankId",  groupName = "开户行" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbBankBO.class)
    @EntityAttrDBAnnotation(attrName="开户行" ,attrColumn="bank_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "开户行",sort = 500  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  bankId ;





    @EntityAttrDBAnnotation(attrName="账号" ,attrColumn="account_no"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "账号",sort = 600  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  accountNo ;





    @EntityAttrDBAnnotation(attrName="开始日期" ,attrColumn="start_date"  , type = "DATE"       , notNull = false )
    @EntityAttrPageAnnotation(title = "开始日期",sort = 700  , pageElement = "date"                  ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Date  startDate ;





    @EntityAttrFkAnnotation(group = "otherBankId",  groupName = "其他行" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbBankBO.class)
    @EntityAttrDBAnnotation(attrName="其他行" ,attrColumn="other_bank_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "其他行",sort = 800  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  otherBankId ;





    @EntityAttrFkAnnotation(group = "userId",  groupName = "账户处理人" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrDBAnnotation(attrName="账户处理人" ,attrColumn="user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "账户处理人",sort = 900  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  userId ;









	public void setFundId(String fundId){
		this.fundId = fundId;
	}

    public String getFundId(){
    	return this.fundId;
    }


	public void setFundAccountType(String fundAccountType){
		this.fundAccountType = fundAccountType;
	}

    public String getFundAccountType(){
    	return this.fundAccountType;
    }


	public void setAccountName(String accountName){
		this.accountName = accountName;
	}

    public String getAccountName(){
    	return this.accountName;
    }


	public void setBankId(String bankId){
		this.bankId = bankId;
	}

    public String getBankId(){
    	return this.bankId;
    }


	public void setAccountNo(String accountNo){
		this.accountNo = accountNo;
	}

    public String getAccountNo(){
    	return this.accountNo;
    }


	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}

    public Date getStartDate(){
    	return this.startDate;
    }


	public void setOtherBankId(String otherBankId){
		this.otherBankId = otherBankId;
	}

    public String getOtherBankId(){
    	return this.otherBankId;
    }


	public void setUserId(String userId){
		this.userId = userId;
	}

    public String getUserId(){
    	return this.userId;
    }



}