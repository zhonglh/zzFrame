package com.zz.bms.system.service;

import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.system.bo.TsNotificationBO;

import java.util.List;
import java.util.Map;


/**
* 系统通知 Service
* @author Administrator
* @date 2019-4-10 11:08:51
*/
public interface TsNotificationService extends BaseService<TsNotificationBO , String> {

    /**
     * 获取通知未读数
     * @param userIds
     * @return
     */
    List<Map<String,Object>> getUserNotReadCount(String[] userIds);
}
