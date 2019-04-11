package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsMsgTempletEntity;
import com.zz.bms.system.query.TsMsgTempletQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 消息模板 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:19
*/
public class TsMsgTempletQueryImpl<PK extends Serializable> extends TsMsgTempletAbstractQueryImpl<PK> implements TsMsgTempletQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> msgTempletName_IN;
        private List<String> msgTempletName_NOTIN;
        private List<String> msgTempletType_IN;
        private List<String> msgTempletType_NOTIN;


        private List<String> msgTitle_IN;
        private List<String> msgTitle_NOTIN;

        private List<String> msgContent_IN;
        private List<String> msgContent_NOTIN;
        private List<String> msgLanguage_IN;
        private List<String> msgLanguage_NOTIN;

        private List<String> templetEffective_IN;
        private List<String> templetEffective_NOTIN;

        private List<PK> depId_IN;
        private List<PK> depId_NOTIN;


        private List<String> organId_IN;
        private List<String> organId_NOTIN;

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
        public TsMsgTempletQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsMsgTempletQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsMsgTempletQuery msgTempletName(String msgTempletName) {
            if(!IdUtils.isEmpty(msgTempletName)){
                this.msgTempletName = msgTempletName;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletNameNot(String msgTempletNameNot) {
            if(!IdUtils.isEmpty(msgTempletNameNot)){
                this.msgTempletName_NE = msgTempletNameNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletNameLike(String msgTempletNameLike) {
            if(!IdUtils.isEmpty(msgTempletNameLike)){
                this.msgTempletName_LIKE = msgTempletNameLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletNameNotLike(String msgTempletNameNotLike) {
            if(!IdUtils.isEmpty(msgTempletNameNotLike)){
                this.msgTempletName_NOTLIKE = msgTempletNameNotLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletNameIn(String msgTempletNameIn) {
            if(!IdUtils.isEmpty(msgTempletNameIn)){
                if(this.msgTempletName_IN == null){
                    this.msgTempletName_IN = new ArrayList<String>();
                }
                this.msgTempletName_IN.add( msgTempletNameIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletNameNotIn(String msgTempletNameNotIn) {
            if(!IdUtils.isEmpty(msgTempletNameNotIn)){
                if(this.msgTempletName_NOTIN == null){
                    this.msgTempletName_NOTIN = new ArrayList<String>();
                }
                this.msgTempletName_NOTIN.add( msgTempletNameNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletNameIsNull() {
            this.isNulls.add("msgTempletName");
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletNameIsNotNull() {
            this.isNotNulls.add("msgTempletName");
            return this;
        }


        @Override
        public TsMsgTempletQuery msgTempletType(String msgTempletType) {
            if(!IdUtils.isEmpty(msgTempletType)){
                this.msgTempletType = msgTempletType;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletTypeNot(String msgTempletTypeNot) {
            if(!IdUtils.isEmpty(msgTempletTypeNot)){
                this.msgTempletType_NE = msgTempletTypeNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletTypeIn(String msgTempletTypeIn) {
            if(!IdUtils.isEmpty(msgTempletTypeIn)){
                if(this.msgTempletType_IN == null){
                    this.msgTempletType_IN = new ArrayList<String>();
                }
                this.msgTempletType_IN.add( msgTempletTypeIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletTypeNotIn(String msgTempletTypeNotIn) {
            if(!IdUtils.isEmpty(msgTempletTypeNotIn)){
                if(this.msgTempletType_NOTIN == null){
                    this.msgTempletType_NOTIN = new ArrayList<String>();
                }
                this.msgTempletType_NOTIN.add( msgTempletTypeNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletTypeIsNull() {
            this.isNulls.add("msgTempletType");
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTempletTypeIsNotNull() {
            this.isNotNulls.add("msgTempletType");
            return this;
        }



        @Override
        public TsMsgTempletQuery msgTitle(String msgTitle) {
            if(!IdUtils.isEmpty(msgTitle)){
                this.msgTitle = msgTitle;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTitleNot(String msgTitleNot) {
            if(!IdUtils.isEmpty(msgTitleNot)){
                this.msgTitle_NE = msgTitleNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTitleLike(String msgTitleLike) {
            if(!IdUtils.isEmpty(msgTitleLike)){
                this.msgTitle_LIKE = msgTitleLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTitleNotLike(String msgTitleNotLike) {
            if(!IdUtils.isEmpty(msgTitleNotLike)){
                this.msgTitle_NOTLIKE = msgTitleNotLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTitleIn(String msgTitleIn) {
            if(!IdUtils.isEmpty(msgTitleIn)){
                if(this.msgTitle_IN == null){
                    this.msgTitle_IN = new ArrayList<String>();
                }
                this.msgTitle_IN.add( msgTitleIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTitleNotIn(String msgTitleNotIn) {
            if(!IdUtils.isEmpty(msgTitleNotIn)){
                if(this.msgTitle_NOTIN == null){
                    this.msgTitle_NOTIN = new ArrayList<String>();
                }
                this.msgTitle_NOTIN.add( msgTitleNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTitleIsNull() {
            this.isNulls.add("msgTitle");
            return this;
        }

        @Override
        public TsMsgTempletQuery msgTitleIsNotNull() {
            this.isNotNulls.add("msgTitle");
            return this;
        }



        @Override
        public TsMsgTempletQuery msgContent(String msgContent) {
            if(!IdUtils.isEmpty(msgContent)){
                this.msgContent = msgContent;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgContentNot(String msgContentNot) {
            if(!IdUtils.isEmpty(msgContentNot)){
                this.msgContent_NE = msgContentNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgContentLike(String msgContentLike) {
            if(!IdUtils.isEmpty(msgContentLike)){
                this.msgContent_LIKE = msgContentLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgContentNotLike(String msgContentNotLike) {
            if(!IdUtils.isEmpty(msgContentNotLike)){
                this.msgContent_NOTLIKE = msgContentNotLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgContentIn(String msgContentIn) {
            if(!IdUtils.isEmpty(msgContentIn)){
                if(this.msgContent_IN == null){
                    this.msgContent_IN = new ArrayList<String>();
                }
                this.msgContent_IN.add( msgContentIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgContentNotIn(String msgContentNotIn) {
            if(!IdUtils.isEmpty(msgContentNotIn)){
                if(this.msgContent_NOTIN == null){
                    this.msgContent_NOTIN = new ArrayList<String>();
                }
                this.msgContent_NOTIN.add( msgContentNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgContentIsNull() {
            this.isNulls.add("msgContent");
            return this;
        }

        @Override
        public TsMsgTempletQuery msgContentIsNotNull() {
            this.isNotNulls.add("msgContent");
            return this;
        }


        @Override
        public TsMsgTempletQuery msgLanguage(String msgLanguage) {
            if(!IdUtils.isEmpty(msgLanguage)){
                this.msgLanguage = msgLanguage;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgLanguageNot(String msgLanguageNot) {
            if(!IdUtils.isEmpty(msgLanguageNot)){
                this.msgLanguage_NE = msgLanguageNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgLanguageIn(String msgLanguageIn) {
            if(!IdUtils.isEmpty(msgLanguageIn)){
                if(this.msgLanguage_IN == null){
                    this.msgLanguage_IN = new ArrayList<String>();
                }
                this.msgLanguage_IN.add( msgLanguageIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgLanguageNotIn(String msgLanguageNotIn) {
            if(!IdUtils.isEmpty(msgLanguageNotIn)){
                if(this.msgLanguage_NOTIN == null){
                    this.msgLanguage_NOTIN = new ArrayList<String>();
                }
                this.msgLanguage_NOTIN.add( msgLanguageNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery msgLanguageIsNull() {
            this.isNulls.add("msgLanguage");
            return this;
        }

        @Override
        public TsMsgTempletQuery msgLanguageIsNotNull() {
            this.isNotNulls.add("msgLanguage");
            return this;
        }


        @Override
        public TsMsgTempletQuery templetEffective(String templetEffective) {
            if(!IdUtils.isEmpty(templetEffective)){
                this.templetEffective = templetEffective;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery templetEffectiveNot(String templetEffectiveNot) {
            if(!IdUtils.isEmpty(templetEffectiveNot)){
                this.templetEffective_NE = templetEffectiveNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery templetEffectiveIn(String templetEffectiveIn) {
            if(!IdUtils.isEmpty(templetEffectiveIn)){
                if(this.templetEffective_IN == null){
                    this.templetEffective_IN = new ArrayList<String>();
                }
                this.templetEffective_IN.add( templetEffectiveIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery templetEffectiveNotIn(String templetEffectiveNotIn) {
            if(!IdUtils.isEmpty(templetEffectiveNotIn)){
                if(this.templetEffective_NOTIN == null){
                    this.templetEffective_NOTIN = new ArrayList<String>();
                }
                this.templetEffective_NOTIN.add( templetEffectiveNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery templetEffectiveIsNull() {
            this.isNulls.add("templetEffective");
            return this;
        }

        @Override
        public TsMsgTempletQuery templetEffectiveIsNotNull() {
            this.isNotNulls.add("templetEffective");
            return this;
        }


        @Override
        public TsMsgTempletQuery depId(PK depId) {
            if(!IdUtils.isEmpty(depId)){
                this.depId = depId;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery depIdNot(PK depIdNot) {
            if(!IdUtils.isEmpty(depIdNot)){
                this.depId_NE = depIdNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery depIdIn(PK depIdIn) {
            if(!IdUtils.isEmpty(depIdIn)){
                if(this.depId_IN == null){
                    this.depId_IN = new ArrayList<PK>();
                }
                this.depId_IN.add( depIdIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery depIdNotIn(PK depIdNotIn) {
            if(!IdUtils.isEmpty(depIdNotIn)){
                if(this.depId_NOTIN == null){
                    this.depId_NOTIN = new ArrayList<PK>();
                }
                this.depId_NOTIN.add( depIdNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery depIdIsNull() {
            this.isNulls.add("depId");
            return this;
        }

        @Override
        public TsMsgTempletQuery depIdIsNotNull() {
            this.isNotNulls.add("depId");
            return this;
        }



        @Override
        public TsMsgTempletQuery organId(String organId) {
            if(!IdUtils.isEmpty(organId)){
                this.organId = organId;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery organIdNot(String organIdNot) {
            if(!IdUtils.isEmpty(organIdNot)){
                this.organId_NE = organIdNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery organIdLike(String organIdLike) {
            if(!IdUtils.isEmpty(organIdLike)){
                this.organId_LIKE = organIdLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery organIdNotLike(String organIdNotLike) {
            if(!IdUtils.isEmpty(organIdNotLike)){
                this.organId_NOTLIKE = organIdNotLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery organIdIn(String organIdIn) {
            if(!IdUtils.isEmpty(organIdIn)){
                if(this.organId_IN == null){
                    this.organId_IN = new ArrayList<String>();
                }
                this.organId_IN.add( organIdIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery organIdNotIn(String organIdNotIn) {
            if(!IdUtils.isEmpty(organIdNotIn)){
                if(this.organId_NOTIN == null){
                    this.organId_NOTIN = new ArrayList<String>();
                }
                this.organId_NOTIN.add( organIdNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery organIdIsNull() {
            this.isNulls.add("organId");
            return this;
        }

        @Override
        public TsMsgTempletQuery organIdIsNotNull() {
            this.isNotNulls.add("organId");
            return this;
        }



        @Override
        public TsMsgTempletQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsMsgTempletQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsMsgTempletQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsMsgTempletQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsMsgTempletQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsMsgTempletQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsMsgTempletQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsMsgTempletQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsMsgTempletQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsMsgTempletQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public TsMsgTempletQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsMsgTempletQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsMsgTempletQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}