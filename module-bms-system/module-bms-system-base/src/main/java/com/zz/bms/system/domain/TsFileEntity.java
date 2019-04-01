package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseEntity;

/**
 * 文件 实体类
 * @author Administrator
 * @date 2019-3-29 23:20:12
 */
public class TsFileEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="访问路径前缀" ,type = "VARCHAR"      ,  attrLength = 50 , notNull = false )
    @EntityAttrPageAnnotation(title = "访问路径前缀",sort = 200  , pageElement = "text"            , maxLength = 50        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  accessUrlPrefix ;



    @EntityAttrDBAnnotation(attrName="访问路径" ,type = "VARCHAR"      ,  attrLength = 200 , notNull = true )
    @EntityAttrPageAnnotation(title = "访问路径",sort = 300  , pageElement = "text"            , maxLength = 200        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    //不包括前缀        
	private String  accessUrl ;



    @EntityAttrDBAnnotation(attrName="文件所在主机" ,type = "VARCHAR"      ,  attrLength = 27 , notNull = false )
    @EntityAttrPageAnnotation(title = "文件所在主机",sort = 400  , pageElement = "text"            , maxLength = 27        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  fileHost ;



    @EntityAttrDBAnnotation(attrName="FILE_BASE_PATH" ,type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "FILE_BASE_PATH",sort = 500  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  fileBasePath ;



    @EntityAttrDBAnnotation(attrName="文件路径" ,type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "文件路径",sort = 600  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  filePath ;



    @EntityAttrDBAnnotation(attrName="文件名" ,type = "VARCHAR"      ,  attrLength = 100 , notNull = true )
    @EntityAttrPageAnnotation(title = "文件名",sort = 700  , pageElement = "text"            , maxLength = 100        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  fileName ;



    @EntityAttrDBAnnotation(attrName="文件大小" ,type = "BIGINT"      ,  attrLength = 19 , notNull = true )
    @EntityAttrPageAnnotation(title = "文件大小",sort = 800  , pageElement = "text"            , maxLength = 19        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Long  fileSize ;



    @EntityAttrDBAnnotation(attrName="文件后缀" ,type = "VARCHAR"      ,  attrLength = 30 , notNull = false )
    @EntityAttrPageAnnotation(title = "文件后缀",sort = 900  , pageElement = "text"            , maxLength = 30        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  fileSuffix ;



    @EntityAttrDictAnnotation(group = "fileEngine", groupName = "文件引擎" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "file_engine")
    @EntityAttrDBAnnotation(attrName="文件引擎" ,type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "文件引擎",sort = 1000  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //文件系统 七牛  阿里云  腾讯 FastNFS MongoDB        
	private String  fileEngine ;



    @EntityAttrDBAnnotation(attrName="MD5码" ,type = "VARCHAR"      ,  attrLength = 128 , notNull = false )
    @EntityAttrPageAnnotation(title = "MD5码",sort = 1100  , pageElement = "text"            , maxLength = 128        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  md5 ;



    @EntityAttrDBAnnotation(attrName="文件类型" ,type = "VARCHAR"      ,  attrLength = 60 , notNull = false )
    @EntityAttrPageAnnotation(title = "文件类型",sort = 1200  , pageElement = "text"            , maxLength = 60        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  contentType ;



    @EntityAttrDBAnnotation(attrName="使用次数" ,type = "INT"      ,  attrLength = 10 , notNull = false )
    @EntityAttrPageAnnotation(title = "使用次数",sort = 1300  , pageElement = "text"            , maxLength = 10        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Integer  useFrequency ;





	public void setAccessUrlPrefix(String accessUrlPrefix){
		this.accessUrlPrefix = accessUrlPrefix;
	}

    public String getAccessUrlPrefix(){
    	return this.accessUrlPrefix;
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


	public void setFileBasePath(String fileBasePath){
		this.fileBasePath = fileBasePath;
	}

    public String getFileBasePath(){
    	return this.fileBasePath;
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


	public void setContentType(String contentType){
		this.contentType = contentType;
	}

    public String getContentType(){
    	return this.contentType;
    }


	public void setUseFrequency(Integer useFrequency){
		this.useFrequency = useFrequency;
	}

    public Integer getUseFrequency(){
    	return this.useFrequency;
    }


	
}