package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsMyShortcutEntity;

import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;

/**
 * 置顶快捷菜单 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:13
 */
public abstract class TsMyShortcutAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsMyShortcutEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK menuId;
            protected PK menuId_NE;

            protected PK userId;
            protected PK userId_NE;

        protected Integer orderby;
        protected Integer orderby_NE;
        protected Integer orderby_GT;
        protected Integer orderby_GE;
        protected Integer orderby_LT;
        protected Integer orderby_LE;


	
}