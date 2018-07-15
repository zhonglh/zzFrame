package com.zz.bms.core.exceptions;

/**
 * 自定义异常类 基类
 */
public class BizException extends RuntimeException {


    /**
     * 异常信息
     */
    protected String msg;

    /**
     * 具体异常码
     */
    protected int code;


    public BizException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BizException(int code, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
        this.msg = String.format(msgFormat, args);
    }

    public BizException() {
        super();
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(String message) {
        super(message);
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }


}
