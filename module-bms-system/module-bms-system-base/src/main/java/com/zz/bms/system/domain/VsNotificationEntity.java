package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity;




/**
 * 系统通知 实体类
 * @author Administrator
 * @date 2019-6-8 21:53:17
 */
public class VsNotificationEntity extends BaseBusinessSimpleExEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrDBAnnotation(attrName="模块" ,attrColumn="notify_module"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "模块",sort = 200  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "2")
    
	private String  notifyModule ;





    @EntityAttrDBAnnotation(attrName="通知标题" ,attrColumn="title"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "通知标题",sort = 300  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "2")
    
	private String  title ;





    @EntityAttrDBAnnotation(attrName="通知内容" ,attrColumn="content"  , type = "TEXT"      ,  attrLength = 65535 , notNull = true )
    @EntityAttrPageAnnotation(title = "通知内容",sort = 400  , pageElement = "textarea"            , maxLength = 65535        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "2")
    
	private String  content ;





    @EntityAttrDBAnnotation(attrName="通知时间" ,attrColumn="notify_time"  , type = "TIMESTAMP"       , notNull = true )
    @EntityAttrPageAnnotation(title = "通知时间",sort = 500  , pageElement = "timestamp"                  ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "2")
    
	private Timestamp  notifyTime ;





    @EntityAttrDBAnnotation(attrName="通知文件" ,attrColumn="notify_files"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "通知文件",sort = 600  , pageElement = "multifile"            , maxLength = 32        ,required=false )
	
    
	private String  notifyFiles ;





    @EntityAttrFkAnnotation(group = "receiveUserId",  groupName = "接收人" ,   isFkId = true, dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.VsUserBO.class)
    @EntityAttrDBAnnotation(attrName="接收人" ,attrColumn="receive_user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "接收人",sort = 1500  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
	private String  receiveUserId ;





    @EntityAttrDBAnnotation(attrName="读取时间" ,attrColumn="read_time"  , type = "TIMESTAMP"       , notNull = true )
    @EntityAttrPageAnnotation(title = "读取时间",sort = 1600  , pageElement = "timestamp"                  ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "2")
    
	private Timestamp  readTime ;





    @EntityAttrDictAnnotation(group = "isRead", groupName = "已读" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="已读" ,attrColumn="is_read"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "已读",sort = 1700  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    //yes_no        
	private String  isRead ;





    @EntityAttrDBAnnotation(attrName="用户姓名" ,attrColumn="send_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "用户姓名",sort = 1800  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "2")
    
	private String  sendName ;





    @EntityAttrDBAnnotation(attrName="用户姓名" ,attrColumn="receive_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "用户姓名",sort = 1900  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "2")
    
	private String  receiveName ;









	public void setNotifyModule(String notifyModule){
		this.notifyModule = notifyModule;
	}

    public String getNotifyModule(){
    	return this.notifyModule;
    }


	public void setTitle(String title){
		this.title = title;
	}

    public String getTitle(){
    	return this.title;
    }


	public void setContent(String content){
		this.content = content;
	}

    public String getContent(){
    	return this.content;
    }


	public void setNotifyTime(Timestamp notifyTime){
		this.notifyTime = notifyTime;
	}

    public Timestamp getNotifyTime(){
    	return this.notifyTime;
    }


	public void setNotifyFiles(String notifyFiles){
		this.notifyFiles = notifyFiles;
	}

    public String getNotifyFiles(){
    	return this.notifyFiles;
    }


	public void setReceiveUserId(String receiveUserId){
		this.receiveUserId = receiveUserId;
	}

    public String getReceiveUserId(){
    	return this.receiveUserId;
    }


	public void setReadTime(Timestamp readTime){
		this.readTime = readTime;
	}

    public Timestamp getReadTime(){
    	return this.readTime;
    }


	public void setIsRead(String isRead){
		this.isRead = isRead;
	}

    public String getIsRead(){
    	return this.isRead;
    }


	public void setSendName(String sendName){
		this.sendName = sendName;
	}

    public String getSendName(){
    	return this.sendName;
    }


	public void setReceiveName(String receiveName){
		this.receiveName = receiveName;
	}

    public String getReceiveName(){
    	return this.receiveName;
    }



}