package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.VsUserMenuEntity;

import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;

/**
 * 用户菜单信息 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:18
 */
public abstract class VsUserMenuAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<VsUserMenuEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK pid;
            protected PK pid_NE;

            protected String title;
            protected String title_NE;
            protected String title_LIKE;
            protected String title_NOTLIKE;

            protected String icon;
            protected String icon_NE;
            protected String icon_LIKE;
            protected String icon_NOTLIKE;

            protected String component;
            protected String component_NE;
            protected String component_LIKE;
            protected String component_NOTLIKE;

        protected Integer sortno;
        protected Integer sortno_NE;
        protected Integer sortno_GT;
        protected Integer sortno_GE;
        protected Integer sortno_LT;
        protected Integer sortno_LE;

            protected String path;
            protected String path_NE;
            protected String path_LIKE;
            protected String path_NOTLIKE;

            protected String shortcut;
            protected String shortcut_NE;

            protected String name;
            protected String name_NE;
            protected String name_LIKE;
            protected String name_NOTLIKE;

        protected Integer level;
        protected Integer level_NE;
        protected Integer level_GT;
        protected Integer level_GE;
        protected Integer level_LT;
        protected Integer level_LE;

            protected String leaf;
            protected String leaf_NE;

            protected String deleteFlag;
            protected String deleteFlag_NE;
            protected String deleteFlag_LIKE;
            protected String deleteFlag_NOTLIKE;

            protected String userName;
            protected String userName_NE;
            protected String userName_LIKE;
            protected String userName_NOTLIKE;

            protected String loginName;
            protected String loginName_NE;
            protected String loginName_LIKE;
            protected String loginName_NOTLIKE;

            protected PK userId;
            protected PK userId_NE;


	
}