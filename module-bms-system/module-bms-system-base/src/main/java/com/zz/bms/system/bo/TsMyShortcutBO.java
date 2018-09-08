package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsMyShortcutEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 置顶快捷菜单 BO , 扩展 TsMyShortcutEntity 对象
* @author Administrator
* @date 2018-9-8 12:42:41
*/
@EntityAnnotation(value="置顶快捷菜单" , resource = "")
@TableName(value="ts_my_shortcut" , resultMap = "TsMyShortcutResultMap")
public class TsMyShortcutBO extends TsMyShortcutEntity implements Serializable {



}
