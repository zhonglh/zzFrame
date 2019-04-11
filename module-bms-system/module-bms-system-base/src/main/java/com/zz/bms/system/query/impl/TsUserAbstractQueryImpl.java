package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsUserEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 用户 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:19
 */
public abstract class TsUserAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsUserEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String userName;
            protected String userName_NE;
            protected String userName_LIKE;
            protected String userName_NOTLIKE;

            protected String loginName;
            protected String loginName_NE;
            protected String loginName_LIKE;
            protected String loginName_NOTLIKE;

            protected String loginPassword;
            protected String loginPassword_NE;
            protected String loginPassword_LIKE;
            protected String loginPassword_NOTLIKE;

            protected String salt;
            protected String salt_NE;
            protected String salt_LIKE;
            protected String salt_NOTLIKE;

            protected String userStatus;
            protected String userStatus_NE;

            protected PK leadUserId;
            protected PK leadUserId_NE;

            protected String phone;
            protected String phone_NE;
            protected String phone_LIKE;
            protected String phone_NOTLIKE;

            protected String email;
            protected String email_NE;
            protected String email_LIKE;
            protected String email_NOTLIKE;

            protected String avatarImage;
            protected String avatarImage_NE;
            protected String avatarImage_LIKE;
            protected String avatarImage_NOTLIKE;

            protected String openId;
            protected String openId_NE;
            protected String openId_LIKE;
            protected String openId_NOTLIKE;

            protected String unionId;
            protected String unionId_NE;
            protected String unionId_LIKE;
            protected String unionId_NOTLIKE;

            protected String systemAdmin;
            protected String systemAdmin_NE;

            protected PK depId;
            protected PK depId_NE;

            protected String organId;
            protected String organId_NE;
            protected String organId_LIKE;
            protected String organId_NOTLIKE;

        protected Integer pageLimit;
        protected Integer pageLimit_NE;
        protected Integer pageLimit_GT;
        protected Integer pageLimit_GE;
        protected Integer pageLimit_LT;
        protected Integer pageLimit_LE;

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