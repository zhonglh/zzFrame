package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsOrganEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 机构 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:15
 */
public abstract class TsOrganAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsOrganEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String organName;
            protected String organName_NE;
            protected String organName_LIKE;
            protected String organName_NOTLIKE;

            protected String organCode;
            protected String organCode_NE;
            protected String organCode_LIKE;
            protected String organCode_NOTLIKE;

            protected String organType;
            protected String organType_NE;

            protected String organAddr;
            protected String organAddr_NE;
            protected String organAddr_LIKE;
            protected String organAddr_NOTLIKE;

            protected PK pid;
            protected PK pid_NE;

            protected String organStatus;
            protected String organStatus_NE;

            protected PK leadUserId;
            protected PK leadUserId_NE;

            protected String remark;
            protected String remark_NE;
            protected String remark_LIKE;
            protected String remark_NOTLIKE;

            protected String deleteFlag;
            protected String deleteFlag_NE;
            protected String deleteFlag_LIKE;
            protected String deleteFlag_NOTLIKE;

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