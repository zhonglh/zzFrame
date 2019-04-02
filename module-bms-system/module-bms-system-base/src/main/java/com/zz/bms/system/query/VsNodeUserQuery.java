package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.VsNodeUserEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * VIEW 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-1 13:52:04
 */
public interface VsNodeUserQuery<PK extends Serializable> extends Query<VsNodeUserEntity,PK> {

        public VsNodeUserQuery id(PK id);
        public VsNodeUserQuery idNot(PK idNot);
        public VsNodeUserQuery idIn(PK idIn);
        public VsNodeUserQuery idNotIn(PK idNotIn);
        public VsNodeUserQuery idIsNull();
        public VsNodeUserQuery idIsNotNull();





        public VsNodeUserQuery userName(String userName);
        public VsNodeUserQuery userNameNot(String userNameNot);
        public VsNodeUserQuery userNameIn(String userNameIn);
        public VsNodeUserQuery userNameNotIn(String userNameNotIn);
        public VsNodeUserQuery userNameLike(String userNameLike);
        public VsNodeUserQuery userNameNotLike(String userNameNotLike);
        public VsNodeUserQuery userNameIsNull();
        public VsNodeUserQuery userNameIsNotNull();





        public VsNodeUserQuery loginName(String loginName);
        public VsNodeUserQuery loginNameNot(String loginNameNot);
        public VsNodeUserQuery loginNameIn(String loginNameIn);
        public VsNodeUserQuery loginNameNotIn(String loginNameNotIn);
        public VsNodeUserQuery loginNameLike(String loginNameLike);
        public VsNodeUserQuery loginNameNotLike(String loginNameNotLike);
        public VsNodeUserQuery loginNameIsNull();
        public VsNodeUserQuery loginNameIsNotNull();





        public VsNodeUserQuery loginPassword(String loginPassword);
        public VsNodeUserQuery loginPasswordNot(String loginPasswordNot);
        public VsNodeUserQuery loginPasswordIn(String loginPasswordIn);
        public VsNodeUserQuery loginPasswordNotIn(String loginPasswordNotIn);
        public VsNodeUserQuery loginPasswordLike(String loginPasswordLike);
        public VsNodeUserQuery loginPasswordNotLike(String loginPasswordNotLike);
        public VsNodeUserQuery loginPasswordIsNull();
        public VsNodeUserQuery loginPasswordIsNotNull();





        public VsNodeUserQuery salt(String salt);
        public VsNodeUserQuery saltNot(String saltNot);
        public VsNodeUserQuery saltIn(String saltIn);
        public VsNodeUserQuery saltNotIn(String saltNotIn);
        public VsNodeUserQuery saltLike(String saltLike);
        public VsNodeUserQuery saltNotLike(String saltNotLike);
        public VsNodeUserQuery saltIsNull();
        public VsNodeUserQuery saltIsNotNull();





        public VsNodeUserQuery userStatus(String userStatus);
        public VsNodeUserQuery userStatusNot(String userStatusNot);
        public VsNodeUserQuery userStatusIn(String userStatusIn);
        public VsNodeUserQuery userStatusNotIn(String userStatusNotIn);
        public VsNodeUserQuery userStatusIsNull();
        public VsNodeUserQuery userStatusIsNotNull();





        public VsNodeUserQuery leadUserId(PK leadUserId);
        public VsNodeUserQuery leadUserIdNot(PK leadUserIdNot);
        public VsNodeUserQuery leadUserIdIn(PK leadUserIdIn);
        public VsNodeUserQuery leadUserIdNotIn(PK leadUserIdNotIn);
        public VsNodeUserQuery leadUserIdIsNull();
        public VsNodeUserQuery leadUserIdIsNotNull();





        public VsNodeUserQuery phone(String phone);
        public VsNodeUserQuery phoneNot(String phoneNot);
        public VsNodeUserQuery phoneIn(String phoneIn);
        public VsNodeUserQuery phoneNotIn(String phoneNotIn);
        public VsNodeUserQuery phoneLike(String phoneLike);
        public VsNodeUserQuery phoneNotLike(String phoneNotLike);
        public VsNodeUserQuery phoneIsNull();
        public VsNodeUserQuery phoneIsNotNull();





        public VsNodeUserQuery email(String email);
        public VsNodeUserQuery emailNot(String emailNot);
        public VsNodeUserQuery emailIn(String emailIn);
        public VsNodeUserQuery emailNotIn(String emailNotIn);
        public VsNodeUserQuery emailLike(String emailLike);
        public VsNodeUserQuery emailNotLike(String emailNotLike);
        public VsNodeUserQuery emailIsNull();
        public VsNodeUserQuery emailIsNotNull();





        public VsNodeUserQuery avatarImage(String avatarImage);
        public VsNodeUserQuery avatarImageNot(String avatarImageNot);
        public VsNodeUserQuery avatarImageIn(String avatarImageIn);
        public VsNodeUserQuery avatarImageNotIn(String avatarImageNotIn);
        public VsNodeUserQuery avatarImageLike(String avatarImageLike);
        public VsNodeUserQuery avatarImageNotLike(String avatarImageNotLike);
        public VsNodeUserQuery avatarImageIsNull();
        public VsNodeUserQuery avatarImageIsNotNull();





        public VsNodeUserQuery openId(String openId);
        public VsNodeUserQuery openIdNot(String openIdNot);
        public VsNodeUserQuery openIdIn(String openIdIn);
        public VsNodeUserQuery openIdNotIn(String openIdNotIn);
        public VsNodeUserQuery openIdLike(String openIdLike);
        public VsNodeUserQuery openIdNotLike(String openIdNotLike);
        public VsNodeUserQuery openIdIsNull();
        public VsNodeUserQuery openIdIsNotNull();





        public VsNodeUserQuery unionId(String unionId);
        public VsNodeUserQuery unionIdNot(String unionIdNot);
        public VsNodeUserQuery unionIdIn(String unionIdIn);
        public VsNodeUserQuery unionIdNotIn(String unionIdNotIn);
        public VsNodeUserQuery unionIdLike(String unionIdLike);
        public VsNodeUserQuery unionIdNotLike(String unionIdNotLike);
        public VsNodeUserQuery unionIdIsNull();
        public VsNodeUserQuery unionIdIsNotNull();





        public VsNodeUserQuery systemAdmin(String systemAdmin);
        public VsNodeUserQuery systemAdminNot(String systemAdminNot);
        public VsNodeUserQuery systemAdminIn(String systemAdminIn);
        public VsNodeUserQuery systemAdminNotIn(String systemAdminNotIn);
        public VsNodeUserQuery systemAdminIsNull();
        public VsNodeUserQuery systemAdminIsNotNull();





        public VsNodeUserQuery depId(String depId);
        public VsNodeUserQuery depIdNot(String depIdNot);
        public VsNodeUserQuery depIdIn(String depIdIn);
        public VsNodeUserQuery depIdNotIn(String depIdNotIn);
        public VsNodeUserQuery depIdLike(String depIdLike);
        public VsNodeUserQuery depIdNotLike(String depIdNotLike);
        public VsNodeUserQuery depIdIsNull();
        public VsNodeUserQuery depIdIsNotNull();





        public VsNodeUserQuery organId(String organId);
        public VsNodeUserQuery organIdNot(String organIdNot);
        public VsNodeUserQuery organIdIn(String organIdIn);
        public VsNodeUserQuery organIdNotIn(String organIdNotIn);
        public VsNodeUserQuery organIdLike(String organIdLike);
        public VsNodeUserQuery organIdNotLike(String organIdNotLike);
        public VsNodeUserQuery organIdIsNull();
        public VsNodeUserQuery organIdIsNotNull();





        public VsNodeUserQuery pageLimit(Integer pageLimit);
        public VsNodeUserQuery pageLimitNot(Integer pageLimitNot);
        public VsNodeUserQuery pageLimitGreaterThan(Integer pageLimitGreaterThan);
        public VsNodeUserQuery pageLimitGreaterEqual(Integer pageLimitGreaterEqual);
        public VsNodeUserQuery pageLimitLessThan(Integer pageLimitLessThan);
        public VsNodeUserQuery pageLimitLessEqual(Integer pageLimitLessEqual);





        public VsNodeUserQuery remark(String remark);
        public VsNodeUserQuery remarkNot(String remarkNot);
        public VsNodeUserQuery remarkIn(String remarkIn);
        public VsNodeUserQuery remarkNotIn(String remarkNotIn);
        public VsNodeUserQuery remarkLike(String remarkLike);
        public VsNodeUserQuery remarkNotLike(String remarkNotLike);
        public VsNodeUserQuery remarkIsNull();
        public VsNodeUserQuery remarkIsNotNull();





        public VsNodeUserQuery deleteFlag(String deleteFlag);
        public VsNodeUserQuery deleteFlagNot(String deleteFlagNot);
        public VsNodeUserQuery deleteFlagIn(String deleteFlagIn);
        public VsNodeUserQuery deleteFlagNotIn(String deleteFlagNotIn);
        public VsNodeUserQuery deleteFlagLike(String deleteFlagLike);
        public VsNodeUserQuery deleteFlagNotLike(String deleteFlagNotLike);
        public VsNodeUserQuery deleteFlagIsNull();
        public VsNodeUserQuery deleteFlagIsNotNull();





        public VsNodeUserQuery createUserId(String createUserId);
        public VsNodeUserQuery createUserIdNot(String createUserIdNot);
        public VsNodeUserQuery createUserIdIn(String createUserIdIn);
        public VsNodeUserQuery createUserIdNotIn(String createUserIdNotIn);
        public VsNodeUserQuery createUserIdLike(String createUserIdLike);
        public VsNodeUserQuery createUserIdNotLike(String createUserIdNotLike);
        public VsNodeUserQuery createUserIdIsNull();
        public VsNodeUserQuery createUserIdIsNotNull();





        public VsNodeUserQuery createUserName(String createUserName);
        public VsNodeUserQuery createUserNameNot(String createUserNameNot);
        public VsNodeUserQuery createUserNameIn(String createUserNameIn);
        public VsNodeUserQuery createUserNameNotIn(String createUserNameNotIn);
        public VsNodeUserQuery createUserNameLike(String createUserNameLike);
        public VsNodeUserQuery createUserNameNotLike(String createUserNameNotLike);
        public VsNodeUserQuery createUserNameIsNull();
        public VsNodeUserQuery createUserNameIsNotNull();





        public VsNodeUserQuery createTime(Timestamp createTime);
        public VsNodeUserQuery createTimeNot(Timestamp createTimeNot);
        public VsNodeUserQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public VsNodeUserQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public VsNodeUserQuery createTimeLessThan(Timestamp createTimeLessThan);
        public VsNodeUserQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public VsNodeUserQuery updateUserId(String updateUserId);
        public VsNodeUserQuery updateUserIdNot(String updateUserIdNot);
        public VsNodeUserQuery updateUserIdIn(String updateUserIdIn);
        public VsNodeUserQuery updateUserIdNotIn(String updateUserIdNotIn);
        public VsNodeUserQuery updateUserIdLike(String updateUserIdLike);
        public VsNodeUserQuery updateUserIdNotLike(String updateUserIdNotLike);
        public VsNodeUserQuery updateUserIdIsNull();
        public VsNodeUserQuery updateUserIdIsNotNull();





        public VsNodeUserQuery updateUserName(String updateUserName);
        public VsNodeUserQuery updateUserNameNot(String updateUserNameNot);
        public VsNodeUserQuery updateUserNameIn(String updateUserNameIn);
        public VsNodeUserQuery updateUserNameNotIn(String updateUserNameNotIn);
        public VsNodeUserQuery updateUserNameLike(String updateUserNameLike);
        public VsNodeUserQuery updateUserNameNotLike(String updateUserNameNotLike);
        public VsNodeUserQuery updateUserNameIsNull();
        public VsNodeUserQuery updateUserNameIsNotNull();





        public VsNodeUserQuery updateTime(Timestamp updateTime);
        public VsNodeUserQuery updateTimeNot(Timestamp updateTimeNot);
        public VsNodeUserQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public VsNodeUserQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public VsNodeUserQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public VsNodeUserQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public VsNodeUserQuery versionNo(Integer versionNo);
        public VsNodeUserQuery versionNoNot(Integer versionNoNot);
        public VsNodeUserQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public VsNodeUserQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public VsNodeUserQuery versionNoLessThan(Integer versionNoLessThan);
        public VsNodeUserQuery versionNoLessEqual(Integer versionNoLessEqual);





        public VsNodeUserQuery tenantId(String tenantId);
        public VsNodeUserQuery tenantIdNot(String tenantIdNot);
        public VsNodeUserQuery tenantIdIn(String tenantIdIn);
        public VsNodeUserQuery tenantIdNotIn(String tenantIdNotIn);
        public VsNodeUserQuery tenantIdLike(String tenantIdLike);
        public VsNodeUserQuery tenantIdNotLike(String tenantIdNotLike);
        public VsNodeUserQuery tenantIdIsNull();
        public VsNodeUserQuery tenantIdIsNotNull();






	
}