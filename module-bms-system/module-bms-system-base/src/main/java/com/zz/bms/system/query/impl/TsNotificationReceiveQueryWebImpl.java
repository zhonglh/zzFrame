package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;

/**
* 通知接收人 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:17
*/
public class TsNotificationReceiveQueryWebImpl<PK extends Serializable> extends TsNotificationReceiveAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String notifyId_IN;
            private String notifyId_NOTIN;


            private PK receiveUserId_IN;
            private PK receiveUserId_NOTIN;



            private String isRead_IN;
            private String isRead_NOTIN;





        //todo TIMESTAMP readTime;




            public PK getId() {
                return id;
            }

            public void setId(PK id) {
                this.id = id;
            }

            public PK getId_NE() {
                return id_NE;
            }

            public void setId_NE(PK id_NE) {
                this.id_NE = id_NE;
            }

            public PK getId_IN() {
                return id_IN;
            }

            public void setId_IN(PK id_IN) {
                this.id_IN = id_IN;
            }

            public PK getId_NOTIN() {
                return id_NOTIN;
            }

            public void setId_NOTIN(PK id_NOTIN) {
                this.id_NOTIN = id_NOTIN;
            }



            public String getNotifyId() {
                return notifyId;
            }

            public void setNotifyId(String notifyId) {
                this.notifyId = notifyId;
            }

            public String getNotifyId_NE() {
                return notifyId_NE;
            }

            public void setNotifyId_NE(String notifyId_NE) {
                this.notifyId_NE = notifyId_NE;
            }

            public String getNotifyId_IN() {
                return notifyId_IN;
            }

            public void setNotifyId_IN(String notifyId_IN) {
                this.notifyId_IN = notifyId_IN;
            }

            public String getNotifyId_NOTIN() {
                return notifyId_NOTIN;
            }

            public void setNotifyId_NOTIN(String notifyId_NOTIN) {
                this.notifyId_NOTIN = notifyId_NOTIN;
            }

            public String getNotifyId_LIKE() {
                return notifyId_LIKE;
            }

            public void setNotifyId_LIKE(String notifyId_LIKE) {
                this.notifyId_LIKE = notifyId_LIKE;
            }

            public String getNotifyId_NOTLIKE() {
                return notifyId_NOTLIKE;
            }

            public void setNotifyId_NOTLIKE(String notifyId_NOTLIKE) {
                this.notifyId_NOTLIKE = notifyId_NOTLIKE;
            }

            public PK getReceiveUserId() {
                return receiveUserId;
            }

            public void setReceiveUserId(PK receiveUserId) {
                this.receiveUserId = receiveUserId;
            }

            public PK getReceiveUserId_NE() {
                return receiveUserId_NE;
            }

            public void setReceiveUserId_NE(PK receiveUserId_NE) {
                this.receiveUserId_NE = receiveUserId_NE;
            }

            public PK getReceiveUserId_IN() {
                return receiveUserId_IN;
            }

            public void setReceiveUserId_IN(PK receiveUserId_IN) {
                this.receiveUserId_IN = receiveUserId_IN;
            }

            public PK getReceiveUserId_NOTIN() {
                return receiveUserId_NOTIN;
            }

            public void setReceiveUserId_NOTIN(PK receiveUserId_NOTIN) {
                this.receiveUserId_NOTIN = receiveUserId_NOTIN;
            }


            public String getIsRead() {
                return isRead;
            }

            public void setIsRead(String isRead) {
                this.isRead = isRead;
            }

            public String getIsRead_NE() {
                return isRead_NE;
            }

            public void setIsRead_NE(String isRead_NE) {
                this.isRead_NE = isRead_NE;
            }

            public String getIsRead_IN() {
                return isRead_IN;
            }

            public void setIsRead_IN(String isRead_IN) {
                this.isRead_IN = isRead_IN;
            }

            public String getIsRead_NOTIN() {
                return isRead_NOTIN;
            }

            public void setIsRead_NOTIN(String isRead_NOTIN) {
                this.isRead_NOTIN = isRead_NOTIN;
            }


            public Timestamp getReadTime() {
                return readTime;
            }

            public void setReadTime(Timestamp readTime) {
                this.readTime = readTime;
            }

            public Timestamp getReadTime_NE() {
                return readTime_NE;
            }

            public void setReadTime_NE(Timestamp readTime_NE) {
                this.readTime_NE = readTime_NE;
            }

            public Timestamp getReadTime_GT() {
                return readTime_GT;
            }

            public void setReadTime_GT(Timestamp readTime_GT) {
                this.readTime_GT = readTime_GT;
            }

            public Timestamp getReadTime_GE() {
                return readTime_GE;
            }

            public void setReadTime_GE(Timestamp readTime_GE) {
                this.readTime_GE = readTime_GE;
            }

            public Timestamp getReadTime_LT() {
                return readTime_LT;
            }

            public void setReadTime_LT(Timestamp readTime_LT) {
                this.readTime_LT = readTime_LT;
            }

            public Timestamp getReadTime_LE() {
                return readTime_LE;
            }

            public void setReadTime_LE(Timestamp readTime_LE) {
                this.readTime_LE = readTime_LE;
            }
}