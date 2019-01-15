package com.zz.bms.core.db.mybatis.query;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * @author Administrator
 */
public class QueryNullImpl implements Query {
    @Override
    public QueryWrapper buildWrapper() {
        return null;
    }

    @Override
    public QueryWrapper buildWrapper(boolean orBoolean) {
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

    @Override
    public void processKeyword(QueryWrapper wrapper, String keyword) {

    }


}
