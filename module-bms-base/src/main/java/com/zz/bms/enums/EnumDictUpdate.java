
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 字典是否可以修改
 * @author Administrator
 */
public enum EnumDictUpdate implements EnumBase {

  ;

  EnumDictUpdate(String theValue, String theName) {
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


   public static EnumDictUpdate getEnumByValue(String v){
       for(EnumDictUpdate enum1 : EnumDictUpdate.values()){
           if(enum1.getTheValue().equals(v)){
               return enum1;
           }
       }
       return  null;
   }

}