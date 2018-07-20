package com.zz.bms.system.base.logic.query;

import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.base.entity.TsUserEntity;

import java.io.Serializable;

/**
 * @author Administrator
 */
public interface TsUserQuery<PK extends Serializable> extends Query<TsUserEntity,PK> {

    public TsUserQuery userId(PK id);
    public TsUserQuery userIdNot(PK idNot);
    public TsUserQuery userIdIn(PK idIn);
    public TsUserQuery userIdNotIn(PK idNotIn);
    public TsUserQuery userIdIsNull();
    public TsUserQuery userIdIsNotNull();


    public TsUserQuery loginName(String loginName);
    public TsUserQuery loginNameNot(String loginNameNot);
    public TsUserQuery loginNameIn(String loginNameIn);
    public TsUserQuery loginNameNotIn(String loginNameNotIn);
    public TsUserQuery loginNameLike(String loginNameLike);
    public TsUserQuery loginNameNotLike(String loginNameNotLike);
    public TsUserQuery loginNameNull();
    public TsUserQuery loginNameNotNull();

}
