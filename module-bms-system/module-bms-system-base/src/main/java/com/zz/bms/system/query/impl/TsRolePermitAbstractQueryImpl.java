package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsRolePermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 角色许可关联 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public abstract class TsRolePermitAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsRolePermitEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK roleId;
            protected PK roleId_NE;

            protected PK permitId;
            protected PK permitId_NE;


	
}