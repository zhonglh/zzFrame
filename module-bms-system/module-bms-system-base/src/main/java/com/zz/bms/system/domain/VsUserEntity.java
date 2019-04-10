package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.system.domain.TsUserEntity;
/**
 * 用户 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:52
 */
public class VsUserEntity extends TsUserEntity implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="部门名称" ,attrColumn="dep_name"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "部门名称",sort = 2700  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  depName ;



    @EntityAttrDBAnnotation(attrName="机构名称" ,attrColumn="organ_name"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = true )
    @EntityAttrPageAnnotation(title = "机构名称",sort = 2800  , pageElement = "text"            , maxLength = 100        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  organName ;



    @EntityAttrDBAnnotation(attrName="企业名称" ,attrColumn="tenant_name"  , type = "VARCHAR"      ,  attrLength = 150 , notNull = true )
    @EntityAttrPageAnnotation(title = "企业名称",sort = 2900  , pageElement = "text"            , maxLength = 150        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
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


	
}