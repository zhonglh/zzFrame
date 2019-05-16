package com.zz.bms.controller.base.controller;

import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;

import java.io.Serializable;

public interface ICURDController <RwModel extends BaseEntity<PK>,
        QueryModel extends RwModel,
        PK extends Serializable> extends IController<RwModel , QueryModel , PK> {

    public void insertInfo(
            RwModel m,
           ILoginUserEntity<PK> sessionUserVO ,
           boolean saveFlag ,
           boolean processBOFlag) ;

}
