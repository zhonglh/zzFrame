package com.zz.bms.system.service.impl;

import com.zz.bms.core.IUserService;
import com.zz.bms.core.db.entity.ILoginPermitEntity;
import com.zz.bms.core.db.entity.ILoginRoleEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.query.TsUserQuery;
import com.zz.bms.system.query.impl.TsUserQueryImpl;
import com.zz.bms.system.service.TsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 登录用户服务实现类
 * @author Administrator
 */
@Service
public class UserServiceImpl implements IUserService<String> {


    @Autowired
    private TsUserService tsUserService ;

    @Override
    public ILoginUserEntity getUserEntityByLoginName(String loginName) {

        TsUserQuery userQuery = new TsUserQueryImpl();
        userQuery.loginName(loginName);
        return tsUserService.selectOne(userQuery.buildWrapper());

    }

    @Override
    public List<ILoginRoleEntity> getUserRoleInfo(String userId) {
        return null;
    }

    @Override
    public List<ILoginPermitEntity> getUserPermitInfo(String userId) {
        return null;
    }
}
