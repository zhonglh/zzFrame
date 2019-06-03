package com.zz.bms.core.db.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 实体基础类
 * @Date 2017-05-19 16:16
 */
public abstract class BaseEntity<PK extends Serializable> implements Serializable , IBoEntity {

    @TableField
    private PK id;
    private PK tenantId;
    private PK organId;


    @TableField(exist = false)
    private List children;
    @TableField(exist = false)
    private String state="closed";




    @TableField(exist = false)
    private String errorInfo = "";




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

    public PK getOrganId() {
        return organId;
    }

    public void setOrganId(PK organId) {
        this.organId = organId;
    }

    public PK getTenantId() {
        return tenantId;
    }

    public void setTenantId(PK tenantId) {
        this.tenantId = tenantId;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = this.errorInfo + errorInfo;
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


    @Override
    public boolean haveFile(){
        return false;
    }
}
