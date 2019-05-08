package com.zz.bms.example.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.example.domain.TbInvestorAgreementEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 投资协议 查询抽象类
 *
 * @author Administrator
 * @date 2019-5-8 13:19:38
 */
public interface TbInvestorAgreementQuery<PK extends Serializable> extends Query<TbInvestorAgreementEntity,PK> {

        public TbInvestorAgreementQuery id(PK id);
        public TbInvestorAgreementQuery idNot(PK idNot);
        public TbInvestorAgreementQuery idIn(PK idIn);
        public TbInvestorAgreementQuery idNotIn(PK idNotIn);
        public TbInvestorAgreementQuery idIsNull();
        public TbInvestorAgreementQuery idIsNotNull();





        public TbInvestorAgreementQuery agreementName(String agreementName);
        public TbInvestorAgreementQuery agreementNameNot(String agreementNameNot);
        public TbInvestorAgreementQuery agreementNameIn(String agreementNameIn);
        public TbInvestorAgreementQuery agreementNameNotIn(String agreementNameNotIn);
        public TbInvestorAgreementQuery agreementNameLike(String agreementNameLike);
        public TbInvestorAgreementQuery agreementNameNotLike(String agreementNameNotLike);
        public TbInvestorAgreementQuery agreementNameIsNull();
        public TbInvestorAgreementQuery agreementNameIsNotNull();





        public TbInvestorAgreementQuery agreementCode(String agreementCode);
        public TbInvestorAgreementQuery agreementCodeNot(String agreementCodeNot);
        public TbInvestorAgreementQuery agreementCodeIn(String agreementCodeIn);
        public TbInvestorAgreementQuery agreementCodeNotIn(String agreementCodeNotIn);
        public TbInvestorAgreementQuery agreementCodeLike(String agreementCodeLike);
        public TbInvestorAgreementQuery agreementCodeNotLike(String agreementCodeNotLike);
        public TbInvestorAgreementQuery agreementCodeIsNull();
        public TbInvestorAgreementQuery agreementCodeIsNotNull();





        public TbInvestorAgreementQuery fundId(PK fundId);
        public TbInvestorAgreementQuery fundIdNot(PK fundIdNot);
        public TbInvestorAgreementQuery fundIdIn(PK fundIdIn);
        public TbInvestorAgreementQuery fundIdNotIn(PK fundIdNotIn);
        public TbInvestorAgreementQuery fundIdIsNull();
        public TbInvestorAgreementQuery fundIdIsNotNull();





        public TbInvestorAgreementQuery investorId(PK investorId);
        public TbInvestorAgreementQuery investorIdNot(PK investorIdNot);
        public TbInvestorAgreementQuery investorIdIn(PK investorIdIn);
        public TbInvestorAgreementQuery investorIdNotIn(PK investorIdNotIn);
        public TbInvestorAgreementQuery investorIdIsNull();
        public TbInvestorAgreementQuery investorIdIsNotNull();





        public TbInvestorAgreementQuery amount(BigDecimal amount);
        public TbInvestorAgreementQuery amountNot(BigDecimal amountNot);
        public TbInvestorAgreementQuery amountGreaterThan(BigDecimal amountGreaterThan);
        public TbInvestorAgreementQuery amountGreaterEqual(BigDecimal amountGreaterEqual);
        public TbInvestorAgreementQuery amountLessThan(BigDecimal amountLessThan);
        public TbInvestorAgreementQuery amountLessEqual(BigDecimal amountLessEqual);





        public TbInvestorAgreementQuery actualAmount(BigDecimal actualAmount);
        public TbInvestorAgreementQuery actualAmountNot(BigDecimal actualAmountNot);
        public TbInvestorAgreementQuery actualAmountGreaterThan(BigDecimal actualAmountGreaterThan);
        public TbInvestorAgreementQuery actualAmountGreaterEqual(BigDecimal actualAmountGreaterEqual);
        public TbInvestorAgreementQuery actualAmountLessThan(BigDecimal actualAmountLessThan);
        public TbInvestorAgreementQuery actualAmountLessEqual(BigDecimal actualAmountLessEqual);





        public TbInvestorAgreementQuery sketch(String sketch);
        public TbInvestorAgreementQuery sketchNot(String sketchNot);
        public TbInvestorAgreementQuery sketchIn(String sketchIn);
        public TbInvestorAgreementQuery sketchNotIn(String sketchNotIn);
        public TbInvestorAgreementQuery sketchLike(String sketchLike);
        public TbInvestorAgreementQuery sketchNotLike(String sketchNotLike);
        public TbInvestorAgreementQuery sketchIsNull();
        public TbInvestorAgreementQuery sketchIsNotNull();





        public TbInvestorAgreementQuery signDepId(PK signDepId);
        public TbInvestorAgreementQuery signDepIdNot(PK signDepIdNot);
        public TbInvestorAgreementQuery signDepIdIn(PK signDepIdIn);
        public TbInvestorAgreementQuery signDepIdNotIn(PK signDepIdNotIn);
        public TbInvestorAgreementQuery signDepIdIsNull();
        public TbInvestorAgreementQuery signDepIdIsNotNull();





        public TbInvestorAgreementQuery signOrganId(String signOrganId);
        public TbInvestorAgreementQuery signOrganIdNot(String signOrganIdNot);
        public TbInvestorAgreementQuery signOrganIdIn(String signOrganIdIn);
        public TbInvestorAgreementQuery signOrganIdNotIn(String signOrganIdNotIn);
        public TbInvestorAgreementQuery signOrganIdLike(String signOrganIdLike);
        public TbInvestorAgreementQuery signOrganIdNotLike(String signOrganIdNotLike);
        public TbInvestorAgreementQuery signOrganIdIsNull();
        public TbInvestorAgreementQuery signOrganIdIsNotNull();





        public TbInvestorAgreementQuery signUserId(PK signUserId);
        public TbInvestorAgreementQuery signUserIdNot(PK signUserIdNot);
        public TbInvestorAgreementQuery signUserIdIn(PK signUserIdIn);
        public TbInvestorAgreementQuery signUserIdNotIn(PK signUserIdNotIn);
        public TbInvestorAgreementQuery signUserIdIsNull();
        public TbInvestorAgreementQuery signUserIdIsNotNull();





        public TbInvestorAgreementQuery signDate(Date signDate);
        public TbInvestorAgreementQuery signDateNot(Date signDateNot);
        public TbInvestorAgreementQuery signDateGreaterThan(Date signDateGreaterThan);
        public TbInvestorAgreementQuery signDateGreaterEqual(Date signDateGreaterEqual);
        public TbInvestorAgreementQuery signDateLessThan(Date signDateLessThan);
        public TbInvestorAgreementQuery signDateLessEqual(Date signDateLessEqual);





        public TbInvestorAgreementQuery agreementFiles(String agreementFiles);
        public TbInvestorAgreementQuery agreementFilesNot(String agreementFilesNot);
        public TbInvestorAgreementQuery agreementFilesIn(String agreementFilesIn);
        public TbInvestorAgreementQuery agreementFilesNotIn(String agreementFilesNotIn);
        public TbInvestorAgreementQuery agreementFilesLike(String agreementFilesLike);
        public TbInvestorAgreementQuery agreementFilesNotLike(String agreementFilesNotLike);
        public TbInvestorAgreementQuery agreementFilesIsNull();
        public TbInvestorAgreementQuery agreementFilesIsNotNull();





        public TbInvestorAgreementQuery remark(String remark);
        public TbInvestorAgreementQuery remarkNot(String remarkNot);
        public TbInvestorAgreementQuery remarkIn(String remarkIn);
        public TbInvestorAgreementQuery remarkNotIn(String remarkNotIn);
        public TbInvestorAgreementQuery remarkLike(String remarkLike);
        public TbInvestorAgreementQuery remarkNotLike(String remarkNotLike);
        public TbInvestorAgreementQuery remarkIsNull();
        public TbInvestorAgreementQuery remarkIsNotNull();





        public TbInvestorAgreementQuery deleteFlag(String deleteFlag);
        public TbInvestorAgreementQuery deleteFlagNot(String deleteFlagNot);
        public TbInvestorAgreementQuery deleteFlagIn(String deleteFlagIn);
        public TbInvestorAgreementQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TbInvestorAgreementQuery deleteFlagLike(String deleteFlagLike);
        public TbInvestorAgreementQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TbInvestorAgreementQuery deleteFlagIsNull();
        public TbInvestorAgreementQuery deleteFlagIsNotNull();





        public TbInvestorAgreementQuery createUserId(String createUserId);
        public TbInvestorAgreementQuery createUserIdNot(String createUserIdNot);
        public TbInvestorAgreementQuery createUserIdIn(String createUserIdIn);
        public TbInvestorAgreementQuery createUserIdNotIn(String createUserIdNotIn);
        public TbInvestorAgreementQuery createUserIdLike(String createUserIdLike);
        public TbInvestorAgreementQuery createUserIdNotLike(String createUserIdNotLike);
        public TbInvestorAgreementQuery createUserIdIsNull();
        public TbInvestorAgreementQuery createUserIdIsNotNull();





        public TbInvestorAgreementQuery createUserName(String createUserName);
        public TbInvestorAgreementQuery createUserNameNot(String createUserNameNot);
        public TbInvestorAgreementQuery createUserNameIn(String createUserNameIn);
        public TbInvestorAgreementQuery createUserNameNotIn(String createUserNameNotIn);
        public TbInvestorAgreementQuery createUserNameLike(String createUserNameLike);
        public TbInvestorAgreementQuery createUserNameNotLike(String createUserNameNotLike);
        public TbInvestorAgreementQuery createUserNameIsNull();
        public TbInvestorAgreementQuery createUserNameIsNotNull();





        public TbInvestorAgreementQuery createTime(Timestamp createTime);
        public TbInvestorAgreementQuery createTimeNot(Timestamp createTimeNot);
        public TbInvestorAgreementQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TbInvestorAgreementQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TbInvestorAgreementQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TbInvestorAgreementQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TbInvestorAgreementQuery updateUserId(String updateUserId);
        public TbInvestorAgreementQuery updateUserIdNot(String updateUserIdNot);
        public TbInvestorAgreementQuery updateUserIdIn(String updateUserIdIn);
        public TbInvestorAgreementQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TbInvestorAgreementQuery updateUserIdLike(String updateUserIdLike);
        public TbInvestorAgreementQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TbInvestorAgreementQuery updateUserIdIsNull();
        public TbInvestorAgreementQuery updateUserIdIsNotNull();





        public TbInvestorAgreementQuery updateUserName(String updateUserName);
        public TbInvestorAgreementQuery updateUserNameNot(String updateUserNameNot);
        public TbInvestorAgreementQuery updateUserNameIn(String updateUserNameIn);
        public TbInvestorAgreementQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TbInvestorAgreementQuery updateUserNameLike(String updateUserNameLike);
        public TbInvestorAgreementQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TbInvestorAgreementQuery updateUserNameIsNull();
        public TbInvestorAgreementQuery updateUserNameIsNotNull();





        public TbInvestorAgreementQuery updateTime(Timestamp updateTime);
        public TbInvestorAgreementQuery updateTimeNot(Timestamp updateTimeNot);
        public TbInvestorAgreementQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TbInvestorAgreementQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TbInvestorAgreementQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TbInvestorAgreementQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TbInvestorAgreementQuery versionNo(Integer versionNo);
        public TbInvestorAgreementQuery versionNoNot(Integer versionNoNot);
        public TbInvestorAgreementQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TbInvestorAgreementQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TbInvestorAgreementQuery versionNoLessThan(Integer versionNoLessThan);
        public TbInvestorAgreementQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TbInvestorAgreementQuery tenantId(String tenantId);
        public TbInvestorAgreementQuery tenantIdNot(String tenantIdNot);
        public TbInvestorAgreementQuery tenantIdIn(String tenantIdIn);
        public TbInvestorAgreementQuery tenantIdNotIn(String tenantIdNotIn);
        public TbInvestorAgreementQuery tenantIdLike(String tenantIdLike);
        public TbInvestorAgreementQuery tenantIdNotLike(String tenantIdNotLike);
        public TbInvestorAgreementQuery tenantIdIsNull();
        public TbInvestorAgreementQuery tenantIdIsNotNull();






	
}