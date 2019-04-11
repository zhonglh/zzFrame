package com.zz.bms.events;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * 登陆事件
 * @author zhonglh
 */
public class LoginLogEvent extends ApplicationEvent {

    private Serializable userId ;

    private String loginType;

    private String ip;

    public LoginLogEvent(Object source) {
        super(source);
    }

    public LoginLogEvent(Object source, Serializable userId) {
        super(source);
        this.userId = userId;
    }

    public Serializable getUserId() {
        return userId;
    }

    public void setUserId(Serializable userId) {
        this.userId = userId;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
