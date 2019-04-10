package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsDictTypeEntity;

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
* 字典类型 BO , 扩展 TsDictTypeEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:54
*/
@EntityAnnotation(value="字典类型" , resource = "system.dicttype"  ,businessName = "dict_type_name"    ,businessKey = { "dict_type_code" }   ,parentColumnName="pid" ,textColumnName="dict_type_name"  )
@TableName(value="ts_dict_type" , resultMap = "TsDictTypeResultMap")
public class TsDictTypeBO extends TsDictTypeEntity implements Serializable , IBoEntity {







    public EasyUiTree toEasyUiTree(){
        EasyUiTree tree = new EasyUiTree();
        tree.setId(this.getId());
        tree.setPid(StringUtils.isEmpty(this.getPid())? null : this.getPid());
        tree.setText(this.getDictTypeName());
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


            return this.getDictTypeName();
        
    }
}
