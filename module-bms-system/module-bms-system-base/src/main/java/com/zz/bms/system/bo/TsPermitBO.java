package com.zz.bms.system.bo;

import com.zz.bms.core.db.entity.ILoginPermitEntity;
import com.zz.bms.system.domain.TsPermitEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import java.io.Serializable;



/**
* 许可 BO , 扩展 TsPermitEntity 对象
* @author Administrator
* @date 2019-4-10 11:08:50
*/
@EntityAnnotation(value="许可" , resource = "system.permit"  ,businessName = "permit_name"    ,businessKey = { "permit_code" }    )
@TableName(value="ts_permit" , resultMap = "TsPermitResultMap")
public class TsPermitBO extends TsPermitEntity implements Serializable , IBoEntity , ILoginPermitEntity<String> {









    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getPermitName();
        
    }

    @Override
    public String getPermissionName() {
        return this.getPermitName();
    }

    @Override
    public String getPermissionCode() {
        return this.getPermitCode();
    }
}
