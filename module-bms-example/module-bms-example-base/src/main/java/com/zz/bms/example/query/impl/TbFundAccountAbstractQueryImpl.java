package com.zz.bms.example.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.example.domain.TbFundAccountEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 基金账户 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-5-1 17:49:19
 */
public abstract class TbFundAccountAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TbFundAccountEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK fundId;
            protected PK fundId_NE;

            protected String fundAccountType;
            protected String fundAccountType_NE;

            protected String accountName;
            protected String accountName_NE;
            protected String accountName_LIKE;
            protected String accountName_NOTLIKE;

            protected String bankId;
            protected String bankId_NE;
            protected String bankId_LIKE;
            protected String bankId_NOTLIKE;

            protected String accountNo;
            protected String accountNo_NE;
            protected String accountNo_LIKE;
            protected String accountNo_NOTLIKE;


	
}