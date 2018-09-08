package com.zz.bms.core.db.entity;

import java.io.Serializable;

/**
 * 用户角色实体接口
 * @author Administrator
 */
public interface ILoginRoleEntity <PK extends Serializable> {


    public PK getId();

    public PK getRoleId();

    public String getRoleName();

    public String getRoleCode();


}
