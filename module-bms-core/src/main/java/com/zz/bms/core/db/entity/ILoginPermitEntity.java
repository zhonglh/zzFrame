package com.zz.bms.core.db.entity;

import java.io.Serializable;

/**
 * 用户许可实体接口
 * @author Administrator
 */
public interface ILoginPermitEntity<PK extends Serializable> {

    public PK getId();

    public String getPermissionName();

    public String getPermissionCode();


}
