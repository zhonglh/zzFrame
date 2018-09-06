package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.VsUserMenuEntity;
import com.zz.bms.system.query.VsUserMenuQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;

/**
* 菜单 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class VsUserMenuQueryImpl<PK extends Serializable> extends VsUserMenuAbstractQueryImpl<PK> implements VsUserMenuQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> pid_IN;
        private List<PK> pid_NOTIN;


        private List<String> title_IN;
        private List<String> title_NOTIN;

        private List<String> icon_IN;
        private List<String> icon_NOTIN;

        private List<String> component_IN;
        private List<String> component_NOTIN;

        private List<String> path_IN;
        private List<String> path_NOTIN;

        private List<String> name_IN;
        private List<String> name_NOTIN;

        private List<String> userName_IN;
        private List<String> userName_NOTIN;

        private List<String> loginName_IN;
        private List<String> loginName_NOTIN;
        private List<PK> userId_IN;
        private List<PK> userId_NOTIN;



        @Override
        public VsUserMenuQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public VsUserMenuQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public VsUserMenuQuery pid(PK pid) {
            if(!IdUtils.isEmpty(pid)){
                this.pid = pid;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pidNot(PK pidNot) {
            if(!IdUtils.isEmpty(pidNot)){
                this.pid_NE = pidNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pidIn(PK pidIn) {
            if(!IdUtils.isEmpty(pidIn)){
                if(this.pid_IN == null){
                    this.pid_IN = new ArrayList<PK>();
                }
                this.pid_IN.add( pidIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pidNotIn(PK pidNotIn) {
            if(!IdUtils.isEmpty(pidNotIn)){
                if(this.pid_NOTIN == null){
                    this.pid_NOTIN = new ArrayList<PK>();
                }
                this.pid_NOTIN.add( pidNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pidIsNull() {
            this.isNulls.add("pid");
            return this;
        }

        @Override
        public VsUserMenuQuery pidIsNotNull() {
            this.isNotNulls.add("pid");
            return this;
        }



        @Override
        public VsUserMenuQuery title(String title) {
            if(!IdUtils.isEmpty(title)){
                this.title = title;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery titleNot(String titleNot) {
            if(!IdUtils.isEmpty(titleNot)){
                this.title_NE = titleNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery titleLike(String titleLike) {
            if(!IdUtils.isEmpty(titleLike)){
                this.title_LIKE = titleLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery titleNotLike(String titleNotLike) {
            if(!IdUtils.isEmpty(titleNotLike)){
                this.title_NOTLIKE = titleNotLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery titleIn(String titleIn) {
            if(!IdUtils.isEmpty(titleIn)){
                if(this.title_IN == null){
                    this.title_IN = new ArrayList<String>();
                }
                this.title_IN.add( titleIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery titleNotIn(String titleNotIn) {
            if(!IdUtils.isEmpty(titleNotIn)){
                if(this.title_NOTIN == null){
                    this.title_NOTIN = new ArrayList<String>();
                }
                this.title_NOTIN.add( titleNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery titleIsNull() {
            this.isNulls.add("title");
            return this;
        }

        @Override
        public VsUserMenuQuery titleIsNotNull() {
            this.isNotNulls.add("title");
            return this;
        }



        @Override
        public VsUserMenuQuery icon(String icon) {
            if(!IdUtils.isEmpty(icon)){
                this.icon = icon;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery iconNot(String iconNot) {
            if(!IdUtils.isEmpty(iconNot)){
                this.icon_NE = iconNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery iconLike(String iconLike) {
            if(!IdUtils.isEmpty(iconLike)){
                this.icon_LIKE = iconLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery iconNotLike(String iconNotLike) {
            if(!IdUtils.isEmpty(iconNotLike)){
                this.icon_NOTLIKE = iconNotLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery iconIn(String iconIn) {
            if(!IdUtils.isEmpty(iconIn)){
                if(this.icon_IN == null){
                    this.icon_IN = new ArrayList<String>();
                }
                this.icon_IN.add( iconIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery iconNotIn(String iconNotIn) {
            if(!IdUtils.isEmpty(iconNotIn)){
                if(this.icon_NOTIN == null){
                    this.icon_NOTIN = new ArrayList<String>();
                }
                this.icon_NOTIN.add( iconNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery iconIsNull() {
            this.isNulls.add("icon");
            return this;
        }

        @Override
        public VsUserMenuQuery iconIsNotNull() {
            this.isNotNulls.add("icon");
            return this;
        }



        @Override
        public VsUserMenuQuery component(String component) {
            if(!IdUtils.isEmpty(component)){
                this.component = component;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery componentNot(String componentNot) {
            if(!IdUtils.isEmpty(componentNot)){
                this.component_NE = componentNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery componentLike(String componentLike) {
            if(!IdUtils.isEmpty(componentLike)){
                this.component_LIKE = componentLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery componentNotLike(String componentNotLike) {
            if(!IdUtils.isEmpty(componentNotLike)){
                this.component_NOTLIKE = componentNotLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery componentIn(String componentIn) {
            if(!IdUtils.isEmpty(componentIn)){
                if(this.component_IN == null){
                    this.component_IN = new ArrayList<String>();
                }
                this.component_IN.add( componentIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery componentNotIn(String componentNotIn) {
            if(!IdUtils.isEmpty(componentNotIn)){
                if(this.component_NOTIN == null){
                    this.component_NOTIN = new ArrayList<String>();
                }
                this.component_NOTIN.add( componentNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery componentIsNull() {
            this.isNulls.add("component");
            return this;
        }

        @Override
        public VsUserMenuQuery componentIsNotNull() {
            this.isNotNulls.add("component");
            return this;
        }


        @Override
        public VsUserMenuQuery sortno(Integer sortno) {
            if(!IdUtils.isEmpty(sortno)){
                this.sortno = sortno;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery sortnoNot(Integer sortnoNot) {
            if(!IdUtils.isEmpty(sortnoNot)){
                this.sortno_NE = sortnoNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery sortnoGreaterThan(Integer sortnoGreaterThan){
            if(sortnoGreaterThan != null){
                this.sortno_GT = sortnoGreaterThan;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery sortnoGreaterEqual(Integer sortnoGreaterEqual){
            if(sortnoGreaterEqual != null){
                this.sortno_GE = sortnoGreaterEqual;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery sortnoLessThan(Integer sortnoLessThan){
            if(sortnoLessThan != null){
                this.sortno_LT = sortnoLessThan;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery sortnoLessEqual(Integer sortnoLessEqual){
            if(sortnoLessEqual != null){
                this.sortno_LE = sortnoLessEqual;
            }
            return this;
        }


        @Override
        public VsUserMenuQuery path(String path) {
            if(!IdUtils.isEmpty(path)){
                this.path = path;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pathNot(String pathNot) {
            if(!IdUtils.isEmpty(pathNot)){
                this.path_NE = pathNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pathLike(String pathLike) {
            if(!IdUtils.isEmpty(pathLike)){
                this.path_LIKE = pathLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pathNotLike(String pathNotLike) {
            if(!IdUtils.isEmpty(pathNotLike)){
                this.path_NOTLIKE = pathNotLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pathIn(String pathIn) {
            if(!IdUtils.isEmpty(pathIn)){
                if(this.path_IN == null){
                    this.path_IN = new ArrayList<String>();
                }
                this.path_IN.add( pathIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pathNotIn(String pathNotIn) {
            if(!IdUtils.isEmpty(pathNotIn)){
                if(this.path_NOTIN == null){
                    this.path_NOTIN = new ArrayList<String>();
                }
                this.path_NOTIN.add( pathNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery pathIsNull() {
            this.isNulls.add("path");
            return this;
        }

        @Override
        public VsUserMenuQuery pathIsNotNull() {
            this.isNotNulls.add("path");
            return this;
        }



        @Override
        public VsUserMenuQuery name(String name) {
            if(!IdUtils.isEmpty(name)){
                this.name = name;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery nameNot(String nameNot) {
            if(!IdUtils.isEmpty(nameNot)){
                this.name_NE = nameNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery nameLike(String nameLike) {
            if(!IdUtils.isEmpty(nameLike)){
                this.name_LIKE = nameLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery nameNotLike(String nameNotLike) {
            if(!IdUtils.isEmpty(nameNotLike)){
                this.name_NOTLIKE = nameNotLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery nameIn(String nameIn) {
            if(!IdUtils.isEmpty(nameIn)){
                if(this.name_IN == null){
                    this.name_IN = new ArrayList<String>();
                }
                this.name_IN.add( nameIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery nameNotIn(String nameNotIn) {
            if(!IdUtils.isEmpty(nameNotIn)){
                if(this.name_NOTIN == null){
                    this.name_NOTIN = new ArrayList<String>();
                }
                this.name_NOTIN.add( nameNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery nameIsNull() {
            this.isNulls.add("name");
            return this;
        }

        @Override
        public VsUserMenuQuery nameIsNotNull() {
            this.isNotNulls.add("name");
            return this;
        }



        @Override
        public VsUserMenuQuery userName(String userName) {
            if(!IdUtils.isEmpty(userName)){
                this.userName = userName;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userNameNot(String userNameNot) {
            if(!IdUtils.isEmpty(userNameNot)){
                this.userName_NE = userNameNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userNameLike(String userNameLike) {
            if(!IdUtils.isEmpty(userNameLike)){
                this.userName_LIKE = userNameLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userNameNotLike(String userNameNotLike) {
            if(!IdUtils.isEmpty(userNameNotLike)){
                this.userName_NOTLIKE = userNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userNameIn(String userNameIn) {
            if(!IdUtils.isEmpty(userNameIn)){
                if(this.userName_IN == null){
                    this.userName_IN = new ArrayList<String>();
                }
                this.userName_IN.add( userNameIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userNameNotIn(String userNameNotIn) {
            if(!IdUtils.isEmpty(userNameNotIn)){
                if(this.userName_NOTIN == null){
                    this.userName_NOTIN = new ArrayList<String>();
                }
                this.userName_NOTIN.add( userNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userNameIsNull() {
            this.isNulls.add("userName");
            return this;
        }

        @Override
        public VsUserMenuQuery userNameIsNotNull() {
            this.isNotNulls.add("userName");
            return this;
        }



        @Override
        public VsUserMenuQuery loginName(String loginName) {
            if(!IdUtils.isEmpty(loginName)){
                this.loginName = loginName;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery loginNameNot(String loginNameNot) {
            if(!IdUtils.isEmpty(loginNameNot)){
                this.loginName_NE = loginNameNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery loginNameLike(String loginNameLike) {
            if(!IdUtils.isEmpty(loginNameLike)){
                this.loginName_LIKE = loginNameLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery loginNameNotLike(String loginNameNotLike) {
            if(!IdUtils.isEmpty(loginNameNotLike)){
                this.loginName_NOTLIKE = loginNameNotLike;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery loginNameIn(String loginNameIn) {
            if(!IdUtils.isEmpty(loginNameIn)){
                if(this.loginName_IN == null){
                    this.loginName_IN = new ArrayList<String>();
                }
                this.loginName_IN.add( loginNameIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery loginNameNotIn(String loginNameNotIn) {
            if(!IdUtils.isEmpty(loginNameNotIn)){
                if(this.loginName_NOTIN == null){
                    this.loginName_NOTIN = new ArrayList<String>();
                }
                this.loginName_NOTIN.add( loginNameNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery loginNameIsNull() {
            this.isNulls.add("loginName");
            return this;
        }

        @Override
        public VsUserMenuQuery loginNameIsNotNull() {
            this.isNotNulls.add("loginName");
            return this;
        }


        @Override
        public VsUserMenuQuery userId(PK userId) {
            if(!IdUtils.isEmpty(userId)){
                this.userId = userId;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userIdNot(PK userIdNot) {
            if(!IdUtils.isEmpty(userIdNot)){
                this.userId_NE = userIdNot;
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userIdIn(PK userIdIn) {
            if(!IdUtils.isEmpty(userIdIn)){
                if(this.userId_IN == null){
                    this.userId_IN = new ArrayList<PK>();
                }
                this.userId_IN.add( userIdIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userIdNotIn(PK userIdNotIn) {
            if(!IdUtils.isEmpty(userIdNotIn)){
                if(this.userId_NOTIN == null){
                    this.userId_NOTIN = new ArrayList<PK>();
                }
                this.userId_NOTIN.add( userIdNotIn );
            }
            return this;
        }

        @Override
        public VsUserMenuQuery userIdIsNull() {
            this.isNulls.add("userId");
            return this;
        }

        @Override
        public VsUserMenuQuery userIdIsNotNull() {
            this.isNotNulls.add("userId");
            return this;
        }



	
}