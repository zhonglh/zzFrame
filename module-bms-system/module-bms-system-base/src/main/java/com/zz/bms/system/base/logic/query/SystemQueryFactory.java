package com.zz.bms.system.base.logic.query;

import com.zz.bms.system.base.logic.query.impl.TsUserQueryImpl;

/**
 * 系统查询器构建工厂
 * @author Administrator
 */
public class SystemQueryFactory {
    /**
     * 构建用户表查询器
     * @return
     */
    public static TsUserQuery buildTsUserQuery(){
        return new TsUserQueryImpl();
    }

}
