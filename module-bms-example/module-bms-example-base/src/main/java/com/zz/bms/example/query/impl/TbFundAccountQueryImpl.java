package com.zz.bms.example.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.example.domain.TbFundAccountEntity;
import com.zz.bms.example.query.TbFundAccountQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

/**
* 基金账户 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-5-3 10:40:29
*/
public class TbFundAccountQueryImpl<PK extends Serializable> extends TbFundAccountAbstractQueryImpl<PK> implements TbFundAccountQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> fundId_IN;
        private List<PK> fundId_NOTIN;

        private List<String> fundAccountType_IN;
        private List<String> fundAccountType_NOTIN;


        private List<String> accountName_IN;
        private List<String> accountName_NOTIN;
        private List<PK> bankId_IN;
        private List<PK> bankId_NOTIN;


        private List<String> accountNo_IN;
        private List<String> accountNo_NOTIN;


        @Override
        public TbFundAccountQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TbFundAccountQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TbFundAccountQuery fundId(PK fundId) {
            if(!IdUtils.isEmpty(fundId)){
                this.fundId = fundId;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery fundIdNot(PK fundIdNot) {
            if(!IdUtils.isEmpty(fundIdNot)){
                this.fundId_NE = fundIdNot;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery fundIdIn(PK fundIdIn) {
            if(!IdUtils.isEmpty(fundIdIn)){
                if(this.fundId_IN == null){
                    this.fundId_IN = new ArrayList<PK>();
                }
                this.fundId_IN.add( fundIdIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery fundIdNotIn(PK fundIdNotIn) {
            if(!IdUtils.isEmpty(fundIdNotIn)){
                if(this.fundId_NOTIN == null){
                    this.fundId_NOTIN = new ArrayList<PK>();
                }
                this.fundId_NOTIN.add( fundIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery fundIdIsNull() {
            this.isNulls.add("fundId");
            return this;
        }

        @Override
        public TbFundAccountQuery fundIdIsNotNull() {
            this.isNotNulls.add("fundId");
            return this;
        }


        @Override
        public TbFundAccountQuery fundAccountType(String fundAccountType) {
            if(!IdUtils.isEmpty(fundAccountType)){
                this.fundAccountType = fundAccountType;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery fundAccountTypeNot(String fundAccountTypeNot) {
            if(!IdUtils.isEmpty(fundAccountTypeNot)){
                this.fundAccountType_NE = fundAccountTypeNot;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery fundAccountTypeIn(String fundAccountTypeIn) {
            if(!IdUtils.isEmpty(fundAccountTypeIn)){
                if(this.fundAccountType_IN == null){
                    this.fundAccountType_IN = new ArrayList<String>();
                }
                this.fundAccountType_IN.add( fundAccountTypeIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery fundAccountTypeNotIn(String fundAccountTypeNotIn) {
            if(!IdUtils.isEmpty(fundAccountTypeNotIn)){
                if(this.fundAccountType_NOTIN == null){
                    this.fundAccountType_NOTIN = new ArrayList<String>();
                }
                this.fundAccountType_NOTIN.add( fundAccountTypeNotIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery fundAccountTypeIsNull() {
            this.isNulls.add("fundAccountType");
            return this;
        }

        @Override
        public TbFundAccountQuery fundAccountTypeIsNotNull() {
            this.isNotNulls.add("fundAccountType");
            return this;
        }



        @Override
        public TbFundAccountQuery accountName(String accountName) {
            if(!IdUtils.isEmpty(accountName)){
                this.accountName = accountName;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNameNot(String accountNameNot) {
            if(!IdUtils.isEmpty(accountNameNot)){
                this.accountName_NE = accountNameNot;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNameLike(String accountNameLike) {
            if(!IdUtils.isEmpty(accountNameLike)){
                this.accountName_LIKE = accountNameLike;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNameNotLike(String accountNameNotLike) {
            if(!IdUtils.isEmpty(accountNameNotLike)){
                this.accountName_NOTLIKE = accountNameNotLike;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNameIn(String accountNameIn) {
            if(!IdUtils.isEmpty(accountNameIn)){
                if(this.accountName_IN == null){
                    this.accountName_IN = new ArrayList<String>();
                }
                this.accountName_IN.add( accountNameIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNameNotIn(String accountNameNotIn) {
            if(!IdUtils.isEmpty(accountNameNotIn)){
                if(this.accountName_NOTIN == null){
                    this.accountName_NOTIN = new ArrayList<String>();
                }
                this.accountName_NOTIN.add( accountNameNotIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNameIsNull() {
            this.isNulls.add("accountName");
            return this;
        }

        @Override
        public TbFundAccountQuery accountNameIsNotNull() {
            this.isNotNulls.add("accountName");
            return this;
        }


        @Override
        public TbFundAccountQuery bankId(PK bankId) {
            if(!IdUtils.isEmpty(bankId)){
                this.bankId = bankId;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery bankIdNot(PK bankIdNot) {
            if(!IdUtils.isEmpty(bankIdNot)){
                this.bankId_NE = bankIdNot;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery bankIdIn(PK bankIdIn) {
            if(!IdUtils.isEmpty(bankIdIn)){
                if(this.bankId_IN == null){
                    this.bankId_IN = new ArrayList<PK>();
                }
                this.bankId_IN.add( bankIdIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery bankIdNotIn(PK bankIdNotIn) {
            if(!IdUtils.isEmpty(bankIdNotIn)){
                if(this.bankId_NOTIN == null){
                    this.bankId_NOTIN = new ArrayList<PK>();
                }
                this.bankId_NOTIN.add( bankIdNotIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery bankIdIsNull() {
            this.isNulls.add("bankId");
            return this;
        }

        @Override
        public TbFundAccountQuery bankIdIsNotNull() {
            this.isNotNulls.add("bankId");
            return this;
        }



        @Override
        public TbFundAccountQuery accountNo(String accountNo) {
            if(!IdUtils.isEmpty(accountNo)){
                this.accountNo = accountNo;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNoNot(String accountNoNot) {
            if(!IdUtils.isEmpty(accountNoNot)){
                this.accountNo_NE = accountNoNot;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNoLike(String accountNoLike) {
            if(!IdUtils.isEmpty(accountNoLike)){
                this.accountNo_LIKE = accountNoLike;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNoNotLike(String accountNoNotLike) {
            if(!IdUtils.isEmpty(accountNoNotLike)){
                this.accountNo_NOTLIKE = accountNoNotLike;
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNoIn(String accountNoIn) {
            if(!IdUtils.isEmpty(accountNoIn)){
                if(this.accountNo_IN == null){
                    this.accountNo_IN = new ArrayList<String>();
                }
                this.accountNo_IN.add( accountNoIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNoNotIn(String accountNoNotIn) {
            if(!IdUtils.isEmpty(accountNoNotIn)){
                if(this.accountNo_NOTIN == null){
                    this.accountNo_NOTIN = new ArrayList<String>();
                }
                this.accountNo_NOTIN.add( accountNoNotIn );
            }
            return this;
        }

        @Override
        public TbFundAccountQuery accountNoIsNull() {
            this.isNulls.add("accountNo");
            return this;
        }

        @Override
        public TbFundAccountQuery accountNoIsNotNull() {
            this.isNotNulls.add("accountNo");
            return this;
        }



	
}