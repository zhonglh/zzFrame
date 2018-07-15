package com.zz.bms.core.db.base.dao;

import java.util.List;

/**
 * @author Administrator
 */
public interface ProcDAO<T> {


    /**
     * 执行存储过程 , 无返回值
     * @param proc
     */
    public void execProc(String proc) ;


    /**
     * 执行存储过程 , 返回Long
     * @param proc
     */
    public Long execProc4Long(String proc) ;


    /**
     * 执行存储过程 , 返回一个对象
     * @param proc
     */
    public T execProc4One(String proc) ;


    /**
     * 执行存储过程 , 返回一组对象
     * @param proc
     */
    public List<T> execProc4List(String proc) ;

}
