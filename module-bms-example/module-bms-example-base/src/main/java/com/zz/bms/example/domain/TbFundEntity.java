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
 * 基金 实体类
 * @author Administrator
 * @date 2019-5-2 19:20:45
 */
public class TbFundEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrDBAnnotation(attrName="基金名称" ,attrColumn="fund_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金名称",sort = 200  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  fundName ;





    @EntityAttrDBAnnotation(attrName="基金代码" ,attrColumn="fund_code"  , type = "VARCHAR"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金代码",sort = 300  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  fundCode ;





    @EntityAttrDictAnnotation(group = "fundType", groupName = "基金类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "fund_type")
    @EntityAttrDBAnnotation(attrName="基金类型" ,attrColumn="fund_type"  , type = "VARCHAR"      ,  attrLength = 2 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金类型",sort = 400  , pageElement = "select"            , maxLength = 2        ,required=true )
	
    
    
	private String  fundType ;





    @EntityAttrDictAnnotation(group = "fundDirection", groupName = "基金投向" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "fund_direction")
    @EntityAttrDBAnnotation(attrName="基金投向" ,attrColumn="fund_direction"  , type = "VARCHAR"      ,  attrLength = 2 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金投向",sort = 500  , pageElement = "select"            , maxLength = 2        ,required=true )
	
    
    
	private String  fundDirection ;





    @EntityAttrDBAnnotation(attrName="起购金额" ,attrColumn="start_money"  , type = "DECIMAL"      ,  attrLength = 14 , notNull = true )
    @EntityAttrPageAnnotation(title = "起购金额",sort = 600  , pageElement = "number"            , maxLength = 14        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private BigDecimal  startMoney ;





    @EntityAttrDictAnnotation(group = "managType", groupName = "管理类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "manag_type")
    @EntityAttrDBAnnotation(attrName="管理类型" ,attrColumn="manag_type"  , type = "VARCHAR"      ,  attrLength = 2 , notNull = true )
    @EntityAttrPageAnnotation(title = "管理类型",sort = 700  , pageElement = "select"            , maxLength = 2        ,required=true )
	
    
    
	private String  managType ;





    @EntityAttrDBAnnotation(attrName="基金规模" ,attrColumn="fund_scale"  , type = "DECIMAL"      ,  attrLength = 14 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金规模",sort = 800  , pageElement = "number"            , maxLength = 14        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private BigDecimal  fundScale ;





    @EntityAttrFkAnnotation(group = "managerUserId",  groupName = "基金经理" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrDBAnnotation(attrName="基金经理" ,attrColumn="manager_user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "基金经理",sort = 900  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  managerUserId ;





    @EntityAttrDBAnnotation(attrName="成立日期" ,attrColumn="start_date"  , type = "DATE"       , notNull = false )
    @EntityAttrPageAnnotation(title = "成立日期",sort = 1000  , pageElement = "date"                  ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Date  startDate ;





    @EntityAttrDBAnnotation(attrName="到期日期" ,attrColumn="end_date"  , type = "DATE"       , notNull = false )
    @EntityAttrPageAnnotation(title = "到期日期",sort = 1100  , pageElement = "date"                  ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Date  endDate ;





    @EntityAttrDBAnnotation(attrName="投资领域" ,attrColumn="investment_field"  , type = "VARCHAR"      ,  attrLength = 500 , notNull = false )
    @EntityAttrPageAnnotation(title = "投资领域",sort = 1200  , pageElement = "textarea"            , maxLength = 500        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  investmentField ;





    @EntityAttrDBAnnotation(attrName="收入分配" ,attrColumn="income_allocation"  , type = "VARCHAR"      ,  attrLength = 500 , notNull = false )
    @EntityAttrPageAnnotation(title = "收入分配",sort = 1300  , pageElement = "textarea"            , maxLength = 500        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  incomeAllocation ;





    @EntityAttrDBAnnotation(attrName="附件" ,attrColumn="fund_files"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "附件",sort = 1400  , pageElement = "multifile"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  fundFiles ;





    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 500 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 1500  , pageElement = "textarea"            , maxLength = 500        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  remark ;





    @EntityAttrFkAnnotation(group = "depId",  groupName = "部门" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrDBAnnotation(attrName="部门" ,attrColumn="dep_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "部门",sort = 1600  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  depId ;









	public void setFundName(String fundName){
		this.fundName = fundName;
	}

    public String getFundName(){
    	return this.fundName;
    }


	public void setFundCode(String fundCode){
		this.fundCode = fundCode;
	}

    public String getFundCode(){
    	return this.fundCode;
    }


	public void setFundType(String fundType){
		this.fundType = fundType;
	}

    public String getFundType(){
    	return this.fundType;
    }


	public void setFundDirection(String fundDirection){
		this.fundDirection = fundDirection;
	}

    public String getFundDirection(){
    	return this.fundDirection;
    }


	public void setStartMoney(BigDecimal startMoney){
		this.startMoney = startMoney;
	}

    public BigDecimal getStartMoney(){
    	return this.startMoney;
    }


	public void setManagType(String managType){
		this.managType = managType;
	}

    public String getManagType(){
    	return this.managType;
    }


	public void setFundScale(BigDecimal fundScale){
		this.fundScale = fundScale;
	}

    public BigDecimal getFundScale(){
    	return this.fundScale;
    }


	public void setManagerUserId(String managerUserId){
		this.managerUserId = managerUserId;
	}

    public String getManagerUserId(){
    	return this.managerUserId;
    }


	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}

    public Date getStartDate(){
    	return this.startDate;
    }


	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}

    public Date getEndDate(){
    	return this.endDate;
    }


	public void setInvestmentField(String investmentField){
		this.investmentField = investmentField;
	}

    public String getInvestmentField(){
    	return this.investmentField;
    }


	public void setIncomeAllocation(String incomeAllocation){
		this.incomeAllocation = incomeAllocation;
	}

    public String getIncomeAllocation(){
    	return this.incomeAllocation;
    }


	public void setFundFiles(String fundFiles){
		this.fundFiles = fundFiles;
	}

    public String getFundFiles(){
    	return this.fundFiles;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }


	public void setDepId(String depId){
		this.depId = depId;
	}

    public String getDepId(){
    	return this.depId;
    }



}