package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 字典类型 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:36
 */
public class TsDictTypeEntity extends BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//上级类型
	
	private String  pid ;

	//类型代码
	
	private String  dictTypeCode ;

	//类型名称
	
	private String  dictTypeName ;

	//类型是否显示
	
	private String  dictTypeShowable ;

	//字典是否可以增加
	
	private String  dictAddable ;

	//字典是否可以修改
	
	private String  dictUpdate ;

	//字典是否可以删除
	
	private String  dictDelete ;

	//顺序
	
	private Integer  orderby ;





	public void setPid(String pid){
		this.pid = pid;
	}

    public String getPid(){
    	return this.pid;
    }


	public void setDictTypeCode(String dictTypeCode){
		this.dictTypeCode = dictTypeCode;
	}

    public String getDictTypeCode(){
    	return this.dictTypeCode;
    }


	public void setDictTypeName(String dictTypeName){
		this.dictTypeName = dictTypeName;
	}

    public String getDictTypeName(){
    	return this.dictTypeName;
    }


	public void setDictTypeShowable(String dictTypeShowable){
		this.dictTypeShowable = dictTypeShowable;
	}

    public String getDictTypeShowable(){
    	return this.dictTypeShowable;
    }


	public void setDictAddable(String dictAddable){
		this.dictAddable = dictAddable;
	}

    public String getDictAddable(){
    	return this.dictAddable;
    }


	public void setDictUpdate(String dictUpdate){
		this.dictUpdate = dictUpdate;
	}

    public String getDictUpdate(){
    	return this.dictUpdate;
    }


	public void setDictDelete(String dictDelete){
		this.dictDelete = dictDelete;
	}

    public String getDictDelete(){
    	return this.dictDelete;
    }


	public void setOrderby(Integer orderby){
		this.orderby = orderby;
	}

    public Integer getOrderby(){
    	return this.orderby;
    }


	
}