package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbFundEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.FilesAnnotation;
import com.zz.bms.system.bo.VsFileUseBO;

import org.apache.commons.lang3.StringUtils;


import java.util.List;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
* 基金 BO , 扩展 TbFundEntity 对象
* @author Administrator
* @date 2019-6-3 10:12:55
*/
@EntityAnnotation(value="基金" , resource = "example.fund"  ,haveTenant = true  ,haveOrgan = true  ,businessName = "fund_name"    ,businessKey = { "fund_code" }    )
@TableName(value="tb_fund" , resultMap = "TbFundResultMap")
public class TbFundBO extends TbFundEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "fundType", groupName = "基金类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "fund_type")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "基金类型",sort = 401                      ,required=true )
    private String fundTypeName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "fundDirection", groupName = "基金投向" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "fund_direction")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "基金投向",sort = 501                      ,required=true )
    private String fundDirectionName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "managType", groupName = "管理类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "manag_type")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "管理类型",sort = 701                      ,required=true )
    private String managTypeName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "managerUserId",  groupName = "基金经理" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "基金经理",sort = 901                      ,required=true )
    private String managerUserName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "depId",  groupName = "部门" ,   dbColumnName = "dep_name" , dbColumnType = "VARCHAR" , dbColumnLength = 100   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "部门",sort = 1601                      ,required=true )
    private String depName ;



    /**
    * 附件 列表
    */
    @TableField(exist = false)
    @FilesAnnotation
    private List<VsFileUseBO> fundFilesList ;






    public void setFundTypeName(String fundTypeName){
        this.fundTypeName = fundTypeName;
    }

    public String getFundTypeName(){
        return this.fundTypeName;
    }

    public void setFundDirectionName(String fundDirectionName){
        this.fundDirectionName = fundDirectionName;
    }

    public String getFundDirectionName(){
        return this.fundDirectionName;
    }

    public void setManagTypeName(String managTypeName){
        this.managTypeName = managTypeName;
    }

    public String getManagTypeName(){
        return this.managTypeName;
    }

    public void setManagerUserName(String managerUserName){
        this.managerUserName = managerUserName;
    }

    public String getManagerUserName(){
        return this.managerUserName;
    }

    public void setDepName(String depName){
        this.depName = depName;
    }

    public String getDepName(){
        return this.depName;
    }



    public void setFundFilesList(List<VsFileUseBO> fundFilesList ){
        this.fundFilesList = fundFilesList;
    }


    public List<VsFileUseBO> getFundFilesList(){
        return this.fundFilesList;
    }









    
    public boolean isTable() {

        return true;


    }


    @Override
    public boolean haveFile() {
        return true;
    }


    @Override
    public String toString() {


            return this.getFundName();
        
    }
}
