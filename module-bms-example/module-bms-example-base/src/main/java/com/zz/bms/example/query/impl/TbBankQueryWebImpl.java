package com.zz.bms.example.query.impl;


import java.io.Serializable;

import java.lang.String;

/**
* 银行信息 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-6-3 10:12:55
*/
public class TbBankQueryWebImpl<PK extends Serializable> extends TbBankAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String bankName_IN;
            private String bankName_NOTIN;



            private String bankShortName_IN;
            private String bankShortName_NOTIN;



            private String serviceTelephone_IN;
            private String serviceTelephone_NOTIN;



            private String officialWebsite_IN;
            private String officialWebsite_NOTIN;





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



            public String getBankName() {
                return bankName;
            }

            public void setBankName(String bankName) {
                this.bankName = bankName;
            }

            public String getBankName_NE() {
                return bankName_NE;
            }

            public void setBankName_NE(String bankName_NE) {
                this.bankName_NE = bankName_NE;
            }

            public String getBankName_IN() {
                return bankName_IN;
            }

            public void setBankName_IN(String bankName_IN) {
                this.bankName_IN = bankName_IN;
            }

            public String getBankName_NOTIN() {
                return bankName_NOTIN;
            }

            public void setBankName_NOTIN(String bankName_NOTIN) {
                this.bankName_NOTIN = bankName_NOTIN;
            }

            public String getBankName_LIKE() {
                return bankName_LIKE;
            }

            public void setBankName_LIKE(String bankName_LIKE) {
                this.bankName_LIKE = bankName_LIKE;
            }

            public String getBankName_NOTLIKE() {
                return bankName_NOTLIKE;
            }

            public void setBankName_NOTLIKE(String bankName_NOTLIKE) {
                this.bankName_NOTLIKE = bankName_NOTLIKE;
            }


            public String getBankShortName() {
                return bankShortName;
            }

            public void setBankShortName(String bankShortName) {
                this.bankShortName = bankShortName;
            }

            public String getBankShortName_NE() {
                return bankShortName_NE;
            }

            public void setBankShortName_NE(String bankShortName_NE) {
                this.bankShortName_NE = bankShortName_NE;
            }

            public String getBankShortName_IN() {
                return bankShortName_IN;
            }

            public void setBankShortName_IN(String bankShortName_IN) {
                this.bankShortName_IN = bankShortName_IN;
            }

            public String getBankShortName_NOTIN() {
                return bankShortName_NOTIN;
            }

            public void setBankShortName_NOTIN(String bankShortName_NOTIN) {
                this.bankShortName_NOTIN = bankShortName_NOTIN;
            }

            public String getBankShortName_LIKE() {
                return bankShortName_LIKE;
            }

            public void setBankShortName_LIKE(String bankShortName_LIKE) {
                this.bankShortName_LIKE = bankShortName_LIKE;
            }

            public String getBankShortName_NOTLIKE() {
                return bankShortName_NOTLIKE;
            }

            public void setBankShortName_NOTLIKE(String bankShortName_NOTLIKE) {
                this.bankShortName_NOTLIKE = bankShortName_NOTLIKE;
            }


            public String getServiceTelephone() {
                return serviceTelephone;
            }

            public void setServiceTelephone(String serviceTelephone) {
                this.serviceTelephone = serviceTelephone;
            }

            public String getServiceTelephone_NE() {
                return serviceTelephone_NE;
            }

            public void setServiceTelephone_NE(String serviceTelephone_NE) {
                this.serviceTelephone_NE = serviceTelephone_NE;
            }

            public String getServiceTelephone_IN() {
                return serviceTelephone_IN;
            }

            public void setServiceTelephone_IN(String serviceTelephone_IN) {
                this.serviceTelephone_IN = serviceTelephone_IN;
            }

            public String getServiceTelephone_NOTIN() {
                return serviceTelephone_NOTIN;
            }

            public void setServiceTelephone_NOTIN(String serviceTelephone_NOTIN) {
                this.serviceTelephone_NOTIN = serviceTelephone_NOTIN;
            }

            public String getServiceTelephone_LIKE() {
                return serviceTelephone_LIKE;
            }

            public void setServiceTelephone_LIKE(String serviceTelephone_LIKE) {
                this.serviceTelephone_LIKE = serviceTelephone_LIKE;
            }

            public String getServiceTelephone_NOTLIKE() {
                return serviceTelephone_NOTLIKE;
            }

            public void setServiceTelephone_NOTLIKE(String serviceTelephone_NOTLIKE) {
                this.serviceTelephone_NOTLIKE = serviceTelephone_NOTLIKE;
            }


            public String getOfficialWebsite() {
                return officialWebsite;
            }

            public void setOfficialWebsite(String officialWebsite) {
                this.officialWebsite = officialWebsite;
            }

            public String getOfficialWebsite_NE() {
                return officialWebsite_NE;
            }

            public void setOfficialWebsite_NE(String officialWebsite_NE) {
                this.officialWebsite_NE = officialWebsite_NE;
            }

            public String getOfficialWebsite_IN() {
                return officialWebsite_IN;
            }

            public void setOfficialWebsite_IN(String officialWebsite_IN) {
                this.officialWebsite_IN = officialWebsite_IN;
            }

            public String getOfficialWebsite_NOTIN() {
                return officialWebsite_NOTIN;
            }

            public void setOfficialWebsite_NOTIN(String officialWebsite_NOTIN) {
                this.officialWebsite_NOTIN = officialWebsite_NOTIN;
            }

            public String getOfficialWebsite_LIKE() {
                return officialWebsite_LIKE;
            }

            public void setOfficialWebsite_LIKE(String officialWebsite_LIKE) {
                this.officialWebsite_LIKE = officialWebsite_LIKE;
            }

            public String getOfficialWebsite_NOTLIKE() {
                return officialWebsite_NOTLIKE;
            }

            public void setOfficialWebsite_NOTLIKE(String officialWebsite_NOTLIKE) {
                this.officialWebsite_NOTLIKE = officialWebsite_NOTLIKE;
            }
}