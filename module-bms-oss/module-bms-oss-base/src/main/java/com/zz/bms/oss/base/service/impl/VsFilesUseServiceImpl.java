package com.zz.bms.oss.base.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;
import com.zz.bms.oss.base.dao.TsFilesUseDAO;
import com.zz.bms.oss.base.dao.VsFilesUseDAO;
import com.zz.bms.oss.base.entity.TsFilesUseEntity;
import com.zz.bms.oss.base.entity.VsFilesUseEntity;
import com.zz.bms.oss.base.service.TsFilesUseService;
import com.zz.bms.oss.base.service.VsFilesUseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class VsFilesUseServiceImpl extends BaseServiceImpl<VsFilesUseEntity,String> implements VsFilesUseService {


    @Autowired
    private TsFilesUseDAO tsFilesUseDAO ;

    @Autowired
    private VsFilesUseDAO vsFilesUseDAO ;


    @Override
    public BaseDAO getQueryDAO() {
        return vsFilesUseDAO;
    }

    @Override
    public BaseDAO getRwDAO() {
        return tsFilesUseDAO;
    }
}
