package com.zz.bms.core;

import com.zz.bms.core.db.entity.ILoginUserEntity;

public interface IUserService {

    ILoginUserEntity getUserEntityByLoginName(String loginName);
}
