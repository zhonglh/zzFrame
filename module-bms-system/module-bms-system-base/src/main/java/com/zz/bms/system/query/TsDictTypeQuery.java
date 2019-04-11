package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsDictTypeEntity;

import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;

/**
 * 字典类型 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:17
 */
public interface TsDictTypeQuery<PK extends Serializable> extends Query<TsDictTypeEntity,PK> {

        public TsDictTypeQuery id(PK id);
        public TsDictTypeQuery idNot(PK idNot);
        public TsDictTypeQuery idIn(PK idIn);
        public TsDictTypeQuery idNotIn(PK idNotIn);
        public TsDictTypeQuery idIsNull();
        public TsDictTypeQuery idIsNotNull();





        public TsDictTypeQuery pid(PK pid);
        public TsDictTypeQuery pidNot(PK pidNot);
        public TsDictTypeQuery pidIn(PK pidIn);
        public TsDictTypeQuery pidNotIn(PK pidNotIn);
        public TsDictTypeQuery pidIsNull();
        public TsDictTypeQuery pidIsNotNull();





        public TsDictTypeQuery dictTypeCode(String dictTypeCode);
        public TsDictTypeQuery dictTypeCodeNot(String dictTypeCodeNot);
        public TsDictTypeQuery dictTypeCodeIn(String dictTypeCodeIn);
        public TsDictTypeQuery dictTypeCodeNotIn(String dictTypeCodeNotIn);
        public TsDictTypeQuery dictTypeCodeLike(String dictTypeCodeLike);
        public TsDictTypeQuery dictTypeCodeNotLike(String dictTypeCodeNotLike);
        public TsDictTypeQuery dictTypeCodeIsNull();
        public TsDictTypeQuery dictTypeCodeIsNotNull();





        public TsDictTypeQuery dictTypeName(String dictTypeName);
        public TsDictTypeQuery dictTypeNameNot(String dictTypeNameNot);
        public TsDictTypeQuery dictTypeNameIn(String dictTypeNameIn);
        public TsDictTypeQuery dictTypeNameNotIn(String dictTypeNameNotIn);
        public TsDictTypeQuery dictTypeNameLike(String dictTypeNameLike);
        public TsDictTypeQuery dictTypeNameNotLike(String dictTypeNameNotLike);
        public TsDictTypeQuery dictTypeNameIsNull();
        public TsDictTypeQuery dictTypeNameIsNotNull();





        public TsDictTypeQuery dictTypeShowable(String dictTypeShowable);
        public TsDictTypeQuery dictTypeShowableNot(String dictTypeShowableNot);
        public TsDictTypeQuery dictTypeShowableIn(String dictTypeShowableIn);
        public TsDictTypeQuery dictTypeShowableNotIn(String dictTypeShowableNotIn);
        public TsDictTypeQuery dictTypeShowableIsNull();
        public TsDictTypeQuery dictTypeShowableIsNotNull();





        public TsDictTypeQuery dictAddable(String dictAddable);
        public TsDictTypeQuery dictAddableNot(String dictAddableNot);
        public TsDictTypeQuery dictAddableIn(String dictAddableIn);
        public TsDictTypeQuery dictAddableNotIn(String dictAddableNotIn);
        public TsDictTypeQuery dictAddableIsNull();
        public TsDictTypeQuery dictAddableIsNotNull();





        public TsDictTypeQuery dictUpdate(String dictUpdate);
        public TsDictTypeQuery dictUpdateNot(String dictUpdateNot);
        public TsDictTypeQuery dictUpdateIn(String dictUpdateIn);
        public TsDictTypeQuery dictUpdateNotIn(String dictUpdateNotIn);
        public TsDictTypeQuery dictUpdateIsNull();
        public TsDictTypeQuery dictUpdateIsNotNull();





        public TsDictTypeQuery dictDelete(String dictDelete);
        public TsDictTypeQuery dictDeleteNot(String dictDeleteNot);
        public TsDictTypeQuery dictDeleteIn(String dictDeleteIn);
        public TsDictTypeQuery dictDeleteNotIn(String dictDeleteNotIn);
        public TsDictTypeQuery dictDeleteIsNull();
        public TsDictTypeQuery dictDeleteIsNotNull();





        public TsDictTypeQuery orderby(Integer orderby);
        public TsDictTypeQuery orderbyNot(Integer orderbyNot);
        public TsDictTypeQuery orderbyGreaterThan(Integer orderbyGreaterThan);
        public TsDictTypeQuery orderbyGreaterEqual(Integer orderbyGreaterEqual);
        public TsDictTypeQuery orderbyLessThan(Integer orderbyLessThan);
        public TsDictTypeQuery orderbyLessEqual(Integer orderbyLessEqual);






	
}