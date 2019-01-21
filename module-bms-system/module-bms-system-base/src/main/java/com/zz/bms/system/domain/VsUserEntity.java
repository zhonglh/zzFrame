package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.zz.bms.constants.PageElementConstant;
import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.system.domain.TsUserEntity;
/**
 * 用户 实体类
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public class VsUserEntity extends TsUserEntity implements java.io.Serializable{



	@EntityAttrDBAnnotation(attrName="部门名称" ,type = "varchar" ,  attrLength = 100 , notNull = true )
	@EntityAttrFkAnnotation(group = "dep" , groupName = "部门" ,  isFkBusinessKey = true, isFkBusinessName = true , dbColumnName = "dep_name" , dbColumnType = "varchar" , dbColumnLength = 100 , dbColumnNotNull = true, fkEntity="com.zz.bms.system.bo.TsDepBO")
	@EntityAttrExcelAnnotation()
	@EntityAttrPageAnnotation(title = "部门名称",sort = 401  , pageElement = PageElementConstant.openwin )
	private String  depName ;


	@EntityAttrDBAnnotation(attrName="机构名称" ,type = "varchar" ,  attrLength = 100 , notNull = true )
	@EntityAttrFkAnnotation(group = "organ" , groupName = "机构" ,  isFkBusinessKey = true, isFkBusinessName = true , dbColumnName = "organ_name" , dbColumnType = "varchar" , dbColumnLength = 100 , dbColumnNotNull = true, fkEntity="com.zz.bms.system.bo.TsOrganBO")
	@EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.ONLY_EXPORT)
	@EntityAttrPageAnnotation(title = "机构名称",sort = 501 , required = true , defaultType = DefaultTypeConstant.CURRENT_USER_DEPTID)
	private String  organName ;


	@EntityAttrDBAnnotation(attrName="企业名称" ,type = "varchar" ,  attrLength = 150 , notNull = true )
	@EntityAttrFkAnnotation(group = "tenant" , groupName = "企业" ,  isFkBusinessKey = true, isFkBusinessName = true , dbColumnName = "tenant_name" , dbColumnType = "varchar" , dbColumnLength = 150 , dbColumnNotNull = true, fkEntity="com.zz.bms.system.bo.TsTenantBO")
	@EntityAttrExcelAnnotation(excelProcess= ExcelTypeConstant.ONLY_EXPORT)
	@EntityAttrPageAnnotation(title = "机构名称",sort = 501 , required = true , defaultType = DefaultTypeConstant.CURRENT_USER_ORGANNAME)
	private String  tenantName ;







	public void setDepName(String depName){
		this.depName = depName;
	}

    public String getDepName(){
    	return this.depName;
    }


	public void setOrganName(String organName){
		this.organName = organName;
	}

    public String getOrganName(){
    	return this.organName;
    }


	public void setTenantName(String tenantName){
		this.tenantName = tenantName;
	}

    public String getTenantName(){
    	return this.tenantName;
    }

}