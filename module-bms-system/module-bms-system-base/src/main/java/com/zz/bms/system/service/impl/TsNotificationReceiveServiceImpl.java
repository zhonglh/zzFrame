package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.enums.EnumDictType;
import com.zz.bms.system.bo.TsDictBO;
import com.zz.bms.system.bo.TsNotificationReceiveBO;
import com.zz.bms.system.bo.TsUserBO;
import com.zz.bms.system.dao.TsNotificationReceiveDAO;
import com.zz.bms.system.dao.TsUserDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.TsNotificationReceiveService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 通知接收人 ServiceImpl
* @author Administrator
* @date 2019-4-10 18:25:15
*/
@Service
public class TsNotificationReceiveServiceImpl extends SystemBaseServiceImpl<TsNotificationReceiveBO,String> implements TsNotificationReceiveService {



	@Autowired
	private TsDictService tsDictService;



    @Autowired
    private TsUserDAO tsUserDAO;


    @Autowired
    private TsNotificationReceiveDAO tsNotificationReceiveDAO ;



    @Override
    public BaseDAO getDAO() {
    	return tsNotificationReceiveDAO ;
    }



	@Override
	public TsNotificationReceiveBO processResult(TsNotificationReceiveBO tsNotificationReceiveBO) {


		if(StringUtils.isNotEmpty( tsNotificationReceiveBO.getReceiveUserId())){
			TsUserBO temp = tsUserDAO.selectById( tsNotificationReceiveBO.getReceiveUserId() );
			if(temp != null){
				tsNotificationReceiveBO.setReceiveUserName(temp.getUserName());
			}
		}
		try {
			if(StringUtils.isEmpty(tsNotificationReceiveBO.getIsReadName()) && StringUtils.isNotEmpty(tsNotificationReceiveBO.getIsRead()) ) {
				String dictName = tsDictService.getDictName(tsNotificationReceiveBO.getIsRead(),EnumDictType.YES_NO.getVal());
				tsNotificationReceiveBO.setIsReadName(dictName);
			}
		}catch(Exception e){

		}

		return tsNotificationReceiveBO;

	}





	@Override
	public List<TsNotificationReceiveBO> processResult(List<TsNotificationReceiveBO> tsNotificationReceiveBOs) {
		if(tsNotificationReceiveBOs == null || tsNotificationReceiveBOs.isEmpty()){
			return tsNotificationReceiveBOs;
		}

		List<String> receiveUserIdList = new ArrayList<String>();

		for(TsNotificationReceiveBO bo : tsNotificationReceiveBOs)		{

			if(StringUtils.isNotEmpty( bo.getReceiveUserId())){
				receiveUserIdList.add(bo.getReceiveUserId());
			}
		}


		if(!receiveUserIdList.isEmpty()){
			List<TsUserBO> list =  tsUserDAO.selectBatchIds(receiveUserIdList);
			Map<String,TsUserBO> map = EntityUtil.list2Map(list);

			tsNotificationReceiveBOs.forEach(tsNotificationReceiveBO -> {
				if(StringUtils.isNotEmpty( tsNotificationReceiveBO.getReceiveUserId())){
					TsUserBO temp = map.get( tsNotificationReceiveBO.getReceiveUserId() );
					if(temp != null){
							tsNotificationReceiveBO.setReceiveUserName(temp.getUserName());
					}
				}
			});
		}





		String[] dictTypes = new String[]{EnumDictType.YES_NO.getVal()};
		Map<String , TsDictBO> dictMap = tsDictService.allDict(dictTypes);

		tsNotificationReceiveBOs.forEach(tsNotificationReceiveBO -> {
			if(StringUtils.isEmpty(tsNotificationReceiveBO.getIsReadName()) && StringUtils.isNotEmpty(tsNotificationReceiveBO.getIsRead()) ) {
				TsDictBO dict = dictMap.get(EnumDictType.YES_NO.getVal() + tsNotificationReceiveBO.getIsRead());
				if(dict != null) {
					tsNotificationReceiveBO.setIsReadName(dict.getDictName());
				}
			}
		});



		return tsNotificationReceiveBOs;
	}




	@Override
	public void isExist(TsNotificationReceiveBO tsNotificationReceiveBO) {
	}


}