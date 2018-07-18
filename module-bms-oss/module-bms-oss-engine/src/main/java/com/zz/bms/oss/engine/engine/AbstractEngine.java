package com.zz.bms.oss.engine.engine;

import com.zz.bms.util.base.java.IdUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.tools.ant.util.DateUtils;

import java.util.Date;
import java.util.UUID;

/**
 * @author Administrator
 */
public abstract class AbstractEngine implements StorageProcess {


    /**
     * 获取路径
     * @param prefix
     * @return
     */
    @Override
    public String getPath(String prefix) {
        Date currDate = new Date();
        StringBuilder sb = new StringBuilder();


        if (StringUtils.isNotEmpty(prefix)) {
            sb.append(prefix);
        }


        //生成uuid
        String uuid = IdUtils.getId();
        //文件路径
        sb.append("/").append(DateUtils.format(currDate, "yyyyMMdd"));
        sb.append("/").append(DateUtils.format(currDate, "HHmmssS"));
        sb.append(uuid);

        return sb.toString();
    }


}
