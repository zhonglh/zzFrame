package com.zz.bms.example.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.example.domain.TbBankEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 银行信息 查询抽象类
 *
 * @author Administrator
 * @date 2019-5-8 13:45:41
 */
public interface TbBankQuery<PK extends Serializable> extends Query<TbBankEntity,PK> {

        public TbBankQuery id(PK id);
        public TbBankQuery idNot(PK idNot);
        public TbBankQuery idIn(PK idIn);
        public TbBankQuery idNotIn(PK idNotIn);
        public TbBankQuery idIsNull();
        public TbBankQuery idIsNotNull();





        public TbBankQuery bankName(String bankName);
        public TbBankQuery bankNameNot(String bankNameNot);
        public TbBankQuery bankNameIn(String bankNameIn);
        public TbBankQuery bankNameNotIn(String bankNameNotIn);
        public TbBankQuery bankNameLike(String bankNameLike);
        public TbBankQuery bankNameNotLike(String bankNameNotLike);
        public TbBankQuery bankNameIsNull();
        public TbBankQuery bankNameIsNotNull();





        public TbBankQuery bankShortName(String bankShortName);
        public TbBankQuery bankShortNameNot(String bankShortNameNot);
        public TbBankQuery bankShortNameIn(String bankShortNameIn);
        public TbBankQuery bankShortNameNotIn(String bankShortNameNotIn);
        public TbBankQuery bankShortNameLike(String bankShortNameLike);
        public TbBankQuery bankShortNameNotLike(String bankShortNameNotLike);
        public TbBankQuery bankShortNameIsNull();
        public TbBankQuery bankShortNameIsNotNull();





        public TbBankQuery serviceTelephone(String serviceTelephone);
        public TbBankQuery serviceTelephoneNot(String serviceTelephoneNot);
        public TbBankQuery serviceTelephoneIn(String serviceTelephoneIn);
        public TbBankQuery serviceTelephoneNotIn(String serviceTelephoneNotIn);
        public TbBankQuery serviceTelephoneLike(String serviceTelephoneLike);
        public TbBankQuery serviceTelephoneNotLike(String serviceTelephoneNotLike);
        public TbBankQuery serviceTelephoneIsNull();
        public TbBankQuery serviceTelephoneIsNotNull();





        public TbBankQuery officialWebsite(String officialWebsite);
        public TbBankQuery officialWebsiteNot(String officialWebsiteNot);
        public TbBankQuery officialWebsiteIn(String officialWebsiteIn);
        public TbBankQuery officialWebsiteNotIn(String officialWebsiteNotIn);
        public TbBankQuery officialWebsiteLike(String officialWebsiteLike);
        public TbBankQuery officialWebsiteNotLike(String officialWebsiteNotLike);
        public TbBankQuery officialWebsiteIsNull();
        public TbBankQuery officialWebsiteIsNotNull();






	
}