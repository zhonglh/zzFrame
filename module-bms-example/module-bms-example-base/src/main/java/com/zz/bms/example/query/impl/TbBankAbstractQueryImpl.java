package com.zz.bms.example.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.example.domain.TbBankEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 银行信息 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-5-8 13:45:41
 */
public abstract class TbBankAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TbBankEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String bankName;
            protected String bankName_NE;
            protected String bankName_LIKE;
            protected String bankName_NOTLIKE;

            protected String bankShortName;
            protected String bankShortName_NE;
            protected String bankShortName_LIKE;
            protected String bankShortName_NOTLIKE;

            protected String serviceTelephone;
            protected String serviceTelephone_NE;
            protected String serviceTelephone_LIKE;
            protected String serviceTelephone_NOTLIKE;

            protected String officialWebsite;
            protected String officialWebsite_NE;
            protected String officialWebsite_LIKE;
            protected String officialWebsite_NOTLIKE;


	
}