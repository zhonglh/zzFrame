package com.zz.bms.controller.base.controller;


import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * 处理数据库基础的Excel 功能
 * 包括导出，导入 支持 Excel2003  Excel2007  CVS 格式
 * @author Administrator
 */
public abstract class BaseExcelController<M extends BaseEntity<PK>, PK extends Serializable, Q extends Query> extends BusinessController<M,PK,Q> {


    @Autowired
    protected BaseService<M, PK> baseService;

    public BaseExcelController(){
        super();
    }




}
