package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsFileUseEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 文件使用 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public abstract class TsFileUseAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsFileUseEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String fileId;
            protected String fileId_NE;
            protected String fileId_LIKE;
            protected String fileId_NOTLIKE;

            protected String showName;
            protected String showName_NE;
            protected String showName_LIKE;
            protected String showName_NOTLIKE;

            protected String businessType;
            protected String businessType_NE;

            protected String businessTmpId;
            protected String businessTmpId_NE;
            protected String businessTmpId_LIKE;
            protected String businessTmpId_NOTLIKE;

            protected String businessId;
            protected String businessId_NE;
            protected String businessId_LIKE;
            protected String businessId_NOTLIKE;

        protected Integer fileOrder;
        protected Integer fileOrder_NE;
        protected Integer fileOrder_GT;
        protected Integer fileOrder_GE;
        protected Integer fileOrder_LT;
        protected Integer fileOrder_LE;

            protected String remark;
            protected String remark_NE;
            protected String remark_LIKE;
            protected String remark_NOTLIKE;

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