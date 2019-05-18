package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsNotificationEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 系统通知 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:13
 */
public interface TsNotificationQuery<PK extends Serializable> extends Query<TsNotificationEntity,PK> {

        public TsNotificationQuery id(PK id);
        public TsNotificationQuery idNot(PK idNot);
        public TsNotificationQuery idIn(PK idIn);
        public TsNotificationQuery idNotIn(PK idNotIn);
        public TsNotificationQuery idIsNull();
        public TsNotificationQuery idIsNotNull();





        public TsNotificationQuery notifyModule(String notifyModule);
        public TsNotificationQuery notifyModuleNot(String notifyModuleNot);
        public TsNotificationQuery notifyModuleIn(String notifyModuleIn);
        public TsNotificationQuery notifyModuleNotIn(String notifyModuleNotIn);
        public TsNotificationQuery notifyModuleLike(String notifyModuleLike);
        public TsNotificationQuery notifyModuleNotLike(String notifyModuleNotLike);
        public TsNotificationQuery notifyModuleIsNull();
        public TsNotificationQuery notifyModuleIsNotNull();





        public TsNotificationQuery title(String title);
        public TsNotificationQuery titleNot(String titleNot);
        public TsNotificationQuery titleIn(String titleIn);
        public TsNotificationQuery titleNotIn(String titleNotIn);
        public TsNotificationQuery titleLike(String titleLike);
        public TsNotificationQuery titleNotLike(String titleNotLike);
        public TsNotificationQuery titleIsNull();
        public TsNotificationQuery titleIsNotNull();











        public TsNotificationQuery notifyTime(Timestamp notifyTime);
        public TsNotificationQuery notifyTimeNot(Timestamp notifyTimeNot);
        public TsNotificationQuery notifyTimeGreaterThan(Timestamp notifyTimeGreaterThan);
        public TsNotificationQuery notifyTimeGreaterEqual(Timestamp notifyTimeGreaterEqual);
        public TsNotificationQuery notifyTimeLessThan(Timestamp notifyTimeLessThan);
        public TsNotificationQuery notifyTimeLessEqual(Timestamp notifyTimeLessEqual);





        public TsNotificationQuery notifyFiles(String notifyFiles);
        public TsNotificationQuery notifyFilesNot(String notifyFilesNot);
        public TsNotificationQuery notifyFilesIn(String notifyFilesIn);
        public TsNotificationQuery notifyFilesNotIn(String notifyFilesNotIn);
        public TsNotificationQuery notifyFilesLike(String notifyFilesLike);
        public TsNotificationQuery notifyFilesNotLike(String notifyFilesNotLike);
        public TsNotificationQuery notifyFilesIsNull();
        public TsNotificationQuery notifyFilesIsNotNull();





        public TsNotificationQuery createUserId(String createUserId);
        public TsNotificationQuery createUserIdNot(String createUserIdNot);
        public TsNotificationQuery createUserIdIn(String createUserIdIn);
        public TsNotificationQuery createUserIdNotIn(String createUserIdNotIn);
        public TsNotificationQuery createUserIdLike(String createUserIdLike);
        public TsNotificationQuery createUserIdNotLike(String createUserIdNotLike);
        public TsNotificationQuery createUserIdIsNull();
        public TsNotificationQuery createUserIdIsNotNull();





        public TsNotificationQuery createUserName(String createUserName);
        public TsNotificationQuery createUserNameNot(String createUserNameNot);
        public TsNotificationQuery createUserNameIn(String createUserNameIn);
        public TsNotificationQuery createUserNameNotIn(String createUserNameNotIn);
        public TsNotificationQuery createUserNameLike(String createUserNameLike);
        public TsNotificationQuery createUserNameNotLike(String createUserNameNotLike);
        public TsNotificationQuery createUserNameIsNull();
        public TsNotificationQuery createUserNameIsNotNull();





        public TsNotificationQuery createTime(Timestamp createTime);
        public TsNotificationQuery createTimeNot(Timestamp createTimeNot);
        public TsNotificationQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsNotificationQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsNotificationQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsNotificationQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsNotificationQuery updateUserId(String updateUserId);
        public TsNotificationQuery updateUserIdNot(String updateUserIdNot);
        public TsNotificationQuery updateUserIdIn(String updateUserIdIn);
        public TsNotificationQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsNotificationQuery updateUserIdLike(String updateUserIdLike);
        public TsNotificationQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsNotificationQuery updateUserIdIsNull();
        public TsNotificationQuery updateUserIdIsNotNull();





        public TsNotificationQuery updateUserName(String updateUserName);
        public TsNotificationQuery updateUserNameNot(String updateUserNameNot);
        public TsNotificationQuery updateUserNameIn(String updateUserNameIn);
        public TsNotificationQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsNotificationQuery updateUserNameLike(String updateUserNameLike);
        public TsNotificationQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsNotificationQuery updateUserNameIsNull();
        public TsNotificationQuery updateUserNameIsNotNull();





        public TsNotificationQuery updateTime(Timestamp updateTime);
        public TsNotificationQuery updateTimeNot(Timestamp updateTimeNot);
        public TsNotificationQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsNotificationQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsNotificationQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsNotificationQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsNotificationQuery versionNo(Integer versionNo);
        public TsNotificationQuery versionNoNot(Integer versionNoNot);
        public TsNotificationQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsNotificationQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsNotificationQuery versionNoLessThan(Integer versionNoLessThan);
        public TsNotificationQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TsNotificationQuery tenantId(String tenantId);
        public TsNotificationQuery tenantIdNot(String tenantIdNot);
        public TsNotificationQuery tenantIdIn(String tenantIdIn);
        public TsNotificationQuery tenantIdNotIn(String tenantIdNotIn);
        public TsNotificationQuery tenantIdLike(String tenantIdLike);
        public TsNotificationQuery tenantIdNotLike(String tenantIdNotLike);
        public TsNotificationQuery tenantIdIsNull();
        public TsNotificationQuery tenantIdIsNotNull();






	
}