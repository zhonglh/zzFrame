package com.zz.bms.core.db.base.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zz.bms.core.db.entity.BaseEntity;

import java.io.Serializable;

/**
 * DAO基础接口
 * @author Administrator
 */
public interface BaseDAO<T extends BaseEntity, PK extends Serializable> extends BaseMapper<T> {

    public T selectCheck(T t) ;
}
