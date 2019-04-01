package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 文件 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class TsFileQueryWebImpl<PK extends Serializable> extends TsFileAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String accessUrlPrefix_IN;
            private String accessUrlPrefix_NOTIN;



            private String accessUrl_IN;
            private String accessUrl_NOTIN;



            private String fileHost_IN;
            private String fileHost_NOTIN;



            private String filePath_IN;
            private String filePath_NOTIN;



            private String fileName_IN;
            private String fileName_NOTIN;




        //todo BIGINT fileSize;


            private String fileSuffix_IN;
            private String fileSuffix_NOTIN;


            private String fileEngine_IN;
            private String fileEngine_NOTIN;




            private String md5_IN;
            private String md5_NOTIN;



            private String contentType_IN;
            private String contentType_NOTIN;




        //todo INT useFrequency;


            private String deleteFlag_IN;
            private String deleteFlag_NOTIN;



            private String createUserId_IN;
            private String createUserId_NOTIN;



            private String createUserName_IN;
            private String createUserName_NOTIN;




        //todo TIMESTAMP createTime;


            private String updateUserId_IN;
            private String updateUserId_NOTIN;



            private String updateUserName_IN;
            private String updateUserName_NOTIN;




        //todo TIMESTAMP updateTime;



        //todo INT versionNo;




            public PK getId() {
                return id;
            }

            public void setId(PK id) {
                this.id = id;
            }

            public PK getId_NE() {
                return id_NE;
            }

            public void setId_NE(PK id_NE) {
                this.id_NE = id_NE;
            }

            public PK getId_IN() {
                return id_IN;
            }

            public void setId_IN(PK id_IN) {
                this.id_IN = id_IN;
            }

            public PK getId_NOTIN() {
                return id_NOTIN;
            }

            public void setId_NOTIN(PK id_NOTIN) {
                this.id_NOTIN = id_NOTIN;
            }



            public String getAccessUrlPrefix() {
                return accessUrlPrefix;
            }

            public void setAccessUrlPrefix(String accessUrlPrefix) {
                this.accessUrlPrefix = accessUrlPrefix;
            }

            public String getAccessUrlPrefix_NE() {
                return accessUrlPrefix_NE;
            }

            public void setAccessUrlPrefix_NE(String accessUrlPrefix_NE) {
                this.accessUrlPrefix_NE = accessUrlPrefix_NE;
            }

            public String getAccessUrlPrefix_IN() {
                return accessUrlPrefix_IN;
            }

            public void setAccessUrlPrefix_IN(String accessUrlPrefix_IN) {
                this.accessUrlPrefix_IN = accessUrlPrefix_IN;
            }

            public String getAccessUrlPrefix_NOTIN() {
                return accessUrlPrefix_NOTIN;
            }

            public void setAccessUrlPrefix_NOTIN(String accessUrlPrefix_NOTIN) {
                this.accessUrlPrefix_NOTIN = accessUrlPrefix_NOTIN;
            }

            public String getAccessUrlPrefix_LIKE() {
                return accessUrlPrefix_LIKE;
            }

            public void setAccessUrlPrefix_LIKE(String accessUrlPrefix_LIKE) {
                this.accessUrlPrefix_LIKE = accessUrlPrefix_LIKE;
            }

            public String getAccessUrlPrefix_NOTLIKE() {
                return accessUrlPrefix_NOTLIKE;
            }

            public void setAccessUrlPrefix_NOTLIKE(String accessUrlPrefix_NOTLIKE) {
                this.accessUrlPrefix_NOTLIKE = accessUrlPrefix_NOTLIKE;
            }


            public String getAccessUrl() {
                return accessUrl;
            }

            public void setAccessUrl(String accessUrl) {
                this.accessUrl = accessUrl;
            }

            public String getAccessUrl_NE() {
                return accessUrl_NE;
            }

            public void setAccessUrl_NE(String accessUrl_NE) {
                this.accessUrl_NE = accessUrl_NE;
            }

            public String getAccessUrl_IN() {
                return accessUrl_IN;
            }

            public void setAccessUrl_IN(String accessUrl_IN) {
                this.accessUrl_IN = accessUrl_IN;
            }

            public String getAccessUrl_NOTIN() {
                return accessUrl_NOTIN;
            }

            public void setAccessUrl_NOTIN(String accessUrl_NOTIN) {
                this.accessUrl_NOTIN = accessUrl_NOTIN;
            }

            public String getAccessUrl_LIKE() {
                return accessUrl_LIKE;
            }

            public void setAccessUrl_LIKE(String accessUrl_LIKE) {
                this.accessUrl_LIKE = accessUrl_LIKE;
            }

            public String getAccessUrl_NOTLIKE() {
                return accessUrl_NOTLIKE;
            }

            public void setAccessUrl_NOTLIKE(String accessUrl_NOTLIKE) {
                this.accessUrl_NOTLIKE = accessUrl_NOTLIKE;
            }


            public String getFileHost() {
                return fileHost;
            }

            public void setFileHost(String fileHost) {
                this.fileHost = fileHost;
            }

            public String getFileHost_NE() {
                return fileHost_NE;
            }

            public void setFileHost_NE(String fileHost_NE) {
                this.fileHost_NE = fileHost_NE;
            }

            public String getFileHost_IN() {
                return fileHost_IN;
            }

            public void setFileHost_IN(String fileHost_IN) {
                this.fileHost_IN = fileHost_IN;
            }

            public String getFileHost_NOTIN() {
                return fileHost_NOTIN;
            }

            public void setFileHost_NOTIN(String fileHost_NOTIN) {
                this.fileHost_NOTIN = fileHost_NOTIN;
            }

            public String getFileHost_LIKE() {
                return fileHost_LIKE;
            }

            public void setFileHost_LIKE(String fileHost_LIKE) {
                this.fileHost_LIKE = fileHost_LIKE;
            }

            public String getFileHost_NOTLIKE() {
                return fileHost_NOTLIKE;
            }

            public void setFileHost_NOTLIKE(String fileHost_NOTLIKE) {
                this.fileHost_NOTLIKE = fileHost_NOTLIKE;
            }


            public String getFilePath() {
                return filePath;
            }

            public void setFilePath(String filePath) {
                this.filePath = filePath;
            }

            public String getFilePath_NE() {
                return filePath_NE;
            }

            public void setFilePath_NE(String filePath_NE) {
                this.filePath_NE = filePath_NE;
            }

            public String getFilePath_IN() {
                return filePath_IN;
            }

            public void setFilePath_IN(String filePath_IN) {
                this.filePath_IN = filePath_IN;
            }

            public String getFilePath_NOTIN() {
                return filePath_NOTIN;
            }

            public void setFilePath_NOTIN(String filePath_NOTIN) {
                this.filePath_NOTIN = filePath_NOTIN;
            }

            public String getFilePath_LIKE() {
                return filePath_LIKE;
            }

            public void setFilePath_LIKE(String filePath_LIKE) {
                this.filePath_LIKE = filePath_LIKE;
            }

            public String getFilePath_NOTLIKE() {
                return filePath_NOTLIKE;
            }

            public void setFilePath_NOTLIKE(String filePath_NOTLIKE) {
                this.filePath_NOTLIKE = filePath_NOTLIKE;
            }


            public String getFileName() {
                return fileName;
            }

            public void setFileName(String fileName) {
                this.fileName = fileName;
            }

            public String getFileName_NE() {
                return fileName_NE;
            }

            public void setFileName_NE(String fileName_NE) {
                this.fileName_NE = fileName_NE;
            }

            public String getFileName_IN() {
                return fileName_IN;
            }

            public void setFileName_IN(String fileName_IN) {
                this.fileName_IN = fileName_IN;
            }

            public String getFileName_NOTIN() {
                return fileName_NOTIN;
            }

            public void setFileName_NOTIN(String fileName_NOTIN) {
                this.fileName_NOTIN = fileName_NOTIN;
            }

            public String getFileName_LIKE() {
                return fileName_LIKE;
            }

            public void setFileName_LIKE(String fileName_LIKE) {
                this.fileName_LIKE = fileName_LIKE;
            }

            public String getFileName_NOTLIKE() {
                return fileName_NOTLIKE;
            }

            public void setFileName_NOTLIKE(String fileName_NOTLIKE) {
                this.fileName_NOTLIKE = fileName_NOTLIKE;
            }

            public Long getFileSize() {
                return fileSize;
            }

            public void setFileSize(Long fileSize) {
                this.fileSize = fileSize;
            }

            public Long getFileSize_NE() {
                return fileSize_NE;
            }

            public void setFileSize_NE(Long fileSize_NE) {
                this.fileSize_NE = fileSize_NE;
            }

            public Long getFileSize_GT() {
                return fileSize_GT;
            }

            public void setFileSize_GT(Long fileSize_GT) {
                this.fileSize_GT = fileSize_GT;
            }

            public Long getFileSize_GE() {
                return fileSize_GE;
            }

            public void setFileSize_GE(Long fileSize_GE) {
                this.fileSize_GE = fileSize_GE;
            }

            public Long getFileSize_LT() {
                return fileSize_LT;
            }

            public void setFileSize_LT(Long fileSize_LT) {
                this.fileSize_LT = fileSize_LT;
            }

            public Long getFileSize_LE() {
                return fileSize_LE;
            }

            public void setFileSize_LE(Long fileSize_LE) {
                this.fileSize_LE = fileSize_LE;
            }



            public String getFileSuffix() {
                return fileSuffix;
            }

            public void setFileSuffix(String fileSuffix) {
                this.fileSuffix = fileSuffix;
            }

            public String getFileSuffix_NE() {
                return fileSuffix_NE;
            }

            public void setFileSuffix_NE(String fileSuffix_NE) {
                this.fileSuffix_NE = fileSuffix_NE;
            }

            public String getFileSuffix_IN() {
                return fileSuffix_IN;
            }

            public void setFileSuffix_IN(String fileSuffix_IN) {
                this.fileSuffix_IN = fileSuffix_IN;
            }

            public String getFileSuffix_NOTIN() {
                return fileSuffix_NOTIN;
            }

            public void setFileSuffix_NOTIN(String fileSuffix_NOTIN) {
                this.fileSuffix_NOTIN = fileSuffix_NOTIN;
            }

            public String getFileSuffix_LIKE() {
                return fileSuffix_LIKE;
            }

            public void setFileSuffix_LIKE(String fileSuffix_LIKE) {
                this.fileSuffix_LIKE = fileSuffix_LIKE;
            }

            public String getFileSuffix_NOTLIKE() {
                return fileSuffix_NOTLIKE;
            }

            public void setFileSuffix_NOTLIKE(String fileSuffix_NOTLIKE) {
                this.fileSuffix_NOTLIKE = fileSuffix_NOTLIKE;
            }

            public String getFileEngine() {
                return fileEngine;
            }

            public void setFileEngine(String fileEngine) {
                this.fileEngine = fileEngine;
            }

            public String getFileEngine_NE() {
                return fileEngine_NE;
            }

            public void setFileEngine_NE(String fileEngine_NE) {
                this.fileEngine_NE = fileEngine_NE;
            }

            public String getFileEngine_IN() {
                return fileEngine_IN;
            }

            public void setFileEngine_IN(String fileEngine_IN) {
                this.fileEngine_IN = fileEngine_IN;
            }

            public String getFileEngine_NOTIN() {
                return fileEngine_NOTIN;
            }

            public void setFileEngine_NOTIN(String fileEngine_NOTIN) {
                this.fileEngine_NOTIN = fileEngine_NOTIN;
            }



            public String getMd5() {
                return md5;
            }

            public void setMd5(String md5) {
                this.md5 = md5;
            }

            public String getMd5_NE() {
                return md5_NE;
            }

            public void setMd5_NE(String md5_NE) {
                this.md5_NE = md5_NE;
            }

            public String getMd5_IN() {
                return md5_IN;
            }

            public void setMd5_IN(String md5_IN) {
                this.md5_IN = md5_IN;
            }

            public String getMd5_NOTIN() {
                return md5_NOTIN;
            }

            public void setMd5_NOTIN(String md5_NOTIN) {
                this.md5_NOTIN = md5_NOTIN;
            }

            public String getMd5_LIKE() {
                return md5_LIKE;
            }

            public void setMd5_LIKE(String md5_LIKE) {
                this.md5_LIKE = md5_LIKE;
            }

            public String getMd5_NOTLIKE() {
                return md5_NOTLIKE;
            }

            public void setMd5_NOTLIKE(String md5_NOTLIKE) {
                this.md5_NOTLIKE = md5_NOTLIKE;
            }


            public String getContentType() {
                return contentType;
            }

            public void setContentType(String contentType) {
                this.contentType = contentType;
            }

            public String getContentType_NE() {
                return contentType_NE;
            }

            public void setContentType_NE(String contentType_NE) {
                this.contentType_NE = contentType_NE;
            }

            public String getContentType_IN() {
                return contentType_IN;
            }

            public void setContentType_IN(String contentType_IN) {
                this.contentType_IN = contentType_IN;
            }

            public String getContentType_NOTIN() {
                return contentType_NOTIN;
            }

            public void setContentType_NOTIN(String contentType_NOTIN) {
                this.contentType_NOTIN = contentType_NOTIN;
            }

            public String getContentType_LIKE() {
                return contentType_LIKE;
            }

            public void setContentType_LIKE(String contentType_LIKE) {
                this.contentType_LIKE = contentType_LIKE;
            }

            public String getContentType_NOTLIKE() {
                return contentType_NOTLIKE;
            }

            public void setContentType_NOTLIKE(String contentType_NOTLIKE) {
                this.contentType_NOTLIKE = contentType_NOTLIKE;
            }

            public Integer getUseFrequency() {
                return useFrequency;
            }

            public void setUseFrequency(Integer useFrequency) {
                this.useFrequency = useFrequency;
            }

            public Integer getUseFrequency_NE() {
                return useFrequency_NE;
            }

            public void setUseFrequency_NE(Integer useFrequency_NE) {
                this.useFrequency_NE = useFrequency_NE;
            }

            public Integer getUseFrequency_GT() {
                return useFrequency_GT;
            }

            public void setUseFrequency_GT(Integer useFrequency_GT) {
                this.useFrequency_GT = useFrequency_GT;
            }

            public Integer getUseFrequency_GE() {
                return useFrequency_GE;
            }

            public void setUseFrequency_GE(Integer useFrequency_GE) {
                this.useFrequency_GE = useFrequency_GE;
            }

            public Integer getUseFrequency_LT() {
                return useFrequency_LT;
            }

            public void setUseFrequency_LT(Integer useFrequency_LT) {
                this.useFrequency_LT = useFrequency_LT;
            }

            public Integer getUseFrequency_LE() {
                return useFrequency_LE;
            }

            public void setUseFrequency_LE(Integer useFrequency_LE) {
                this.useFrequency_LE = useFrequency_LE;
            }



            public String getDeleteFlag() {
                return deleteFlag;
            }

            public void setDeleteFlag(String deleteFlag) {
                this.deleteFlag = deleteFlag;
            }

            public String getDeleteFlag_NE() {
                return deleteFlag_NE;
            }

            public void setDeleteFlag_NE(String deleteFlag_NE) {
                this.deleteFlag_NE = deleteFlag_NE;
            }

            public String getDeleteFlag_IN() {
                return deleteFlag_IN;
            }

            public void setDeleteFlag_IN(String deleteFlag_IN) {
                this.deleteFlag_IN = deleteFlag_IN;
            }

            public String getDeleteFlag_NOTIN() {
                return deleteFlag_NOTIN;
            }

            public void setDeleteFlag_NOTIN(String deleteFlag_NOTIN) {
                this.deleteFlag_NOTIN = deleteFlag_NOTIN;
            }

            public String getDeleteFlag_LIKE() {
                return deleteFlag_LIKE;
            }

            public void setDeleteFlag_LIKE(String deleteFlag_LIKE) {
                this.deleteFlag_LIKE = deleteFlag_LIKE;
            }

            public String getDeleteFlag_NOTLIKE() {
                return deleteFlag_NOTLIKE;
            }

            public void setDeleteFlag_NOTLIKE(String deleteFlag_NOTLIKE) {
                this.deleteFlag_NOTLIKE = deleteFlag_NOTLIKE;
            }


            public String getCreateUserId() {
                return createUserId;
            }

            public void setCreateUserId(String createUserId) {
                this.createUserId = createUserId;
            }

            public String getCreateUserId_NE() {
                return createUserId_NE;
            }

            public void setCreateUserId_NE(String createUserId_NE) {
                this.createUserId_NE = createUserId_NE;
            }

            public String getCreateUserId_IN() {
                return createUserId_IN;
            }

            public void setCreateUserId_IN(String createUserId_IN) {
                this.createUserId_IN = createUserId_IN;
            }

            public String getCreateUserId_NOTIN() {
                return createUserId_NOTIN;
            }

            public void setCreateUserId_NOTIN(String createUserId_NOTIN) {
                this.createUserId_NOTIN = createUserId_NOTIN;
            }

            public String getCreateUserId_LIKE() {
                return createUserId_LIKE;
            }

            public void setCreateUserId_LIKE(String createUserId_LIKE) {
                this.createUserId_LIKE = createUserId_LIKE;
            }

            public String getCreateUserId_NOTLIKE() {
                return createUserId_NOTLIKE;
            }

            public void setCreateUserId_NOTLIKE(String createUserId_NOTLIKE) {
                this.createUserId_NOTLIKE = createUserId_NOTLIKE;
            }


            public String getCreateUserName() {
                return createUserName;
            }

            public void setCreateUserName(String createUserName) {
                this.createUserName = createUserName;
            }

            public String getCreateUserName_NE() {
                return createUserName_NE;
            }

            public void setCreateUserName_NE(String createUserName_NE) {
                this.createUserName_NE = createUserName_NE;
            }

            public String getCreateUserName_IN() {
                return createUserName_IN;
            }

            public void setCreateUserName_IN(String createUserName_IN) {
                this.createUserName_IN = createUserName_IN;
            }

            public String getCreateUserName_NOTIN() {
                return createUserName_NOTIN;
            }

            public void setCreateUserName_NOTIN(String createUserName_NOTIN) {
                this.createUserName_NOTIN = createUserName_NOTIN;
            }

            public String getCreateUserName_LIKE() {
                return createUserName_LIKE;
            }

            public void setCreateUserName_LIKE(String createUserName_LIKE) {
                this.createUserName_LIKE = createUserName_LIKE;
            }

            public String getCreateUserName_NOTLIKE() {
                return createUserName_NOTLIKE;
            }

            public void setCreateUserName_NOTLIKE(String createUserName_NOTLIKE) {
                this.createUserName_NOTLIKE = createUserName_NOTLIKE;
            }

            public Timestamp getCreateTime() {
                return createTime;
            }

            public void setCreateTime(Timestamp createTime) {
                this.createTime = createTime;
            }

            public Timestamp getCreateTime_NE() {
                return createTime_NE;
            }

            public void setCreateTime_NE(Timestamp createTime_NE) {
                this.createTime_NE = createTime_NE;
            }

            public Timestamp getCreateTime_GT() {
                return createTime_GT;
            }

            public void setCreateTime_GT(Timestamp createTime_GT) {
                this.createTime_GT = createTime_GT;
            }

            public Timestamp getCreateTime_GE() {
                return createTime_GE;
            }

            public void setCreateTime_GE(Timestamp createTime_GE) {
                this.createTime_GE = createTime_GE;
            }

            public Timestamp getCreateTime_LT() {
                return createTime_LT;
            }

            public void setCreateTime_LT(Timestamp createTime_LT) {
                this.createTime_LT = createTime_LT;
            }

            public Timestamp getCreateTime_LE() {
                return createTime_LE;
            }

            public void setCreateTime_LE(Timestamp createTime_LE) {
                this.createTime_LE = createTime_LE;
            }


            public String getUpdateUserId() {
                return updateUserId;
            }

            public void setUpdateUserId(String updateUserId) {
                this.updateUserId = updateUserId;
            }

            public String getUpdateUserId_NE() {
                return updateUserId_NE;
            }

            public void setUpdateUserId_NE(String updateUserId_NE) {
                this.updateUserId_NE = updateUserId_NE;
            }

            public String getUpdateUserId_IN() {
                return updateUserId_IN;
            }

            public void setUpdateUserId_IN(String updateUserId_IN) {
                this.updateUserId_IN = updateUserId_IN;
            }

            public String getUpdateUserId_NOTIN() {
                return updateUserId_NOTIN;
            }

            public void setUpdateUserId_NOTIN(String updateUserId_NOTIN) {
                this.updateUserId_NOTIN = updateUserId_NOTIN;
            }

            public String getUpdateUserId_LIKE() {
                return updateUserId_LIKE;
            }

            public void setUpdateUserId_LIKE(String updateUserId_LIKE) {
                this.updateUserId_LIKE = updateUserId_LIKE;
            }

            public String getUpdateUserId_NOTLIKE() {
                return updateUserId_NOTLIKE;
            }

            public void setUpdateUserId_NOTLIKE(String updateUserId_NOTLIKE) {
                this.updateUserId_NOTLIKE = updateUserId_NOTLIKE;
            }


            public String getUpdateUserName() {
                return updateUserName;
            }

            public void setUpdateUserName(String updateUserName) {
                this.updateUserName = updateUserName;
            }

            public String getUpdateUserName_NE() {
                return updateUserName_NE;
            }

            public void setUpdateUserName_NE(String updateUserName_NE) {
                this.updateUserName_NE = updateUserName_NE;
            }

            public String getUpdateUserName_IN() {
                return updateUserName_IN;
            }

            public void setUpdateUserName_IN(String updateUserName_IN) {
                this.updateUserName_IN = updateUserName_IN;
            }

            public String getUpdateUserName_NOTIN() {
                return updateUserName_NOTIN;
            }

            public void setUpdateUserName_NOTIN(String updateUserName_NOTIN) {
                this.updateUserName_NOTIN = updateUserName_NOTIN;
            }

            public String getUpdateUserName_LIKE() {
                return updateUserName_LIKE;
            }

            public void setUpdateUserName_LIKE(String updateUserName_LIKE) {
                this.updateUserName_LIKE = updateUserName_LIKE;
            }

            public String getUpdateUserName_NOTLIKE() {
                return updateUserName_NOTLIKE;
            }

            public void setUpdateUserName_NOTLIKE(String updateUserName_NOTLIKE) {
                this.updateUserName_NOTLIKE = updateUserName_NOTLIKE;
            }

            public Timestamp getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Timestamp updateTime) {
                this.updateTime = updateTime;
            }

            public Timestamp getUpdateTime_NE() {
                return updateTime_NE;
            }

            public void setUpdateTime_NE(Timestamp updateTime_NE) {
                this.updateTime_NE = updateTime_NE;
            }

            public Timestamp getUpdateTime_GT() {
                return updateTime_GT;
            }

            public void setUpdateTime_GT(Timestamp updateTime_GT) {
                this.updateTime_GT = updateTime_GT;
            }

            public Timestamp getUpdateTime_GE() {
                return updateTime_GE;
            }

            public void setUpdateTime_GE(Timestamp updateTime_GE) {
                this.updateTime_GE = updateTime_GE;
            }

            public Timestamp getUpdateTime_LT() {
                return updateTime_LT;
            }

            public void setUpdateTime_LT(Timestamp updateTime_LT) {
                this.updateTime_LT = updateTime_LT;
            }

            public Timestamp getUpdateTime_LE() {
                return updateTime_LE;
            }

            public void setUpdateTime_LE(Timestamp updateTime_LE) {
                this.updateTime_LE = updateTime_LE;
            }

            public Integer getVersionNo() {
                return versionNo;
            }

            public void setVersionNo(Integer versionNo) {
                this.versionNo = versionNo;
            }

            public Integer getVersionNo_NE() {
                return versionNo_NE;
            }

            public void setVersionNo_NE(Integer versionNo_NE) {
                this.versionNo_NE = versionNo_NE;
            }

            public Integer getVersionNo_GT() {
                return versionNo_GT;
            }

            public void setVersionNo_GT(Integer versionNo_GT) {
                this.versionNo_GT = versionNo_GT;
            }

            public Integer getVersionNo_GE() {
                return versionNo_GE;
            }

            public void setVersionNo_GE(Integer versionNo_GE) {
                this.versionNo_GE = versionNo_GE;
            }

            public Integer getVersionNo_LT() {
                return versionNo_LT;
            }

            public void setVersionNo_LT(Integer versionNo_LT) {
                this.versionNo_LT = versionNo_LT;
            }

            public Integer getVersionNo_LE() {
                return versionNo_LE;
            }

            public void setVersionNo_LE(Integer versionNo_LE) {
                this.versionNo_LE = versionNo_LE;
            }

}