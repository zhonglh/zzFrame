package com.zz.bms.example.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.example.domain.TbFundEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 基金 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-6-3 10:12:55
 */
public abstract class TbFundAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TbFundEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String fundName;
            protected String fundName_NE;
            protected String fundName_LIKE;
            protected String fundName_NOTLIKE;

            protected String fundCode;
            protected String fundCode_NE;
            protected String fundCode_LIKE;
            protected String fundCode_NOTLIKE;

            protected String fundType;
            protected String fundType_NE;

            protected String fundDirection;
            protected String fundDirection_NE;

        protected BigDecimal startMoney;
        protected BigDecimal startMoney_NE;
        protected BigDecimal startMoney_GT;
        protected BigDecimal startMoney_GE;
        protected BigDecimal startMoney_LT;
        protected BigDecimal startMoney_LE;

            protected String managType;
            protected String managType_NE;

        protected BigDecimal fundScale;
        protected BigDecimal fundScale_NE;
        protected BigDecimal fundScale_GT;
        protected BigDecimal fundScale_GE;
        protected BigDecimal fundScale_LT;
        protected BigDecimal fundScale_LE;

            protected PK managerUserId;
            protected PK managerUserId_NE;

        protected Date startDate;
        protected Date startDate_NE;
        protected Date startDate_GT;
        protected Date startDate_GE;
        protected Date startDate_LT;
        protected Date startDate_LE;

        protected Date endDate;
        protected Date endDate_NE;
        protected Date endDate_GT;
        protected Date endDate_GE;
        protected Date endDate_LT;
        protected Date endDate_LE;

            protected String investmentField;
            protected String investmentField_NE;
            protected String investmentField_LIKE;
            protected String investmentField_NOTLIKE;

            protected String incomeAllocation;
            protected String incomeAllocation_NE;
            protected String incomeAllocation_LIKE;
            protected String incomeAllocation_NOTLIKE;

            protected String fundFiles;
            protected String fundFiles_NE;
            protected String fundFiles_LIKE;
            protected String fundFiles_NOTLIKE;

            protected String remark;
            protected String remark_NE;
            protected String remark_LIKE;
            protected String remark_NOTLIKE;

            protected PK depId;
            protected PK depId_NE;

            protected String organId;
            protected String organId_NE;
            protected String organId_LIKE;
            protected String organId_NOTLIKE;

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