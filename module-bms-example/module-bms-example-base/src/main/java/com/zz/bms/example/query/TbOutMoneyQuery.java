package com.zz.bms.example.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.example.domain.TbOutMoneyEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 出资明细 查询抽象类
 *
 * @author Administrator
 * @date 2019-5-2 18:36:08
 */
public interface TbOutMoneyQuery<PK extends Serializable> extends Query<TbOutMoneyEntity,PK> {

        public TbOutMoneyQuery id(PK id);
        public TbOutMoneyQuery idNot(PK idNot);
        public TbOutMoneyQuery idIn(PK idIn);
        public TbOutMoneyQuery idNotIn(PK idNotIn);
        public TbOutMoneyQuery idIsNull();
        public TbOutMoneyQuery idIsNotNull();





        public TbOutMoneyQuery investorAgreementId(PK investorAgreementId);
        public TbOutMoneyQuery investorAgreementIdNot(PK investorAgreementIdNot);
        public TbOutMoneyQuery investorAgreementIdIn(PK investorAgreementIdIn);
        public TbOutMoneyQuery investorAgreementIdNotIn(PK investorAgreementIdNotIn);
        public TbOutMoneyQuery investorAgreementIdIsNull();
        public TbOutMoneyQuery investorAgreementIdIsNotNull();





        public TbOutMoneyQuery fundId(PK fundId);
        public TbOutMoneyQuery fundIdNot(PK fundIdNot);
        public TbOutMoneyQuery fundIdIn(PK fundIdIn);
        public TbOutMoneyQuery fundIdNotIn(PK fundIdNotIn);
        public TbOutMoneyQuery fundIdIsNull();
        public TbOutMoneyQuery fundIdIsNotNull();





        public TbOutMoneyQuery investorId(PK investorId);
        public TbOutMoneyQuery investorIdNot(PK investorIdNot);
        public TbOutMoneyQuery investorIdIn(PK investorIdIn);
        public TbOutMoneyQuery investorIdNotIn(PK investorIdNotIn);
        public TbOutMoneyQuery investorIdIsNull();
        public TbOutMoneyQuery investorIdIsNotNull();





        public TbOutMoneyQuery actualAmount(BigDecimal actualAmount);
        public TbOutMoneyQuery actualAmountNot(BigDecimal actualAmountNot);
        public TbOutMoneyQuery actualAmountGreaterThan(BigDecimal actualAmountGreaterThan);
        public TbOutMoneyQuery actualAmountGreaterEqual(BigDecimal actualAmountGreaterEqual);
        public TbOutMoneyQuery actualAmountLessThan(BigDecimal actualAmountLessThan);
        public TbOutMoneyQuery actualAmountLessEqual(BigDecimal actualAmountLessEqual);





        public TbOutMoneyQuery handleDepId(PK handleDepId);
        public TbOutMoneyQuery handleDepIdNot(PK handleDepIdNot);
        public TbOutMoneyQuery handleDepIdIn(PK handleDepIdIn);
        public TbOutMoneyQuery handleDepIdNotIn(PK handleDepIdNotIn);
        public TbOutMoneyQuery handleDepIdIsNull();
        public TbOutMoneyQuery handleDepIdIsNotNull();





        public TbOutMoneyQuery handleOrganId(String handleOrganId);
        public TbOutMoneyQuery handleOrganIdNot(String handleOrganIdNot);
        public TbOutMoneyQuery handleOrganIdIn(String handleOrganIdIn);
        public TbOutMoneyQuery handleOrganIdNotIn(String handleOrganIdNotIn);
        public TbOutMoneyQuery handleOrganIdLike(String handleOrganIdLike);
        public TbOutMoneyQuery handleOrganIdNotLike(String handleOrganIdNotLike);
        public TbOutMoneyQuery handleOrganIdIsNull();
        public TbOutMoneyQuery handleOrganIdIsNotNull();





        public TbOutMoneyQuery handleUserId(PK handleUserId);
        public TbOutMoneyQuery handleUserIdNot(PK handleUserIdNot);
        public TbOutMoneyQuery handleUserIdIn(PK handleUserIdIn);
        public TbOutMoneyQuery handleUserIdNotIn(PK handleUserIdNotIn);
        public TbOutMoneyQuery handleUserIdIsNull();
        public TbOutMoneyQuery handleUserIdIsNotNull();





        public TbOutMoneyQuery arrivalAccountDate(Date arrivalAccountDate);
        public TbOutMoneyQuery arrivalAccountDateNot(Date arrivalAccountDateNot);
        public TbOutMoneyQuery arrivalAccountDateGreaterThan(Date arrivalAccountDateGreaterThan);
        public TbOutMoneyQuery arrivalAccountDateGreaterEqual(Date arrivalAccountDateGreaterEqual);
        public TbOutMoneyQuery arrivalAccountDateLessThan(Date arrivalAccountDateLessThan);
        public TbOutMoneyQuery arrivalAccountDateLessEqual(Date arrivalAccountDateLessEqual);





        public TbOutMoneyQuery outMoneyFiles(String outMoneyFiles);
        public TbOutMoneyQuery outMoneyFilesNot(String outMoneyFilesNot);
        public TbOutMoneyQuery outMoneyFilesIn(String outMoneyFilesIn);
        public TbOutMoneyQuery outMoneyFilesNotIn(String outMoneyFilesNotIn);
        public TbOutMoneyQuery outMoneyFilesLike(String outMoneyFilesLike);
        public TbOutMoneyQuery outMoneyFilesNotLike(String outMoneyFilesNotLike);
        public TbOutMoneyQuery outMoneyFilesIsNull();
        public TbOutMoneyQuery outMoneyFilesIsNotNull();





        public TbOutMoneyQuery remark(String remark);
        public TbOutMoneyQuery remarkNot(String remarkNot);
        public TbOutMoneyQuery remarkIn(String remarkIn);
        public TbOutMoneyQuery remarkNotIn(String remarkNotIn);
        public TbOutMoneyQuery remarkLike(String remarkLike);
        public TbOutMoneyQuery remarkNotLike(String remarkNotLike);
        public TbOutMoneyQuery remarkIsNull();
        public TbOutMoneyQuery remarkIsNotNull();





        public TbOutMoneyQuery deleteFlag(String deleteFlag);
        public TbOutMoneyQuery deleteFlagNot(String deleteFlagNot);
        public TbOutMoneyQuery deleteFlagIn(String deleteFlagIn);
        public TbOutMoneyQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TbOutMoneyQuery deleteFlagLike(String deleteFlagLike);
        public TbOutMoneyQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TbOutMoneyQuery deleteFlagIsNull();
        public TbOutMoneyQuery deleteFlagIsNotNull();





        public TbOutMoneyQuery createUserId(String createUserId);
        public TbOutMoneyQuery createUserIdNot(String createUserIdNot);
        public TbOutMoneyQuery createUserIdIn(String createUserIdIn);
        public TbOutMoneyQuery createUserIdNotIn(String createUserIdNotIn);
        public TbOutMoneyQuery createUserIdLike(String createUserIdLike);
        public TbOutMoneyQuery createUserIdNotLike(String createUserIdNotLike);
        public TbOutMoneyQuery createUserIdIsNull();
        public TbOutMoneyQuery createUserIdIsNotNull();





        public TbOutMoneyQuery createUserName(String createUserName);
        public TbOutMoneyQuery createUserNameNot(String createUserNameNot);
        public TbOutMoneyQuery createUserNameIn(String createUserNameIn);
        public TbOutMoneyQuery createUserNameNotIn(String createUserNameNotIn);
        public TbOutMoneyQuery createUserNameLike(String createUserNameLike);
        public TbOutMoneyQuery createUserNameNotLike(String createUserNameNotLike);
        public TbOutMoneyQuery createUserNameIsNull();
        public TbOutMoneyQuery createUserNameIsNotNull();





        public TbOutMoneyQuery createTime(Timestamp createTime);
        public TbOutMoneyQuery createTimeNot(Timestamp createTimeNot);
        public TbOutMoneyQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TbOutMoneyQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TbOutMoneyQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TbOutMoneyQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TbOutMoneyQuery updateUserId(String updateUserId);
        public TbOutMoneyQuery updateUserIdNot(String updateUserIdNot);
        public TbOutMoneyQuery updateUserIdIn(String updateUserIdIn);
        public TbOutMoneyQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TbOutMoneyQuery updateUserIdLike(String updateUserIdLike);
        public TbOutMoneyQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TbOutMoneyQuery updateUserIdIsNull();
        public TbOutMoneyQuery updateUserIdIsNotNull();





        public TbOutMoneyQuery updateUserName(String updateUserName);
        public TbOutMoneyQuery updateUserNameNot(String updateUserNameNot);
        public TbOutMoneyQuery updateUserNameIn(String updateUserNameIn);
        public TbOutMoneyQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TbOutMoneyQuery updateUserNameLike(String updateUserNameLike);
        public TbOutMoneyQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TbOutMoneyQuery updateUserNameIsNull();
        public TbOutMoneyQuery updateUserNameIsNotNull();





        public TbOutMoneyQuery updateTime(Timestamp updateTime);
        public TbOutMoneyQuery updateTimeNot(Timestamp updateTimeNot);
        public TbOutMoneyQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TbOutMoneyQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TbOutMoneyQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TbOutMoneyQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TbOutMoneyQuery versionNo(Integer versionNo);
        public TbOutMoneyQuery versionNoNot(Integer versionNoNot);
        public TbOutMoneyQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TbOutMoneyQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TbOutMoneyQuery versionNoLessThan(Integer versionNoLessThan);
        public TbOutMoneyQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TbOutMoneyQuery tenantId(String tenantId);
        public TbOutMoneyQuery tenantIdNot(String tenantIdNot);
        public TbOutMoneyQuery tenantIdIn(String tenantIdIn);
        public TbOutMoneyQuery tenantIdNotIn(String tenantIdNotIn);
        public TbOutMoneyQuery tenantIdLike(String tenantIdLike);
        public TbOutMoneyQuery tenantIdNotLike(String tenantIdNotLike);
        public TbOutMoneyQuery tenantIdIsNull();
        public TbOutMoneyQuery tenantIdIsNotNull();






	
}