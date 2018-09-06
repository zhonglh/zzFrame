package com.zz.bms.enums;

import com.zz.bms.core.enums.EnumBase;

import java.io.Serializable;

public enum EnumDataAuth implements EnumBase {




    /**
     * 所有
     */
    ALL_DATA("0" , "所有" , "dataauth.all"),

    /**
     * 部门数据权限
     */
    DEPT_DATA("1", "部门数据权限" , "dataauth.dept"),

    /**
     * 机构数据权限
     */
    ORGAN_DATA("2", "机构数据权限" , "dataauth.organ"),

    /**
     * 岗位权限
     */
    JOB_DATA("3", "岗位权限" , "dataauth.job"),


    /**
     * 人员权限
     */
    USER_DATA("4", "人员权限" , "dataauth.user"),


    /**
     * 业务权限
     */
    BUSINESS_DATA("9", "业务权限", "dataauth.business"),




    ;
    private String code;
    private String name;
    private String i18n;


    EnumDataAuth(String code, String name, String i18n) {
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
    public Serializable getTheValue() {
        return code;
    }

    @Override
    public String getTheName() {
        return name;
    }
}
