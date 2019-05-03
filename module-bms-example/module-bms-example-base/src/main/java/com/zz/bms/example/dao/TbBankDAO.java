package com.zz.bms.example.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.example.bo.TbBankBO;
import org.springframework.stereotype.Repository;

/**
* 银行信息 操作DAO
* @author Administrator
* @date 2019-5-3 10:40:30
*/
@Repository
public interface TbBankDAO extends BaseDAO<TbBankBO , String> {

}