package com.zz.bms.system.base.bo;

import com.baomidou.mybatisplus.annotations.TableName;
import com.zz.bms.annotaions.EntityAnnotation;
import com.zz.bms.system.base.entity.TsUserEntity;
import com.zz.bms.system.base.entity.VsUserEntity;

import java.io.Serializable;

/**
 * @author Administrator
 */
@EntityAnnotation(value="用户" , resource = "sys.user")
@TableName(value="vs_user" , resultMap = "VsUserResultMap")
public class VsUserBO extends VsUserEntity implements Serializable {
}
