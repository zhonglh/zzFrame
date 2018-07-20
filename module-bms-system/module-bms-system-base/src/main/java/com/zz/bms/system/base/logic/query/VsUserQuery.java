package com.zz.bms.system.base.logic.query;

import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.base.entity.TsUserEntity;
import com.zz.bms.system.base.entity.VsUserEntity;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author Administrator
 */
public interface VsUserQuery<PK extends Serializable> extends Query<VsUserEntity,PK> {

    public VsUserQuery userId(PK id);
    public VsUserQuery userIdNot(PK idNot);
    public VsUserQuery userIdIn(PK idIn);
    public VsUserQuery userIdNotIn(PK idNotIn);
    public VsUserQuery userIdIsNull();
    public VsUserQuery userIdIsNotNull();






    public VsUserQuery userName(String userName);
    public VsUserQuery userNameNot(String userNameNot);
    public VsUserQuery userNameIn(String userNameIn);
    public VsUserQuery userNameNotIn(String userNameNotIn);
    public VsUserQuery userNameLike(String userNameLike);
    public VsUserQuery userNameNotLike(String userNameNotLike);



    public VsUserQuery loginName(String loginName);
    public VsUserQuery loginNameNot(String loginNameNot);
    public VsUserQuery loginNameIn(String loginNameIn);
    public VsUserQuery loginNameNotIn(String loginNameNotIn);
    public VsUserQuery loginNameLike(String loginNameLike);
    public VsUserQuery loginNameNotLike(String loginNameNotLike);
    public VsUserQuery loginNameNull();
    public VsUserQuery loginNameNotNull();

}
