package com.zz.bms.example.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.example.domain.TbInvestorAgreementEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 投资协议 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-5-8 13:19:38
 */
public abstract class TbInvestorAgreementAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TbInvestorAgreementEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String agreementName;
            protected String agreementName_NE;
            protected String agreementName_LIKE;
            protected String agreementName_NOTLIKE;

            protected String agreementCode;
            protected String agreementCode_NE;
            protected String agreementCode_LIKE;
            protected String agreementCode_NOTLIKE;

            protected PK fundId;
            protected PK fundId_NE;

            protected PK investorId;
            protected PK investorId_NE;

        protected BigDecimal amount;
        protected BigDecimal amount_NE;
        protected BigDecimal amount_GT;
        protected BigDecimal amount_GE;
        protected BigDecimal amount_LT;
        protected BigDecimal amount_LE;

        protected BigDecimal actualAmount;
        protected BigDecimal actualAmount_NE;
        protected BigDecimal actualAmount_GT;
        protected BigDecimal actualAmount_GE;
        protected BigDecimal actualAmount_LT;
        protected BigDecimal actualAmount_LE;

            protected String sketch;
            protected String sketch_NE;
            protected String sketch_LIKE;
            protected String sketch_NOTLIKE;

            protected PK signDepId;
            protected PK signDepId_NE;

            protected String signOrganId;
            protected String signOrganId_NE;
            protected String signOrganId_LIKE;
            protected String signOrganId_NOTLIKE;

            protected PK signUserId;
            protected PK signUserId_NE;

        protected Date signDate;
        protected Date signDate_NE;
        protected Date signDate_GT;
        protected Date signDate_GE;
        protected Date signDate_LT;
        protected Date signDate_LE;

            protected String agreementFiles;
            protected String agreementFiles_NE;
            protected String agreementFiles_LIKE;
            protected String agreementFiles_NOTLIKE;

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