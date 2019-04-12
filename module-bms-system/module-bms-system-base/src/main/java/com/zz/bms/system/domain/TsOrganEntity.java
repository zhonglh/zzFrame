package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
/**
 * 机构 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:52
 */
public class TsOrganEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="机构名称" ,attrColumn="organ_name"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = true )
    @EntityAttrPageAnnotation(title = "机构名称",sort = 200  , pageElement = "text"            , maxLength = 100        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  organName ;



    @EntityAttrDBAnnotation(attrName="机构代码" ,attrColumn="organ_code"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "机构代码",sort = 300  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  organCode ;



    @EntityAttrDictAnnotation(group = "organType", groupName = "机构类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "organ_type")
    @EntityAttrDBAnnotation(attrName="机构类型" ,attrColumn="organ_type"  , type = "CHAR"      ,  attrLength = 1 , notNull = false )
    @EntityAttrPageAnnotation(title = "机构类型",sort = 400  , pageElement = "select"            , maxLength = 1        ,required=false )
    //具体的参考业务要求        
	private String  organType ;



    @EntityAttrDBAnnotation(attrName="机构地址" ,attrColumn="organ_addr"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "机构地址",sort = 500  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  organAddr ;



    @EntityAttrFkAnnotation(group = "pid",  groupName = "上级机构" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsOrganBO.class)
    @EntityAttrDBAnnotation(attrName="上级机构" ,attrColumn="pid"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "上级机构",sort = 600  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  pid ;



    @EntityAttrDictAnnotation(group = "organStatus", groupName = "状态" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "organ_status")
    @EntityAttrDBAnnotation(attrName="状态" ,attrColumn="organ_status"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "状态",sort = 700  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //1:正常 0:解散        
	private String  organStatus ;



    @EntityAttrFkAnnotation(group = "leadUserId",  groupName = "负责人" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrDBAnnotation(attrName="负责人" ,attrColumn="lead_user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "负责人",sort = 800  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  leadUserId ;



    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 900  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  remark ;





	public void setOrganName(String organName){
		this.organName = organName;
	}

    public String getOrganName(){
    	return this.organName;
    }


	public void setOrganCode(String organCode){
		this.organCode = organCode;
	}

    public String getOrganCode(){
    	return this.organCode;
    }


	public void setOrganType(String organType){
		this.organType = organType;
	}

    public String getOrganType(){
    	return this.organType;
    }


	public void setOrganAddr(String organAddr){
		this.organAddr = organAddr;
	}

    public String getOrganAddr(){
    	return this.organAddr;
    }


	public void setPid(String pid){
		this.pid = pid;
	}

    public String getPid(){
    	return this.pid;
    }


	public void setOrganStatus(String organStatus){
		this.organStatus = organStatus;
	}

    public String getOrganStatus(){
    	return this.organStatus;
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