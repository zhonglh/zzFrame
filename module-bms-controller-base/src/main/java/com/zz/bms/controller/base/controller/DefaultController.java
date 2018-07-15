package com.zz.bms.controller.base.controller;

import com.zz.bms.core.db.entity.BaseEntity;

import java.io.Serializable;

public abstract class DefaultController<M extends BaseEntity<PK>, PK extends Serializable>   extends BaseCURDController<M , PK>{

}
