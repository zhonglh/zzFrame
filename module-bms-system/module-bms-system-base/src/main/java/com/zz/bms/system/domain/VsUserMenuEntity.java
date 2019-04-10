package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.system.domain.TsMenuEntity;
/**
 * 菜单 实体类
 *         path                       menu_url        co        
 * @author Administrator
 * @date 2019-4-10 11:08:55
 */
public class VsUserMenuEntity extends TsMenuEntity implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrDBAnnotation(attrName="TITLE" ,attrColumn="title"  , type = "VARCHAR"      ,  attrLength = 30 , notNull = true )
    @EntityAttrPageAnnotation(title = "TITLE",sort = 300  , pageElement = "text"            , maxLength = 30        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  title ;



    @EntityAttrDBAnnotation(attrName="ICON" ,attrColumn="icon"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = false )
    @EntityAttrPageAnnotation(title = "ICON",sort = 400  , pageElement = "text"            , maxLength = 20        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  icon ;



    @EntityAttrDBAnnotation(attrName="COMPONENT" ,attrColumn="component"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = false )
    @EntityAttrPageAnnotation(title = "COMPONENT",sort = 500  , pageElement = "text"            , maxLength = 50        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  component ;



    @EntityAttrDBAnnotation(attrName="SORTNO" ,attrColumn="sortno"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "SORTNO",sort = 600  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private Integer  sortno ;



    @EntityAttrDBAnnotation(attrName="PATH" ,attrColumn="path"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = true )
    @EntityAttrPageAnnotation(title = "PATH",sort = 700  , pageElement = "text"            , maxLength = 200        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  path ;



    @EntityAttrDBAnnotation(attrName="NAME" ,attrColumn="name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "NAME",sort = 900  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  name ;



    @EntityAttrDBAnnotation(attrName="USER_NAME" ,attrColumn="user_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "USER_NAME",sort = 1200  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  userName ;



    @EntityAttrDBAnnotation(attrName="LOGIN_NAME" ,attrColumn="login_name"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "LOGIN_NAME",sort = 1300  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  loginName ;



    @EntityAttrFkAnnotation(group = "userId",  groupName = "USER_ID" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.VsUserBO.class)
    @EntityAttrDBAnnotation(attrName="USER_ID" ,attrColumn="user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "USER_ID",sort = 1400  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    //todo 如果需要Excel导入 请先设置外键信息 EntityAttrFkAnnotation ， 参考 VsUserEntity 
    
	private String  userId ;





	public void setTitle(String title){
		this.title = title;
	}

    public String getTitle(){
    	return this.title;
    }


	public void setIcon(String icon){
		this.icon = icon;
	}

    public String getIcon(){
    	return this.icon;
    }


	public void setComponent(String component){
		this.component = component;
	}

    public String getComponent(){
    	return this.component;
    }


	public void setSortno(Integer sortno){
		this.sortno = sortno;
	}

    public Integer getSortno(){
    	return this.sortno;
    }


	public void setPath(String path){
		this.path = path;
	}

    public String getPath(){
    	return this.path;
    }


	public void setName(String name){
		this.name = name;
	}

    public String getName(){
    	return this.name;
    }


	public void setUserName(String userName){
		this.userName = userName;
	}

    public String getUserName(){
    	return this.userName;
    }


	public void setLoginName(String loginName){
		this.loginName = loginName;
	}

    public String getLoginName(){
    	return this.loginName;
    }


	public void setUserId(String userId){
		this.userId = userId;
	}

    public String getUserId(){
    	return this.userId;
    }


	
}