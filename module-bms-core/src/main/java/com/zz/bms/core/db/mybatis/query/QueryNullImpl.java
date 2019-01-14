package com.zz.bms.core.db.mybatis.query;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

public class QueryNullImpl implements Query {
    @Override
    public QueryWrapper buildWrapper() {
        return null;
    }

    @Override
    public QueryWrapper buildWrapper(QueryWrapper w) {
        return null;
    }

    @Override
    public QueryWrapper buildWrapper(QueryWrapper wrapper, boolean orBoolean) {
        return null;
    }
}
