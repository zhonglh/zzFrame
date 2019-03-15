package com.zz.bms.system.controller;

import com.zz.bms.controller.base.controller.BaseExcelController;
import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.service.TsDictService;

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
public abstract class ZzDefaultController<M extends BaseEntity<PK>, PK extends Serializable , Q extends Query >
            extends BaseExcelController<M , PK , Q> {



    private TsDictService tsDictService;

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

    @Override
    protected Map<String, ?> getDictMaps(String... dictTypes) {
        return tsDictService.allDict(dictTypes);
    }

    @Override
    protected String getDictVal(Object dict) {
        TsDictBO dictBO = (TsDictBO)dict;
        return dictBO.getDictVal();
    }

    @Override
    protected String getDictName(Object dict) {
        TsDictBO dictBO = (TsDictBO)dict;
        return dictBO.getDictName();
    }
}
