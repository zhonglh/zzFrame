package com.zz.bms.oss.base.domain;



import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
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


    @EntityAttrDBAnnotation(attrName="访问路径",sort=1  , attrLength=200    )
	//不包括前缀  
	private String accessUrl;





    @EntityAttrDBAnnotation(attrName="文件所在主机",sort=2  , attrLength=30    )
	private String fileHost;





    @EntityAttrDBAnnotation(attrName="文件路径",sort=3  , attrLength=200    )
	private String filePath;





    @EntityAttrDBAnnotation(attrName="文件名",sort=4  , attrLength=100    )
	private String fileName;





    @EntityAttrDBAnnotation(attrName="文件大小",sort=5  , attrLength=0    )
	private Integer fileSize;





    @EntityAttrDBAnnotation(attrName="文件后缀",sort=6  , attrLength=10    )
	private String fileSuffix;





    @EntityAttrDBAnnotation(attrName="文件引擎",sort=7  , attrLength=20    )
	//文件系统 七牛  阿里云  腾讯 FastNFS MongoDB
	//参考EnumFileEngine
	private String fileEngine;





    @EntityAttrDBAnnotation(attrName="显示名称",sort=8  , attrLength=100    )
	private String showName;





    @EntityAttrDBAnnotation(attrName="MD5码",sort=9  , attrLength=128    )
	private String md5;





    @EntityAttrDBAnnotation(attrName="使用次数",sort=10  , attrLength=0    )
	private Integer useFrequency;



    @EntityAttrDBAnnotation(attrName="备注",sort=11  , attrLength=200    )
	private String remark;



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
	 * 文件大小
	 * @return the fileSize
	 */
	public Integer getFileSize() {
		return fileSize;
	}
	
	/** 
	 * 文件大小
	 */
	public void setFileSize(Integer fileSize) {
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
	/** 
	 * 显示名称
	 * @return the showName
	 */
	public String getShowName() {
		return showName;
	}
	
	/** 
	 * 显示名称
	 */
	public void setShowName(String showName) {
		this.showName = showName;
	}
	/** 
	 * MD5码
	 * @return the md5
	 */
	public String getMd5() {
		return md5;
	}
	
	/** 
	 * MD5码
	 */
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	/** 
	 * 使用次数
	 * @return the useFrequency
	 */
	public Integer getUseFrequency() {
		return useFrequency;
	}
	
	/** 
	 * 使用次数
	 */
	public void setUseFrequency(Integer useFrequency) {
		this.useFrequency = useFrequency;
	}
	/** 
	 * 备注
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	
	/** 
	 * 备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}