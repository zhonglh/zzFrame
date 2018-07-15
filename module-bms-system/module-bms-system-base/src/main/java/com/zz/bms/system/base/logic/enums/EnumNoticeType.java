package com.zz.bms.system.base.logic.enums;

/**
 * @author Administrator
 */

public enum EnumNoticeType {

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
