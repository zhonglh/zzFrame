package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
/**
 * 租户 实体类
 * 也是企业的概念        
 * @author Administrator
 * @date 2018-9-7 0:01:36
 */
public class TsTenantEntity extends BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//企业名称
	
	private String  tenantName ;

	//企业编号
	
	private String  tenantCode ;

	//企业地址
	
	private String  tenantAddr ;

	//联系电话
	
	private String  linkTel ;

	//法人姓名
	
	private String  leadUserName ;

	//LOGO
	
	private String  logoFile ;

	//官网
	
	private String  website ;

	//说明
	
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