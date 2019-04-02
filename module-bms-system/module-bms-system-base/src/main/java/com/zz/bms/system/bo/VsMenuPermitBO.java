package com.zz.bms.system.bo;

import com.zz.bms.core.ui.easyui.EasyUiTree;
import com.zz.bms.system.domain.VsMenuPermitEntity;

import com.baomidou.mybatisplus.annotation.TableField;

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
* 菜单许可关联 BO , 扩展 VsMenuPermitEntity 对象
* @author Administrator
* @date 2019-4-1 13:52:04
*/
@EntityAnnotation(value="菜单许可关联" , resource = "system.menupermit"  ,businessName = "permit_name"    ,businessKey = { "permit_code" }  )
@TableName(value="vs_menu_permit" , resultMap = "VsMenuPermitResultMap")
public class VsMenuPermitBO extends VsMenuPermitEntity implements Serializable , IBoEntity {



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
        return false;
    }


    @Override
    public String toString() {

            return this.getPermitName();
        
    }
}
