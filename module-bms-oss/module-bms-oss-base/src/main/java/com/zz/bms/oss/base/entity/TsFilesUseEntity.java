package com.zz.bms.oss.base.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;

import java.lang.String;

/**
 * 文件使用实体类
 * 
 * @author Administrator
 * @date 2018-7-19 23:40:03
 */
@EntityAnnotation(value="文件使用" , resource = "oss.filesuse")
@TableName(value="ts_files_use" , resultMap = "TsFilesUseResultMap")
public class TsFilesUseEntity extends BaseBusinessExEntity<String> {

	private static final long serialVersionUID = 1L;

    //@EntityAttrDBAnnotation(attrName="文件ID",sort=1  , attrLength=32    )
	private String fileId;

    //@EntityAttrDBAnnotation(attrName="显示名称",sort=2  , attrLength=100    )
	private String showName;

    //@EntityAttrDBAnnotation(attrName="业务类型",sort=3  , attrLength=80    )
	private String businessType;

    //@EntityAttrDBAnnotation(attrName="业务临时ID",sort=4  , attrLength=32    )
	private String businessTmpId;

    //@EntityAttrDBAnnotation(attrName="业务ID",sort=5  , attrLength=32    )
	private String businessId;



	//@EntityAttrDBAnnotation(attrName="细分",sort=6  , attrLength=50    )
	private String businessSubd;

    //@EntityAttrDBAnnotation(attrName="备注",sort=7  , attrLength=200    )
	private String remark;

    //@EntityAttrDBAnnotation(attrName="租户ID",sort=14  , attrLength=32    )
	private String tenantId;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getBusinessTmpId() {
		return businessTmpId;
	}

	public void setBusinessTmpId(String businessTmpId) {
		this.businessTmpId = businessTmpId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String getTenantId() {
		return tenantId;
	}

	@Override
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}


	public String getBusinessSubd() {
		return businessSubd;
	}

	public void setBusinessSubd(String businessSubd) {
		this.businessSubd = businessSubd;
	}
}