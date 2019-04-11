package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 企业 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:16
*/
public class TsTenantQueryWebImpl<PK extends Serializable> extends TsTenantAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String tenantName_IN;
            private String tenantName_NOTIN;



            private String tenantCode_IN;
            private String tenantCode_NOTIN;



            private String tenantAddr_IN;
            private String tenantAddr_NOTIN;



            private String linkTel_IN;
            private String linkTel_NOTIN;



            private String leadUserName_IN;
            private String leadUserName_NOTIN;



            private String logoFile_IN;
            private String logoFile_NOTIN;



            private String website_IN;
            private String website_NOTIN;



            private String remark_IN;
            private String remark_NOTIN;



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



            public String getTenantName() {
                return tenantName;
            }

            public void setTenantName(String tenantName) {
                this.tenantName = tenantName;
            }

            public String getTenantName_NE() {
                return tenantName_NE;
            }

            public void setTenantName_NE(String tenantName_NE) {
                this.tenantName_NE = tenantName_NE;
            }

            public String getTenantName_IN() {
                return tenantName_IN;
            }

            public void setTenantName_IN(String tenantName_IN) {
                this.tenantName_IN = tenantName_IN;
            }

            public String getTenantName_NOTIN() {
                return tenantName_NOTIN;
            }

            public void setTenantName_NOTIN(String tenantName_NOTIN) {
                this.tenantName_NOTIN = tenantName_NOTIN;
            }

            public String getTenantName_LIKE() {
                return tenantName_LIKE;
            }

            public void setTenantName_LIKE(String tenantName_LIKE) {
                this.tenantName_LIKE = tenantName_LIKE;
            }

            public String getTenantName_NOTLIKE() {
                return tenantName_NOTLIKE;
            }

            public void setTenantName_NOTLIKE(String tenantName_NOTLIKE) {
                this.tenantName_NOTLIKE = tenantName_NOTLIKE;
            }


            public String getTenantCode() {
                return tenantCode;
            }

            public void setTenantCode(String tenantCode) {
                this.tenantCode = tenantCode;
            }

            public String getTenantCode_NE() {
                return tenantCode_NE;
            }

            public void setTenantCode_NE(String tenantCode_NE) {
                this.tenantCode_NE = tenantCode_NE;
            }

            public String getTenantCode_IN() {
                return tenantCode_IN;
            }

            public void setTenantCode_IN(String tenantCode_IN) {
                this.tenantCode_IN = tenantCode_IN;
            }

            public String getTenantCode_NOTIN() {
                return tenantCode_NOTIN;
            }

            public void setTenantCode_NOTIN(String tenantCode_NOTIN) {
                this.tenantCode_NOTIN = tenantCode_NOTIN;
            }

            public String getTenantCode_LIKE() {
                return tenantCode_LIKE;
            }

            public void setTenantCode_LIKE(String tenantCode_LIKE) {
                this.tenantCode_LIKE = tenantCode_LIKE;
            }

            public String getTenantCode_NOTLIKE() {
                return tenantCode_NOTLIKE;
            }

            public void setTenantCode_NOTLIKE(String tenantCode_NOTLIKE) {
                this.tenantCode_NOTLIKE = tenantCode_NOTLIKE;
            }


            public String getTenantAddr() {
                return tenantAddr;
            }

            public void setTenantAddr(String tenantAddr) {
                this.tenantAddr = tenantAddr;
            }

            public String getTenantAddr_NE() {
                return tenantAddr_NE;
            }

            public void setTenantAddr_NE(String tenantAddr_NE) {
                this.tenantAddr_NE = tenantAddr_NE;
            }

            public String getTenantAddr_IN() {
                return tenantAddr_IN;
            }

            public void setTenantAddr_IN(String tenantAddr_IN) {
                this.tenantAddr_IN = tenantAddr_IN;
            }

            public String getTenantAddr_NOTIN() {
                return tenantAddr_NOTIN;
            }

            public void setTenantAddr_NOTIN(String tenantAddr_NOTIN) {
                this.tenantAddr_NOTIN = tenantAddr_NOTIN;
            }

            public String getTenantAddr_LIKE() {
                return tenantAddr_LIKE;
            }

            public void setTenantAddr_LIKE(String tenantAddr_LIKE) {
                this.tenantAddr_LIKE = tenantAddr_LIKE;
            }

            public String getTenantAddr_NOTLIKE() {
                return tenantAddr_NOTLIKE;
            }

            public void setTenantAddr_NOTLIKE(String tenantAddr_NOTLIKE) {
                this.tenantAddr_NOTLIKE = tenantAddr_NOTLIKE;
            }


            public String getLinkTel() {
                return linkTel;
            }

            public void setLinkTel(String linkTel) {
                this.linkTel = linkTel;
            }

            public String getLinkTel_NE() {
                return linkTel_NE;
            }

            public void setLinkTel_NE(String linkTel_NE) {
                this.linkTel_NE = linkTel_NE;
            }

            public String getLinkTel_IN() {
                return linkTel_IN;
            }

            public void setLinkTel_IN(String linkTel_IN) {
                this.linkTel_IN = linkTel_IN;
            }

            public String getLinkTel_NOTIN() {
                return linkTel_NOTIN;
            }

            public void setLinkTel_NOTIN(String linkTel_NOTIN) {
                this.linkTel_NOTIN = linkTel_NOTIN;
            }

            public String getLinkTel_LIKE() {
                return linkTel_LIKE;
            }

            public void setLinkTel_LIKE(String linkTel_LIKE) {
                this.linkTel_LIKE = linkTel_LIKE;
            }

            public String getLinkTel_NOTLIKE() {
                return linkTel_NOTLIKE;
            }

            public void setLinkTel_NOTLIKE(String linkTel_NOTLIKE) {
                this.linkTel_NOTLIKE = linkTel_NOTLIKE;
            }


            public String getLeadUserName() {
                return leadUserName;
            }

            public void setLeadUserName(String leadUserName) {
                this.leadUserName = leadUserName;
            }

            public String getLeadUserName_NE() {
                return leadUserName_NE;
            }

            public void setLeadUserName_NE(String leadUserName_NE) {
                this.leadUserName_NE = leadUserName_NE;
            }

            public String getLeadUserName_IN() {
                return leadUserName_IN;
            }

            public void setLeadUserName_IN(String leadUserName_IN) {
                this.leadUserName_IN = leadUserName_IN;
            }

            public String getLeadUserName_NOTIN() {
                return leadUserName_NOTIN;
            }

            public void setLeadUserName_NOTIN(String leadUserName_NOTIN) {
                this.leadUserName_NOTIN = leadUserName_NOTIN;
            }

            public String getLeadUserName_LIKE() {
                return leadUserName_LIKE;
            }

            public void setLeadUserName_LIKE(String leadUserName_LIKE) {
                this.leadUserName_LIKE = leadUserName_LIKE;
            }

            public String getLeadUserName_NOTLIKE() {
                return leadUserName_NOTLIKE;
            }

            public void setLeadUserName_NOTLIKE(String leadUserName_NOTLIKE) {
                this.leadUserName_NOTLIKE = leadUserName_NOTLIKE;
            }


            public String getLogoFile() {
                return logoFile;
            }

            public void setLogoFile(String logoFile) {
                this.logoFile = logoFile;
            }

            public String getLogoFile_NE() {
                return logoFile_NE;
            }

            public void setLogoFile_NE(String logoFile_NE) {
                this.logoFile_NE = logoFile_NE;
            }

            public String getLogoFile_IN() {
                return logoFile_IN;
            }

            public void setLogoFile_IN(String logoFile_IN) {
                this.logoFile_IN = logoFile_IN;
            }

            public String getLogoFile_NOTIN() {
                return logoFile_NOTIN;
            }

            public void setLogoFile_NOTIN(String logoFile_NOTIN) {
                this.logoFile_NOTIN = logoFile_NOTIN;
            }

            public String getLogoFile_LIKE() {
                return logoFile_LIKE;
            }

            public void setLogoFile_LIKE(String logoFile_LIKE) {
                this.logoFile_LIKE = logoFile_LIKE;
            }

            public String getLogoFile_NOTLIKE() {
                return logoFile_NOTLIKE;
            }

            public void setLogoFile_NOTLIKE(String logoFile_NOTLIKE) {
                this.logoFile_NOTLIKE = logoFile_NOTLIKE;
            }


            public String getWebsite() {
                return website;
            }

            public void setWebsite(String website) {
                this.website = website;
            }

            public String getWebsite_NE() {
                return website_NE;
            }

            public void setWebsite_NE(String website_NE) {
                this.website_NE = website_NE;
            }

            public String getWebsite_IN() {
                return website_IN;
            }

            public void setWebsite_IN(String website_IN) {
                this.website_IN = website_IN;
            }

            public String getWebsite_NOTIN() {
                return website_NOTIN;
            }

            public void setWebsite_NOTIN(String website_NOTIN) {
                this.website_NOTIN = website_NOTIN;
            }

            public String getWebsite_LIKE() {
                return website_LIKE;
            }

            public void setWebsite_LIKE(String website_LIKE) {
                this.website_LIKE = website_LIKE;
            }

            public String getWebsite_NOTLIKE() {
                return website_NOTLIKE;
            }

            public void setWebsite_NOTLIKE(String website_NOTLIKE) {
                this.website_NOTLIKE = website_NOTLIKE;
            }


            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getRemark_NE() {
                return remark_NE;
            }

            public void setRemark_NE(String remark_NE) {
                this.remark_NE = remark_NE;
            }

            public String getRemark_IN() {
                return remark_IN;
            }

            public void setRemark_IN(String remark_IN) {
                this.remark_IN = remark_IN;
            }

            public String getRemark_NOTIN() {
                return remark_NOTIN;
            }

            public void setRemark_NOTIN(String remark_NOTIN) {
                this.remark_NOTIN = remark_NOTIN;
            }

            public String getRemark_LIKE() {
                return remark_LIKE;
            }

            public void setRemark_LIKE(String remark_LIKE) {
                this.remark_LIKE = remark_LIKE;
            }

            public String getRemark_NOTLIKE() {
                return remark_NOTLIKE;
            }

            public void setRemark_NOTLIKE(String remark_NOTLIKE) {
                this.remark_NOTLIKE = remark_NOTLIKE;
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