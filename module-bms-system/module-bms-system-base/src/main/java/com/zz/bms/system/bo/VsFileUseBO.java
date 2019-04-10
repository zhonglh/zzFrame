package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsFileUseEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;

import com.zz.bms.system.bo.TsFileUseBO;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;



/**
* 文件使用 BO , 扩展 TsFileUseBO 对象
* @author Administrator
* @date 2019-4-10 20:58:06
*/
@EntityAnnotation(value="文件使用" , resource = "system.fileuse"  ,businessName = "show_name"    ,businessKey = { "" }    )
@TableName(value="vs_file_use" , resultMap = "VsFileUseResultMap")
public class VsFileUseBO extends TsFileUseBO implements Serializable , IBoEntity {



    @Override
    public boolean isTable() {


        return false;

    }


    @Override
    public String toString() {

        return super.toString();

    }
}
