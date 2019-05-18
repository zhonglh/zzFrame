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
 * @date 2019-4-11 14:06:14
 */
public abstract class TsFileUseAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsFileUseEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK fileId;
            protected PK fileId_NE;

            protected String showName;
            protected String showName_NE;
            protected String showName_LIKE;
            protected String showName_NOTLIKE;

            protected String businessType;
            protected String businessType_NE;
            protected String businessType_LIKE;
            protected String businessType_NOTLIKE;

            protected String businessId;
            protected String businessId_NE;
            protected String businessId_LIKE;
            protected String businessId_NOTLIKE;

            protected String businessFileType;
            protected String businessFileType_NE;
            protected String businessFileType_LIKE;
            protected String businessFileType_NOTLIKE;

            protected String businessTempId;
            protected String businessTempId_NE;
            protected String businessTempId_LIKE;
            protected String businessTempId_NOTLIKE;

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

            protected String tenantId;
            protected String tenantId_NE;
            protected String tenantId_LIKE;
            protected String tenantId_NOTLIKE;


	
}