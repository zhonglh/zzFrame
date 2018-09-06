package com.zz.bms.system.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.system.bo.TsUserRoleBO;
import org.springframework.stereotype.Repository;

/**
* 用户角色关联 操作DAO
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Repository
public interface TsUserRoleDAO extends BaseDAO<TsUserRoleBO , String> {

}
