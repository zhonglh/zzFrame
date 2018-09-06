package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsTenantEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 租户 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public interface TsTenantQuery<PK extends Serializable> extends Query<TsTenantEntity,PK> {

        public TsTenantQuery id(PK id);
        public TsTenantQuery idNot(PK idNot);
        public TsTenantQuery idIn(PK idIn);
        public TsTenantQuery idNotIn(PK idNotIn);
        public TsTenantQuery idIsNull();
        public TsTenantQuery idIsNotNull();





        public TsTenantQuery tenantName(String tenantName);
        public TsTenantQuery tenantNameNot(String tenantNameNot);
        public TsTenantQuery tenantNameIn(String tenantNameIn);
        public TsTenantQuery tenantNameNotIn(String tenantNameNotIn);
        public TsTenantQuery tenantNameLike(String tenantNameLike);
        public TsTenantQuery tenantNameNotLike(String tenantNameNotLike);
        public TsTenantQuery tenantNameIsNull();
        public TsTenantQuery tenantNameIsNotNull();





        public TsTenantQuery tenantCode(String tenantCode);
        public TsTenantQuery tenantCodeNot(String tenantCodeNot);
        public TsTenantQuery tenantCodeIn(String tenantCodeIn);
        public TsTenantQuery tenantCodeNotIn(String tenantCodeNotIn);
        public TsTenantQuery tenantCodeLike(String tenantCodeLike);
        public TsTenantQuery tenantCodeNotLike(String tenantCodeNotLike);
        public TsTenantQuery tenantCodeIsNull();
        public TsTenantQuery tenantCodeIsNotNull();





        public TsTenantQuery tenantAddr(String tenantAddr);
        public TsTenantQuery tenantAddrNot(String tenantAddrNot);
        public TsTenantQuery tenantAddrIn(String tenantAddrIn);
        public TsTenantQuery tenantAddrNotIn(String tenantAddrNotIn);
        public TsTenantQuery tenantAddrLike(String tenantAddrLike);
        public TsTenantQuery tenantAddrNotLike(String tenantAddrNotLike);
        public TsTenantQuery tenantAddrIsNull();
        public TsTenantQuery tenantAddrIsNotNull();





        public TsTenantQuery linkTel(String linkTel);
        public TsTenantQuery linkTelNot(String linkTelNot);
        public TsTenantQuery linkTelIn(String linkTelIn);
        public TsTenantQuery linkTelNotIn(String linkTelNotIn);
        public TsTenantQuery linkTelLike(String linkTelLike);
        public TsTenantQuery linkTelNotLike(String linkTelNotLike);
        public TsTenantQuery linkTelIsNull();
        public TsTenantQuery linkTelIsNotNull();





        public TsTenantQuery leadUserName(String leadUserName);
        public TsTenantQuery leadUserNameNot(String leadUserNameNot);
        public TsTenantQuery leadUserNameIn(String leadUserNameIn);
        public TsTenantQuery leadUserNameNotIn(String leadUserNameNotIn);
        public TsTenantQuery leadUserNameLike(String leadUserNameLike);
        public TsTenantQuery leadUserNameNotLike(String leadUserNameNotLike);
        public TsTenantQuery leadUserNameIsNull();
        public TsTenantQuery leadUserNameIsNotNull();





        public TsTenantQuery logoFile(String logoFile);
        public TsTenantQuery logoFileNot(String logoFileNot);
        public TsTenantQuery logoFileIn(String logoFileIn);
        public TsTenantQuery logoFileNotIn(String logoFileNotIn);
        public TsTenantQuery logoFileLike(String logoFileLike);
        public TsTenantQuery logoFileNotLike(String logoFileNotLike);
        public TsTenantQuery logoFileIsNull();
        public TsTenantQuery logoFileIsNotNull();





        public TsTenantQuery website(String website);
        public TsTenantQuery websiteNot(String websiteNot);
        public TsTenantQuery websiteIn(String websiteIn);
        public TsTenantQuery websiteNotIn(String websiteNotIn);
        public TsTenantQuery websiteLike(String websiteLike);
        public TsTenantQuery websiteNotLike(String websiteNotLike);
        public TsTenantQuery websiteIsNull();
        public TsTenantQuery websiteIsNotNull();





        public TsTenantQuery remark(String remark);
        public TsTenantQuery remarkNot(String remarkNot);
        public TsTenantQuery remarkIn(String remarkIn);
        public TsTenantQuery remarkNotIn(String remarkNotIn);
        public TsTenantQuery remarkLike(String remarkLike);
        public TsTenantQuery remarkNotLike(String remarkNotLike);
        public TsTenantQuery remarkIsNull();
        public TsTenantQuery remarkIsNotNull();





        public TsTenantQuery deleteFlag(String deleteFlag);
        public TsTenantQuery deleteFlagNot(String deleteFlagNot);
        public TsTenantQuery deleteFlagIn(String deleteFlagIn);
        public TsTenantQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TsTenantQuery deleteFlagLike(String deleteFlagLike);
        public TsTenantQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TsTenantQuery deleteFlagIsNull();
        public TsTenantQuery deleteFlagIsNotNull();





        public TsTenantQuery createUserId(String createUserId);
        public TsTenantQuery createUserIdNot(String createUserIdNot);
        public TsTenantQuery createUserIdIn(String createUserIdIn);
        public TsTenantQuery createUserIdNotIn(String createUserIdNotIn);
        public TsTenantQuery createUserIdLike(String createUserIdLike);
        public TsTenantQuery createUserIdNotLike(String createUserIdNotLike);
        public TsTenantQuery createUserIdIsNull();
        public TsTenantQuery createUserIdIsNotNull();





        public TsTenantQuery createUserName(String createUserName);
        public TsTenantQuery createUserNameNot(String createUserNameNot);
        public TsTenantQuery createUserNameIn(String createUserNameIn);
        public TsTenantQuery createUserNameNotIn(String createUserNameNotIn);
        public TsTenantQuery createUserNameLike(String createUserNameLike);
        public TsTenantQuery createUserNameNotLike(String createUserNameNotLike);
        public TsTenantQuery createUserNameIsNull();
        public TsTenantQuery createUserNameIsNotNull();





        public TsTenantQuery createTime(Timestamp createTime);
        public TsTenantQuery createTimeNot(Timestamp createTimeNot);
        public TsTenantQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsTenantQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsTenantQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsTenantQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsTenantQuery updateUserId(String updateUserId);
        public TsTenantQuery updateUserIdNot(String updateUserIdNot);
        public TsTenantQuery updateUserIdIn(String updateUserIdIn);
        public TsTenantQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsTenantQuery updateUserIdLike(String updateUserIdLike);
        public TsTenantQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsTenantQuery updateUserIdIsNull();
        public TsTenantQuery updateUserIdIsNotNull();





        public TsTenantQuery updateUserName(String updateUserName);
        public TsTenantQuery updateUserNameNot(String updateUserNameNot);
        public TsTenantQuery updateUserNameIn(String updateUserNameIn);
        public TsTenantQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsTenantQuery updateUserNameLike(String updateUserNameLike);
        public TsTenantQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsTenantQuery updateUserNameIsNull();
        public TsTenantQuery updateUserNameIsNotNull();





        public TsTenantQuery updateTime(Timestamp updateTime);
        public TsTenantQuery updateTimeNot(Timestamp updateTimeNot);
        public TsTenantQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsTenantQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsTenantQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsTenantQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsTenantQuery versionNo(Integer versionNo);
        public TsTenantQuery versionNoNot(Integer versionNoNot);
        public TsTenantQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsTenantQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsTenantQuery versionNoLessThan(Integer versionNoLessThan);
        public TsTenantQuery versionNoLessEqual(Integer versionNoLessEqual);






	
}