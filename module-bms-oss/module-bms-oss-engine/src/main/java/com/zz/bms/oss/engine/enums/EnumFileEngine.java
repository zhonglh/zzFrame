package com.zz.bms.oss.engine.enums;

import com.zz.bms.core.enums.EnumBase;

import java.io.Serializable;

/**
 * 文件存储类型
 * @author Administrator
 */
public enum EnumFileEngine implements EnumBase<String> {

    /**
     * 文件系统
     */
    FILESYSTEM("1" , "文件系统"),

    /**
     * Fast nfs 系统
     */
    FASTNFS("2" , "Fast Nfs"),

    /**
     * Mongo DB
     */
    MONGODB("3" , "MongoDB"),

    /**
     * 七牛云
     */
    CLOUD_QINIU("4" , "七牛云"),

    /**
     * 阿里云
     */
    CLOUD_ALI("5" , "阿里云"),

    /**
     * 腾讯云
     */
    CLOUD_TENXEN("6" , "腾讯云"),
    ;

    String theValue;
    String theName;

    EnumFileEngine(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

    

    @Override
    public EnumFileEngine getEnum(String v) {
        return EnumFileEngine.getEnumByValue(v);
    }

    public static EnumFileEngine getEnumByValue(String v) {
        for (EnumFileEngine enum1 : EnumFileEngine.values()) {
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
