package com.zz.bms.core;

import com.zz.bms.util.configs.annotaions.*;
import com.zz.bms.core.db.entity.BaseBusinessExEntity;

/**
 * @author Administrator
 */
public class TestEntity extends BaseBusinessExEntity<String> {

    //@EntityAttrDBAnnotation(attrName="名称" , attrLength = 30 , notNull = true, sort = 80)
    @EntityAttrExcelAnnotation
    @EntityAttrCheckAnnotation
    //@EntityAttrPageAnnotation
    private String name;


    //@EntityAttrDBAnnotation(attrName="类型" , attrLength = 1 , notNull = true, sort = 90 )
    @EntityAttrCheckAnnotation(checkRule = "[0,1]{1}")
    //@EntityAttrPageAnnotation(pageElement="select" )
    private String type ;


    //@EntityAttrDBAnnotation(attrName="类型" , attrLength = 30 , notNull = true, sort = 100 )
    //@EntityAttrPageAnnotation(hidden = true)
    @EntityAttrExcelAnnotation
    private String typeName;

}
