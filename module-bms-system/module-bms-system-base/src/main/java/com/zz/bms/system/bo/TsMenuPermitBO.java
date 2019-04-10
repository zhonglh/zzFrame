package com.zz.bms.system.bo;

import com.zz.bms.core.ui.easyui.EasyUiTree;
import com.zz.bms.system.domain.TsMenuPermitEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
* 菜单许可关联 BO , 扩展 TsMenuPermitEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:52
*/
@EntityAnnotation(value="菜单许可关联" , resource = "system.menupermit"  ,businessName = "permit_name"    ,businessKey = { "" }    )
@TableName(value="ts_menu_permit" , resultMap = "TsMenuPermitResultMap")
public class TsMenuPermitBO extends TsMenuPermitEntity implements Serializable , IBoEntity {




    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "menuId",  groupName = "菜单" ,   dbColumnName = "menu_name" , dbColumnType = "VARCHAR" , dbColumnLength = 30   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsMenuBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "菜单",sort = 201                      ,required=true )
    private String menuName ;



    @TableField(exist = false)
    @EntityAttrFkAnnotation(group = "permitId",  groupName = "许可" ,   dbColumnName = "permit_name" , dbColumnType = "VARCHAR" , dbColumnLength = 20   , dbColumnNotNull = true , fkClass=com.zz.bms.system.bo.TsPermitBO.class)
    @EntityAttrExcelAnnotation(excelProcess= "3")
    @EntityAttrPageAnnotation(title = "许可",sort = 301                      ,required=true )
    private String permitName ;



    public void setMenuName(String menuName){
        this.menuName = menuName;
    }

    public String getMenuName(){
        return this.menuName;
    }

    public void setPermitName(String permitName){
        this.permitName = permitName;
    }

    public String getPermitName(){
        return this.permitName;
    }




    public EasyUiTree toEasyUiTree(){
        EasyUiTree tree = new EasyUiTree();
        tree.setId(this.getPermitId());
        tree.setPid(this.getMenuId());
        tree.setText(this.getPermitName());
        Map<String,String> attributes = new HashMap<String,String>();
        attributes.put( EasyUiTree.TREE_TYPE , "permit");
        tree.setAttributes(attributes);
        return tree;
    }




    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getPermitName();
        
    }
}
