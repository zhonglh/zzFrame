package com.zz.bms.system.base.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;
import com.zz.bms.system.base.service.VsUserService;
import com.zz.bms.system.base.dao.TsUserDAO;
import com.zz.bms.system.base.dao.VsUserDAO;
import com.zz.bms.system.base.entity.VsUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 用户 数据库服务实现类
 * @author Administrator
 */
@Service
public class VsUserServiceImpl extends BaseServiceImpl<VsUserEntity,String> implements VsUserService {


    @Autowired
    private VsUserDAO vsUserDAO ;


    @Autowired
    private TsUserDAO tsUserDAO ;



    /**
     * 获取查询用到的DAO实体
     * @return
     */
    @Override
    public BaseDAO getQueryDAO() {
        return vsUserDAO;
    }

    /**
     * 获取读写用到的DAO实体
     * @return
     */
    @Override
    public BaseDAO getRwDAO() {
        return tsUserDAO;
    }
}
