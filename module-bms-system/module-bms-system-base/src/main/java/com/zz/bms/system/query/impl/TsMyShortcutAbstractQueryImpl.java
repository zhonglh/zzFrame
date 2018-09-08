package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsMyShortcutEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 置顶快捷菜单 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-8 12:42:41
 */
public abstract class TsMyShortcutAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsMyShortcutEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK menuId;
            protected PK menuId_NE;

            protected PK userId;
            protected PK userId_NE;


	
}