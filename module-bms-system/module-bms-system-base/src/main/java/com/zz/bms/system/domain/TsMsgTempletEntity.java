package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity;
/**
 * 消息模板 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsMsgTempletEntity extends BaseBusinessSimpleExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//消息模板名称
	
	private String  msgTempletName ;

	//消息模板类型
	//比如: 邮件 短信 微信        
	private String  msgTempletType ;

	//消息标题
	
	private String  msgTitle ;

	//消息内容
	
	private String  msgContent ;

	//语言
	//比如 1中文  2英文        
	private String  msgLanguage ;

	//模板是否有效
	//yes_no        
	private String  templetEffective ;

	//部门
	
	private String  depId ;

	//机构
	
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