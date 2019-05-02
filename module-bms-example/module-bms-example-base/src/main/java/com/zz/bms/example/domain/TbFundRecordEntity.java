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
 * @date 2019-5-2 18:36:10
 */
public class TbFundRecordEntity extends com.zz.bms.core.db.entity.BaseEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrFkAnnotation(group = "fundId",  groupName = "基金信息" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
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



}