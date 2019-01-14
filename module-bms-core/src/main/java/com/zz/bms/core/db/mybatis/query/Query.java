package com.zz.bms.core.db.mybatis.query;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.io.Serializable;

public interface Query<M ,PK extends Serializable> {

    /**
     * Query 转 Wrapper
     * @return
     */
    public QueryWrapper<M> buildWrapper() ;

    /**
     * Query 转 Wrapper , 在 参数w的基础上
     * @param w
     * @return
     */
    public  QueryWrapper<M> buildWrapper(QueryWrapper w) ;


    /**
     * Query 转 Wrapper , 在 参数w的基础上
     * 多个条件是否为or的关系
     * @param w
     * @param orBoolean    是否为OR 的关系
     * @return
     */
    public QueryWrapper<M> buildWrapper(QueryWrapper w , boolean orBoolean) ;
}
