package com.zz.bms.configs;

/**
 * 系统配置类
 * @author Administrator
 */
public final class AppConfig {


    /**
     * 是否启用租户模式，即多企业
     * 该属性的内容如果要修改，在需求开始阶段就要确定
     */
    public static boolean USE_TENANT = true;


    /**
     * 是否调试模式
     * 在Spring容器(或Servlet容器) 启动完后根据实际情况修改
     */
    public static boolean DEBUG_MODE = false;


    /**
     * 部署时是否使用了动静分离  SASS:Static and static separation
     */
    public static boolean USE_SASS = false;




}
