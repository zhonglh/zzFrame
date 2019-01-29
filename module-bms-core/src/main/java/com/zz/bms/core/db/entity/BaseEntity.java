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
    private String errorInfo = "";



    /**
     * 关键字， 用于查询时记录关键字信息
     */
    /*
    @TableField(exist = false)
    private String keyword;
    */



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


}
