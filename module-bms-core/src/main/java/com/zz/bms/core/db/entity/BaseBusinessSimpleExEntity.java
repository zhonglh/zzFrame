package com.zz.bms.core.db.entity;

import java.io.Serializable;

/**
 * @author admin
 */
public abstract class BaseBusinessSimpleExEntity<PK extends Serializable> extends  BaseBusinessSimpleEntity<PK> implements Serializable {


    /**
     * 创建人姓名
     */
    private String createUserName;

    /**
     * 修改人姓名
     */
    private String updateUserName;

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }
}
