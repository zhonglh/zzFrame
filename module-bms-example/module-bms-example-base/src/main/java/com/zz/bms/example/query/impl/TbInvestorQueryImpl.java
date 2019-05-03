package com.zz.bms.example.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.example.domain.TbInvestorEntity;
import com.zz.bms.example.query.TbInvestorQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 投资人 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-5-3 10:40:31
*/
public class TbInvestorQueryImpl<PK extends Serializable> extends TbInvestorAbstractQueryImpl<PK> implements TbInvestorQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> investorName_IN;
        private List<String> investorName_NOTIN;

        private List<String> investorCode_IN;
        private List<String> investorCode_NOTIN;
        private List<String> investorType_IN;
        private List<String> investorType_NOTIN;

        private List<PK> manageUserId_IN;
        private List<PK> manageUserId_NOTIN;

        private List<String> cardType_IN;
        private List<String> cardType_NOTIN;


        private List<String> cardNo_IN;
        private List<String> cardNo_NOTIN;

        private List<String> investorFiles_IN;
        private List<String> investorFiles_NOTIN;

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
        public TbInvestorQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TbInvestorQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TbInvestorQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TbInvestorQuery investorName(String investorName) {
            if(!IdUtils.isEmpty(investorName)){
                this.investorName = investorName;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorNameNot(String investorNameNot) {
            if(!IdUtils.isEmpty(investorNameNot)){
                this.investorName_NE = investorNameNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorNameLike(String investorNameLike) {
            if(!IdUtils.isEmpty(investorNameLike)){
                this.investorName_LIKE = investorNameLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorNameNotLike(String investorNameNotLike) {
            if(!IdUtils.isEmpty(investorNameNotLike)){
                this.investorName_NOTLIKE = investorNameNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorNameIn(String investorNameIn) {
            if(!IdUtils.isEmpty(investorNameIn)){
                if(this.investorName_IN == null){
                    this.investorName_IN = new ArrayList<String>();
                }
                this.investorName_IN.add( investorNameIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorNameNotIn(String investorNameNotIn) {
            if(!IdUtils.isEmpty(investorNameNotIn)){
                if(this.investorName_NOTIN == null){
                    this.investorName_NOTIN = new ArrayList<String>();
                }
                this.investorName_NOTIN.add( investorNameNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorNameIsNull() {
            this.isNulls.add("investorName");
            return this;
        }

        @Override
        public TbInvestorQuery investorNameIsNotNull() {
            this.isNotNulls.add("investorName");
            return this;
        }



        @Override
        public TbInvestorQuery investorCode(String investorCode) {
            if(!IdUtils.isEmpty(investorCode)){
                this.investorCode = investorCode;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorCodeNot(String investorCodeNot) {
            if(!IdUtils.isEmpty(investorCodeNot)){
                this.investorCode_NE = investorCodeNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorCodeLike(String investorCodeLike) {
            if(!IdUtils.isEmpty(investorCodeLike)){
                this.investorCode_LIKE = investorCodeLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorCodeNotLike(String investorCodeNotLike) {
            if(!IdUtils.isEmpty(investorCodeNotLike)){
                this.investorCode_NOTLIKE = investorCodeNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorCodeIn(String investorCodeIn) {
            if(!IdUtils.isEmpty(investorCodeIn)){
                if(this.investorCode_IN == null){
                    this.investorCode_IN = new ArrayList<String>();
                }
                this.investorCode_IN.add( investorCodeIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorCodeNotIn(String investorCodeNotIn) {
            if(!IdUtils.isEmpty(investorCodeNotIn)){
                if(this.investorCode_NOTIN == null){
                    this.investorCode_NOTIN = new ArrayList<String>();
                }
                this.investorCode_NOTIN.add( investorCodeNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorCodeIsNull() {
            this.isNulls.add("investorCode");
            return this;
        }

        @Override
        public TbInvestorQuery investorCodeIsNotNull() {
            this.isNotNulls.add("investorCode");
            return this;
        }


        @Override
        public TbInvestorQuery investorType(String investorType) {
            if(!IdUtils.isEmpty(investorType)){
                this.investorType = investorType;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorTypeNot(String investorTypeNot) {
            if(!IdUtils.isEmpty(investorTypeNot)){
                this.investorType_NE = investorTypeNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorTypeIn(String investorTypeIn) {
            if(!IdUtils.isEmpty(investorTypeIn)){
                if(this.investorType_IN == null){
                    this.investorType_IN = new ArrayList<String>();
                }
                this.investorType_IN.add( investorTypeIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorTypeNotIn(String investorTypeNotIn) {
            if(!IdUtils.isEmpty(investorTypeNotIn)){
                if(this.investorType_NOTIN == null){
                    this.investorType_NOTIN = new ArrayList<String>();
                }
                this.investorType_NOTIN.add( investorTypeNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorTypeIsNull() {
            this.isNulls.add("investorType");
            return this;
        }

        @Override
        public TbInvestorQuery investorTypeIsNotNull() {
            this.isNotNulls.add("investorType");
            return this;
        }


        @Override
        public TbInvestorQuery manageUserId(PK manageUserId) {
            if(!IdUtils.isEmpty(manageUserId)){
                this.manageUserId = manageUserId;
            }
            return this;
        }

        @Override
        public TbInvestorQuery manageUserIdNot(PK manageUserIdNot) {
            if(!IdUtils.isEmpty(manageUserIdNot)){
                this.manageUserId_NE = manageUserIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery manageUserIdIn(PK manageUserIdIn) {
            if(!IdUtils.isEmpty(manageUserIdIn)){
                if(this.manageUserId_IN == null){
                    this.manageUserId_IN = new ArrayList<PK>();
                }
                this.manageUserId_IN.add( manageUserIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery manageUserIdNotIn(PK manageUserIdNotIn) {
            if(!IdUtils.isEmpty(manageUserIdNotIn)){
                if(this.manageUserId_NOTIN == null){
                    this.manageUserId_NOTIN = new ArrayList<PK>();
                }
                this.manageUserId_NOTIN.add( manageUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery manageUserIdIsNull() {
            this.isNulls.add("manageUserId");
            return this;
        }

        @Override
        public TbInvestorQuery manageUserIdIsNotNull() {
            this.isNotNulls.add("manageUserId");
            return this;
        }


        @Override
        public TbInvestorQuery cardType(String cardType) {
            if(!IdUtils.isEmpty(cardType)){
                this.cardType = cardType;
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardTypeNot(String cardTypeNot) {
            if(!IdUtils.isEmpty(cardTypeNot)){
                this.cardType_NE = cardTypeNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardTypeIn(String cardTypeIn) {
            if(!IdUtils.isEmpty(cardTypeIn)){
                if(this.cardType_IN == null){
                    this.cardType_IN = new ArrayList<String>();
                }
                this.cardType_IN.add( cardTypeIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardTypeNotIn(String cardTypeNotIn) {
            if(!IdUtils.isEmpty(cardTypeNotIn)){
                if(this.cardType_NOTIN == null){
                    this.cardType_NOTIN = new ArrayList<String>();
                }
                this.cardType_NOTIN.add( cardTypeNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardTypeIsNull() {
            this.isNulls.add("cardType");
            return this;
        }

        @Override
        public TbInvestorQuery cardTypeIsNotNull() {
            this.isNotNulls.add("cardType");
            return this;
        }



        @Override
        public TbInvestorQuery cardNo(String cardNo) {
            if(!IdUtils.isEmpty(cardNo)){
                this.cardNo = cardNo;
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardNoNot(String cardNoNot) {
            if(!IdUtils.isEmpty(cardNoNot)){
                this.cardNo_NE = cardNoNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardNoLike(String cardNoLike) {
            if(!IdUtils.isEmpty(cardNoLike)){
                this.cardNo_LIKE = cardNoLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardNoNotLike(String cardNoNotLike) {
            if(!IdUtils.isEmpty(cardNoNotLike)){
                this.cardNo_NOTLIKE = cardNoNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardNoIn(String cardNoIn) {
            if(!IdUtils.isEmpty(cardNoIn)){
                if(this.cardNo_IN == null){
                    this.cardNo_IN = new ArrayList<String>();
                }
                this.cardNo_IN.add( cardNoIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardNoNotIn(String cardNoNotIn) {
            if(!IdUtils.isEmpty(cardNoNotIn)){
                if(this.cardNo_NOTIN == null){
                    this.cardNo_NOTIN = new ArrayList<String>();
                }
                this.cardNo_NOTIN.add( cardNoNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery cardNoIsNull() {
            this.isNulls.add("cardNo");
            return this;
        }

        @Override
        public TbInvestorQuery cardNoIsNotNull() {
            this.isNotNulls.add("cardNo");
            return this;
        }



        @Override
        public TbInvestorQuery investorFiles(String investorFiles) {
            if(!IdUtils.isEmpty(investorFiles)){
                this.investorFiles = investorFiles;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorFilesNot(String investorFilesNot) {
            if(!IdUtils.isEmpty(investorFilesNot)){
                this.investorFiles_NE = investorFilesNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorFilesLike(String investorFilesLike) {
            if(!IdUtils.isEmpty(investorFilesLike)){
                this.investorFiles_LIKE = investorFilesLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorFilesNotLike(String investorFilesNotLike) {
            if(!IdUtils.isEmpty(investorFilesNotLike)){
                this.investorFiles_NOTLIKE = investorFilesNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorFilesIn(String investorFilesIn) {
            if(!IdUtils.isEmpty(investorFilesIn)){
                if(this.investorFiles_IN == null){
                    this.investorFiles_IN = new ArrayList<String>();
                }
                this.investorFiles_IN.add( investorFilesIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorFilesNotIn(String investorFilesNotIn) {
            if(!IdUtils.isEmpty(investorFilesNotIn)){
                if(this.investorFiles_NOTIN == null){
                    this.investorFiles_NOTIN = new ArrayList<String>();
                }
                this.investorFiles_NOTIN.add( investorFilesNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery investorFilesIsNull() {
            this.isNulls.add("investorFiles");
            return this;
        }

        @Override
        public TbInvestorQuery investorFilesIsNotNull() {
            this.isNotNulls.add("investorFiles");
            return this;
        }



        @Override
        public TbInvestorQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TbInvestorQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TbInvestorQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TbInvestorQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TbInvestorQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TbInvestorQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TbInvestorQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TbInvestorQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TbInvestorQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TbInvestorQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TbInvestorQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TbInvestorQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TbInvestorQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TbInvestorQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TbInvestorQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TbInvestorQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TbInvestorQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TbInvestorQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TbInvestorQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TbInvestorQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TbInvestorQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TbInvestorQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TbInvestorQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TbInvestorQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TbInvestorQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public TbInvestorQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TbInvestorQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TbInvestorQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TbInvestorQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TbInvestorQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TbInvestorQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}