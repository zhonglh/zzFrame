package com.zz.bms.example.bo;

import com.zz.bms.example.domain.TbBankEntity;

import com.baomidou.mybatisplus.annotation.TableField;



import com.zz.bms.core.db.entity.IBoEntity;
import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.constants.DefaultTypeConstant;
import com.zz.bms.constants.DictTypeConstant;
import com.zz.bms.constants.ExcelTypeConstant;
import com.baomidou.mybatisplus.annotation.TableName;


import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
* 银行信息 BO , 扩展 TbBankEntity 对象
* @author Administrator
* @date 2019-5-8 13:45:41
*/
@EntityAnnotation(value="银行信息" , resource = "example.bank"    ,businessName = "bank_name"    ,businessKey = { "bank_name" }    )
@TableName(value="tb_bank" , resultMap = "TbBankResultMap")
public class TbBankBO extends TbBankEntity implements Serializable , IBoEntity {









    @Override
    public boolean isTable() {

        return true;


    }


    @Override
    public String toString() {


            return this.getBankName();
        
    }
}
