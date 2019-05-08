package com.zz.bms.example.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.example.domain.TbOutMoneyEntity;
import com.zz.bms.example.query.TbOutMoneyQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 出资明细 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-5-8 13:45:41
*/
public class TbOutMoneyQueryImpl<PK extends Serializable> extends TbOutMoneyAbstractQueryImpl<PK> implements TbOutMoneyQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> investorAgreementId_IN;
        private List<PK> investorAgreementId_NOTIN;

        private List<PK> fundId_IN;
        private List<PK> fundId_NOTIN;

        private List<PK> investorId_IN;
        private List<PK> investorId_NOTIN;

        private List<PK> handleDepId_IN;
        private List<PK> handleDepId_NOTIN;


        private List<String> handleOrganId_IN;
        private List<String> handleOrganId_NOTIN;
        private List<PK> handleUserId_IN;
        private List<PK> handleUserId_NOTIN;


        private List<String> outMoneyFiles_IN;
        private List<String> outMoneyFiles_NOTIN;

        private List<String> remark_IN;
        private List<String> remark_NOTIN;

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
        public TbOutMoneyQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TbOutMoneyQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TbOutMoneyQuery investorAgreementId(PK investorAgreementId) {
            if(!IdUtils.isEmpty(investorAgreementId)){
                this.investorAgreementId = investorAgreementId;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery investorAgreementIdNot(PK investorAgreementIdNot) {
            if(!IdUtils.isEmpty(investorAgreementIdNot)){
                this.investorAgreementId_NE = investorAgreementIdNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery investorAgreementIdIn(PK investorAgreementIdIn) {
            if(!IdUtils.isEmpty(investorAgreementIdIn)){
                if(this.investorAgreementId_IN == null){
                    this.investorAgreementId_IN = new ArrayList<PK>();
                }
                this.investorAgreementId_IN.add( investorAgreementIdIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery investorAgreementIdNotIn(PK investorAgreementIdNotIn) {
            if(!IdUtils.isEmpty(investorAgreementIdNotIn)){
                if(this.investorAgreementId_NOTIN == null){
                    this.investorAgreementId_NOTIN = new ArrayList<PK>();
                }
                this.investorAgreementId_NOTIN.add( investorAgreementIdNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery investorAgreementIdIsNull() {
            this.isNulls.add("investorAgreementId");
            return this;
        }

        @Override
        public TbOutMoneyQuery investorAgreementIdIsNotNull() {
            this.isNotNulls.add("investorAgreementId");
            return this;
        }


        @Override
        public TbOutMoneyQuery fundId(PK fundId) {
            if(!IdUtils.isEmpty(fundId)){
                this.fundId = fundId;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery fundIdNot(PK fundIdNot) {
            if(!IdUtils.isEmpty(fundIdNot)){
                this.fundId_NE = fundIdNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery fundIdIn(PK fundIdIn) {
            if(!IdUtils.isEmpty(fundIdIn)){
                if(this.fundId_IN == null){
                    this.fundId_IN = new ArrayList<PK>();
                }
                this.fundId_IN.add( fundIdIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery fundIdNotIn(PK fundIdNotIn) {
            if(!IdUtils.isEmpty(fundIdNotIn)){
                if(this.fundId_NOTIN == null){
                    this.fundId_NOTIN = new ArrayList<PK>();
                }
                this.fundId_NOTIN.add( fundIdNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery fundIdIsNull() {
            this.isNulls.add("fundId");
            return this;
        }

        @Override
        public TbOutMoneyQuery fundIdIsNotNull() {
            this.isNotNulls.add("fundId");
            return this;
        }


        @Override
        public TbOutMoneyQuery investorId(PK investorId) {
            if(!IdUtils.isEmpty(investorId)){
                this.investorId = investorId;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery investorIdNot(PK investorIdNot) {
            if(!IdUtils.isEmpty(investorIdNot)){
                this.investorId_NE = investorIdNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery investorIdIn(PK investorIdIn) {
            if(!IdUtils.isEmpty(investorIdIn)){
                if(this.investorId_IN == null){
                    this.investorId_IN = new ArrayList<PK>();
                }
                this.investorId_IN.add( investorIdIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery investorIdNotIn(PK investorIdNotIn) {
            if(!IdUtils.isEmpty(investorIdNotIn)){
                if(this.investorId_NOTIN == null){
                    this.investorId_NOTIN = new ArrayList<PK>();
                }
                this.investorId_NOTIN.add( investorIdNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery investorIdIsNull() {
            this.isNulls.add("investorId");
            return this;
        }

        @Override
        public TbOutMoneyQuery investorIdIsNotNull() {
            this.isNotNulls.add("investorId");
            return this;
        }


        @Override
        public TbOutMoneyQuery actualAmount(BigDecimal actualAmount) {
            if(!IdUtils.isEmpty(actualAmount)){
                this.actualAmount = actualAmount;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery actualAmountNot(BigDecimal actualAmountNot) {
            if(!IdUtils.isEmpty(actualAmountNot)){
                this.actualAmount_NE = actualAmountNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery actualAmountGreaterThan(BigDecimal actualAmountGreaterThan){
            if(actualAmountGreaterThan != null){
                this.actualAmount_GT = actualAmountGreaterThan;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery actualAmountGreaterEqual(BigDecimal actualAmountGreaterEqual){
            if(actualAmountGreaterEqual != null){
                this.actualAmount_GE = actualAmountGreaterEqual;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery actualAmountLessThan(BigDecimal actualAmountLessThan){
            if(actualAmountLessThan != null){
                this.actualAmount_LT = actualAmountLessThan;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery actualAmountLessEqual(BigDecimal actualAmountLessEqual){
            if(actualAmountLessEqual != null){
                this.actualAmount_LE = actualAmountLessEqual;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleDepId(PK handleDepId) {
            if(!IdUtils.isEmpty(handleDepId)){
                this.handleDepId = handleDepId;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleDepIdNot(PK handleDepIdNot) {
            if(!IdUtils.isEmpty(handleDepIdNot)){
                this.handleDepId_NE = handleDepIdNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleDepIdIn(PK handleDepIdIn) {
            if(!IdUtils.isEmpty(handleDepIdIn)){
                if(this.handleDepId_IN == null){
                    this.handleDepId_IN = new ArrayList<PK>();
                }
                this.handleDepId_IN.add( handleDepIdIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleDepIdNotIn(PK handleDepIdNotIn) {
            if(!IdUtils.isEmpty(handleDepIdNotIn)){
                if(this.handleDepId_NOTIN == null){
                    this.handleDepId_NOTIN = new ArrayList<PK>();
                }
                this.handleDepId_NOTIN.add( handleDepIdNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleDepIdIsNull() {
            this.isNulls.add("handleDepId");
            return this;
        }

        @Override
        public TbOutMoneyQuery handleDepIdIsNotNull() {
            this.isNotNulls.add("handleDepId");
            return this;
        }



        @Override
        public TbOutMoneyQuery handleOrganId(String handleOrganId) {
            if(!IdUtils.isEmpty(handleOrganId)){
                this.handleOrganId = handleOrganId;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleOrganIdNot(String handleOrganIdNot) {
            if(!IdUtils.isEmpty(handleOrganIdNot)){
                this.handleOrganId_NE = handleOrganIdNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleOrganIdLike(String handleOrganIdLike) {
            if(!IdUtils.isEmpty(handleOrganIdLike)){
                this.handleOrganId_LIKE = handleOrganIdLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleOrganIdNotLike(String handleOrganIdNotLike) {
            if(!IdUtils.isEmpty(handleOrganIdNotLike)){
                this.handleOrganId_NOTLIKE = handleOrganIdNotLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleOrganIdIn(String handleOrganIdIn) {
            if(!IdUtils.isEmpty(handleOrganIdIn)){
                if(this.handleOrganId_IN == null){
                    this.handleOrganId_IN = new ArrayList<String>();
                }
                this.handleOrganId_IN.add( handleOrganIdIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleOrganIdNotIn(String handleOrganIdNotIn) {
            if(!IdUtils.isEmpty(handleOrganIdNotIn)){
                if(this.handleOrganId_NOTIN == null){
                    this.handleOrganId_NOTIN = new ArrayList<String>();
                }
                this.handleOrganId_NOTIN.add( handleOrganIdNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleOrganIdIsNull() {
            this.isNulls.add("handleOrganId");
            return this;
        }

        @Override
        public TbOutMoneyQuery handleOrganIdIsNotNull() {
            this.isNotNulls.add("handleOrganId");
            return this;
        }


        @Override
        public TbOutMoneyQuery handleUserId(PK handleUserId) {
            if(!IdUtils.isEmpty(handleUserId)){
                this.handleUserId = handleUserId;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleUserIdNot(PK handleUserIdNot) {
            if(!IdUtils.isEmpty(handleUserIdNot)){
                this.handleUserId_NE = handleUserIdNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleUserIdIn(PK handleUserIdIn) {
            if(!IdUtils.isEmpty(handleUserIdIn)){
                if(this.handleUserId_IN == null){
                    this.handleUserId_IN = new ArrayList<PK>();
                }
                this.handleUserId_IN.add( handleUserIdIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleUserIdNotIn(PK handleUserIdNotIn) {
            if(!IdUtils.isEmpty(handleUserIdNotIn)){
                if(this.handleUserId_NOTIN == null){
                    this.handleUserId_NOTIN = new ArrayList<PK>();
                }
                this.handleUserId_NOTIN.add( handleUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery handleUserIdIsNull() {
            this.isNulls.add("handleUserId");
            return this;
        }

        @Override
        public TbOutMoneyQuery handleUserIdIsNotNull() {
            this.isNotNulls.add("handleUserId");
            return this;
        }


        @Override
        public TbOutMoneyQuery arrivalAccountDate(Date arrivalAccountDate) {
            if(!IdUtils.isEmpty(arrivalAccountDate)){
                this.arrivalAccountDate = arrivalAccountDate;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery arrivalAccountDateNot(Date arrivalAccountDateNot) {
            if(!IdUtils.isEmpty(arrivalAccountDateNot)){
                this.arrivalAccountDate_NE = arrivalAccountDateNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery arrivalAccountDateGreaterThan(Date arrivalAccountDateGreaterThan){
            if(arrivalAccountDateGreaterThan != null){
                this.arrivalAccountDate_GT = arrivalAccountDateGreaterThan;
            }
            return this;
        }


        @Override
        public TbOutMoneyQuery arrivalAccountDateGreaterEqual(Date arrivalAccountDateGreaterEqual){
            if(arrivalAccountDateGreaterEqual != null){
                this.arrivalAccountDate_GE = arrivalAccountDateGreaterEqual;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery arrivalAccountDateLessThan(Date arrivalAccountDateLessThan){
            if(arrivalAccountDateLessThan != null){
                this.arrivalAccountDate_LT = arrivalAccountDateLessThan;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery arrivalAccountDateLessEqual(Date arrivalAccountDateLessEqual){
            if(arrivalAccountDateLessEqual != null){
                this.arrivalAccountDate_LE = arrivalAccountDateLessEqual;
            }
            return this;
        }


        @Override
        public TbOutMoneyQuery outMoneyFiles(String outMoneyFiles) {
            if(!IdUtils.isEmpty(outMoneyFiles)){
                this.outMoneyFiles = outMoneyFiles;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery outMoneyFilesNot(String outMoneyFilesNot) {
            if(!IdUtils.isEmpty(outMoneyFilesNot)){
                this.outMoneyFiles_NE = outMoneyFilesNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery outMoneyFilesLike(String outMoneyFilesLike) {
            if(!IdUtils.isEmpty(outMoneyFilesLike)){
                this.outMoneyFiles_LIKE = outMoneyFilesLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery outMoneyFilesNotLike(String outMoneyFilesNotLike) {
            if(!IdUtils.isEmpty(outMoneyFilesNotLike)){
                this.outMoneyFiles_NOTLIKE = outMoneyFilesNotLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery outMoneyFilesIn(String outMoneyFilesIn) {
            if(!IdUtils.isEmpty(outMoneyFilesIn)){
                if(this.outMoneyFiles_IN == null){
                    this.outMoneyFiles_IN = new ArrayList<String>();
                }
                this.outMoneyFiles_IN.add( outMoneyFilesIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery outMoneyFilesNotIn(String outMoneyFilesNotIn) {
            if(!IdUtils.isEmpty(outMoneyFilesNotIn)){
                if(this.outMoneyFiles_NOTIN == null){
                    this.outMoneyFiles_NOTIN = new ArrayList<String>();
                }
                this.outMoneyFiles_NOTIN.add( outMoneyFilesNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery outMoneyFilesIsNull() {
            this.isNulls.add("outMoneyFiles");
            return this;
        }

        @Override
        public TbOutMoneyQuery outMoneyFilesIsNotNull() {
            this.isNotNulls.add("outMoneyFiles");
            return this;
        }



        @Override
        public TbOutMoneyQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TbOutMoneyQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TbOutMoneyQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TbOutMoneyQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TbOutMoneyQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TbOutMoneyQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TbOutMoneyQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TbOutMoneyQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TbOutMoneyQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TbOutMoneyQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TbOutMoneyQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TbOutMoneyQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TbOutMoneyQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TbOutMoneyQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public TbOutMoneyQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TbOutMoneyQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TbOutMoneyQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}