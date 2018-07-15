package com.zz.bms.core.db.base.service;

import com.baomidou.mybatisplus.service.IService;
import com.zz.bms.core.db.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 */
public interface BaseService<T extends BaseEntity, PK extends Serializable> extends IService<T> {

    /**
     * 根据ID删除， 但是传进来的数据是实体类， 非ID
     * 原因是为了处理日志
     * @param t
     * @return
     */
    boolean deleteById(T t);


    /**
     * 和上面的方法相似，  这个是批量的
     * @param ts
     * @return
     */
    boolean deletesByIds(List<T> ts);


    T selectCheck(T t) ;

}
