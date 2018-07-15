package com.zz.bms.util.base.remote;


import com.zz.bms.util.base.PropertyConfig;

public final class ShellConstant {


    public final static PropertyConfig pc = new PropertyConfig("shell.properties");
    public final static String SHELL_HOST        = pc.getProperty ("SHELL_HOST", "");
    public final static String SHELL_HOST_NAME   = pc.getProperty ("SHELL_HOST_NAME", "");
    public final static String SHELL_HOST_PASSWD = pc.getProperty ("SHELL_HOST_PASSWD", "");
    public final static String SHELLPACK  = pc.getProperty ("SHELLPACK", "/bin/sh");



    /**
     * <p>
     * Title: 私有构造函数
     * </p>
     * <p>
     * Description:禁止实例化
     * </p>
     */
    private ShellConstant() {
    }


    /**
     * @Fields OPTION : 执行参数
     */
    public static final String OPTION = "-c";
    /**
     * @Fields SPACE : 字符串连接
     */
    public static final String SPACE  = " ";
   
    /**
     * @Fields START : 一组参数开始
     */
    public static final String START  = "'";
    /**
     * @Fields END : 一组参数结束
     */
    public static final String END    = new StringBuffer("'").append (SPACE).toString ();

    /**
     * @Fields APPEND : 脚本字符分隔符
     */
    public static final String APPEND = "|";

    /**
     * @Fields COMMA : 逗号分隔
     */
    public static final String COMMA  = ",";

 

}
