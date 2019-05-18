package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 用户菜单信息 实体类
 * @author Administrator
 * @date 2019-4-10 20:58:06
 */
public class VsUserMenuEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrFkAnnotation(group = "pid",  groupName = "PID" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.VsUserMenuBO.class)
    @EntityAttrDBAnnotation(attrName="PID" ,attrColumn="pid"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "PID",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=false )
	private String  pid ;



    @EntityAttrDBAnnotation(attrName="TITLE" ,attrColumn="title"  , type = "VARCHAR"      ,  attrLength = 30 , notNull = true )
    @EntityAttrPageAnnotation(title = "TITLE",sort = 300  , pageElement = "text"            , maxLength = 30        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  title ;



    @EntityAttrDBAnnotation(attrName="ICON" ,attrColumn="icon"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = false )
    @EntityAttrPageAnnotation(title = "ICON",sort = 400  , pageElement = "text"            , maxLength = 20        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  icon ;



    @EntityAttrDBAnnotation(attrName="COMPONENT" ,attrColumn="component"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = false )
    @EntityAttrPageAnnotation(title = "COMPONENT",sort = 500  , pageElement = "text"            , maxLength = 50        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  component ;



    @EntityAttrDBAnnotation(attrName="SORTNO" ,attrColumn="sortno"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "SORTNO",sort = 600  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private Integer  sortno ;



    @EntityAttrDBAnnotation(attrName="PATH" ,attrColumn="path"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = true )
    @EntityAttrPageAnnotation(title = "PATH",sort = 700  , pageElement = "text"            , maxLength = 200        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  path ;



    @EntityAttrDictAnnotation(group = "shortcut", groupName = "SHORTCUT" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "shortcut")
    @EntityAttrDBAnnotation(attrName="SHORTCUT" ,attrColumn="shortcut"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "SHORTCUT",sort = 800  , pageElement = "select"            , maxLength = 1        ,required=true )
	private String  shortcut ;



    @EntityAttrDBAnnotation(attrName="NAME" ,attrColumn="name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "NAME",sort = 900  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  name ;



    @EntityAttrDBAnnotation(attrName="LEVEL" ,attrColumn="level"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "LEVEL",sort = 1000  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private Integer  level ;



    @EntityAttrDictAnnotation(group = "leaf", groupName = "LEAF" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "leaf")
    @EntityAttrDBAnnotation(attrName="LEAF" ,attrColumn="leaf"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "LEAF",sort = 1100  , pageElement = "select"            , maxLength = 1        ,required=true )
	private String  leaf ;



    @EntityAttrDBAnnotation(attrName="USER_NAME" ,attrColumn="user_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "USER_NAME",sort = 1200  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  userName ;



    @EntityAttrDBAnnotation(attrName="LOGIN_NAME" ,attrColumn="login_name"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = true )
    @EntityAttrPageAnnotation(title = "LOGIN_NAME",sort = 1300  , pageElement = "text"            , maxLength = 20        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
	private String  loginName ;



    @EntityAttrFkAnnotation(group = "userId",  groupName = "USER_ID" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.VsUserBO.class)
    @EntityAttrDBAnnotation(attrName="USER_ID" ,attrColumn="user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "USER_ID",sort = 1400  , pageElement = "text"            , maxLength = 32        ,required=true )
	private String  userId ;





	public void setPid(String pid){
		this.pid = pid;
	}

    public String getPid(){
    	return this.pid;
    }


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


	public void setShortcut(String shortcut){
		this.shortcut = shortcut;
	}

    public String getShortcut(){
    	return this.shortcut;
    }


	public void setName(String name){
		this.name = name;
	}

    public String getName(){
    	return this.name;
    }


	public void setLevel(Integer level){
		this.level = level;
	}

    public Integer getLevel(){
    	return this.level;
    }


	public void setLeaf(String leaf){
		this.leaf = leaf;
	}

    public String getLeaf(){
    	return this.leaf;
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