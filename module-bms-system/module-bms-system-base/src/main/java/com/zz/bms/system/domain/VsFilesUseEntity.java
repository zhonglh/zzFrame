package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity;
/**
 * 文件使用 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class VsFilesUseEntity extends BaseBusinessSimpleExEntity<String> implements java.io.Serializable{

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

	//租户
	
	private String  tenantId ;

	//访问路径
	//不包括前缀        
	private String  accessUrl ;

	//文件所在主机
	
	private String  fileHost ;

	//文件路径
	
	private String  filePath ;

	//文件名
	
	private String  fileName ;

	//文件大小
	
	private Long  fileSize ;

	//文件后缀
	
	private String  fileSuffix ;

	//文件类型
	
	private String  contentType ;

	//文件引擎
	//文件系统 七牛  阿里云  腾讯 FastNFS MongoDB        
	private String  fileEngine ;

	//MD5码
	
	private String  md5 ;

	//使用次数
	
	private Integer  useFrequency ;





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


	public void setTenantId(String tenantId){
		this.tenantId = tenantId;
	}

    public String getTenantId(){
    	return this.tenantId;
    }


	public void setAccessUrl(String accessUrl){
		this.accessUrl = accessUrl;
	}

    public String getAccessUrl(){
    	return this.accessUrl;
    }


	public void setFileHost(String fileHost){
		this.fileHost = fileHost;
	}

    public String getFileHost(){
    	return this.fileHost;
    }


	public void setFilePath(String filePath){
		this.filePath = filePath;
	}

    public String getFilePath(){
    	return this.filePath;
    }


	public void setFileName(String fileName){
		this.fileName = fileName;
	}

    public String getFileName(){
    	return this.fileName;
    }


	public void setFileSize(Long fileSize){
		this.fileSize = fileSize;
	}

    public Long getFileSize(){
    	return this.fileSize;
    }


	public void setFileSuffix(String fileSuffix){
		this.fileSuffix = fileSuffix;
	}

    public String getFileSuffix(){
    	return this.fileSuffix;
    }


	public void setContentType(String contentType){
		this.contentType = contentType;
	}

    public String getContentType(){
    	return this.contentType;
    }


	public void setFileEngine(String fileEngine){
		this.fileEngine = fileEngine;
	}

    public String getFileEngine(){
    	return this.fileEngine;
    }


	public void setMd5(String md5){
		this.md5 = md5;
	}

    public String getMd5(){
    	return this.md5;
    }


	public void setUseFrequency(Integer useFrequency){
		this.useFrequency = useFrequency;
	}

    public Integer getUseFrequency(){
    	return this.useFrequency;
    }


	
}