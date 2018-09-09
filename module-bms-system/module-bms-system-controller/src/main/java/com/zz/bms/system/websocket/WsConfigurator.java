package com.zz.bms.system.websocket;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

/**
 * @author Administrator
 */
public class WsConfigurator extends ServerEndpointConfig.Configurator {
    @Override
    public void modifyHandshake(ServerEndpointConfig config, HandshakeRequest request, HandshakeResponse response) {
        //通过配置来获取httpsession
        HttpSession httpSession = (HttpSession) request.getHttpSession();
        config.getUserProperties().put(HttpSession.class.getName(), httpSession);
    }
}