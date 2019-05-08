package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsMenuEntity;
import com.zz.bms.system.query.TsMenuQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 菜单 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-5-8 16:10:22
*/
public class TsMenuQueryImpl<PK extends Serializable> extends TsMenuAbstractQueryImpl<PK> implements TsMenuQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> menuName_IN;
        private List<String> menuName_NOTIN;

        private List<String> menuCode_IN;
        private List<String> menuCode_NOTIN;
        private List<PK> pid_IN;
        private List<PK> pid_NOTIN;


        private List<String> menuUrl_IN;
        private List<String> menuUrl_NOTIN;

        private List<String> menuMsg_IN;
        private List<String> menuMsg_NOTIN;

        private List<String> menuIcon_IN;
        private List<String> menuIcon_NOTIN;

        private List<String> menuRedirect_IN;
        private List<String> menuRedirect_NOTIN;
        private List<String> shortcut_IN;
        private List<String> shortcut_NOTIN;

        private List<String> leaf_IN;
        private List<String> leaf_NOTIN;

        private List<String> hidden_IN;
        private List<String> hidden_NOTIN;


        private List<String> remark_IN;
        private List<String> remark_NOTIN;

        private List<String> deleteFlag_IN;
        private List<String> deleteFlag_NOTIN;

        private List<String> createUserId_IN;
        private List<String> createUserId_NOTIN;

        private List<String> createUserName_IN;
        private List<String> createUserName_NOTIN;

        private List<String> updateUserId_IN;
        private List<String> updateUserId_NOTIN;

        private List<String> updateUserName_IN;
        private List<String> updateUserName_NOTIN;


        @Override
        public TsMenuQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsMenuQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsMenuQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsMenuQuery menuName(String menuName) {
            if(!IdUtils.isEmpty(menuName)){
                this.menuName = menuName;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuNameNot(String menuNameNot) {
            if(!IdUtils.isEmpty(menuNameNot)){
                this.menuName_NE = menuNameNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuNameLike(String menuNameLike) {
            if(!IdUtils.isEmpty(menuNameLike)){
                this.menuName_LIKE = menuNameLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuNameNotLike(String menuNameNotLike) {
            if(!IdUtils.isEmpty(menuNameNotLike)){
                this.menuName_NOTLIKE = menuNameNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuNameIn(String menuNameIn) {
            if(!IdUtils.isEmpty(menuNameIn)){
                if(this.menuName_IN == null){
                    this.menuName_IN = new ArrayList<String>();
                }
                this.menuName_IN.add( menuNameIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuNameNotIn(String menuNameNotIn) {
            if(!IdUtils.isEmpty(menuNameNotIn)){
                if(this.menuName_NOTIN == null){
                    this.menuName_NOTIN = new ArrayList<String>();
                }
                this.menuName_NOTIN.add( menuNameNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuNameIsNull() {
            this.isNulls.add("menuName");
            return this;
        }

        @Override
        public TsMenuQuery menuNameIsNotNull() {
            this.isNotNulls.add("menuName");
            return this;
        }



        @Override
        public TsMenuQuery menuCode(String menuCode) {
            if(!IdUtils.isEmpty(menuCode)){
                this.menuCode = menuCode;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuCodeNot(String menuCodeNot) {
            if(!IdUtils.isEmpty(menuCodeNot)){
                this.menuCode_NE = menuCodeNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuCodeLike(String menuCodeLike) {
            if(!IdUtils.isEmpty(menuCodeLike)){
                this.menuCode_LIKE = menuCodeLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuCodeNotLike(String menuCodeNotLike) {
            if(!IdUtils.isEmpty(menuCodeNotLike)){
                this.menuCode_NOTLIKE = menuCodeNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuCodeIn(String menuCodeIn) {
            if(!IdUtils.isEmpty(menuCodeIn)){
                if(this.menuCode_IN == null){
                    this.menuCode_IN = new ArrayList<String>();
                }
                this.menuCode_IN.add( menuCodeIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuCodeNotIn(String menuCodeNotIn) {
            if(!IdUtils.isEmpty(menuCodeNotIn)){
                if(this.menuCode_NOTIN == null){
                    this.menuCode_NOTIN = new ArrayList<String>();
                }
                this.menuCode_NOTIN.add( menuCodeNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuCodeIsNull() {
            this.isNulls.add("menuCode");
            return this;
        }

        @Override
        public TsMenuQuery menuCodeIsNotNull() {
            this.isNotNulls.add("menuCode");
            return this;
        }


        @Override
        public TsMenuQuery pid(PK pid) {
            if(!IdUtils.isEmpty(pid)){
                this.pid = pid;
            }
            return this;
        }

        @Override
        public TsMenuQuery pidNot(PK pidNot) {
            if(!IdUtils.isEmpty(pidNot)){
                this.pid_NE = pidNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery pidIn(PK pidIn) {
            if(!IdUtils.isEmpty(pidIn)){
                if(this.pid_IN == null){
                    this.pid_IN = new ArrayList<PK>();
                }
                this.pid_IN.add( pidIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery pidNotIn(PK pidNotIn) {
            if(!IdUtils.isEmpty(pidNotIn)){
                if(this.pid_NOTIN == null){
                    this.pid_NOTIN = new ArrayList<PK>();
                }
                this.pid_NOTIN.add( pidNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery pidIsNull() {
            this.isNulls.add("pid");
            return this;
        }

        @Override
        public TsMenuQuery pidIsNotNull() {
            this.isNotNulls.add("pid");
            return this;
        }


        @Override
        public TsMenuQuery menuSort(Integer menuSort) {
            if(!IdUtils.isEmpty(menuSort)){
                this.menuSort = menuSort;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuSortNot(Integer menuSortNot) {
            if(!IdUtils.isEmpty(menuSortNot)){
                this.menuSort_NE = menuSortNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuSortGreaterThan(Integer menuSortGreaterThan){
            if(menuSortGreaterThan != null){
                this.menuSort_GT = menuSortGreaterThan;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuSortGreaterEqual(Integer menuSortGreaterEqual){
            if(menuSortGreaterEqual != null){
                this.menuSort_GE = menuSortGreaterEqual;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuSortLessThan(Integer menuSortLessThan){
            if(menuSortLessThan != null){
                this.menuSort_LT = menuSortLessThan;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuSortLessEqual(Integer menuSortLessEqual){
            if(menuSortLessEqual != null){
                this.menuSort_LE = menuSortLessEqual;
            }
            return this;
        }


        @Override
        public TsMenuQuery menuUrl(String menuUrl) {
            if(!IdUtils.isEmpty(menuUrl)){
                this.menuUrl = menuUrl;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuUrlNot(String menuUrlNot) {
            if(!IdUtils.isEmpty(menuUrlNot)){
                this.menuUrl_NE = menuUrlNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuUrlLike(String menuUrlLike) {
            if(!IdUtils.isEmpty(menuUrlLike)){
                this.menuUrl_LIKE = menuUrlLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuUrlNotLike(String menuUrlNotLike) {
            if(!IdUtils.isEmpty(menuUrlNotLike)){
                this.menuUrl_NOTLIKE = menuUrlNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuUrlIn(String menuUrlIn) {
            if(!IdUtils.isEmpty(menuUrlIn)){
                if(this.menuUrl_IN == null){
                    this.menuUrl_IN = new ArrayList<String>();
                }
                this.menuUrl_IN.add( menuUrlIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuUrlNotIn(String menuUrlNotIn) {
            if(!IdUtils.isEmpty(menuUrlNotIn)){
                if(this.menuUrl_NOTIN == null){
                    this.menuUrl_NOTIN = new ArrayList<String>();
                }
                this.menuUrl_NOTIN.add( menuUrlNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuUrlIsNull() {
            this.isNulls.add("menuUrl");
            return this;
        }

        @Override
        public TsMenuQuery menuUrlIsNotNull() {
            this.isNotNulls.add("menuUrl");
            return this;
        }



        @Override
        public TsMenuQuery menuMsg(String menuMsg) {
            if(!IdUtils.isEmpty(menuMsg)){
                this.menuMsg = menuMsg;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuMsgNot(String menuMsgNot) {
            if(!IdUtils.isEmpty(menuMsgNot)){
                this.menuMsg_NE = menuMsgNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuMsgLike(String menuMsgLike) {
            if(!IdUtils.isEmpty(menuMsgLike)){
                this.menuMsg_LIKE = menuMsgLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuMsgNotLike(String menuMsgNotLike) {
            if(!IdUtils.isEmpty(menuMsgNotLike)){
                this.menuMsg_NOTLIKE = menuMsgNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuMsgIn(String menuMsgIn) {
            if(!IdUtils.isEmpty(menuMsgIn)){
                if(this.menuMsg_IN == null){
                    this.menuMsg_IN = new ArrayList<String>();
                }
                this.menuMsg_IN.add( menuMsgIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuMsgNotIn(String menuMsgNotIn) {
            if(!IdUtils.isEmpty(menuMsgNotIn)){
                if(this.menuMsg_NOTIN == null){
                    this.menuMsg_NOTIN = new ArrayList<String>();
                }
                this.menuMsg_NOTIN.add( menuMsgNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuMsgIsNull() {
            this.isNulls.add("menuMsg");
            return this;
        }

        @Override
        public TsMenuQuery menuMsgIsNotNull() {
            this.isNotNulls.add("menuMsg");
            return this;
        }



        @Override
        public TsMenuQuery menuIcon(String menuIcon) {
            if(!IdUtils.isEmpty(menuIcon)){
                this.menuIcon = menuIcon;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuIconNot(String menuIconNot) {
            if(!IdUtils.isEmpty(menuIconNot)){
                this.menuIcon_NE = menuIconNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuIconLike(String menuIconLike) {
            if(!IdUtils.isEmpty(menuIconLike)){
                this.menuIcon_LIKE = menuIconLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuIconNotLike(String menuIconNotLike) {
            if(!IdUtils.isEmpty(menuIconNotLike)){
                this.menuIcon_NOTLIKE = menuIconNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuIconIn(String menuIconIn) {
            if(!IdUtils.isEmpty(menuIconIn)){
                if(this.menuIcon_IN == null){
                    this.menuIcon_IN = new ArrayList<String>();
                }
                this.menuIcon_IN.add( menuIconIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuIconNotIn(String menuIconNotIn) {
            if(!IdUtils.isEmpty(menuIconNotIn)){
                if(this.menuIcon_NOTIN == null){
                    this.menuIcon_NOTIN = new ArrayList<String>();
                }
                this.menuIcon_NOTIN.add( menuIconNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuIconIsNull() {
            this.isNulls.add("menuIcon");
            return this;
        }

        @Override
        public TsMenuQuery menuIconIsNotNull() {
            this.isNotNulls.add("menuIcon");
            return this;
        }



        @Override
        public TsMenuQuery menuRedirect(String menuRedirect) {
            if(!IdUtils.isEmpty(menuRedirect)){
                this.menuRedirect = menuRedirect;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuRedirectNot(String menuRedirectNot) {
            if(!IdUtils.isEmpty(menuRedirectNot)){
                this.menuRedirect_NE = menuRedirectNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuRedirectLike(String menuRedirectLike) {
            if(!IdUtils.isEmpty(menuRedirectLike)){
                this.menuRedirect_LIKE = menuRedirectLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuRedirectNotLike(String menuRedirectNotLike) {
            if(!IdUtils.isEmpty(menuRedirectNotLike)){
                this.menuRedirect_NOTLIKE = menuRedirectNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery menuRedirectIn(String menuRedirectIn) {
            if(!IdUtils.isEmpty(menuRedirectIn)){
                if(this.menuRedirect_IN == null){
                    this.menuRedirect_IN = new ArrayList<String>();
                }
                this.menuRedirect_IN.add( menuRedirectIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuRedirectNotIn(String menuRedirectNotIn) {
            if(!IdUtils.isEmpty(menuRedirectNotIn)){
                if(this.menuRedirect_NOTIN == null){
                    this.menuRedirect_NOTIN = new ArrayList<String>();
                }
                this.menuRedirect_NOTIN.add( menuRedirectNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery menuRedirectIsNull() {
            this.isNulls.add("menuRedirect");
            return this;
        }

        @Override
        public TsMenuQuery menuRedirectIsNotNull() {
            this.isNotNulls.add("menuRedirect");
            return this;
        }


        @Override
        public TsMenuQuery shortcut(String shortcut) {
            if(!IdUtils.isEmpty(shortcut)){
                this.shortcut = shortcut;
            }
            return this;
        }

        @Override
        public TsMenuQuery shortcutNot(String shortcutNot) {
            if(!IdUtils.isEmpty(shortcutNot)){
                this.shortcut_NE = shortcutNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery shortcutIn(String shortcutIn) {
            if(!IdUtils.isEmpty(shortcutIn)){
                if(this.shortcut_IN == null){
                    this.shortcut_IN = new ArrayList<String>();
                }
                this.shortcut_IN.add( shortcutIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery shortcutNotIn(String shortcutNotIn) {
            if(!IdUtils.isEmpty(shortcutNotIn)){
                if(this.shortcut_NOTIN == null){
                    this.shortcut_NOTIN = new ArrayList<String>();
                }
                this.shortcut_NOTIN.add( shortcutNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery shortcutIsNull() {
            this.isNulls.add("shortcut");
            return this;
        }

        @Override
        public TsMenuQuery shortcutIsNotNull() {
            this.isNotNulls.add("shortcut");
            return this;
        }


        @Override
        public TsMenuQuery level(Integer level) {
            if(!IdUtils.isEmpty(level)){
                this.level = level;
            }
            return this;
        }

        @Override
        public TsMenuQuery levelNot(Integer levelNot) {
            if(!IdUtils.isEmpty(levelNot)){
                this.level_NE = levelNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery levelGreaterThan(Integer levelGreaterThan){
            if(levelGreaterThan != null){
                this.level_GT = levelGreaterThan;
            }
            return this;
        }

        @Override
        public TsMenuQuery levelGreaterEqual(Integer levelGreaterEqual){
            if(levelGreaterEqual != null){
                this.level_GE = levelGreaterEqual;
            }
            return this;
        }

        @Override
        public TsMenuQuery levelLessThan(Integer levelLessThan){
            if(levelLessThan != null){
                this.level_LT = levelLessThan;
            }
            return this;
        }

        @Override
        public TsMenuQuery levelLessEqual(Integer levelLessEqual){
            if(levelLessEqual != null){
                this.level_LE = levelLessEqual;
            }
            return this;
        }

        @Override
        public TsMenuQuery leaf(String leaf) {
            if(!IdUtils.isEmpty(leaf)){
                this.leaf = leaf;
            }
            return this;
        }

        @Override
        public TsMenuQuery leafNot(String leafNot) {
            if(!IdUtils.isEmpty(leafNot)){
                this.leaf_NE = leafNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery leafIn(String leafIn) {
            if(!IdUtils.isEmpty(leafIn)){
                if(this.leaf_IN == null){
                    this.leaf_IN = new ArrayList<String>();
                }
                this.leaf_IN.add( leafIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery leafNotIn(String leafNotIn) {
            if(!IdUtils.isEmpty(leafNotIn)){
                if(this.leaf_NOTIN == null){
                    this.leaf_NOTIN = new ArrayList<String>();
                }
                this.leaf_NOTIN.add( leafNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery leafIsNull() {
            this.isNulls.add("leaf");
            return this;
        }

        @Override
        public TsMenuQuery leafIsNotNull() {
            this.isNotNulls.add("leaf");
            return this;
        }


        @Override
        public TsMenuQuery hidden(String hidden) {
            if(!IdUtils.isEmpty(hidden)){
                this.hidden = hidden;
            }
            return this;
        }

        @Override
        public TsMenuQuery hiddenNot(String hiddenNot) {
            if(!IdUtils.isEmpty(hiddenNot)){
                this.hidden_NE = hiddenNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery hiddenIn(String hiddenIn) {
            if(!IdUtils.isEmpty(hiddenIn)){
                if(this.hidden_IN == null){
                    this.hidden_IN = new ArrayList<String>();
                }
                this.hidden_IN.add( hiddenIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery hiddenNotIn(String hiddenNotIn) {
            if(!IdUtils.isEmpty(hiddenNotIn)){
                if(this.hidden_NOTIN == null){
                    this.hidden_NOTIN = new ArrayList<String>();
                }
                this.hidden_NOTIN.add( hiddenNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery hiddenIsNull() {
            this.isNulls.add("hidden");
            return this;
        }

        @Override
        public TsMenuQuery hiddenIsNotNull() {
            this.isNotNulls.add("hidden");
            return this;
        }



        @Override
        public TsMenuQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TsMenuQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TsMenuQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TsMenuQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TsMenuQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TsMenuQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TsMenuQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsMenuQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsMenuQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsMenuQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsMenuQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsMenuQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsMenuQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsMenuQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsMenuQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsMenuQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsMenuQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsMenuQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsMenuQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsMenuQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsMenuQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsMenuQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsMenuQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsMenuQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsMenuQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsMenuQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsMenuQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsMenuQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsMenuQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


	
}