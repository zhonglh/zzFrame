package com.zz.bms.annotaions;

import java.lang.annotation.*;

/**
 * 实体属性是字典的注解类
 */


@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EntityAttrFkAnnotation {

    /**
     * 组编号(project) ， 比如 project_id , project_name , project_code 是一组
     * @return
     */
    public String group() default "";

    /**
     * 组对应的列名称 ,  project_id
     * @return
     */
    public String groupField() default "";

    /**
     * 是否为外键值 ,  比如 project_id 为 true
     * @return
     */
    public boolean isFkId() default false;


    /**
     * 是否为外键名称 ,  比如 project_name 为 true
     * 如果名称为多个联合， 有多个字段值为 true
     * @return
     */
    public boolean isFkName() default false;


    /**
     * 外键对应的实体类全称
     * 例： com.zz.bms.system.VsUser
     * @return
     */
    public String fkEntity() ;

}


