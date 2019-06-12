package com.zz.bms.example.query.impl;


import java.io.Serializable;

import java.util.Date;
import java.lang.String;

/**
* 基金账户 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-6-12 19:11:18
*/
public class TbFundAccountQueryWebImpl<PK extends Serializable> extends TbFundAccountAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK fundId_IN;
            private PK fundId_NOTIN;



            private String fundAccountType_IN;
            private String fundAccountType_NOTIN;




            private String accountName_IN;
            private String accountName_NOTIN;


            private PK bankId_IN;
            private PK bankId_NOTIN;




            private String accountNo_IN;
            private String accountNo_NOTIN;




        //todo DATE startDate;

            private PK otherBankId_IN;
            private PK otherBankId_NOTIN;



            private PK userId_IN;
            private PK userId_NOTIN;






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


            public String getFundAccountType() {
                return fundAccountType;
            }

            public void setFundAccountType(String fundAccountType) {
                this.fundAccountType = fundAccountType;
            }

            public String getFundAccountType_NE() {
                return fundAccountType_NE;
            }

            public void setFundAccountType_NE(String fundAccountType_NE) {
                this.fundAccountType_NE = fundAccountType_NE;
            }

            public String getFundAccountType_IN() {
                return fundAccountType_IN;
            }

            public void setFundAccountType_IN(String fundAccountType_IN) {
                this.fundAccountType_IN = fundAccountType_IN;
            }

            public String getFundAccountType_NOTIN() {
                return fundAccountType_NOTIN;
            }

            public void setFundAccountType_NOTIN(String fundAccountType_NOTIN) {
                this.fundAccountType_NOTIN = fundAccountType_NOTIN;
            }



            public String getAccountName() {
                return accountName;
            }

            public void setAccountName(String accountName) {
                this.accountName = accountName;
            }

            public String getAccountName_NE() {
                return accountName_NE;
            }

            public void setAccountName_NE(String accountName_NE) {
                this.accountName_NE = accountName_NE;
            }

            public String getAccountName_IN() {
                return accountName_IN;
            }

            public void setAccountName_IN(String accountName_IN) {
                this.accountName_IN = accountName_IN;
            }

            public String getAccountName_NOTIN() {
                return accountName_NOTIN;
            }

            public void setAccountName_NOTIN(String accountName_NOTIN) {
                this.accountName_NOTIN = accountName_NOTIN;
            }

            public String getAccountName_LIKE() {
                return accountName_LIKE;
            }

            public void setAccountName_LIKE(String accountName_LIKE) {
                this.accountName_LIKE = accountName_LIKE;
            }

            public String getAccountName_NOTLIKE() {
                return accountName_NOTLIKE;
            }

            public void setAccountName_NOTLIKE(String accountName_NOTLIKE) {
                this.accountName_NOTLIKE = accountName_NOTLIKE;
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



            public String getAccountNo() {
                return accountNo;
            }

            public void setAccountNo(String accountNo) {
                this.accountNo = accountNo;
            }

            public String getAccountNo_NE() {
                return accountNo_NE;
            }

            public void setAccountNo_NE(String accountNo_NE) {
                this.accountNo_NE = accountNo_NE;
            }

            public String getAccountNo_IN() {
                return accountNo_IN;
            }

            public void setAccountNo_IN(String accountNo_IN) {
                this.accountNo_IN = accountNo_IN;
            }

            public String getAccountNo_NOTIN() {
                return accountNo_NOTIN;
            }

            public void setAccountNo_NOTIN(String accountNo_NOTIN) {
                this.accountNo_NOTIN = accountNo_NOTIN;
            }

            public String getAccountNo_LIKE() {
                return accountNo_LIKE;
            }

            public void setAccountNo_LIKE(String accountNo_LIKE) {
                this.accountNo_LIKE = accountNo_LIKE;
            }

            public String getAccountNo_NOTLIKE() {
                return accountNo_NOTLIKE;
            }

            public void setAccountNo_NOTLIKE(String accountNo_NOTLIKE) {
                this.accountNo_NOTLIKE = accountNo_NOTLIKE;
            }

            public Date getStartDate() {
                return startDate;
            }

            public void setStartDate(Date startDate) {
                this.startDate = startDate;
            }

            public Date getStartDate_NE() {
                return startDate_NE;
            }

            public void setStartDate_NE(Date startDate_NE) {
                this.startDate_NE = startDate_NE;
            }

            public Date getStartDate_GT() {
                return startDate_GT;
            }

            public void setStartDate_GT(Date startDate_GT) {
                this.startDate_GT = startDate_GT;
            }

            public Date getStartDate_GE() {
                return startDate_GE;
            }

            public void setStartDate_GE(Date startDate_GE) {
                this.startDate_GE = startDate_GE;
            }

            public Date getStartDate_LT() {
                return startDate_LT;
            }

            public void setStartDate_LT(Date startDate_LT) {
                this.startDate_LT = startDate_LT;
            }

            public Date getStartDate_LE() {
                return startDate_LE;
            }

            public void setStartDate_LE(Date startDate_LE) {
                this.startDate_LE = startDate_LE;
            }

            public PK getOtherBankId() {
                return otherBankId;
            }

            public void setOtherBankId(PK otherBankId) {
                this.otherBankId = otherBankId;
            }

            public PK getOtherBankId_NE() {
                return otherBankId_NE;
            }

            public void setOtherBankId_NE(PK otherBankId_NE) {
                this.otherBankId_NE = otherBankId_NE;
            }

            public PK getOtherBankId_IN() {
                return otherBankId_IN;
            }

            public void setOtherBankId_IN(PK otherBankId_IN) {
                this.otherBankId_IN = otherBankId_IN;
            }

            public PK getOtherBankId_NOTIN() {
                return otherBankId_NOTIN;
            }

            public void setOtherBankId_NOTIN(PK otherBankId_NOTIN) {
                this.otherBankId_NOTIN = otherBankId_NOTIN;
            }


            public PK getUserId() {
                return userId;
            }

            public void setUserId(PK userId) {
                this.userId = userId;
            }

            public PK getUserId_NE() {
                return userId_NE;
            }

            public void setUserId_NE(PK userId_NE) {
                this.userId_NE = userId_NE;
            }

            public PK getUserId_IN() {
                return userId_IN;
            }

            public void setUserId_IN(PK userId_IN) {
                this.userId_IN = userId_IN;
            }

            public PK getUserId_NOTIN() {
                return userId_NOTIN;
            }

            public void setUserId_NOTIN(PK userId_NOTIN) {
                this.userId_NOTIN = userId_NOTIN;
            }

}