package com.zz.bms.system.base.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.system.base.entity.TsUserEntity;
import org.springframework.stereotype.Repository;


/**
 * 用户表操作DAO
 * @author Administrator
 */
@Repository
public interface TsUserDAO extends BaseDAO<TsUserEntity , String> {
}
