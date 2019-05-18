package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsTenantEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 企业 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:16
 */
public abstract class TsTenantAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsTenantEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String tenantName;
            protected String tenantName_NE;
            protected String tenantName_LIKE;
            protected String tenantName_NOTLIKE;

            protected String tenantCode;
            protected String tenantCode_NE;
            protected String tenantCode_LIKE;
            protected String tenantCode_NOTLIKE;

            protected String tenantAddr;
            protected String tenantAddr_NE;
            protected String tenantAddr_LIKE;
            protected String tenantAddr_NOTLIKE;

            protected String linkTel;
            protected String linkTel_NE;
            protected String linkTel_LIKE;
            protected String linkTel_NOTLIKE;

            protected String leadUserName;
            protected String leadUserName_NE;
            protected String leadUserName_LIKE;
            protected String leadUserName_NOTLIKE;

            protected String logoFile;
            protected String logoFile_NE;
            protected String logoFile_LIKE;
            protected String logoFile_NOTLIKE;

            protected String website;
            protected String website_NE;
            protected String website_LIKE;
            protected String website_NOTLIKE;

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


	
}