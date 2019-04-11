package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsNotificationReceiveEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
 * 通知接收人 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:17
 */
public interface TsNotificationReceiveQuery<PK extends Serializable> extends Query<TsNotificationReceiveEntity,PK> {

        public TsNotificationReceiveQuery id(PK id);
        public TsNotificationReceiveQuery idNot(PK idNot);
        public TsNotificationReceiveQuery idIn(PK idIn);
        public TsNotificationReceiveQuery idNotIn(PK idNotIn);
        public TsNotificationReceiveQuery idIsNull();
        public TsNotificationReceiveQuery idIsNotNull();





        public TsNotificationReceiveQuery notifyId(String notifyId);
        public TsNotificationReceiveQuery notifyIdNot(String notifyIdNot);
        public TsNotificationReceiveQuery notifyIdIn(String notifyIdIn);
        public TsNotificationReceiveQuery notifyIdNotIn(String notifyIdNotIn);
        public TsNotificationReceiveQuery notifyIdLike(String notifyIdLike);
        public TsNotificationReceiveQuery notifyIdNotLike(String notifyIdNotLike);
        public TsNotificationReceiveQuery notifyIdIsNull();
        public TsNotificationReceiveQuery notifyIdIsNotNull();





        public TsNotificationReceiveQuery receiveUserId(PK receiveUserId);
        public TsNotificationReceiveQuery receiveUserIdNot(PK receiveUserIdNot);
        public TsNotificationReceiveQuery receiveUserIdIn(PK receiveUserIdIn);
        public TsNotificationReceiveQuery receiveUserIdNotIn(PK receiveUserIdNotIn);
        public TsNotificationReceiveQuery receiveUserIdIsNull();
        public TsNotificationReceiveQuery receiveUserIdIsNotNull();





        public TsNotificationReceiveQuery isRead(String isRead);
        public TsNotificationReceiveQuery isReadNot(String isReadNot);
        public TsNotificationReceiveQuery isReadIn(String isReadIn);
        public TsNotificationReceiveQuery isReadNotIn(String isReadNotIn);
        public TsNotificationReceiveQuery isReadIsNull();
        public TsNotificationReceiveQuery isReadIsNotNull();





        public TsNotificationReceiveQuery readTime(Timestamp readTime);
        public TsNotificationReceiveQuery readTimeNot(Timestamp readTimeNot);
        public TsNotificationReceiveQuery readTimeGreaterThan(Timestamp readTimeGreaterThan);
        public TsNotificationReceiveQuery readTimeGreaterEqual(Timestamp readTimeGreaterEqual);
        public TsNotificationReceiveQuery readTimeLessThan(Timestamp readTimeLessThan);
        public TsNotificationReceiveQuery readTimeLessEqual(Timestamp readTimeLessEqual);






	
}