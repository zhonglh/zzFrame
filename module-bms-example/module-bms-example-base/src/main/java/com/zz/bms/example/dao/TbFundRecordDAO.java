package com.zz.bms.example.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.example.bo.TbFundRecordBO;
import org.springframework.stereotype.Repository;

/**
* 基金备案 操作DAO
* @author Administrator
* @date 2019-5-8 13:19:35
*/
@Repository
public interface TbFundRecordDAO extends BaseDAO<TbFundRecordBO , String> {

}
