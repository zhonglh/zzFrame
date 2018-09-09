package com.zz.bms.system.websocket;


import com.alibaba.fastjson.JSONObject;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.core.enums.EnumMessageType;
import org.apache.commons.lang3.StringUtils;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.List;

/**
 * @author Administrator
 */
public abstract class AbstractNotifyWebSocket {

    //websocker session
    private Session session;

    //用户id , user.id
    private String userKey ;

    //shiro 的session id
    private String userSessoinId;

    //登录用户对象
    private ILoginUserEntity<String> loginUser ;

    protected abstract ILoginUserEntity getCurrLoginUser(String userKey, String userSessoinId);
    protected abstract void logout(String userKey);


    @OnOpen
    public void OnOpen(Session session, EndpointConfig config, @PathParam(value = "userKey") String userKey , @PathParam(value = "userSessoinId") String userSessoinId) {


        //设置websock连接的session
        setSession(session);

        if(StringUtils.isEmpty(userKey) ||StringUtils.isEmpty(userSessoinId) ){
            // 未登录需要进行登录
            requireLogin();
            return;
        }

        this.userKey = userKey;
        this.userSessoinId = userSessoinId;
        loginUser = getCurrLoginUser(userKey,userSessoinId);


        if (loginUser== null) {
            // 未登录需要进行登录
            requireLogin();
            return;
        }

        //加入连接集合
        WebSocketHelp.addConnect(this);
    }



    /**
     * websock连接断开后触发
     */
    @OnClose
    public void OnClose() {

        //从连接集合中移除
        WebSocketHelp.removeConnect(this);
        logout(userKey);
    }

    /**
     * 接受到客户端发送的字符串时触发
     *
     * @param message
     */
    @OnMessage(maxMessageSize = 1000)
    public void OnMessage(String message) {
        //消息内容反序列化
        WsMessage msg = JSONObject.parseObject(message, WsMessage.class);
        msg.setFromUserId(this.userKey);

        //对html代码进行转义
        msg.setTitle(txt2htm(msg.getTitle()));
        msg.setContent(txt2htm(msg.getContent()));

        if (msg.getToUserId() == null || msg.getToUserId().length == 0 ) {
            broadcastToAll(msg);
        }else {
            broadcastToSpecia(msg);
        }
    }

    @OnError
    public void onError(Throwable t) throws Throwable {
        ;
    }




    /**
     * 发送给所有的用户
     * @param msg
     */
    public static void broadcastToAll(WsMessage msg) {
        for (AbstractNotifyWebSocket client : WebSocketHelp.getSessionConnectionMap().values()) {
            client.call(msg);
        }
    }

    /**
     * 发送给指定的用户
     *
     * @param msg
     */
    public static void broadcastToSpecia(WsMessage msg) {
        for (String userId : msg.getToUserId()) {

            List<AbstractNotifyWebSocket> list =  WebSocketHelp.getUserConnectionMap().get(userId);
            if(list != null && !list.isEmpty()){
                for(AbstractNotifyWebSocket client : list){
                    if(client != null && client.getSession().isOpen()) {
                        client.call(msg);
                    }
                }
            }

        }



    }


    public void call(WsMessage msg) {
        try {
            synchronized (this) {
                this.getSession().getBasicRemote().sendText(msg.toString());
            }
        } catch (IOException e) {
            try {
                //断开连接
                this.getSession().close();
            } catch (IOException e1) {
            }
            OnClose();
        }
    }

    private void requireLogin() {
        WsMessage msg = new WsMessage();
        msg.setMessageType(EnumMessageType.LOGIN.getCode());
        call(msg);
    }


    /**
     * html代码转义
     *
     * @param txt
     * @return
     */
    public static String txt2htm(String txt) {
        if (StringUtils.isBlank(txt)) {
            return txt;
        }
        return txt.replaceAll("&", "&").replaceAll("<", "<").replaceAll(">", ">").replaceAll("\n", "<br/>").replaceAll("\'", "'");
    }





    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }


    public String getUserKey() {
        return userKey;
    }

    public String getUserSessoinId() {
        return userSessoinId;
    }
}
