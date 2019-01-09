package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsMenuPermitEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 菜单许可关联 BO , 扩展 TsMenuPermitEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="菜单许可关联" , resource = "")
@TableName(value="ts_menu_permit" , resultMap = "TsMenuPermitResultMap")
public class TsMenuPermitBO extends TsMenuPermitEntity implements Serializable {



}
