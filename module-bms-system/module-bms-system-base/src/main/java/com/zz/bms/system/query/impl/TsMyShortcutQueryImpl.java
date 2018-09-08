package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsMyShortcutEntity;
import com.zz.bms.system.query.TsMyShortcutQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

/**
* 置顶快捷菜单 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-8 12:42:41
*/
public class TsMyShortcutQueryImpl<PK extends Serializable> extends TsMyShortcutAbstractQueryImpl<PK> implements TsMyShortcutQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> menuId_IN;
        private List<PK> menuId_NOTIN;

        private List<PK> userId_IN;
        private List<PK> userId_NOTIN;



        @Override
        public TsMyShortcutQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsMyShortcutQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TsMyShortcutQuery menuId(PK menuId) {
            if(!IdUtils.isEmpty(menuId)){
                this.menuId = menuId;
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery menuIdNot(PK menuIdNot) {
            if(!IdUtils.isEmpty(menuIdNot)){
                this.menuId_NE = menuIdNot;
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery menuIdIn(PK menuIdIn) {
            if(!IdUtils.isEmpty(menuIdIn)){
                if(this.menuId_IN == null){
                    this.menuId_IN = new ArrayList<PK>();
                }
                this.menuId_IN.add( menuIdIn );
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery menuIdNotIn(PK menuIdNotIn) {
            if(!IdUtils.isEmpty(menuIdNotIn)){
                if(this.menuId_NOTIN == null){
                    this.menuId_NOTIN = new ArrayList<PK>();
                }
                this.menuId_NOTIN.add( menuIdNotIn );
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery menuIdIsNull() {
            this.isNulls.add("menuId");
            return this;
        }

        @Override
        public TsMyShortcutQuery menuIdIsNotNull() {
            this.isNotNulls.add("menuId");
            return this;
        }


        @Override
        public TsMyShortcutQuery userId(PK userId) {
            if(!IdUtils.isEmpty(userId)){
                this.userId = userId;
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery userIdNot(PK userIdNot) {
            if(!IdUtils.isEmpty(userIdNot)){
                this.userId_NE = userIdNot;
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery userIdIn(PK userIdIn) {
            if(!IdUtils.isEmpty(userIdIn)){
                if(this.userId_IN == null){
                    this.userId_IN = new ArrayList<PK>();
                }
                this.userId_IN.add( userIdIn );
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery userIdNotIn(PK userIdNotIn) {
            if(!IdUtils.isEmpty(userIdNotIn)){
                if(this.userId_NOTIN == null){
                    this.userId_NOTIN = new ArrayList<PK>();
                }
                this.userId_NOTIN.add( userIdNotIn );
            }
            return this;
        }

        @Override
        public TsMyShortcutQuery userIdIsNull() {
            this.isNulls.add("userId");
            return this;
        }

        @Override
        public TsMyShortcutQuery userIdIsNotNull() {
            this.isNotNulls.add("userId");
            return this;
        }



	
}