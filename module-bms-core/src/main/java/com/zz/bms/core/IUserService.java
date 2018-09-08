package com.zz.bms.core;

import com.zz.bms.core.db.entity.ILoginPermitEntity;
import com.zz.bms.core.db.entity.ILoginRoleEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 用户信息接口
 * @author Administrator
 */
public interface IUserService<PK extends Serializable> {

    /**
     * 通过登录名获取用户信息
     * @param loginName
     * @return
     */
    public ILoginUserEntity getUserEntityByLoginName(String loginName);

    /**
     * 获取用户所有的角色信息
     * @param userId
     * @return
     */
    public List<ILoginRoleEntity> getUserRoleInfo(PK userId) ;


    /**
     * 获取用户所有的许可信息
     * @param userId
     * @return
     */
    public List<ILoginPermitEntity> getUserPermitInfo(PK userId) ;

}
