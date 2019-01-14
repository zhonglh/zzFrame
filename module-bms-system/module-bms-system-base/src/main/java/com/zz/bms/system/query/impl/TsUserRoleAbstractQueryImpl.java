package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsUserRoleEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 用户角色关联 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public abstract class TsUserRoleAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsUserRoleEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK userId;
            protected PK userId_NE;

            protected PK roleId;
            protected PK roleId_NE;


	
}