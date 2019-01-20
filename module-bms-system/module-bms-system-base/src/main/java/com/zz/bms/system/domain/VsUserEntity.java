package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.system.domain.TsUserEntity;
/**
 * 用户 实体类
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public class VsUserEntity extends TsUserEntity implements java.io.Serializable{


	/**
	 * 直属领导名称
	 */
	private String leadUserName;

	/**
	 * 部门名称
	 */
	private String  depName ;

	/**
	 * 机构名称
	 */
	private String  organName ;

	/**
	 * 企业名称
	 */
	private String  tenantName ;







	public void setDepName(String depName){
		this.depName = depName;
	}

    public String getDepName(){
    	return this.depName;
    }


	public void setOrganName(String organName){
		this.organName = organName;
	}

    public String getOrganName(){
    	return this.organName;
    }


	public void setTenantName(String tenantName){
		this.tenantName = tenantName;
	}

    public String getTenantName(){
    	return this.tenantName;
    }

	public String getLeadUserName() {
		return leadUserName;
	}

	public void setLeadUserName(String leadUserName) {
		this.leadUserName = leadUserName;
	}
}