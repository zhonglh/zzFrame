package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsMenuEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 菜单 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:18
 */
public abstract class TsMenuAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsMenuEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String menuName;
            protected String menuName_NE;
            protected String menuName_LIKE;
            protected String menuName_NOTLIKE;

            protected String menuCode;
            protected String menuCode_NE;
            protected String menuCode_LIKE;
            protected String menuCode_NOTLIKE;

            protected PK pid;
            protected PK pid_NE;

        protected Integer menuSort;
        protected Integer menuSort_NE;
        protected Integer menuSort_GT;
        protected Integer menuSort_GE;
        protected Integer menuSort_LT;
        protected Integer menuSort_LE;

            protected String menuUrl;
            protected String menuUrl_NE;
            protected String menuUrl_LIKE;
            protected String menuUrl_NOTLIKE;

            protected String menuMsg;
            protected String menuMsg_NE;
            protected String menuMsg_LIKE;
            protected String menuMsg_NOTLIKE;

            protected String menuIcon;
            protected String menuIcon_NE;
            protected String menuIcon_LIKE;
            protected String menuIcon_NOTLIKE;

            protected String menuRedirect;
            protected String menuRedirect_NE;
            protected String menuRedirect_LIKE;
            protected String menuRedirect_NOTLIKE;

            protected String shortcut;
            protected String shortcut_NE;

        protected Integer level;
        protected Integer level_NE;
        protected Integer level_GT;
        protected Integer level_GE;
        protected Integer level_LT;
        protected Integer level_LE;

            protected String leaf;
            protected String leaf_NE;

            protected String remark;
            protected String remark_NE;
            protected String remark_LIKE;
            protected String remark_NOTLIKE;

            protected String deleteFlag;
            protected String deleteFlag_NE;
            protected String deleteFlag_LIKE;
            protected String deleteFlag_NOTLIKE;

            protected String createUserId;
            protected String createUserId_NE;
            protected String createUserId_LIKE;
            protected String createUserId_NOTLIKE;

            protected String createUserName;
            protected String createUserName_NE;
            protected String createUserName_LIKE;
            protected String createUserName_NOTLIKE;

        protected Timestamp createTime;
        protected Timestamp createTime_NE;
        protected Timestamp createTime_GT;
        protected Timestamp createTime_GE;
        protected Timestamp createTime_LT;
        protected Timestamp createTime_LE;

            protected String updateUserId;
            protected String updateUserId_NE;
            protected String updateUserId_LIKE;
            protected String updateUserId_NOTLIKE;

            protected String updateUserName;
            protected String updateUserName_NE;
            protected String updateUserName_LIKE;
            protected String updateUserName_NOTLIKE;

        protected Timestamp updateTime;
        protected Timestamp updateTime_NE;
        protected Timestamp updateTime_GT;
        protected Timestamp updateTime_GE;
        protected Timestamp updateTime_LT;
        protected Timestamp updateTime_LE;

        protected Integer versionNo;
        protected Integer versionNo_NE;
        protected Integer versionNo_GT;
        protected Integer versionNo_GE;
        protected Integer versionNo_LT;
        protected Integer versionNo_LE;


	
}