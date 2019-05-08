package com.zz.bms.example.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.example.domain.TbInvestorEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 投资人 查询抽象类
 *
 * @author Administrator
 * @date 2019-5-8 13:19:38
 */
public interface TbInvestorQuery<PK extends Serializable> extends Query<TbInvestorEntity,PK> {

        public TbInvestorQuery id(PK id);
        public TbInvestorQuery idNot(PK idNot);
        public TbInvestorQuery idIn(PK idIn);
        public TbInvestorQuery idNotIn(PK idNotIn);
        public TbInvestorQuery idIsNull();
        public TbInvestorQuery idIsNotNull();





        public TbInvestorQuery investorName(String investorName);
        public TbInvestorQuery investorNameNot(String investorNameNot);
        public TbInvestorQuery investorNameIn(String investorNameIn);
        public TbInvestorQuery investorNameNotIn(String investorNameNotIn);
        public TbInvestorQuery investorNameLike(String investorNameLike);
        public TbInvestorQuery investorNameNotLike(String investorNameNotLike);
        public TbInvestorQuery investorNameIsNull();
        public TbInvestorQuery investorNameIsNotNull();





        public TbInvestorQuery investorCode(String investorCode);
        public TbInvestorQuery investorCodeNot(String investorCodeNot);
        public TbInvestorQuery investorCodeIn(String investorCodeIn);
        public TbInvestorQuery investorCodeNotIn(String investorCodeNotIn);
        public TbInvestorQuery investorCodeLike(String investorCodeLike);
        public TbInvestorQuery investorCodeNotLike(String investorCodeNotLike);
        public TbInvestorQuery investorCodeIsNull();
        public TbInvestorQuery investorCodeIsNotNull();





        public TbInvestorQuery investorType(String investorType);
        public TbInvestorQuery investorTypeNot(String investorTypeNot);
        public TbInvestorQuery investorTypeIn(String investorTypeIn);
        public TbInvestorQuery investorTypeNotIn(String investorTypeNotIn);
        public TbInvestorQuery investorTypeIsNull();
        public TbInvestorQuery investorTypeIsNotNull();





        public TbInvestorQuery manageUserId(PK manageUserId);
        public TbInvestorQuery manageUserIdNot(PK manageUserIdNot);
        public TbInvestorQuery manageUserIdIn(PK manageUserIdIn);
        public TbInvestorQuery manageUserIdNotIn(PK manageUserIdNotIn);
        public TbInvestorQuery manageUserIdIsNull();
        public TbInvestorQuery manageUserIdIsNotNull();





        public TbInvestorQuery cardType(String cardType);
        public TbInvestorQuery cardTypeNot(String cardTypeNot);
        public TbInvestorQuery cardTypeIn(String cardTypeIn);
        public TbInvestorQuery cardTypeNotIn(String cardTypeNotIn);
        public TbInvestorQuery cardTypeIsNull();
        public TbInvestorQuery cardTypeIsNotNull();





        public TbInvestorQuery cardNo(String cardNo);
        public TbInvestorQuery cardNoNot(String cardNoNot);
        public TbInvestorQuery cardNoIn(String cardNoIn);
        public TbInvestorQuery cardNoNotIn(String cardNoNotIn);
        public TbInvestorQuery cardNoLike(String cardNoLike);
        public TbInvestorQuery cardNoNotLike(String cardNoNotLike);
        public TbInvestorQuery cardNoIsNull();
        public TbInvestorQuery cardNoIsNotNull();





        public TbInvestorQuery investorFiles(String investorFiles);
        public TbInvestorQuery investorFilesNot(String investorFilesNot);
        public TbInvestorQuery investorFilesIn(String investorFilesIn);
        public TbInvestorQuery investorFilesNotIn(String investorFilesNotIn);
        public TbInvestorQuery investorFilesLike(String investorFilesLike);
        public TbInvestorQuery investorFilesNotLike(String investorFilesNotLike);
        public TbInvestorQuery investorFilesIsNull();
        public TbInvestorQuery investorFilesIsNotNull();





        public TbInvestorQuery remark(String remark);
        public TbInvestorQuery remarkNot(String remarkNot);
        public TbInvestorQuery remarkIn(String remarkIn);
        public TbInvestorQuery remarkNotIn(String remarkNotIn);
        public TbInvestorQuery remarkLike(String remarkLike);
        public TbInvestorQuery remarkNotLike(String remarkNotLike);
        public TbInvestorQuery remarkIsNull();
        public TbInvestorQuery remarkIsNotNull();





        public TbInvestorQuery deleteFlag(String deleteFlag);
        public TbInvestorQuery deleteFlagNot(String deleteFlagNot);
        public TbInvestorQuery deleteFlagIn(String deleteFlagIn);
        public TbInvestorQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TbInvestorQuery deleteFlagLike(String deleteFlagLike);
        public TbInvestorQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TbInvestorQuery deleteFlagIsNull();
        public TbInvestorQuery deleteFlagIsNotNull();





        public TbInvestorQuery createUserId(String createUserId);
        public TbInvestorQuery createUserIdNot(String createUserIdNot);
        public TbInvestorQuery createUserIdIn(String createUserIdIn);
        public TbInvestorQuery createUserIdNotIn(String createUserIdNotIn);
        public TbInvestorQuery createUserIdLike(String createUserIdLike);
        public TbInvestorQuery createUserIdNotLike(String createUserIdNotLike);
        public TbInvestorQuery createUserIdIsNull();
        public TbInvestorQuery createUserIdIsNotNull();





        public TbInvestorQuery createUserName(String createUserName);
        public TbInvestorQuery createUserNameNot(String createUserNameNot);
        public TbInvestorQuery createUserNameIn(String createUserNameIn);
        public TbInvestorQuery createUserNameNotIn(String createUserNameNotIn);
        public TbInvestorQuery createUserNameLike(String createUserNameLike);
        public TbInvestorQuery createUserNameNotLike(String createUserNameNotLike);
        public TbInvestorQuery createUserNameIsNull();
        public TbInvestorQuery createUserNameIsNotNull();





        public TbInvestorQuery createTime(Timestamp createTime);
        public TbInvestorQuery createTimeNot(Timestamp createTimeNot);
        public TbInvestorQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TbInvestorQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TbInvestorQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TbInvestorQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TbInvestorQuery updateUserId(String updateUserId);
        public TbInvestorQuery updateUserIdNot(String updateUserIdNot);
        public TbInvestorQuery updateUserIdIn(String updateUserIdIn);
        public TbInvestorQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TbInvestorQuery updateUserIdLike(String updateUserIdLike);
        public TbInvestorQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TbInvestorQuery updateUserIdIsNull();
        public TbInvestorQuery updateUserIdIsNotNull();





        public TbInvestorQuery updateUserName(String updateUserName);
        public TbInvestorQuery updateUserNameNot(String updateUserNameNot);
        public TbInvestorQuery updateUserNameIn(String updateUserNameIn);
        public TbInvestorQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TbInvestorQuery updateUserNameLike(String updateUserNameLike);
        public TbInvestorQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TbInvestorQuery updateUserNameIsNull();
        public TbInvestorQuery updateUserNameIsNotNull();





        public TbInvestorQuery updateTime(Timestamp updateTime);
        public TbInvestorQuery updateTimeNot(Timestamp updateTimeNot);
        public TbInvestorQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TbInvestorQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TbInvestorQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TbInvestorQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TbInvestorQuery versionNo(Integer versionNo);
        public TbInvestorQuery versionNoNot(Integer versionNoNot);
        public TbInvestorQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TbInvestorQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TbInvestorQuery versionNoLessThan(Integer versionNoLessThan);
        public TbInvestorQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TbInvestorQuery tenantId(String tenantId);
        public TbInvestorQuery tenantIdNot(String tenantIdNot);
        public TbInvestorQuery tenantIdIn(String tenantIdIn);
        public TbInvestorQuery tenantIdNotIn(String tenantIdNotIn);
        public TbInvestorQuery tenantIdLike(String tenantIdLike);
        public TbInvestorQuery tenantIdNotLike(String tenantIdNotLike);
        public TbInvestorQuery tenantIdIsNull();
        public TbInvestorQuery tenantIdIsNotNull();






	
}