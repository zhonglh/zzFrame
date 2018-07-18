package com.zz.bms.oss.base.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;
import com.zz.bms.oss.base.dao.TsFilesDAO;
import com.zz.bms.oss.base.domain.TsFilesEntity;
import com.zz.bms.oss.base.service.TsFilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class TsFilesServiceImpl extends BaseServiceImpl<TsFilesEntity,String> implements TsFilesService {


    @Autowired
    private TsFilesDAO tsFilesDAO ;


    @Override
    public BaseDAO getQueryDAO() {
        return tsFilesDAO;
    }

    @Override
    public BaseDAO getRwDAO() {
        return tsFilesDAO;
    }
}
