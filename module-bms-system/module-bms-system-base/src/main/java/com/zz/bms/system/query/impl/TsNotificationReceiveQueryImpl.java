package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsNotificationReceiveEntity;
import com.zz.bms.system.query.TsNotificationReceiveQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
* 通知接收人 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:17
*/
public class TsNotificationReceiveQueryImpl<PK extends Serializable> extends TsNotificationReceiveAbstractQueryImpl<PK> implements TsNotificationReceiveQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> notifyId_IN;
        private List<String> notifyId_NOTIN;
        private List<PK> receiveUserId_IN;
        private List<PK> receiveUserId_NOTIN;

        private List<String> isRead_IN;
        private List<String> isRead_NOTIN;



        @Override
        public TsNotificationReceiveQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsNotificationReceiveQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsNotificationReceiveQuery notifyId(String notifyId) {
            if(!IdUtils.isEmpty(notifyId)){
                this.notifyId = notifyId;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery notifyIdNot(String notifyIdNot) {
            if(!IdUtils.isEmpty(notifyIdNot)){
                this.notifyId_NE = notifyIdNot;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery notifyIdLike(String notifyIdLike) {
            if(!IdUtils.isEmpty(notifyIdLike)){
                this.notifyId_LIKE = notifyIdLike;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery notifyIdNotLike(String notifyIdNotLike) {
            if(!IdUtils.isEmpty(notifyIdNotLike)){
                this.notifyId_NOTLIKE = notifyIdNotLike;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery notifyIdIn(String notifyIdIn) {
            if(!IdUtils.isEmpty(notifyIdIn)){
                if(this.notifyId_IN == null){
                    this.notifyId_IN = new ArrayList<String>();
                }
                this.notifyId_IN.add( notifyIdIn );
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery notifyIdNotIn(String notifyIdNotIn) {
            if(!IdUtils.isEmpty(notifyIdNotIn)){
                if(this.notifyId_NOTIN == null){
                    this.notifyId_NOTIN = new ArrayList<String>();
                }
                this.notifyId_NOTIN.add( notifyIdNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery notifyIdIsNull() {
            this.isNulls.add("notifyId");
            return this;
        }

        @Override
        public TsNotificationReceiveQuery notifyIdIsNotNull() {
            this.isNotNulls.add("notifyId");
            return this;
        }


        @Override
        public TsNotificationReceiveQuery receiveUserId(PK receiveUserId) {
            if(!IdUtils.isEmpty(receiveUserId)){
                this.receiveUserId = receiveUserId;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery receiveUserIdNot(PK receiveUserIdNot) {
            if(!IdUtils.isEmpty(receiveUserIdNot)){
                this.receiveUserId_NE = receiveUserIdNot;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery receiveUserIdIn(PK receiveUserIdIn) {
            if(!IdUtils.isEmpty(receiveUserIdIn)){
                if(this.receiveUserId_IN == null){
                    this.receiveUserId_IN = new ArrayList<PK>();
                }
                this.receiveUserId_IN.add( receiveUserIdIn );
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery receiveUserIdNotIn(PK receiveUserIdNotIn) {
            if(!IdUtils.isEmpty(receiveUserIdNotIn)){
                if(this.receiveUserId_NOTIN == null){
                    this.receiveUserId_NOTIN = new ArrayList<PK>();
                }
                this.receiveUserId_NOTIN.add( receiveUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery receiveUserIdIsNull() {
            this.isNulls.add("receiveUserId");
            return this;
        }

        @Override
        public TsNotificationReceiveQuery receiveUserIdIsNotNull() {
            this.isNotNulls.add("receiveUserId");
            return this;
        }


        @Override
        public TsNotificationReceiveQuery isRead(String isRead) {
            if(!IdUtils.isEmpty(isRead)){
                this.isRead = isRead;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery isReadNot(String isReadNot) {
            if(!IdUtils.isEmpty(isReadNot)){
                this.isRead_NE = isReadNot;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery isReadIn(String isReadIn) {
            if(!IdUtils.isEmpty(isReadIn)){
                if(this.isRead_IN == null){
                    this.isRead_IN = new ArrayList<String>();
                }
                this.isRead_IN.add( isReadIn );
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery isReadNotIn(String isReadNotIn) {
            if(!IdUtils.isEmpty(isReadNotIn)){
                if(this.isRead_NOTIN == null){
                    this.isRead_NOTIN = new ArrayList<String>();
                }
                this.isRead_NOTIN.add( isReadNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery isReadIsNull() {
            this.isNulls.add("isRead");
            return this;
        }

        @Override
        public TsNotificationReceiveQuery isReadIsNotNull() {
            this.isNotNulls.add("isRead");
            return this;
        }


        @Override
        public TsNotificationReceiveQuery readTime(Timestamp readTime) {
            if(!IdUtils.isEmpty(readTime)){
                this.readTime = readTime;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery readTimeNot(Timestamp readTimeNot) {
            if(!IdUtils.isEmpty(readTimeNot)){
                this.readTime_NE = readTimeNot;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery readTimeGreaterThan(Timestamp readTimeGreaterThan){
            if(readTimeGreaterThan != null){
                this.readTime_GT = readTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsNotificationReceiveQuery readTimeGreaterEqual(Timestamp readTimeGreaterEqual){
            if(readTimeGreaterEqual != null){
                this.readTime_GE = readTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery readTimeLessThan(Timestamp readTimeLessThan){
            if(readTimeLessThan != null){
                this.readTime_LT = readTimeLessThan;
            }
            return this;
        }

        @Override
        public TsNotificationReceiveQuery readTimeLessEqual(Timestamp readTimeLessEqual){
            if(readTimeLessEqual != null){
                this.readTime_LE = readTimeLessEqual;
            }
            return this;
        }


	
}