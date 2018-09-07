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
 * 机构 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsOrganEntity extends BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//机构名称
	
	private String  organName ;

	//机构代码
	
	private String  organCode ;

	//机构类型
	//具体的参考业务要求        
	private String  organType ;

	//机构地址
	
	private String  organAddr ;

	//上级机构
	
	private String  pid ;

	//状态
	
	private String  organStatus ;

	//负责人
	
	private String  leadUserId ;

	//备注
	
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