
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 业务类型
 * @author Administrator
 */
public enum EnumBusinessType implements EnumBase<String> {

  ;

  EnumBusinessType(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;


    @Override
    public EnumBusinessType getEnum(String v){
        return EnumBusinessType.getEnumByValue(v);
    }


   public static EnumBusinessType getEnumByValue(String v){
       for(EnumBusinessType enum1 : EnumBusinessType.values()){
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