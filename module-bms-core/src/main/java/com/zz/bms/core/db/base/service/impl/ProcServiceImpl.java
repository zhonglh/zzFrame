package com.zz.bms.core.db.base.service.impl;

import com.zz.bms.core.db.base.dao.ProcDAO;
import com.zz.bms.core.db.base.service.ProcService;
import com.zz.bms.core.db.entity.BaseEntity;

import java.util.List;

/**
 * 存储过程
 * @author Administrator
 */
//@Service
public class ProcServiceImpl<T extends BaseEntity> implements ProcService<T> {

    private ProcDAO procDAO ;

    @Override
    public void execProc(String proc) {
        procDAO.execProc(proc);
    }

    @Override
    public Long execProc4Long(String proc) {
        return procDAO.execProc4Long(proc);
    }

    @Override
    public T execProc4One(String proc) {
        return (T)procDAO.execProc4One(proc);
    }

    @Override
    public List<T> execProc4List(String proc) {
        return procDAO.execProc4List(proc);
    }
}
