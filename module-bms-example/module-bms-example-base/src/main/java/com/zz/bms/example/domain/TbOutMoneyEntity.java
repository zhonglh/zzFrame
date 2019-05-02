package com.zz.bms.example.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;







/**
 * 出资明细 实体类
 * @author Administrator
 * @date 2019-5-2 19:20:45
 */
public class TbOutMoneyEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrFkAnnotation(group = "investorAgreementId",  groupName = "协议" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbInvestorAgreementBO.class)
    @EntityAttrDBAnnotation(attrName="协议" ,attrColumn="investor_agreement_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "协议",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  investorAgreementId ;





    @EntityAttrFkAnnotation(group = "fundId",  groupName = "基金" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
    @EntityAttrDBAnnotation(attrName="基金" ,attrColumn="fund_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金",sort = 300  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  fundId ;





    @EntityAttrFkAnnotation(group = "investorId",  groupName = "投资人" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbInvestorBO.class)
    @EntityAttrDBAnnotation(attrName="投资人" ,attrColumn="investor_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "投资人",sort = 400  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  investorId ;





    @EntityAttrDBAnnotation(attrName="实际出资金额" ,attrColumn="actual_amount"  , type = "DECIMAL"      ,  attrLength = 14 , notNull = false )
    @EntityAttrPageAnnotation(title = "实际出资金额",sort = 500  , pageElement = "number"            , maxLength = 14        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private BigDecimal  actualAmount ;





    @EntityAttrFkAnnotation(group = "handleDepId",  groupName = "部门" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrDBAnnotation(attrName="部门" ,attrColumn="handle_dep_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "部门",sort = 600  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  handleDepId ;





    @EntityAttrDBAnnotation(attrName="机构" ,attrColumn="handle_organ_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "机构",sort = 700  , pageElement = "text"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  handleOrganId ;





    @EntityAttrFkAnnotation(group = "handleUserId",  groupName = "经办人" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrDBAnnotation(attrName="经办人" ,attrColumn="handle_user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "经办人",sort = 800  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  handleUserId ;





    @EntityAttrDBAnnotation(attrName="到账日期" ,attrColumn="arrival_account_date"  , type = "DATE"       , notNull = true )
    @EntityAttrPageAnnotation(title = "到账日期",sort = 900  , pageElement = "date"                  ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Date  arrivalAccountDate ;





    @EntityAttrDBAnnotation(attrName="附件" ,attrColumn="out_money_files"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "附件",sort = 1000  , pageElement = "multifile"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  outMoneyFiles ;





    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 500 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 1100  , pageElement = "textarea"            , maxLength = 500        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  remark ;









	public void setInvestorAgreementId(String investorAgreementId){
		this.investorAgreementId = investorAgreementId;
	}

    public String getInvestorAgreementId(){
    	return this.investorAgreementId;
    }


	public void setFundId(String fundId){
		this.fundId = fundId;
	}

    public String getFundId(){
    	return this.fundId;
    }


	public void setInvestorId(String investorId){
		this.investorId = investorId;
	}

    public String getInvestorId(){
    	return this.investorId;
    }


	public void setActualAmount(BigDecimal actualAmount){
		this.actualAmount = actualAmount;
	}

    public BigDecimal getActualAmount(){
    	return this.actualAmount;
    }


	public void setHandleDepId(String handleDepId){
		this.handleDepId = handleDepId;
	}

    public String getHandleDepId(){
    	return this.handleDepId;
    }


	public void setHandleOrganId(String handleOrganId){
		this.handleOrganId = handleOrganId;
	}

    public String getHandleOrganId(){
    	return this.handleOrganId;
    }


	public void setHandleUserId(String handleUserId){
		this.handleUserId = handleUserId;
	}

    public String getHandleUserId(){
    	return this.handleUserId;
    }


	public void setArrivalAccountDate(Date arrivalAccountDate){
		this.arrivalAccountDate = arrivalAccountDate;
	}

    public Date getArrivalAccountDate(){
    	return this.arrivalAccountDate;
    }


	public void setOutMoneyFiles(String outMoneyFiles){
		this.outMoneyFiles = outMoneyFiles;
	}

    public String getOutMoneyFiles(){
    	return this.outMoneyFiles;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }



}