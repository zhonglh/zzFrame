package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity;
/**
 * 消息模板 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:55
 */
public class TsMsgTempletEntity extends com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="消息模板名称" ,attrColumn="msg_templet_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "消息模板名称",sort = 200  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  msgTempletName ;



    @EntityAttrDictAnnotation(group = "msgTempletType", groupName = "消息模板类型" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "msg_templet_type")
    @EntityAttrDBAnnotation(attrName="消息模板类型" ,attrColumn="msg_templet_type"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "消息模板类型",sort = 300  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //比如: 邮件 短信 微信        
	private String  msgTempletType ;



    @EntityAttrDBAnnotation(attrName="消息标题" ,attrColumn="msg_title"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "消息标题",sort = 400  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  msgTitle ;



    @EntityAttrDBAnnotation(attrName="消息内容" ,attrColumn="msg_content"  , type = "VARCHAR"      ,  attrLength = 5000 , notNull = true )
    @EntityAttrPageAnnotation(title = "消息内容",sort = 500  , pageElement = "textarea"            , maxLength = 5000        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  msgContent ;



    @EntityAttrDictAnnotation(group = "msgLanguage", groupName = "语言" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "msg_language")
    @EntityAttrDBAnnotation(attrName="语言" ,attrColumn="msg_language"  , type = "CHAR"      ,  attrLength = 1 , notNull = false )
    @EntityAttrPageAnnotation(title = "语言",sort = 600  , pageElement = "select"            , maxLength = 1        ,required=false )
	
    
    //比如 1中文  2英文        
	private String  msgLanguage ;



    @EntityAttrDictAnnotation(group = "templetEffective", groupName = "模板是否有效" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="模板是否有效" ,attrColumn="templet_effective"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "模板是否有效",sort = 700  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //yes_no        
	private String  templetEffective ;



    @EntityAttrFkAnnotation(group = "depId",  groupName = "部门" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrDBAnnotation(attrName="部门" ,attrColumn="dep_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "部门",sort = 800  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  depId ;



    @EntityAttrDBAnnotation(attrName="机构" ,attrColumn="organ_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "机构",sort = 900  , pageElement = "text"            , maxLength = 32        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  organId ;





	public void setMsgTempletName(String msgTempletName){
		this.msgTempletName = msgTempletName;
	}

    public String getMsgTempletName(){
    	return this.msgTempletName;
    }


	public void setMsgTempletType(String msgTempletType){
		this.msgTempletType = msgTempletType;
	}

    public String getMsgTempletType(){
    	return this.msgTempletType;
    }


	public void setMsgTitle(String msgTitle){
		this.msgTitle = msgTitle;
	}

    public String getMsgTitle(){
    	return this.msgTitle;
    }


	public void setMsgContent(String msgContent){
		this.msgContent = msgContent;
	}

    public String getMsgContent(){
    	return this.msgContent;
    }


	public void setMsgLanguage(String msgLanguage){
		this.msgLanguage = msgLanguage;
	}

    public String getMsgLanguage(){
    	return this.msgLanguage;
    }


	public void setTempletEffective(String templetEffective){
		this.templetEffective = templetEffective;
	}

    public String getTempletEffective(){
    	return this.templetEffective;
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


	
}