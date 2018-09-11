package com.zz.bms.system.websocket;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.zz.bms.core.enums.EnumMessageType;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Administrator
 */
public class WsMessage implements Serializable {

    private String id ;

    private String messageType = EnumMessageType.TEXT.getCode();

    private String fromUserId ;

    private String fromUserName ;

    @JSONField(serialize = false)
    private String[] toUserId;

    private String notifyModule;

    private String title;

    private String content ;

    private Timestamp notifyTime;

    //未读通知数
    private int noReadCount ;


    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String[] getToUserId() {
        return toUserId;
    }

    public void setToUserId(String[] toUserId) {
        this.toUserId = toUserId;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getNotifyModule() {
        return notifyModule;
    }

    public void setNotifyModule(String notifyModule) {
        this.notifyModule = notifyModule;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Timestamp notifyTime) {
        this.notifyTime = notifyTime;
    }


    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this) ;
    }

    public int getNoReadCount() {
        return noReadCount;
    }

    public void setNoReadCount(int noReadCount) {
        this.noReadCount = noReadCount;
    }
}
