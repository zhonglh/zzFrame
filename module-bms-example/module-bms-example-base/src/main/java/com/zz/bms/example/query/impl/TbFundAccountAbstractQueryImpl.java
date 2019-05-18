package com.zz.bms.example.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.example.domain.TbFundAccountEntity;

import java.io.Serializable;
import java.util.Date;
import java.lang.String;

/**
 * 基金账户 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-5-8 13:45:39
 */
public abstract class TbFundAccountAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TbFundAccountEntity,PK> {

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

            protected PK bankId;
            protected PK bankId_NE;

            protected String accountNo;
            protected String accountNo_NE;
            protected String accountNo_LIKE;
            protected String accountNo_NOTLIKE;

        protected Date startDate;
        protected Date startDate_NE;
        protected Date startDate_GT;
        protected Date startDate_GE;
        protected Date startDate_LT;
        protected Date startDate_LE;

            protected PK otherBankId;
            protected PK otherBankId_NE;

            protected PK userId;
            protected PK userId_NE;


	
}