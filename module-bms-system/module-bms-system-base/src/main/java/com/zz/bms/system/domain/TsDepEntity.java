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
 * 部门 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsDepEntity extends BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//部门名称
	
	private String  depName ;

	//部门代码
	
	private String  depCode ;

	//部门地址
	
	private String  depAddr ;

	//上级部门
	
	private String  pid ;

	//状态
	//0:解散  1: 正常        
	private String  depStatus ;

	//负责人
	
	private String  leadUserId ;

	//机构
	
	private String  organId ;

	//备注
	
	private String  remark ;

	//租户
	
	private String  tenantId ;





	public void setDepName(String depName){
		this.depName = depName;
	}

    public String getDepName(){
    	return this.depName;
    }


	public void setDepCode(String depCode){
		this.depCode = depCode;
	}

    public String getDepCode(){
    	return this.depCode;
    }


	public void setDepAddr(String depAddr){
		this.depAddr = depAddr;
	}

    public String getDepAddr(){
    	return this.depAddr;
    }


	public void setPid(String pid){
		this.pid = pid;
	}

    public String getPid(){
    	return this.pid;
    }


	public void setDepStatus(String depStatus){
		this.depStatus = depStatus;
	}

    public String getDepStatus(){
    	return this.depStatus;
    }


	public void setLeadUserId(String leadUserId){
		this.leadUserId = leadUserId;
	}

    public String getLeadUserId(){
    	return this.leadUserId;
    }


	public void setOrganId(String organId){
		this.organId = organId;
	}

    public String getOrganId(){
    	return this.organId;
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