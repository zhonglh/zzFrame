
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 机构类型
 * @author Administrator
 */
public enum EnumOrganType implements EnumBase<String> {

    //一级机构
    //二级机构
    //三级机构
  ;

  EnumOrganType(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;





    @Override
    public EnumOrganType getEnum(String v){
        return EnumOrganType.getEnumByValue(v);
    }

   public static EnumOrganType getEnumByValue(String v){
       for(EnumOrganType enum1 : EnumOrganType.values()){
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