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
 * 投资协议 实体类
 * @author Administrator
 * @date 2019-5-2 18:36:10
 */
public class TbInvestorAgreementEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrDBAnnotation(attrName="协议名称" ,attrColumn="agreement_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "协议名称",sort = 200  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  agreementName ;





    @EntityAttrDBAnnotation(attrName="协议代码" ,attrColumn="agreement_code"  , type = "VARCHAR"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "协议代码",sort = 300  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  agreementCode ;





    @EntityAttrFkAnnotation(group = "fundId",  groupName = "认购基金" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbFundBO.class)
    @EntityAttrDBAnnotation(attrName="认购基金" ,attrColumn="fund_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "认购基金",sort = 400  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  fundId ;





    @EntityAttrFkAnnotation(group = "investorId",  groupName = "投资人" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.example.bo.TbInvestorBO.class)
    @EntityAttrDBAnnotation(attrName="投资人" ,attrColumn="investor_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "投资人",sort = 500  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  investorId ;





    @EntityAttrDBAnnotation(attrName="认购金额" ,attrColumn="amount"  , type = "DECIMAL"      ,  attrLength = 14 , notNull = true )
    @EntityAttrPageAnnotation(title = "认购金额",sort = 600  , pageElement = "number"            , maxLength = 14        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private BigDecimal  amount ;





    @EntityAttrDBAnnotation(attrName="实际出资金额" ,attrColumn="actual_amount"  , type = "DECIMAL"      ,  attrLength = 14 , notNull = false )
    @EntityAttrPageAnnotation(title = "实际出资金额",sort = 700  , pageElement = "number"            , maxLength = 14        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private BigDecimal  actualAmount ;





    @EntityAttrDBAnnotation(attrName="协议简述" ,attrColumn="sketch"  , type = "VARCHAR"      ,  attrLength = 500 , notNull = false )
    @EntityAttrPageAnnotation(title = "协议简述",sort = 800  , pageElement = "textarea"            , maxLength = 500        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  sketch ;





    @EntityAttrDBAnnotation(attrName="部门" ,attrColumn="sign_dep_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "部门",sort = 900  , pageElement = "text"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  signDepId ;





    @EntityAttrDBAnnotation(attrName="机构" ,attrColumn="sign_organ_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "机构",sort = 1000  , pageElement = "text"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  signOrganId ;





    @EntityAttrDBAnnotation(attrName="签订人" ,attrColumn="sign_user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "签订人",sort = 1100  , pageElement = "text"            , maxLength = 32        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  signUserId ;





    @EntityAttrDBAnnotation(attrName="签订日期" ,attrColumn="sign_date"  , type = "DATE"       , notNull = true )
    @EntityAttrPageAnnotation(title = "签订日期",sort = 1200  , pageElement = "date"                  ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Date  signDate ;





    @EntityAttrDBAnnotation(attrName="附件" ,attrColumn="agreement_files"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "附件",sort = 1300  , pageElement = "multifile"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  agreementFiles ;





    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 500 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 1400  , pageElement = "textarea"            , maxLength = 500        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  remark ;









	public void setAgreementName(String agreementName){
		this.agreementName = agreementName;
	}

    public String getAgreementName(){
    	return this.agreementName;
    }


	public void setAgreementCode(String agreementCode){
		this.agreementCode = agreementCode;
	}

    public String getAgreementCode(){
    	return this.agreementCode;
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


	public void setAmount(BigDecimal amount){
		this.amount = amount;
	}

    public BigDecimal getAmount(){
    	return this.amount;
    }


	public void setActualAmount(BigDecimal actualAmount){
		this.actualAmount = actualAmount;
	}

    public BigDecimal getActualAmount(){
    	return this.actualAmount;
    }


	public void setSketch(String sketch){
		this.sketch = sketch;
	}

    public String getSketch(){
    	return this.sketch;
    }


	public void setSignDepId(String signDepId){
		this.signDepId = signDepId;
	}

    public String getSignDepId(){
    	return this.signDepId;
    }


	public void setSignOrganId(String signOrganId){
		this.signOrganId = signOrganId;
	}

    public String getSignOrganId(){
    	return this.signOrganId;
    }


	public void setSignUserId(String signUserId){
		this.signUserId = signUserId;
	}

    public String getSignUserId(){
    	return this.signUserId;
    }


	public void setSignDate(Date signDate){
		this.signDate = signDate;
	}

    public Date getSignDate(){
    	return this.signDate;
    }


	public void setAgreementFiles(String agreementFiles){
		this.agreementFiles = agreementFiles;
	}

    public String getAgreementFiles(){
    	return this.agreementFiles;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }



}