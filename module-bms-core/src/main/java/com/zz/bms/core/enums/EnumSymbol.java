package com.zz.bms.core.enums;

/**
 * 常用符号 , 如逗号 ， 句号等
 * @author zhonglh
 */

public enum EnumSymbol  {

    COMMA("," , "逗号"),
    END("." , "句号"),
    SEMICOLON(";" , "分号"),

    ;


    private String code ;
    private String name ;

    EnumSymbol(String code, String name) {
        this.code = code;
        this.name = name;
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




}
