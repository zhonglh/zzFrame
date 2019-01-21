package com.zz.bms.enums;

import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型枚举
 * @author Administrator
 */
public enum EnumDictType implements EnumBase<String> {


    YES_NO("yes_no"),
    USER_STATUS("user_status")

    ;


    private String code;


    EnumDictType(String code) {
        this.code = code;
    }

    @Override
    public String getVal() {
        return code;
    }

    @Override
    public String getLabel() {
        return code;
    }

    @Override
    public String getValue() {
        return code;
    }




    @Override
    public EnumDictType getEnum(String v){
        return EnumDictType.getEnumByValue(v);
    }

    public static EnumDictType getEnumByValue(String v){
        for(EnumDictType enum1 : EnumDictType.values()){
            if(enum1.code.equals(v)){
                return enum1;
            }
        }
        return  null;
    }
}
