package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsDepEntity;

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
* 部门 BO , 扩展 TsDepEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:55
*/
@EntityAnnotation(value="部门" , resource = "system.dep"  ,businessName = "dep_name"    ,businessKey = { "dep_code" }   ,parentColumnName="pid" ,textColumnName="dep_name"  , haveTenant = true , haveOrgan = true  )
@TableName(value="ts_dep" , resultMap = "TsDepResultMap")
public class TsDepBO extends TsDepEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "pid",  groupName = "上级部门" ,   dbColumnName = "dep_name" , dbColumnType = "VARCHAR" , dbColumnLength = 100   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsDepBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "上级部门",sort = 501                      ,required=false )
    private String pname ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "depStatus", groupName = "状态" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "dep_status")
    @EntityAttrExcelAnnotation(excelProcess= "2")
    @EntityAttrPageAnnotation(title = "状态",sort = 601                      ,required=true )
    private String depStatusName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "leadUserId",  groupName = "负责人" ,   dbColumnName = "user_name" , dbColumnType = "VARCHAR" , dbColumnLength = 50   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsUserBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "负责人",sort = 701                      ,required=true )
    private String leadUserName ;



    public void setPname(String pname){
        this.pname = pname;
    }

    public String getPname(){
        return this.pname;
    }

    public void setDepStatusName(String depStatusName){
        this.depStatusName = depStatusName;
    }

    public String getDepStatusName(){
        return this.depStatusName;
    }

    public void setLeadUserName(String leadUserName){
        this.leadUserName = leadUserName;
    }

    public String getLeadUserName(){
        return this.leadUserName;
    }




    public EasyUiTree toEasyUiTree(){
        EasyUiTree tree = new EasyUiTree();
        tree.setId(this.getId());
        tree.setPid(StringUtils.isEmpty(this.getPid())? null : this.getPid());
        tree.setText(this.getDepName());
        Map<String,String> attributes = new HashMap<String,String>();
        tree.setAttributes(attributes);
        return tree;
    }




    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getDepName();
        
    }
}
