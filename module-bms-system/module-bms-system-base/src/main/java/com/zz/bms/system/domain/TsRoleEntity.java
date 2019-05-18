package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity;
/**
 * 角色 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:53
 */
public class TsRoleEntity extends com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="角色名称" ,attrColumn="role_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "角色名称",sort = 200  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  roleName ;



    @EntityAttrDBAnnotation(attrName="角色编号" ,attrColumn="role_code"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "角色编号",sort = 300  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  roleCode ;



    @EntityAttrDictAnnotation(group = "roleType", groupName = "角色类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "role_type")
    @EntityAttrDBAnnotation(attrName="角色类型" ,attrColumn="role_type"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "角色类型",sort = 400  , pageElement = "select"            , maxLength = 1        ,required=true )
	private String  roleType ;



    @EntityAttrFkAnnotation(group = "depId",  groupName = "部门" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrDBAnnotation(attrName="部门" ,attrColumn="dep_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "部门",sort = 500  , pageElement = "text"            , maxLength = 32   , defaultType = DefaultTypeConstant.CURRENT_USER_DEPTNAME     ,required=false )
	private String  depId ;





    @EntityAttrDictAnnotation(group = "roleStatus", groupName = "角色状态" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "role_status")
    @EntityAttrDBAnnotation(attrName="角色状态" ,attrColumn="role_status"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "角色状态",sort = 700  , pageElement = "select"            , maxLength = 1        ,required=true )
    //0: 禁用   1:可用        
	private String  roleStatus ;



    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 800  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3" , width = 100)
	private String  remark ;





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


	
}