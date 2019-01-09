package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity;
/**
 * 系统通知 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:36
 */
public class TsNotificationEntity extends BaseBusinessSimpleExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//接收人
	
	private String  toUserId ;

	//模块
	
	private String  notifyModule ;

	//通知标题
	
	private String  title ;

	//通知内容
	
	private String  content ;

	//通知时间
	
	private Date  notifyTime ;

	//已读
	//yes_no        
	private String  isRead ;






	public void setToUserId(String toUserId){
		this.toUserId = toUserId;
	}

    public String getToUserId(){
    	return this.toUserId;
    }


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


	public void setNotifyTime(Date notifyTime){
		this.notifyTime = notifyTime;
	}

    public Date getNotifyTime(){
    	return this.notifyTime;
    }


	public void setIsRead(String isRead){
		this.isRead = isRead;
	}

    public String getIsRead(){
    	return this.isRead;
    }




	
}