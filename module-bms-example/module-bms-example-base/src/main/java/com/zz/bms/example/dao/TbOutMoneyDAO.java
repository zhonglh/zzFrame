package com.zz.bms.example.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.example.bo.TbOutMoneyBO;
import org.springframework.stereotype.Repository;

/**
* 出资明细 操作DAO
* @author Administrator
* @date 2019-5-2 18:36:08
*/
@Repository
public interface TbOutMoneyDAO extends BaseDAO<TbOutMoneyBO , String> {

}
