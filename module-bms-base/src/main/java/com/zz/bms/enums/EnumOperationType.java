
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 操作类型
 * @author Administrator
 */
public enum EnumOperationType implements EnumBase<String> {

  ;

  EnumOperationType(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;



   public static EnumOperationType getEnumByValue(String v){
       for(EnumOperationType enum1 : EnumOperationType.values()){
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