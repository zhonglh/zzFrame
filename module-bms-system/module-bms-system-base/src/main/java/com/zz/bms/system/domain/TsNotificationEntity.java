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
 * @date 2019-4-10 11:08:51
 */
public class TsNotificationEntity extends com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="模块" ,attrColumn="notify_module"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "模块",sort = 200  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  notifyModule ;



    @EntityAttrDBAnnotation(attrName="通知标题" ,attrColumn="title"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "通知标题",sort = 300  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  title ;



    @EntityAttrDBAnnotation(attrName="通知内容" ,attrColumn="content"  , type = "TEXT"      ,  attrLength = 65535 , notNull = true )
    @EntityAttrPageAnnotation(title = "通知内容",sort = 400  , pageElement = "textarea"            , maxLength = 65535        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  content ;



    @EntityAttrDBAnnotation(attrName="通知时间" ,attrColumn="notify_time"  , type = "TIMESTAMP"       , notNull = true )
    @EntityAttrPageAnnotation(title = "通知时间",sort = 500  , pageElement = "timestamp"                  ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Timestamp  notifyTime ;



    @EntityAttrDBAnnotation(attrName="通知文件" ,attrColumn="notify_files"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "通知文件",sort = 600  , pageElement = "multifile"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  notifyFiles ;





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


	
}