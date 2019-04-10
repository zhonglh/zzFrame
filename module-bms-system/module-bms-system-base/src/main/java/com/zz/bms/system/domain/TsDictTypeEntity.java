package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseEntity;
/**
 * 字典类型 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:54
 */
public class TsDictTypeEntity extends com.zz.bms.core.db.entity.BaseEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrFkAnnotation(group = "pid",  groupName = "上级类型" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDictTypeBO.class)
    @EntityAttrDBAnnotation(attrName="上级类型" ,attrColumn="pid"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "上级类型",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=false )
	
    
    
	private String  pid ;



    @EntityAttrDBAnnotation(attrName="类型代码" ,attrColumn="dict_type_code"  , type = "VARCHAR"      ,  attrLength = 60 , notNull = true )
    @EntityAttrPageAnnotation(title = "类型代码",sort = 300  , pageElement = "text"            , maxLength = 60        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  dictTypeCode ;



    @EntityAttrDBAnnotation(attrName="类型名称" ,attrColumn="dict_type_name"  , type = "VARCHAR"      ,  attrLength = 60 , notNull = true )
    @EntityAttrPageAnnotation(title = "类型名称",sort = 400  , pageElement = "text"            , maxLength = 60        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  dictTypeName ;



    @EntityAttrDictAnnotation(group = "dictTypeShowable", groupName = "类型是否显示" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="类型是否显示" ,attrColumn="dict_type_showable"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "类型是否显示",sort = 500  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //yes_no        
	private String  dictTypeShowable ;



    @EntityAttrDictAnnotation(group = "dictAddable", groupName = "字典是否可以增加" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="字典是否可以增加" ,attrColumn="dict_addable"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "字典是否可以增加",sort = 600  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //yes_no        
	private String  dictAddable ;



    @EntityAttrDictAnnotation(group = "dictUpdate", groupName = "字典是否可以修改" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="字典是否可以修改" ,attrColumn="dict_update"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "字典是否可以修改",sort = 700  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //yes_no        
	private String  dictUpdate ;



    @EntityAttrDictAnnotation(group = "dictDelete", groupName = "字典是否可以删除" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "yes_no")
    @EntityAttrDBAnnotation(attrName="字典是否可以删除" ,attrColumn="dict_delete"  , type = "CHAR"      ,  attrLength = 1 , notNull = true )
    @EntityAttrPageAnnotation(title = "字典是否可以删除",sort = 800  , pageElement = "select"            , maxLength = 1        ,required=true )
	
    
    //yes_no        
	private String  dictDelete ;



    @EntityAttrDBAnnotation(attrName="顺序" ,attrColumn="orderby"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "顺序",sort = 900  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
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