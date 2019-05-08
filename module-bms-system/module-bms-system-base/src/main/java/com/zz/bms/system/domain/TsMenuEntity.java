package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;







/**
 * 菜单 实体类
 *         path                       menu_url        co        
 * @author Administrator
 * @date 2019-5-8 16:10:21
 */
public class TsMenuEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable  {

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


    @EntityAttrDBAnnotation(attrName="菜单名称" ,attrColumn="menu_name"  , type = "VARCHAR"      ,  attrLength = 30 , notNull = true )
    @EntityAttrPageAnnotation(title = "菜单名称",sort = 200  , pageElement = "text"            , maxLength = 30        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  menuName ;





    @EntityAttrDBAnnotation(attrName="菜单编号" ,attrColumn="menu_code"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "菜单编号",sort = 300  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  menuCode ;





    @EntityAttrFkAnnotation(group = "pid",  groupName = "上级菜单" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsMenuBO.class)
    @EntityAttrDBAnnotation(attrName="上级菜单" ,attrColumn="pid"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "上级菜单",sort = 400  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  pid ;





    @EntityAttrDBAnnotation(attrName="菜单顺序" ,attrColumn="menu_sort"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "菜单顺序",sort = 500  , pageElement = "digits"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Integer  menuSort ;





    @EntityAttrDBAnnotation(attrName="菜单地址" ,attrColumn="menu_url"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "菜单地址",sort = 600  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  menuUrl ;





    @EntityAttrDBAnnotation(attrName="菜单提示信息" ,attrColumn="menu_msg"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = false )
    @EntityAttrPageAnnotation(title = "菜单提示信息",sort = 700  , pageElement = "text"            , maxLength = 50        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  menuMsg ;





    @EntityAttrDBAnnotation(attrName="菜单图标" ,attrColumn="menu_icon"  , type = "VARCHAR"      ,  attrLength = 20 , notNull = false )
    @EntityAttrPageAnnotation(title = "菜单图标",sort = 800  , pageElement = "text"            , maxLength = 20        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  menuIcon ;





    @EntityAttrDBAnnotation(attrName="跳转目标" ,attrColumn="menu_redirect"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = false )
    @EntityAttrPageAnnotation(title = "跳转目标",sort = 900  , pageElement = "text"            , maxLength = 50        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  menuRedirect ;





    @EntityAttrDictAnnotation(group = "shortcut", groupName = "快捷菜单" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="快捷菜单" ,attrColumn="shortcut"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "快捷菜单",sort = 1000  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //yes_no        
	private String  shortcut ;





    @EntityAttrDBAnnotation(attrName="层级" ,attrColumn="level"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "层级",sort = 1100  , pageElement = "digits"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Integer  level ;





    @EntityAttrDictAnnotation(group = "leaf", groupName = "是否叶节点" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="是否叶节点" ,attrColumn="leaf"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "是否叶节点",sort = 1200  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //yes_no        
	private String  leaf ;





    @EntityAttrDictAnnotation(group = "hidden", groupName = "是否隐藏" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="是否隐藏" ,attrColumn="hidden"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "是否隐藏",sort = 1300  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    
	private String  hidden ;





    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 1400  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  remark ;









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


	public void setPid(String pid){
		this.pid = pid;
	}

    public String getPid(){
    	return this.pid;
    }


	public void setMenuSort(Integer menuSort){
		this.menuSort = menuSort;
	}

    public Integer getMenuSort(){
    	return this.menuSort;
    }


	public void setMenuUrl(String menuUrl){
		this.menuUrl = menuUrl;
	}

    public String getMenuUrl(){
    	return this.menuUrl;
    }


	public void setMenuMsg(String menuMsg){
		this.menuMsg = menuMsg;
	}

    public String getMenuMsg(){
    	return this.menuMsg;
    }


	public void setMenuIcon(String menuIcon){
		this.menuIcon = menuIcon;
	}

    public String getMenuIcon(){
    	return this.menuIcon;
    }


	public void setMenuRedirect(String menuRedirect){
		this.menuRedirect = menuRedirect;
	}

    public String getMenuRedirect(){
    	return this.menuRedirect;
    }


	public void setShortcut(String shortcut){
		this.shortcut = shortcut;
	}

    public String getShortcut(){
    	return this.shortcut;
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


	public void setHidden(String hidden){
		this.hidden = hidden;
	}

    public String getHidden(){
    	return this.hidden;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }



}