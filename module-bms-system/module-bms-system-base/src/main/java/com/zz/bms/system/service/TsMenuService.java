package com.zz.bms.system.service;

import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.system.bo.TsMenuBO;

import java.util.List;


/**
* 菜单 Service
* @author Administrator
* @date 2019-4-10 11:08:55
*/
public interface TsMenuService extends BaseService<TsMenuBO , String> {
    public List<TsMenuBO> getAllMenu(TsMenuBO tsMenuBO);
}
