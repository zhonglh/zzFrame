package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsDictTypeEntity;

import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;

/**
 * 字典类型 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public abstract class TsDictTypeAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsDictTypeEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK pid;
            protected PK pid_NE;

            protected String dictTypeCode;
            protected String dictTypeCode_NE;
            protected String dictTypeCode_LIKE;
            protected String dictTypeCode_NOTLIKE;

            protected String dictTypeName;
            protected String dictTypeName_NE;
            protected String dictTypeName_LIKE;
            protected String dictTypeName_NOTLIKE;

            protected String dictTypeShowable;
            protected String dictTypeShowable_NE;

            protected String dictAddable;
            protected String dictAddable_NE;

            protected String dictUpdate;
            protected String dictUpdate_NE;

            protected String dictDelete;
            protected String dictDelete_NE;

        protected Integer orderby;
        protected Integer orderby_NE;
        protected Integer orderby_GT;
        protected Integer orderby_GE;
        protected Integer orderby_LT;
        protected Integer orderby_LE;


	
}