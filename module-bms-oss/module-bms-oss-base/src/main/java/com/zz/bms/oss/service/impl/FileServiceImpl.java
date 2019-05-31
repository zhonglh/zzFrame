package com.zz.bms.oss.service.impl;

import com.zz.bms.oss.service.FileService;
import com.zz.bms.oss.vo.FileUseVO;
import com.zz.bms.system.dao.TsFileDAO;
import com.zz.bms.system.dao.TsFileUseDAO;
import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



/**
 * @author admin
 */
@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private TsFileUseDAO tsFileUseDAO ;

    @Autowired
    private TsFileDAO tsFileDAO;


    @Override
    public void saveFiles(List<FileUseVO> fileUseVOs) {
        for(FileUseVO fileUseVO : fileUseVOs){
            if(StringUtils.isEmpty(fileUseVO.getTsFileBO().getId())){
                fileUseVO.getTsFileBO().setId(IdUtils.getId());
                fileUseVO.getTsFileBO().setUseFrequency(1);
                tsFileDAO.insert(fileUseVO.getTsFileBO());
            }else {
                fileUseVO.getTsFileBO().setUseFrequency(fileUseVO.getTsFileBO().getUseFrequency() + 1);
                tsFileDAO.updateById(fileUseVO.getTsFileBO());
            }

            if(StringUtils.isEmpty(fileUseVO.getTsFileUseBO().getId())){
                fileUseVO.getTsFileUseBO().setId(IdUtils.getId());
            }
            fileUseVO.getTsFileUseBO().setFileId(fileUseVO.getTsFileBO().getId());
            tsFileUseDAO.insert(fileUseVO.getTsFileUseBO());
        }
    }
}
