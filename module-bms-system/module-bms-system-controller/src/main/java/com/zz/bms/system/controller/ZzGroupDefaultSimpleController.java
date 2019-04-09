package com.zz.bms.system.controller;

import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.Query;

import java.io.Serializable;

/**
 * @author zhonglh
 */
public abstract class ZzGroupDefaultSimpleController<M extends BaseEntity<PK>, PK extends Serializable, Q extends Query>
        extends ZzGroupDefaultController<M  , M, PK , Q , Q> {
}
