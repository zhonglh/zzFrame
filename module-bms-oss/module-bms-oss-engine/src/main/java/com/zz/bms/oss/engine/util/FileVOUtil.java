package com.zz.bms.oss.engine.util;

import com.zz.bms.oss.base.entity.TsFilesEntity;
import com.zz.bms.oss.base.logic.vo.FileVO;

/**
 * @author Administrator
 */
public class FileVOUtil {


    public static FileVO toFileVO(TsFilesEntity tsFilesEntity){
        FileVO vo = new FileVO(tsFilesEntity.getId() , tsFilesEntity.getShowName() , tsFilesEntity.getAccessUrl());
        //todo
        vo.setAccessFullUrl("");
        return vo;
    }

}
