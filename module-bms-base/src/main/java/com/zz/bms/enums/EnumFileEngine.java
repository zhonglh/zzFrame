
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 文件引擎
 * @author Administrator
 */
public enum EnumFileEngine implements EnumBase<String> {

  ;

  EnumFileEngine(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;


   public static EnumFileEngine getEnumByValue(String v){
       for(EnumFileEngine enum1 : EnumFileEngine.values()){
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