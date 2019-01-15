package com.zz.bms.system.query.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.domain.VsUserEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 用户 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public abstract class VsUserAbstractQueryImpl<PK extends Serializable> extends QueryImpl<VsUserEntity,PK> {

    protected PK id;
    protected PK id_NE;

    protected String userName;
    protected String userName_NE;
    protected String userName_LIKE;
    protected String userName_NOTLIKE;

    protected String loginName;
    protected String loginName_NE;
    protected String loginName_LIKE;
    protected String loginName_NOTLIKE;

    protected String loginPassword;
    protected String loginPassword_NE;
    protected String loginPassword_LIKE;
    protected String loginPassword_NOTLIKE;

    protected String salt;
    protected String salt_NE;
    protected String salt_LIKE;
    protected String salt_NOTLIKE;

    protected String userStatus;
    protected String userStatus_NE;

    protected PK leadUserId;
    protected PK leadUserId_NE;

    protected String phone;
    protected String phone_NE;
    protected String phone_LIKE;
    protected String phone_NOTLIKE;

    protected String email;
    protected String email_NE;
    protected String email_LIKE;
    protected String email_NOTLIKE;

    protected String avatarUrl;
    protected String avatarUrl_NE;
    protected String avatarUrl_LIKE;
    protected String avatarUrl_NOTLIKE;

    protected String openId;
    protected String openId_NE;
    protected String openId_LIKE;
    protected String openId_NOTLIKE;

    protected String unionId;
    protected String unionId_NE;
    protected String unionId_LIKE;
    protected String unionId_NOTLIKE;

    protected String systemAdmin;
    protected String systemAdmin_NE;

    protected String depId;
    protected String depId_NE;
    protected String depId_LIKE;
    protected String depId_NOTLIKE;

    protected String organId;
    protected String organId_NE;
    protected String organId_LIKE;
    protected String organId_NOTLIKE;

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

    protected String depName;
    protected String depName_NE;
    protected String depName_LIKE;
    protected String depName_NOTLIKE;

    protected String organName;
    protected String organName_NE;
    protected String organName_LIKE;
    protected String organName_NOTLIKE;

    protected String tenantName;
    protected String tenantName_NE;
    protected String tenantName_LIKE;
    protected String tenantName_NOTLIKE;



    @Override
    public void processKeyword(QueryWrapper<VsUserEntity> wrapper, String keyword) {
        wrapper.and(i->i.like("phone" , keyword).
                or().like("email" , keyword).
                or().like("user_name" , keyword).
                or().like("login_name" , keyword)
        );
    }


	
}