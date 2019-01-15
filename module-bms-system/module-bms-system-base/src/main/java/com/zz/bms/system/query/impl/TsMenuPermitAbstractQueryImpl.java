package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsMenuPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 菜单许可关联 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public abstract class TsMenuPermitAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsMenuPermitEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK menuId;
            protected PK menuId_NE;

            protected PK permitId;
            protected PK permitId_NE;


	
}