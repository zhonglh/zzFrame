package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsNodeUserEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;

import com.zz.bms.system.bo.TsUserBO;

import java.io.Serializable;



/**
* 用户 BO , 扩展 TsUserBO 对象
* @author Administrator
* @date 2019-4-10 11:08:53
*/
@EntityAnnotation(value="用户" , resource = "system.nodeuser"  ,businessName = "user_name"    ,businessKey = { "" }    )
@TableName(value="vs_node_user" , resultMap = "VsNodeUserResultMap")
public class VsNodeUserBO extends TsUserBO implements Serializable , IBoEntity {



    @Override
    public boolean isTable() {


        return super.isTable();

    }


    @Override
    public String toString() {

        return super.toString();

    }
}
