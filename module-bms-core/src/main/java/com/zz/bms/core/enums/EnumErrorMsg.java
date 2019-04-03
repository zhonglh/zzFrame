package com.zz.bms.core.enums;

import com.zz.bms.core.exceptions.BizException;
import com.zz.bms.core.vo.AjaxJson;
import com.zz.bms.util.spring.SpringUtil;
import org.apache.commons.lang3.StringUtils;

public enum EnumErrorMsg {

    code_error(-111 , "代码编写错误" , "EnumErrorMsg.code_error"),
    unknown(-100,"未知错误!" , "EnumErrorMsg.unknown"),
    redis_error(-200,"Redis服务出现 错误", "EnumErrorMsg.redis_error"),
    not_session_key(-300,"请求头信息中没有Session Key！" , "EnumErrorMsg.not_session_key"),
    incomplete_data(-400,"数据传输不完整！" , "EnumErrorMsg.incomplete_data"),
    header_invalid(-500,"Header 信息错误！" , "EnumErrorMsg.header_invalid"),


    db_same_error(-800 , "数据重复" , "EnumErrorMsg.db_same_error"),
    db_insert_error(-810 , "操作错误,新增失败" , "EnumErrorMsg.db_insert_error"),
    db_update_error(-820 , "数据没有改变" , "EnumErrorMsg.db_update_error"),
    db_delete_error(-830 , "操作错误,删除失败" , "EnumErrorMsg.db_delete_error"),
    not_select_todelete(-840 , "请选择要删除的数据" , "EnumErrorMsg.not_select_todelete"),


    success(200,"操作成功" , "EnumErrorMsg.success"),
    no_auth(401, "出现错误， 您没有这个权限" , "EnumErrorMsg.no_auth"),
    fail(500,"出现内部错误" , "EnumErrorMsg.fail"),
    illegal(550, "非法操作" , "EnumErrorMsg.illegal"),
    business_error(590, "业务错误" , "EnumErrorMsg.business_error"),

    frequent_operation(1010,"操作太频繁，请稍后再使用！" , "EnumErrorMsg.frequent_operation"),
    param_format_error(2010,"参数格式错误！" , "EnumErrorMsg.param_format_error"),
    information_too_long(2020,"输入信息过长！" , "EnumErrorMsg.information_too_long"),

    check_data_required(8000,"s% 字段为必填项" , "EnumErrorMsg.check_data_required" ),
    check_data_too(8010,"s% 字段数据太长"  , "EnumErrorMsg.check_data_too"),
    check_decimal_too(8010,"s% 字段小数位太长" , "EnumErrorMsg.check_decimal_too"),
    check_data_format(8020,"s% 字段格式错误" , "EnumErrorMsg.check_data_format"),




    notLogin(9130 , "没有登录或登录已过期" , "EnumErrorMsg.notLogin"),
    user_password_error(9010,"用户名密码错误！" , "EnumErrorMsg.user_password_error"),
    user_forbidden(9020,"用户已被禁用！" , "EnumErrorMsg.user_forbidden"),
    user_deleted(9030,"用户已经删除！" , "EnumErrorMsg.user_deleted"),
    user_no_exit(9040,"用户不存在！" , "EnumErrorMsg.user_no_exit"),

    getWxUserError(9110 , "获取微信用户失败" , "EnumErrorMsg.getWxUserError"),
    notWxLogin(9120 , "没有先执行微信登录或登录已过期" , "EnumErrorMsg.notWxLogin"),




    ;
    int code ;
    String name;
    String i18n;
    String[] args;


    EnumErrorMsg(int code, String name , String i18n) {
        this.code = code;
        this.name = name;
        this.i18n = i18n;
    }


    EnumErrorMsg(int code, String name , String i18n , String ... args) {
        this.code = code;
        this.name = name;
        this.i18n = i18n;
        this.args = args;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }


    public String getMsg(){
        String msg = null;
        try {
            msg = SpringUtil.getMessage(i18n, args);
        }catch (Exception e){

        }
        if(StringUtils.isEmpty(msg)) {
            msg = this.getName();
        }
        return msg;
    }

    public BizException toException(){
        return new BizException(this.getCode() , this.getMsg());
    }


    public BizException toException(String msg){
        return new BizException(this.getCode() , msg );
    }


    public AjaxJson toAjaxJson(){
        return new AjaxJson(this.getCode() , this.getMsg());
    }


}
