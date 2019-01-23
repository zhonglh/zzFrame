package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsTenantEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.EntityAnnotation;

import java.io.Serializable;



/**
* 租户 BO , 扩展 TsTenantEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@EntityAnnotation(value="租户" , resource = "")
@TableName(value="ts_tenant" , resultMap = "TsTenantResultMap")
public class TsTenantBO extends TsTenantEntity implements Serializable {



}
