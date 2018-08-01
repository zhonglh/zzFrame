package com.zz.bms.core.enums;

import java.io.Serializable;

/**
 * 条件枚举
 * @author Administrator
 */

public enum EnumSearchType implements EnumBase{

    eq("","等于"),
    ne("ne","不等于"),

    gt("gt","大于"),
    ge("ge","大于等于"),
    lt("lt","小于"),
    le("le","小于等于"),

    like("like","模糊匹配"),
    notlike("notlike","模糊不匹配"),
    in("in","IN"),
    notin("notin","NOT IN"),



    between("between" , "范围-左闭右闭"),
    betweenl("betweenl" , "范围-左开右闭"),
    betweenr("betweenr" , "范围-右开左闭"),


    isnull("isnull","为空"),
    isnotnull("isnotnull","不为空"),

    ;

    EnumSearchType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    String value ;
    String name ;

    @Override
    public Serializable getTheValue() {
        return name();
    }

    @Override
    public String getTheName() {
        return name;
    }

    public static EnumSearchType getQueryRelationByValue(String v){
        for(EnumSearchType relation : EnumSearchType.values()){
            if(relation.getTheValue().equals(v)){
                return relation;
            }
        }
        return  null;
    }


}
