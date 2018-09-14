package com.zz.bms.controller.base.controller;

import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.Query;

import java.io.Serializable;


/**
 * zz 专用 base controller
 * 其它项目可以按照需求， 重新设计一个base controller
 *
 *
 * @param <M>
 * @param <PK>
 * @param <Q>
 */
public abstract class ZzDefaultController<M extends BaseEntity<PK>, PK extends Serializable , Q extends Query >   extends BaseCURDController<M , PK , Q>{


    private String addPageName = "addForm";

    /**
     * 获取增加界面的 jsp 名称 , 不包括路径
     * 增加和修改页面不是用同一个页面，所以 重写了 getAddPageName
     * @return
     */
    @Override
    protected String getAddPageName(){
        return addPageName;
    }
}
