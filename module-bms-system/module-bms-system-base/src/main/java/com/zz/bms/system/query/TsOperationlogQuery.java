package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsOperationlogEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 操作日志 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public interface TsOperationlogQuery<PK extends Serializable> extends Query<TsOperationlogEntity,PK> {

        public TsOperationlogQuery id(PK id);
        public TsOperationlogQuery idNot(PK idNot);
        public TsOperationlogQuery idIn(PK idIn);
        public TsOperationlogQuery idNotIn(PK idNotIn);
        public TsOperationlogQuery idIsNull();
        public TsOperationlogQuery idIsNotNull();





        public TsOperationlogQuery operationType(String operationType);
        public TsOperationlogQuery operationTypeNot(String operationTypeNot);
        public TsOperationlogQuery operationTypeIn(String operationTypeIn);
        public TsOperationlogQuery operationTypeNotIn(String operationTypeNotIn);
        public TsOperationlogQuery operationTypeIsNull();
        public TsOperationlogQuery operationTypeIsNotNull();





        public TsOperationlogQuery entityType(String entityType);
        public TsOperationlogQuery entityTypeNot(String entityTypeNot);
        public TsOperationlogQuery entityTypeIn(String entityTypeIn);
        public TsOperationlogQuery entityTypeNotIn(String entityTypeNotIn);
        public TsOperationlogQuery entityTypeIsNull();
        public TsOperationlogQuery entityTypeIsNotNull();





        public TsOperationlogQuery operationlogName(String operationlogName);
        public TsOperationlogQuery operationlogNameNot(String operationlogNameNot);
        public TsOperationlogQuery operationlogNameIn(String operationlogNameIn);
        public TsOperationlogQuery operationlogNameNotIn(String operationlogNameNotIn);
        public TsOperationlogQuery operationlogNameLike(String operationlogNameLike);
        public TsOperationlogQuery operationlogNameNotLike(String operationlogNameNotLike);
        public TsOperationlogQuery operationlogNameIsNull();
        public TsOperationlogQuery operationlogNameIsNotNull();





        public TsOperationlogQuery depId(PK depId);
        public TsOperationlogQuery depIdNot(PK depIdNot);
        public TsOperationlogQuery depIdIn(PK depIdIn);
        public TsOperationlogQuery depIdNotIn(PK depIdNotIn);
        public TsOperationlogQuery depIdIsNull();
        public TsOperationlogQuery depIdIsNotNull();





        public TsOperationlogQuery organId(PK organId);
        public TsOperationlogQuery organIdNot(PK organIdNot);
        public TsOperationlogQuery organIdIn(PK organIdIn);
        public TsOperationlogQuery organIdNotIn(PK organIdNotIn);
        public TsOperationlogQuery organIdIsNull();
        public TsOperationlogQuery organIdIsNotNull();





        public TsOperationlogQuery operationUserId(PK operationUserId);
        public TsOperationlogQuery operationUserIdNot(PK operationUserIdNot);
        public TsOperationlogQuery operationUserIdIn(PK operationUserIdIn);
        public TsOperationlogQuery operationUserIdNotIn(PK operationUserIdNotIn);
        public TsOperationlogQuery operationUserIdIsNull();
        public TsOperationlogQuery operationUserIdIsNotNull();





        public TsOperationlogQuery operationIp(String operationIp);
        public TsOperationlogQuery operationIpNot(String operationIpNot);
        public TsOperationlogQuery operationIpIn(String operationIpIn);
        public TsOperationlogQuery operationIpNotIn(String operationIpNotIn);
        public TsOperationlogQuery operationIpLike(String operationIpLike);
        public TsOperationlogQuery operationIpNotLike(String operationIpNotLike);
        public TsOperationlogQuery operationIpIsNull();
        public TsOperationlogQuery operationIpIsNotNull();





        public TsOperationlogQuery operationUserName(String operationUserName);
        public TsOperationlogQuery operationUserNameNot(String operationUserNameNot);
        public TsOperationlogQuery operationUserNameIn(String operationUserNameIn);
        public TsOperationlogQuery operationUserNameNotIn(String operationUserNameNotIn);
        public TsOperationlogQuery operationUserNameLike(String operationUserNameLike);
        public TsOperationlogQuery operationUserNameNotLike(String operationUserNameNotLike);
        public TsOperationlogQuery operationUserNameIsNull();
        public TsOperationlogQuery operationUserNameIsNotNull();





        public TsOperationlogQuery operationTime(Timestamp operationTime);
        public TsOperationlogQuery operationTimeNot(Timestamp operationTimeNot);
        public TsOperationlogQuery operationTimeGreaterThan(Timestamp operationTimeGreaterThan);
        public TsOperationlogQuery operationTimeGreaterEqual(Timestamp operationTimeGreaterEqual);
        public TsOperationlogQuery operationTimeLessThan(Timestamp operationTimeLessThan);
        public TsOperationlogQuery operationTimeLessEqual(Timestamp operationTimeLessEqual);





        public TsOperationlogQuery tenantId(PK tenantId);
        public TsOperationlogQuery tenantIdNot(PK tenantIdNot);
        public TsOperationlogQuery tenantIdIn(PK tenantIdIn);
        public TsOperationlogQuery tenantIdNotIn(PK tenantIdNotIn);
        public TsOperationlogQuery tenantIdIsNull();
        public TsOperationlogQuery tenantIdIsNotNull();






	
}