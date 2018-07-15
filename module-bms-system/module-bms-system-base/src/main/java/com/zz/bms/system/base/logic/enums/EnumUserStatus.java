package com.zz.bms.system.base.logic.enums;


/**
 * 用户状态
 * @author Administrator
 */
public enum EnumUserStatus {

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
