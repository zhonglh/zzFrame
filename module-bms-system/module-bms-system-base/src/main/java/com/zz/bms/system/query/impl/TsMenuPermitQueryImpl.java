package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsMenuPermitEntity;
import com.zz.bms.system.query.TsMenuPermitQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

/**
* 菜单许可关联 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class TsMenuPermitQueryImpl<PK extends Serializable> extends TsMenuPermitAbstractQueryImpl<PK> implements TsMenuPermitQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> menuId_IN;
        private List<PK> menuId_NOTIN;

        private List<PK> permitId_IN;
        private List<PK> permitId_NOTIN;



        @Override
        public TsMenuPermitQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsMenuPermitQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TsMenuPermitQuery menuId(PK menuId) {
            if(!IdUtils.isEmpty(menuId)){
                this.menuId = menuId;
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery menuIdNot(PK menuIdNot) {
            if(!IdUtils.isEmpty(menuIdNot)){
                this.menuId_NE = menuIdNot;
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery menuIdIn(PK menuIdIn) {
            if(!IdUtils.isEmpty(menuIdIn)){
                if(this.menuId_IN == null){
                    this.menuId_IN = new ArrayList<PK>();
                }
                this.menuId_IN.add( menuIdIn );
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery menuIdNotIn(PK menuIdNotIn) {
            if(!IdUtils.isEmpty(menuIdNotIn)){
                if(this.menuId_NOTIN == null){
                    this.menuId_NOTIN = new ArrayList<PK>();
                }
                this.menuId_NOTIN.add( menuIdNotIn );
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery menuIdIsNull() {
            this.isNulls.add("menuId");
            return this;
        }

        @Override
        public TsMenuPermitQuery menuIdIsNotNull() {
            this.isNotNulls.add("menuId");
            return this;
        }


        @Override
        public TsMenuPermitQuery permitId(PK permitId) {
            if(!IdUtils.isEmpty(permitId)){
                this.permitId = permitId;
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery permitIdNot(PK permitIdNot) {
            if(!IdUtils.isEmpty(permitIdNot)){
                this.permitId_NE = permitIdNot;
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery permitIdIn(PK permitIdIn) {
            if(!IdUtils.isEmpty(permitIdIn)){
                if(this.permitId_IN == null){
                    this.permitId_IN = new ArrayList<PK>();
                }
                this.permitId_IN.add( permitIdIn );
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery permitIdNotIn(PK permitIdNotIn) {
            if(!IdUtils.isEmpty(permitIdNotIn)){
                if(this.permitId_NOTIN == null){
                    this.permitId_NOTIN = new ArrayList<PK>();
                }
                this.permitId_NOTIN.add( permitIdNotIn );
            }
            return this;
        }

        @Override
        public TsMenuPermitQuery permitIdIsNull() {
            this.isNulls.add("permitId");
            return this;
        }

        @Override
        public TsMenuPermitQuery permitIdIsNotNull() {
            this.isNotNulls.add("permitId");
            return this;
        }



	
}