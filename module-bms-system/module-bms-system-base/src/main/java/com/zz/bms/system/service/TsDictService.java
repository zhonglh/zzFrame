package com.zz.bms.system.service;

import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.system.bo.TsDictBO;


/**
* 字典信息 Service
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public interface TsDictService extends BaseService<TsDictBO , String> {

    /**
     * 获取字典名称
     * @param value         字典值
     * @param dictType      字典类型
     * @return
     */
    public String getDictName(String value , String dictType) ;


    /**
     * 获取字典值
     * @param name         字典名称
     * @param dictType      字典类型
     * @return
     */
    public String getDictValue(String name , String dictType) ;

}
