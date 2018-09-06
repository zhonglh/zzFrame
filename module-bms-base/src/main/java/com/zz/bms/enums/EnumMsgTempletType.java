
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 消息模板类型
 * @author Administrator
 */
public enum EnumMsgTempletType implements EnumBase {

  ;

  EnumMsgTempletType(String theValue, String theName) {
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


   public static EnumMsgTempletType getEnumByValue(String v){
       for(EnumMsgTempletType enum1 : EnumMsgTempletType.values()){
           if(enum1.getTheValue().equals(v)){
               return enum1;
           }
       }
       return  null;
   }

}