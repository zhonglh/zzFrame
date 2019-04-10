package com.zz.bms.system.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.system.bo.TsNotificationBO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
* 系统通知 操作DAO
* @author Administrator
* @date 2019-4-10 11:08:51
*/
@Repository
public interface TsNotificationDAO extends BaseDAO<TsNotificationBO , String> {
	
	
    /**
     *
     * @param userIds
     * @return
     */
    public List<Map<String,Object>> getUserNotReadCount(String[] userIds);

}
