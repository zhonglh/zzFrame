package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.lang.String;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 菜单许可关联 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsMenuPermitEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//菜单
	
	private String  menuId ;

	//许可
	
	private String  permitId ;





	public void setMenuId(String menuId){
		this.menuId = menuId;
	}

    public String getMenuId(){
    	return this.menuId;
    }


	public void setPermitId(String permitId){
		this.permitId = permitId;
	}

    public String getPermitId(){
    	return this.permitId;
    }


	
}