package com.zz.bms.example.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.example.bo.TbFundBO;
import org.springframework.stereotype.Repository;

/**
* 基金 操作DAO
* @author Administrator
* @date 2019-6-3 10:12:55
*/
@Repository
public interface TbFundDAO extends BaseDAO<TbFundBO , String> {

}
