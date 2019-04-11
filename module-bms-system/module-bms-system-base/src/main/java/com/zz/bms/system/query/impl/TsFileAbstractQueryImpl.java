package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsFileEntity;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

/**
 * 文件 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:16
 */
public abstract class TsFileAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsFileEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String accessUrlPrefix;
            protected String accessUrlPrefix_NE;
            protected String accessUrlPrefix_LIKE;
            protected String accessUrlPrefix_NOTLIKE;

            protected String accessUrl;
            protected String accessUrl_NE;
            protected String accessUrl_LIKE;
            protected String accessUrl_NOTLIKE;

            protected String fileHost;
            protected String fileHost_NE;
            protected String fileHost_LIKE;
            protected String fileHost_NOTLIKE;

            protected String fileBasePath;
            protected String fileBasePath_NE;
            protected String fileBasePath_LIKE;
            protected String fileBasePath_NOTLIKE;

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

            protected String fileEngine;
            protected String fileEngine_NE;

            protected String md5;
            protected String md5_NE;
            protected String md5_LIKE;
            protected String md5_NOTLIKE;

            protected String contentType;
            protected String contentType_NE;
            protected String contentType_LIKE;
            protected String contentType_NOTLIKE;

        protected Integer useFrequency;
        protected Integer useFrequency_NE;
        protected Integer useFrequency_GT;
        protected Integer useFrequency_GE;
        protected Integer useFrequency_LT;
        protected Integer useFrequency_LE;

        protected Integer versionNo;
        protected Integer versionNo_NE;
        protected Integer versionNo_GT;
        protected Integer versionNo_GE;
        protected Integer versionNo_LT;
        protected Integer versionNo_LE;


	
}