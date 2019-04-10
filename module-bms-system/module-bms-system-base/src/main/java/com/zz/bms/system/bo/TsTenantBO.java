package com.zz.bms.system.bo;

import com.zz.bms.system.domain.TsTenantEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 企业 BO , 扩展 TsTenantEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:53
*/
@EntityAnnotation(value="企业" , resource = "system.tenant"  ,businessName = "tenant_name"    ,businessKey = { "tenant_code" }    )
@TableName(value="ts_tenant" , resultMap = "TsTenantResultMap")
public class TsTenantBO extends TsTenantEntity implements Serializable , IBoEntity {









    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getTenantName();
        
    }
}
