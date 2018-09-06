package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsMsgTempletEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 消息模板 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public abstract class TsMsgTempletAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsMsgTempletEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String msgTempletName;
            protected String msgTempletName_NE;
            protected String msgTempletName_LIKE;
            protected String msgTempletName_NOTLIKE;

            protected String msgTempletType;
            protected String msgTempletType_NE;

            protected String msgTitle;
            protected String msgTitle_NE;
            protected String msgTitle_LIKE;
            protected String msgTitle_NOTLIKE;

            protected String msgContent;
            protected String msgContent_NE;
            protected String msgContent_LIKE;
            protected String msgContent_NOTLIKE;

            protected String msgLanguage;
            protected String msgLanguage_NE;

            protected String templetEffective;
            protected String templetEffective_NE;

            protected PK depId;
            protected PK depId_NE;

            protected PK organId;
            protected PK organId_NE;

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

            protected PK tenantId;
            protected PK tenantId_NE;


	
}