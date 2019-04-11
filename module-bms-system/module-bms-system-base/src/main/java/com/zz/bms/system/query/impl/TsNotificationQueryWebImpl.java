package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 系统通知 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:13
*/
public class TsNotificationQueryWebImpl<PK extends Serializable> extends TsNotificationAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String notifyModule_IN;
            private String notifyModule_NOTIN;



            private String title_IN;
            private String title_NOTIN;




        //todo TEXT content;



        //todo TIMESTAMP notifyTime;


            private String notifyFiles_IN;
            private String notifyFiles_NOTIN;



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


            private String tenantId_IN;
            private String tenantId_NOTIN;





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



            public String getNotifyModule() {
                return notifyModule;
            }

            public void setNotifyModule(String notifyModule) {
                this.notifyModule = notifyModule;
            }

            public String getNotifyModule_NE() {
                return notifyModule_NE;
            }

            public void setNotifyModule_NE(String notifyModule_NE) {
                this.notifyModule_NE = notifyModule_NE;
            }

            public String getNotifyModule_IN() {
                return notifyModule_IN;
            }

            public void setNotifyModule_IN(String notifyModule_IN) {
                this.notifyModule_IN = notifyModule_IN;
            }

            public String getNotifyModule_NOTIN() {
                return notifyModule_NOTIN;
            }

            public void setNotifyModule_NOTIN(String notifyModule_NOTIN) {
                this.notifyModule_NOTIN = notifyModule_NOTIN;
            }

            public String getNotifyModule_LIKE() {
                return notifyModule_LIKE;
            }

            public void setNotifyModule_LIKE(String notifyModule_LIKE) {
                this.notifyModule_LIKE = notifyModule_LIKE;
            }

            public String getNotifyModule_NOTLIKE() {
                return notifyModule_NOTLIKE;
            }

            public void setNotifyModule_NOTLIKE(String notifyModule_NOTLIKE) {
                this.notifyModule_NOTLIKE = notifyModule_NOTLIKE;
            }


            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTitle_NE() {
                return title_NE;
            }

            public void setTitle_NE(String title_NE) {
                this.title_NE = title_NE;
            }

            public String getTitle_IN() {
                return title_IN;
            }

            public void setTitle_IN(String title_IN) {
                this.title_IN = title_IN;
            }

            public String getTitle_NOTIN() {
                return title_NOTIN;
            }

            public void setTitle_NOTIN(String title_NOTIN) {
                this.title_NOTIN = title_NOTIN;
            }

            public String getTitle_LIKE() {
                return title_LIKE;
            }

            public void setTitle_LIKE(String title_LIKE) {
                this.title_LIKE = title_LIKE;
            }

            public String getTitle_NOTLIKE() {
                return title_NOTLIKE;
            }

            public void setTitle_NOTLIKE(String title_NOTLIKE) {
                this.title_NOTLIKE = title_NOTLIKE;
            }


            //todo TEXT content;

            public Timestamp getNotifyTime() {
                return notifyTime;
            }

            public void setNotifyTime(Timestamp notifyTime) {
                this.notifyTime = notifyTime;
            }

            public Timestamp getNotifyTime_NE() {
                return notifyTime_NE;
            }

            public void setNotifyTime_NE(Timestamp notifyTime_NE) {
                this.notifyTime_NE = notifyTime_NE;
            }

            public Timestamp getNotifyTime_GT() {
                return notifyTime_GT;
            }

            public void setNotifyTime_GT(Timestamp notifyTime_GT) {
                this.notifyTime_GT = notifyTime_GT;
            }

            public Timestamp getNotifyTime_GE() {
                return notifyTime_GE;
            }

            public void setNotifyTime_GE(Timestamp notifyTime_GE) {
                this.notifyTime_GE = notifyTime_GE;
            }

            public Timestamp getNotifyTime_LT() {
                return notifyTime_LT;
            }

            public void setNotifyTime_LT(Timestamp notifyTime_LT) {
                this.notifyTime_LT = notifyTime_LT;
            }

            public Timestamp getNotifyTime_LE() {
                return notifyTime_LE;
            }

            public void setNotifyTime_LE(Timestamp notifyTime_LE) {
                this.notifyTime_LE = notifyTime_LE;
            }


            public String getNotifyFiles() {
                return notifyFiles;
            }

            public void setNotifyFiles(String notifyFiles) {
                this.notifyFiles = notifyFiles;
            }

            public String getNotifyFiles_NE() {
                return notifyFiles_NE;
            }

            public void setNotifyFiles_NE(String notifyFiles_NE) {
                this.notifyFiles_NE = notifyFiles_NE;
            }

            public String getNotifyFiles_IN() {
                return notifyFiles_IN;
            }

            public void setNotifyFiles_IN(String notifyFiles_IN) {
                this.notifyFiles_IN = notifyFiles_IN;
            }

            public String getNotifyFiles_NOTIN() {
                return notifyFiles_NOTIN;
            }

            public void setNotifyFiles_NOTIN(String notifyFiles_NOTIN) {
                this.notifyFiles_NOTIN = notifyFiles_NOTIN;
            }

            public String getNotifyFiles_LIKE() {
                return notifyFiles_LIKE;
            }

            public void setNotifyFiles_LIKE(String notifyFiles_LIKE) {
                this.notifyFiles_LIKE = notifyFiles_LIKE;
            }

            public String getNotifyFiles_NOTLIKE() {
                return notifyFiles_NOTLIKE;
            }

            public void setNotifyFiles_NOTLIKE(String notifyFiles_NOTLIKE) {
                this.notifyFiles_NOTLIKE = notifyFiles_NOTLIKE;
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



            public String getTenantId() {
                return tenantId;
            }

            public void setTenantId(String tenantId) {
                this.tenantId = tenantId;
            }

            public String getTenantId_NE() {
                return tenantId_NE;
            }

            public void setTenantId_NE(String tenantId_NE) {
                this.tenantId_NE = tenantId_NE;
            }

            public String getTenantId_IN() {
                return tenantId_IN;
            }

            public void setTenantId_IN(String tenantId_IN) {
                this.tenantId_IN = tenantId_IN;
            }

            public String getTenantId_NOTIN() {
                return tenantId_NOTIN;
            }

            public void setTenantId_NOTIN(String tenantId_NOTIN) {
                this.tenantId_NOTIN = tenantId_NOTIN;
            }

            public String getTenantId_LIKE() {
                return tenantId_LIKE;
            }

            public void setTenantId_LIKE(String tenantId_LIKE) {
                this.tenantId_LIKE = tenantId_LIKE;
            }

            public String getTenantId_NOTLIKE() {
                return tenantId_NOTLIKE;
            }

            public void setTenantId_NOTLIKE(String tenantId_NOTLIKE) {
                this.tenantId_NOTLIKE = tenantId_NOTLIKE;
            }
}