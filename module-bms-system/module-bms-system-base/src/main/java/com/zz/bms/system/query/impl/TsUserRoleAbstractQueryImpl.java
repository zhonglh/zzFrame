package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsUserRoleEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 用户角色关联 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:17
 */
public abstract class TsUserRoleAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsUserRoleEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK userId;
            protected PK userId_NE;

            protected PK roleId;
            protected PK roleId_NE;


	
}