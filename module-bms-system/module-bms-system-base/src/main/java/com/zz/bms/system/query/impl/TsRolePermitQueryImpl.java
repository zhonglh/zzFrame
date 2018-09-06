package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsRolePermitEntity;
import com.zz.bms.system.query.TsRolePermitQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

/**
* 角色许可关联 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class TsRolePermitQueryImpl<PK extends Serializable> extends TsRolePermitAbstractQueryImpl<PK> implements TsRolePermitQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> roleId_IN;
        private List<PK> roleId_NOTIN;

        private List<PK> permitId_IN;
        private List<PK> permitId_NOTIN;



        @Override
        public TsRolePermitQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsRolePermitQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsRolePermitQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsRolePermitQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsRolePermitQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsRolePermitQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TsRolePermitQuery roleId(PK roleId) {
            if(!IdUtils.isEmpty(roleId)){
                this.roleId = roleId;
            }
            return this;
        }

        @Override
        public TsRolePermitQuery roleIdNot(PK roleIdNot) {
            if(!IdUtils.isEmpty(roleIdNot)){
                this.roleId_NE = roleIdNot;
            }
            return this;
        }

        @Override
        public TsRolePermitQuery roleIdIn(PK roleIdIn) {
            if(!IdUtils.isEmpty(roleIdIn)){
                if(this.roleId_IN == null){
                    this.roleId_IN = new ArrayList<PK>();
                }
                this.roleId_IN.add( roleIdIn );
            }
            return this;
        }

        @Override
        public TsRolePermitQuery roleIdNotIn(PK roleIdNotIn) {
            if(!IdUtils.isEmpty(roleIdNotIn)){
                if(this.roleId_NOTIN == null){
                    this.roleId_NOTIN = new ArrayList<PK>();
                }
                this.roleId_NOTIN.add( roleIdNotIn );
            }
            return this;
        }

        @Override
        public TsRolePermitQuery roleIdIsNull() {
            this.isNulls.add("roleId");
            return this;
        }

        @Override
        public TsRolePermitQuery roleIdIsNotNull() {
            this.isNotNulls.add("roleId");
            return this;
        }


        @Override
        public TsRolePermitQuery permitId(PK permitId) {
            if(!IdUtils.isEmpty(permitId)){
                this.permitId = permitId;
            }
            return this;
        }

        @Override
        public TsRolePermitQuery permitIdNot(PK permitIdNot) {
            if(!IdUtils.isEmpty(permitIdNot)){
                this.permitId_NE = permitIdNot;
            }
            return this;
        }

        @Override
        public TsRolePermitQuery permitIdIn(PK permitIdIn) {
            if(!IdUtils.isEmpty(permitIdIn)){
                if(this.permitId_IN == null){
                    this.permitId_IN = new ArrayList<PK>();
                }
                this.permitId_IN.add( permitIdIn );
            }
            return this;
        }

        @Override
        public TsRolePermitQuery permitIdNotIn(PK permitIdNotIn) {
            if(!IdUtils.isEmpty(permitIdNotIn)){
                if(this.permitId_NOTIN == null){
                    this.permitId_NOTIN = new ArrayList<PK>();
                }
                this.permitId_NOTIN.add( permitIdNotIn );
            }
            return this;
        }

        @Override
        public TsRolePermitQuery permitIdIsNull() {
            this.isNulls.add("permitId");
            return this;
        }

        @Override
        public TsRolePermitQuery permitIdIsNotNull() {
            this.isNotNulls.add("permitId");
            return this;
        }



	
}