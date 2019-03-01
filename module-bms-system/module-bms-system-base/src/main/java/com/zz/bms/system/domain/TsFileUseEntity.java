package com.zz.bms.system.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zz.bms.util.configs.annotaions.*;

import com.zz.bms.core.Constant;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;
import com.zz.bms.core.db.entity.BaseBusinessSimpleExEntity;
/**
 * 文件使用 实体类
 * @author Administrator
 * @date 2019-4-10 11:08:51
 */
public class TsFileUseEntity extends com.zz.bms.core.db.entity.BaseBusinessExEntity<String> implements java.io.Serializable{

    @TableField(exist=false)
    private static final long serialVersionUID = 1L;



    @EntityAttrFkAnnotation(group = "fileId",  groupName = "文件ID" ,   dbColumnName = "id" , dbColumnType = "CHAR" , dbColumnLength = 32   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsFileBO.class)
    @EntityAttrDBAnnotation(attrName="文件ID" ,attrColumn="file_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "文件ID",sort = 200  , pageElement = "text"            , maxLength = 32        ,required=true )
	
    
    
	private String  fileId ;



    @EntityAttrDBAnnotation(attrName="显示名称" ,attrColumn="show_name"  , type = "VARCHAR"      ,  attrLength = 256 , notNull = true )
    @EntityAttrPageAnnotation(title = "显示名称",sort = 300  , pageElement = "text"            , maxLength = 256        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  showName ;



    @EntityAttrDBAnnotation(attrName="业务类型" ,attrColumn="business_type"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = true )
    @EntityAttrPageAnnotation(title = "业务类型",sort = 400  , pageElement = "text"            , maxLength = 100        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  businessType ;



    @EntityAttrDBAnnotation(attrName="业务ID" ,attrColumn="business_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = false )
    @EntityAttrPageAnnotation(title = "业务ID",sort = 500  , pageElement = "text"            , maxLength = 32        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  businessId ;



    @EntityAttrDBAnnotation(attrName="业务文件类型" ,attrColumn="business_file_type"  , type = "VARCHAR"      ,  attrLength = 100 , notNull = true )
    @EntityAttrPageAnnotation(title = "业务文件类型",sort = 600  , pageElement = "text"            , maxLength = 100        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  businessFileType ;



    @EntityAttrDBAnnotation(attrName="业务临时ID" ,attrColumn="business_temp_id"  , type = "CHAR"      ,  attrLength = 32 , notNull = true )
    @EntityAttrPageAnnotation(title = "业务临时ID",sort = 700  , pageElement = "text"            , maxLength = 32        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  businessTempId ;



    @EntityAttrDBAnnotation(attrName="顺序" ,attrColumn="file_order"  , type = "INT"      ,  attrLength = 10 , notNull = true )
    @EntityAttrPageAnnotation(title = "顺序",sort = 800  , pageElement = "text"            , maxLength = 10        ,required=true )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private Integer  fileOrder ;



    @EntityAttrDBAnnotation(attrName="备注" ,attrColumn="remark"  , type = "VARCHAR"      ,  attrLength = 200 , notNull = false )
    @EntityAttrPageAnnotation(title = "备注",sort = 900  , pageElement = "text"            , maxLength = 200        ,required=false )
	@EntityAttrExcelAnnotation(excelProcess= "3")
    
    
	private String  remark ;





	public void setFileId(String fileId){
		this.fileId = fileId;
	}

    public String getFileId(){
    	return this.fileId;
    }


	public void setShowName(String showName){
		this.showName = showName;
	}

    public String getShowName(){
    	return this.showName;
    }


	public void setBusinessType(String businessType){
		this.businessType = businessType;
	}

    public String getBusinessType(){
    	return this.businessType;
    }


	public void setBusinessId(String businessId){
		this.businessId = businessId;
	}

    public String getBusinessId(){
    	return this.businessId;
    }


	public void setBusinessFileType(String businessFileType){
		this.businessFileType = businessFileType;
	}

    public String getBusinessFileType(){
    	return this.businessFileType;
    }


	public void setBusinessTempId(String businessTempId){
		this.businessTempId = businessTempId;
	}

    public String getBusinessTempId(){
    	return this.businessTempId;
    }


	public void setFileOrder(Integer fileOrder){
		this.fileOrder = fileOrder;
	}

    public Integer getFileOrder(){
    	return this.fileOrder;
    }


	public void setRemark(String remark){
		this.remark = remark;
	}

    public String getRemark(){
    	return this.remark;
    }


	
}