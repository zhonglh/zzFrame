package com.zz.bms.enums;

import com.zz.bms.core.enums.EnumBase;

/**
 * 默认值枚举
 * @author Administrator
 */
public enum EnumDefaultType implements EnumBase<String> {


    CURRENT_YEAR("CURRENT_YEAR","当前年份" ),
    CURRENT_MONTH("CURRENT_MONTH","当前月份" ),
    CURRENT_DATE("CURRENT_DATE","当前日期" ),
    CURRENT_TIME("CURRENT_TIME","当前时间" ),

    CURRENT_USERID("CURRENT_USERID","当前用户ID" ),
    CURRENT_USERNAME("CURRENT_USERNAME","当前用户姓名" ),
    CURRENT_USER_LEADID("CURRENT_USER_LEADID","当前用户领导ID" ),
    CURRENT_USER_LEADNAME("CURRENT_USER_LEADNAME","当前用户领导姓名" ),

    CURRENT_USER_DEPTID("CURRENT_USER_DEPTID","当前用户部门ID" ),
    CURRENT_USER_DEPTNAME("CURRENT_USER_DEPTNAME","当前用户部门名称" ),
    CURRENT_USER_ORGAID("CURRENT_USER_ORGAID","当前用户机构ID" ),
    CURRENT_USER_ORGANAME("CURRENT_USER_ORGANAME","当前用户机构名称" ),
    CURRENT_USER_TENANTID("CURRENT_USER_TENANTID","当前用户企业ID" ),
    CURRENT_USER_TENANTNAME("CURRENT_USER_TENANTNAME","当前用户企业名称" ),


    CUSTOM("CUSTOM","自定义" ),


        ;



    String code;
    String name;

    EnumDefaultType(String code, String name) {
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
    public EnumDefaultType getEnum(String v){
        return EnumDefaultType.getEnumByValue(v);
    }

    public static EnumDefaultType getEnumByValue(String code){
        for(EnumDefaultType e : EnumDefaultType.values()){
            if(e.code.equals(code)){
                return e;
            }
        }
        return null;

    }
}
