package com.zz.bms.core.db.mybatis.query;

import com.baomidou.mybatisplus.mapper.Wrapper;

import java.io.Serializable;

public interface Query<M ,PK extends Serializable> {

    public  Wrapper<M> buildWrapper() ;
}
