package com.zz.bms.enums;


import com.zz.bms.core.enums.EnumBase;

import java.io.Serializable;

/**
 * 用户状态
 * @author Administrator
 */
public enum EnumUserStatus implements EnumBase<String> {


    normal("1","正常" , "userstatus.normal"),
    forbidden("0","禁用" , "userstatus.forbidden"),

    ;
    private String code;
    private String name;
    private String i18n;


    EnumUserStatus(String code, String name, String i18n) {
        this.code = code;
        this.name = name;
        this.i18n = i18n;
    }


    public static EnumUserStatus getEnumByValue(String v){
        for(EnumUserStatus enum1 : EnumUserStatus.values()){
            if(enum1.code.equals(v)){
                return enum1;
            }
        }
        return  null;
    }

    @Override
    public String getVal() {
        return code;
    }

    @Override
    public String getLabel() {
        return name;
    }

    @Override
    public String getValue() {
        return code;
    }

}
