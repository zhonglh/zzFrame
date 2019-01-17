
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 语言
 * @author Administrator
 */
public enum EnumMsgLanguage implements EnumBase<String> {

  ;

  EnumMsgLanguage(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;


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