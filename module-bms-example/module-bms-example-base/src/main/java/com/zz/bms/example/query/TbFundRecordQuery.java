package com.zz.bms.example.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.example.domain.TbFundRecordEntity;

import java.io.Serializable;
import java.util.Date;
import java.lang.String;

/**
 * 基金备案 查询抽象类
 *
 * @author Administrator
 * @date 2019-5-1 17:49:22
 */
public interface TbFundRecordQuery<PK extends Serializable> extends Query<TbFundRecordEntity,PK> {

        public TbFundRecordQuery id(PK id);
        public TbFundRecordQuery idNot(PK idNot);
        public TbFundRecordQuery idIn(PK idIn);
        public TbFundRecordQuery idNotIn(PK idNotIn);
        public TbFundRecordQuery idIsNull();
        public TbFundRecordQuery idIsNotNull();





        public TbFundRecordQuery fundId(PK fundId);
        public TbFundRecordQuery fundIdNot(PK fundIdNot);
        public TbFundRecordQuery fundIdIn(PK fundIdIn);
        public TbFundRecordQuery fundIdNotIn(PK fundIdNotIn);
        public TbFundRecordQuery fundIdIsNull();
        public TbFundRecordQuery fundIdIsNotNull();





        public TbFundRecordQuery recordDate(Date recordDate);
        public TbFundRecordQuery recordDateNot(Date recordDateNot);
        public TbFundRecordQuery recordDateGreaterThan(Date recordDateGreaterThan);
        public TbFundRecordQuery recordDateGreaterEqual(Date recordDateGreaterEqual);
        public TbFundRecordQuery recordDateLessThan(Date recordDateLessThan);
        public TbFundRecordQuery recordDateLessEqual(Date recordDateLessEqual);





        public TbFundRecordQuery recordAddr(String recordAddr);
        public TbFundRecordQuery recordAddrNot(String recordAddrNot);
        public TbFundRecordQuery recordAddrIn(String recordAddrIn);
        public TbFundRecordQuery recordAddrNotIn(String recordAddrNotIn);
        public TbFundRecordQuery recordAddrLike(String recordAddrLike);
        public TbFundRecordQuery recordAddrNotLike(String recordAddrNotLike);
        public TbFundRecordQuery recordAddrIsNull();
        public TbFundRecordQuery recordAddrIsNotNull();






	
}