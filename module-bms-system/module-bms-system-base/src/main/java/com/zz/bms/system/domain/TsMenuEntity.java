package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
/**
 * 菜单 实体类
 *         path                       menu_url        co        
 * @author Administrator
 * @date 2018-9-7 0:01:36
 */
public class TsMenuEntity extends BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//菜单名称
	
	private String  menuName ;

	//菜单编号
	
	private String  menuCode ;

	//上级菜单
	
	private String  pid ;

	//菜单顺序
	
	private Integer  menuSort ;

	//菜单地址
	
	private String  menuUrl ;

	//菜单提示信息
	
	private String  menuMsg ;

	//菜单图标
	
	private String  menuIcon ;

	//是否快捷菜单

	private String  shortcut;

	//跳转目标
	
	private String  menuRedirect ;

	//是否叶节点

	private String leaf ;


	//层级
	private int level ;

	//备注
	
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


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }

	public String getShortcut() {
		return shortcut;
	}

	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
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