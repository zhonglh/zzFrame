package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsMenuEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 菜单 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:18
 */
public interface TsMenuQuery<PK extends Serializable> extends Query<TsMenuEntity,PK> {

        public TsMenuQuery id(PK id);
        public TsMenuQuery idNot(PK idNot);
        public TsMenuQuery idIn(PK idIn);
        public TsMenuQuery idNotIn(PK idNotIn);
        public TsMenuQuery idIsNull();
        public TsMenuQuery idIsNotNull();





        public TsMenuQuery menuName(String menuName);
        public TsMenuQuery menuNameNot(String menuNameNot);
        public TsMenuQuery menuNameIn(String menuNameIn);
        public TsMenuQuery menuNameNotIn(String menuNameNotIn);
        public TsMenuQuery menuNameLike(String menuNameLike);
        public TsMenuQuery menuNameNotLike(String menuNameNotLike);
        public TsMenuQuery menuNameIsNull();
        public TsMenuQuery menuNameIsNotNull();





        public TsMenuQuery menuCode(String menuCode);
        public TsMenuQuery menuCodeNot(String menuCodeNot);
        public TsMenuQuery menuCodeIn(String menuCodeIn);
        public TsMenuQuery menuCodeNotIn(String menuCodeNotIn);
        public TsMenuQuery menuCodeLike(String menuCodeLike);
        public TsMenuQuery menuCodeNotLike(String menuCodeNotLike);
        public TsMenuQuery menuCodeIsNull();
        public TsMenuQuery menuCodeIsNotNull();





        public TsMenuQuery pid(PK pid);
        public TsMenuQuery pidNot(PK pidNot);
        public TsMenuQuery pidIn(PK pidIn);
        public TsMenuQuery pidNotIn(PK pidNotIn);
        public TsMenuQuery pidIsNull();
        public TsMenuQuery pidIsNotNull();





        public TsMenuQuery menuSort(Integer menuSort);
        public TsMenuQuery menuSortNot(Integer menuSortNot);
        public TsMenuQuery menuSortGreaterThan(Integer menuSortGreaterThan);
        public TsMenuQuery menuSortGreaterEqual(Integer menuSortGreaterEqual);
        public TsMenuQuery menuSortLessThan(Integer menuSortLessThan);
        public TsMenuQuery menuSortLessEqual(Integer menuSortLessEqual);





        public TsMenuQuery menuUrl(String menuUrl);
        public TsMenuQuery menuUrlNot(String menuUrlNot);
        public TsMenuQuery menuUrlIn(String menuUrlIn);
        public TsMenuQuery menuUrlNotIn(String menuUrlNotIn);
        public TsMenuQuery menuUrlLike(String menuUrlLike);
        public TsMenuQuery menuUrlNotLike(String menuUrlNotLike);
        public TsMenuQuery menuUrlIsNull();
        public TsMenuQuery menuUrlIsNotNull();





        public TsMenuQuery menuMsg(String menuMsg);
        public TsMenuQuery menuMsgNot(String menuMsgNot);
        public TsMenuQuery menuMsgIn(String menuMsgIn);
        public TsMenuQuery menuMsgNotIn(String menuMsgNotIn);
        public TsMenuQuery menuMsgLike(String menuMsgLike);
        public TsMenuQuery menuMsgNotLike(String menuMsgNotLike);
        public TsMenuQuery menuMsgIsNull();
        public TsMenuQuery menuMsgIsNotNull();





        public TsMenuQuery menuIcon(String menuIcon);
        public TsMenuQuery menuIconNot(String menuIconNot);
        public TsMenuQuery menuIconIn(String menuIconIn);
        public TsMenuQuery menuIconNotIn(String menuIconNotIn);
        public TsMenuQuery menuIconLike(String menuIconLike);
        public TsMenuQuery menuIconNotLike(String menuIconNotLike);
        public TsMenuQuery menuIconIsNull();
        public TsMenuQuery menuIconIsNotNull();





        public TsMenuQuery menuRedirect(String menuRedirect);
        public TsMenuQuery menuRedirectNot(String menuRedirectNot);
        public TsMenuQuery menuRedirectIn(String menuRedirectIn);
        public TsMenuQuery menuRedirectNotIn(String menuRedirectNotIn);
        public TsMenuQuery menuRedirectLike(String menuRedirectLike);
        public TsMenuQuery menuRedirectNotLike(String menuRedirectNotLike);
        public TsMenuQuery menuRedirectIsNull();
        public TsMenuQuery menuRedirectIsNotNull();





        public TsMenuQuery shortcut(String shortcut);
        public TsMenuQuery shortcutNot(String shortcutNot);
        public TsMenuQuery shortcutIn(String shortcutIn);
        public TsMenuQuery shortcutNotIn(String shortcutNotIn);
        public TsMenuQuery shortcutIsNull();
        public TsMenuQuery shortcutIsNotNull();





        public TsMenuQuery level(Integer level);
        public TsMenuQuery levelNot(Integer levelNot);
        public TsMenuQuery levelGreaterThan(Integer levelGreaterThan);
        public TsMenuQuery levelGreaterEqual(Integer levelGreaterEqual);
        public TsMenuQuery levelLessThan(Integer levelLessThan);
        public TsMenuQuery levelLessEqual(Integer levelLessEqual);





        public TsMenuQuery leaf(String leaf);
        public TsMenuQuery leafNot(String leafNot);
        public TsMenuQuery leafIn(String leafIn);
        public TsMenuQuery leafNotIn(String leafNotIn);
        public TsMenuQuery leafIsNull();
        public TsMenuQuery leafIsNotNull();





        public TsMenuQuery remark(String remark);
        public TsMenuQuery remarkNot(String remarkNot);
        public TsMenuQuery remarkIn(String remarkIn);
        public TsMenuQuery remarkNotIn(String remarkNotIn);
        public TsMenuQuery remarkLike(String remarkLike);
        public TsMenuQuery remarkNotLike(String remarkNotLike);
        public TsMenuQuery remarkIsNull();
        public TsMenuQuery remarkIsNotNull();





        public TsMenuQuery deleteFlag(String deleteFlag);
        public TsMenuQuery deleteFlagNot(String deleteFlagNot);
        public TsMenuQuery deleteFlagIn(String deleteFlagIn);
        public TsMenuQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TsMenuQuery deleteFlagLike(String deleteFlagLike);
        public TsMenuQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TsMenuQuery deleteFlagIsNull();
        public TsMenuQuery deleteFlagIsNotNull();





        public TsMenuQuery createUserId(String createUserId);
        public TsMenuQuery createUserIdNot(String createUserIdNot);
        public TsMenuQuery createUserIdIn(String createUserIdIn);
        public TsMenuQuery createUserIdNotIn(String createUserIdNotIn);
        public TsMenuQuery createUserIdLike(String createUserIdLike);
        public TsMenuQuery createUserIdNotLike(String createUserIdNotLike);
        public TsMenuQuery createUserIdIsNull();
        public TsMenuQuery createUserIdIsNotNull();





        public TsMenuQuery createUserName(String createUserName);
        public TsMenuQuery createUserNameNot(String createUserNameNot);
        public TsMenuQuery createUserNameIn(String createUserNameIn);
        public TsMenuQuery createUserNameNotIn(String createUserNameNotIn);
        public TsMenuQuery createUserNameLike(String createUserNameLike);
        public TsMenuQuery createUserNameNotLike(String createUserNameNotLike);
        public TsMenuQuery createUserNameIsNull();
        public TsMenuQuery createUserNameIsNotNull();





        public TsMenuQuery createTime(Timestamp createTime);
        public TsMenuQuery createTimeNot(Timestamp createTimeNot);
        public TsMenuQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsMenuQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsMenuQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsMenuQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsMenuQuery updateUserId(String updateUserId);
        public TsMenuQuery updateUserIdNot(String updateUserIdNot);
        public TsMenuQuery updateUserIdIn(String updateUserIdIn);
        public TsMenuQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsMenuQuery updateUserIdLike(String updateUserIdLike);
        public TsMenuQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsMenuQuery updateUserIdIsNull();
        public TsMenuQuery updateUserIdIsNotNull();





        public TsMenuQuery updateUserName(String updateUserName);
        public TsMenuQuery updateUserNameNot(String updateUserNameNot);
        public TsMenuQuery updateUserNameIn(String updateUserNameIn);
        public TsMenuQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsMenuQuery updateUserNameLike(String updateUserNameLike);
        public TsMenuQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsMenuQuery updateUserNameIsNull();
        public TsMenuQuery updateUserNameIsNotNull();





        public TsMenuQuery updateTime(Timestamp updateTime);
        public TsMenuQuery updateTimeNot(Timestamp updateTimeNot);
        public TsMenuQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsMenuQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsMenuQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsMenuQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsMenuQuery versionNo(Integer versionNo);
        public TsMenuQuery versionNoNot(Integer versionNoNot);
        public TsMenuQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsMenuQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsMenuQuery versionNoLessThan(Integer versionNoLessThan);
        public TsMenuQuery versionNoLessEqual(Integer versionNoLessEqual);






	
}