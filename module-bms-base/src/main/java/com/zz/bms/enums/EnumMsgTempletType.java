
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 消息模板类型
 * @author Administrator
 */
public enum EnumMsgTempletType implements EnumBase<String> {

    SMS("sms","短信模板"),
    EMAIL("email","邮件模板"),

  ;

  EnumMsgTempletType(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;


   public static EnumMsgTempletType getEnumByValue(String v){
       for(EnumMsgTempletType enum1 : EnumMsgTempletType.values()){
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