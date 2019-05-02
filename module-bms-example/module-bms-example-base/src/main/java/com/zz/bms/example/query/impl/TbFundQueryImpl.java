package com.zz.bms.example.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.example.domain.TbFundEntity;
import com.zz.bms.example.query.TbFundQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 基金 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-5-2 18:36:08
*/
public class TbFundQueryImpl<PK extends Serializable> extends TbFundAbstractQueryImpl<PK> implements TbFundQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> fundName_IN;
        private List<String> fundName_NOTIN;

        private List<String> fundCode_IN;
        private List<String> fundCode_NOTIN;
        private List<String> fundType_IN;
        private List<String> fundType_NOTIN;

        private List<String> fundDirection_IN;
        private List<String> fundDirection_NOTIN;

        private List<String> managType_IN;
        private List<String> managType_NOTIN;

        private List<PK> managerUserId_IN;
        private List<PK> managerUserId_NOTIN;


        private List<String> investmentField_IN;
        private List<String> investmentField_NOTIN;

        private List<String> incomeAllocation_IN;
        private List<String> incomeAllocation_NOTIN;

        private List<String> fundFiles_IN;
        private List<String> fundFiles_NOTIN;

        private List<String> remark_IN;
        private List<String> remark_NOTIN;
        private List<PK> depId_IN;
        private List<PK> depId_NOTIN;


        private List<String> organId_IN;
        private List<String> organId_NOTIN;

        private List<String> deleteFlag_IN;
        private List<String> deleteFlag_NOTIN;

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
        public TbFundQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TbFundQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TbFundQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TbFundQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TbFundQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TbFundQuery fundName(String fundName) {
            if(!IdUtils.isEmpty(fundName)){
                this.fundName = fundName;
            }
            return this;
        }

        @Override
        public TbFundQuery fundNameNot(String fundNameNot) {
            if(!IdUtils.isEmpty(fundNameNot)){
                this.fundName_NE = fundNameNot;
            }
            return this;
        }

        @Override
        public TbFundQuery fundNameLike(String fundNameLike) {
            if(!IdUtils.isEmpty(fundNameLike)){
                this.fundName_LIKE = fundNameLike;
            }
            return this;
        }

        @Override
        public TbFundQuery fundNameNotLike(String fundNameNotLike) {
            if(!IdUtils.isEmpty(fundNameNotLike)){
                this.fundName_NOTLIKE = fundNameNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery fundNameIn(String fundNameIn) {
            if(!IdUtils.isEmpty(fundNameIn)){
                if(this.fundName_IN == null){
                    this.fundName_IN = new ArrayList<String>();
                }
                this.fundName_IN.add( fundNameIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundNameNotIn(String fundNameNotIn) {
            if(!IdUtils.isEmpty(fundNameNotIn)){
                if(this.fundName_NOTIN == null){
                    this.fundName_NOTIN = new ArrayList<String>();
                }
                this.fundName_NOTIN.add( fundNameNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundNameIsNull() {
            this.isNulls.add("fundName");
            return this;
        }

        @Override
        public TbFundQuery fundNameIsNotNull() {
            this.isNotNulls.add("fundName");
            return this;
        }



        @Override
        public TbFundQuery fundCode(String fundCode) {
            if(!IdUtils.isEmpty(fundCode)){
                this.fundCode = fundCode;
            }
            return this;
        }

        @Override
        public TbFundQuery fundCodeNot(String fundCodeNot) {
            if(!IdUtils.isEmpty(fundCodeNot)){
                this.fundCode_NE = fundCodeNot;
            }
            return this;
        }

        @Override
        public TbFundQuery fundCodeLike(String fundCodeLike) {
            if(!IdUtils.isEmpty(fundCodeLike)){
                this.fundCode_LIKE = fundCodeLike;
            }
            return this;
        }

        @Override
        public TbFundQuery fundCodeNotLike(String fundCodeNotLike) {
            if(!IdUtils.isEmpty(fundCodeNotLike)){
                this.fundCode_NOTLIKE = fundCodeNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery fundCodeIn(String fundCodeIn) {
            if(!IdUtils.isEmpty(fundCodeIn)){
                if(this.fundCode_IN == null){
                    this.fundCode_IN = new ArrayList<String>();
                }
                this.fundCode_IN.add( fundCodeIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundCodeNotIn(String fundCodeNotIn) {
            if(!IdUtils.isEmpty(fundCodeNotIn)){
                if(this.fundCode_NOTIN == null){
                    this.fundCode_NOTIN = new ArrayList<String>();
                }
                this.fundCode_NOTIN.add( fundCodeNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundCodeIsNull() {
            this.isNulls.add("fundCode");
            return this;
        }

        @Override
        public TbFundQuery fundCodeIsNotNull() {
            this.isNotNulls.add("fundCode");
            return this;
        }


        @Override
        public TbFundQuery fundType(String fundType) {
            if(!IdUtils.isEmpty(fundType)){
                this.fundType = fundType;
            }
            return this;
        }

        @Override
        public TbFundQuery fundTypeNot(String fundTypeNot) {
            if(!IdUtils.isEmpty(fundTypeNot)){
                this.fundType_NE = fundTypeNot;
            }
            return this;
        }

        @Override
        public TbFundQuery fundTypeIn(String fundTypeIn) {
            if(!IdUtils.isEmpty(fundTypeIn)){
                if(this.fundType_IN == null){
                    this.fundType_IN = new ArrayList<String>();
                }
                this.fundType_IN.add( fundTypeIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundTypeNotIn(String fundTypeNotIn) {
            if(!IdUtils.isEmpty(fundTypeNotIn)){
                if(this.fundType_NOTIN == null){
                    this.fundType_NOTIN = new ArrayList<String>();
                }
                this.fundType_NOTIN.add( fundTypeNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundTypeIsNull() {
            this.isNulls.add("fundType");
            return this;
        }

        @Override
        public TbFundQuery fundTypeIsNotNull() {
            this.isNotNulls.add("fundType");
            return this;
        }


        @Override
        public TbFundQuery fundDirection(String fundDirection) {
            if(!IdUtils.isEmpty(fundDirection)){
                this.fundDirection = fundDirection;
            }
            return this;
        }

        @Override
        public TbFundQuery fundDirectionNot(String fundDirectionNot) {
            if(!IdUtils.isEmpty(fundDirectionNot)){
                this.fundDirection_NE = fundDirectionNot;
            }
            return this;
        }

        @Override
        public TbFundQuery fundDirectionIn(String fundDirectionIn) {
            if(!IdUtils.isEmpty(fundDirectionIn)){
                if(this.fundDirection_IN == null){
                    this.fundDirection_IN = new ArrayList<String>();
                }
                this.fundDirection_IN.add( fundDirectionIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundDirectionNotIn(String fundDirectionNotIn) {
            if(!IdUtils.isEmpty(fundDirectionNotIn)){
                if(this.fundDirection_NOTIN == null){
                    this.fundDirection_NOTIN = new ArrayList<String>();
                }
                this.fundDirection_NOTIN.add( fundDirectionNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundDirectionIsNull() {
            this.isNulls.add("fundDirection");
            return this;
        }

        @Override
        public TbFundQuery fundDirectionIsNotNull() {
            this.isNotNulls.add("fundDirection");
            return this;
        }


        @Override
        public TbFundQuery startMoney(BigDecimal startMoney) {
            if(!IdUtils.isEmpty(startMoney)){
                this.startMoney = startMoney;
            }
            return this;
        }

        @Override
        public TbFundQuery startMoneyNot(BigDecimal startMoneyNot) {
            if(!IdUtils.isEmpty(startMoneyNot)){
                this.startMoney_NE = startMoneyNot;
            }
            return this;
        }

        @Override
        public TbFundQuery startMoneyGreaterThan(BigDecimal startMoneyGreaterThan){
            if(startMoneyGreaterThan != null){
                this.startMoney_GT = startMoneyGreaterThan;
            }
            return this;
        }

        @Override
        public TbFundQuery startMoneyGreaterEqual(BigDecimal startMoneyGreaterEqual){
            if(startMoneyGreaterEqual != null){
                this.startMoney_GE = startMoneyGreaterEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery startMoneyLessThan(BigDecimal startMoneyLessThan){
            if(startMoneyLessThan != null){
                this.startMoney_LT = startMoneyLessThan;
            }
            return this;
        }

        @Override
        public TbFundQuery startMoneyLessEqual(BigDecimal startMoneyLessEqual){
            if(startMoneyLessEqual != null){
                this.startMoney_LE = startMoneyLessEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery managType(String managType) {
            if(!IdUtils.isEmpty(managType)){
                this.managType = managType;
            }
            return this;
        }

        @Override
        public TbFundQuery managTypeNot(String managTypeNot) {
            if(!IdUtils.isEmpty(managTypeNot)){
                this.managType_NE = managTypeNot;
            }
            return this;
        }

        @Override
        public TbFundQuery managTypeIn(String managTypeIn) {
            if(!IdUtils.isEmpty(managTypeIn)){
                if(this.managType_IN == null){
                    this.managType_IN = new ArrayList<String>();
                }
                this.managType_IN.add( managTypeIn );
            }
            return this;
        }

        @Override
        public TbFundQuery managTypeNotIn(String managTypeNotIn) {
            if(!IdUtils.isEmpty(managTypeNotIn)){
                if(this.managType_NOTIN == null){
                    this.managType_NOTIN = new ArrayList<String>();
                }
                this.managType_NOTIN.add( managTypeNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery managTypeIsNull() {
            this.isNulls.add("managType");
            return this;
        }

        @Override
        public TbFundQuery managTypeIsNotNull() {
            this.isNotNulls.add("managType");
            return this;
        }


        @Override
        public TbFundQuery fundScale(BigDecimal fundScale) {
            if(!IdUtils.isEmpty(fundScale)){
                this.fundScale = fundScale;
            }
            return this;
        }

        @Override
        public TbFundQuery fundScaleNot(BigDecimal fundScaleNot) {
            if(!IdUtils.isEmpty(fundScaleNot)){
                this.fundScale_NE = fundScaleNot;
            }
            return this;
        }

        @Override
        public TbFundQuery fundScaleGreaterThan(BigDecimal fundScaleGreaterThan){
            if(fundScaleGreaterThan != null){
                this.fundScale_GT = fundScaleGreaterThan;
            }
            return this;
        }

        @Override
        public TbFundQuery fundScaleGreaterEqual(BigDecimal fundScaleGreaterEqual){
            if(fundScaleGreaterEqual != null){
                this.fundScale_GE = fundScaleGreaterEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery fundScaleLessThan(BigDecimal fundScaleLessThan){
            if(fundScaleLessThan != null){
                this.fundScale_LT = fundScaleLessThan;
            }
            return this;
        }

        @Override
        public TbFundQuery fundScaleLessEqual(BigDecimal fundScaleLessEqual){
            if(fundScaleLessEqual != null){
                this.fundScale_LE = fundScaleLessEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery managerUserId(PK managerUserId) {
            if(!IdUtils.isEmpty(managerUserId)){
                this.managerUserId = managerUserId;
            }
            return this;
        }

        @Override
        public TbFundQuery managerUserIdNot(PK managerUserIdNot) {
            if(!IdUtils.isEmpty(managerUserIdNot)){
                this.managerUserId_NE = managerUserIdNot;
            }
            return this;
        }

        @Override
        public TbFundQuery managerUserIdIn(PK managerUserIdIn) {
            if(!IdUtils.isEmpty(managerUserIdIn)){
                if(this.managerUserId_IN == null){
                    this.managerUserId_IN = new ArrayList<PK>();
                }
                this.managerUserId_IN.add( managerUserIdIn );
            }
            return this;
        }

        @Override
        public TbFundQuery managerUserIdNotIn(PK managerUserIdNotIn) {
            if(!IdUtils.isEmpty(managerUserIdNotIn)){
                if(this.managerUserId_NOTIN == null){
                    this.managerUserId_NOTIN = new ArrayList<PK>();
                }
                this.managerUserId_NOTIN.add( managerUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery managerUserIdIsNull() {
            this.isNulls.add("managerUserId");
            return this;
        }

        @Override
        public TbFundQuery managerUserIdIsNotNull() {
            this.isNotNulls.add("managerUserId");
            return this;
        }


        @Override
        public TbFundQuery startDate(Date startDate) {
            if(!IdUtils.isEmpty(startDate)){
                this.startDate = startDate;
            }
            return this;
        }

        @Override
        public TbFundQuery startDateNot(Date startDateNot) {
            if(!IdUtils.isEmpty(startDateNot)){
                this.startDate_NE = startDateNot;
            }
            return this;
        }

        @Override
        public TbFundQuery startDateGreaterThan(Date startDateGreaterThan){
            if(startDateGreaterThan != null){
                this.startDate_GT = startDateGreaterThan;
            }
            return this;
        }


        @Override
        public TbFundQuery startDateGreaterEqual(Date startDateGreaterEqual){
            if(startDateGreaterEqual != null){
                this.startDate_GE = startDateGreaterEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery startDateLessThan(Date startDateLessThan){
            if(startDateLessThan != null){
                this.startDate_LT = startDateLessThan;
            }
            return this;
        }

        @Override
        public TbFundQuery startDateLessEqual(Date startDateLessEqual){
            if(startDateLessEqual != null){
                this.startDate_LE = startDateLessEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery endDate(Date endDate) {
            if(!IdUtils.isEmpty(endDate)){
                this.endDate = endDate;
            }
            return this;
        }

        @Override
        public TbFundQuery endDateNot(Date endDateNot) {
            if(!IdUtils.isEmpty(endDateNot)){
                this.endDate_NE = endDateNot;
            }
            return this;
        }

        @Override
        public TbFundQuery endDateGreaterThan(Date endDateGreaterThan){
            if(endDateGreaterThan != null){
                this.endDate_GT = endDateGreaterThan;
            }
            return this;
        }


        @Override
        public TbFundQuery endDateGreaterEqual(Date endDateGreaterEqual){
            if(endDateGreaterEqual != null){
                this.endDate_GE = endDateGreaterEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery endDateLessThan(Date endDateLessThan){
            if(endDateLessThan != null){
                this.endDate_LT = endDateLessThan;
            }
            return this;
        }

        @Override
        public TbFundQuery endDateLessEqual(Date endDateLessEqual){
            if(endDateLessEqual != null){
                this.endDate_LE = endDateLessEqual;
            }
            return this;
        }


        @Override
        public TbFundQuery investmentField(String investmentField) {
            if(!IdUtils.isEmpty(investmentField)){
                this.investmentField = investmentField;
            }
            return this;
        }

        @Override
        public TbFundQuery investmentFieldNot(String investmentFieldNot) {
            if(!IdUtils.isEmpty(investmentFieldNot)){
                this.investmentField_NE = investmentFieldNot;
            }
            return this;
        }

        @Override
        public TbFundQuery investmentFieldLike(String investmentFieldLike) {
            if(!IdUtils.isEmpty(investmentFieldLike)){
                this.investmentField_LIKE = investmentFieldLike;
            }
            return this;
        }

        @Override
        public TbFundQuery investmentFieldNotLike(String investmentFieldNotLike) {
            if(!IdUtils.isEmpty(investmentFieldNotLike)){
                this.investmentField_NOTLIKE = investmentFieldNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery investmentFieldIn(String investmentFieldIn) {
            if(!IdUtils.isEmpty(investmentFieldIn)){
                if(this.investmentField_IN == null){
                    this.investmentField_IN = new ArrayList<String>();
                }
                this.investmentField_IN.add( investmentFieldIn );
            }
            return this;
        }

        @Override
        public TbFundQuery investmentFieldNotIn(String investmentFieldNotIn) {
            if(!IdUtils.isEmpty(investmentFieldNotIn)){
                if(this.investmentField_NOTIN == null){
                    this.investmentField_NOTIN = new ArrayList<String>();
                }
                this.investmentField_NOTIN.add( investmentFieldNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery investmentFieldIsNull() {
            this.isNulls.add("investmentField");
            return this;
        }

        @Override
        public TbFundQuery investmentFieldIsNotNull() {
            this.isNotNulls.add("investmentField");
            return this;
        }



        @Override
        public TbFundQuery incomeAllocation(String incomeAllocation) {
            if(!IdUtils.isEmpty(incomeAllocation)){
                this.incomeAllocation = incomeAllocation;
            }
            return this;
        }

        @Override
        public TbFundQuery incomeAllocationNot(String incomeAllocationNot) {
            if(!IdUtils.isEmpty(incomeAllocationNot)){
                this.incomeAllocation_NE = incomeAllocationNot;
            }
            return this;
        }

        @Override
        public TbFundQuery incomeAllocationLike(String incomeAllocationLike) {
            if(!IdUtils.isEmpty(incomeAllocationLike)){
                this.incomeAllocation_LIKE = incomeAllocationLike;
            }
            return this;
        }

        @Override
        public TbFundQuery incomeAllocationNotLike(String incomeAllocationNotLike) {
            if(!IdUtils.isEmpty(incomeAllocationNotLike)){
                this.incomeAllocation_NOTLIKE = incomeAllocationNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery incomeAllocationIn(String incomeAllocationIn) {
            if(!IdUtils.isEmpty(incomeAllocationIn)){
                if(this.incomeAllocation_IN == null){
                    this.incomeAllocation_IN = new ArrayList<String>();
                }
                this.incomeAllocation_IN.add( incomeAllocationIn );
            }
            return this;
        }

        @Override
        public TbFundQuery incomeAllocationNotIn(String incomeAllocationNotIn) {
            if(!IdUtils.isEmpty(incomeAllocationNotIn)){
                if(this.incomeAllocation_NOTIN == null){
                    this.incomeAllocation_NOTIN = new ArrayList<String>();
                }
                this.incomeAllocation_NOTIN.add( incomeAllocationNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery incomeAllocationIsNull() {
            this.isNulls.add("incomeAllocation");
            return this;
        }

        @Override
        public TbFundQuery incomeAllocationIsNotNull() {
            this.isNotNulls.add("incomeAllocation");
            return this;
        }



        @Override
        public TbFundQuery fundFiles(String fundFiles) {
            if(!IdUtils.isEmpty(fundFiles)){
                this.fundFiles = fundFiles;
            }
            return this;
        }

        @Override
        public TbFundQuery fundFilesNot(String fundFilesNot) {
            if(!IdUtils.isEmpty(fundFilesNot)){
                this.fundFiles_NE = fundFilesNot;
            }
            return this;
        }

        @Override
        public TbFundQuery fundFilesLike(String fundFilesLike) {
            if(!IdUtils.isEmpty(fundFilesLike)){
                this.fundFiles_LIKE = fundFilesLike;
            }
            return this;
        }

        @Override
        public TbFundQuery fundFilesNotLike(String fundFilesNotLike) {
            if(!IdUtils.isEmpty(fundFilesNotLike)){
                this.fundFiles_NOTLIKE = fundFilesNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery fundFilesIn(String fundFilesIn) {
            if(!IdUtils.isEmpty(fundFilesIn)){
                if(this.fundFiles_IN == null){
                    this.fundFiles_IN = new ArrayList<String>();
                }
                this.fundFiles_IN.add( fundFilesIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundFilesNotIn(String fundFilesNotIn) {
            if(!IdUtils.isEmpty(fundFilesNotIn)){
                if(this.fundFiles_NOTIN == null){
                    this.fundFiles_NOTIN = new ArrayList<String>();
                }
                this.fundFiles_NOTIN.add( fundFilesNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery fundFilesIsNull() {
            this.isNulls.add("fundFiles");
            return this;
        }

        @Override
        public TbFundQuery fundFilesIsNotNull() {
            this.isNotNulls.add("fundFiles");
            return this;
        }



        @Override
        public TbFundQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TbFundQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TbFundQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TbFundQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TbFundQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TbFundQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }


        @Override
        public TbFundQuery depId(PK depId) {
            if(!IdUtils.isEmpty(depId)){
                this.depId = depId;
            }
            return this;
        }

        @Override
        public TbFundQuery depIdNot(PK depIdNot) {
            if(!IdUtils.isEmpty(depIdNot)){
                this.depId_NE = depIdNot;
            }
            return this;
        }

        @Override
        public TbFundQuery depIdIn(PK depIdIn) {
            if(!IdUtils.isEmpty(depIdIn)){
                if(this.depId_IN == null){
                    this.depId_IN = new ArrayList<PK>();
                }
                this.depId_IN.add( depIdIn );
            }
            return this;
        }

        @Override
        public TbFundQuery depIdNotIn(PK depIdNotIn) {
            if(!IdUtils.isEmpty(depIdNotIn)){
                if(this.depId_NOTIN == null){
                    this.depId_NOTIN = new ArrayList<PK>();
                }
                this.depId_NOTIN.add( depIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery depIdIsNull() {
            this.isNulls.add("depId");
            return this;
        }

        @Override
        public TbFundQuery depIdIsNotNull() {
            this.isNotNulls.add("depId");
            return this;
        }



        @Override
        public TbFundQuery organId(String organId) {
            if(!IdUtils.isEmpty(organId)){
                this.organId = organId;
            }
            return this;
        }

        @Override
        public TbFundQuery organIdNot(String organIdNot) {
            if(!IdUtils.isEmpty(organIdNot)){
                this.organId_NE = organIdNot;
            }
            return this;
        }

        @Override
        public TbFundQuery organIdLike(String organIdLike) {
            if(!IdUtils.isEmpty(organIdLike)){
                this.organId_LIKE = organIdLike;
            }
            return this;
        }

        @Override
        public TbFundQuery organIdNotLike(String organIdNotLike) {
            if(!IdUtils.isEmpty(organIdNotLike)){
                this.organId_NOTLIKE = organIdNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery organIdIn(String organIdIn) {
            if(!IdUtils.isEmpty(organIdIn)){
                if(this.organId_IN == null){
                    this.organId_IN = new ArrayList<String>();
                }
                this.organId_IN.add( organIdIn );
            }
            return this;
        }

        @Override
        public TbFundQuery organIdNotIn(String organIdNotIn) {
            if(!IdUtils.isEmpty(organIdNotIn)){
                if(this.organId_NOTIN == null){
                    this.organId_NOTIN = new ArrayList<String>();
                }
                this.organId_NOTIN.add( organIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery organIdIsNull() {
            this.isNulls.add("organId");
            return this;
        }

        @Override
        public TbFundQuery organIdIsNotNull() {
            this.isNotNulls.add("organId");
            return this;
        }



        @Override
        public TbFundQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TbFundQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TbFundQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TbFundQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TbFundQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TbFundQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TbFundQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TbFundQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TbFundQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TbFundQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TbFundQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TbFundQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TbFundQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TbFundQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TbFundQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TbFundQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TbFundQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TbFundQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TbFundQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TbFundQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TbFundQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TbFundQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TbFundQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TbFundQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TbFundQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TbFundQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TbFundQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TbFundQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TbFundQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TbFundQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TbFundQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TbFundQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TbFundQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TbFundQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TbFundQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TbFundQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TbFundQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public TbFundQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TbFundQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TbFundQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TbFundQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TbFundQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TbFundQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TbFundQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}