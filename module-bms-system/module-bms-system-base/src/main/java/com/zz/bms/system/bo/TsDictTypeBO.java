package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsDictTypeEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 字典类型 BO , 扩展 TsDictTypeEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="字典类型" , resource = "")
@TableName(value="ts_dict_type" , resultMap = "TsDictTypeResultMap")
public class TsDictTypeBO extends TsDictTypeEntity implements Serializable {



}
