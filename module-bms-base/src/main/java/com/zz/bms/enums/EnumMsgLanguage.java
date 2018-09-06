
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 语言
 * @author Administrator
 */
public enum EnumMsgLanguage implements EnumBase {

  ;

  EnumMsgLanguage(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;


   @Override
   public Serializable getTheValue() {
       return theValue;
   }


   @Override
   public String getTheName() {
       return theName;
   }


   public static EnumMsgLanguage getEnumByValue(String v){
       for(EnumMsgLanguage enum1 : EnumMsgLanguage.values()){
           if(enum1.getTheValue().equals(v)){
               return enum1;
           }
       }
       return  null;
   }

}