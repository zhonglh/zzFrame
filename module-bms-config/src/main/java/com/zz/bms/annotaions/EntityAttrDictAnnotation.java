package com.zz.bms.annotaions;

import java.lang.annotation.*;

/**
 * 实体属性是字典的注解类
 */


@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EntityAttrDictAnnotation {

    /**
     * 组编号(USER_STATUS)
     * 比如user_status  和 user_status_name
     * @return
     */
    public String group() default "";

    /**
     * 组对应的列名称 ,  user_status
     * @return
     */
    public String groupField() default "";

    /**
     * 字典类型
     * @return
     */
    public String dictType() default "";



}


