package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsDepEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 部门 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public abstract class TsDepAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsDepEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String depName;
            protected String depName_NE;
            protected String depName_LIKE;
            protected String depName_NOTLIKE;

            protected String depCode;
            protected String depCode_NE;
            protected String depCode_LIKE;
            protected String depCode_NOTLIKE;

            protected String depAddr;
            protected String depAddr_NE;
            protected String depAddr_LIKE;
            protected String depAddr_NOTLIKE;

            protected PK pid;
            protected PK pid_NE;

            protected String depStatus;
            protected String depStatus_NE;

            protected PK leadUserId;
            protected PK leadUserId_NE;

            protected PK organId;
            protected PK organId_NE;

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

            protected PK tenantId;
            protected PK tenantId_NE;


	
}