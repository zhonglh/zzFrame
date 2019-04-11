package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsDictEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 字典信息 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:15
 */
public interface TsDictQuery<PK extends Serializable> extends Query<TsDictEntity,PK> {

        public TsDictQuery id(PK id);
        public TsDictQuery idNot(PK idNot);
        public TsDictQuery idIn(PK idIn);
        public TsDictQuery idNotIn(PK idNotIn);
        public TsDictQuery idIsNull();
        public TsDictQuery idIsNotNull();





        public TsDictQuery dictTypeId(PK dictTypeId);
        public TsDictQuery dictTypeIdNot(PK dictTypeIdNot);
        public TsDictQuery dictTypeIdIn(PK dictTypeIdIn);
        public TsDictQuery dictTypeIdNotIn(PK dictTypeIdNotIn);
        public TsDictQuery dictTypeIdIsNull();
        public TsDictQuery dictTypeIdIsNotNull();





        public TsDictQuery dictVal(String dictVal);
        public TsDictQuery dictValNot(String dictValNot);
        public TsDictQuery dictValIn(String dictValIn);
        public TsDictQuery dictValNotIn(String dictValNotIn);
        public TsDictQuery dictValIsNull();
        public TsDictQuery dictValIsNotNull();





        public TsDictQuery dictName(String dictName);
        public TsDictQuery dictNameNot(String dictNameNot);
        public TsDictQuery dictNameIn(String dictNameIn);
        public TsDictQuery dictNameNotIn(String dictNameNotIn);
        public TsDictQuery dictNameLike(String dictNameLike);
        public TsDictQuery dictNameNotLike(String dictNameNotLike);
        public TsDictQuery dictNameIsNull();
        public TsDictQuery dictNameIsNotNull();





        public TsDictQuery dictI18n(String dictI18n);
        public TsDictQuery dictI18nNot(String dictI18nNot);
        public TsDictQuery dictI18nIn(String dictI18nIn);
        public TsDictQuery dictI18nNotIn(String dictI18nNotIn);
        public TsDictQuery dictI18nLike(String dictI18nLike);
        public TsDictQuery dictI18nNotLike(String dictI18nNotLike);
        public TsDictQuery dictI18nIsNull();
        public TsDictQuery dictI18nIsNotNull();





        public TsDictQuery dictReg(String dictReg);
        public TsDictQuery dictRegNot(String dictRegNot);
        public TsDictQuery dictRegIn(String dictRegIn);
        public TsDictQuery dictRegNotIn(String dictRegNotIn);
        public TsDictQuery dictRegLike(String dictRegLike);
        public TsDictQuery dictRegNotLike(String dictRegNotLike);
        public TsDictQuery dictRegIsNull();
        public TsDictQuery dictRegIsNotNull();





        public TsDictQuery orderby(Integer orderby);
        public TsDictQuery orderbyNot(Integer orderbyNot);
        public TsDictQuery orderbyGreaterThan(Integer orderbyGreaterThan);
        public TsDictQuery orderbyGreaterEqual(Integer orderbyGreaterEqual);
        public TsDictQuery orderbyLessThan(Integer orderbyLessThan);
        public TsDictQuery orderbyLessEqual(Integer orderbyLessEqual);





        public TsDictQuery createUserId(String createUserId);
        public TsDictQuery createUserIdNot(String createUserIdNot);
        public TsDictQuery createUserIdIn(String createUserIdIn);
        public TsDictQuery createUserIdNotIn(String createUserIdNotIn);
        public TsDictQuery createUserIdLike(String createUserIdLike);
        public TsDictQuery createUserIdNotLike(String createUserIdNotLike);
        public TsDictQuery createUserIdIsNull();
        public TsDictQuery createUserIdIsNotNull();





        public TsDictQuery createUserName(String createUserName);
        public TsDictQuery createUserNameNot(String createUserNameNot);
        public TsDictQuery createUserNameIn(String createUserNameIn);
        public TsDictQuery createUserNameNotIn(String createUserNameNotIn);
        public TsDictQuery createUserNameLike(String createUserNameLike);
        public TsDictQuery createUserNameNotLike(String createUserNameNotLike);
        public TsDictQuery createUserNameIsNull();
        public TsDictQuery createUserNameIsNotNull();





        public TsDictQuery createTime(Timestamp createTime);
        public TsDictQuery createTimeNot(Timestamp createTimeNot);
        public TsDictQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsDictQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsDictQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsDictQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsDictQuery updateUserId(String updateUserId);
        public TsDictQuery updateUserIdNot(String updateUserIdNot);
        public TsDictQuery updateUserIdIn(String updateUserIdIn);
        public TsDictQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsDictQuery updateUserIdLike(String updateUserIdLike);
        public TsDictQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsDictQuery updateUserIdIsNull();
        public TsDictQuery updateUserIdIsNotNull();





        public TsDictQuery updateUserName(String updateUserName);
        public TsDictQuery updateUserNameNot(String updateUserNameNot);
        public TsDictQuery updateUserNameIn(String updateUserNameIn);
        public TsDictQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsDictQuery updateUserNameLike(String updateUserNameLike);
        public TsDictQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsDictQuery updateUserNameIsNull();
        public TsDictQuery updateUserNameIsNotNull();





        public TsDictQuery updateTime(Timestamp updateTime);
        public TsDictQuery updateTimeNot(Timestamp updateTimeNot);
        public TsDictQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsDictQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsDictQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsDictQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsDictQuery versionNo(Integer versionNo);
        public TsDictQuery versionNoNot(Integer versionNoNot);
        public TsDictQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsDictQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsDictQuery versionNoLessThan(Integer versionNoLessThan);
        public TsDictQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TsDictQuery deleteFlag(String deleteFlag);
        public TsDictQuery deleteFlagNot(String deleteFlagNot);
        public TsDictQuery deleteFlagIn(String deleteFlagIn);
        public TsDictQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TsDictQuery deleteFlagLike(String deleteFlagLike);
        public TsDictQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TsDictQuery deleteFlagIsNull();
        public TsDictQuery deleteFlagIsNotNull();





        public TsDictQuery tenantId(String tenantId);
        public TsDictQuery tenantIdNot(String tenantIdNot);
        public TsDictQuery tenantIdIn(String tenantIdIn);
        public TsDictQuery tenantIdNotIn(String tenantIdNotIn);
        public TsDictQuery tenantIdLike(String tenantIdLike);
        public TsDictQuery tenantIdNotLike(String tenantIdNotLike);
        public TsDictQuery tenantIdIsNull();
        public TsDictQuery tenantIdIsNotNull();






	
}