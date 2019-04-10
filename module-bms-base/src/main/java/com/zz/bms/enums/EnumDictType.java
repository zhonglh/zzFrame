package com.zz.bms.enums;

import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型枚举
 * @author Administrator
 */
public enum EnumDictType implements EnumBase<String> {


    USER_STATUS("user_status"),
    OPERATION_TYPE("operation_type"),
    ROLE_TYPE("role_type"),
    ORGAN_TYPE("organ_type"),
    YES_NO("yes_no"),
    LEAF("leaf"),
    DEP_STATUS("dep_status"),
    SHORTCUT("shortcut"),
    MSG_LANGUAGE("msg_language"),
    ORGAN_STATUS("organ_status"),
    FILE_ENGINE("file_engine"),
    ROLE_STATUS("role_status"),
    DICT_VAL("dict_val"),
    MSG_TEMPLET_TYPE("msg_templet_type"),

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
