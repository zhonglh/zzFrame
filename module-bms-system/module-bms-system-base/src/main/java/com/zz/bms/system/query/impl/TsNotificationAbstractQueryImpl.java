package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsNotificationEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 系统通知 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:13
 */
public abstract class TsNotificationAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsNotificationEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String notifyModule;
            protected String notifyModule_NE;
            protected String notifyModule_LIKE;
            protected String notifyModule_NOTLIKE;

            protected String title;
            protected String title_NE;
            protected String title_LIKE;
            protected String title_NOTLIKE;



        protected Timestamp notifyTime;
        protected Timestamp notifyTime_NE;
        protected Timestamp notifyTime_GT;
        protected Timestamp notifyTime_GE;
        protected Timestamp notifyTime_LT;
        protected Timestamp notifyTime_LE;

            protected String notifyFiles;
            protected String notifyFiles_NE;
            protected String notifyFiles_LIKE;
            protected String notifyFiles_NOTLIKE;

            protected String createUserId;
            protected String createUserId_NE;
            protected String createUserId_LIKE;
            protected String createUserId_NOTLIKE;

            protected String createUserName;
            protected String createUserName_NE;
            protected String createUserName_LIKE;
            protected String createUserName_NOTLIKE;

        protected Timestamp createTime;
        protected Timestamp createTime_NE;
        protected Timestamp createTime_GT;
        protected Timestamp createTime_GE;
        protected Timestamp createTime_LT;
        protected Timestamp createTime_LE;

            protected String updateUserId;
            protected String updateUserId_NE;
            protected String updateUserId_LIKE;
            protected String updateUserId_NOTLIKE;

            protected String updateUserName;
            protected String updateUserName_NE;
            protected String updateUserName_LIKE;
            protected String updateUserName_NOTLIKE;

        protected Timestamp updateTime;
        protected Timestamp updateTime_NE;
        protected Timestamp updateTime_GT;
        protected Timestamp updateTime_GE;
        protected Timestamp updateTime_LT;
        protected Timestamp updateTime_LE;

        protected Integer versionNo;
        protected Integer versionNo_NE;
        protected Integer versionNo_GT;
        protected Integer versionNo_GE;
        protected Integer versionNo_LT;
        protected Integer versionNo_LE;

            protected String tenantId;
            protected String tenantId_NE;
            protected String tenantId_LIKE;
            protected String tenantId_NOTLIKE;


	
}