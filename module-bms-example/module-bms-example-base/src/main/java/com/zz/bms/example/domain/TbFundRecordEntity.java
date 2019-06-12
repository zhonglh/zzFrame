package com.zz.bms.example.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.util.Date;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;




/**
 * 基金备案 实体类
 * @author Administrator
 * @date 2019-6-12 19:11:24
 */
public class TbFundRecordEntity extends BaseEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrFkAnnotation(group = "fundId",  groupName = "基金信息" ,   isFkId = true, dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
    @EntityAttrDBAnnotation(attrName="基金信息" ,attrColumn="fund_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金信息",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
	private String  fundId ;





    @EntityAttrDBAnnotation(attrName="备案日期" ,attrColumn="record_date"  , type = "DATE"       , notNull = true )
    @EntityAttrPageAnnotation(title = "备案日期",sort = 300  , pageElement = "date"                  ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
	private Date  recordDate ;





    @EntityAttrDBAnnotation(attrName="备案地点" ,attrColumn="record_addr"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = true )
    @EntityAttrPageAnnotation(title = "备案地点",sort = 400  , pageElement = "text"            , maxLength = 200        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
	private String  recordAddr ;





    @EntityAttrFkAnnotation(group = "bankId",  groupName = "开户行" ,   isFkId = true, dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbBankBO.class)
    @EntityAttrDBAnnotation(attrName="开户行" ,attrColumn="bank_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "开户行",sort = 500  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
	private String  bankId ;





    @EntityAttrDictAnnotation(group = "cardType", groupName = "证件类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "card_type")
    @EntityAttrDBAnnotation(attrName="证件类型" ,attrColumn="card_type"  , type = "VARCHAR"      ,  attrLength = 2 , notNull = false )
    @EntityAttrPageAnnotation(title = "证件类型",sort = 600  , pageElement = "select"            , maxLength = 2        ,required=false )
	
    
	private String  cardType ;





    @EntityAttrFkAnnotation(group = "recordUserId",  groupName = "备案人" ,   isFkId = true, dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrDBAnnotation(attrName="备案人" ,attrColumn="record_user_id"  , type = "VARCHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "备案人",sort = 700  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
	private String  recordUserId ;









	public void setFundId(String fundId){
		this.fundId = fundId;
	}

    public String getFundId(){
    	return this.fundId;
    }


	public void setRecordDate(Date recordDate){
		this.recordDate = recordDate;
	}

    public Date getRecordDate(){
    	return this.recordDate;
    }


	public void setRecordAddr(String recordAddr){
		this.recordAddr = recordAddr;
	}

    public String getRecordAddr(){
    	return this.recordAddr;
    }


	public void setBankId(String bankId){
		this.bankId = bankId;
	}

    public String getBankId(){
    	return this.bankId;
    }


	public void setCardType(String cardType){
		this.cardType = cardType;
	}

    public String getCardType(){
    	return this.cardType;
    }


	public void setRecordUserId(String recordUserId){
		this.recordUserId = recordUserId;
	}

    public String getRecordUserId(){
    	return this.recordUserId;
    }



}