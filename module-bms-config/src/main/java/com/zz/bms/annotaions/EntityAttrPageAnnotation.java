package com.zz.bms.annotaions;


import java.lang.annotation.*;

/**
 * 实体属性页面的注解类
 * group 和 groupField ,
 * 比如对应用户，有的对应用户的ID, UserName ,Code ,LoginName等
 * 那么都是对应 User组， 有的列对应用户的ID , UserName
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EntityAttrPageAnnotation {

    /**
     * 组 ， 比如项目ID, 项目编码  项目名称是一组
     * @return
     */
    public String group() default "";

    /**
     * 组对应的列名称(属性名称)
     * @return
     */
    public String groupField() default "";


    /**
     * 页面元素, 如input , select , check , file , lookup 等
     * @return
     */
    public String pageElement() default "input";

    /**
     * 是否隐藏
     * @return
     */
    public boolean hidden() default false;

    /**
     * 是否只读
     * @return
     */
    public boolean readonly() default false;

    /**
     * 如果是数字， 最小值
     * @return
     */
    public int min() default 0 ;


    /**
     * 如果是数字， 最大值
     * @return
     */
    public int max() default Integer.MAX_VALUE ;


    /**
     * 界面上最小输入长度
     * @return
     */
    public int minLength() default 0 ;


    /**
     * 界面上最大输入长度
     * @return
     */
    public int maxLength() default Integer.MAX_VALUE ;


    /**
     * 默认值 , 会有一些特殊的值需要解析(如当前日期， 当前登录人ID)
     * 参考 EnumDefaultValue
     * @return
     */
    public String defaultVal() default  "" ;

}
