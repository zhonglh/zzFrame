package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 角色许可关联 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:53
 */
public class TsRolePermitEntity extends com.zz.bms.core.db.entity.BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrFkAnnotation(group = "roleId",  groupName = "角色" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsRoleBO.class)
    @EntityAttrDBAnnotation(attrName="角色" ,attrColumn="role_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "角色",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  roleId ;



    @EntityAttrFkAnnotation(group = "permitId",  groupName = "许可" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsPermitBO.class)
    @EntityAttrDBAnnotation(attrName="许可" ,attrColumn="permit_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "许可",sort = 300  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
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