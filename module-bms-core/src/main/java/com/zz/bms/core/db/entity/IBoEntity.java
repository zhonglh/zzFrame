package com.zz.bms.core.db.entity;

/**
 * VO 的 接口类
 * @author Administrator
 */
public interface IBoEntity {

    /**
     * 是否为表类型
     * true:表
     * false：视图
     * @return
     */
    public boolean isTable();


}
