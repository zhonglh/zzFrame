package com.zz.bms.core.enums;


/**
 * 默认值的类型
 */
public enum EnumDefaultType {

    curr_date("curr_date","当前日期(年月日)",""),
    curr_time("curr_time","当前时间(年月日 时分秒)",""),

    curr_user_id("curr_user_id","当前用户ID",""),
    curr_user_loginname("curr_user_loginname","当前用户登录名",""),
    curr_user_name("curr_user_name","当前用户姓名",""),

    curr_user_dept_id("curr_user_dept_id","当前用户部门ID",""),
    curr_user_dept_code("curr_user_dept_code","当前用户部门编码",""),
    curr_user_dept_name("curr_user_dept_name","当前用户部门名称",""),

    curr_user_orga_id("curr_user_orga_id","当前用户机构ID",""),
    curr_user_orga_code("curr_user_orga_id","当前用户机构编码",""),
    curr_user_orga_name("curr_user_orga_name","当前用户机构名称",""),

    curr_user_lead_id("curr_user_lead_id","当前用户领导ID",""),
    curr_user_lead_loginname("curr_user_lead_id","当前用户领导登录名",""),
    curr_user_lead_name("curr_user_lead_name","当前用户领导姓名",""),

    curr_user_dept_lead_id("curr_user_dept_lead_id","当前用户部门领导ID",""),
    curr_user_dept_lead_loginname("curr_user_dept_lead_id","当前用户部门领导登录名",""),
    curr_user__deptlead_name("curr_user__deptlead_name","当前用户部门领导姓名",""),

    ;



    private String code;
    private String name;
    private String i18n;


    EnumDefaultType(String code, String name, String i18n) {
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
        return "EnumDefaultType"+this.getCode();
    }

    public void setI18n(String i18n) {
        this.i18n = i18n;
    }

}
