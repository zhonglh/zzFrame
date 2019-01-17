package com.zz.bms.enums;

import com.zz.bms.core.enums.EnumBase;

import java.io.Serializable;

/**
 * @author Administrator
 */

public enum EnumNoticeType implements EnumBase<String> {


    /**
     *系统通知
     */
    UL_NOTICE("1" , "系统通知", "noticetype.system"),

    /**
     * 流程通知
     */
    ACT_NOTICE("2" , "流程通知" , "noticetype.workflow"),


    ;
    private String code;
    private String name;
    private String i18n;


    EnumNoticeType(String code, String name, String i18n) {
        this.code = code;
        this.name = name;
        this.i18n = i18n;
    }



    public static EnumNoticeType getEnumByValue(String v){
        for(EnumNoticeType enum1 : EnumNoticeType.values()){
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
