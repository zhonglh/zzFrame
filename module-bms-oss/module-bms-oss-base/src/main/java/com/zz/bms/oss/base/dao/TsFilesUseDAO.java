package com.zz.bms.oss.base.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.oss.base.entity.TsFilesUseEntity;
import org.springframework.stereotype.Repository;


/**
 * 文件使用表操作DAO
 * @author Administrator
 */
@Repository
public interface TsFilesUseDAO extends BaseDAO<TsFilesUseEntity, String> {
}
