package com.zz.bms.system.bo;

import com.zz.bms.core.ui.easyui.EasyUiTree;
import com.zz.bms.system.domain.TsMenuPermitEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
* 菜单许可关联 BO , 扩展 TsMenuPermitEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="菜单许可关联" , resource = "")
@TableName(value="ts_menu_permit" , resultMap = "TsMenuPermitResultMap")
public class TsMenuPermitBO extends TsMenuPermitEntity implements Serializable {






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


}
