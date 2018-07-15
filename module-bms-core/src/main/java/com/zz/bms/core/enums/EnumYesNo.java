package com.zz.bms.core.enums;

/**
 * Created by Administrator on 2017/6/19.
 */
public enum EnumYesNo {

    YES("1","是" ,"EnumYesNo.boolean.true"),
    NO ("0","否" ,"EnumYesNo.boolean.false");


    private String code;
    private String name;
    private String i18n;


    EnumYesNo(String code, String name, String i18n) {
        this.code = code;
        this.name = name;
        this.i18n = i18n;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getI18n() {
        return i18n;
    }

    public void setI18n(String i18n) {
        this.i18n = i18n;
    }
}
