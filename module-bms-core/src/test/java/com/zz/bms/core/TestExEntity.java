package com.zz.bms.core;

import com.zz.bms.util.configs.annotaions.*;

/**
 * @author Administrator
 */
public class TestExEntity extends  TestEntity {

    //@EntityAttrDBAnnotation(attrName="年龄" , attrLength = 2 , notNull = true, sort = 80)
    @EntityAttrExcelAnnotation
    @EntityAttrCheckAnnotation
    //@EntityAttrPageAnnotation(min = 10 , max = 99)
    private int age ;

}
