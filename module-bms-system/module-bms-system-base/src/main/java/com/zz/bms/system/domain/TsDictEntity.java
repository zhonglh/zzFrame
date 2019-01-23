package com.zz.bms.system.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;
import com.zz.bms.util.configs.annotaions.EntityAttrDBAnnotation;
import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;
/**
 * 字典信息 实体类
 * @author Administrator
 * @date 2018-9-7 0:01:37
 */
public class TsDictEntity extends BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;

	//字典类型
	
	private String  dictTypeId ;

	//字典值
	
	private String  dictVal ;

	//字典名
	
	private String  dictName ;

	//国际化
	
	private String  dictI18n ;

	//字典限制正则
	
	private String  dictReg ;

	//顺序
	
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