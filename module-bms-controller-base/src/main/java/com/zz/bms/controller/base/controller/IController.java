package com.zz.bms.controller.base.controller;

import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.BaseEntity;

import java.io.Serializable;
import java.util.Map;

public interface IController<RwModel extends BaseEntity<PK>,
        QueryModel extends RwModel,
        PK extends Serializable> {


    public Class<RwModel> getRwEntityClass() ;


    public RwModel newRwModel() ;



    public Class<QueryModel> getQueryEntityClass()  ;


    public QueryModel newQueryModel()  ;



    public BaseService<QueryModel, PK> getBaseQueryService()  ;

    public BaseService<RwModel, PK> getBaseRwService()  ;



    public Map<String,?> getDictMaps(String ... dictTypes)  ;


    public String getDictVal (Object dict)  ;

    public String getDictName (Object dict);
}
