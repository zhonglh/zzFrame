package com.zz.bms.core.db.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.bms.core.db.entity.BaseEntity;

import java.io.Serializable;
import java.util.Collection;
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

    /**
     * 用于校验是否已经存在
     * @param t
     * @return
     */
    T selectCheck(T t) ;


    /**
     * 根据ID获取数据
     * @param id        ID
     * @param lazy      是否加载关联的信息
     * @return
     */
    T getById(PK id , boolean lazy);

    /**
     * 获取多个数据记录
     * @param idList
     * @param lazy
     * @return
     */
    Collection<T> listByIds(Collection<? extends Serializable> idList , boolean lazy);


    /**
     * 处理返回的对象
     * 加入状态 外键内容的处理
     * @param t
     * @return
     */
    T processResult(T t);


    /**
     * 特殊处理
     * 比如查询用户信息， 不能将密码 等关键信息返回到客户端
     * @param t
     * @return
     */
    T specialHandler(T t);

}
