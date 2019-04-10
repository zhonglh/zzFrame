package com.zz.bms.system.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.system.bo.TsLoginLogBO;
import org.springframework.stereotype.Repository;

/**
* 登陆日志 操作DAO
* @author Administrator
* @date 2019-4-10 11:08:55
*/
@Repository
public interface TsLoginLogDAO extends BaseDAO<TsLoginLogBO , String> {

}
