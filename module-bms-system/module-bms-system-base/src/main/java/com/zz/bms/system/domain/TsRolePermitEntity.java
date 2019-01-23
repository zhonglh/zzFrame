package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 角色许可关联 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:36
 */
public class TsRolePermitEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//角色
	
	private String  roleId ;

	//许可
	
	private String  permitId ;





	public void setRoleId(String roleId){
		this.roleId = roleId;
	}

    public String getRoleId(){
    	return this.roleId;
    }


	public void setPermitId(String permitId){
		this.permitId = permitId;
	}

    public String getPermitId(){
    	return this.permitId;
    }


	
}