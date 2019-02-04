package com.zz.bms.system.bo;

import com.zz.bms.core.db.entity.ILoginPermitEntity;
import com.zz.bms.system.domain.TsPermitEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.bms.util.configs.annotaions.*;

import java.io.Serializable;



/**
* 许可 BO , 扩展 TsPermitEntity 对象
* @author Administrator
* @date 2018-9-6 23:56:31
*/
@EntityAnnotation(value="许可" , resource = "")
@TableName(value="ts_permit" , resultMap = "TsPermitResultMap")
public class TsPermitBO extends TsPermitEntity implements Serializable,ILoginPermitEntity<String> {



    @Override
    public String getPermissionName() {
        return this.getPermitName();
    }

    @Override
    public String getPermissionCode() {
        return this.getPermissionCode();
    }
}
