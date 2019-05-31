package com.zz.bms.oss.vo;

import com.zz.bms.system.bo.TsFileBO;
import com.zz.bms.system.bo.TsFileUseBO;

/**
 * @author admin
 */
public class FileUseVO {
    private TsFileBO tsFileBO ;
    private TsFileUseBO tsFileUseBO;

    public FileUseVO() {
    }

    public FileUseVO(TsFileBO tsFileBO, TsFileUseBO tsFileUseBO) {
        this.tsFileBO = tsFileBO;
        this.tsFileUseBO = tsFileUseBO;
    }

    public TsFileBO getTsFileBO() {
        return tsFileBO;
    }

    public void setTsFileBO(TsFileBO tsFileBO) {
        this.tsFileBO = tsFileBO;
    }

    public TsFileUseBO getTsFileUseBO() {
        return tsFileUseBO;
    }

    public void setTsFileUseBO(TsFileUseBO tsFileUseBO) {
        this.tsFileUseBO = tsFileUseBO;
    }
}
