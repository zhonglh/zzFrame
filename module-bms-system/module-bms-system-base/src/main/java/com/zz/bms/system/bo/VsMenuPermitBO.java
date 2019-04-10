package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsMenuPermitEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;

import com.zz.bms.system.bo.TsMenuPermitBO;

import java.io.Serializable;



/**
* 菜单许可关联 BO , 扩展 TsMenuPermitBO 对象
* @author Administrator
* @date 2019-4-10 11:08:56
*/
@EntityAnnotation(value="菜单许可关联" , resource = "system.menupermit"  ,businessName = "permit_name"    ,businessKey = { "" }    )
@TableName(value="vs_menu_permit" , resultMap = "VsMenuPermitResultMap")
public class VsMenuPermitBO extends TsMenuPermitBO implements Serializable , IBoEntity {



    @Override
    public boolean isTable() {


        return super.isTable();

    }


    @Override
    public String toString() {

        return super.toString();

    }
}
