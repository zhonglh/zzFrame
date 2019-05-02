package com.zz.bms.example.query.impl;


import java.io.Serializable;

import java.lang.String;

/**
* 基金账户 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-5-2 18:36:07
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



            private String bankId_IN;
            private String bankId_NOTIN;



            private String accountNo_IN;
            private String accountNo_NOTIN;





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


            public String getBankId() {
                return bankId;
            }

            public void setBankId(String bankId) {
                this.bankId = bankId;
            }

            public String getBankId_NE() {
                return bankId_NE;
            }

            public void setBankId_NE(String bankId_NE) {
                this.bankId_NE = bankId_NE;
            }

            public String getBankId_IN() {
                return bankId_IN;
            }

            public void setBankId_IN(String bankId_IN) {
                this.bankId_IN = bankId_IN;
            }

            public String getBankId_NOTIN() {
                return bankId_NOTIN;
            }

            public void setBankId_NOTIN(String bankId_NOTIN) {
                this.bankId_NOTIN = bankId_NOTIN;
            }

            public String getBankId_LIKE() {
                return bankId_LIKE;
            }

            public void setBankId_LIKE(String bankId_LIKE) {
                this.bankId_LIKE = bankId_LIKE;
            }

            public String getBankId_NOTLIKE() {
                return bankId_NOTLIKE;
            }

            public void setBankId_NOTLIKE(String bankId_NOTLIKE) {
                this.bankId_NOTLIKE = bankId_NOTLIKE;
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
}