package com.zz.bms.example.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.example.domain.TbInvestorEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 投资人 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-5-8 10:49:25
 */
public abstract class TbInvestorAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TbInvestorEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String investorName;
            protected String investorName_NE;
            protected String investorName_LIKE;
            protected String investorName_NOTLIKE;

            protected String investorCode;
            protected String investorCode_NE;
            protected String investorCode_LIKE;
            protected String investorCode_NOTLIKE;

            protected String investorType;
            protected String investorType_NE;

            protected PK manageUserId;
            protected PK manageUserId_NE;

            protected String cardType;
            protected String cardType_NE;

            protected String cardNo;
            protected String cardNo_NE;
            protected String cardNo_LIKE;
            protected String cardNo_NOTLIKE;

            protected String investorFiles;
            protected String investorFiles_NE;
            protected String investorFiles_LIKE;
            protected String investorFiles_NOTLIKE;

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