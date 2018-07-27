package com.zz.bms.core.db.mybatis.query;

import com.baomidou.mybatisplus.mapper.Wrapper;

import java.io.Serializable;

public interface Query<M ,PK extends Serializable> {

    /**
     * Query 转 Wrapper
     * @return
     */
    public  Wrapper<M> buildWrapper() ;

    /**
     * Query 转 Wrapper , 在 参数w的基础上
     * @param w
     * @return
     */
    public  Wrapper<M> buildWrapper(Wrapper w) ;


    /**
     * Query 转 Wrapper , 在 参数w的基础上
     * 多个条件是否为or的关系
     * @param w
     * @param orBoolean    是否为OR 的关系
     * @return
     */
    public Wrapper<M> buildWrapper(Wrapper w , boolean orBoolean) ;
}
