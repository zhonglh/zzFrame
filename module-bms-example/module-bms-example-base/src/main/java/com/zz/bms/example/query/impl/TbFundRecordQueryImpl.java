package com.zz.bms.example.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.example.domain.TbFundRecordEntity;
import com.zz.bms.example.query.TbFundRecordQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.util.Date;
import java.lang.String;

/**
* 基金备案 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-5-8 10:49:22
*/
public class TbFundRecordQueryImpl<PK extends Serializable> extends TbFundRecordAbstractQueryImpl<PK> implements TbFundRecordQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> fundId_IN;
        private List<PK> fundId_NOTIN;


        private List<String> recordAddr_IN;
        private List<String> recordAddr_NOTIN;
        private List<PK> bankId_IN;
        private List<PK> bankId_NOTIN;

        private List<String> cardType_IN;
        private List<String> cardType_NOTIN;

        private List<PK> recordUserId_IN;
        private List<PK> recordUserId_NOTIN;



        @Override
        public TbFundRecordQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TbFundRecordQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TbFundRecordQuery fundId(PK fundId) {
            if(!IdUtils.isEmpty(fundId)){
                this.fundId = fundId;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery fundIdNot(PK fundIdNot) {
            if(!IdUtils.isEmpty(fundIdNot)){
                this.fundId_NE = fundIdNot;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery fundIdIn(PK fundIdIn) {
            if(!IdUtils.isEmpty(fundIdIn)){
                if(this.fundId_IN == null){
                    this.fundId_IN = new ArrayList<PK>();
                }
                this.fundId_IN.add( fundIdIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery fundIdNotIn(PK fundIdNotIn) {
            if(!IdUtils.isEmpty(fundIdNotIn)){
                if(this.fundId_NOTIN == null){
                    this.fundId_NOTIN = new ArrayList<PK>();
                }
                this.fundId_NOTIN.add( fundIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery fundIdIsNull() {
            this.isNulls.add("fundId");
            return this;
        }

        @Override
        public TbFundRecordQuery fundIdIsNotNull() {
            this.isNotNulls.add("fundId");
            return this;
        }


        @Override
        public TbFundRecordQuery recordDate(Date recordDate) {
            if(!IdUtils.isEmpty(recordDate)){
                this.recordDate = recordDate;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordDateNot(Date recordDateNot) {
            if(!IdUtils.isEmpty(recordDateNot)){
                this.recordDate_NE = recordDateNot;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordDateGreaterThan(Date recordDateGreaterThan){
            if(recordDateGreaterThan != null){
                this.recordDate_GT = recordDateGreaterThan;
            }
            return this;
        }


        @Override
        public TbFundRecordQuery recordDateGreaterEqual(Date recordDateGreaterEqual){
            if(recordDateGreaterEqual != null){
                this.recordDate_GE = recordDateGreaterEqual;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordDateLessThan(Date recordDateLessThan){
            if(recordDateLessThan != null){
                this.recordDate_LT = recordDateLessThan;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordDateLessEqual(Date recordDateLessEqual){
            if(recordDateLessEqual != null){
                this.recordDate_LE = recordDateLessEqual;
            }
            return this;
        }


        @Override
        public TbFundRecordQuery recordAddr(String recordAddr) {
            if(!IdUtils.isEmpty(recordAddr)){
                this.recordAddr = recordAddr;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordAddrNot(String recordAddrNot) {
            if(!IdUtils.isEmpty(recordAddrNot)){
                this.recordAddr_NE = recordAddrNot;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordAddrLike(String recordAddrLike) {
            if(!IdUtils.isEmpty(recordAddrLike)){
                this.recordAddr_LIKE = recordAddrLike;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordAddrNotLike(String recordAddrNotLike) {
            if(!IdUtils.isEmpty(recordAddrNotLike)){
                this.recordAddr_NOTLIKE = recordAddrNotLike;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordAddrIn(String recordAddrIn) {
            if(!IdUtils.isEmpty(recordAddrIn)){
                if(this.recordAddr_IN == null){
                    this.recordAddr_IN = new ArrayList<String>();
                }
                this.recordAddr_IN.add( recordAddrIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordAddrNotIn(String recordAddrNotIn) {
            if(!IdUtils.isEmpty(recordAddrNotIn)){
                if(this.recordAddr_NOTIN == null){
                    this.recordAddr_NOTIN = new ArrayList<String>();
                }
                this.recordAddr_NOTIN.add( recordAddrNotIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordAddrIsNull() {
            this.isNulls.add("recordAddr");
            return this;
        }

        @Override
        public TbFundRecordQuery recordAddrIsNotNull() {
            this.isNotNulls.add("recordAddr");
            return this;
        }


        @Override
        public TbFundRecordQuery bankId(PK bankId) {
            if(!IdUtils.isEmpty(bankId)){
                this.bankId = bankId;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery bankIdNot(PK bankIdNot) {
            if(!IdUtils.isEmpty(bankIdNot)){
                this.bankId_NE = bankIdNot;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery bankIdIn(PK bankIdIn) {
            if(!IdUtils.isEmpty(bankIdIn)){
                if(this.bankId_IN == null){
                    this.bankId_IN = new ArrayList<PK>();
                }
                this.bankId_IN.add( bankIdIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery bankIdNotIn(PK bankIdNotIn) {
            if(!IdUtils.isEmpty(bankIdNotIn)){
                if(this.bankId_NOTIN == null){
                    this.bankId_NOTIN = new ArrayList<PK>();
                }
                this.bankId_NOTIN.add( bankIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery bankIdIsNull() {
            this.isNulls.add("bankId");
            return this;
        }

        @Override
        public TbFundRecordQuery bankIdIsNotNull() {
            this.isNotNulls.add("bankId");
            return this;
        }


        @Override
        public TbFundRecordQuery cardType(String cardType) {
            if(!IdUtils.isEmpty(cardType)){
                this.cardType = cardType;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery cardTypeNot(String cardTypeNot) {
            if(!IdUtils.isEmpty(cardTypeNot)){
                this.cardType_NE = cardTypeNot;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery cardTypeIn(String cardTypeIn) {
            if(!IdUtils.isEmpty(cardTypeIn)){
                if(this.cardType_IN == null){
                    this.cardType_IN = new ArrayList<String>();
                }
                this.cardType_IN.add( cardTypeIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery cardTypeNotIn(String cardTypeNotIn) {
            if(!IdUtils.isEmpty(cardTypeNotIn)){
                if(this.cardType_NOTIN == null){
                    this.cardType_NOTIN = new ArrayList<String>();
                }
                this.cardType_NOTIN.add( cardTypeNotIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery cardTypeIsNull() {
            this.isNulls.add("cardType");
            return this;
        }

        @Override
        public TbFundRecordQuery cardTypeIsNotNull() {
            this.isNotNulls.add("cardType");
            return this;
        }


        @Override
        public TbFundRecordQuery recordUserId(PK recordUserId) {
            if(!IdUtils.isEmpty(recordUserId)){
                this.recordUserId = recordUserId;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordUserIdNot(PK recordUserIdNot) {
            if(!IdUtils.isEmpty(recordUserIdNot)){
                this.recordUserId_NE = recordUserIdNot;
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordUserIdIn(PK recordUserIdIn) {
            if(!IdUtils.isEmpty(recordUserIdIn)){
                if(this.recordUserId_IN == null){
                    this.recordUserId_IN = new ArrayList<PK>();
                }
                this.recordUserId_IN.add( recordUserIdIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordUserIdNotIn(PK recordUserIdNotIn) {
            if(!IdUtils.isEmpty(recordUserIdNotIn)){
                if(this.recordUserId_NOTIN == null){
                    this.recordUserId_NOTIN = new ArrayList<PK>();
                }
                this.recordUserId_NOTIN.add( recordUserIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundRecordQuery recordUserIdIsNull() {
            this.isNulls.add("recordUserId");
            return this;
        }

        @Override
        public TbFundRecordQuery recordUserIdIsNotNull() {
            this.isNotNulls.add("recordUserId");
            return this;
        }



	
}