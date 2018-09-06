package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 许可 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public interface TsPermitQuery<PK extends Serializable> extends Query<TsPermitEntity,PK> {

        public TsPermitQuery id(PK id);
        public TsPermitQuery idNot(PK idNot);
        public TsPermitQuery idIn(PK idIn);
        public TsPermitQuery idNotIn(PK idNotIn);
        public TsPermitQuery idIsNull();
        public TsPermitQuery idIsNotNull();





        public TsPermitQuery permitName(String permitName);
        public TsPermitQuery permitNameNot(String permitNameNot);
        public TsPermitQuery permitNameIn(String permitNameIn);
        public TsPermitQuery permitNameNotIn(String permitNameNotIn);
        public TsPermitQuery permitNameLike(String permitNameLike);
        public TsPermitQuery permitNameNotLike(String permitNameNotLike);
        public TsPermitQuery permitNameIsNull();
        public TsPermitQuery permitNameIsNotNull();





        public TsPermitQuery permitCode(String permitCode);
        public TsPermitQuery permitCodeNot(String permitCodeNot);
        public TsPermitQuery permitCodeIn(String permitCodeIn);
        public TsPermitQuery permitCodeNotIn(String permitCodeNotIn);
        public TsPermitQuery permitCodeLike(String permitCodeLike);
        public TsPermitQuery permitCodeNotLike(String permitCodeNotLike);
        public TsPermitQuery permitCodeIsNull();
        public TsPermitQuery permitCodeIsNotNull();





        public TsPermitQuery remark(String remark);
        public TsPermitQuery remarkNot(String remarkNot);
        public TsPermitQuery remarkIn(String remarkIn);
        public TsPermitQuery remarkNotIn(String remarkNotIn);
        public TsPermitQuery remarkLike(String remarkLike);
        public TsPermitQuery remarkNotLike(String remarkNotLike);
        public TsPermitQuery remarkIsNull();
        public TsPermitQuery remarkIsNotNull();





        public TsPermitQuery deleteFlag(String deleteFlag);
        public TsPermitQuery deleteFlagNot(String deleteFlagNot);
        public TsPermitQuery deleteFlagIn(String deleteFlagIn);
        public TsPermitQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TsPermitQuery deleteFlagLike(String deleteFlagLike);
        public TsPermitQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TsPermitQuery deleteFlagIsNull();
        public TsPermitQuery deleteFlagIsNotNull();






	
}