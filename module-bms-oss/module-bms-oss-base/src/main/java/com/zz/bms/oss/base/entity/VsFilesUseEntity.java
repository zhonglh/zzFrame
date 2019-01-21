package com.zz.bms.oss.base.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;

import java.lang.String;

/**
 * 文件使用视图实体类
 * 
 * @author Administrator
 * @date 2018-7-19 23:40:02
 */
@EntityAnnotation(value="文件使用" , resource = "oss.filesuse")
@TableName(value="vs_files_use" , resultMap = "VsFilesUseResultMap")
public class VsFilesUseEntity extends TsFilesUseEntity {

	private static final long serialVersionUID = 1L;

    //@EntityAttrDBAnnotation(attrName="访问路径",sort=15  , attrLength=200    )
	//不包括前缀  
	private String accessUrl;


    //@EntityAttrDBAnnotation(attrName="文件所在主机",sort=16  , attrLength=30    )
	private String fileHost;


    //@EntityAttrDBAnnotation(attrName="文件路径",sort=17  , attrLength=200    )
	private String filePath;


    //@EntityAttrDBAnnotation(attrName="文件大小",sort=18  , attrLength=0    )
	private Long fileSize;


    //@EntityAttrDBAnnotation(attrName="文件后缀",sort=19  , attrLength=10    )
	private String fileSuffix;


    //@EntityAttrDBAnnotation(attrName="文件名",sort=20  , attrLength=100    )
	private String fileName;


    //@EntityAttrDBAnnotation(attrName="文件类型",sort=21  , attrLength=50    )
	private String contentType;


    //@EntityAttrDBAnnotation(attrName="文件引擎",sort=22  , attrLength=20    )
	//文件系统 七牛  阿里云  腾讯 FastNFS MongoDB  
	private String fileEngine;

	//@EntityAttrDBAnnotation(attrName="md5",sort=23  , attrLength=60    )
	private String md5;

	//@EntityAttrDBAnnotation(attrName="md5",sort=24  )
	private int useFrequency;


	/** 
	 * 访问路径
	 * @return the accessUrl
	 */
	public String getAccessUrl() {
		return accessUrl;
	}
	
	/** 
	 * 访问路径
	 */
	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}
	/** 
	 * 文件所在主机
	 * @return the fileHost
	 */
	public String getFileHost() {
		return fileHost;
	}
	
	/** 
	 * 文件所在主机
	 */
	public void setFileHost(String fileHost) {
		this.fileHost = fileHost;
	}
	/** 
	 * 文件路径
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}
	
	/** 
	 * 文件路径
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	/** 
	 * 文件大小
	 * @return the fileSize
	 */
	public Long getFileSize() {
		return fileSize;
	}
	
	/** 
	 * 文件大小
	 */
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	/** 
	 * 文件后缀
	 * @return the fileSuffix
	 */
	public String getFileSuffix() {
		return fileSuffix;
	}
	
	/** 
	 * 文件后缀
	 */
	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}
	/** 
	 * 文件名
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	
	/** 
	 * 文件名
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/** 
	 * 文件类型
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}
	
	/** 
	 * 文件类型
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	/** 
	 * 文件引擎
	 * @return the fileEngine
	 */
	public String getFileEngine() {
		return fileEngine;
	}
	
	/** 
	 * 文件引擎
	 */
	public void setFileEngine(String fileEngine) {
		this.fileEngine = fileEngine;
	}


	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public int getUseFrequency() {
		return useFrequency;
	}

	public void setUseFrequency(int useFrequency) {
		this.useFrequency = useFrequency;
	}
}