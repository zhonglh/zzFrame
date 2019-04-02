package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.String;
import com.zz.bms.system.domain.TsMenuPermitEntity;
/**
 * 菜单许可关联 实体类
 * @author Administrator
 * @date 2019-4-1 13:52:04
 */
public class VsMenuPermitEntity extends TsMenuPermitEntity implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="许可编号" ,type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "许可编号",sort = 400  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  permitCode ;



    @EntityAttrDBAnnotation(attrName="许可名称" ,type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "许可名称",sort = 500  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  permitName ;





	public void setPermitCode(String permitCode){
		this.permitCode = permitCode;
	}

    public String getPermitCode(){
    	return this.permitCode;
    }


	public void setPermitName(String permitName){
		this.permitName = permitName;
	}

    public String getPermitName(){
    	return this.permitName;
    }


	
}