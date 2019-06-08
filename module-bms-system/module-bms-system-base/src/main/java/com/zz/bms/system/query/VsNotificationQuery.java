package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.VsNotificationEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 系统通知 查询抽象类
 *
 * @author Administrator
 * @date 2019-6-8 22:01:58
 */
public interface VsNotificationQuery<PK extends Serializable> extends Query<VsNotificationEntity,PK> {

        public VsNotificationQuery id(PK id);
        public VsNotificationQuery idNot(PK idNot);
        public VsNotificationQuery idIn(PK idIn);
        public VsNotificationQuery idNotIn(PK idNotIn);
        public VsNotificationQuery idIsNull();
        public VsNotificationQuery idIsNotNull();





        public VsNotificationQuery notifyModule(String notifyModule);
        public VsNotificationQuery notifyModuleNot(String notifyModuleNot);
        public VsNotificationQuery notifyModuleIn(String notifyModuleIn);
        public VsNotificationQuery notifyModuleNotIn(String notifyModuleNotIn);
        public VsNotificationQuery notifyModuleLike(String notifyModuleLike);
        public VsNotificationQuery notifyModuleNotLike(String notifyModuleNotLike);
        public VsNotificationQuery notifyModuleIsNull();
        public VsNotificationQuery notifyModuleIsNotNull();





        public VsNotificationQuery title(String title);
        public VsNotificationQuery titleNot(String titleNot);
        public VsNotificationQuery titleIn(String titleIn);
        public VsNotificationQuery titleNotIn(String titleNotIn);
        public VsNotificationQuery titleLike(String titleLike);
        public VsNotificationQuery titleNotLike(String titleNotLike);
        public VsNotificationQuery titleIsNull();
        public VsNotificationQuery titleIsNotNull();






        //todo TEXT content;




        public VsNotificationQuery notifyTime(Timestamp notifyTime);
        public VsNotificationQuery notifyTimeNot(Timestamp notifyTimeNot);
        public VsNotificationQuery notifyTimeGreaterThan(Timestamp notifyTimeGreaterThan);
        public VsNotificationQuery notifyTimeGreaterEqual(Timestamp notifyTimeGreaterEqual);
        public VsNotificationQuery notifyTimeLessThan(Timestamp notifyTimeLessThan);
        public VsNotificationQuery notifyTimeLessEqual(Timestamp notifyTimeLessEqual);





        public VsNotificationQuery notifyFiles(String notifyFiles);
        public VsNotificationQuery notifyFilesNot(String notifyFilesNot);
        public VsNotificationQuery notifyFilesIn(String notifyFilesIn);
        public VsNotificationQuery notifyFilesNotIn(String notifyFilesNotIn);
        public VsNotificationQuery notifyFilesLike(String notifyFilesLike);
        public VsNotificationQuery notifyFilesNotLike(String notifyFilesNotLike);
        public VsNotificationQuery notifyFilesIsNull();
        public VsNotificationQuery notifyFilesIsNotNull();





        public VsNotificationQuery createUserId(String createUserId);
        public VsNotificationQuery createUserIdNot(String createUserIdNot);
        public VsNotificationQuery createUserIdIn(String createUserIdIn);
        public VsNotificationQuery createUserIdNotIn(String createUserIdNotIn);
        public VsNotificationQuery createUserIdLike(String createUserIdLike);
        public VsNotificationQuery createUserIdNotLike(String createUserIdNotLike);
        public VsNotificationQuery createUserIdIsNull();
        public VsNotificationQuery createUserIdIsNotNull();





        public VsNotificationQuery createUserName(String createUserName);
        public VsNotificationQuery createUserNameNot(String createUserNameNot);
        public VsNotificationQuery createUserNameIn(String createUserNameIn);
        public VsNotificationQuery createUserNameNotIn(String createUserNameNotIn);
        public VsNotificationQuery createUserNameLike(String createUserNameLike);
        public VsNotificationQuery createUserNameNotLike(String createUserNameNotLike);
        public VsNotificationQuery createUserNameIsNull();
        public VsNotificationQuery createUserNameIsNotNull();





        public VsNotificationQuery createTime(Timestamp createTime);
        public VsNotificationQuery createTimeNot(Timestamp createTimeNot);
        public VsNotificationQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public VsNotificationQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public VsNotificationQuery createTimeLessThan(Timestamp createTimeLessThan);
        public VsNotificationQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public VsNotificationQuery updateUserId(String updateUserId);
        public VsNotificationQuery updateUserIdNot(String updateUserIdNot);
        public VsNotificationQuery updateUserIdIn(String updateUserIdIn);
        public VsNotificationQuery updateUserIdNotIn(String updateUserIdNotIn);
        public VsNotificationQuery updateUserIdLike(String updateUserIdLike);
        public VsNotificationQuery updateUserIdNotLike(String updateUserIdNotLike);
        public VsNotificationQuery updateUserIdIsNull();
        public VsNotificationQuery updateUserIdIsNotNull();





        public VsNotificationQuery updateUserName(String updateUserName);
        public VsNotificationQuery updateUserNameNot(String updateUserNameNot);
        public VsNotificationQuery updateUserNameIn(String updateUserNameIn);
        public VsNotificationQuery updateUserNameNotIn(String updateUserNameNotIn);
        public VsNotificationQuery updateUserNameLike(String updateUserNameLike);
        public VsNotificationQuery updateUserNameNotLike(String updateUserNameNotLike);
        public VsNotificationQuery updateUserNameIsNull();
        public VsNotificationQuery updateUserNameIsNotNull();





        public VsNotificationQuery updateTime(Timestamp updateTime);
        public VsNotificationQuery updateTimeNot(Timestamp updateTimeNot);
        public VsNotificationQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public VsNotificationQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public VsNotificationQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public VsNotificationQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public VsNotificationQuery versionNo(Integer versionNo);
        public VsNotificationQuery versionNoNot(Integer versionNoNot);
        public VsNotificationQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public VsNotificationQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public VsNotificationQuery versionNoLessThan(Integer versionNoLessThan);
        public VsNotificationQuery versionNoLessEqual(Integer versionNoLessEqual);





        public VsNotificationQuery tenantId(String tenantId);
        public VsNotificationQuery tenantIdNot(String tenantIdNot);
        public VsNotificationQuery tenantIdIn(String tenantIdIn);
        public VsNotificationQuery tenantIdNotIn(String tenantIdNotIn);
        public VsNotificationQuery tenantIdLike(String tenantIdLike);
        public VsNotificationQuery tenantIdNotLike(String tenantIdNotLike);
        public VsNotificationQuery tenantIdIsNull();
        public VsNotificationQuery tenantIdIsNotNull();





        public VsNotificationQuery receiveUserId(PK receiveUserId);
        public VsNotificationQuery receiveUserIdNot(PK receiveUserIdNot);
        public VsNotificationQuery receiveUserIdIn(PK receiveUserIdIn);
        public VsNotificationQuery receiveUserIdNotIn(PK receiveUserIdNotIn);
        public VsNotificationQuery receiveUserIdIsNull();
        public VsNotificationQuery receiveUserIdIsNotNull();





        public VsNotificationQuery readTime(Timestamp readTime);
        public VsNotificationQuery readTimeNot(Timestamp readTimeNot);
        public VsNotificationQuery readTimeGreaterThan(Timestamp readTimeGreaterThan);
        public VsNotificationQuery readTimeGreaterEqual(Timestamp readTimeGreaterEqual);
        public VsNotificationQuery readTimeLessThan(Timestamp readTimeLessThan);
        public VsNotificationQuery readTimeLessEqual(Timestamp readTimeLessEqual);





        public VsNotificationQuery isRead(String isRead);
        public VsNotificationQuery isReadNot(String isReadNot);
        public VsNotificationQuery isReadIn(String isReadIn);
        public VsNotificationQuery isReadNotIn(String isReadNotIn);
        public VsNotificationQuery isReadIsNull();
        public VsNotificationQuery isReadIsNotNull();





        public VsNotificationQuery sendName(String sendName);
        public VsNotificationQuery sendNameNot(String sendNameNot);
        public VsNotificationQuery sendNameIn(String sendNameIn);
        public VsNotificationQuery sendNameNotIn(String sendNameNotIn);
        public VsNotificationQuery sendNameLike(String sendNameLike);
        public VsNotificationQuery sendNameNotLike(String sendNameNotLike);
        public VsNotificationQuery sendNameIsNull();
        public VsNotificationQuery sendNameIsNotNull();





        public VsNotificationQuery receiveName(String receiveName);
        public VsNotificationQuery receiveNameNot(String receiveNameNot);
        public VsNotificationQuery receiveNameIn(String receiveNameIn);
        public VsNotificationQuery receiveNameNotIn(String receiveNameNotIn);
        public VsNotificationQuery receiveNameLike(String receiveNameLike);
        public VsNotificationQuery receiveNameNotLike(String receiveNameNotLike);
        public VsNotificationQuery receiveNameIsNull();
        public VsNotificationQuery receiveNameIsNotNull();






	
}