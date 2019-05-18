package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsLoginLogEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 登陆日志 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:18
 */
public abstract class TsLoginLogAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsLoginLogEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String operationType;
            protected String operationType_NE;

            protected String operationlogName;
            protected String operationlogName_NE;
            protected String operationlogName_LIKE;
            protected String operationlogName_NOTLIKE;

            protected PK depId;
            protected PK depId_NE;

            protected String organId;
            protected String organId_NE;
            protected String organId_LIKE;
            protected String organId_NOTLIKE;

            protected String operationUserId;
            protected String operationUserId_NE;
            protected String operationUserId_LIKE;
            protected String operationUserId_NOTLIKE;

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

            protected String tenantId;
            protected String tenantId_NE;
            protected String tenantId_LIKE;
            protected String tenantId_NOTLIKE;


	
}