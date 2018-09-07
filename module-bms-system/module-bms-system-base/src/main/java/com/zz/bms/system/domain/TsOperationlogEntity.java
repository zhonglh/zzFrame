package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 操作日志 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsOperationlogEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//操作类型
	
	private String  operationType ;

	//实体类型
	
	private String  entityType ;

	//操作说明
	
	private String  operationlogName ;

	//部门
	
	private String  depId ;

	//机构
	
	private String  organId ;

	//操作人
	
	private String  operationUserId ;

	//操作人IP
	
	private String  operationIp ;

	//操作人名称
	
	private String  operationUserName ;

	//操作时间
	
	private Timestamp  operationTime ;






	public void setOperationType(String operationType){
		this.operationType = operationType;
	}

    public String getOperationType(){
    	return this.operationType;
    }


	public void setEntityType(String entityType){
		this.entityType = entityType;
	}

    public String getEntityType(){
    	return this.entityType;
    }


	public void setOperationlogName(String operationlogName){
		this.operationlogName = operationlogName;
	}

    public String getOperationlogName(){
    	return this.operationlogName;
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


	public void setOperationUserId(String operationUserId){
		this.operationUserId = operationUserId;
	}

    public String getOperationUserId(){
    	return this.operationUserId;
    }


	public void setOperationIp(String operationIp){
		this.operationIp = operationIp;
	}

    public String getOperationIp(){
    	return this.operationIp;
    }


	public void setOperationUserName(String operationUserName){
		this.operationUserName = operationUserName;
	}

    public String getOperationUserName(){
    	return this.operationUserName;
    }


	public void setOperationTime(Timestamp operationTime){
		this.operationTime = operationTime;
	}

    public Timestamp getOperationTime(){
    	return this.operationTime;
    }




	
}