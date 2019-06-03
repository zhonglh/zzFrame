package com.zz.bms.example.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.example.domain.TbOutMoneyEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 出资明细 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-6-3 10:12:55
 */
public abstract class TbOutMoneyAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TbOutMoneyEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected PK investorAgreementId;
            protected PK investorAgreementId_NE;

            protected PK fundId;
            protected PK fundId_NE;

            protected PK investorId;
            protected PK investorId_NE;

        protected BigDecimal actualAmount;
        protected BigDecimal actualAmount_NE;
        protected BigDecimal actualAmount_GT;
        protected BigDecimal actualAmount_GE;
        protected BigDecimal actualAmount_LT;
        protected BigDecimal actualAmount_LE;

            protected PK handleDepId;
            protected PK handleDepId_NE;

            protected String handleOrganId;
            protected String handleOrganId_NE;
            protected String handleOrganId_LIKE;
            protected String handleOrganId_NOTLIKE;

            protected PK handleUserId;
            protected PK handleUserId_NE;

        protected Date arrivalAccountDate;
        protected Date arrivalAccountDate_NE;
        protected Date arrivalAccountDate_GT;
        protected Date arrivalAccountDate_GE;
        protected Date arrivalAccountDate_LT;
        protected Date arrivalAccountDate_LE;

            protected String outMoneyFiles;
            protected String outMoneyFiles_NE;
            protected String outMoneyFiles_LIKE;
            protected String outMoneyFiles_NOTLIKE;

            protected String remark;
            protected String remark_NE;
            protected String remark_LIKE;
            protected String remark_NOTLIKE;

            protected String deleteFlag;
            protected String deleteFlag_NE;
            protected String deleteFlag_LIKE;
            protected String deleteFlag_NOTLIKE;

            protected String createUserId;
            protected String createUserId_NE;
            protected String createUserId_LIKE;
            protected String createUserId_NOTLIKE;

            protected String createUserName;
            protected String createUserName_NE;
            protected String createUserName_LIKE;
            protected String createUserName_NOTLIKE;

        protected Timestamp createTime;
        protected Timestamp createTime_NE;
        protected Timestamp createTime_GT;
        protected Timestamp createTime_GE;
        protected Timestamp createTime_LT;
        protected Timestamp createTime_LE;

            protected String updateUserId;
            protected String updateUserId_NE;
            protected String updateUserId_LIKE;
            protected String updateUserId_NOTLIKE;

            protected String updateUserName;
            protected String updateUserName_NE;
            protected String updateUserName_LIKE;
            protected String updateUserName_NOTLIKE;

        protected Timestamp updateTime;
        protected Timestamp updateTime_NE;
        protected Timestamp updateTime_GT;
        protected Timestamp updateTime_GE;
        protected Timestamp updateTime_LT;
        protected Timestamp updateTime_LE;

        protected Integer versionNo;
        protected Integer versionNo_NE;
        protected Integer versionNo_GT;
        protected Integer versionNo_GE;
        protected Integer versionNo_LT;
        protected Integer versionNo_LE;

            protected String tenantId;
            protected String tenantId_NE;
            protected String tenantId_LIKE;
            protected String tenantId_NOTLIKE;


	
}