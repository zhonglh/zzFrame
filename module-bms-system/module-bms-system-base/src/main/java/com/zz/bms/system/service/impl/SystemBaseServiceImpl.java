package com.zz.bms.system.service.impl;


import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.enums.EnumYesNo;
import com.zz.bms.system.bo.TsFileUseBO;
import com.zz.bms.system.bo.VsFileUseBO;
import com.zz.bms.system.service.TsFileUseService;
import com.zz.bms.util.spring.ReflectionUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class SystemBaseServiceImpl<T extends BaseEntity<PK>,  PK extends Serializable>
        extends BaseServiceImpl<T , PK> implements BaseService<T , PK> {

    @Autowired
    private TsFileUseService tsFileUseService ;

    protected void processFiles(T t){
        if(!t.haveFile()){
            return ;
        }
        List<VsFileUseBO> allFileUseBO = new ArrayList<VsFileUseBO>();
        try {
            List<Field> fs = ReflectionUtil.getFileFields(t.getClass());
            for (Field f : fs) {
                f.setAccessible(true);
                Object val = f.get(t);
                if(val != null){
                    List<VsFileUseBO> fileUseBOs = (List<VsFileUseBO>)val;
                    if(fileUseBOs != null && !fileUseBOs.isEmpty()){
                        allFileUseBO.addAll(fileUseBOs);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        if(allFileUseBO.isEmpty()){
            return;
        }

        List<TsFileUseBO> fileUses = new ArrayList<TsFileUseBO>(allFileUseBO.size());
        for(VsFileUseBO vsFileUseBO : allFileUseBO){
            TsFileUseBO tsFileUseBO = new TsFileUseBO();
            tsFileUseBO.setId(vsFileUseBO.getId());
            tsFileUseBO.setBusinessType(t.getClass().getSimpleName());
            tsFileUseBO.setBusinessId((String)t.getId());
            if(vsFileUseBO.getDeleteFlag() != null &&
                    EnumYesNo.getEnumByValue(vsFileUseBO.getDeleteFlag()) != null) {
                tsFileUseBO.setDeleteFlag(vsFileUseBO.getDeleteFlag());
            }
        }
        tsFileUseService.updateBatchById(fileUses);
    }


    @Override
    public void saveAfter(T t){
        processFiles(t);
    }



    @Override
    public void updateAfter(T t){
        processFiles(t);
    }

}
