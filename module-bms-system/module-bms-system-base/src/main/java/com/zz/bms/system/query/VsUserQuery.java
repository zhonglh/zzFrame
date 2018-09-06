package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.VsUserEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 用户 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public interface VsUserQuery<PK extends Serializable> extends Query<VsUserEntity,PK> {

        public VsUserQuery id(PK id);
        public VsUserQuery idNot(PK idNot);
        public VsUserQuery idIn(PK idIn);
        public VsUserQuery idNotIn(PK idNotIn);
        public VsUserQuery idIsNull();
        public VsUserQuery idIsNotNull();





        public VsUserQuery userName(String userName);
        public VsUserQuery userNameNot(String userNameNot);
        public VsUserQuery userNameIn(String userNameIn);
        public VsUserQuery userNameNotIn(String userNameNotIn);
        public VsUserQuery userNameLike(String userNameLike);
        public VsUserQuery userNameNotLike(String userNameNotLike);
        public VsUserQuery userNameIsNull();
        public VsUserQuery userNameIsNotNull();





        public VsUserQuery loginName(String loginName);
        public VsUserQuery loginNameNot(String loginNameNot);
        public VsUserQuery loginNameIn(String loginNameIn);
        public VsUserQuery loginNameNotIn(String loginNameNotIn);
        public VsUserQuery loginNameLike(String loginNameLike);
        public VsUserQuery loginNameNotLike(String loginNameNotLike);
        public VsUserQuery loginNameIsNull();
        public VsUserQuery loginNameIsNotNull();





        public VsUserQuery loginPassword(String loginPassword);
        public VsUserQuery loginPasswordNot(String loginPasswordNot);
        public VsUserQuery loginPasswordIn(String loginPasswordIn);
        public VsUserQuery loginPasswordNotIn(String loginPasswordNotIn);
        public VsUserQuery loginPasswordLike(String loginPasswordLike);
        public VsUserQuery loginPasswordNotLike(String loginPasswordNotLike);
        public VsUserQuery loginPasswordIsNull();
        public VsUserQuery loginPasswordIsNotNull();





        public VsUserQuery salt(String salt);
        public VsUserQuery saltNot(String saltNot);
        public VsUserQuery saltIn(String saltIn);
        public VsUserQuery saltNotIn(String saltNotIn);
        public VsUserQuery saltLike(String saltLike);
        public VsUserQuery saltNotLike(String saltNotLike);
        public VsUserQuery saltIsNull();
        public VsUserQuery saltIsNotNull();





        public VsUserQuery userStatus(String userStatus);
        public VsUserQuery userStatusNot(String userStatusNot);
        public VsUserQuery userStatusIn(String userStatusIn);
        public VsUserQuery userStatusNotIn(String userStatusNotIn);
        public VsUserQuery userStatusIsNull();
        public VsUserQuery userStatusIsNotNull();





        public VsUserQuery leadUserId(PK leadUserId);
        public VsUserQuery leadUserIdNot(PK leadUserIdNot);
        public VsUserQuery leadUserIdIn(PK leadUserIdIn);
        public VsUserQuery leadUserIdNotIn(PK leadUserIdNotIn);
        public VsUserQuery leadUserIdIsNull();
        public VsUserQuery leadUserIdIsNotNull();





        public VsUserQuery phone(String phone);
        public VsUserQuery phoneNot(String phoneNot);
        public VsUserQuery phoneIn(String phoneIn);
        public VsUserQuery phoneNotIn(String phoneNotIn);
        public VsUserQuery phoneLike(String phoneLike);
        public VsUserQuery phoneNotLike(String phoneNotLike);
        public VsUserQuery phoneIsNull();
        public VsUserQuery phoneIsNotNull();





        public VsUserQuery email(String email);
        public VsUserQuery emailNot(String emailNot);
        public VsUserQuery emailIn(String emailIn);
        public VsUserQuery emailNotIn(String emailNotIn);
        public VsUserQuery emailLike(String emailLike);
        public VsUserQuery emailNotLike(String emailNotLike);
        public VsUserQuery emailIsNull();
        public VsUserQuery emailIsNotNull();





        public VsUserQuery avatarUrl(String avatarUrl);
        public VsUserQuery avatarUrlNot(String avatarUrlNot);
        public VsUserQuery avatarUrlIn(String avatarUrlIn);
        public VsUserQuery avatarUrlNotIn(String avatarUrlNotIn);
        public VsUserQuery avatarUrlLike(String avatarUrlLike);
        public VsUserQuery avatarUrlNotLike(String avatarUrlNotLike);
        public VsUserQuery avatarUrlIsNull();
        public VsUserQuery avatarUrlIsNotNull();





        public VsUserQuery openId(String openId);
        public VsUserQuery openIdNot(String openIdNot);
        public VsUserQuery openIdIn(String openIdIn);
        public VsUserQuery openIdNotIn(String openIdNotIn);
        public VsUserQuery openIdLike(String openIdLike);
        public VsUserQuery openIdNotLike(String openIdNotLike);
        public VsUserQuery openIdIsNull();
        public VsUserQuery openIdIsNotNull();





        public VsUserQuery unionId(String unionId);
        public VsUserQuery unionIdNot(String unionIdNot);
        public VsUserQuery unionIdIn(String unionIdIn);
        public VsUserQuery unionIdNotIn(String unionIdNotIn);
        public VsUserQuery unionIdLike(String unionIdLike);
        public VsUserQuery unionIdNotLike(String unionIdNotLike);
        public VsUserQuery unionIdIsNull();
        public VsUserQuery unionIdIsNotNull();





        public VsUserQuery systemAdmin(String systemAdmin);
        public VsUserQuery systemAdminNot(String systemAdminNot);
        public VsUserQuery systemAdminIn(String systemAdminIn);
        public VsUserQuery systemAdminNotIn(String systemAdminNotIn);
        public VsUserQuery systemAdminIsNull();
        public VsUserQuery systemAdminIsNotNull();





        public VsUserQuery depId(String depId);
        public VsUserQuery depIdNot(String depIdNot);
        public VsUserQuery depIdIn(String depIdIn);
        public VsUserQuery depIdNotIn(String depIdNotIn);
        public VsUserQuery depIdLike(String depIdLike);
        public VsUserQuery depIdNotLike(String depIdNotLike);
        public VsUserQuery depIdIsNull();
        public VsUserQuery depIdIsNotNull();





        public VsUserQuery organId(String organId);
        public VsUserQuery organIdNot(String organIdNot);
        public VsUserQuery organIdIn(String organIdIn);
        public VsUserQuery organIdNotIn(String organIdNotIn);
        public VsUserQuery organIdLike(String organIdLike);
        public VsUserQuery organIdNotLike(String organIdNotLike);
        public VsUserQuery organIdIsNull();
        public VsUserQuery organIdIsNotNull();





        public VsUserQuery remark(String remark);
        public VsUserQuery remarkNot(String remarkNot);
        public VsUserQuery remarkIn(String remarkIn);
        public VsUserQuery remarkNotIn(String remarkNotIn);
        public VsUserQuery remarkLike(String remarkLike);
        public VsUserQuery remarkNotLike(String remarkNotLike);
        public VsUserQuery remarkIsNull();
        public VsUserQuery remarkIsNotNull();





        public VsUserQuery deleteFlag(String deleteFlag);
        public VsUserQuery deleteFlagNot(String deleteFlagNot);
        public VsUserQuery deleteFlagIn(String deleteFlagIn);
        public VsUserQuery deleteFlagNotIn(String deleteFlagNotIn);
        public VsUserQuery deleteFlagLike(String deleteFlagLike);
        public VsUserQuery deleteFlagNotLike(String deleteFlagNotLike);
        public VsUserQuery deleteFlagIsNull();
        public VsUserQuery deleteFlagIsNotNull();





        public VsUserQuery createUserId(String createUserId);
        public VsUserQuery createUserIdNot(String createUserIdNot);
        public VsUserQuery createUserIdIn(String createUserIdIn);
        public VsUserQuery createUserIdNotIn(String createUserIdNotIn);
        public VsUserQuery createUserIdLike(String createUserIdLike);
        public VsUserQuery createUserIdNotLike(String createUserIdNotLike);
        public VsUserQuery createUserIdIsNull();
        public VsUserQuery createUserIdIsNotNull();





        public VsUserQuery createUserName(String createUserName);
        public VsUserQuery createUserNameNot(String createUserNameNot);
        public VsUserQuery createUserNameIn(String createUserNameIn);
        public VsUserQuery createUserNameNotIn(String createUserNameNotIn);
        public VsUserQuery createUserNameLike(String createUserNameLike);
        public VsUserQuery createUserNameNotLike(String createUserNameNotLike);
        public VsUserQuery createUserNameIsNull();
        public VsUserQuery createUserNameIsNotNull();





        public VsUserQuery createTime(Timestamp createTime);
        public VsUserQuery createTimeNot(Timestamp createTimeNot);
        public VsUserQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public VsUserQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public VsUserQuery createTimeLessThan(Timestamp createTimeLessThan);
        public VsUserQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public VsUserQuery updateUserId(String updateUserId);
        public VsUserQuery updateUserIdNot(String updateUserIdNot);
        public VsUserQuery updateUserIdIn(String updateUserIdIn);
        public VsUserQuery updateUserIdNotIn(String updateUserIdNotIn);
        public VsUserQuery updateUserIdLike(String updateUserIdLike);
        public VsUserQuery updateUserIdNotLike(String updateUserIdNotLike);
        public VsUserQuery updateUserIdIsNull();
        public VsUserQuery updateUserIdIsNotNull();





        public VsUserQuery updateUserName(String updateUserName);
        public VsUserQuery updateUserNameNot(String updateUserNameNot);
        public VsUserQuery updateUserNameIn(String updateUserNameIn);
        public VsUserQuery updateUserNameNotIn(String updateUserNameNotIn);
        public VsUserQuery updateUserNameLike(String updateUserNameLike);
        public VsUserQuery updateUserNameNotLike(String updateUserNameNotLike);
        public VsUserQuery updateUserNameIsNull();
        public VsUserQuery updateUserNameIsNotNull();





        public VsUserQuery updateTime(Timestamp updateTime);
        public VsUserQuery updateTimeNot(Timestamp updateTimeNot);
        public VsUserQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public VsUserQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public VsUserQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public VsUserQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public VsUserQuery versionNo(Integer versionNo);
        public VsUserQuery versionNoNot(Integer versionNoNot);
        public VsUserQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public VsUserQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public VsUserQuery versionNoLessThan(Integer versionNoLessThan);
        public VsUserQuery versionNoLessEqual(Integer versionNoLessEqual);





        public VsUserQuery tenantId(String tenantId);
        public VsUserQuery tenantIdNot(String tenantIdNot);
        public VsUserQuery tenantIdIn(String tenantIdIn);
        public VsUserQuery tenantIdNotIn(String tenantIdNotIn);
        public VsUserQuery tenantIdLike(String tenantIdLike);
        public VsUserQuery tenantIdNotLike(String tenantIdNotLike);
        public VsUserQuery tenantIdIsNull();
        public VsUserQuery tenantIdIsNotNull();





        public VsUserQuery depName(String depName);
        public VsUserQuery depNameNot(String depNameNot);
        public VsUserQuery depNameIn(String depNameIn);
        public VsUserQuery depNameNotIn(String depNameNotIn);
        public VsUserQuery depNameLike(String depNameLike);
        public VsUserQuery depNameNotLike(String depNameNotLike);
        public VsUserQuery depNameIsNull();
        public VsUserQuery depNameIsNotNull();





        public VsUserQuery organName(String organName);
        public VsUserQuery organNameNot(String organNameNot);
        public VsUserQuery organNameIn(String organNameIn);
        public VsUserQuery organNameNotIn(String organNameNotIn);
        public VsUserQuery organNameLike(String organNameLike);
        public VsUserQuery organNameNotLike(String organNameNotLike);
        public VsUserQuery organNameIsNull();
        public VsUserQuery organNameIsNotNull();





        public VsUserQuery tenantName(String tenantName);
        public VsUserQuery tenantNameNot(String tenantNameNot);
        public VsUserQuery tenantNameIn(String tenantNameIn);
        public VsUserQuery tenantNameNotIn(String tenantNameNotIn);
        public VsUserQuery tenantNameLike(String tenantNameLike);
        public VsUserQuery tenantNameNotLike(String tenantNameNotLike);
        public VsUserQuery tenantNameIsNull();
        public VsUserQuery tenantNameIsNotNull();






	
}