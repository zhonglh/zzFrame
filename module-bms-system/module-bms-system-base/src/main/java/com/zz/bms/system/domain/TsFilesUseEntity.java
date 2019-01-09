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
 * 文件使用 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsFilesUseEntity extends BaseBusinessSimpleExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//文件ID
	
	private String  fileId ;

	//显示名称
	
	private String  showName ;

	//业务类型
	
	private String  businessType ;

	//业务临时ID
	
	private String  businessTmpId ;

	//业务ID
	
	private String  businessId ;

	//顺序
	
	private Integer  fileOrder ;

	//备注
	
	private String  remark ;






	public void setFileId(String fileId){
		this.fileId = fileId;
	}

    public String getFileId(){
    	return this.fileId;
    }


	public void setShowName(String showName){
		this.showName = showName;
	}

    public String getShowName(){
    	return this.showName;
    }


	public void setBusinessType(String businessType){
		this.businessType = businessType;
	}

    public String getBusinessType(){
    	return this.businessType;
    }


	public void setBusinessTmpId(String businessTmpId){
		this.businessTmpId = businessTmpId;
	}

    public String getBusinessTmpId(){
    	return this.businessTmpId;
    }


	public void setBusinessId(String businessId){
		this.businessId = businessId;
	}

    public String getBusinessId(){
    	return this.businessId;
    }


	public void setFileOrder(Integer fileOrder){
		this.fileOrder = fileOrder;
	}

    public Integer getFileOrder(){
    	return this.fileOrder;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }




	
}