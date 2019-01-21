package com.zz.bms.enums;

import com.zz.bms.core.enums.EnumBase;

/**
 * Excel 类型
 * @author Administrator
 */
public enum EnumExcelType implements EnumBase<String> {

    NONE("0" , "不导入不导出") ,
    ONLY_IMPORT("1" , "只导入") ,
    ONLY_EXPORT("2" , "只导出") ,
    IMPORT_EXPORT("3" , "导入导出") ,

    ;



    String code;
    String name;

    EnumExcelType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getVal() {
        return name;
    }


    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public String getValue() {
        return code;
    }



    @Override
    public EnumExcelType getEnum(String v){
        return EnumExcelType.getEnumByValue(v);
    }

    public static  EnumExcelType getEnumByValue(String code){
        for(EnumExcelType e : EnumExcelType.values()){
            if(e.code.equals(code)){
                return e;
            }
        }
        return null;

    }
}
