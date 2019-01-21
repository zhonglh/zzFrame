package com.zz.bms.enums;


import com.zz.bms.core.enums.EnumBase;

/**
 * 界面元素
 * @author Administrator
 */
public enum EnumPageElement implements EnumBase<String> {

    text("input","text" , "文本") ,
    password("input","password" , "密码") ,
    digits("input","digits" , "整数") ,
    number("input","number" , "数字") ,
    date("input","date" , "日期") ,
    timestamp("input","timestamp" , "时间") ,
    email("input","email" , "邮件") ,
    url("input","url" ,"网址"),
    phone("input","phone" ,"手机号"),
    creditcard("input","creditcard" ,"信用卡"),
    bankno("input","bankno" ,"银行卡号"),

    radio("input","radio" ,"单选"),
    checkbox("input","checkbox" ,"多选"),


    textarea("textarea","textarea" ,"文本域"),
    select("select","select" ,"下拉选择"),

    openwin("openwin","openwin" ,"弹框选择"),

    singlefile("file","singlefile" ,"单文件"),
    multifile("file","multifile" ,"多文件"),

    singleimage("file","singleimage" ,"单图片"),
    multiimage("file","multiimage" ,"多图片"),
    ;

    EnumPageElement(String element , String value, String name) {
        this.element = element;
        this.value = value;
        this.name = name;
    }

    String element ;
    String value ;
    String name ;



    @Override
    public String getVal(){
        return value;
    }

    @Override
    public String getLabel(){
        return name;
    }


    @Override
    public String getValue(){
        return value;
    }



    @Override
    public EnumPageElement getEnum(String v){
        return EnumPageElement.getEnumByValue(v);
    }

    public static EnumPageElement getEnumByValue(String val){
        try {
            return EnumPageElement.valueOf(val);
        }catch(Exception e){
            return null;
        }
    }


}
