package com.zz.bms.core.enums;

/**
 * 页面元素类型
 * @author Administrator
 */
public enum EnumPageElement {


    INPUT("input","输入框","") ,
    SELECT("select","选择框","") ,
    DATE("date","日期","") ,
    INTEGER("integer","整数","") ,
    NUMBER("number","数字","") ,
    FILE("file","文件","") ,
    SEARCH("search","查询","") ,

    ;



    private String code;
    private String name;
    private String i18n;


    EnumPageElement(String code, String name, String i18n) {
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
        return "EnumPageElement"+this.getCode();
    }

    public void setI18n(String i18n) {
        this.i18n = i18n;
    }

}
