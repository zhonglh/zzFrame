package com.zz.bms.example.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.example.domain.TbBankEntity;
import com.zz.bms.example.query.TbBankQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

/**
* 银行信息 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-6-12 19:11:25
*/
public class TbBankQueryImpl<PK extends Serializable> extends TbBankAbstractQueryImpl<PK> implements TbBankQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> bankName_IN;
        private List<String> bankName_NOTIN;

        private List<String> bankShortName_IN;
        private List<String> bankShortName_NOTIN;

        private List<String> serviceTelephone_IN;
        private List<String> serviceTelephone_NOTIN;

        private List<String> officialWebsite_IN;
        private List<String> officialWebsite_NOTIN;


        @Override
        public TbBankQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TbBankQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TbBankQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TbBankQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TbBankQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TbBankQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TbBankQuery bankName(String bankName) {
            if(!IdUtils.isEmpty(bankName)){
                this.bankName = bankName;
            }
            return this;
        }

        @Override
        public TbBankQuery bankNameNot(String bankNameNot) {
            if(!IdUtils.isEmpty(bankNameNot)){
                this.bankName_NE = bankNameNot;
            }
            return this;
        }

        @Override
        public TbBankQuery bankNameLike(String bankNameLike) {
            if(!IdUtils.isEmpty(bankNameLike)){
                this.bankName_LIKE = bankNameLike;
            }
            return this;
        }

        @Override
        public TbBankQuery bankNameNotLike(String bankNameNotLike) {
            if(!IdUtils.isEmpty(bankNameNotLike)){
                this.bankName_NOTLIKE = bankNameNotLike;
            }
            return this;
        }

        @Override
        public TbBankQuery bankNameIn(String bankNameIn) {
            if(!IdUtils.isEmpty(bankNameIn)){
                if(this.bankName_IN == null){
                    this.bankName_IN = new ArrayList<String>();
                }
                this.bankName_IN.add( bankNameIn );
            }
            return this;
        }

        @Override
        public TbBankQuery bankNameNotIn(String bankNameNotIn) {
            if(!IdUtils.isEmpty(bankNameNotIn)){
                if(this.bankName_NOTIN == null){
                    this.bankName_NOTIN = new ArrayList<String>();
                }
                this.bankName_NOTIN.add( bankNameNotIn );
            }
            return this;
        }

        @Override
        public TbBankQuery bankNameIsNull() {
            this.isNulls.add("bankName");
            return this;
        }

        @Override
        public TbBankQuery bankNameIsNotNull() {
            this.isNotNulls.add("bankName");
            return this;
        }



        @Override
        public TbBankQuery bankShortName(String bankShortName) {
            if(!IdUtils.isEmpty(bankShortName)){
                this.bankShortName = bankShortName;
            }
            return this;
        }

        @Override
        public TbBankQuery bankShortNameNot(String bankShortNameNot) {
            if(!IdUtils.isEmpty(bankShortNameNot)){
                this.bankShortName_NE = bankShortNameNot;
            }
            return this;
        }

        @Override
        public TbBankQuery bankShortNameLike(String bankShortNameLike) {
            if(!IdUtils.isEmpty(bankShortNameLike)){
                this.bankShortName_LIKE = bankShortNameLike;
            }
            return this;
        }

        @Override
        public TbBankQuery bankShortNameNotLike(String bankShortNameNotLike) {
            if(!IdUtils.isEmpty(bankShortNameNotLike)){
                this.bankShortName_NOTLIKE = bankShortNameNotLike;
            }
            return this;
        }

        @Override
        public TbBankQuery bankShortNameIn(String bankShortNameIn) {
            if(!IdUtils.isEmpty(bankShortNameIn)){
                if(this.bankShortName_IN == null){
                    this.bankShortName_IN = new ArrayList<String>();
                }
                this.bankShortName_IN.add( bankShortNameIn );
            }
            return this;
        }

        @Override
        public TbBankQuery bankShortNameNotIn(String bankShortNameNotIn) {
            if(!IdUtils.isEmpty(bankShortNameNotIn)){
                if(this.bankShortName_NOTIN == null){
                    this.bankShortName_NOTIN = new ArrayList<String>();
                }
                this.bankShortName_NOTIN.add( bankShortNameNotIn );
            }
            return this;
        }

        @Override
        public TbBankQuery bankShortNameIsNull() {
            this.isNulls.add("bankShortName");
            return this;
        }

        @Override
        public TbBankQuery bankShortNameIsNotNull() {
            this.isNotNulls.add("bankShortName");
            return this;
        }



        @Override
        public TbBankQuery serviceTelephone(String serviceTelephone) {
            if(!IdUtils.isEmpty(serviceTelephone)){
                this.serviceTelephone = serviceTelephone;
            }
            return this;
        }

        @Override
        public TbBankQuery serviceTelephoneNot(String serviceTelephoneNot) {
            if(!IdUtils.isEmpty(serviceTelephoneNot)){
                this.serviceTelephone_NE = serviceTelephoneNot;
            }
            return this;
        }

        @Override
        public TbBankQuery serviceTelephoneLike(String serviceTelephoneLike) {
            if(!IdUtils.isEmpty(serviceTelephoneLike)){
                this.serviceTelephone_LIKE = serviceTelephoneLike;
            }
            return this;
        }

        @Override
        public TbBankQuery serviceTelephoneNotLike(String serviceTelephoneNotLike) {
            if(!IdUtils.isEmpty(serviceTelephoneNotLike)){
                this.serviceTelephone_NOTLIKE = serviceTelephoneNotLike;
            }
            return this;
        }

        @Override
        public TbBankQuery serviceTelephoneIn(String serviceTelephoneIn) {
            if(!IdUtils.isEmpty(serviceTelephoneIn)){
                if(this.serviceTelephone_IN == null){
                    this.serviceTelephone_IN = new ArrayList<String>();
                }
                this.serviceTelephone_IN.add( serviceTelephoneIn );
            }
            return this;
        }

        @Override
        public TbBankQuery serviceTelephoneNotIn(String serviceTelephoneNotIn) {
            if(!IdUtils.isEmpty(serviceTelephoneNotIn)){
                if(this.serviceTelephone_NOTIN == null){
                    this.serviceTelephone_NOTIN = new ArrayList<String>();
                }
                this.serviceTelephone_NOTIN.add( serviceTelephoneNotIn );
            }
            return this;
        }

        @Override
        public TbBankQuery serviceTelephoneIsNull() {
            this.isNulls.add("serviceTelephone");
            return this;
        }

        @Override
        public TbBankQuery serviceTelephoneIsNotNull() {
            this.isNotNulls.add("serviceTelephone");
            return this;
        }



        @Override
        public TbBankQuery officialWebsite(String officialWebsite) {
            if(!IdUtils.isEmpty(officialWebsite)){
                this.officialWebsite = officialWebsite;
            }
            return this;
        }

        @Override
        public TbBankQuery officialWebsiteNot(String officialWebsiteNot) {
            if(!IdUtils.isEmpty(officialWebsiteNot)){
                this.officialWebsite_NE = officialWebsiteNot;
            }
            return this;
        }

        @Override
        public TbBankQuery officialWebsiteLike(String officialWebsiteLike) {
            if(!IdUtils.isEmpty(officialWebsiteLike)){
                this.officialWebsite_LIKE = officialWebsiteLike;
            }
            return this;
        }

        @Override
        public TbBankQuery officialWebsiteNotLike(String officialWebsiteNotLike) {
            if(!IdUtils.isEmpty(officialWebsiteNotLike)){
                this.officialWebsite_NOTLIKE = officialWebsiteNotLike;
            }
            return this;
        }

        @Override
        public TbBankQuery officialWebsiteIn(String officialWebsiteIn) {
            if(!IdUtils.isEmpty(officialWebsiteIn)){
                if(this.officialWebsite_IN == null){
                    this.officialWebsite_IN = new ArrayList<String>();
                }
                this.officialWebsite_IN.add( officialWebsiteIn );
            }
            return this;
        }

        @Override
        public TbBankQuery officialWebsiteNotIn(String officialWebsiteNotIn) {
            if(!IdUtils.isEmpty(officialWebsiteNotIn)){
                if(this.officialWebsite_NOTIN == null){
                    this.officialWebsite_NOTIN = new ArrayList<String>();
                }
                this.officialWebsite_NOTIN.add( officialWebsiteNotIn );
            }
            return this;
        }

        @Override
        public TbBankQuery officialWebsiteIsNull() {
            this.isNulls.add("officialWebsite");
            return this;
        }

        @Override
        public TbBankQuery officialWebsiteIsNotNull() {
            this.isNotNulls.add("officialWebsite");
            return this;
        }



	
}