package com.zz.bms.system.bo;

import com.zz.bms.system.domain.VsUserPermitEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 用户许可视图 BO , 扩展 VsUserPermitEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="用户许可视图" , resource = "")
@TableName(value="vs_user_permit" , resultMap = "VsUserPermitResultMap")
public class VsUserPermitBO extends VsUserPermitEntity implements Serializable {



}
