package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsRolePermitEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 角色许可关联 BO , 扩展 TsRolePermitEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="角色许可关联" , resource = "")
@TableName(value="ts_role_permit" , resultMap = "TsRolePermitResultMap")
public class TsRolePermitBO extends TsRolePermitEntity implements Serializable {



}
