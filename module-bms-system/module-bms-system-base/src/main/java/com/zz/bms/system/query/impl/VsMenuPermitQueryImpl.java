package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.VsMenuPermitEntity;
import com.zz.bms.system.query.VsMenuPermitQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

/**
* 菜单许可关联 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:15
*/
public class VsMenuPermitQueryImpl<PK extends Serializable> extends VsMenuPermitAbstractQueryImpl<PK> implements VsMenuPermitQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> menuId_IN;
        private List<String> menuId_NOTIN;

        private List<String> permitId_IN;
        private List<String> permitId_NOTIN;

        private List<String> permitCode_IN;
        private List<String> permitCode_NOTIN;

        private List<String> permitName_IN;
        private List<String> permitName_NOTIN;

        private List<String> menuName_IN;
        private List<String> menuName_NOTIN;

        private List<String> menuCode_IN;
        private List<String> menuCode_NOTIN;


        @Override
        public VsMenuPermitQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public VsMenuPermitQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public VsMenuPermitQuery menuId(String menuId) {
            if(!IdUtils.isEmpty(menuId)){
                this.menuId = menuId;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuIdNot(String menuIdNot) {
            if(!IdUtils.isEmpty(menuIdNot)){
                this.menuId_NE = menuIdNot;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuIdLike(String menuIdLike) {
            if(!IdUtils.isEmpty(menuIdLike)){
                this.menuId_LIKE = menuIdLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuIdNotLike(String menuIdNotLike) {
            if(!IdUtils.isEmpty(menuIdNotLike)){
                this.menuId_NOTLIKE = menuIdNotLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuIdIn(String menuIdIn) {
            if(!IdUtils.isEmpty(menuIdIn)){
                if(this.menuId_IN == null){
                    this.menuId_IN = new ArrayList<String>();
                }
                this.menuId_IN.add( menuIdIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuIdNotIn(String menuIdNotIn) {
            if(!IdUtils.isEmpty(menuIdNotIn)){
                if(this.menuId_NOTIN == null){
                    this.menuId_NOTIN = new ArrayList<String>();
                }
                this.menuId_NOTIN.add( menuIdNotIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuIdIsNull() {
            this.isNulls.add("menuId");
            return this;
        }

        @Override
        public VsMenuPermitQuery menuIdIsNotNull() {
            this.isNotNulls.add("menuId");
            return this;
        }



        @Override
        public VsMenuPermitQuery permitId(String permitId) {
            if(!IdUtils.isEmpty(permitId)){
                this.permitId = permitId;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitIdNot(String permitIdNot) {
            if(!IdUtils.isEmpty(permitIdNot)){
                this.permitId_NE = permitIdNot;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitIdLike(String permitIdLike) {
            if(!IdUtils.isEmpty(permitIdLike)){
                this.permitId_LIKE = permitIdLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitIdNotLike(String permitIdNotLike) {
            if(!IdUtils.isEmpty(permitIdNotLike)){
                this.permitId_NOTLIKE = permitIdNotLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitIdIn(String permitIdIn) {
            if(!IdUtils.isEmpty(permitIdIn)){
                if(this.permitId_IN == null){
                    this.permitId_IN = new ArrayList<String>();
                }
                this.permitId_IN.add( permitIdIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitIdNotIn(String permitIdNotIn) {
            if(!IdUtils.isEmpty(permitIdNotIn)){
                if(this.permitId_NOTIN == null){
                    this.permitId_NOTIN = new ArrayList<String>();
                }
                this.permitId_NOTIN.add( permitIdNotIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitIdIsNull() {
            this.isNulls.add("permitId");
            return this;
        }

        @Override
        public VsMenuPermitQuery permitIdIsNotNull() {
            this.isNotNulls.add("permitId");
            return this;
        }



        @Override
        public VsMenuPermitQuery permitCode(String permitCode) {
            if(!IdUtils.isEmpty(permitCode)){
                this.permitCode = permitCode;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitCodeNot(String permitCodeNot) {
            if(!IdUtils.isEmpty(permitCodeNot)){
                this.permitCode_NE = permitCodeNot;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitCodeLike(String permitCodeLike) {
            if(!IdUtils.isEmpty(permitCodeLike)){
                this.permitCode_LIKE = permitCodeLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitCodeNotLike(String permitCodeNotLike) {
            if(!IdUtils.isEmpty(permitCodeNotLike)){
                this.permitCode_NOTLIKE = permitCodeNotLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitCodeIn(String permitCodeIn) {
            if(!IdUtils.isEmpty(permitCodeIn)){
                if(this.permitCode_IN == null){
                    this.permitCode_IN = new ArrayList<String>();
                }
                this.permitCode_IN.add( permitCodeIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitCodeNotIn(String permitCodeNotIn) {
            if(!IdUtils.isEmpty(permitCodeNotIn)){
                if(this.permitCode_NOTIN == null){
                    this.permitCode_NOTIN = new ArrayList<String>();
                }
                this.permitCode_NOTIN.add( permitCodeNotIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitCodeIsNull() {
            this.isNulls.add("permitCode");
            return this;
        }

        @Override
        public VsMenuPermitQuery permitCodeIsNotNull() {
            this.isNotNulls.add("permitCode");
            return this;
        }



        @Override
        public VsMenuPermitQuery permitName(String permitName) {
            if(!IdUtils.isEmpty(permitName)){
                this.permitName = permitName;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitNameNot(String permitNameNot) {
            if(!IdUtils.isEmpty(permitNameNot)){
                this.permitName_NE = permitNameNot;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitNameLike(String permitNameLike) {
            if(!IdUtils.isEmpty(permitNameLike)){
                this.permitName_LIKE = permitNameLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitNameNotLike(String permitNameNotLike) {
            if(!IdUtils.isEmpty(permitNameNotLike)){
                this.permitName_NOTLIKE = permitNameNotLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitNameIn(String permitNameIn) {
            if(!IdUtils.isEmpty(permitNameIn)){
                if(this.permitName_IN == null){
                    this.permitName_IN = new ArrayList<String>();
                }
                this.permitName_IN.add( permitNameIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitNameNotIn(String permitNameNotIn) {
            if(!IdUtils.isEmpty(permitNameNotIn)){
                if(this.permitName_NOTIN == null){
                    this.permitName_NOTIN = new ArrayList<String>();
                }
                this.permitName_NOTIN.add( permitNameNotIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery permitNameIsNull() {
            this.isNulls.add("permitName");
            return this;
        }

        @Override
        public VsMenuPermitQuery permitNameIsNotNull() {
            this.isNotNulls.add("permitName");
            return this;
        }



        @Override
        public VsMenuPermitQuery menuName(String menuName) {
            if(!IdUtils.isEmpty(menuName)){
                this.menuName = menuName;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuNameNot(String menuNameNot) {
            if(!IdUtils.isEmpty(menuNameNot)){
                this.menuName_NE = menuNameNot;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuNameLike(String menuNameLike) {
            if(!IdUtils.isEmpty(menuNameLike)){
                this.menuName_LIKE = menuNameLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuNameNotLike(String menuNameNotLike) {
            if(!IdUtils.isEmpty(menuNameNotLike)){
                this.menuName_NOTLIKE = menuNameNotLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuNameIn(String menuNameIn) {
            if(!IdUtils.isEmpty(menuNameIn)){
                if(this.menuName_IN == null){
                    this.menuName_IN = new ArrayList<String>();
                }
                this.menuName_IN.add( menuNameIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuNameNotIn(String menuNameNotIn) {
            if(!IdUtils.isEmpty(menuNameNotIn)){
                if(this.menuName_NOTIN == null){
                    this.menuName_NOTIN = new ArrayList<String>();
                }
                this.menuName_NOTIN.add( menuNameNotIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuNameIsNull() {
            this.isNulls.add("menuName");
            return this;
        }

        @Override
        public VsMenuPermitQuery menuNameIsNotNull() {
            this.isNotNulls.add("menuName");
            return this;
        }



        @Override
        public VsMenuPermitQuery menuCode(String menuCode) {
            if(!IdUtils.isEmpty(menuCode)){
                this.menuCode = menuCode;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuCodeNot(String menuCodeNot) {
            if(!IdUtils.isEmpty(menuCodeNot)){
                this.menuCode_NE = menuCodeNot;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuCodeLike(String menuCodeLike) {
            if(!IdUtils.isEmpty(menuCodeLike)){
                this.menuCode_LIKE = menuCodeLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuCodeNotLike(String menuCodeNotLike) {
            if(!IdUtils.isEmpty(menuCodeNotLike)){
                this.menuCode_NOTLIKE = menuCodeNotLike;
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuCodeIn(String menuCodeIn) {
            if(!IdUtils.isEmpty(menuCodeIn)){
                if(this.menuCode_IN == null){
                    this.menuCode_IN = new ArrayList<String>();
                }
                this.menuCode_IN.add( menuCodeIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuCodeNotIn(String menuCodeNotIn) {
            if(!IdUtils.isEmpty(menuCodeNotIn)){
                if(this.menuCode_NOTIN == null){
                    this.menuCode_NOTIN = new ArrayList<String>();
                }
                this.menuCode_NOTIN.add( menuCodeNotIn );
            }
            return this;
        }

        @Override
        public VsMenuPermitQuery menuCodeIsNull() {
            this.isNulls.add("menuCode");
            return this;
        }

        @Override
        public VsMenuPermitQuery menuCodeIsNotNull() {
            this.isNotNulls.add("menuCode");
            return this;
        }



	
}