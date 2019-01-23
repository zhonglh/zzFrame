package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 许可 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsPermitEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//许可名称
	
	private String  permitName ;

	//许可编号
	
	private String  permitCode ;

	//备注
	
	private String  remark ;





	public void setPermitName(String permitName){
		this.permitName = permitName;
	}

    public String getPermitName(){
    	return this.permitName;
    }


	public void setPermitCode(String permitCode){
		this.permitCode = permitCode;
	}

    public String getPermitCode(){
    	return this.permitCode;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }


	
}