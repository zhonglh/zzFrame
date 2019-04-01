package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity;
import com.zz.bms.util.configs.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrDictAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrFkAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrPageAnnotation;
/**
 * 文件使用 实体类
 * @author Administrator
 * @date 2019-3-29 23:20:11
 */
public class TsFileUseEntity extends BaseBusinessSimpleExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="文件ID" ,type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "文件ID",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  fileId ;



    @EntityAttrDBAnnotation(attrName="显示名称" ,type = "VARCHAR"      ,  attrLength = 100 , notNull = true )
    @EntityAttrPageAnnotation(title = "显示名称",sort = 300  , pageElement = "text"            , maxLength = 100        ,required=true )
	
    
    
	private String  showName ;



    @EntityAttrDictAnnotation(group = "businessType", groupName = "业务类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "business_type")
    @EntityAttrDBAnnotation(attrName="业务类型" ,type = "VARCHAR"      ,  attrLength = 2 , notNull = true )
    @EntityAttrPageAnnotation(title = "业务类型",sort = 400  , pageElement = "select"            , maxLength = 2        ,required=true )
	
    
    
	private String  businessType ;



    @EntityAttrDBAnnotation(attrName="业务临时ID" ,type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "业务临时ID",sort = 500  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  businessTmpId ;



    @EntityAttrDBAnnotation(attrName="业务ID" ,type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "业务ID",sort = 600  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  businessId ;



    @EntityAttrDBAnnotation(attrName="顺序" ,type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "顺序",sort = 700  , pageElement = "text"            , maxLength = 10        ,required=true )
	
    
    
	private Integer  fileOrder ;



    @EntityAttrDBAnnotation(attrName="备注" ,type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 800  , pageElement = "text"            , maxLength = 200        ,required=false )
	
    
    
	private String  remark ;



    @EntityAttrFkAnnotation(group = "tenantId",  groupName = "租户" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsTenantBO.class)
    @EntityAttrDBAnnotation(attrName="租户" ,type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "租户",sort = 1600  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  tenantId ;





	public void setFileId(String fileId){
		this.fileId = fileId;
	}

    public String getFileId(){
    	return this.fileId;
    }


	public void setShowName(String showName){
		this.showName = showName;
	}

    public String getShowName(){
    	return this.showName;
    }


	public void setBusinessType(String businessType){
		this.businessType = businessType;
	}

    public String getBusinessType(){
    	return this.businessType;
    }


	public void setBusinessTmpId(String businessTmpId){
		this.businessTmpId = businessTmpId;
	}

    public String getBusinessTmpId(){
    	return this.businessTmpId;
    }


	public void setBusinessId(String businessId){
		this.businessId = businessId;
	}

    public String getBusinessId(){
    	return this.businessId;
    }


	public void setFileOrder(Integer fileOrder){
		this.fileOrder = fileOrder;
	}

    public Integer getFileOrder(){
    	return this.fileOrder;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }



}