package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsUserMenuEntity;

import com.baomidou.mybatisplus.annotation.TableField;

import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;



/**
* VIEW BO , 扩展 VsUserMenuEntity 对象
* @author Administrator
* @date 2019-4-1 13:52:05
*/
@EntityAnnotation(value="VIEW" , resource = "system.usermenu"      )
@TableName(value="vs_user_menu" , resultMap = "VsUserMenuResultMap")
public class VsUserMenuBO extends VsUserMenuEntity implements Serializable , IBoEntity {



    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "shortcut", groupName = "SHORTCUT" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "shortcut")
    
    @EntityAttrPageAnnotation(title = "SHORTCUT",sort = 801                      ,required=true )
    private String shortcutName ;








    @TableField(exist = false)
    @EntityAttrDictAnnotation(group = "leaf", groupName = "LEAF" ,  dbColumnName = "dict_name" , dbColumnLength = 50 , isNameField = true , dictType = "leaf")
    
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



    @Override
    public boolean isTable() {
        return false;
    }


    @Override
    public String toString() {

        return super.toString();

    }
}
