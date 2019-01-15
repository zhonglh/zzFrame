package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.VsUserPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 用户许可视图 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public abstract class VsUserPermitAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<VsUserPermitEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String permitCode;
            protected String permitCode_NE;
            protected String permitCode_LIKE;
            protected String permitCode_NOTLIKE;

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