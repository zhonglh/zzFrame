package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsFileUseEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 文件使用 BO , 扩展 TsFileUseEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="文件使用" , resource = "")
@TableName(value="ts_file_use" , resultMap = "TsFileUseResultMap")
public class TsFileUseBO extends TsFileUseEntity implements Serializable {



}
