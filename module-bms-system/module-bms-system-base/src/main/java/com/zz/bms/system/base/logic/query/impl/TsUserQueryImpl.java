package com.zz.bms.system.base.logic.query.impl;

import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bms.system.base.entity.TsUserEntity;
import com.zz.bms.system.base.logic.query.TsUserQuery;
import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 用于链式查询
 * @author Administrator
 * 主键 外键  eq ne in notin
 * 字典 枚举 eq ne in notin
 * 数字 eq ne gt ge lt le
 * 日期 同上
 * 普通字符串 eq ne in notin like notlike
 * 参考 EnumSearchType
 */
public class TsUserQueryImpl<PK extends Serializable> extends QueryImpl<TsUserEntity,PK> implements TsUserQuery<PK>, Serializable {


    private PK id ;
    private PK id_NE ;
    private List<PK> id_IN;
    private List<PK> id_NOTIN;

    private String loginName;
    private String loginName_NE;
    private String loginName_LIKE;
    private String loginName_NOTLIKE;
    private List<String> loginName_IN;
    private List<String> loginName_NOTIN;

    private String status;
    private String status_NE;
    private List<String> status_IN;
    private List<String> status_NOTIN;

    private PK leadId;
    private PK leadId_NE;
    private List<PK> leadId_IN;
    private List<PK> leadId_NOTIN;

    private String phone;
    private String phone_NE;
    private String phone_LIKE;
    private String phone_NOTLIKE;
    private List<String> phone_IN;
    private List<String> phone_NOTIN;

    private String email;
    private String email_NE;
    private String email_LIKE;
    private String email_NOTLIKE;
    private List<String> email_IN;
    private List<String> email_NOTIN;

    private String openId;
    private String openId_NE;
    private List<String> openId_IN;
    private List<String> openId_NOTIN;

    private String unionId;
    private String unionId_NE;
    private List<String> unionId_IN;
    private List<String> unionId_NOTIN;

    private String systemAdmin;
    private String systemAdmin_NE;
    private List<String> systemAdmin_IN;
    private List<String> systemAdmin_NOTIN;

    private PK depId;
    private PK depId_NE;
    private List<PK> depId_IN;
    private List<PK> depId_NOTIN;

    private PK organId;
    private PK organIdAdmin_NE;
    private List<PK> organId_IN;
    private List<PK> organId_NOTIN;


    private Timestamp createTime;
    private Timestamp createTime_NE;
    private Timestamp createTime_GT;
    private Timestamp createTime_GE;
    private Timestamp createTime_LT;
    private Timestamp createTime_LE;

    private PK createUserId;
    private PK createUserId_NE;
    private List<PK> createUserId_IN;
    private List<PK> createUserId_NOTIN;


    @Override
    public TsUserQuery userId(PK id) {
        if(!IdUtils.isEmpty(id)){
            this.id = id;
        }
        return this;
    }

    @Override
    public TsUserQuery userIdNot(PK idNot) {
        if(!IdUtils.isEmpty(idNot)) {
            this.id_NE = idNot;
        }
        return this;
    }

    @Override
    public TsUserQuery userIdIn(PK idIn) {
        if(!IdUtils.isEmpty(idIn)) {
            this.id_IN.add(idIn);
        }
        return this;
    }

    @Override
    public TsUserQuery userIdNotIn(PK idNotIn) {
        if(!IdUtils.isEmpty(idNotIn)) {
            this.id_NOTIN.add(idNotIn);
        }
        return this;
    }

    @Override
    public TsUserQuery userIdIsNull() {
        this.isNulls.add("id");
        return this;
    }

    @Override
    public TsUserQuery userIdIsNotNull() {
        this.isNotNulls.add("id");
        return this;
    }




    @Override
    public TsUserQuery loginName(String loginName) {
        if(StringUtils.isNotEmpty(loginName)) {
            this.loginName = loginName;
        }
        return this;
    }

    @Override
    public TsUserQuery loginNameNot(String loginNameNot) {
        if(StringUtils.isNotEmpty(loginNameNot)) {
            this.loginName_NE = loginNameNot;
        }
        return this;
    }

    @Override
    public TsUserQuery loginNameIn(String loginNameIn) {
        if(StringUtils.isNotEmpty(loginNameIn)) {
            this.loginName_IN.add(loginNameIn);
        }
        return this;
    }

    @Override
    public TsUserQuery loginNameNotIn(String loginNameNotIn) {
        if(StringUtils.isNotEmpty(loginNameNotIn)) {
            this.loginName_NOTIN.add(loginNameNotIn);
        }
        return this;
    }

    @Override
    public TsUserQuery loginNameLike(String loginNameLike) {
        if(StringUtils.isNotEmpty(loginNameLike)) {
            this.loginName_LIKE = loginNameLike;
        }
        return this;
    }

    @Override
    public TsUserQuery loginNameNotLike(String loginNameNotLike) {
        if(StringUtils.isNotEmpty(loginNameNotLike)) {
            this.loginName_NOTLIKE = loginNameNotLike;
        }
        return this;
    }

    @Override
    public TsUserQuery loginNameNull() {
        this.isNulls.add("loginName");
        return this;
    }

    @Override
    public TsUserQuery loginNameNotNull() {
        this.isNotNulls.add("loginName");
        return this;
    }
}
