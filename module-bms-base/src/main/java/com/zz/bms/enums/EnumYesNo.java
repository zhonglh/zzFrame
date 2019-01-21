package com.zz.bms.enums;

import com.zz.bms.core.enums.EnumBase;

/**
 * YES NO
 * @author Administrator
 * @date 2017/6/19
 */
public enum EnumYesNo implements EnumBase<String> {

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



    @Override
    public EnumYesNo getEnum(String v){
        return EnumYesNo.getEnumByValue(v);
    }

    public static EnumYesNo getEnumByValue(String v){
        for(EnumYesNo enum1 : EnumYesNo.values()){
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
