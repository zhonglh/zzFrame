package com.zz.bms.system.query.impl;


import com.zz.bms.core.db.mybatis.query.CommonQueryImpl;
import com.zz.bms.system.domain.TsRoleEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 角色 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2019-4-11 14:06:16
 */
public abstract class TsRoleAbstractQueryImpl<PK extends Serializable> extends CommonQueryImpl<TsRoleEntity,PK> {

            protected PK id;
            protected PK id_NE;

            protected String roleName;
            protected String roleName_NE;
            protected String roleName_LIKE;
            protected String roleName_NOTLIKE;

            protected String roleCode;
            protected String roleCode_NE;
            protected String roleCode_LIKE;
            protected String roleCode_NOTLIKE;

            protected String roleType;
            protected String roleType_NE;

            protected PK depId;
            protected PK depId_NE;

            protected String organId;
            protected String organId_NE;
            protected String organId_LIKE;
            protected String organId_NOTLIKE;

            protected String roleStatus;
            protected String roleStatus_NE;

            protected String remark;
            protected String remark_NE;
            protected String remark_LIKE;
            protected String remark_NOTLIKE;

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