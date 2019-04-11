
package com.zz.bms.enums; 
import java.io.Serializable;
import com.zz.bms.core.enums.EnumBase;

/**
 * 字典类型 操作类型
 * @author Administrator
 */
public enum EnumOperationType implements EnumBase<String> {



    LOGIN("1","登陆"),
    LOGOUT("2","退出"),
    LOGOUT_TIMEOUT("3","超时退出"),
    LOGOUT_FORCE("4","强制退出"),
    SHOT_OFF("5","踢出"),

    //增加
    //修改
    //删除
    //提交
    //...
  ;

  EnumOperationType(String theValue, String theName) {
        this.theValue = theValue;
        this.theName = theName;
    }

  String theValue ;
  String theName ;




    @Override
    public EnumOperationType getEnum(String v){
        return EnumOperationType.getEnumByValue(v);
    }

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