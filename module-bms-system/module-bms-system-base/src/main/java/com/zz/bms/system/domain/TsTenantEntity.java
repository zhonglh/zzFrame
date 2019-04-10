package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
/**
 * 企业 实体类
 * 也是企业的概念        
 * @author Administrator
 * @date 2019-4-10 11:08:53
 */
public class TsTenantEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="企业名称" ,attrColumn="tenant_name"  , type = "VARCHAR"      ,  attrLength = 150 , notNull = true )
    @EntityAttrPageAnnotation(title = "企业名称",sort = 200  , pageElement = "text"            , maxLength = 150        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  tenantName ;



    @EntityAttrDBAnnotation(attrName="企业编号" ,attrColumn="tenant_code"  , type = "CHAR"      ,  attrLength = 4 , notNull = true )
    @EntityAttrPageAnnotation(title = "企业编号",sort = 300  , pageElement = "text"            , maxLength = 4        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  tenantCode ;



    @EntityAttrDBAnnotation(attrName="企业地址" ,attrColumn="tenant_addr"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "企业地址",sort = 400  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  tenantAddr ;



    @EntityAttrDBAnnotation(attrName="联系电话" ,attrColumn="link_tel"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = false )
    @EntityAttrPageAnnotation(title = "联系电话",sort = 500  , pageElement = "text"            , maxLength = 20        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  linkTel ;



    @EntityAttrDBAnnotation(attrName="法人姓名" ,attrColumn="lead_user_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = false )
    @EntityAttrPageAnnotation(title = "法人姓名",sort = 600  , pageElement = "text"            , maxLength = 50        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  leadUserName ;



    @EntityAttrDBAnnotation(attrName="LOGO" ,attrColumn="logo_file"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "LOGO",sort = 700  , pageElement = "singlefile"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  logoFile ;



    @EntityAttrDBAnnotation(attrName="官网" ,attrColumn="website"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "官网",sort = 800  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  website ;



    @EntityAttrDBAnnotation(attrName="说明" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 2000 , notNull = false )
    @EntityAttrPageAnnotation(title = "说明",sort = 900  , pageElement = "textarea"            , maxLength = 2000        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  remark ;





	public void setTenantName(String tenantName){
		this.tenantName = tenantName;
	}

    public String getTenantName(){
    	return this.tenantName;
    }


	public void setTenantCode(String tenantCode){
		this.tenantCode = tenantCode;
	}

    public String getTenantCode(){
    	return this.tenantCode;
    }


	public void setTenantAddr(String tenantAddr){
		this.tenantAddr = tenantAddr;
	}

    public String getTenantAddr(){
    	return this.tenantAddr;
    }


	public void setLinkTel(String linkTel){
		this.linkTel = linkTel;
	}

    public String getLinkTel(){
    	return this.linkTel;
    }


	public void setLeadUserName(String leadUserName){
		this.leadUserName = leadUserName;
	}

    public String getLeadUserName(){
    	return this.leadUserName;
    }


	public void setLogoFile(String logoFile){
		this.logoFile = logoFile;
	}

    public String getLogoFile(){
    	return this.logoFile;
    }


	public void setWebsite(String website){
		this.website = website;
	}

    public String getWebsite(){
    	return this.website;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }


	
}