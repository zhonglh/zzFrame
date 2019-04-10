package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 置顶快捷菜单 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:51
 */
public class TsMyShortcutEntity extends com.zz.bms.core.db.entity.BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrFkAnnotation(group = "menuId",  groupName = "菜单" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsMenuBO.class)
    @EntityAttrDBAnnotation(attrName="菜单" ,attrColumn="menu_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "菜单",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  menuId ;



    @EntityAttrFkAnnotation(group = "userId",  groupName = "用户" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrDBAnnotation(attrName="用户" ,attrColumn="user_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "用户",sort = 300  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  userId ;



    @EntityAttrDBAnnotation(attrName="顺序" ,attrColumn="orderby"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "顺序",sort = 400  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Integer  orderby ;





	public void setMenuId(String menuId){
		this.menuId = menuId;
	}

    public String getMenuId(){
    	return this.menuId;
    }


	public void setUserId(String userId){
		this.userId = userId;
	}

    public String getUserId(){
    	return this.userId;
    }


	public void setOrderby(Integer orderby){
		this.orderby = orderby;
	}

    public Integer getOrderby(){
    	return this.orderby;
    }


	
}