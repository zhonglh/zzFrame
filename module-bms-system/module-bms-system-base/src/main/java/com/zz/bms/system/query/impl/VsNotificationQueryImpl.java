package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.VsNotificationEntity;
import com.zz.bms.system.query.VsNotificationQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 系统通知 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-6-8 22:01:58
*/
public class VsNotificationQueryImpl<PK extends Serializable> extends VsNotificationAbstractQueryImpl<PK> implements VsNotificationQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> notifyModule_IN;
        private List<String> notifyModule_NOTIN;

        private List<String> title_IN;
        private List<String> title_NOTIN;

        //todo TEXT content;

        private List<String> notifyFiles_IN;
        private List<String> notifyFiles_NOTIN;

        private List<String> createUserId_IN;
        private List<String> createUserId_NOTIN;

        private List<String> createUserName_IN;
        private List<String> createUserName_NOTIN;

        private List<String> updateUserId_IN;
        private List<String> updateUserId_NOTIN;

        private List<String> updateUserName_IN;
        private List<String> updateUserName_NOTIN;

        private List<String> tenantId_IN;
        private List<String> tenantId_NOTIN;
        private List<PK> receiveUserId_IN;
        private List<PK> receiveUserId_NOTIN;

        private List<String> isRead_IN;
        private List<String> isRead_NOTIN;


        private List<String> sendName_IN;
        private List<String> sendName_NOTIN;

        private List<String> receiveName_IN;
        private List<String> receiveName_NOTIN;


        @Override
        public VsNotificationQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public VsNotificationQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public VsNotificationQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public VsNotificationQuery notifyModule(String notifyModule) {
            if(!IdUtils.isEmpty(notifyModule)){
                this.notifyModule = notifyModule;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyModuleNot(String notifyModuleNot) {
            if(!IdUtils.isEmpty(notifyModuleNot)){
                this.notifyModule_NE = notifyModuleNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyModuleLike(String notifyModuleLike) {
            if(!IdUtils.isEmpty(notifyModuleLike)){
                this.notifyModule_LIKE = notifyModuleLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyModuleNotLike(String notifyModuleNotLike) {
            if(!IdUtils.isEmpty(notifyModuleNotLike)){
                this.notifyModule_NOTLIKE = notifyModuleNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyModuleIn(String notifyModuleIn) {
            if(!IdUtils.isEmpty(notifyModuleIn)){
                if(this.notifyModule_IN == null){
                    this.notifyModule_IN = new ArrayList<String>();
                }
                this.notifyModule_IN.add( notifyModuleIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyModuleNotIn(String notifyModuleNotIn) {
            if(!IdUtils.isEmpty(notifyModuleNotIn)){
                if(this.notifyModule_NOTIN == null){
                    this.notifyModule_NOTIN = new ArrayList<String>();
                }
                this.notifyModule_NOTIN.add( notifyModuleNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyModuleIsNull() {
            this.isNulls.add("notifyModule");
            return this;
        }

        @Override
        public VsNotificationQuery notifyModuleIsNotNull() {
            this.isNotNulls.add("notifyModule");
            return this;
        }



        @Override
        public VsNotificationQuery title(String title) {
            if(!IdUtils.isEmpty(title)){
                this.title = title;
            }
            return this;
        }

        @Override
        public VsNotificationQuery titleNot(String titleNot) {
            if(!IdUtils.isEmpty(titleNot)){
                this.title_NE = titleNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery titleLike(String titleLike) {
            if(!IdUtils.isEmpty(titleLike)){
                this.title_LIKE = titleLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery titleNotLike(String titleNotLike) {
            if(!IdUtils.isEmpty(titleNotLike)){
                this.title_NOTLIKE = titleNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery titleIn(String titleIn) {
            if(!IdUtils.isEmpty(titleIn)){
                if(this.title_IN == null){
                    this.title_IN = new ArrayList<String>();
                }
                this.title_IN.add( titleIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery titleNotIn(String titleNotIn) {
            if(!IdUtils.isEmpty(titleNotIn)){
                if(this.title_NOTIN == null){
                    this.title_NOTIN = new ArrayList<String>();
                }
                this.title_NOTIN.add( titleNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery titleIsNull() {
            this.isNulls.add("title");
            return this;
        }

        @Override
        public VsNotificationQuery titleIsNotNull() {
            this.isNotNulls.add("title");
            return this;
        }



        //todo TEXT content;
        @Override
        public VsNotificationQuery notifyTime(Timestamp notifyTime) {
            if(!IdUtils.isEmpty(notifyTime)){
                this.notifyTime = notifyTime;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyTimeNot(Timestamp notifyTimeNot) {
            if(!IdUtils.isEmpty(notifyTimeNot)){
                this.notifyTime_NE = notifyTimeNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyTimeGreaterThan(Timestamp notifyTimeGreaterThan){
            if(notifyTimeGreaterThan != null){
                this.notifyTime_GT = notifyTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsNotificationQuery notifyTimeGreaterEqual(Timestamp notifyTimeGreaterEqual){
            if(notifyTimeGreaterEqual != null){
                this.notifyTime_GE = notifyTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyTimeLessThan(Timestamp notifyTimeLessThan){
            if(notifyTimeLessThan != null){
                this.notifyTime_LT = notifyTimeLessThan;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyTimeLessEqual(Timestamp notifyTimeLessEqual){
            if(notifyTimeLessEqual != null){
                this.notifyTime_LE = notifyTimeLessEqual;
            }
            return this;
        }


        @Override
        public VsNotificationQuery notifyFiles(String notifyFiles) {
            if(!IdUtils.isEmpty(notifyFiles)){
                this.notifyFiles = notifyFiles;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyFilesNot(String notifyFilesNot) {
            if(!IdUtils.isEmpty(notifyFilesNot)){
                this.notifyFiles_NE = notifyFilesNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyFilesLike(String notifyFilesLike) {
            if(!IdUtils.isEmpty(notifyFilesLike)){
                this.notifyFiles_LIKE = notifyFilesLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyFilesNotLike(String notifyFilesNotLike) {
            if(!IdUtils.isEmpty(notifyFilesNotLike)){
                this.notifyFiles_NOTLIKE = notifyFilesNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyFilesIn(String notifyFilesIn) {
            if(!IdUtils.isEmpty(notifyFilesIn)){
                if(this.notifyFiles_IN == null){
                    this.notifyFiles_IN = new ArrayList<String>();
                }
                this.notifyFiles_IN.add( notifyFilesIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyFilesNotIn(String notifyFilesNotIn) {
            if(!IdUtils.isEmpty(notifyFilesNotIn)){
                if(this.notifyFiles_NOTIN == null){
                    this.notifyFiles_NOTIN = new ArrayList<String>();
                }
                this.notifyFiles_NOTIN.add( notifyFilesNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery notifyFilesIsNull() {
            this.isNulls.add("notifyFiles");
            return this;
        }

        @Override
        public VsNotificationQuery notifyFilesIsNotNull() {
            this.isNotNulls.add("notifyFiles");
            return this;
        }



        @Override
        public VsNotificationQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public VsNotificationQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public VsNotificationQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public VsNotificationQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public VsNotificationQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsNotificationQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public VsNotificationQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public VsNotificationQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public VsNotificationQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public VsNotificationQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public VsNotificationQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public VsNotificationQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsNotificationQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public VsNotificationQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public VsNotificationQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public VsNotificationQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public VsNotificationQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public VsNotificationQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public VsNotificationQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public VsNotificationQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public VsNotificationQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public VsNotificationQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }


        @Override
        public VsNotificationQuery receiveUserId(PK receiveUserId) {
            if(!IdUtils.isEmpty(receiveUserId)){
                this.receiveUserId = receiveUserId;
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveUserIdNot(PK receiveUserIdNot) {
            if(!IdUtils.isEmpty(receiveUserIdNot)){
                this.receiveUserId_NE = receiveUserIdNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveUserIdIn(PK receiveUserIdIn) {
            if(!IdUtils.isEmpty(receiveUserIdIn)){
                if(this.receiveUserId_IN == null){
                    this.receiveUserId_IN = new ArrayList<PK>();
                }
                this.receiveUserId_IN.add( receiveUserIdIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveUserIdNotIn(PK receiveUserIdNotIn) {
            if(!IdUtils.isEmpty(receiveUserIdNotIn)){
                if(this.receiveUserId_NOTIN == null){
                    this.receiveUserId_NOTIN = new ArrayList<PK>();
                }
                this.receiveUserId_NOTIN.add( receiveUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveUserIdIsNull() {
            this.isNulls.add("receiveUserId");
            return this;
        }

        @Override
        public VsNotificationQuery receiveUserIdIsNotNull() {
            this.isNotNulls.add("receiveUserId");
            return this;
        }


        @Override
        public VsNotificationQuery readTime(Timestamp readTime) {
            if(!IdUtils.isEmpty(readTime)){
                this.readTime = readTime;
            }
            return this;
        }

        @Override
        public VsNotificationQuery readTimeNot(Timestamp readTimeNot) {
            if(!IdUtils.isEmpty(readTimeNot)){
                this.readTime_NE = readTimeNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery readTimeGreaterThan(Timestamp readTimeGreaterThan){
            if(readTimeGreaterThan != null){
                this.readTime_GT = readTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsNotificationQuery readTimeGreaterEqual(Timestamp readTimeGreaterEqual){
            if(readTimeGreaterEqual != null){
                this.readTime_GE = readTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsNotificationQuery readTimeLessThan(Timestamp readTimeLessThan){
            if(readTimeLessThan != null){
                this.readTime_LT = readTimeLessThan;
            }
            return this;
        }

        @Override
        public VsNotificationQuery readTimeLessEqual(Timestamp readTimeLessEqual){
            if(readTimeLessEqual != null){
                this.readTime_LE = readTimeLessEqual;
            }
            return this;
        }

        @Override
        public VsNotificationQuery isRead(String isRead) {
            if(!IdUtils.isEmpty(isRead)){
                this.isRead = isRead;
            }
            return this;
        }

        @Override
        public VsNotificationQuery isReadNot(String isReadNot) {
            if(!IdUtils.isEmpty(isReadNot)){
                this.isRead_NE = isReadNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery isReadIn(String isReadIn) {
            if(!IdUtils.isEmpty(isReadIn)){
                if(this.isRead_IN == null){
                    this.isRead_IN = new ArrayList<String>();
                }
                this.isRead_IN.add( isReadIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery isReadNotIn(String isReadNotIn) {
            if(!IdUtils.isEmpty(isReadNotIn)){
                if(this.isRead_NOTIN == null){
                    this.isRead_NOTIN = new ArrayList<String>();
                }
                this.isRead_NOTIN.add( isReadNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery isReadIsNull() {
            this.isNulls.add("isRead");
            return this;
        }

        @Override
        public VsNotificationQuery isReadIsNotNull() {
            this.isNotNulls.add("isRead");
            return this;
        }



        @Override
        public VsNotificationQuery sendName(String sendName) {
            if(!IdUtils.isEmpty(sendName)){
                this.sendName = sendName;
            }
            return this;
        }

        @Override
        public VsNotificationQuery sendNameNot(String sendNameNot) {
            if(!IdUtils.isEmpty(sendNameNot)){
                this.sendName_NE = sendNameNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery sendNameLike(String sendNameLike) {
            if(!IdUtils.isEmpty(sendNameLike)){
                this.sendName_LIKE = sendNameLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery sendNameNotLike(String sendNameNotLike) {
            if(!IdUtils.isEmpty(sendNameNotLike)){
                this.sendName_NOTLIKE = sendNameNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery sendNameIn(String sendNameIn) {
            if(!IdUtils.isEmpty(sendNameIn)){
                if(this.sendName_IN == null){
                    this.sendName_IN = new ArrayList<String>();
                }
                this.sendName_IN.add( sendNameIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery sendNameNotIn(String sendNameNotIn) {
            if(!IdUtils.isEmpty(sendNameNotIn)){
                if(this.sendName_NOTIN == null){
                    this.sendName_NOTIN = new ArrayList<String>();
                }
                this.sendName_NOTIN.add( sendNameNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery sendNameIsNull() {
            this.isNulls.add("sendName");
            return this;
        }

        @Override
        public VsNotificationQuery sendNameIsNotNull() {
            this.isNotNulls.add("sendName");
            return this;
        }



        @Override
        public VsNotificationQuery receiveName(String receiveName) {
            if(!IdUtils.isEmpty(receiveName)){
                this.receiveName = receiveName;
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveNameNot(String receiveNameNot) {
            if(!IdUtils.isEmpty(receiveNameNot)){
                this.receiveName_NE = receiveNameNot;
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveNameLike(String receiveNameLike) {
            if(!IdUtils.isEmpty(receiveNameLike)){
                this.receiveName_LIKE = receiveNameLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveNameNotLike(String receiveNameNotLike) {
            if(!IdUtils.isEmpty(receiveNameNotLike)){
                this.receiveName_NOTLIKE = receiveNameNotLike;
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveNameIn(String receiveNameIn) {
            if(!IdUtils.isEmpty(receiveNameIn)){
                if(this.receiveName_IN == null){
                    this.receiveName_IN = new ArrayList<String>();
                }
                this.receiveName_IN.add( receiveNameIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveNameNotIn(String receiveNameNotIn) {
            if(!IdUtils.isEmpty(receiveNameNotIn)){
                if(this.receiveName_NOTIN == null){
                    this.receiveName_NOTIN = new ArrayList<String>();
                }
                this.receiveName_NOTIN.add( receiveNameNotIn );
            }
            return this;
        }

        @Override
        public VsNotificationQuery receiveNameIsNull() {
            this.isNulls.add("receiveName");
            return this;
        }

        @Override
        public VsNotificationQuery receiveNameIsNotNull() {
            this.isNotNulls.add("receiveName");
            return this;
        }



	
}