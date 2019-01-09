package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.lang.String;
import java.lang.Integer;

import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.system.domain.TsMenuEntity;
/**
 * 菜单 实体类
 *
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class VsUserMenuEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;


	//上级菜单

	private String  pid ;

	//菜单编号
	
	private String  title ;

	//菜单图标
	
	private String  icon ;

	//菜单提示信息
	
	private String  component ;

	//菜单顺序
	
	private Integer  sortno ;

	//菜单地址
	
	private String  path ;

	//是否为快捷菜单

	private String shortcut;

	//用户姓名
	
	private String  name ;


	//是否叶节点

	private String leaf ;


	//层级
	private int level ;



	//用户姓名
	
	private String  userName ;

	//登录名
	
	private String  loginName ;

	//ID
	
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


	public String getShortcut() {
		return shortcut;
	}

	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getLeaf() {
		return leaf;
	}

	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}