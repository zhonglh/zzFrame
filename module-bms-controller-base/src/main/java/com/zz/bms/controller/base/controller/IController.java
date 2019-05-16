package com.zz.bms.controller.base.controller;

import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.BaseEntity;

import java.io.Serializable;

public interface IController<RwModel extends BaseEntity<PK>,
        QueryModel extends RwModel,
        PK extends Serializable> {


    public Class<RwModel> getRwEntityClass() ;


    public RwModel newRwModel() ;



    public Class<QueryModel> getQueryEntityClass()  ;


    public QueryModel newQueryModel()  ;



    public BaseService<QueryModel, PK> getBaseQueryService()  ;

    public BaseService<RwModel, PK> getBaseRwService()  ;
}
