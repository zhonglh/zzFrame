package com.zz.bms.oss.base.entity;



import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;

import java.io.Serializable;

/**
 * 文件实体类
 * 
 * @author Administrator
 * @date 2018-7-18 20:37:13
 */
@EntityAnnotation(value="文件" , resource = "oss.files")
@TableName(value="ts_files" , resultMap = "TsFilesResultMap")
public class TsFilesEntity extends BaseBusinessExEntity<String> implements Serializable {

	private static final long serialVersionUID = 1L;


    //@EntityAttrDBAnnotation(attrName="访问路径",sort=1  , attrLength=200    )
	//不包括前缀  
	private String accessUrl;


    //@EntityAttrDBAnnotation(attrName="文件所在主机",sort=2  , attrLength=30    )
	private String fileHost;


    //@EntityAttrDBAnnotation(attrName="文件路径",sort=3  , attrLength=200    )
	private String filePath;


    //@EntityAttrDBAnnotation(attrName="文件名",sort=4  , attrLength=100    )
	private String fileName;


    //@EntityAttrDBAnnotation(attrName="文件大小",sort=5  , attrLength=0    )
	private Long fileSize;


    //@EntityAttrDBAnnotation(attrName="文件后缀",sort=6  , attrLength=10    )
	private String fileSuffix;


    //@EntityAttrDBAnnotation(attrName="文件引擎",sort=7  , attrLength=20    )
	//文件系统 七牛  阿里云  腾讯 FastNFS MongoDB
	//参考EnumFileEngine
	private String fileEngine;


    //@EntityAttrDBAnnotation(attrName="文件类型",sort=8  , attrLength=50    )
	private String contentType;


    //@EntityAttrDBAnnotation(attrName="MD5码",sort=9  , attrLength=128    )
	private String md5;


    //@EntityAttrDBAnnotation(attrName="使用次数",sort=10  , attrLength=0    )
	private Integer useFrequency;


	public String getAccessUrl() {
		return accessUrl;
	}

	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}

	public String getFileHost() {
		return fileHost;
	}

	public void setFileHost(String fileHost) {
		this.fileHost = fileHost;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileSuffix() {
		return fileSuffix;
	}

	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}

	public String getFileEngine() {
		return fileEngine;
	}

	public void setFileEngine(String fileEngine) {
		this.fileEngine = fileEngine;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public Integer getUseFrequency() {
		return useFrequency;
	}

	public void setUseFrequency(Integer useFrequency) {
		this.useFrequency = useFrequency;
	}
}