package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsDictEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 字典信息 BO , 扩展 TsDictEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="字典信息" , resource = "")
@TableName(value="ts_dict" , resultMap = "TsDictResultMap")
public class TsDictBO extends TsDictEntity implements Serializable {



}
