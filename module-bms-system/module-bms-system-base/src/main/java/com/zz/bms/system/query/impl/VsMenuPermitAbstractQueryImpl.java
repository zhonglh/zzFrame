package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.VsMenuPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 菜单许可关联 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-1 13:52:04
 */
public abstract class VsMenuPermitAbstractQueryImpl<PK extends Serializable> extends QueryImpl<VsMenuPermitEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String menuId;
            protected String menuId_NE;
            protected String menuId_LIKE;
            protected String menuId_NOTLIKE;

            protected String permitId;
            protected String permitId_NE;
            protected String permitId_LIKE;
            protected String permitId_NOTLIKE;

            protected String permitCode;
            protected String permitCode_NE;
            protected String permitCode_LIKE;
            protected String permitCode_NOTLIKE;

            protected String permitName;
            protected String permitName_NE;
            protected String permitName_LIKE;
            protected String permitName_NOTLIKE;


	
}