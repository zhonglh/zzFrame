package com.zz.bms.example.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.example.bo.TbFundAccountBO;
import org.springframework.stereotype.Repository;

/**
* 基金账户 操作DAO
* @author Administrator
* @date 2019-5-1 17:49:19
*/
@Repository
public interface TbFundAccountDAO extends BaseDAO<TbFundAccountBO , String> {

}