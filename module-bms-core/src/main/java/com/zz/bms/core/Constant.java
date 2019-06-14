package com.zz.bms.core;

/**
 * 枚举常量
 * @author Administrator
 */
public class Constant {


    public final static String REMEMBER = "REMEMBER";

    //rbac 用户信息 session attrName
    public final static String SESSION_USER = "SESSION_USER";


    //rbac 用户菜单 session attrName
    public final static String SESSION_MENU= "SESSION_MENU";

    //rbac 用户许可 session attrName
    public final static String SESSION_PERMIEEION = "SESSION_PERMIEEION";


    public final static int EXCEL_NON = 0;
    public final static int EXCEL_ONLY_IMPORT = 1;
    public final static int EXCEL_ONLY_EXPORT = 2;
    public final static int EXCEL_ALL = 3;

    /**
     * 用户缓存
     */
    public static final String USER_CACHE="userCache";

    /**
     * 数据字典缓存
     */
    public static final String DICTIONARIES_CACHE="dictCache";

    /**
     * 云存储配置KEY
     */
    public final static String CLOUD_STORAGE_CONFIG_KEY = "CLOUD_STORAGE_CONFIG_KEY";


    /**
     * web 根目录路径
     */
    public static String servletRealPath ;



    /**
     * 初始的版本号 ， 版本号都是从1开始
     */
    public final static Integer INIT_VERSION = 1;




    public final static String CONTEXT_PATH = "ctx";


    /**
     * 当前请求的地址 带参数
     */
    public final static String CURRENT_URL = "currentURL";


    /**
     * 当前请求的地址 不带参数
     */
    public final static String CURRENT_URL_NO_QUERYSTRING = "currentURLNoQueryString";


    /**
     * 上个页面地址
     */
    public final static String BACK_URL = "BackURL";


    /**
     * 用于列表界面
     */
    public final static String TABLEID = "tableId";
    public final static String CURR_PARENT_URL = "currParentUrl";
    public final static String BREADCRUMB = "breadcrumb";
    public final static String PAGINGSIZE = "PagingSize";






}
