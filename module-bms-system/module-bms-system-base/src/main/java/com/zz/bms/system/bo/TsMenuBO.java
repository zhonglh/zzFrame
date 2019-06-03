package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsMenuEntity;

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
* 菜单 BO , 扩展 TsMenuEntity 对象
* @author Administrator
* @date 2019-5-8 16:10:22
*/
@EntityAnnotation(value="菜单" , resource = "system.menu"    ,businessName = "menu_name"    ,businessKey = { "menu_code" }   ,parentColumnName="pid" ,textColumnName="menu_name"  )
@TableName(value="ts_menu" , resultMap = "TsMenuResultMap")
public class TsMenuBO extends TsMenuEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "pid",  groupName = "上级菜单" ,   dbColumnName = "menu_name" , dbColumnType = "VARCHAR" , dbColumnLength = 30   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsMenuBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "上级菜单",sort = 401                      ,required=true )
    private String pname ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "shortcut", groupName = "快捷菜单" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "yes_no")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "快捷菜单",sort = 1001                      ,required=true )
    private String shortcutName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "leaf", groupName = "是否叶节点" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "yes_no")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "是否叶节点",sort = 1201                      ,required=true )
    private String leafName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "hidden", groupName = "是否隐藏" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "yes_no")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "是否隐藏",sort = 1301                      ,required=true )
    private String hiddenName ;



    public void setPname(String pname){
        this.pname = pname;
    }

    public String getPname(){
        return this.pname;
    }

    public void setShortcutName(String shortcutName){
        this.shortcutName = shortcutName;
    }

    public String getShortcutName(){
        return this.shortcutName;
    }

    public void setLeafName(String leafName){
        this.leafName = leafName;
    }

    public String getLeafName(){
        return this.leafName;
    }

    public void setHiddenName(String hiddenName){
        this.hiddenName = hiddenName;
    }

    public String getHiddenName(){
        return this.hiddenName;
    }




    public EasyUiTree toEasyUiTree(){
        EasyUiTree tree = new EasyUiTree();
        tree.setId(this.getId());
        tree.setPid(StringUtils.isEmpty(this.getPid())? null : this.getPid());
        tree.setText(this.getMenuName());
        Map<String,String> attributes = new HashMap<String,String>();
        tree.setAttributes(attributes);
        return tree;
    }




    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getMenuName();
        
    }
}
