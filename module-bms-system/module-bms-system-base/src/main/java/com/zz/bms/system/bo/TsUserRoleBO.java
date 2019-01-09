package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsUserRoleEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 用户角色关联 BO , 扩展 TsUserRoleEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="用户角色关联" , resource = "")
@TableName(value="ts_user_role" , resultMap = "TsUserRoleResultMap")
public class TsUserRoleBO extends TsUserRoleEntity implements Serializable {



}
