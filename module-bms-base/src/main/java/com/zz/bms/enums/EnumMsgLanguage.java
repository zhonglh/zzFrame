
package com.zz.bms.enums; 
import java.io.Serializable;
import java.util.Locale;

import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 语言
 * @author Administrator
 */
public enum EnumMsgLanguage implements EnumBase<String> {

    zh("cn","中文"),
    us("en","英文"),

  ;

  EnumMsgLanguage(String theValue, String theName) {

        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;


    @Override
    public EnumMsgLanguage getEnum(String v){
        return EnumMsgLanguage.getEnumByValue(v);
    }

   public static EnumMsgLanguage getEnumByValue(String v){
       for(EnumMsgLanguage enum1 : EnumMsgLanguage.values()){
           if(enum1.theValue.equals(v)){
               return enum1;
           }
       }
       return  null;
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