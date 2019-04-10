package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsUserMenuEntity;

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
* 用户菜单信息 BO , 扩展 VsUserMenuEntity 对象
* @author Administrator
* @date 2019-4-10 20:58:06
*/
@EntityAnnotation(value="用户菜单信息" , resource = "system.usermenu"  ,businessName = "menu_name"    ,businessKey = { "" }   ,parentColumnName="pid" ,textColumnName="menu_name"  )
@TableName(value="vs_user_menu" , resultMap = "VsUserMenuResultMap")
public class VsUserMenuBO extends VsUserMenuEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "shortcut", groupName = "SHORTCUT" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "shortcut")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "SHORTCUT",sort = 801                      ,required=true )
    private String shortcutName ;



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "leaf", groupName = "LEAF" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "leaf")
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "LEAF",sort = 1101                      ,required=true )
    private String leafName ;



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




    public EasyUiTree toEasyUiTree(){
        EasyUiTree tree = new EasyUiTree();
        tree.setId(this.getId());
        tree.setPid(StringUtils.isEmpty(this.getPid())? null : this.getPid());
        tree.setText(this.getTitle());
        Map<String,String> attributes = new HashMap<String,String>();
        tree.setAttributes(attributes);
        return tree;
    }




    @Override
    public boolean isTable() {


        return false;

    }


    @Override
    public String toString() {


            return this.getTitle();
        
    }
}
