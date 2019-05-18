package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.VsMenuPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 菜单许可关联 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:15
 */
public abstract class VsMenuPermitAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<VsMenuPermitEntity,PK> {

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

            protected String menuName;
            protected String menuName_NE;
            protected String menuName_LIKE;
            protected String menuName_NOTLIKE;

            protected String menuCode;
            protected String menuCode_NE;
            protected String menuCode_LIKE;
            protected String menuCode_NOTLIKE;


	
}