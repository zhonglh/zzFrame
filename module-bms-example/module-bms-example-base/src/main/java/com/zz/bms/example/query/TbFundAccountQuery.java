package com.zz.bms.example.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.example.domain.TbFundAccountEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 基金账户 查询抽象类
 *
 * @author Administrator
 * @date 2019-5-2 18:36:07
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





        public TbFundAccountQuery bankId(String bankId);
        public TbFundAccountQuery bankIdNot(String bankIdNot);
        public TbFundAccountQuery bankIdIn(String bankIdIn);
        public TbFundAccountQuery bankIdNotIn(String bankIdNotIn);
        public TbFundAccountQuery bankIdLike(String bankIdLike);
        public TbFundAccountQuery bankIdNotLike(String bankIdNotLike);
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






	
}