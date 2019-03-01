package com.zz.bms.system.service.impl;

import com.zz.bms.core.db.base.dao.BaseDAO;
import com.zz.bms.core.db.entity.EntityUtil;
import com.zz.bms.system.bo.TsFileBO;
import com.zz.bms.system.bo.TsFileUseBO;
import com.zz.bms.system.dao.TsFileDAO;
import com.zz.bms.system.dao.TsFileUseDAO;
import com.zz.bms.system.service.TsDictService;
import com.zz.bms.system.service.TsFileUseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 文件使用 ServiceImpl
 * @author Administrator
 * @date 2019-4-10 18:25:11
 */
@Service
public class TsFileUseServiceImpl extends SystemBaseServiceImpl<TsFileUseBO,String> implements TsFileUseService {



	@Autowired
	private TsDictService tsDictService;



	@Autowired
	private TsFileDAO tsFileDAO;


	@Autowired
	private TsFileUseDAO tsFileUseDAO ;



	@Override
	public BaseDAO getDAO() {
		return tsFileUseDAO ;
	}



	@Override
	public TsFileUseBO processResult(TsFileUseBO tsFileUseBO) {


		if(StringUtils.isNotEmpty( tsFileUseBO.getFileId())){
			TsFileBO temp = tsFileDAO.selectById( tsFileUseBO.getFileId() );
			if(temp != null){
				tsFileUseBO.setFileName(temp.getFileName());
			}
		}

		return tsFileUseBO;

	}





	@Override
	public List<TsFileUseBO> processResult(List<TsFileUseBO> tsFileUseBOs) {
		if(tsFileUseBOs == null || tsFileUseBOs.isEmpty()){
			return tsFileUseBOs;
		}

		List<String> fileIdList = new ArrayList<String>();

		for(TsFileUseBO bo : tsFileUseBOs)		{

			if(StringUtils.isNotEmpty( bo.getFileId())){
				fileIdList.add(bo.getFileId());
			}
		}


		if(!fileIdList.isEmpty()){
			List<TsFileBO> list =  tsFileDAO.selectBatchIds(fileIdList);
			Map<String,TsFileBO> map = EntityUtil.list2Map(list);

			tsFileUseBOs.forEach(tsFileUseBO -> {
				if(StringUtils.isNotEmpty( tsFileUseBO.getFileId())){
					TsFileBO temp = map.get( tsFileUseBO.getFileId() );
					if(temp != null){
						tsFileUseBO.setFileName(temp.getFileName());
					}
				}
			});
		}








		return tsFileUseBOs;
	}




	@Override
	public void isExist(TsFileUseBO tsFileUseBO) {
	}


}