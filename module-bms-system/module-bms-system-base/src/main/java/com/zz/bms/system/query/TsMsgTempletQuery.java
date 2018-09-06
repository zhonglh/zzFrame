package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsMsgTempletEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 消息模板 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public interface TsMsgTempletQuery<PK extends Serializable> extends Query<TsMsgTempletEntity,PK> {

        public TsMsgTempletQuery id(PK id);
        public TsMsgTempletQuery idNot(PK idNot);
        public TsMsgTempletQuery idIn(PK idIn);
        public TsMsgTempletQuery idNotIn(PK idNotIn);
        public TsMsgTempletQuery idIsNull();
        public TsMsgTempletQuery idIsNotNull();





        public TsMsgTempletQuery msgTempletName(String msgTempletName);
        public TsMsgTempletQuery msgTempletNameNot(String msgTempletNameNot);
        public TsMsgTempletQuery msgTempletNameIn(String msgTempletNameIn);
        public TsMsgTempletQuery msgTempletNameNotIn(String msgTempletNameNotIn);
        public TsMsgTempletQuery msgTempletNameLike(String msgTempletNameLike);
        public TsMsgTempletQuery msgTempletNameNotLike(String msgTempletNameNotLike);
        public TsMsgTempletQuery msgTempletNameIsNull();
        public TsMsgTempletQuery msgTempletNameIsNotNull();





        public TsMsgTempletQuery msgTempletType(String msgTempletType);
        public TsMsgTempletQuery msgTempletTypeNot(String msgTempletTypeNot);
        public TsMsgTempletQuery msgTempletTypeIn(String msgTempletTypeIn);
        public TsMsgTempletQuery msgTempletTypeNotIn(String msgTempletTypeNotIn);
        public TsMsgTempletQuery msgTempletTypeIsNull();
        public TsMsgTempletQuery msgTempletTypeIsNotNull();





        public TsMsgTempletQuery msgTitle(String msgTitle);
        public TsMsgTempletQuery msgTitleNot(String msgTitleNot);
        public TsMsgTempletQuery msgTitleIn(String msgTitleIn);
        public TsMsgTempletQuery msgTitleNotIn(String msgTitleNotIn);
        public TsMsgTempletQuery msgTitleLike(String msgTitleLike);
        public TsMsgTempletQuery msgTitleNotLike(String msgTitleNotLike);
        public TsMsgTempletQuery msgTitleIsNull();
        public TsMsgTempletQuery msgTitleIsNotNull();





        public TsMsgTempletQuery msgContent(String msgContent);
        public TsMsgTempletQuery msgContentNot(String msgContentNot);
        public TsMsgTempletQuery msgContentIn(String msgContentIn);
        public TsMsgTempletQuery msgContentNotIn(String msgContentNotIn);
        public TsMsgTempletQuery msgContentLike(String msgContentLike);
        public TsMsgTempletQuery msgContentNotLike(String msgContentNotLike);
        public TsMsgTempletQuery msgContentIsNull();
        public TsMsgTempletQuery msgContentIsNotNull();





        public TsMsgTempletQuery msgLanguage(String msgLanguage);
        public TsMsgTempletQuery msgLanguageNot(String msgLanguageNot);
        public TsMsgTempletQuery msgLanguageIn(String msgLanguageIn);
        public TsMsgTempletQuery msgLanguageNotIn(String msgLanguageNotIn);
        public TsMsgTempletQuery msgLanguageIsNull();
        public TsMsgTempletQuery msgLanguageIsNotNull();





        public TsMsgTempletQuery templetEffective(String templetEffective);
        public TsMsgTempletQuery templetEffectiveNot(String templetEffectiveNot);
        public TsMsgTempletQuery templetEffectiveIn(String templetEffectiveIn);
        public TsMsgTempletQuery templetEffectiveNotIn(String templetEffectiveNotIn);
        public TsMsgTempletQuery templetEffectiveIsNull();
        public TsMsgTempletQuery templetEffectiveIsNotNull();





        public TsMsgTempletQuery depId(PK depId);
        public TsMsgTempletQuery depIdNot(PK depIdNot);
        public TsMsgTempletQuery depIdIn(PK depIdIn);
        public TsMsgTempletQuery depIdNotIn(PK depIdNotIn);
        public TsMsgTempletQuery depIdIsNull();
        public TsMsgTempletQuery depIdIsNotNull();





        public TsMsgTempletQuery organId(PK organId);
        public TsMsgTempletQuery organIdNot(PK organIdNot);
        public TsMsgTempletQuery organIdIn(PK organIdIn);
        public TsMsgTempletQuery organIdNotIn(PK organIdNotIn);
        public TsMsgTempletQuery organIdIsNull();
        public TsMsgTempletQuery organIdIsNotNull();





        public TsMsgTempletQuery createUserId(String createUserId);
        public TsMsgTempletQuery createUserIdNot(String createUserIdNot);
        public TsMsgTempletQuery createUserIdIn(String createUserIdIn);
        public TsMsgTempletQuery createUserIdNotIn(String createUserIdNotIn);
        public TsMsgTempletQuery createUserIdLike(String createUserIdLike);
        public TsMsgTempletQuery createUserIdNotLike(String createUserIdNotLike);
        public TsMsgTempletQuery createUserIdIsNull();
        public TsMsgTempletQuery createUserIdIsNotNull();





        public TsMsgTempletQuery createUserName(String createUserName);
        public TsMsgTempletQuery createUserNameNot(String createUserNameNot);
        public TsMsgTempletQuery createUserNameIn(String createUserNameIn);
        public TsMsgTempletQuery createUserNameNotIn(String createUserNameNotIn);
        public TsMsgTempletQuery createUserNameLike(String createUserNameLike);
        public TsMsgTempletQuery createUserNameNotLike(String createUserNameNotLike);
        public TsMsgTempletQuery createUserNameIsNull();
        public TsMsgTempletQuery createUserNameIsNotNull();





        public TsMsgTempletQuery createTime(Timestamp createTime);
        public TsMsgTempletQuery createTimeNot(Timestamp createTimeNot);
        public TsMsgTempletQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsMsgTempletQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsMsgTempletQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsMsgTempletQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsMsgTempletQuery updateUserId(String updateUserId);
        public TsMsgTempletQuery updateUserIdNot(String updateUserIdNot);
        public TsMsgTempletQuery updateUserIdIn(String updateUserIdIn);
        public TsMsgTempletQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsMsgTempletQuery updateUserIdLike(String updateUserIdLike);
        public TsMsgTempletQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsMsgTempletQuery updateUserIdIsNull();
        public TsMsgTempletQuery updateUserIdIsNotNull();





        public TsMsgTempletQuery updateUserName(String updateUserName);
        public TsMsgTempletQuery updateUserNameNot(String updateUserNameNot);
        public TsMsgTempletQuery updateUserNameIn(String updateUserNameIn);
        public TsMsgTempletQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsMsgTempletQuery updateUserNameLike(String updateUserNameLike);
        public TsMsgTempletQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsMsgTempletQuery updateUserNameIsNull();
        public TsMsgTempletQuery updateUserNameIsNotNull();





        public TsMsgTempletQuery updateTime(Timestamp updateTime);
        public TsMsgTempletQuery updateTimeNot(Timestamp updateTimeNot);
        public TsMsgTempletQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsMsgTempletQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsMsgTempletQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsMsgTempletQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsMsgTempletQuery versionNo(Integer versionNo);
        public TsMsgTempletQuery versionNoNot(Integer versionNoNot);
        public TsMsgTempletQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsMsgTempletQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsMsgTempletQuery versionNoLessThan(Integer versionNoLessThan);
        public TsMsgTempletQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TsMsgTempletQuery tenantId(PK tenantId);
        public TsMsgTempletQuery tenantIdNot(PK tenantIdNot);
        public TsMsgTempletQuery tenantIdIn(PK tenantIdIn);
        public TsMsgTempletQuery tenantIdNotIn(PK tenantIdNotIn);
        public TsMsgTempletQuery tenantIdIsNull();
        public TsMsgTempletQuery tenantIdIsNotNull();






	
}