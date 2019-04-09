package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.BaseExcelController;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.service.TsDictService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Map;


/**
 * zz 专用 base controller
 * 其它项目可以按照需求， 重新设计一个base controller
 *
 *
 * @param <M>
 * @param <PK>
 * @param <Q>
 */
public abstract class ZzDefaultSimpleController<M extends BaseEntity<PK>, PK extends Serializable , Q extends Query >
            extends ZzDefaultController<M  , M, PK , Q , Q> {


}
