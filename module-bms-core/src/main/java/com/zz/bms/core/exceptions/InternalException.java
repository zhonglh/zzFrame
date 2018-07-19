package com.zz.bms.core.exceptions;

/**
 * 内部错误， 主要是代码本身错误
 * @author Administrator
 */
public class InternalException extends BizException {


    public InternalException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public InternalException(int code, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
        this.msg = String.format(msgFormat, args);
    }

    public InternalException() {
        super();
    }

    public InternalException(String message, Throwable cause) {
        super(message, cause);
    }

    public InternalException(Throwable cause) {
        super(cause);
    }

    public InternalException(String message) {
        super(message);
    }

}
