package com.zz.bms.system.websocket;


import com.zz.bms.system.bo.TsNotificationBO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Administrator
 */
public class WebSocketHelp {

    /**
     * 存储sessionid 和 对应的 websocket
     * String :  shiro session id
     * AbstractNotifyWebSocket : websocket
     */
    private static final Map<String ,AbstractNotifyWebSocket> sessionConnectionMap= new ConcurrentHashMap<String ,AbstractNotifyWebSocket>();

    /**
     * 存储userid 和 对应的 websocket , 一个用户可能会打开多个浏览器
     * String :  userid
     * AbstractNotifyWebSocket : websocket
     */
    private static final Map<String ,List<AbstractNotifyWebSocket>> userConnectionMap = new ConcurrentHashMap<String ,List<AbstractNotifyWebSocket>>();

    /**
     * 给客户端发送消息
     * @param notification
     */
    public static void sendMessage(TsNotificationBO notification , int noReadCount){

        if(userConnectionMap.containsKey(notification.getToUserId())) {

            WsMessage message = new WsMessage();
            message.setId(notification.getId());
            message.setFromUserId(notification.getCreateUserId());
            message.setTitle(notification.getTitle());
            message.setContent(notification.getContent());
            message.setNotifyModule(notification.getNotifyModule());
            message.setToUserId(new String[]{notification.getToUserId()});
            message.setNotifyTime(notification.getCreateTime());
            message.setNoReadCount(noReadCount);

            AbstractNotifyWebSocket.broadcastToSpecia(message);

        }

    }

    @Deprecated
    public static void sendMessage(WsMessage message){
        if (message.getToUserId() == null || message.getToUserId().length == 0 ) {
            AbstractNotifyWebSocket.broadcastToAll(message);
        }else {
            AbstractNotifyWebSocket.broadcastToSpecia(message);
        }
    }


    public static void addConnect(AbstractNotifyWebSocket ws){
        sessionConnectionMap.put(ws.getUserSessoinId() , ws);
        if(userConnectionMap.containsKey(ws.getUserKey())){
            userConnectionMap.get(ws.getUserKey()).add(ws);
        }else {
            List<AbstractNotifyWebSocket> list = new ArrayList<AbstractNotifyWebSocket>();
            list.add(ws);
            userConnectionMap.put(ws.getUserKey() ,list);
        }
    }



    public static void removeConnect(AbstractNotifyWebSocket ws){
        sessionConnectionMap.remove(ws.getUserSessoinId());
        if(userConnectionMap.containsKey(ws.getUserKey())){
            List<AbstractNotifyWebSocket> list = userConnectionMap.get(ws.getUserKey());
            if(list != null && list.size()>1){
                list.remove(ws);
            }
            if(list == null || list.isEmpty()){
                userConnectionMap.remove(ws.getUserKey());
            }
        }
    }

    public static Map<String, AbstractNotifyWebSocket> getSessionConnectionMap() {
        return sessionConnectionMap;
    }

    public static Map<String, List<AbstractNotifyWebSocket>> getUserConnectionMap() {
        return userConnectionMap;
    }
}
