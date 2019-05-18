package com.zz.bms.example.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.example.domain.TbFundRecordEntity;

import java.io.Serializable;
import java.util.Date;
import java.lang.String;

/**
 * 基金备案 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-5-8 13:45:40
 */
public abstract class TbFundRecordAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TbFundRecordEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK fundId;
            protected PK fundId_NE;

        protected Date recordDate;
        protected Date recordDate_NE;
        protected Date recordDate_GT;
        protected Date recordDate_GE;
        protected Date recordDate_LT;
        protected Date recordDate_LE;

            protected String recordAddr;
            protected String recordAddr_NE;
            protected String recordAddr_LIKE;
            protected String recordAddr_NOTLIKE;

            protected PK bankId;
            protected PK bankId_NE;

            protected String cardType;
            protected String cardType_NE;

            protected PK recordUserId;
            protected PK recordUserId_NE;


	
}