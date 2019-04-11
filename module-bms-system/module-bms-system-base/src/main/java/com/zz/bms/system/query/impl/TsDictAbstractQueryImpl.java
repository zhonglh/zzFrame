package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsDictEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 字典信息 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:15
 */
public abstract class TsDictAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsDictEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK dictTypeId;
            protected PK dictTypeId_NE;

            protected String dictVal;
            protected String dictVal_NE;

            protected String dictName;
            protected String dictName_NE;
            protected String dictName_LIKE;
            protected String dictName_NOTLIKE;

            protected String dictI18n;
            protected String dictI18n_NE;
            protected String dictI18n_LIKE;
            protected String dictI18n_NOTLIKE;

            protected String dictReg;
            protected String dictReg_NE;
            protected String dictReg_LIKE;
            protected String dictReg_NOTLIKE;

        protected Integer orderby;
        protected Integer orderby_NE;
        protected Integer orderby_GT;
        protected Integer orderby_GE;
        protected Integer orderby_LT;
        protected Integer orderby_LE;

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

            protected String deleteFlag;
            protected String deleteFlag_NE;
            protected String deleteFlag_LIKE;
            protected String deleteFlag_NOTLIKE;

            protected String tenantId;
            protected String tenantId_NE;
            protected String tenantId_LIKE;
            protected String tenantId_NOTLIKE;


	
}