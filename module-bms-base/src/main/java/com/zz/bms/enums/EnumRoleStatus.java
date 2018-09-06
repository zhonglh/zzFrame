
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 角色状态
 * @author Administrator
 */
public enum EnumRoleStatus implements EnumBase {

  ;

  EnumRoleStatus(String theValue, String theName) {
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


   public static EnumRoleStatus getEnumByValue(String v){
       for(EnumRoleStatus enum1 : EnumRoleStatus.values()){
           if(enum1.getTheValue().equals(v)){
               return enum1;
           }
       }
       return  null;
   }

}