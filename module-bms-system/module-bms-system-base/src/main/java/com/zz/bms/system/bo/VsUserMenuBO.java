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

import com.zz.bms.system.bo.TsMenuBO;

import java.io.Serializable;



/**
* 菜单 BO , 扩展 TsMenuBO 对象
* @author Administrator
* @date 2019-4-10 11:08:55
*/
@EntityAnnotation(value="菜单" , resource = "system.usermenu"  ,businessName = "menu_name"    ,businessKey = { "menu_code" }   ,parentColumnName="pid" ,textColumnName="menu_name" )
@TableName(value="vs_user_menu" , resultMap = "VsUserMenuResultMap")
public class VsUserMenuBO extends TsMenuBO implements Serializable , IBoEntity {



    @Override
    public boolean isTable() {


        return super.isTable();

    }


    @Override
    public String toString() {

        return super.toString();

    }
}
