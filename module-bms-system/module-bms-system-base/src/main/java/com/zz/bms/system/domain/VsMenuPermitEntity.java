package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.String;
import com.zz.bms.system.domain.TsMenuPermitEntity;
/**
 * 菜单许可关联 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:56
 */
public class VsMenuPermitEntity extends TsMenuPermitEntity implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="许可编号" ,attrColumn="permit_code"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "许可编号",sort = 400  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  permitCode ;



    @EntityAttrDBAnnotation(attrName="许可名称" ,attrColumn="permit_name"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "许可名称",sort = 500  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  permitName ;



    @EntityAttrDBAnnotation(attrName="菜单名称" ,attrColumn="menu_name"  , type = "VARCHAR"      ,  attrLength = 30 , notNull = true )
    @EntityAttrPageAnnotation(title = "菜单名称",sort = 600  , pageElement = "text"            , maxLength = 30        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  menuName ;



    @EntityAttrDBAnnotation(attrName="菜单编号" ,attrColumn="menu_code"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "菜单编号",sort = 700  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  menuCode ;





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


	public void setMenuName(String menuName){
		this.menuName = menuName;
	}

    public String getMenuName(){
    	return this.menuName;
    }


	public void setMenuCode(String menuCode){
		this.menuCode = menuCode;
	}

    public String getMenuCode(){
    	return this.menuCode;
    }


	
}