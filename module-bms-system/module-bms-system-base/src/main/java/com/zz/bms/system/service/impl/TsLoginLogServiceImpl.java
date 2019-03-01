package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.enums.EnumDictType;
import com.zz.bms.system.bo.TsDepBO;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.TsLoginLogBO;
import com.zz.bms.system.dao.TsDepDAO;
import com.zz.bms.system.dao.TsLoginLogDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.TsLoginLogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 登陆日志 ServiceImpl
* @author Administrator
* @date 2019-4-10 18:25:15
*/
@Service
public class TsLoginLogServiceImpl extends SystemBaseServiceImpl<TsLoginLogBO,String> implements TsLoginLogService {



	@Autowired
	private TsDictService tsDictService;



    @Autowired
    private TsDepDAO tsDepDAO;


    @Autowired
    private TsLoginLogDAO tsLoginLogDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tsLoginLogDAO ;
    }



	@Override
	public TsLoginLogBO processResult(TsLoginLogBO tsLoginLogBO) {

		try {
			if(StringUtils.isEmpty(tsLoginLogBO.getOperationTypeName()) && StringUtils.isNotEmpty(tsLoginLogBO.getOperationType()) ) {
				String dictName = tsDictService.getDictName(tsLoginLogBO.getOperationType(),EnumDictType.OPERATION_TYPE.getVal());
				tsLoginLogBO.setOperationTypeName(dictName);
			}
		}catch(Exception e){

		}

		if(StringUtils.isNotEmpty( tsLoginLogBO.getDepId())){
			TsDepBO temp = tsDepDAO.selectById( tsLoginLogBO.getDepId() );
			if(temp != null){
				tsLoginLogBO.setDepName(temp.getDepName());
			}
		}

		return tsLoginLogBO;

	}





	@Override
	public List<TsLoginLogBO> processResult(List<TsLoginLogBO> tsLoginLogBOs) {
		if(tsLoginLogBOs == null || tsLoginLogBOs.isEmpty()){
			return tsLoginLogBOs;
		}

		List<String> depIdList = new ArrayList<String>();

		for(TsLoginLogBO bo : tsLoginLogBOs)		{

			if(StringUtils.isNotEmpty( bo.getDepId())){
				depIdList.add(bo.getDepId());
			}
		}


		if(!depIdList.isEmpty()){
			List<TsDepBO> list =  tsDepDAO.selectBatchIds(depIdList);
			Map<String,TsDepBO> map = EntityUtil.list2Map(list);

			tsLoginLogBOs.forEach(tsLoginLogBO -> {
				if(StringUtils.isNotEmpty( tsLoginLogBO.getDepId())){
					TsDepBO temp = map.get( tsLoginLogBO.getDepId() );
					if(temp != null){
							tsLoginLogBO.setDepName(temp.getDepName());
					}
				}
			});
		}





		String[] dictTypes = new String[]{EnumDictType.OPERATION_TYPE.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tsLoginLogBOs.forEach(tsLoginLogBO -> {
			if(StringUtils.isEmpty(tsLoginLogBO.getOperationTypeName()) && StringUtils.isNotEmpty(tsLoginLogBO.getOperationType()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.OPERATION_TYPE.getVal() + tsLoginLogBO.getOperationType());
				if(dict != null) {
					tsLoginLogBO.setOperationTypeName(dict.getDictName());
				}
			}
		});



		return tsLoginLogBOs;
	}




	@Override
	public void isExist(TsLoginLogBO tsLoginLogBO) {
	}


}