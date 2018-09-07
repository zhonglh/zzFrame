package com.zz.bms.shiro;

import com.zz.bms.core.db.entity.ILoginUserEntity;

public interface IUserService {

    ILoginUserEntity getUserEntityByLoginName(String loginName);
}
