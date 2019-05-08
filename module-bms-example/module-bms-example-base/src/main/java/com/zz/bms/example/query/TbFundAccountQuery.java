package com.zz.bms.example.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.example.domain.TbFundAccountEntity;

import java.io.Serializable;
import java.util.Date;
import java.lang.String;

/**
 * 基金账户 查询抽象类
 *
 * @author Administrator
 * @date 2019-5-8 10:49:21
 */
public interface TbFundAccountQuery<PK extends Serializable> extends Query<TbFundAccountEntity,PK> {

        public TbFundAccountQuery id(PK id);
        public TbFundAccountQuery idNot(PK idNot);
        public TbFundAccountQuery idIn(PK idIn);
        public TbFundAccountQuery idNotIn(PK idNotIn);
        public TbFundAccountQuery idIsNull();
        public TbFundAccountQuery idIsNotNull();





        public TbFundAccountQuery fundId(PK fundId);
        public TbFundAccountQuery fundIdNot(PK fundIdNot);
        public TbFundAccountQuery fundIdIn(PK fundIdIn);
        public TbFundAccountQuery fundIdNotIn(PK fundIdNotIn);
        public TbFundAccountQuery fundIdIsNull();
        public TbFundAccountQuery fundIdIsNotNull();





        public TbFundAccountQuery fundAccountType(String fundAccountType);
        public TbFundAccountQuery fundAccountTypeNot(String fundAccountTypeNot);
        public TbFundAccountQuery fundAccountTypeIn(String fundAccountTypeIn);
        public TbFundAccountQuery fundAccountTypeNotIn(String fundAccountTypeNotIn);
        public TbFundAccountQuery fundAccountTypeIsNull();
        public TbFundAccountQuery fundAccountTypeIsNotNull();





        public TbFundAccountQuery accountName(String accountName);
        public TbFundAccountQuery accountNameNot(String accountNameNot);
        public TbFundAccountQuery accountNameIn(String accountNameIn);
        public TbFundAccountQuery accountNameNotIn(String accountNameNotIn);
        public TbFundAccountQuery accountNameLike(String accountNameLike);
        public TbFundAccountQuery accountNameNotLike(String accountNameNotLike);
        public TbFundAccountQuery accountNameIsNull();
        public TbFundAccountQuery accountNameIsNotNull();





        public TbFundAccountQuery bankId(PK bankId);
        public TbFundAccountQuery bankIdNot(PK bankIdNot);
        public TbFundAccountQuery bankIdIn(PK bankIdIn);
        public TbFundAccountQuery bankIdNotIn(PK bankIdNotIn);
        public TbFundAccountQuery bankIdIsNull();
        public TbFundAccountQuery bankIdIsNotNull();





        public TbFundAccountQuery accountNo(String accountNo);
        public TbFundAccountQuery accountNoNot(String accountNoNot);
        public TbFundAccountQuery accountNoIn(String accountNoIn);
        public TbFundAccountQuery accountNoNotIn(String accountNoNotIn);
        public TbFundAccountQuery accountNoLike(String accountNoLike);
        public TbFundAccountQuery accountNoNotLike(String accountNoNotLike);
        public TbFundAccountQuery accountNoIsNull();
        public TbFundAccountQuery accountNoIsNotNull();





        public TbFundAccountQuery startDate(Date startDate);
        public TbFundAccountQuery startDateNot(Date startDateNot);
        public TbFundAccountQuery startDateGreaterThan(Date startDateGreaterThan);
        public TbFundAccountQuery startDateGreaterEqual(Date startDateGreaterEqual);
        public TbFundAccountQuery startDateLessThan(Date startDateLessThan);
        public TbFundAccountQuery startDateLessEqual(Date startDateLessEqual);





        public TbFundAccountQuery otherBankId(PK otherBankId);
        public TbFundAccountQuery otherBankIdNot(PK otherBankIdNot);
        public TbFundAccountQuery otherBankIdIn(PK otherBankIdIn);
        public TbFundAccountQuery otherBankIdNotIn(PK otherBankIdNotIn);
        public TbFundAccountQuery otherBankIdIsNull();
        public TbFundAccountQuery otherBankIdIsNotNull();





        public TbFundAccountQuery userId(PK userId);
        public TbFundAccountQuery userIdNot(PK userIdNot);
        public TbFundAccountQuery userIdIn(PK userIdIn);
        public TbFundAccountQuery userIdNotIn(PK userIdNotIn);
        public TbFundAccountQuery userIdIsNull();
        public TbFundAccountQuery userIdIsNotNull();






	
}