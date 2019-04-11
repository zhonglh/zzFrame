package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsLoginLogEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 登陆日志 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:18
 */
public interface TsLoginLogQuery<PK extends Serializable> extends Query<TsLoginLogEntity,PK> {

        public TsLoginLogQuery id(PK id);
        public TsLoginLogQuery idNot(PK idNot);
        public TsLoginLogQuery idIn(PK idIn);
        public TsLoginLogQuery idNotIn(PK idNotIn);
        public TsLoginLogQuery idIsNull();
        public TsLoginLogQuery idIsNotNull();





        public TsLoginLogQuery operationType(String operationType);
        public TsLoginLogQuery operationTypeNot(String operationTypeNot);
        public TsLoginLogQuery operationTypeIn(String operationTypeIn);
        public TsLoginLogQuery operationTypeNotIn(String operationTypeNotIn);
        public TsLoginLogQuery operationTypeIsNull();
        public TsLoginLogQuery operationTypeIsNotNull();







        public TsLoginLogQuery depId(PK depId);
        public TsLoginLogQuery depIdNot(PK depIdNot);
        public TsLoginLogQuery depIdIn(PK depIdIn);
        public TsLoginLogQuery depIdNotIn(PK depIdNotIn);
        public TsLoginLogQuery depIdIsNull();
        public TsLoginLogQuery depIdIsNotNull();





        public TsLoginLogQuery organId(String organId);
        public TsLoginLogQuery organIdNot(String organIdNot);
        public TsLoginLogQuery organIdIn(String organIdIn);
        public TsLoginLogQuery organIdNotIn(String organIdNotIn);
        public TsLoginLogQuery organIdLike(String organIdLike);
        public TsLoginLogQuery organIdNotLike(String organIdNotLike);
        public TsLoginLogQuery organIdIsNull();
        public TsLoginLogQuery organIdIsNotNull();





        public TsLoginLogQuery operationUserId(String operationUserId);
        public TsLoginLogQuery operationUserIdNot(String operationUserIdNot);
        public TsLoginLogQuery operationUserIdIn(String operationUserIdIn);
        public TsLoginLogQuery operationUserIdNotIn(String operationUserIdNotIn);
        public TsLoginLogQuery operationUserIdLike(String operationUserIdLike);
        public TsLoginLogQuery operationUserIdNotLike(String operationUserIdNotLike);
        public TsLoginLogQuery operationUserIdIsNull();
        public TsLoginLogQuery operationUserIdIsNotNull();





        public TsLoginLogQuery operationIp(String operationIp);
        public TsLoginLogQuery operationIpNot(String operationIpNot);
        public TsLoginLogQuery operationIpIn(String operationIpIn);
        public TsLoginLogQuery operationIpNotIn(String operationIpNotIn);
        public TsLoginLogQuery operationIpLike(String operationIpLike);
        public TsLoginLogQuery operationIpNotLike(String operationIpNotLike);
        public TsLoginLogQuery operationIpIsNull();
        public TsLoginLogQuery operationIpIsNotNull();





        public TsLoginLogQuery operationUserName(String operationUserName);
        public TsLoginLogQuery operationUserNameNot(String operationUserNameNot);
        public TsLoginLogQuery operationUserNameIn(String operationUserNameIn);
        public TsLoginLogQuery operationUserNameNotIn(String operationUserNameNotIn);
        public TsLoginLogQuery operationUserNameLike(String operationUserNameLike);
        public TsLoginLogQuery operationUserNameNotLike(String operationUserNameNotLike);
        public TsLoginLogQuery operationUserNameIsNull();
        public TsLoginLogQuery operationUserNameIsNotNull();





        public TsLoginLogQuery operationTime(Timestamp operationTime);
        public TsLoginLogQuery operationTimeNot(Timestamp operationTimeNot);
        public TsLoginLogQuery operationTimeGreaterThan(Timestamp operationTimeGreaterThan);
        public TsLoginLogQuery operationTimeGreaterEqual(Timestamp operationTimeGreaterEqual);
        public TsLoginLogQuery operationTimeLessThan(Timestamp operationTimeLessThan);
        public TsLoginLogQuery operationTimeLessEqual(Timestamp operationTimeLessEqual);





        public TsLoginLogQuery tenantId(String tenantId);
        public TsLoginLogQuery tenantIdNot(String tenantIdNot);
        public TsLoginLogQuery tenantIdIn(String tenantIdIn);
        public TsLoginLogQuery tenantIdNotIn(String tenantIdNotIn);
        public TsLoginLogQuery tenantIdLike(String tenantIdLike);
        public TsLoginLogQuery tenantIdNotLike(String tenantIdNotLike);
        public TsLoginLogQuery tenantIdIsNull();
        public TsLoginLogQuery tenantIdIsNotNull();






	
}