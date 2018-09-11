package com.zz.bms.system.websocket;


import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.shiro.redisSession.CachingShiroSessionDao;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.util.base.spring.SpringUtil;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;

import javax.websocket.server.ServerEndpoint;

/**
 * websocket 服务地址
 * @author Administrator
 */

@ServerEndpoint(value = "/websocket/notify/{userKey}/{userSessoinId}")
public class ZzNotifyWs extends AbstractNotifyWebSocket{


    static CachingShiroSessionDao sessionDao = null;
    static {
        sessionDao = SpringUtil.getBean(CachingShiroSessionDao.class);
    }

    @Override
    protected ILoginUserEntity<String> getCurrLoginUser(String userKey , String userSessoinId) {
        if(sessionDao == null){
            synchronized (ZzNotifyWs.class){
                if(sessionDao == null) {
                    sessionDao = SpringUtil.getBean(CachingShiroSessionDao.class);
                }
            }
        }
        Session shiroSession = sessionDao.readSession(userSessoinId);
        if(shiroSession == null) {
            return null;
        }else {
            SimplePrincipalCollection  sc = (SimplePrincipalCollection)shiroSession.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);

            Object userObj = sc.getPrimaryPrincipal() ;
            if(userObj != null && userObj instanceof TsUserBO){
                return (TsUserBO)userObj;
            }
        }
        return null;
    }

    @Override
    protected void logout(String userKey  , String userSessoinId) {
        /*Session shiroSession = sessionDao.readSession(userSessoinId);
        if(shiroSession != null) {
            sessionDao.delete(shiroSession);
        }*/
    }
}
