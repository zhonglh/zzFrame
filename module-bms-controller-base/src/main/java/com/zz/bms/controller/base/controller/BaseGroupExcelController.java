package com.zz.bms.controller.base.controller;


import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.Query;

import java.io.Serializable;

/**
 * 处理数据库基础的Excel 功能
 * 包括导出，导入 支持 Excel2003  Excel2007  CVS 格式
 * @author Administrator
 */
public class BaseGroupExcelController <
        RwModel extends BaseEntity<PK>,
        QueryModel extends RwModel,
        PK extends Serializable,
        RwQuery extends Query,
        OnlyQuery extends RwQuery>
        extends BaseGroupCURDController<RwModel,QueryModel,PK,RwQuery,OnlyQuery> {






}
