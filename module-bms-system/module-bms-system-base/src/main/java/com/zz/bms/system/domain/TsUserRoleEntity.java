package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 用户角色关联 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsUserRoleEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//用户
	
	private String  userId ;

	//角色
	
	private String  roleId ;





	public void setUserId(String userId){
		this.userId = userId;
	}

    public String getUserId(){
    	return this.userId;
    }


	public void setRoleId(String roleId){
		this.roleId = roleId;
	}

    public String getRoleId(){
    	return this.roleId;
    }


	
}