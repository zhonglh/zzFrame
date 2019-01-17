
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 角色状态
 * @author Administrator
 */
public enum EnumRoleStatus implements EnumBase<String> {

  ;

  EnumRoleStatus(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;


   public static EnumRoleStatus getEnumByValue(String v){
       for(EnumRoleStatus enum1 : EnumRoleStatus.values()){
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