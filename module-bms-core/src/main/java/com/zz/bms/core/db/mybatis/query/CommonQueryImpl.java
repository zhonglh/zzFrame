package com.zz.bms.core.db.mybatis.query;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class CommonQueryImpl<M,PK extends Serializable> extends QueryImpl<M,PK> {

    /**
     * 关键字查询
     */
    private  String keyword;

    /**
     * 权限SQL
     */
    public String rbac ;


    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getRbac() {
        return rbac;
    }

    public void setRbac(String rbac) {
        this.rbac = rbac;
    }
}
