package com.zz.bms.core.db.entity;

import java.io.Serializable;

/**
 * 登录用户接口
 * @author Administrator
 */
public interface ILoginUserEntity<PK extends Serializable> {

    /**
     * 获取登录人员ID
     * @return
     */
    public PK getId();

    /**
     * 获取租户信息
     * @return
     */
    public PK getTenantId();


    /**
     * 获取部门ID
     * @return
     */
    public PK getDepId();



    /**
     * 获取机构ID
     * @return
     */
    public PK getOrganId();

    /**
     * 获取登录人员名称
     * @return
     */
    public String getUserName();



    public String getPhone() ;

    public String getEmail() ;


    public String getUserStatus();

    public String getSalt();


    public String getLoginPassword();

    /**
     * 是否为系统用户
     * @return
     */
    public boolean isSystemUser() ;


}
