package com.zz.bms.system.service;

import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.system.bo.TsMyShortcutBO;


/**
* 置顶快捷菜单 Service
* @author Administrator
* @date 2019-4-10 11:08:51
*/
public interface TsMyShortcutService extends BaseService<TsMyShortcutBO , String> {

    public void saveAll(String[] menuIds , String userId) ;
}
