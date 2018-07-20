package com.zz.bms.oss.base.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;
import com.zz.bms.oss.base.dao.TsFilesDAO;
import com.zz.bms.oss.base.dao.TsFilesUseDAO;
import com.zz.bms.oss.base.dao.VsFilesUseDAO;
import com.zz.bms.oss.base.entity.TsFilesEntity;
import com.zz.bms.oss.base.entity.VsFilesUseEntity;
import com.zz.bms.oss.base.service.VsFilesUseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class VsFilesUseServiceImpl extends BaseServiceImpl<VsFilesUseEntity,String> implements VsFilesUseService {

    @Autowired
    private TsFilesDAO tsFilesDAO ;

    @Autowired
    private TsFilesUseDAO tsFilesUseDAO ;

    @Autowired
    private VsFilesUseDAO vsFilesUseDAO ;



    @Override
    public boolean insert(VsFilesUseEntity vsFilesUseEntity){
        //todo

        if(StringUtils.isEmpty(vsFilesUseEntity.getFileId())){
            //先保存文件表
            TsFilesEntity tsFilesEntity = new TsFilesEntity();



            //保存文件使用表

            return true;
        }else {
            //将文件表使用次数加一使用表

            //保存文件使用次数

            return true;
        }
    }


    @Override
    public BaseDAO getQueryDAO() {
        return vsFilesUseDAO;
    }

    @Override
    public BaseDAO getRwDAO() {
        return tsFilesUseDAO;
    }
}
