package com.zz.bms.example.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.example.domain.TbInvestorAgreementEntity;
import com.zz.bms.example.query.TbInvestorAgreementQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 投资协议 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-5-2 18:36:10
*/
public class TbInvestorAgreementQueryImpl<PK extends Serializable> extends TbInvestorAgreementAbstractQueryImpl<PK> implements TbInvestorAgreementQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> agreementName_IN;
        private List<String> agreementName_NOTIN;

        private List<String> agreementCode_IN;
        private List<String> agreementCode_NOTIN;
        private List<PK> fundId_IN;
        private List<PK> fundId_NOTIN;

        private List<PK> investorId_IN;
        private List<PK> investorId_NOTIN;


        private List<String> sketch_IN;
        private List<String> sketch_NOTIN;

        private List<String> signDepId_IN;
        private List<String> signDepId_NOTIN;

        private List<String> signOrganId_IN;
        private List<String> signOrganId_NOTIN;

        private List<String> signUserId_IN;
        private List<String> signUserId_NOTIN;

        private List<String> agreementFiles_IN;
        private List<String> agreementFiles_NOTIN;

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
        public TbInvestorAgreementQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery agreementName(String agreementName) {
            if(!IdUtils.isEmpty(agreementName)){
                this.agreementName = agreementName;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementNameNot(String agreementNameNot) {
            if(!IdUtils.isEmpty(agreementNameNot)){
                this.agreementName_NE = agreementNameNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementNameLike(String agreementNameLike) {
            if(!IdUtils.isEmpty(agreementNameLike)){
                this.agreementName_LIKE = agreementNameLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementNameNotLike(String agreementNameNotLike) {
            if(!IdUtils.isEmpty(agreementNameNotLike)){
                this.agreementName_NOTLIKE = agreementNameNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementNameIn(String agreementNameIn) {
            if(!IdUtils.isEmpty(agreementNameIn)){
                if(this.agreementName_IN == null){
                    this.agreementName_IN = new ArrayList<String>();
                }
                this.agreementName_IN.add( agreementNameIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementNameNotIn(String agreementNameNotIn) {
            if(!IdUtils.isEmpty(agreementNameNotIn)){
                if(this.agreementName_NOTIN == null){
                    this.agreementName_NOTIN = new ArrayList<String>();
                }
                this.agreementName_NOTIN.add( agreementNameNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementNameIsNull() {
            this.isNulls.add("agreementName");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementNameIsNotNull() {
            this.isNotNulls.add("agreementName");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery agreementCode(String agreementCode) {
            if(!IdUtils.isEmpty(agreementCode)){
                this.agreementCode = agreementCode;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementCodeNot(String agreementCodeNot) {
            if(!IdUtils.isEmpty(agreementCodeNot)){
                this.agreementCode_NE = agreementCodeNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementCodeLike(String agreementCodeLike) {
            if(!IdUtils.isEmpty(agreementCodeLike)){
                this.agreementCode_LIKE = agreementCodeLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementCodeNotLike(String agreementCodeNotLike) {
            if(!IdUtils.isEmpty(agreementCodeNotLike)){
                this.agreementCode_NOTLIKE = agreementCodeNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementCodeIn(String agreementCodeIn) {
            if(!IdUtils.isEmpty(agreementCodeIn)){
                if(this.agreementCode_IN == null){
                    this.agreementCode_IN = new ArrayList<String>();
                }
                this.agreementCode_IN.add( agreementCodeIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementCodeNotIn(String agreementCodeNotIn) {
            if(!IdUtils.isEmpty(agreementCodeNotIn)){
                if(this.agreementCode_NOTIN == null){
                    this.agreementCode_NOTIN = new ArrayList<String>();
                }
                this.agreementCode_NOTIN.add( agreementCodeNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementCodeIsNull() {
            this.isNulls.add("agreementCode");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementCodeIsNotNull() {
            this.isNotNulls.add("agreementCode");
            return this;
        }


        @Override
        public TbInvestorAgreementQuery fundId(PK fundId) {
            if(!IdUtils.isEmpty(fundId)){
                this.fundId = fundId;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery fundIdNot(PK fundIdNot) {
            if(!IdUtils.isEmpty(fundIdNot)){
                this.fundId_NE = fundIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery fundIdIn(PK fundIdIn) {
            if(!IdUtils.isEmpty(fundIdIn)){
                if(this.fundId_IN == null){
                    this.fundId_IN = new ArrayList<PK>();
                }
                this.fundId_IN.add( fundIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery fundIdNotIn(PK fundIdNotIn) {
            if(!IdUtils.isEmpty(fundIdNotIn)){
                if(this.fundId_NOTIN == null){
                    this.fundId_NOTIN = new ArrayList<PK>();
                }
                this.fundId_NOTIN.add( fundIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery fundIdIsNull() {
            this.isNulls.add("fundId");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery fundIdIsNotNull() {
            this.isNotNulls.add("fundId");
            return this;
        }


        @Override
        public TbInvestorAgreementQuery investorId(PK investorId) {
            if(!IdUtils.isEmpty(investorId)){
                this.investorId = investorId;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery investorIdNot(PK investorIdNot) {
            if(!IdUtils.isEmpty(investorIdNot)){
                this.investorId_NE = investorIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery investorIdIn(PK investorIdIn) {
            if(!IdUtils.isEmpty(investorIdIn)){
                if(this.investorId_IN == null){
                    this.investorId_IN = new ArrayList<PK>();
                }
                this.investorId_IN.add( investorIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery investorIdNotIn(PK investorIdNotIn) {
            if(!IdUtils.isEmpty(investorIdNotIn)){
                if(this.investorId_NOTIN == null){
                    this.investorId_NOTIN = new ArrayList<PK>();
                }
                this.investorId_NOTIN.add( investorIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery investorIdIsNull() {
            this.isNulls.add("investorId");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery investorIdIsNotNull() {
            this.isNotNulls.add("investorId");
            return this;
        }


        @Override
        public TbInvestorAgreementQuery amount(BigDecimal amount) {
            if(!IdUtils.isEmpty(amount)){
                this.amount = amount;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery amountNot(BigDecimal amountNot) {
            if(!IdUtils.isEmpty(amountNot)){
                this.amount_NE = amountNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery amountGreaterThan(BigDecimal amountGreaterThan){
            if(amountGreaterThan != null){
                this.amount_GT = amountGreaterThan;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery amountGreaterEqual(BigDecimal amountGreaterEqual){
            if(amountGreaterEqual != null){
                this.amount_GE = amountGreaterEqual;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery amountLessThan(BigDecimal amountLessThan){
            if(amountLessThan != null){
                this.amount_LT = amountLessThan;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery amountLessEqual(BigDecimal amountLessEqual){
            if(amountLessEqual != null){
                this.amount_LE = amountLessEqual;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery actualAmount(BigDecimal actualAmount) {
            if(!IdUtils.isEmpty(actualAmount)){
                this.actualAmount = actualAmount;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery actualAmountNot(BigDecimal actualAmountNot) {
            if(!IdUtils.isEmpty(actualAmountNot)){
                this.actualAmount_NE = actualAmountNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery actualAmountGreaterThan(BigDecimal actualAmountGreaterThan){
            if(actualAmountGreaterThan != null){
                this.actualAmount_GT = actualAmountGreaterThan;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery actualAmountGreaterEqual(BigDecimal actualAmountGreaterEqual){
            if(actualAmountGreaterEqual != null){
                this.actualAmount_GE = actualAmountGreaterEqual;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery actualAmountLessThan(BigDecimal actualAmountLessThan){
            if(actualAmountLessThan != null){
                this.actualAmount_LT = actualAmountLessThan;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery actualAmountLessEqual(BigDecimal actualAmountLessEqual){
            if(actualAmountLessEqual != null){
                this.actualAmount_LE = actualAmountLessEqual;
            }
            return this;
        }


        @Override
        public TbInvestorAgreementQuery sketch(String sketch) {
            if(!IdUtils.isEmpty(sketch)){
                this.sketch = sketch;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery sketchNot(String sketchNot) {
            if(!IdUtils.isEmpty(sketchNot)){
                this.sketch_NE = sketchNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery sketchLike(String sketchLike) {
            if(!IdUtils.isEmpty(sketchLike)){
                this.sketch_LIKE = sketchLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery sketchNotLike(String sketchNotLike) {
            if(!IdUtils.isEmpty(sketchNotLike)){
                this.sketch_NOTLIKE = sketchNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery sketchIn(String sketchIn) {
            if(!IdUtils.isEmpty(sketchIn)){
                if(this.sketch_IN == null){
                    this.sketch_IN = new ArrayList<String>();
                }
                this.sketch_IN.add( sketchIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery sketchNotIn(String sketchNotIn) {
            if(!IdUtils.isEmpty(sketchNotIn)){
                if(this.sketch_NOTIN == null){
                    this.sketch_NOTIN = new ArrayList<String>();
                }
                this.sketch_NOTIN.add( sketchNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery sketchIsNull() {
            this.isNulls.add("sketch");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery sketchIsNotNull() {
            this.isNotNulls.add("sketch");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery signDepId(String signDepId) {
            if(!IdUtils.isEmpty(signDepId)){
                this.signDepId = signDepId;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDepIdNot(String signDepIdNot) {
            if(!IdUtils.isEmpty(signDepIdNot)){
                this.signDepId_NE = signDepIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDepIdLike(String signDepIdLike) {
            if(!IdUtils.isEmpty(signDepIdLike)){
                this.signDepId_LIKE = signDepIdLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDepIdNotLike(String signDepIdNotLike) {
            if(!IdUtils.isEmpty(signDepIdNotLike)){
                this.signDepId_NOTLIKE = signDepIdNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDepIdIn(String signDepIdIn) {
            if(!IdUtils.isEmpty(signDepIdIn)){
                if(this.signDepId_IN == null){
                    this.signDepId_IN = new ArrayList<String>();
                }
                this.signDepId_IN.add( signDepIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDepIdNotIn(String signDepIdNotIn) {
            if(!IdUtils.isEmpty(signDepIdNotIn)){
                if(this.signDepId_NOTIN == null){
                    this.signDepId_NOTIN = new ArrayList<String>();
                }
                this.signDepId_NOTIN.add( signDepIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDepIdIsNull() {
            this.isNulls.add("signDepId");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDepIdIsNotNull() {
            this.isNotNulls.add("signDepId");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery signOrganId(String signOrganId) {
            if(!IdUtils.isEmpty(signOrganId)){
                this.signOrganId = signOrganId;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signOrganIdNot(String signOrganIdNot) {
            if(!IdUtils.isEmpty(signOrganIdNot)){
                this.signOrganId_NE = signOrganIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signOrganIdLike(String signOrganIdLike) {
            if(!IdUtils.isEmpty(signOrganIdLike)){
                this.signOrganId_LIKE = signOrganIdLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signOrganIdNotLike(String signOrganIdNotLike) {
            if(!IdUtils.isEmpty(signOrganIdNotLike)){
                this.signOrganId_NOTLIKE = signOrganIdNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signOrganIdIn(String signOrganIdIn) {
            if(!IdUtils.isEmpty(signOrganIdIn)){
                if(this.signOrganId_IN == null){
                    this.signOrganId_IN = new ArrayList<String>();
                }
                this.signOrganId_IN.add( signOrganIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signOrganIdNotIn(String signOrganIdNotIn) {
            if(!IdUtils.isEmpty(signOrganIdNotIn)){
                if(this.signOrganId_NOTIN == null){
                    this.signOrganId_NOTIN = new ArrayList<String>();
                }
                this.signOrganId_NOTIN.add( signOrganIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signOrganIdIsNull() {
            this.isNulls.add("signOrganId");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signOrganIdIsNotNull() {
            this.isNotNulls.add("signOrganId");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery signUserId(String signUserId) {
            if(!IdUtils.isEmpty(signUserId)){
                this.signUserId = signUserId;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signUserIdNot(String signUserIdNot) {
            if(!IdUtils.isEmpty(signUserIdNot)){
                this.signUserId_NE = signUserIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signUserIdLike(String signUserIdLike) {
            if(!IdUtils.isEmpty(signUserIdLike)){
                this.signUserId_LIKE = signUserIdLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signUserIdNotLike(String signUserIdNotLike) {
            if(!IdUtils.isEmpty(signUserIdNotLike)){
                this.signUserId_NOTLIKE = signUserIdNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signUserIdIn(String signUserIdIn) {
            if(!IdUtils.isEmpty(signUserIdIn)){
                if(this.signUserId_IN == null){
                    this.signUserId_IN = new ArrayList<String>();
                }
                this.signUserId_IN.add( signUserIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signUserIdNotIn(String signUserIdNotIn) {
            if(!IdUtils.isEmpty(signUserIdNotIn)){
                if(this.signUserId_NOTIN == null){
                    this.signUserId_NOTIN = new ArrayList<String>();
                }
                this.signUserId_NOTIN.add( signUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signUserIdIsNull() {
            this.isNulls.add("signUserId");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signUserIdIsNotNull() {
            this.isNotNulls.add("signUserId");
            return this;
        }


        @Override
        public TbInvestorAgreementQuery signDate(Date signDate) {
            if(!IdUtils.isEmpty(signDate)){
                this.signDate = signDate;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDateNot(Date signDateNot) {
            if(!IdUtils.isEmpty(signDateNot)){
                this.signDate_NE = signDateNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDateGreaterThan(Date signDateGreaterThan){
            if(signDateGreaterThan != null){
                this.signDate_GT = signDateGreaterThan;
            }
            return this;
        }


        @Override
        public TbInvestorAgreementQuery signDateGreaterEqual(Date signDateGreaterEqual){
            if(signDateGreaterEqual != null){
                this.signDate_GE = signDateGreaterEqual;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDateLessThan(Date signDateLessThan){
            if(signDateLessThan != null){
                this.signDate_LT = signDateLessThan;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery signDateLessEqual(Date signDateLessEqual){
            if(signDateLessEqual != null){
                this.signDate_LE = signDateLessEqual;
            }
            return this;
        }


        @Override
        public TbInvestorAgreementQuery agreementFiles(String agreementFiles) {
            if(!IdUtils.isEmpty(agreementFiles)){
                this.agreementFiles = agreementFiles;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementFilesNot(String agreementFilesNot) {
            if(!IdUtils.isEmpty(agreementFilesNot)){
                this.agreementFiles_NE = agreementFilesNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementFilesLike(String agreementFilesLike) {
            if(!IdUtils.isEmpty(agreementFilesLike)){
                this.agreementFiles_LIKE = agreementFilesLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementFilesNotLike(String agreementFilesNotLike) {
            if(!IdUtils.isEmpty(agreementFilesNotLike)){
                this.agreementFiles_NOTLIKE = agreementFilesNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementFilesIn(String agreementFilesIn) {
            if(!IdUtils.isEmpty(agreementFilesIn)){
                if(this.agreementFiles_IN == null){
                    this.agreementFiles_IN = new ArrayList<String>();
                }
                this.agreementFiles_IN.add( agreementFilesIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementFilesNotIn(String agreementFilesNotIn) {
            if(!IdUtils.isEmpty(agreementFilesNotIn)){
                if(this.agreementFiles_NOTIN == null){
                    this.agreementFiles_NOTIN = new ArrayList<String>();
                }
                this.agreementFiles_NOTIN.add( agreementFilesNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementFilesIsNull() {
            this.isNulls.add("agreementFiles");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery agreementFilesIsNotNull() {
            this.isNotNulls.add("agreementFiles");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TbInvestorAgreementQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TbInvestorAgreementQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TbInvestorAgreementQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TbInvestorAgreementQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TbInvestorAgreementQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TbInvestorAgreementQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public TbInvestorAgreementQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorAgreementQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TbInvestorAgreementQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}