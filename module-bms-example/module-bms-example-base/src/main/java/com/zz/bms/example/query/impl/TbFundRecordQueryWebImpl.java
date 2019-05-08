package com.zz.bms.example.query.impl;


import java.io.Serializable;

import java.util.Date;
import java.lang.String;

/**
* 基金备案 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-5-8 10:49:22
*/
public class TbFundRecordQueryWebImpl<PK extends Serializable> extends TbFundRecordAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK fundId_IN;
            private PK fundId_NOTIN;





        //todo DATE recordDate;


            private String recordAddr_IN;
            private String recordAddr_NOTIN;


            private PK bankId_IN;
            private PK bankId_NOTIN;



            private String cardType_IN;
            private String cardType_NOTIN;



            private PK recordUserId_IN;
            private PK recordUserId_NOTIN;






            public PK getId() {
                return id;
            }

            public void setId(PK id) {
                this.id = id;
            }

            public PK getId_NE() {
                return id_NE;
            }

            public void setId_NE(PK id_NE) {
                this.id_NE = id_NE;
            }

            public PK getId_IN() {
                return id_IN;
            }

            public void setId_IN(PK id_IN) {
                this.id_IN = id_IN;
            }

            public PK getId_NOTIN() {
                return id_NOTIN;
            }

            public void setId_NOTIN(PK id_NOTIN) {
                this.id_NOTIN = id_NOTIN;
            }


            public PK getFundId() {
                return fundId;
            }

            public void setFundId(PK fundId) {
                this.fundId = fundId;
            }

            public PK getFundId_NE() {
                return fundId_NE;
            }

            public void setFundId_NE(PK fundId_NE) {
                this.fundId_NE = fundId_NE;
            }

            public PK getFundId_IN() {
                return fundId_IN;
            }

            public void setFundId_IN(PK fundId_IN) {
                this.fundId_IN = fundId_IN;
            }

            public PK getFundId_NOTIN() {
                return fundId_NOTIN;
            }

            public void setFundId_NOTIN(PK fundId_NOTIN) {
                this.fundId_NOTIN = fundId_NOTIN;
            }


            public Date getRecordDate() {
                return recordDate;
            }

            public void setRecordDate(Date recordDate) {
                this.recordDate = recordDate;
            }

            public Date getRecordDate_NE() {
                return recordDate_NE;
            }

            public void setRecordDate_NE(Date recordDate_NE) {
                this.recordDate_NE = recordDate_NE;
            }

            public Date getRecordDate_GT() {
                return recordDate_GT;
            }

            public void setRecordDate_GT(Date recordDate_GT) {
                this.recordDate_GT = recordDate_GT;
            }

            public Date getRecordDate_GE() {
                return recordDate_GE;
            }

            public void setRecordDate_GE(Date recordDate_GE) {
                this.recordDate_GE = recordDate_GE;
            }

            public Date getRecordDate_LT() {
                return recordDate_LT;
            }

            public void setRecordDate_LT(Date recordDate_LT) {
                this.recordDate_LT = recordDate_LT;
            }

            public Date getRecordDate_LE() {
                return recordDate_LE;
            }

            public void setRecordDate_LE(Date recordDate_LE) {
                this.recordDate_LE = recordDate_LE;
            }


            public String getRecordAddr() {
                return recordAddr;
            }

            public void setRecordAddr(String recordAddr) {
                this.recordAddr = recordAddr;
            }

            public String getRecordAddr_NE() {
                return recordAddr_NE;
            }

            public void setRecordAddr_NE(String recordAddr_NE) {
                this.recordAddr_NE = recordAddr_NE;
            }

            public String getRecordAddr_IN() {
                return recordAddr_IN;
            }

            public void setRecordAddr_IN(String recordAddr_IN) {
                this.recordAddr_IN = recordAddr_IN;
            }

            public String getRecordAddr_NOTIN() {
                return recordAddr_NOTIN;
            }

            public void setRecordAddr_NOTIN(String recordAddr_NOTIN) {
                this.recordAddr_NOTIN = recordAddr_NOTIN;
            }

            public String getRecordAddr_LIKE() {
                return recordAddr_LIKE;
            }

            public void setRecordAddr_LIKE(String recordAddr_LIKE) {
                this.recordAddr_LIKE = recordAddr_LIKE;
            }

            public String getRecordAddr_NOTLIKE() {
                return recordAddr_NOTLIKE;
            }

            public void setRecordAddr_NOTLIKE(String recordAddr_NOTLIKE) {
                this.recordAddr_NOTLIKE = recordAddr_NOTLIKE;
            }

            public PK getBankId() {
                return bankId;
            }

            public void setBankId(PK bankId) {
                this.bankId = bankId;
            }

            public PK getBankId_NE() {
                return bankId_NE;
            }

            public void setBankId_NE(PK bankId_NE) {
                this.bankId_NE = bankId_NE;
            }

            public PK getBankId_IN() {
                return bankId_IN;
            }

            public void setBankId_IN(PK bankId_IN) {
                this.bankId_IN = bankId_IN;
            }

            public PK getBankId_NOTIN() {
                return bankId_NOTIN;
            }

            public void setBankId_NOTIN(PK bankId_NOTIN) {
                this.bankId_NOTIN = bankId_NOTIN;
            }


            public String getCardType() {
                return cardType;
            }

            public void setCardType(String cardType) {
                this.cardType = cardType;
            }

            public String getCardType_NE() {
                return cardType_NE;
            }

            public void setCardType_NE(String cardType_NE) {
                this.cardType_NE = cardType_NE;
            }

            public String getCardType_IN() {
                return cardType_IN;
            }

            public void setCardType_IN(String cardType_IN) {
                this.cardType_IN = cardType_IN;
            }

            public String getCardType_NOTIN() {
                return cardType_NOTIN;
            }

            public void setCardType_NOTIN(String cardType_NOTIN) {
                this.cardType_NOTIN = cardType_NOTIN;
            }


            public PK getRecordUserId() {
                return recordUserId;
            }

            public void setRecordUserId(PK recordUserId) {
                this.recordUserId = recordUserId;
            }

            public PK getRecordUserId_NE() {
                return recordUserId_NE;
            }

            public void setRecordUserId_NE(PK recordUserId_NE) {
                this.recordUserId_NE = recordUserId_NE;
            }

            public PK getRecordUserId_IN() {
                return recordUserId_IN;
            }

            public void setRecordUserId_IN(PK recordUserId_IN) {
                this.recordUserId_IN = recordUserId_IN;
            }

            public PK getRecordUserId_NOTIN() {
                return recordUserId_NOTIN;
            }

            public void setRecordUserId_NOTIN(PK recordUserId_NOTIN) {
                this.recordUserId_NOTIN = recordUserId_NOTIN;
            }

}