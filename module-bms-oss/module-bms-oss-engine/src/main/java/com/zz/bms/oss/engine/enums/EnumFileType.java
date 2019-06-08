package com.zz.bms.oss.engine.enums;

import com.zz.bms.core.enums.EnumBase;

/**
 * 文件类型
 * @author admin
 */

public enum EnumFileType implements EnumBase<String> {

    FileType("1" , "文件"),
    ImageType("2" , "图片"),

    ;
    String theValue;
    String theName;

    EnumFileType(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }



    @Override
    public EnumFileType getEnum(String v) {
        return EnumFileType.getEnumByValue(v);
    }

    public static EnumFileType getEnumByValue(String v) {
        for (EnumFileType enum1 : EnumFileType.values()) {
            if (enum1.theValue.equals(v)) {
                return enum1;
            }
        }
        return null;
    }

    @Override
    public String getVal() {
        return theValue;
    }

    @Override
    public String getLabel() {
        return theName;
    }

    @Override
    public String getValue() {
        return theValue;
    }
}
