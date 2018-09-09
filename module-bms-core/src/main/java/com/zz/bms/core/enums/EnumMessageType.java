package com.zz.bms.core.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */

public enum EnumMessageType {

    LOGIN("1" , "登录信息") ,

    TEXT("2" , "文本信息") ;



    private String code ;
    private String name ;

    EnumMessageType(String code, String name) {
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


    public static List<Map<String,String>> getAllNotifyType(){
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        for(EnumMessageType enum1 : EnumMessageType.values()){
            Map<String,String> map = new HashMap<String,String>();
            map.put("code",enum1.getCode());
            map.put("name",enum1.getName());
            list.add(map);
        }
        return list;
    }

}
