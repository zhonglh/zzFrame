package com.zz.bms.oss.engine.engine;

import com.zz.bms.core.enums.EnumErrorMsg;
import com.zz.bms.oss.engine.enums.EnumFileType;
import com.zz.bms.oss.vo.FileVO;
import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.tools.ant.util.DateUtils;

import java.io.File;
import java.nio.file.Path;
import java.util.Date;
import java.util.UUID;

/**
 * @author Administrator
 */
public abstract class AbstractEngine implements StorageProcess {


    @Override
    public Path getTargetPath(String filename) {
        return null;
    }


    @Override
    public FileVO store(byte[] bs , String filename  , EnumFileType enumFileType){
        throw EnumErrorMsg.code_error.toException();
    }


}
