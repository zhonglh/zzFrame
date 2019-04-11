package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsNotificationEntity;
import com.zz.bms.system.query.TsNotificationQuery;

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
* @date 2019-4-11 14:06:14
*/
public class TsNotificationQueryImpl<PK extends Serializable> extends TsNotificationAbstractQueryImpl<PK> implements TsNotificationQuery<PK>, Serializable  {

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


        @Override
        public TsNotificationQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsNotificationQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsNotificationQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsNotificationQuery notifyModule(String notifyModule) {
            if(!IdUtils.isEmpty(notifyModule)){
                this.notifyModule = notifyModule;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyModuleNot(String notifyModuleNot) {
            if(!IdUtils.isEmpty(notifyModuleNot)){
                this.notifyModule_NE = notifyModuleNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyModuleLike(String notifyModuleLike) {
            if(!IdUtils.isEmpty(notifyModuleLike)){
                this.notifyModule_LIKE = notifyModuleLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyModuleNotLike(String notifyModuleNotLike) {
            if(!IdUtils.isEmpty(notifyModuleNotLike)){
                this.notifyModule_NOTLIKE = notifyModuleNotLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyModuleIn(String notifyModuleIn) {
            if(!IdUtils.isEmpty(notifyModuleIn)){
                if(this.notifyModule_IN == null){
                    this.notifyModule_IN = new ArrayList<String>();
                }
                this.notifyModule_IN.add( notifyModuleIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyModuleNotIn(String notifyModuleNotIn) {
            if(!IdUtils.isEmpty(notifyModuleNotIn)){
                if(this.notifyModule_NOTIN == null){
                    this.notifyModule_NOTIN = new ArrayList<String>();
                }
                this.notifyModule_NOTIN.add( notifyModuleNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyModuleIsNull() {
            this.isNulls.add("notifyModule");
            return this;
        }

        @Override
        public TsNotificationQuery notifyModuleIsNotNull() {
            this.isNotNulls.add("notifyModule");
            return this;
        }



        @Override
        public TsNotificationQuery title(String title) {
            if(!IdUtils.isEmpty(title)){
                this.title = title;
            }
            return this;
        }

        @Override
        public TsNotificationQuery titleNot(String titleNot) {
            if(!IdUtils.isEmpty(titleNot)){
                this.title_NE = titleNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery titleLike(String titleLike) {
            if(!IdUtils.isEmpty(titleLike)){
                this.title_LIKE = titleLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery titleNotLike(String titleNotLike) {
            if(!IdUtils.isEmpty(titleNotLike)){
                this.title_NOTLIKE = titleNotLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery titleIn(String titleIn) {
            if(!IdUtils.isEmpty(titleIn)){
                if(this.title_IN == null){
                    this.title_IN = new ArrayList<String>();
                }
                this.title_IN.add( titleIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery titleNotIn(String titleNotIn) {
            if(!IdUtils.isEmpty(titleNotIn)){
                if(this.title_NOTIN == null){
                    this.title_NOTIN = new ArrayList<String>();
                }
                this.title_NOTIN.add( titleNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery titleIsNull() {
            this.isNulls.add("title");
            return this;
        }

        @Override
        public TsNotificationQuery titleIsNotNull() {
            this.isNotNulls.add("title");
            return this;
        }



        //todo TEXT content;
        @Override
        public TsNotificationQuery notifyTime(Timestamp notifyTime) {
            if(!IdUtils.isEmpty(notifyTime)){
                this.notifyTime = notifyTime;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyTimeNot(Timestamp notifyTimeNot) {
            if(!IdUtils.isEmpty(notifyTimeNot)){
                this.notifyTime_NE = notifyTimeNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyTimeGreaterThan(Timestamp notifyTimeGreaterThan){
            if(notifyTimeGreaterThan != null){
                this.notifyTime_GT = notifyTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsNotificationQuery notifyTimeGreaterEqual(Timestamp notifyTimeGreaterEqual){
            if(notifyTimeGreaterEqual != null){
                this.notifyTime_GE = notifyTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyTimeLessThan(Timestamp notifyTimeLessThan){
            if(notifyTimeLessThan != null){
                this.notifyTime_LT = notifyTimeLessThan;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyTimeLessEqual(Timestamp notifyTimeLessEqual){
            if(notifyTimeLessEqual != null){
                this.notifyTime_LE = notifyTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsNotificationQuery notifyFiles(String notifyFiles) {
            if(!IdUtils.isEmpty(notifyFiles)){
                this.notifyFiles = notifyFiles;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyFilesNot(String notifyFilesNot) {
            if(!IdUtils.isEmpty(notifyFilesNot)){
                this.notifyFiles_NE = notifyFilesNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyFilesLike(String notifyFilesLike) {
            if(!IdUtils.isEmpty(notifyFilesLike)){
                this.notifyFiles_LIKE = notifyFilesLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyFilesNotLike(String notifyFilesNotLike) {
            if(!IdUtils.isEmpty(notifyFilesNotLike)){
                this.notifyFiles_NOTLIKE = notifyFilesNotLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyFilesIn(String notifyFilesIn) {
            if(!IdUtils.isEmpty(notifyFilesIn)){
                if(this.notifyFiles_IN == null){
                    this.notifyFiles_IN = new ArrayList<String>();
                }
                this.notifyFiles_IN.add( notifyFilesIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyFilesNotIn(String notifyFilesNotIn) {
            if(!IdUtils.isEmpty(notifyFilesNotIn)){
                if(this.notifyFiles_NOTIN == null){
                    this.notifyFiles_NOTIN = new ArrayList<String>();
                }
                this.notifyFiles_NOTIN.add( notifyFilesNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery notifyFilesIsNull() {
            this.isNulls.add("notifyFiles");
            return this;
        }

        @Override
        public TsNotificationQuery notifyFilesIsNotNull() {
            this.isNotNulls.add("notifyFiles");
            return this;
        }



        @Override
        public TsNotificationQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsNotificationQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsNotificationQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsNotificationQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsNotificationQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsNotificationQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsNotificationQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsNotificationQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsNotificationQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsNotificationQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsNotificationQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsNotificationQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsNotificationQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsNotificationQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsNotificationQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsNotificationQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsNotificationQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsNotificationQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsNotificationQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public TsNotificationQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsNotificationQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsNotificationQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TsNotificationQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsNotificationQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsNotificationQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}