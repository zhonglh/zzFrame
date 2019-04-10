package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
/**
 * 字典信息 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:53
 */
public class TsDictEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrFkAnnotation(group = "dictTypeId",  groupName = "字典类型" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDictTypeBO.class)
    @EntityAttrDBAnnotation(attrName="字典类型" ,attrColumn="dict_type_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "字典类型",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  dictTypeId ;



    @EntityAttrDictAnnotation(group = "dictVal", groupName = "字典值" ,  dbColumnName = "dict_val" , dbColumnLength = 2 , isValueField = true , dictType = "dict_val")
    @EntityAttrDBAnnotation(attrName="字典值" ,attrColumn="dict_val"  , type = "VARCHAR"      ,  attrLength = 2 , notNull = true )
    @EntityAttrPageAnnotation(title = "字典值",sort = 300  , pageElement = "select"            , maxLength = 2        ,required=true )
	
    
    
	private String  dictVal ;



    @EntityAttrDBAnnotation(attrName="字典名" ,attrColumn="dict_name"  , type = "VARCHAR"      ,  attrLength = 50 , notNull = true )
    @EntityAttrPageAnnotation(title = "字典名",sort = 400  , pageElement = "text"            , maxLength = 50        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  dictName ;



    @EntityAttrDBAnnotation(attrName="名称国际化" ,attrColumn="dict_i18n"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "名称国际化",sort = 500  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  dictI18n ;



    @EntityAttrDBAnnotation(attrName="字典限制正则" ,attrColumn="dict_reg"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = false )
    @EntityAttrPageAnnotation(title = "字典限制正则",sort = 600  , pageElement = "text"            , maxLength = 100        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  dictReg ;



    @EntityAttrDBAnnotation(attrName="顺序" ,attrColumn="orderby"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "顺序",sort = 700  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Integer  orderby ;





	public void setDictTypeId(String dictTypeId){
		this.dictTypeId = dictTypeId;
	}

    public String getDictTypeId(){
    	return this.dictTypeId;
    }


	public void setDictVal(String dictVal){
		this.dictVal = dictVal;
	}

    public String getDictVal(){
    	return this.dictVal;
    }


	public void setDictName(String dictName){
		this.dictName = dictName;
	}

    public String getDictName(){
    	return this.dictName;
    }


	public void setDictI18n(String dictI18n){
		this.dictI18n = dictI18n;
	}

    public String getDictI18n(){
    	return this.dictI18n;
    }


	public void setDictReg(String dictReg){
		this.dictReg = dictReg;
	}

    public String getDictReg(){
    	return this.dictReg;
    }


	public void setOrderby(Integer orderby){
		this.orderby = orderby;
	}

    public Integer getOrderby(){
    	return this.orderby;
    }


	
}