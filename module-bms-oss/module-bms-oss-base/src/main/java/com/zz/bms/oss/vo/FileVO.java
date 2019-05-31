package com.zz.bms.oss.vo;

import java.io.File;
import java.io.Serializable;

/**
 * @author admin
 */
public class FileVO implements Serializable {


    private String  accessUrlPrefix ;
    private String  accessUrl ;
    private String  fileBasePath ;
    private String  filePath ;
    private String  fileName ;


    private String  fileHost ;

    public String getAccessUrlPrefix() {
        return accessUrlPrefix;
    }

    public void setAccessUrlPrefix(String accessUrlPrefix) {
        this.accessUrlPrefix = accessUrlPrefix;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getFileHost() {
        return fileHost;
    }

    public void setFileHost(String fileHost) {
        this.fileHost = fileHost;
    }

    public String getFileBasePath() {
        return fileBasePath;
    }

    public void setFileBasePath(String fileBasePath) {
        this.fileBasePath = fileBasePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
