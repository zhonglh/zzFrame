package com.zz.bms.controller.base.controller;

import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.Query;

import java.io.Serializable;

public abstract class DefaultController<M extends BaseEntity<PK>, PK extends Serializable , Q extends Query >   extends BaseCURDController<M , PK , Q>{

}
