package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.Double;
import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.system.domain.TsFileUseEntity;
/**
 * 文件使用 实体类
 * @author Administrator
 * @date 2019-4-1 13:52:03
 */
public class VsFileUseEntity extends TsFileUseEntity implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="ACCESS_URL" ,type = "DOUBLE"      ,  attrLength = 23 , notNull = false )
    @EntityAttrPageAnnotation(title = "ACCESS_URL",sort = 1700  , pageElement = "text"            , maxLength = 23        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private Double  accessUrl ;



    @EntityAttrDBAnnotation(attrName="文件类型" ,type = "VARCHAR"      ,  attrLength = 60 , notNull = false )
    @EntityAttrPageAnnotation(title = "文件类型",sort = 1800  , pageElement = "text"            , maxLength = 60        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  contentType ;



    @EntityAttrDictAnnotation(group = "fileEngine", groupName = "文件引擎" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "file_engine")
    @EntityAttrDBAnnotation(attrName="文件引擎" ,type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "文件引擎",sort = 1900  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    //文件系统 七牛  阿里云  腾讯 FastNFS MongoDB        
	private String  fileEngine ;



    @EntityAttrDBAnnotation(attrName="文件所在主机" ,type = "VARCHAR"      ,  attrLength = 27 , notNull = false )
    @EntityAttrPageAnnotation(title = "文件所在主机",sort = 2000  , pageElement = "text"            , maxLength = 27        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  fileHost ;



    @EntityAttrDBAnnotation(attrName="FILE_PULL_NAME" ,type = "DOUBLE"      ,  attrLength = 23 , notNull = false )
    @EntityAttrPageAnnotation(title = "FILE_PULL_NAME",sort = 2100  , pageElement = "text"            , maxLength = 23        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private Double  filePullName ;



    @EntityAttrDBAnnotation(attrName="文件大小" ,type = "BIGINT"      ,  attrLength = 19 , notNull = true )
    @EntityAttrPageAnnotation(title = "文件大小",sort = 2200  , pageElement = "text"            , maxLength = 19        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private Long  fileSize ;



    @EntityAttrDBAnnotation(attrName="使用次数" ,type = "INT"      ,  attrLength = 10 , notNull = false )
    @EntityAttrPageAnnotation(title = "使用次数",sort = 2300  , pageElement = "text"            , maxLength = 10        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private Integer  useFrequency ;





	public void setAccessUrl(Double accessUrl){
		this.accessUrl = accessUrl;
	}

    public Double getAccessUrl(){
    	return this.accessUrl;
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


	public void setFileHost(String fileHost){
		this.fileHost = fileHost;
	}

    public String getFileHost(){
    	return this.fileHost;
    }


	public void setFilePullName(Double filePullName){
		this.filePullName = filePullName;
	}

    public Double getFilePullName(){
    	return this.filePullName;
    }


	public void setFileSize(Long fileSize){
		this.fileSize = fileSize;
	}

    public Long getFileSize(){
    	return this.fileSize;
    }


	public void setUseFrequency(Integer useFrequency){
		this.useFrequency = useFrequency;
	}

    public Integer getUseFrequency(){
    	return this.useFrequency;
    }


	
}