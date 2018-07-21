package com.zz.bms.core.db.mybatis.query;

import com.baomidou.mybatisplus.mapper.Wrapper;

public class QueryNullImpl implements Query {
    @Override
    public Wrapper buildWrapper() {
        return null;
    }

    @Override
    public Wrapper buildWrapper(Wrapper w) {
        return null;
    }

    @Override
    public Wrapper buildWrapper(Wrapper wrapper, boolean orBoolean) {
        return null;
    }
}
