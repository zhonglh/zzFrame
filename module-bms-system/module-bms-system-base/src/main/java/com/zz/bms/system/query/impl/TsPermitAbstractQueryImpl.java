package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.TsPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 许可 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public abstract class TsPermitAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TsPermitEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String permitName;
            protected String permitName_NE;
            protected String permitName_LIKE;
            protected String permitName_NOTLIKE;

            protected String permitCode;
            protected String permitCode_NE;
            protected String permitCode_LIKE;
            protected String permitCode_NOTLIKE;

            protected String remark;
            protected String remark_NE;
            protected String remark_LIKE;
            protected String remark_NOTLIKE;

            protected String deleteFlag;
            protected String deleteFlag_NE;
            protected String deleteFlag_LIKE;
            protected String deleteFlag_NOTLIKE;


	
}