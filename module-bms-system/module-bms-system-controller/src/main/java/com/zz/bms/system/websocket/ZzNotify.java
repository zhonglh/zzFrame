package com.zz.bms.system.websocket;


import com.zz.bms.core.db.entity.ILoginUserEntity;

import javax.websocket.server.ServerEndpoint;

/**
 * websocket 服务地址
 * @author Administrator
 */

@ServerEndpoint(value = "/websocket/notify/{userKey}/{userSessoinId}")
public class ZzNotify extends AbstractNotifyWebSocket{


    @Override
    protected ILoginUserEntity<String> getCurrLoginUser(String userKey , String userSessoinId) {

        return null;
    }

    @Override
    protected void logout(String userKey) {
        //ShiroUtils.logout();
    }
}
