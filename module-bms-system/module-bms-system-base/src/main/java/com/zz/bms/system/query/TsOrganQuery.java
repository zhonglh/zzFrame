package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsOrganEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 机构 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public interface TsOrganQuery<PK extends Serializable> extends Query<TsOrganEntity,PK> {

        public TsOrganQuery id(PK id);
        public TsOrganQuery idNot(PK idNot);
        public TsOrganQuery idIn(PK idIn);
        public TsOrganQuery idNotIn(PK idNotIn);
        public TsOrganQuery idIsNull();
        public TsOrganQuery idIsNotNull();





        public TsOrganQuery organName(String organName);
        public TsOrganQuery organNameNot(String organNameNot);
        public TsOrganQuery organNameIn(String organNameIn);
        public TsOrganQuery organNameNotIn(String organNameNotIn);
        public TsOrganQuery organNameLike(String organNameLike);
        public TsOrganQuery organNameNotLike(String organNameNotLike);
        public TsOrganQuery organNameIsNull();
        public TsOrganQuery organNameIsNotNull();





        public TsOrganQuery organCode(String organCode);
        public TsOrganQuery organCodeNot(String organCodeNot);
        public TsOrganQuery organCodeIn(String organCodeIn);
        public TsOrganQuery organCodeNotIn(String organCodeNotIn);
        public TsOrganQuery organCodeLike(String organCodeLike);
        public TsOrganQuery organCodeNotLike(String organCodeNotLike);
        public TsOrganQuery organCodeIsNull();
        public TsOrganQuery organCodeIsNotNull();





        public TsOrganQuery organType(String organType);
        public TsOrganQuery organTypeNot(String organTypeNot);
        public TsOrganQuery organTypeIn(String organTypeIn);
        public TsOrganQuery organTypeNotIn(String organTypeNotIn);
        public TsOrganQuery organTypeIsNull();
        public TsOrganQuery organTypeIsNotNull();





        public TsOrganQuery organAddr(String organAddr);
        public TsOrganQuery organAddrNot(String organAddrNot);
        public TsOrganQuery organAddrIn(String organAddrIn);
        public TsOrganQuery organAddrNotIn(String organAddrNotIn);
        public TsOrganQuery organAddrLike(String organAddrLike);
        public TsOrganQuery organAddrNotLike(String organAddrNotLike);
        public TsOrganQuery organAddrIsNull();
        public TsOrganQuery organAddrIsNotNull();





        public TsOrganQuery pid(PK pid);
        public TsOrganQuery pidNot(PK pidNot);
        public TsOrganQuery pidIn(PK pidIn);
        public TsOrganQuery pidNotIn(PK pidNotIn);
        public TsOrganQuery pidIsNull();
        public TsOrganQuery pidIsNotNull();





        public TsOrganQuery organStatus(String organStatus);
        public TsOrganQuery organStatusNot(String organStatusNot);
        public TsOrganQuery organStatusIn(String organStatusIn);
        public TsOrganQuery organStatusNotIn(String organStatusNotIn);
        public TsOrganQuery organStatusIsNull();
        public TsOrganQuery organStatusIsNotNull();





        public TsOrganQuery leadUserId(PK leadUserId);
        public TsOrganQuery leadUserIdNot(PK leadUserIdNot);
        public TsOrganQuery leadUserIdIn(PK leadUserIdIn);
        public TsOrganQuery leadUserIdNotIn(PK leadUserIdNotIn);
        public TsOrganQuery leadUserIdIsNull();
        public TsOrganQuery leadUserIdIsNotNull();





        public TsOrganQuery remark(String remark);
        public TsOrganQuery remarkNot(String remarkNot);
        public TsOrganQuery remarkIn(String remarkIn);
        public TsOrganQuery remarkNotIn(String remarkNotIn);
        public TsOrganQuery remarkLike(String remarkLike);
        public TsOrganQuery remarkNotLike(String remarkNotLike);
        public TsOrganQuery remarkIsNull();
        public TsOrganQuery remarkIsNotNull();





        public TsOrganQuery deleteFlag(String deleteFlag);
        public TsOrganQuery deleteFlagNot(String deleteFlagNot);
        public TsOrganQuery deleteFlagIn(String deleteFlagIn);
        public TsOrganQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TsOrganQuery deleteFlagLike(String deleteFlagLike);
        public TsOrganQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TsOrganQuery deleteFlagIsNull();
        public TsOrganQuery deleteFlagIsNotNull();





        public TsOrganQuery createUserId(String createUserId);
        public TsOrganQuery createUserIdNot(String createUserIdNot);
        public TsOrganQuery createUserIdIn(String createUserIdIn);
        public TsOrganQuery createUserIdNotIn(String createUserIdNotIn);
        public TsOrganQuery createUserIdLike(String createUserIdLike);
        public TsOrganQuery createUserIdNotLike(String createUserIdNotLike);
        public TsOrganQuery createUserIdIsNull();
        public TsOrganQuery createUserIdIsNotNull();





        public TsOrganQuery createUserName(String createUserName);
        public TsOrganQuery createUserNameNot(String createUserNameNot);
        public TsOrganQuery createUserNameIn(String createUserNameIn);
        public TsOrganQuery createUserNameNotIn(String createUserNameNotIn);
        public TsOrganQuery createUserNameLike(String createUserNameLike);
        public TsOrganQuery createUserNameNotLike(String createUserNameNotLike);
        public TsOrganQuery createUserNameIsNull();
        public TsOrganQuery createUserNameIsNotNull();





        public TsOrganQuery createTime(Timestamp createTime);
        public TsOrganQuery createTimeNot(Timestamp createTimeNot);
        public TsOrganQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsOrganQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsOrganQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsOrganQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsOrganQuery updateUserId(String updateUserId);
        public TsOrganQuery updateUserIdNot(String updateUserIdNot);
        public TsOrganQuery updateUserIdIn(String updateUserIdIn);
        public TsOrganQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsOrganQuery updateUserIdLike(String updateUserIdLike);
        public TsOrganQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsOrganQuery updateUserIdIsNull();
        public TsOrganQuery updateUserIdIsNotNull();





        public TsOrganQuery updateUserName(String updateUserName);
        public TsOrganQuery updateUserNameNot(String updateUserNameNot);
        public TsOrganQuery updateUserNameIn(String updateUserNameIn);
        public TsOrganQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsOrganQuery updateUserNameLike(String updateUserNameLike);
        public TsOrganQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsOrganQuery updateUserNameIsNull();
        public TsOrganQuery updateUserNameIsNotNull();





        public TsOrganQuery updateTime(Timestamp updateTime);
        public TsOrganQuery updateTimeNot(Timestamp updateTimeNot);
        public TsOrganQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsOrganQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsOrganQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsOrganQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsOrganQuery versionNo(Integer versionNo);
        public TsOrganQuery versionNoNot(Integer versionNoNot);
        public TsOrganQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsOrganQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsOrganQuery versionNoLessThan(Integer versionNoLessThan);
        public TsOrganQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TsOrganQuery tenantId(PK tenantId);
        public TsOrganQuery tenantIdNot(PK tenantIdNot);
        public TsOrganQuery tenantIdIn(PK tenantIdIn);
        public TsOrganQuery tenantIdNotIn(PK tenantIdNotIn);
        public TsOrganQuery tenantIdIsNull();
        public TsOrganQuery tenantIdIsNotNull();






	
}