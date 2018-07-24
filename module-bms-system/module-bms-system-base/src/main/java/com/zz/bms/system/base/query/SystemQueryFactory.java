package com.zz.bms.system.base.query;

import com.zz.bms.system.base.query.impl.TsUserQueryImpl;
import com.zz.bms.system.base.query.impl.VsUserQueryImpl;

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

    /**
     * 构建用户视图查询器
     * @return
     */
    public static VsUserQuery buildVsUserQuery(){
        return new VsUserQueryImpl();
    }

}
