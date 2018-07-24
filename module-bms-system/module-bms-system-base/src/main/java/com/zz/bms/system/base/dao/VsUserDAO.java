package com.zz.bms.system.base.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.system.base.bo.VsUserBO;
import com.zz.bms.system.base.entity.VsUserEntity;
import org.springframework.stereotype.Repository;


/**
 * 用户视图操作DAO
 * @author Administrator
 */
@Repository
public interface VsUserDAO extends BaseDAO<VsUserBO, String> {
}
