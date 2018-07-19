package com.zz.bms.oss.base.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.oss.base.entity.TsFilesUseEntity;
import com.zz.bms.oss.base.entity.VsFilesUseEntity;
import org.springframework.stereotype.Repository;


/**
 * 文件使用视图操作DAO
 * @author Administrator
 */
@Repository
public interface VsFilesUseDAO extends BaseDAO<VsFilesUseEntity, String> {
}
