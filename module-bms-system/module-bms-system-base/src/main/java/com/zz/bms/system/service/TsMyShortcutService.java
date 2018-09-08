package com.zz.bms.system.service;

import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.system.bo.TsMyShortcutBO;

import java.io.Serializable;


/**
* 置顶快捷菜单 Service
* @author Administrator
* @date 2018-9-8 12:42:41
*/
public interface TsMyShortcutService extends BaseService<TsMyShortcutBO , String> {

    public void saveAll(String[] menuIds , String userId) ;

}
