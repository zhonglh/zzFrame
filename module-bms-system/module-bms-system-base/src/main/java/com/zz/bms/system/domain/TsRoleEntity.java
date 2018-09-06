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
 * 角色 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsRoleEntity extends BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//角色名称
	
	private String  roleName ;

	//角色编号
	
	private String  roleCode ;

	//角色类型
	
	private String  roleType ;

	//部门
	
	private String  depId ;

	//机构
	
	private String  organId ;

	//角色状态
	//0: 禁用   1:可用        
	private String  roleStatus ;

	//备注
	
	private String  remark ;

	//租户
	
	private String  tenantId ;





	public void setRoleName(String roleName){
		this.roleName = roleName;
	}

    public String getRoleName(){
    	return this.roleName;
    }


	public void setRoleCode(String roleCode){
		this.roleCode = roleCode;
	}

    public String getRoleCode(){
    	return this.roleCode;
    }


	public void setRoleType(String roleType){
		this.roleType = roleType;
	}

    public String getRoleType(){
    	return this.roleType;
    }


	public void setDepId(String depId){
		this.depId = depId;
	}

    public String getDepId(){
    	return this.depId;
    }


	public void setOrganId(String organId){
		this.organId = organId;
	}

    public String getOrganId(){
    	return this.organId;
    }


	public void setRoleStatus(String roleStatus){
		this.roleStatus = roleStatus;
	}

    public String getRoleStatus(){
    	return this.roleStatus;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }


	public void setTenantId(String tenantId){
		this.tenantId = tenantId;
	}

    public String getTenantId(){
    	return this.tenantId;
    }


	
}