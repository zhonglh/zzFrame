package com.zz.bms.example.dao;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.example.bo.TbInvestorBO;
import org.springframework.stereotype.Repository;

/**
* 投资人 操作DAO
* @author Administrator
* @date 2019-5-2 18:36:09
*/
@Repository
public interface TbInvestorDAO extends BaseDAO<TbInvestorBO , String> {

}
