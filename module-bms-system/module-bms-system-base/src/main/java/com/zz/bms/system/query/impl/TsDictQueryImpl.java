package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsDictEntity;
import com.zz.bms.system.query.TsDictQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 字典信息 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:15
*/
public class TsDictQueryImpl<PK extends Serializable> extends TsDictAbstractQueryImpl<PK> implements TsDictQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> dictTypeId_IN;
        private List<PK> dictTypeId_NOTIN;

        private List<String> dictVal_IN;
        private List<String> dictVal_NOTIN;


        private List<String> dictName_IN;
        private List<String> dictName_NOTIN;

        private List<String> dictI18n_IN;
        private List<String> dictI18n_NOTIN;

        private List<String> dictReg_IN;
        private List<String> dictReg_NOTIN;

        private List<String> createUserId_IN;
        private List<String> createUserId_NOTIN;

        private List<String> createUserName_IN;
        private List<String> createUserName_NOTIN;

        private List<String> updateUserId_IN;
        private List<String> updateUserId_NOTIN;

        private List<String> updateUserName_IN;
        private List<String> updateUserName_NOTIN;

        private List<String> deleteFlag_IN;
        private List<String> deleteFlag_NOTIN;

        private List<String> tenantId_IN;
        private List<String> tenantId_NOTIN;


        @Override
        public TsDictQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsDictQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsDictQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsDictQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsDictQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TsDictQuery dictTypeId(PK dictTypeId) {
            if(!IdUtils.isEmpty(dictTypeId)){
                this.dictTypeId = dictTypeId;
            }
            return this;
        }

        @Override
        public TsDictQuery dictTypeIdNot(PK dictTypeIdNot) {
            if(!IdUtils.isEmpty(dictTypeIdNot)){
                this.dictTypeId_NE = dictTypeIdNot;
            }
            return this;
        }

        @Override
        public TsDictQuery dictTypeIdIn(PK dictTypeIdIn) {
            if(!IdUtils.isEmpty(dictTypeIdIn)){
                if(this.dictTypeId_IN == null){
                    this.dictTypeId_IN = new ArrayList<PK>();
                }
                this.dictTypeId_IN.add( dictTypeIdIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictTypeIdNotIn(PK dictTypeIdNotIn) {
            if(!IdUtils.isEmpty(dictTypeIdNotIn)){
                if(this.dictTypeId_NOTIN == null){
                    this.dictTypeId_NOTIN = new ArrayList<PK>();
                }
                this.dictTypeId_NOTIN.add( dictTypeIdNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictTypeIdIsNull() {
            this.isNulls.add("dictTypeId");
            return this;
        }

        @Override
        public TsDictQuery dictTypeIdIsNotNull() {
            this.isNotNulls.add("dictTypeId");
            return this;
        }


        @Override
        public TsDictQuery dictVal(String dictVal) {
            if(!IdUtils.isEmpty(dictVal)){
                this.dictVal = dictVal;
            }
            return this;
        }

        @Override
        public TsDictQuery dictValNot(String dictValNot) {
            if(!IdUtils.isEmpty(dictValNot)){
                this.dictVal_NE = dictValNot;
            }
            return this;
        }

        @Override
        public TsDictQuery dictValIn(String dictValIn) {
            if(!IdUtils.isEmpty(dictValIn)){
                if(this.dictVal_IN == null){
                    this.dictVal_IN = new ArrayList<String>();
                }
                this.dictVal_IN.add( dictValIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictValNotIn(String dictValNotIn) {
            if(!IdUtils.isEmpty(dictValNotIn)){
                if(this.dictVal_NOTIN == null){
                    this.dictVal_NOTIN = new ArrayList<String>();
                }
                this.dictVal_NOTIN.add( dictValNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictValIsNull() {
            this.isNulls.add("dictVal");
            return this;
        }

        @Override
        public TsDictQuery dictValIsNotNull() {
            this.isNotNulls.add("dictVal");
            return this;
        }



        @Override
        public TsDictQuery dictName(String dictName) {
            if(!IdUtils.isEmpty(dictName)){
                this.dictName = dictName;
            }
            return this;
        }

        @Override
        public TsDictQuery dictNameNot(String dictNameNot) {
            if(!IdUtils.isEmpty(dictNameNot)){
                this.dictName_NE = dictNameNot;
            }
            return this;
        }

        @Override
        public TsDictQuery dictNameLike(String dictNameLike) {
            if(!IdUtils.isEmpty(dictNameLike)){
                this.dictName_LIKE = dictNameLike;
            }
            return this;
        }

        @Override
        public TsDictQuery dictNameNotLike(String dictNameNotLike) {
            if(!IdUtils.isEmpty(dictNameNotLike)){
                this.dictName_NOTLIKE = dictNameNotLike;
            }
            return this;
        }

        @Override
        public TsDictQuery dictNameIn(String dictNameIn) {
            if(!IdUtils.isEmpty(dictNameIn)){
                if(this.dictName_IN == null){
                    this.dictName_IN = new ArrayList<String>();
                }
                this.dictName_IN.add( dictNameIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictNameNotIn(String dictNameNotIn) {
            if(!IdUtils.isEmpty(dictNameNotIn)){
                if(this.dictName_NOTIN == null){
                    this.dictName_NOTIN = new ArrayList<String>();
                }
                this.dictName_NOTIN.add( dictNameNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictNameIsNull() {
            this.isNulls.add("dictName");
            return this;
        }

        @Override
        public TsDictQuery dictNameIsNotNull() {
            this.isNotNulls.add("dictName");
            return this;
        }



        @Override
        public TsDictQuery dictI18n(String dictI18n) {
            if(!IdUtils.isEmpty(dictI18n)){
                this.dictI18n = dictI18n;
            }
            return this;
        }

        @Override
        public TsDictQuery dictI18nNot(String dictI18nNot) {
            if(!IdUtils.isEmpty(dictI18nNot)){
                this.dictI18n_NE = dictI18nNot;
            }
            return this;
        }

        @Override
        public TsDictQuery dictI18nLike(String dictI18nLike) {
            if(!IdUtils.isEmpty(dictI18nLike)){
                this.dictI18n_LIKE = dictI18nLike;
            }
            return this;
        }

        @Override
        public TsDictQuery dictI18nNotLike(String dictI18nNotLike) {
            if(!IdUtils.isEmpty(dictI18nNotLike)){
                this.dictI18n_NOTLIKE = dictI18nNotLike;
            }
            return this;
        }

        @Override
        public TsDictQuery dictI18nIn(String dictI18nIn) {
            if(!IdUtils.isEmpty(dictI18nIn)){
                if(this.dictI18n_IN == null){
                    this.dictI18n_IN = new ArrayList<String>();
                }
                this.dictI18n_IN.add( dictI18nIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictI18nNotIn(String dictI18nNotIn) {
            if(!IdUtils.isEmpty(dictI18nNotIn)){
                if(this.dictI18n_NOTIN == null){
                    this.dictI18n_NOTIN = new ArrayList<String>();
                }
                this.dictI18n_NOTIN.add( dictI18nNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictI18nIsNull() {
            this.isNulls.add("dictI18n");
            return this;
        }

        @Override
        public TsDictQuery dictI18nIsNotNull() {
            this.isNotNulls.add("dictI18n");
            return this;
        }



        @Override
        public TsDictQuery dictReg(String dictReg) {
            if(!IdUtils.isEmpty(dictReg)){
                this.dictReg = dictReg;
            }
            return this;
        }

        @Override
        public TsDictQuery dictRegNot(String dictRegNot) {
            if(!IdUtils.isEmpty(dictRegNot)){
                this.dictReg_NE = dictRegNot;
            }
            return this;
        }

        @Override
        public TsDictQuery dictRegLike(String dictRegLike) {
            if(!IdUtils.isEmpty(dictRegLike)){
                this.dictReg_LIKE = dictRegLike;
            }
            return this;
        }

        @Override
        public TsDictQuery dictRegNotLike(String dictRegNotLike) {
            if(!IdUtils.isEmpty(dictRegNotLike)){
                this.dictReg_NOTLIKE = dictRegNotLike;
            }
            return this;
        }

        @Override
        public TsDictQuery dictRegIn(String dictRegIn) {
            if(!IdUtils.isEmpty(dictRegIn)){
                if(this.dictReg_IN == null){
                    this.dictReg_IN = new ArrayList<String>();
                }
                this.dictReg_IN.add( dictRegIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictRegNotIn(String dictRegNotIn) {
            if(!IdUtils.isEmpty(dictRegNotIn)){
                if(this.dictReg_NOTIN == null){
                    this.dictReg_NOTIN = new ArrayList<String>();
                }
                this.dictReg_NOTIN.add( dictRegNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery dictRegIsNull() {
            this.isNulls.add("dictReg");
            return this;
        }

        @Override
        public TsDictQuery dictRegIsNotNull() {
            this.isNotNulls.add("dictReg");
            return this;
        }


        @Override
        public TsDictQuery orderby(Integer orderby) {
            if(!IdUtils.isEmpty(orderby)){
                this.orderby = orderby;
            }
            return this;
        }

        @Override
        public TsDictQuery orderbyNot(Integer orderbyNot) {
            if(!IdUtils.isEmpty(orderbyNot)){
                this.orderby_NE = orderbyNot;
            }
            return this;
        }

        @Override
        public TsDictQuery orderbyGreaterThan(Integer orderbyGreaterThan){
            if(orderbyGreaterThan != null){
                this.orderby_GT = orderbyGreaterThan;
            }
            return this;
        }

        @Override
        public TsDictQuery orderbyGreaterEqual(Integer orderbyGreaterEqual){
            if(orderbyGreaterEqual != null){
                this.orderby_GE = orderbyGreaterEqual;
            }
            return this;
        }

        @Override
        public TsDictQuery orderbyLessThan(Integer orderbyLessThan){
            if(orderbyLessThan != null){
                this.orderby_LT = orderbyLessThan;
            }
            return this;
        }

        @Override
        public TsDictQuery orderbyLessEqual(Integer orderbyLessEqual){
            if(orderbyLessEqual != null){
                this.orderby_LE = orderbyLessEqual;
            }
            return this;
        }


        @Override
        public TsDictQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsDictQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsDictQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsDictQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsDictQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsDictQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsDictQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsDictQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsDictQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsDictQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsDictQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsDictQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsDictQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsDictQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsDictQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsDictQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsDictQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsDictQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsDictQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsDictQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsDictQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsDictQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsDictQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsDictQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsDictQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsDictQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsDictQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsDictQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsDictQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsDictQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsDictQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsDictQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsDictQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsDictQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsDictQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsDictQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public TsDictQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TsDictQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TsDictQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TsDictQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TsDictQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TsDictQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TsDictQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TsDictQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsDictQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsDictQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TsDictQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TsDictQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsDictQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsDictQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsDictQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}