package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.VsFilesUseEntity;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 文件使用 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public abstract class VsFilesUseAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<VsFilesUseEntity,PK> {

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

            protected String tenantId;
            protected String tenantId_NE;
            protected String tenantId_LIKE;
            protected String tenantId_NOTLIKE;

            protected String accessUrl;
            protected String accessUrl_NE;
            protected String accessUrl_LIKE;
            protected String accessUrl_NOTLIKE;

            protected String fileHost;
            protected String fileHost_NE;
            protected String fileHost_LIKE;
            protected String fileHost_NOTLIKE;

            protected String filePath;
            protected String filePath_NE;
            protected String filePath_LIKE;
            protected String filePath_NOTLIKE;

            protected String fileName;
            protected String fileName_NE;
            protected String fileName_LIKE;
            protected String fileName_NOTLIKE;

        protected Long fileSize;
        protected Long fileSize_NE;
        protected Long fileSize_GT;
        protected Long fileSize_GE;
        protected Long fileSize_LT;
        protected Long fileSize_LE;

            protected String fileSuffix;
            protected String fileSuffix_NE;
            protected String fileSuffix_LIKE;
            protected String fileSuffix_NOTLIKE;

            protected String contentType;
            protected String contentType_NE;
            protected String contentType_LIKE;
            protected String contentType_NOTLIKE;

            protected String fileEngine;
            protected String fileEngine_NE;

            protected String md5;
            protected String md5_NE;
            protected String md5_LIKE;
            protected String md5_NOTLIKE;

        protected Integer useFrequency;
        protected Integer useFrequency_NE;
        protected Integer useFrequency_GT;
        protected Integer useFrequency_GE;
        protected Integer useFrequency_LT;
        protected Integer useFrequency_LE;


	
}