package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsDepEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 部门 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:18
 */
public interface TsDepQuery<PK extends Serializable> extends Query<TsDepEntity,PK> {

        public TsDepQuery id(PK id);
        public TsDepQuery idNot(PK idNot);
        public TsDepQuery idIn(PK idIn);
        public TsDepQuery idNotIn(PK idNotIn);
        public TsDepQuery idIsNull();
        public TsDepQuery idIsNotNull();





        public TsDepQuery depName(String depName);
        public TsDepQuery depNameNot(String depNameNot);
        public TsDepQuery depNameIn(String depNameIn);
        public TsDepQuery depNameNotIn(String depNameNotIn);
        public TsDepQuery depNameLike(String depNameLike);
        public TsDepQuery depNameNotLike(String depNameNotLike);
        public TsDepQuery depNameIsNull();
        public TsDepQuery depNameIsNotNull();





        public TsDepQuery depCode(String depCode);
        public TsDepQuery depCodeNot(String depCodeNot);
        public TsDepQuery depCodeIn(String depCodeIn);
        public TsDepQuery depCodeNotIn(String depCodeNotIn);
        public TsDepQuery depCodeLike(String depCodeLike);
        public TsDepQuery depCodeNotLike(String depCodeNotLike);
        public TsDepQuery depCodeIsNull();
        public TsDepQuery depCodeIsNotNull();





        public TsDepQuery depAddr(String depAddr);
        public TsDepQuery depAddrNot(String depAddrNot);
        public TsDepQuery depAddrIn(String depAddrIn);
        public TsDepQuery depAddrNotIn(String depAddrNotIn);
        public TsDepQuery depAddrLike(String depAddrLike);
        public TsDepQuery depAddrNotLike(String depAddrNotLike);
        public TsDepQuery depAddrIsNull();
        public TsDepQuery depAddrIsNotNull();





        public TsDepQuery pid(PK pid);
        public TsDepQuery pidNot(PK pidNot);
        public TsDepQuery pidIn(PK pidIn);
        public TsDepQuery pidNotIn(PK pidNotIn);
        public TsDepQuery pidIsNull();
        public TsDepQuery pidIsNotNull();





        public TsDepQuery depStatus(String depStatus);
        public TsDepQuery depStatusNot(String depStatusNot);
        public TsDepQuery depStatusIn(String depStatusIn);
        public TsDepQuery depStatusNotIn(String depStatusNotIn);
        public TsDepQuery depStatusIsNull();
        public TsDepQuery depStatusIsNotNull();





        public TsDepQuery leadUserId(PK leadUserId);
        public TsDepQuery leadUserIdNot(PK leadUserIdNot);
        public TsDepQuery leadUserIdIn(PK leadUserIdIn);
        public TsDepQuery leadUserIdNotIn(PK leadUserIdNotIn);
        public TsDepQuery leadUserIdIsNull();
        public TsDepQuery leadUserIdIsNotNull();





        public TsDepQuery organId(String organId);
        public TsDepQuery organIdNot(String organIdNot);
        public TsDepQuery organIdIn(String organIdIn);
        public TsDepQuery organIdNotIn(String organIdNotIn);
        public TsDepQuery organIdLike(String organIdLike);
        public TsDepQuery organIdNotLike(String organIdNotLike);
        public TsDepQuery organIdIsNull();
        public TsDepQuery organIdIsNotNull();





        public TsDepQuery remark(String remark);
        public TsDepQuery remarkNot(String remarkNot);
        public TsDepQuery remarkIn(String remarkIn);
        public TsDepQuery remarkNotIn(String remarkNotIn);
        public TsDepQuery remarkLike(String remarkLike);
        public TsDepQuery remarkNotLike(String remarkNotLike);
        public TsDepQuery remarkIsNull();
        public TsDepQuery remarkIsNotNull();





        public TsDepQuery deleteFlag(String deleteFlag);
        public TsDepQuery deleteFlagNot(String deleteFlagNot);
        public TsDepQuery deleteFlagIn(String deleteFlagIn);
        public TsDepQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TsDepQuery deleteFlagLike(String deleteFlagLike);
        public TsDepQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TsDepQuery deleteFlagIsNull();
        public TsDepQuery deleteFlagIsNotNull();





        public TsDepQuery createUserId(String createUserId);
        public TsDepQuery createUserIdNot(String createUserIdNot);
        public TsDepQuery createUserIdIn(String createUserIdIn);
        public TsDepQuery createUserIdNotIn(String createUserIdNotIn);
        public TsDepQuery createUserIdLike(String createUserIdLike);
        public TsDepQuery createUserIdNotLike(String createUserIdNotLike);
        public TsDepQuery createUserIdIsNull();
        public TsDepQuery createUserIdIsNotNull();





        public TsDepQuery createUserName(String createUserName);
        public TsDepQuery createUserNameNot(String createUserNameNot);
        public TsDepQuery createUserNameIn(String createUserNameIn);
        public TsDepQuery createUserNameNotIn(String createUserNameNotIn);
        public TsDepQuery createUserNameLike(String createUserNameLike);
        public TsDepQuery createUserNameNotLike(String createUserNameNotLike);
        public TsDepQuery createUserNameIsNull();
        public TsDepQuery createUserNameIsNotNull();





        public TsDepQuery createTime(Timestamp createTime);
        public TsDepQuery createTimeNot(Timestamp createTimeNot);
        public TsDepQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsDepQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsDepQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsDepQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsDepQuery updateUserId(String updateUserId);
        public TsDepQuery updateUserIdNot(String updateUserIdNot);
        public TsDepQuery updateUserIdIn(String updateUserIdIn);
        public TsDepQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsDepQuery updateUserIdLike(String updateUserIdLike);
        public TsDepQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsDepQuery updateUserIdIsNull();
        public TsDepQuery updateUserIdIsNotNull();





        public TsDepQuery updateUserName(String updateUserName);
        public TsDepQuery updateUserNameNot(String updateUserNameNot);
        public TsDepQuery updateUserNameIn(String updateUserNameIn);
        public TsDepQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsDepQuery updateUserNameLike(String updateUserNameLike);
        public TsDepQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsDepQuery updateUserNameIsNull();
        public TsDepQuery updateUserNameIsNotNull();





        public TsDepQuery updateTime(Timestamp updateTime);
        public TsDepQuery updateTimeNot(Timestamp updateTimeNot);
        public TsDepQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsDepQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsDepQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsDepQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsDepQuery versionNo(Integer versionNo);
        public TsDepQuery versionNoNot(Integer versionNoNot);
        public TsDepQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsDepQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsDepQuery versionNoLessThan(Integer versionNoLessThan);
        public TsDepQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TsDepQuery tenantId(String tenantId);
        public TsDepQuery tenantIdNot(String tenantIdNot);
        public TsDepQuery tenantIdIn(String tenantIdIn);
        public TsDepQuery tenantIdNotIn(String tenantIdNotIn);
        public TsDepQuery tenantIdLike(String tenantIdLike);
        public TsDepQuery tenantIdNotLike(String tenantIdNotLike);
        public TsDepQuery tenantIdIsNull();
        public TsDepQuery tenantIdIsNotNull();






	
}