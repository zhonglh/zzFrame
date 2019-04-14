package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
/**
 * 部门 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:55
 */
public class TsDepEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="部门名称" ,attrColumn="dep_name"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = true )
    @EntityAttrPageAnnotation(title = "部门名称",sort = 200  , pageElement = "text"            , maxLength = 100        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  depName ;



    @EntityAttrDBAnnotation(attrName="部门代码" ,attrColumn="dep_code"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "部门代码",sort = 300  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  depCode ;



    @EntityAttrDBAnnotation(attrName="部门地址" ,attrColumn="dep_addr"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "部门地址",sort = 400  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  depAddr ;



    @EntityAttrFkAnnotation(group = "pid",  groupName = "上级部门" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrDBAnnotation(attrName="上级部门" ,attrColumn="pid"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "上级部门",sort = 500  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  pid ;



    @EntityAttrDictAnnotation(group = "depStatus", groupName = "状态" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "dep_status")
    @EntityAttrDBAnnotation(attrName="状态" ,attrColumn="dep_status"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "状态",sort = 600  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //0:解散  1: 正常        
	private String  depStatus ;



    @EntityAttrFkAnnotation(group = "leadUserId",  groupName = "负责人" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrDBAnnotation(attrName="负责人" ,attrColumn="lead_user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "负责人",sort = 700  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  leadUserId ;



    @EntityAttrDBAnnotation(attrName="机构" ,attrColumn="organ_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "机构",sort = 800  , pageElement = "text"            , maxLength = 32        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  organId ;



    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 900  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  remark ;





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




	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }


	
}