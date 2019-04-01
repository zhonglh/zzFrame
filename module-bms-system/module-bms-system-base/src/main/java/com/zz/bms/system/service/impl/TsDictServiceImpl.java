package com.zz.bms.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.base.service.impl.BaseServiceImpl;


import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.core.exceptions.DbException;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.dao.TsDictDAO;
import com.zz.bms.system.service.TsDictService;

import com.zz.bms.system.bo.TsDictTypeBO;
import com.zz.bms.system.dao.TsDictTypeDAO;
import com.zz.bms.system.bo.TsTenantBO;
import com.zz.bms.system.dao.TsTenantDAO;

import com.zz.bms.util.base.data.SqlKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* 字典信息 ServiceImpl
* @author Administrator
* @date 2018-9-6 23:56:30
*/
@Service
public class TsDictServiceImpl extends BaseServiceImpl<TsDictBO,String> implements TsDictService {



    @Autowired
    private TsDictTypeDAO tsDictTypeDAO;
    @Autowired
    private TsTenantDAO tsTenantDAO;


	@Autowired
	private TsDictDAO tsDictDAO ;

	@Override
	public BaseDAO getQueryDAO() {
		return tsDictDAO ;
	}

	@Override
	public BaseDAO getRwDAO() {
		return tsDictDAO ;
	}



	@Override
	public String getDictName(String value , String dictType) {
		if(value == null || dictType == null){
			return "";
		}

		QueryWrapper<TsDictBO> queryWrapper = new QueryWrapper<TsDictBO>();
		queryWrapper.lambda().eq(TsDictBO::getDictVal ,  value)
				.inSql(TsDictBO::getDictTypeId , "select id from ts_dict_type where dict_type_code = '"+dictType+"'");
		TsDictBO tsDictBO = tsDictDAO.selectOne(queryWrapper);
		if(tsDictBO == null){
			return "";
		}else {
			return tsDictBO.getDictName();
		}
	}




	@Override
	public String getDictValue(String name , String dictType) {

		if(name == null || dictType == null){
			return null;
		}

		QueryWrapper<TsDictBO> queryWrapper = new QueryWrapper<TsDictBO>();
		queryWrapper.lambda().eq(TsDictBO::getDictName ,  name)
				.inSql(TsDictBO::getDictTypeId , "select id from ts_dict_type where dict_type_code = '"+dictType+"'");
		TsDictBO tsDictBO = tsDictDAO.selectOne(queryWrapper);
		if(tsDictBO == null){
			return null;
		}else {
			return tsDictBO.getDictVal();
		}
	}


	/**
	 * 根据字典类型获取字典信息
	 * @param dictTypes
	 * @return
	 */
	@Override
	public Map<String , TsDictBO> allDict(String ... dictTypes) {

		Map<String , TsDictBO> result = new HashMap<String , TsDictBO>();
		if(dictTypes == null || dictTypes.length == 0){
			return result;
		}

		List<TsDictTypeBO> dictTypeBOS = tsDictTypeDAO.selectList(Wrappers.emptyWrapper());
		if(dictTypeBOS == null || dictTypeBOS.isEmpty()){
			return result;
		}
		Map<String,TsDictTypeBO> dictTypeBOMap = new HashMap<String,TsDictTypeBO>();
		for(TsDictTypeBO dictTypeBO : dictTypeBOS){
			dictTypeBOMap.put(dictTypeBO.getId() , dictTypeBO);
		}


		QueryWrapper<TsDictBO> queryWrapper = new QueryWrapper<TsDictBO>();
		queryWrapper.inSql("dict_type_id" , " select id from ts_dict_type where dict_type_code in ("+ SqlKit.toInContent(dictTypes)+") " );
		List<TsDictBO> dictBOS = tsDictDAO.selectList(queryWrapper);
		if(dictBOS == null || dictBOS.isEmpty()){
			return result;
		}
		for(TsDictBO dictBO : dictBOS){
			TsDictTypeBO dictTypeBO = dictTypeBOMap.get(dictBO.getDictTypeId());
			if(dictTypeBO != null){
				dictBO.setDictTypeCode(dictTypeBO.getDictTypeCode());
			}
			String key = dictBO.getDictTypeCode()+dictBO.getDictVal();
			result.put(key ,dictBO);
			key = dictBO.getDictTypeCode()+dictBO.getDictName();
			result.put(key ,dictBO);
		}

		return result;

	}




	@Override
	public Map<String , List<TsDictBO>> allDicts(String ... dictTypes){

		Map<String , List<TsDictBO>> result = new HashMap<String , List<TsDictBO>>();
		if(dictTypes == null || dictTypes.length == 0){
			return result;
		}

		List<TsDictTypeBO> dictTypeBOS = tsDictTypeDAO.selectList(Wrappers.emptyWrapper());
		if(dictTypeBOS == null || dictTypeBOS.isEmpty()){
			return result;
		}
		Map<String,TsDictTypeBO> dictTypeBOMap = new HashMap<String,TsDictTypeBO>();
		for(TsDictTypeBO dictTypeBO : dictTypeBOS){
			dictTypeBOMap.put(dictTypeBO.getId() , dictTypeBO);
		}



		QueryWrapper<TsDictBO> queryWrapper = new QueryWrapper<TsDictBO>();
		queryWrapper.inSql("dict_type_id" , " select id from ts_dict_type where dict_type_code in ("+ SqlKit.toInContent(dictTypes)+") " );
		List<TsDictBO> dictBOS = tsDictDAO.selectList(queryWrapper);
		if(dictBOS == null || dictBOS.isEmpty()){
			return result;
		}
		for(TsDictBO dictBO : dictBOS){
			TsDictTypeBO dictTypeBO = dictTypeBOMap.get(dictBO.getDictTypeId());
			if(dictTypeBO != null){
				dictBO.setDictTypeCode(dictTypeBO.getDictTypeCode());
			}else {
				continue;
			}

			List<TsDictBO> list = result.get(dictBO.getDictTypeCode());
			if(list == null){
				list = new ArrayList<TsDictBO>();
				list.add(dictBO);
			}
		}

		return result;



	}


	@Override
	public void isExist(TsDictBO tsDictBO) {

		TsDictBO ckBO ;
		BaseEntity temp = null ;

		ckBO = new TsDictBO();
		ckBO.setId( tsDictBO.getId() );
		ckBO.setDictTypeId(tsDictBO.getDictTypeId());
		ckBO.setDictVal(tsDictBO.getDictVal());
		ckBO.setTenantId(tsDictBO.getTenantId());
		temp = this.selectCheck(ckBO);
		if (EntityUtil.isEntityExist(temp)) {
			throw DbException.DB_SAVE_SAME;
		}

	}
}