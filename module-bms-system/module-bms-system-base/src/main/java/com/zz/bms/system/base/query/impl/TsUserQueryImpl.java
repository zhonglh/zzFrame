package com.zz.bms.system.base.query.impl;

import com.zz.bms.system.base.query.TsUserQuery;
import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * 用户查询， 用于手工链式加条件
 * @param <PK>
 */
public class TsUserQueryImpl<PK extends Serializable> extends TsUserAbstractQueryImpl<PK> implements TsUserQuery<PK>, Serializable  {


    private List<PK> id_IN;
    private List<PK> id_NOTIN;


    private List<String> loginName_IN;
    private List<String> loginName_NOTIN;



    private List<String> status_IN;
    private List<String> status_NOTIN;


    private List<PK> leadId_IN;
    private List<PK> leadId_NOTIN;


    private List<String> phone_IN;
    private List<String> phone_NOTIN;


    private List<String> email_IN;
    private List<String> email_NOTIN;


    private List<String> openId_IN;
    private List<String> openId_NOTIN;


    private List<String> unionId_IN;
    private List<String> unionId_NOTIN;


    private List<String> systemAdmin_IN;
    private List<String> systemAdmin_NOTIN;


    private List<PK> depId_IN;
    private List<PK> depId_NOTIN;


    private List<PK> organId_IN;
    private List<PK> organId_NOTIN;


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
