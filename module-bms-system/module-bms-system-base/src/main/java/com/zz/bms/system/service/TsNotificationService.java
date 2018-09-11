package com.zz.bms.system.service;

import com.zz.bms.core.db.base.service.BaseService;
import com.zz.bms.system.bo.TsNotificationBO;

import java.util.List;
import java.util.Map;


/**
* 系统通知 Service
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public interface TsNotificationService extends BaseService<TsNotificationBO , String> {

    /**
     * 获取通知未读数
     * @param userIds
     * @return
     */
    List<Map<String,Object>> getUserNotReadCount(String[] userIds);

}
