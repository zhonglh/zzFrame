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
    boolean deletesByIds(Collection<T> ts);

    /**
     * 用于校验是否已经存在
     * @param t
     * @return
     */
    T selectCheck(T t) ;



    /**
     * 用于校验是否已经存在
     * @param t
     * @return
     */
    void isExist(T t) ;


    /**
     * 根据ID获取数据
     * @param id        ID
     * @param lazy      是否懒加载关联的信息
     * @return
     */
    T getById(PK id , boolean lazy);

    /**
     * 获取多个数据记录
     * @param idList
     * @param lazy
     * @return
     */
    List<T> listByIds(Collection<? extends Serializable> idList , boolean lazy);


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
    void specialHandler(T t);


    /**
     * 根据外键ID获取数据
     * @param fkColumnName  外键列名
     * @param fkIdList      外键ID集合
     * @param lazy
     * @return
     */
    List<T> listByFkIds(String fkColumnName,Collection<? extends Serializable> fkIdList , boolean lazy);


    /**
     * 删除之后要做的处理
     * @param t
     * @return
     */
    void deleteByIdAfter(T t);


    /**
     * 批量删除之后要做的处理
     * @param ts
     * @return
     */
    void deletesByIdsAfter(Collection<T> ts);



    /**
     * 新增之后做的操作
     * @param t
     * @return
     */
    void saveAfter(T t);



    /**
     * 修改之后做的操作
     * @param t
     * @return
     */
    void updateAfter(T t);


}
