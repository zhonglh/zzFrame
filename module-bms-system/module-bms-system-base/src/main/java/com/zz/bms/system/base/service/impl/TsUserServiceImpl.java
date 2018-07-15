package com.zz.bms.system.base.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;
import com.zz.bms.system.base.dao.TsUserDAO;
import com.zz.bms.system.base.entity.TsUserEntity;
import com.zz.bms.system.base.service.TsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class TsUserServiceImpl extends BaseServiceImpl<TsUserEntity,String> implements TsUserService {


    @Autowired
    private TsUserDAO tsUserDAO ;


    @Override
    public BaseDAO getQueryDAO() {
        return tsUserDAO;
    }

    @Override
    public BaseDAO getRwDAO() {
        return tsUserDAO;
    }
}
