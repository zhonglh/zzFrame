package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 登陆日志 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:55
 */
public class TsLoginLogEntity extends com.zz.bms.core.db.entity.BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDictAnnotation(group = "operationType", groupName = "操作类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "operation_type")
    @EntityAttrDBAnnotation(attrName="操作类型" ,attrColumn="operation_type"  , type = "VARCHAR"      ,  attrLength = 2 , notNull = true )
    @EntityAttrPageAnnotation(title = "操作类型",sort = 200  , pageElement = "select"            , maxLength = 2        ,required=true )
	
    
    
	private String  operationType ;



    @EntityAttrDBAnnotation(attrName="操作说明" ,attrColumn="operationlog_name"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "操作说明",sort = 300  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    //1: 登陆   2:退出  3:强制退出  4:踢出        
	private String  operationlogName ;



    @EntityAttrFkAnnotation(group = "depId",  groupName = "部门" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrDBAnnotation(attrName="部门" ,attrColumn="dep_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "部门",sort = 400  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  depId ;



    @EntityAttrDBAnnotation(attrName="机构" ,attrColumn="organ_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "机构",sort = 500  , pageElement = "text"            , maxLength = 32        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  organId ;



    @EntityAttrDBAnnotation(attrName="操作人" ,attrColumn="operation_user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "操作人",sort = 600  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  operationUserId ;



    @EntityAttrDBAnnotation(attrName="操作人IP" ,attrColumn="operation_ip"  , type = "VARCHAR"      ,  attrLength = 30 , notNull = false )
    @EntityAttrPageAnnotation(title = "操作人IP",sort = 700  , pageElement = "text"            , maxLength = 30        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  operationIp ;



    @EntityAttrDBAnnotation(attrName="操作人名称" ,attrColumn="operation_user_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "操作人名称",sort = 800  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  operationUserName ;



    @EntityAttrDBAnnotation(attrName="操作时间" ,attrColumn="operation_time"  , type = "TIMESTAMP"       , notNull = true )
    @EntityAttrPageAnnotation(title = "操作时间",sort = 900  , pageElement = "timestamp"                  ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Timestamp  operationTime ;





	public void setOperationType(String operationType){
		this.operationType = operationType;
	}

    public String getOperationType(){
    	return this.operationType;
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