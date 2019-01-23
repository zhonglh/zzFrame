package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsMenuEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 菜单 BO , 扩展 TsMenuEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="菜单" , resource = "")
@TableName(value="ts_menu" , resultMap = "TsMenuResultMap")
public class TsMenuBO extends TsMenuEntity implements Serializable {



}
