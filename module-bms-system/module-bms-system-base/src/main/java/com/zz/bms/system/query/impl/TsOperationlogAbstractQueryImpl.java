package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsOperationlogEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 操作日志 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public abstract class TsOperationlogAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsOperationlogEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String operationType;
            protected String operationType_NE;

            protected String entityType;
            protected String entityType_NE;

            protected String operationlogName;
            protected String operationlogName_NE;
            protected String operationlogName_LIKE;
            protected String operationlogName_NOTLIKE;

            protected PK depId;
            protected PK depId_NE;

            protected PK organId;
            protected PK organId_NE;

            protected PK operationUserId;
            protected PK operationUserId_NE;

            protected String operationIp;
            protected String operationIp_NE;
            protected String operationIp_LIKE;
            protected String operationIp_NOTLIKE;

            protected String operationUserName;
            protected String operationUserName_NE;
            protected String operationUserName_LIKE;
            protected String operationUserName_NOTLIKE;

        protected Timestamp operationTime;
        protected Timestamp operationTime_NE;
        protected Timestamp operationTime_GT;
        protected Timestamp operationTime_GE;
        protected Timestamp operationTime_LT;
        protected Timestamp operationTime_LE;

            protected PK tenantId;
            protected PK tenantId_NE;


	
}