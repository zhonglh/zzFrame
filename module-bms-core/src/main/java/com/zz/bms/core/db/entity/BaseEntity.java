package com.zz.bms.core.db.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 实体基础类
 * @Date 2017-05-19 16:16
 */
public abstract class BaseEntity<PK extends Serializable> implements Serializable {

    @TableField
    private PK id;
    private PK tenantId;


    @TableField(exist = false)
    private List childs;




    @TableField(exist = false)
    private List<PK> queryIdList;

    /**
     * 权限SQL
     */
    @TableField(exist = false)
    private String rbac ;

    @Deprecated
    //对应界面查询条件 ,  todo 可能是不需要了
    @TableField(exist = false)
    private String searchSql ;

    /**
     * 关键字， 用于查询时记录关键字信息
     */
    @TableField(exist = false)
    private String keyword;



    @TableField(exist = false)
    private int pageNum;
    @TableField(exist = false)
    private int pageSize;


    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }

    public List<PK> getQueryIdList() {
        return queryIdList;
    }

    public void setQueryIdList(List<PK> queryIdList) {
        this.queryIdList = queryIdList;
    }

    public PK getTenantId() {
        return tenantId;
    }

    public void setTenantId(PK tenantId) {
        this.tenantId = tenantId;
    }

    public List getChilds() {
        return childs;
    }

    public void setChilds(List childs) {
        this.childs = childs;
    }


    public String getRbac() {
        return rbac;
    }

    public void setRbac(String rbac) {
        this.rbac = rbac;
    }

    public String getSearchSql() {
        return searchSql;
    }

    public void setSearchSql(String searchSql) {
        this.searchSql = searchSql;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
