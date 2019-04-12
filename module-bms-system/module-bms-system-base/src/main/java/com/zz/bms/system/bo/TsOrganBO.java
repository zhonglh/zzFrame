package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsOrganEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.ui.easyui.EasyUiTree;

import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.StringUtils;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
* 机构 BO , 扩展 TsOrganEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:52
*/
@EntityAnnotation(value="机构" , resource = "system.organ"  ,businessName = "organ_name"    ,businessKey = { "organ_code" }   ,parentColumnName="pid" ,textColumnName="organ_name" )
@TableName(value="ts_organ" , resultMap = "TsOrganResultMap")
public class TsOrganBO extends TsOrganEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "organType", groupName = "机构类型" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "organ_type")
    @EntityAttrExcelAnnotation(excelProcess= "2")
    @EntityAttrPageAnnotation(title = "机构类型",sort = 401                      ,required=true )
    private String organTypeName ;




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "organStatus", groupName = "机构状态" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "organ_status")
    @EntityAttrExcelAnnotation(excelProcess= "2")
    @EntityAttrPageAnnotation(title = "机构状态",sort = 701                      ,required=true )
    private String organStatusName;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "leadUserId",  groupName = "负责人" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "负责人",sort = 801                      ,required=true )
    private String leadUserName ;



    public void setOrganTypeName(String organTypeName){
        this.organTypeName = organTypeName;
    }

    public String getOrganTypeName(){
        return this.organTypeName;
    }

    public void setLeadUserName(String leadUserName){
        this.leadUserName = leadUserName;
    }

    public String getLeadUserName(){
        return this.leadUserName;
    }

    public String getOrganStatusName() {
        return organStatusName;
    }

    public void setOrganStatusName(String organStatusName) {
        this.organStatusName = organStatusName;
    }

    public EasyUiTree toEasyUiTree(){
        EasyUiTree tree = new EasyUiTree();
        tree.setId(this.getId());
        tree.setPid(StringUtils.isEmpty(this.getPid())? null : this.getPid());
        tree.setText(this.getOrganName());
        Map<String,String> attributes = new HashMap<String,String>();
        tree.setAttributes(attributes);
        return tree;
    }




    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getOrganName();
        
    }
}
