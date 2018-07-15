package com.zz.bms.core.exceptions;


/**
 * 接口调用异常
 */
public class RestException extends BizException {
    private static final long serialVersionUID = 1L;


    public RestException(int errcode, String message){
        super(errcode,message);
    }


    public RestException(int errcode, String message, Throwable cause)
    {
        super(message,cause);
        this.code = errcode;
    }

}
