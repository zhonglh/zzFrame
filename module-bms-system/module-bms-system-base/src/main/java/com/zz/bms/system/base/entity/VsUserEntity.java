package com.zz.bms.system.base.entity;



import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;

import java.lang.String;

/**
 * VIEW实体类
 * 
 * @author admin
 * @date 2018-6-2 0:24:57
 */
@EntityAnnotation(value="用户" , resource = "sys.user")
@TableName(value="vs_user" , resultMap = "VsUserResultMap")
public class VsUserEntity extends TsUserEntity implements java.io.Serializable{

	private static final long serialVersionUID = 1L;




	@EntityAttrDBAnnotation(attrName="部门名称",sort=150  , attrLength=150    )
	private String depName;






    @EntityAttrDBAnnotation(attrName="机构名称",sort=170  , attrLength=150    )
	private String organName;


	@EntityAttrDBAnnotation(attrName="公司名称",sort=180  , attrLength=150    )
    private String tenantName;





	/** 
	 * 部门名称
	 * @return the depName
	 */
	public String getDepName() {
		return depName;
	}
	
	/** 
	 * 部门名称
	 */
	public void setDepName(String depName) {
		this.depName = depName;
	}
	/** 
	 * 机构名称
	 * @return the organName
	 */
	public String getOrganName() {
		return organName;
	}
	
	/** 
	 * 机构名称
	 */
	public void setOrganName(String organName) {
		this.organName = organName;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
}