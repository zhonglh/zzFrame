package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsDictTypeEntity;
import com.zz.bms.system.query.TsDictTypeQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;

/**
* 字典类型 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class TsDictTypeQueryImpl<PK extends Serializable> extends TsDictTypeAbstractQueryImpl<PK> implements TsDictTypeQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> pid_IN;
        private List<PK> pid_NOTIN;


        private List<String> dictTypeCode_IN;
        private List<String> dictTypeCode_NOTIN;

        private List<String> dictTypeName_IN;
        private List<String> dictTypeName_NOTIN;
        private List<String> dictTypeShowable_IN;
        private List<String> dictTypeShowable_NOTIN;

        private List<String> dictAddable_IN;
        private List<String> dictAddable_NOTIN;

        private List<String> dictUpdate_IN;
        private List<String> dictUpdate_NOTIN;

        private List<String> dictDelete_IN;
        private List<String> dictDelete_NOTIN;



        @Override
        public TsDictTypeQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsDictTypeQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TsDictTypeQuery pid(PK pid) {
            if(!IdUtils.isEmpty(pid)){
                this.pid = pid;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery pidNot(PK pidNot) {
            if(!IdUtils.isEmpty(pidNot)){
                this.pid_NE = pidNot;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery pidIn(PK pidIn) {
            if(!IdUtils.isEmpty(pidIn)){
                if(this.pid_IN == null){
                    this.pid_IN = new ArrayList<PK>();
                }
                this.pid_IN.add( pidIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery pidNotIn(PK pidNotIn) {
            if(!IdUtils.isEmpty(pidNotIn)){
                if(this.pid_NOTIN == null){
                    this.pid_NOTIN = new ArrayList<PK>();
                }
                this.pid_NOTIN.add( pidNotIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery pidIsNull() {
            this.isNulls.add("pid");
            return this;
        }

        @Override
        public TsDictTypeQuery pidIsNotNull() {
            this.isNotNulls.add("pid");
            return this;
        }



        @Override
        public TsDictTypeQuery dictTypeCode(String dictTypeCode) {
            if(!IdUtils.isEmpty(dictTypeCode)){
                this.dictTypeCode = dictTypeCode;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeCodeNot(String dictTypeCodeNot) {
            if(!IdUtils.isEmpty(dictTypeCodeNot)){
                this.dictTypeCode_NE = dictTypeCodeNot;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeCodeLike(String dictTypeCodeLike) {
            if(!IdUtils.isEmpty(dictTypeCodeLike)){
                this.dictTypeCode_LIKE = dictTypeCodeLike;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeCodeNotLike(String dictTypeCodeNotLike) {
            if(!IdUtils.isEmpty(dictTypeCodeNotLike)){
                this.dictTypeCode_NOTLIKE = dictTypeCodeNotLike;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeCodeIn(String dictTypeCodeIn) {
            if(!IdUtils.isEmpty(dictTypeCodeIn)){
                if(this.dictTypeCode_IN == null){
                    this.dictTypeCode_IN = new ArrayList<String>();
                }
                this.dictTypeCode_IN.add( dictTypeCodeIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeCodeNotIn(String dictTypeCodeNotIn) {
            if(!IdUtils.isEmpty(dictTypeCodeNotIn)){
                if(this.dictTypeCode_NOTIN == null){
                    this.dictTypeCode_NOTIN = new ArrayList<String>();
                }
                this.dictTypeCode_NOTIN.add( dictTypeCodeNotIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeCodeIsNull() {
            this.isNulls.add("dictTypeCode");
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeCodeIsNotNull() {
            this.isNotNulls.add("dictTypeCode");
            return this;
        }



        @Override
        public TsDictTypeQuery dictTypeName(String dictTypeName) {
            if(!IdUtils.isEmpty(dictTypeName)){
                this.dictTypeName = dictTypeName;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeNameNot(String dictTypeNameNot) {
            if(!IdUtils.isEmpty(dictTypeNameNot)){
                this.dictTypeName_NE = dictTypeNameNot;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeNameLike(String dictTypeNameLike) {
            if(!IdUtils.isEmpty(dictTypeNameLike)){
                this.dictTypeName_LIKE = dictTypeNameLike;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeNameNotLike(String dictTypeNameNotLike) {
            if(!IdUtils.isEmpty(dictTypeNameNotLike)){
                this.dictTypeName_NOTLIKE = dictTypeNameNotLike;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeNameIn(String dictTypeNameIn) {
            if(!IdUtils.isEmpty(dictTypeNameIn)){
                if(this.dictTypeName_IN == null){
                    this.dictTypeName_IN = new ArrayList<String>();
                }
                this.dictTypeName_IN.add( dictTypeNameIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeNameNotIn(String dictTypeNameNotIn) {
            if(!IdUtils.isEmpty(dictTypeNameNotIn)){
                if(this.dictTypeName_NOTIN == null){
                    this.dictTypeName_NOTIN = new ArrayList<String>();
                }
                this.dictTypeName_NOTIN.add( dictTypeNameNotIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeNameIsNull() {
            this.isNulls.add("dictTypeName");
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeNameIsNotNull() {
            this.isNotNulls.add("dictTypeName");
            return this;
        }


        @Override
        public TsDictTypeQuery dictTypeShowable(String dictTypeShowable) {
            if(!IdUtils.isEmpty(dictTypeShowable)){
                this.dictTypeShowable = dictTypeShowable;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeShowableNot(String dictTypeShowableNot) {
            if(!IdUtils.isEmpty(dictTypeShowableNot)){
                this.dictTypeShowable_NE = dictTypeShowableNot;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeShowableIn(String dictTypeShowableIn) {
            if(!IdUtils.isEmpty(dictTypeShowableIn)){
                if(this.dictTypeShowable_IN == null){
                    this.dictTypeShowable_IN = new ArrayList<String>();
                }
                this.dictTypeShowable_IN.add( dictTypeShowableIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeShowableNotIn(String dictTypeShowableNotIn) {
            if(!IdUtils.isEmpty(dictTypeShowableNotIn)){
                if(this.dictTypeShowable_NOTIN == null){
                    this.dictTypeShowable_NOTIN = new ArrayList<String>();
                }
                this.dictTypeShowable_NOTIN.add( dictTypeShowableNotIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeShowableIsNull() {
            this.isNulls.add("dictTypeShowable");
            return this;
        }

        @Override
        public TsDictTypeQuery dictTypeShowableIsNotNull() {
            this.isNotNulls.add("dictTypeShowable");
            return this;
        }


        @Override
        public TsDictTypeQuery dictAddable(String dictAddable) {
            if(!IdUtils.isEmpty(dictAddable)){
                this.dictAddable = dictAddable;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictAddableNot(String dictAddableNot) {
            if(!IdUtils.isEmpty(dictAddableNot)){
                this.dictAddable_NE = dictAddableNot;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictAddableIn(String dictAddableIn) {
            if(!IdUtils.isEmpty(dictAddableIn)){
                if(this.dictAddable_IN == null){
                    this.dictAddable_IN = new ArrayList<String>();
                }
                this.dictAddable_IN.add( dictAddableIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictAddableNotIn(String dictAddableNotIn) {
            if(!IdUtils.isEmpty(dictAddableNotIn)){
                if(this.dictAddable_NOTIN == null){
                    this.dictAddable_NOTIN = new ArrayList<String>();
                }
                this.dictAddable_NOTIN.add( dictAddableNotIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictAddableIsNull() {
            this.isNulls.add("dictAddable");
            return this;
        }

        @Override
        public TsDictTypeQuery dictAddableIsNotNull() {
            this.isNotNulls.add("dictAddable");
            return this;
        }


        @Override
        public TsDictTypeQuery dictUpdate(String dictUpdate) {
            if(!IdUtils.isEmpty(dictUpdate)){
                this.dictUpdate = dictUpdate;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictUpdateNot(String dictUpdateNot) {
            if(!IdUtils.isEmpty(dictUpdateNot)){
                this.dictUpdate_NE = dictUpdateNot;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictUpdateIn(String dictUpdateIn) {
            if(!IdUtils.isEmpty(dictUpdateIn)){
                if(this.dictUpdate_IN == null){
                    this.dictUpdate_IN = new ArrayList<String>();
                }
                this.dictUpdate_IN.add( dictUpdateIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictUpdateNotIn(String dictUpdateNotIn) {
            if(!IdUtils.isEmpty(dictUpdateNotIn)){
                if(this.dictUpdate_NOTIN == null){
                    this.dictUpdate_NOTIN = new ArrayList<String>();
                }
                this.dictUpdate_NOTIN.add( dictUpdateNotIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictUpdateIsNull() {
            this.isNulls.add("dictUpdate");
            return this;
        }

        @Override
        public TsDictTypeQuery dictUpdateIsNotNull() {
            this.isNotNulls.add("dictUpdate");
            return this;
        }


        @Override
        public TsDictTypeQuery dictDelete(String dictDelete) {
            if(!IdUtils.isEmpty(dictDelete)){
                this.dictDelete = dictDelete;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictDeleteNot(String dictDeleteNot) {
            if(!IdUtils.isEmpty(dictDeleteNot)){
                this.dictDelete_NE = dictDeleteNot;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictDeleteIn(String dictDeleteIn) {
            if(!IdUtils.isEmpty(dictDeleteIn)){
                if(this.dictDelete_IN == null){
                    this.dictDelete_IN = new ArrayList<String>();
                }
                this.dictDelete_IN.add( dictDeleteIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictDeleteNotIn(String dictDeleteNotIn) {
            if(!IdUtils.isEmpty(dictDeleteNotIn)){
                if(this.dictDelete_NOTIN == null){
                    this.dictDelete_NOTIN = new ArrayList<String>();
                }
                this.dictDelete_NOTIN.add( dictDeleteNotIn );
            }
            return this;
        }

        @Override
        public TsDictTypeQuery dictDeleteIsNull() {
            this.isNulls.add("dictDelete");
            return this;
        }

        @Override
        public TsDictTypeQuery dictDeleteIsNotNull() {
            this.isNotNulls.add("dictDelete");
            return this;
        }


        @Override
        public TsDictTypeQuery orderby(Integer orderby) {
            if(!IdUtils.isEmpty(orderby)){
                this.orderby = orderby;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery orderbyNot(Integer orderbyNot) {
            if(!IdUtils.isEmpty(orderbyNot)){
                this.orderby_NE = orderbyNot;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery orderbyGreaterThan(Integer orderbyGreaterThan){
            if(orderbyGreaterThan != null){
                this.orderby_GT = orderbyGreaterThan;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery orderbyGreaterEqual(Integer orderbyGreaterEqual){
            if(orderbyGreaterEqual != null){
                this.orderby_GE = orderbyGreaterEqual;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery orderbyLessThan(Integer orderbyLessThan){
            if(orderbyLessThan != null){
                this.orderby_LT = orderbyLessThan;
            }
            return this;
        }

        @Override
        public TsDictTypeQuery orderbyLessEqual(Integer orderbyLessEqual){
            if(orderbyLessEqual != null){
                this.orderby_LE = orderbyLessEqual;
            }
            return this;
        }


	
}