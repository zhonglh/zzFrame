package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsPermitEntity;
import com.zz.bms.system.query.TsPermitQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

/**
* 许可 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:12
*/
public class TsPermitQueryImpl<PK extends Serializable> extends TsPermitAbstractQueryImpl<PK> implements TsPermitQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> permitName_IN;
        private List<String> permitName_NOTIN;

        private List<String> permitCode_IN;
        private List<String> permitCode_NOTIN;

        private List<String> remark_IN;
        private List<String> remark_NOTIN;

        private List<String> deleteFlag_IN;
        private List<String> deleteFlag_NOTIN;


        @Override
        public TsPermitQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsPermitQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsPermitQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsPermitQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsPermitQuery permitName(String permitName) {
            if(!IdUtils.isEmpty(permitName)){
                this.permitName = permitName;
            }
            return this;
        }

        @Override
        public TsPermitQuery permitNameNot(String permitNameNot) {
            if(!IdUtils.isEmpty(permitNameNot)){
                this.permitName_NE = permitNameNot;
            }
            return this;
        }

        @Override
        public TsPermitQuery permitNameLike(String permitNameLike) {
            if(!IdUtils.isEmpty(permitNameLike)){
                this.permitName_LIKE = permitNameLike;
            }
            return this;
        }

        @Override
        public TsPermitQuery permitNameNotLike(String permitNameNotLike) {
            if(!IdUtils.isEmpty(permitNameNotLike)){
                this.permitName_NOTLIKE = permitNameNotLike;
            }
            return this;
        }

        @Override
        public TsPermitQuery permitNameIn(String permitNameIn) {
            if(!IdUtils.isEmpty(permitNameIn)){
                if(this.permitName_IN == null){
                    this.permitName_IN = new ArrayList<String>();
                }
                this.permitName_IN.add( permitNameIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery permitNameNotIn(String permitNameNotIn) {
            if(!IdUtils.isEmpty(permitNameNotIn)){
                if(this.permitName_NOTIN == null){
                    this.permitName_NOTIN = new ArrayList<String>();
                }
                this.permitName_NOTIN.add( permitNameNotIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery permitNameIsNull() {
            this.isNulls.add("permitName");
            return this;
        }

        @Override
        public TsPermitQuery permitNameIsNotNull() {
            this.isNotNulls.add("permitName");
            return this;
        }



        @Override
        public TsPermitQuery permitCode(String permitCode) {
            if(!IdUtils.isEmpty(permitCode)){
                this.permitCode = permitCode;
            }
            return this;
        }

        @Override
        public TsPermitQuery permitCodeNot(String permitCodeNot) {
            if(!IdUtils.isEmpty(permitCodeNot)){
                this.permitCode_NE = permitCodeNot;
            }
            return this;
        }

        @Override
        public TsPermitQuery permitCodeLike(String permitCodeLike) {
            if(!IdUtils.isEmpty(permitCodeLike)){
                this.permitCode_LIKE = permitCodeLike;
            }
            return this;
        }

        @Override
        public TsPermitQuery permitCodeNotLike(String permitCodeNotLike) {
            if(!IdUtils.isEmpty(permitCodeNotLike)){
                this.permitCode_NOTLIKE = permitCodeNotLike;
            }
            return this;
        }

        @Override
        public TsPermitQuery permitCodeIn(String permitCodeIn) {
            if(!IdUtils.isEmpty(permitCodeIn)){
                if(this.permitCode_IN == null){
                    this.permitCode_IN = new ArrayList<String>();
                }
                this.permitCode_IN.add( permitCodeIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery permitCodeNotIn(String permitCodeNotIn) {
            if(!IdUtils.isEmpty(permitCodeNotIn)){
                if(this.permitCode_NOTIN == null){
                    this.permitCode_NOTIN = new ArrayList<String>();
                }
                this.permitCode_NOTIN.add( permitCodeNotIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery permitCodeIsNull() {
            this.isNulls.add("permitCode");
            return this;
        }

        @Override
        public TsPermitQuery permitCodeIsNotNull() {
            this.isNotNulls.add("permitCode");
            return this;
        }



        @Override
        public TsPermitQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TsPermitQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TsPermitQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TsPermitQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TsPermitQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TsPermitQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TsPermitQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TsPermitQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TsPermitQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TsPermitQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TsPermitQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TsPermitQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TsPermitQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



	
}