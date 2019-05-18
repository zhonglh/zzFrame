package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsNotificationReceiveEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 通知接收人 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:17
 */
public abstract class TsNotificationReceiveAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsNotificationReceiveEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String notifyId;
            protected String notifyId_NE;
            protected String notifyId_LIKE;
            protected String notifyId_NOTLIKE;

            protected PK receiveUserId;
            protected PK receiveUserId_NE;

            protected String isRead;
            protected String isRead_NE;

        protected Timestamp readTime;
        protected Timestamp readTime_NE;
        protected Timestamp readTime_GT;
        protected Timestamp readTime_GE;
        protected Timestamp readTime_LT;
        protected Timestamp readTime_LE;


	
}