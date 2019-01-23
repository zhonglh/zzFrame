package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 置顶快捷菜单 实体类
 * @author Administrator
 * @date 2018-9-8 12:42:41
 */
public class TsMyShortcutEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//菜单
	
	private String  menuId ;

	//用户
	
	private String  userId ;

	//顺序

	private int orderby;





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

	public int getOrderby() {
		return orderby;
	}

	public void setOrderby(int orderby) {
		this.orderby = orderby;
	}
}