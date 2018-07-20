package com.zz.bms.oss.engine.util;

import com.zz.bms.oss.base.entity.TsFilesEntity;
import com.zz.bms.oss.base.entity.VsFilesUseEntity;
import com.zz.bms.oss.base.logic.vo.FileVO;

/**
 * @author Administrator
 */
public class FileVOUtil {


    public static FileVO toFileVO(TsFilesEntity tsFilesEntity){
        //todo shwoName
        FileVO vo = new FileVO(tsFilesEntity.getId() , tsFilesEntity.getFileSize() , "" , tsFilesEntity.getAccessUrl());
        //todo  accessFullUrl
        vo.setAccessFullUrl("");
        return vo;
    }

    public static void toVsFileUser(VsFilesUseEntity vsFilesUseEntity, TsFilesEntity one) {
        vsFilesUseEntity.setMd5(one.getMd5());
        vsFilesUseEntity.setAccessUrl(one.getAccessUrl());
        vsFilesUseEntity.setContentType(one.getContentType());
        vsFilesUseEntity.setFileEngine(one.getFileEngine());
        vsFilesUseEntity.setFileHost(one.getFileHost());
        vsFilesUseEntity.setFileName(one.getFileName());
        vsFilesUseEntity.setFilePath(one.getFilePath());
        vsFilesUseEntity.setFileSize(one.getFileSize());
        vsFilesUseEntity.setFileSuffix(one.getFileSuffix());
        vsFilesUseEntity.setUseFrequency(one.getUseFrequency());
        vsFilesUseEntity.setFileId(one.getId());
    }
}
