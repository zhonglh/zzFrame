package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.VsUserPermitEntity;
import com.zz.bms.system.query.VsUserPermitQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

/**
* 用户许可视图 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class VsUserPermitQueryImpl<PK extends Serializable> extends VsUserPermitAbstractQueryImpl<PK> implements VsUserPermitQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> permitCode_IN;
        private List<String> permitCode_NOTIN;

        private List<String> userName_IN;
        private List<String> userName_NOTIN;

        private List<String> loginName_IN;
        private List<String> loginName_NOTIN;
        private List<PK> userId_IN;
        private List<PK> userId_NOTIN;



        @Override
        public VsUserPermitQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public VsUserPermitQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public VsUserPermitQuery permitCode(String permitCode) {
            if(!IdUtils.isEmpty(permitCode)){
                this.permitCode = permitCode;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery permitCodeNot(String permitCodeNot) {
            if(!IdUtils.isEmpty(permitCodeNot)){
                this.permitCode_NE = permitCodeNot;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery permitCodeLike(String permitCodeLike) {
            if(!IdUtils.isEmpty(permitCodeLike)){
                this.permitCode_LIKE = permitCodeLike;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery permitCodeNotLike(String permitCodeNotLike) {
            if(!IdUtils.isEmpty(permitCodeNotLike)){
                this.permitCode_NOTLIKE = permitCodeNotLike;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery permitCodeIn(String permitCodeIn) {
            if(!IdUtils.isEmpty(permitCodeIn)){
                if(this.permitCode_IN == null){
                    this.permitCode_IN = new ArrayList<String>();
                }
                this.permitCode_IN.add( permitCodeIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery permitCodeNotIn(String permitCodeNotIn) {
            if(!IdUtils.isEmpty(permitCodeNotIn)){
                if(this.permitCode_NOTIN == null){
                    this.permitCode_NOTIN = new ArrayList<String>();
                }
                this.permitCode_NOTIN.add( permitCodeNotIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery permitCodeIsNull() {
            this.isNulls.add("permitCode");
            return this;
        }

        @Override
        public VsUserPermitQuery permitCodeIsNotNull() {
            this.isNotNulls.add("permitCode");
            return this;
        }



        @Override
        public VsUserPermitQuery userName(String userName) {
            if(!IdUtils.isEmpty(userName)){
                this.userName = userName;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userNameNot(String userNameNot) {
            if(!IdUtils.isEmpty(userNameNot)){
                this.userName_NE = userNameNot;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userNameLike(String userNameLike) {
            if(!IdUtils.isEmpty(userNameLike)){
                this.userName_LIKE = userNameLike;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userNameNotLike(String userNameNotLike) {
            if(!IdUtils.isEmpty(userNameNotLike)){
                this.userName_NOTLIKE = userNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userNameIn(String userNameIn) {
            if(!IdUtils.isEmpty(userNameIn)){
                if(this.userName_IN == null){
                    this.userName_IN = new ArrayList<String>();
                }
                this.userName_IN.add( userNameIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userNameNotIn(String userNameNotIn) {
            if(!IdUtils.isEmpty(userNameNotIn)){
                if(this.userName_NOTIN == null){
                    this.userName_NOTIN = new ArrayList<String>();
                }
                this.userName_NOTIN.add( userNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userNameIsNull() {
            this.isNulls.add("userName");
            return this;
        }

        @Override
        public VsUserPermitQuery userNameIsNotNull() {
            this.isNotNulls.add("userName");
            return this;
        }



        @Override
        public VsUserPermitQuery loginName(String loginName) {
            if(!IdUtils.isEmpty(loginName)){
                this.loginName = loginName;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery loginNameNot(String loginNameNot) {
            if(!IdUtils.isEmpty(loginNameNot)){
                this.loginName_NE = loginNameNot;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery loginNameLike(String loginNameLike) {
            if(!IdUtils.isEmpty(loginNameLike)){
                this.loginName_LIKE = loginNameLike;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery loginNameNotLike(String loginNameNotLike) {
            if(!IdUtils.isEmpty(loginNameNotLike)){
                this.loginName_NOTLIKE = loginNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery loginNameIn(String loginNameIn) {
            if(!IdUtils.isEmpty(loginNameIn)){
                if(this.loginName_IN == null){
                    this.loginName_IN = new ArrayList<String>();
                }
                this.loginName_IN.add( loginNameIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery loginNameNotIn(String loginNameNotIn) {
            if(!IdUtils.isEmpty(loginNameNotIn)){
                if(this.loginName_NOTIN == null){
                    this.loginName_NOTIN = new ArrayList<String>();
                }
                this.loginName_NOTIN.add( loginNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery loginNameIsNull() {
            this.isNulls.add("loginName");
            return this;
        }

        @Override
        public VsUserPermitQuery loginNameIsNotNull() {
            this.isNotNulls.add("loginName");
            return this;
        }


        @Override
        public VsUserPermitQuery userId(PK userId) {
            if(!IdUtils.isEmpty(userId)){
                this.userId = userId;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userIdNot(PK userIdNot) {
            if(!IdUtils.isEmpty(userIdNot)){
                this.userId_NE = userIdNot;
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userIdIn(PK userIdIn) {
            if(!IdUtils.isEmpty(userIdIn)){
                if(this.userId_IN == null){
                    this.userId_IN = new ArrayList<PK>();
                }
                this.userId_IN.add( userIdIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userIdNotIn(PK userIdNotIn) {
            if(!IdUtils.isEmpty(userIdNotIn)){
                if(this.userId_NOTIN == null){
                    this.userId_NOTIN = new ArrayList<PK>();
                }
                this.userId_NOTIN.add( userIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserPermitQuery userIdIsNull() {
            this.isNulls.add("userId");
            return this;
        }

        @Override
        public VsUserPermitQuery userIdIsNotNull() {
            this.isNotNulls.add("userId");
            return this;
        }



	
}