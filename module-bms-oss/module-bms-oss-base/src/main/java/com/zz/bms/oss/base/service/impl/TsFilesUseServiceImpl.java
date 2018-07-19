package com.zz.bms.oss.base.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;
import com.zz.bms.oss.base.dao.TsFilesDAO;
import com.zz.bms.oss.base.dao.TsFilesUseDAO;
import com.zz.bms.oss.base.entity.TsFilesEntity;
import com.zz.bms.oss.base.entity.TsFilesUseEntity;
import com.zz.bms.oss.base.service.TsFilesService;
import com.zz.bms.oss.base.service.TsFilesUseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class TsFilesUseServiceImpl extends BaseServiceImpl<TsFilesUseEntity,String> implements TsFilesUseService {


    @Autowired
    private TsFilesUseDAO tsFilesUseDAO ;


    @Override
    public BaseDAO getQueryDAO() {
        return tsFilesUseDAO;
    }

    @Override
    public BaseDAO getRwDAO() {
        return tsFilesUseDAO;
    }
}
