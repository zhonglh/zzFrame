package com.zz.bms.example.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.example.domain.TbFundEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 基金 查询抽象类
 *
 * @author Administrator
 * @date 2019-5-8 13:45:41
 */
public interface TbFundQuery<PK extends Serializable> extends Query<TbFundEntity,PK> {

        public TbFundQuery id(PK id);
        public TbFundQuery idNot(PK idNot);
        public TbFundQuery idIn(PK idIn);
        public TbFundQuery idNotIn(PK idNotIn);
        public TbFundQuery idIsNull();
        public TbFundQuery idIsNotNull();





        public TbFundQuery fundName(String fundName);
        public TbFundQuery fundNameNot(String fundNameNot);
        public TbFundQuery fundNameIn(String fundNameIn);
        public TbFundQuery fundNameNotIn(String fundNameNotIn);
        public TbFundQuery fundNameLike(String fundNameLike);
        public TbFundQuery fundNameNotLike(String fundNameNotLike);
        public TbFundQuery fundNameIsNull();
        public TbFundQuery fundNameIsNotNull();





        public TbFundQuery fundCode(String fundCode);
        public TbFundQuery fundCodeNot(String fundCodeNot);
        public TbFundQuery fundCodeIn(String fundCodeIn);
        public TbFundQuery fundCodeNotIn(String fundCodeNotIn);
        public TbFundQuery fundCodeLike(String fundCodeLike);
        public TbFundQuery fundCodeNotLike(String fundCodeNotLike);
        public TbFundQuery fundCodeIsNull();
        public TbFundQuery fundCodeIsNotNull();





        public TbFundQuery fundType(String fundType);
        public TbFundQuery fundTypeNot(String fundTypeNot);
        public TbFundQuery fundTypeIn(String fundTypeIn);
        public TbFundQuery fundTypeNotIn(String fundTypeNotIn);
        public TbFundQuery fundTypeIsNull();
        public TbFundQuery fundTypeIsNotNull();





        public TbFundQuery fundDirection(String fundDirection);
        public TbFundQuery fundDirectionNot(String fundDirectionNot);
        public TbFundQuery fundDirectionIn(String fundDirectionIn);
        public TbFundQuery fundDirectionNotIn(String fundDirectionNotIn);
        public TbFundQuery fundDirectionIsNull();
        public TbFundQuery fundDirectionIsNotNull();





        public TbFundQuery startMoney(BigDecimal startMoney);
        public TbFundQuery startMoneyNot(BigDecimal startMoneyNot);
        public TbFundQuery startMoneyGreaterThan(BigDecimal startMoneyGreaterThan);
        public TbFundQuery startMoneyGreaterEqual(BigDecimal startMoneyGreaterEqual);
        public TbFundQuery startMoneyLessThan(BigDecimal startMoneyLessThan);
        public TbFundQuery startMoneyLessEqual(BigDecimal startMoneyLessEqual);





        public TbFundQuery managType(String managType);
        public TbFundQuery managTypeNot(String managTypeNot);
        public TbFundQuery managTypeIn(String managTypeIn);
        public TbFundQuery managTypeNotIn(String managTypeNotIn);
        public TbFundQuery managTypeIsNull();
        public TbFundQuery managTypeIsNotNull();





        public TbFundQuery fundScale(BigDecimal fundScale);
        public TbFundQuery fundScaleNot(BigDecimal fundScaleNot);
        public TbFundQuery fundScaleGreaterThan(BigDecimal fundScaleGreaterThan);
        public TbFundQuery fundScaleGreaterEqual(BigDecimal fundScaleGreaterEqual);
        public TbFundQuery fundScaleLessThan(BigDecimal fundScaleLessThan);
        public TbFundQuery fundScaleLessEqual(BigDecimal fundScaleLessEqual);





        public TbFundQuery managerUserId(PK managerUserId);
        public TbFundQuery managerUserIdNot(PK managerUserIdNot);
        public TbFundQuery managerUserIdIn(PK managerUserIdIn);
        public TbFundQuery managerUserIdNotIn(PK managerUserIdNotIn);
        public TbFundQuery managerUserIdIsNull();
        public TbFundQuery managerUserIdIsNotNull();





        public TbFundQuery startDate(Date startDate);
        public TbFundQuery startDateNot(Date startDateNot);
        public TbFundQuery startDateGreaterThan(Date startDateGreaterThan);
        public TbFundQuery startDateGreaterEqual(Date startDateGreaterEqual);
        public TbFundQuery startDateLessThan(Date startDateLessThan);
        public TbFundQuery startDateLessEqual(Date startDateLessEqual);





        public TbFundQuery endDate(Date endDate);
        public TbFundQuery endDateNot(Date endDateNot);
        public TbFundQuery endDateGreaterThan(Date endDateGreaterThan);
        public TbFundQuery endDateGreaterEqual(Date endDateGreaterEqual);
        public TbFundQuery endDateLessThan(Date endDateLessThan);
        public TbFundQuery endDateLessEqual(Date endDateLessEqual);





        public TbFundQuery investmentField(String investmentField);
        public TbFundQuery investmentFieldNot(String investmentFieldNot);
        public TbFundQuery investmentFieldIn(String investmentFieldIn);
        public TbFundQuery investmentFieldNotIn(String investmentFieldNotIn);
        public TbFundQuery investmentFieldLike(String investmentFieldLike);
        public TbFundQuery investmentFieldNotLike(String investmentFieldNotLike);
        public TbFundQuery investmentFieldIsNull();
        public TbFundQuery investmentFieldIsNotNull();





        public TbFundQuery incomeAllocation(String incomeAllocation);
        public TbFundQuery incomeAllocationNot(String incomeAllocationNot);
        public TbFundQuery incomeAllocationIn(String incomeAllocationIn);
        public TbFundQuery incomeAllocationNotIn(String incomeAllocationNotIn);
        public TbFundQuery incomeAllocationLike(String incomeAllocationLike);
        public TbFundQuery incomeAllocationNotLike(String incomeAllocationNotLike);
        public TbFundQuery incomeAllocationIsNull();
        public TbFundQuery incomeAllocationIsNotNull();





        public TbFundQuery fundFiles(String fundFiles);
        public TbFundQuery fundFilesNot(String fundFilesNot);
        public TbFundQuery fundFilesIn(String fundFilesIn);
        public TbFundQuery fundFilesNotIn(String fundFilesNotIn);
        public TbFundQuery fundFilesLike(String fundFilesLike);
        public TbFundQuery fundFilesNotLike(String fundFilesNotLike);
        public TbFundQuery fundFilesIsNull();
        public TbFundQuery fundFilesIsNotNull();





        public TbFundQuery remark(String remark);
        public TbFundQuery remarkNot(String remarkNot);
        public TbFundQuery remarkIn(String remarkIn);
        public TbFundQuery remarkNotIn(String remarkNotIn);
        public TbFundQuery remarkLike(String remarkLike);
        public TbFundQuery remarkNotLike(String remarkNotLike);
        public TbFundQuery remarkIsNull();
        public TbFundQuery remarkIsNotNull();





        public TbFundQuery depId(PK depId);
        public TbFundQuery depIdNot(PK depIdNot);
        public TbFundQuery depIdIn(PK depIdIn);
        public TbFundQuery depIdNotIn(PK depIdNotIn);
        public TbFundQuery depIdIsNull();
        public TbFundQuery depIdIsNotNull();





        public TbFundQuery organId(String organId);
        public TbFundQuery organIdNot(String organIdNot);
        public TbFundQuery organIdIn(String organIdIn);
        public TbFundQuery organIdNotIn(String organIdNotIn);
        public TbFundQuery organIdLike(String organIdLike);
        public TbFundQuery organIdNotLike(String organIdNotLike);
        public TbFundQuery organIdIsNull();
        public TbFundQuery organIdIsNotNull();





        public TbFundQuery deleteFlag(String deleteFlag);
        public TbFundQuery deleteFlagNot(String deleteFlagNot);
        public TbFundQuery deleteFlagIn(String deleteFlagIn);
        public TbFundQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TbFundQuery deleteFlagLike(String deleteFlagLike);
        public TbFundQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TbFundQuery deleteFlagIsNull();
        public TbFundQuery deleteFlagIsNotNull();





        public TbFundQuery createUserId(String createUserId);
        public TbFundQuery createUserIdNot(String createUserIdNot);
        public TbFundQuery createUserIdIn(String createUserIdIn);
        public TbFundQuery createUserIdNotIn(String createUserIdNotIn);
        public TbFundQuery createUserIdLike(String createUserIdLike);
        public TbFundQuery createUserIdNotLike(String createUserIdNotLike);
        public TbFundQuery createUserIdIsNull();
        public TbFundQuery createUserIdIsNotNull();





        public TbFundQuery createUserName(String createUserName);
        public TbFundQuery createUserNameNot(String createUserNameNot);
        public TbFundQuery createUserNameIn(String createUserNameIn);
        public TbFundQuery createUserNameNotIn(String createUserNameNotIn);
        public TbFundQuery createUserNameLike(String createUserNameLike);
        public TbFundQuery createUserNameNotLike(String createUserNameNotLike);
        public TbFundQuery createUserNameIsNull();
        public TbFundQuery createUserNameIsNotNull();





        public TbFundQuery createTime(Timestamp createTime);
        public TbFundQuery createTimeNot(Timestamp createTimeNot);
        public TbFundQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TbFundQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TbFundQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TbFundQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TbFundQuery updateUserId(String updateUserId);
        public TbFundQuery updateUserIdNot(String updateUserIdNot);
        public TbFundQuery updateUserIdIn(String updateUserIdIn);
        public TbFundQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TbFundQuery updateUserIdLike(String updateUserIdLike);
        public TbFundQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TbFundQuery updateUserIdIsNull();
        public TbFundQuery updateUserIdIsNotNull();





        public TbFundQuery updateUserName(String updateUserName);
        public TbFundQuery updateUserNameNot(String updateUserNameNot);
        public TbFundQuery updateUserNameIn(String updateUserNameIn);
        public TbFundQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TbFundQuery updateUserNameLike(String updateUserNameLike);
        public TbFundQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TbFundQuery updateUserNameIsNull();
        public TbFundQuery updateUserNameIsNotNull();





        public TbFundQuery updateTime(Timestamp updateTime);
        public TbFundQuery updateTimeNot(Timestamp updateTimeNot);
        public TbFundQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TbFundQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TbFundQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TbFundQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TbFundQuery versionNo(Integer versionNo);
        public TbFundQuery versionNoNot(Integer versionNoNot);
        public TbFundQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TbFundQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TbFundQuery versionNoLessThan(Integer versionNoLessThan);
        public TbFundQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TbFundQuery tenantId(String tenantId);
        public TbFundQuery tenantIdNot(String tenantIdNot);
        public TbFundQuery tenantIdIn(String tenantIdIn);
        public TbFundQuery tenantIdNotIn(String tenantIdNotIn);
        public TbFundQuery tenantIdLike(String tenantIdLike);
        public TbFundQuery tenantIdNotLike(String tenantIdNotLike);
        public TbFundQuery tenantIdIsNull();
        public TbFundQuery tenantIdIsNotNull();






	
}