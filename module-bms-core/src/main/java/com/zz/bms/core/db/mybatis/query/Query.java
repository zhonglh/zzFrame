package com.zz.bms.core.db.mybatis.query;

import com.baomidou.mybatisplus.mapper.Wrapper;

import java.io.Serializable;

public interface Query<M ,PK extends Serializable> {

    public  Wrapper<M> buildWrapper() ;

    public  Wrapper<M> buildWrapper(Wrapper w) ;


    public Wrapper<M> buildWrapper(Wrapper wrapper , boolean orBoolean) ;
}
