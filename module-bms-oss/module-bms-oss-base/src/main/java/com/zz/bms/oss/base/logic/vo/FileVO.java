package com.zz.bms.oss.base.logic.vo;

import java.io.Serializable;

/**
 * 返回的文件对象
 * @author Administrator
 */
public class FileVO implements Serializable {

    String id;

    long fileSize;

    String showName;

    String accessUrl;


    /**
     * 访问路径(全路径)
     */
    String accessFullUrl;



    public FileVO(String id, long fileSize, String showName, String accessUrl) {
        this.id = id;
        this.showName = showName;
        this.fileSize = fileSize;
        this.accessUrl = accessUrl;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getAccessFullUrl() {
        return accessFullUrl;
    }

    public void setAccessFullUrl(String accessFullUrl) {
        this.accessFullUrl = accessFullUrl;
    }
}
