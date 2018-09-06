package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsUserRoleEntity;
import com.zz.bms.system.query.TsUserRoleQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

/**
* 用户角色关联 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class TsUserRoleQueryImpl<PK extends Serializable> extends TsUserRoleAbstractQueryImpl<PK> implements TsUserRoleQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> userId_IN;
        private List<PK> userId_NOTIN;

        private List<PK> roleId_IN;
        private List<PK> roleId_NOTIN;



        @Override
        public TsUserRoleQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsUserRoleQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsUserRoleQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsUserRoleQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsUserRoleQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsUserRoleQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TsUserRoleQuery userId(PK userId) {
            if(!IdUtils.isEmpty(userId)){
                this.userId = userId;
            }
            return this;
        }

        @Override
        public TsUserRoleQuery userIdNot(PK userIdNot) {
            if(!IdUtils.isEmpty(userIdNot)){
                this.userId_NE = userIdNot;
            }
            return this;
        }

        @Override
        public TsUserRoleQuery userIdIn(PK userIdIn) {
            if(!IdUtils.isEmpty(userIdIn)){
                if(this.userId_IN == null){
                    this.userId_IN = new ArrayList<PK>();
                }
                this.userId_IN.add( userIdIn );
            }
            return this;
        }

        @Override
        public TsUserRoleQuery userIdNotIn(PK userIdNotIn) {
            if(!IdUtils.isEmpty(userIdNotIn)){
                if(this.userId_NOTIN == null){
                    this.userId_NOTIN = new ArrayList<PK>();
                }
                this.userId_NOTIN.add( userIdNotIn );
            }
            return this;
        }

        @Override
        public TsUserRoleQuery userIdIsNull() {
            this.isNulls.add("userId");
            return this;
        }

        @Override
        public TsUserRoleQuery userIdIsNotNull() {
            this.isNotNulls.add("userId");
            return this;
        }


        @Override
        public TsUserRoleQuery roleId(PK roleId) {
            if(!IdUtils.isEmpty(roleId)){
                this.roleId = roleId;
            }
            return this;
        }

        @Override
        public TsUserRoleQuery roleIdNot(PK roleIdNot) {
            if(!IdUtils.isEmpty(roleIdNot)){
                this.roleId_NE = roleIdNot;
            }
            return this;
        }

        @Override
        public TsUserRoleQuery roleIdIn(PK roleIdIn) {
            if(!IdUtils.isEmpty(roleIdIn)){
                if(this.roleId_IN == null){
                    this.roleId_IN = new ArrayList<PK>();
                }
                this.roleId_IN.add( roleIdIn );
            }
            return this;
        }

        @Override
        public TsUserRoleQuery roleIdNotIn(PK roleIdNotIn) {
            if(!IdUtils.isEmpty(roleIdNotIn)){
                if(this.roleId_NOTIN == null){
                    this.roleId_NOTIN = new ArrayList<PK>();
                }
                this.roleId_NOTIN.add( roleIdNotIn );
            }
            return this;
        }

        @Override
        public TsUserRoleQuery roleIdIsNull() {
            this.isNulls.add("roleId");
            return this;
        }

        @Override
        public TsUserRoleQuery roleIdIsNotNull() {
            this.isNotNulls.add("roleId");
            return this;
        }



	
}