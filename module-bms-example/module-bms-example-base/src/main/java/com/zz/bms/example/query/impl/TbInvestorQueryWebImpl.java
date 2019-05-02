package com.zz.bms.example.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 投资人 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-5-1 17:49:22
*/
public class TbInvestorQueryWebImpl<PK extends Serializable> extends TbInvestorAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String investorName_IN;
            private String investorName_NOTIN;



            private String investorCode_IN;
            private String investorCode_NOTIN;


            private String investorType_IN;
            private String investorType_NOTIN;




            private String manageUserId_IN;
            private String manageUserId_NOTIN;


            private String cardType_IN;
            private String cardType_NOTIN;




            private String cardNo_IN;
            private String cardNo_NOTIN;



            private String investorFiles_IN;
            private String investorFiles_NOTIN;



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



            public String getInvestorName() {
                return investorName;
            }

            public void setInvestorName(String investorName) {
                this.investorName = investorName;
            }

            public String getInvestorName_NE() {
                return investorName_NE;
            }

            public void setInvestorName_NE(String investorName_NE) {
                this.investorName_NE = investorName_NE;
            }

            public String getInvestorName_IN() {
                return investorName_IN;
            }

            public void setInvestorName_IN(String investorName_IN) {
                this.investorName_IN = investorName_IN;
            }

            public String getInvestorName_NOTIN() {
                return investorName_NOTIN;
            }

            public void setInvestorName_NOTIN(String investorName_NOTIN) {
                this.investorName_NOTIN = investorName_NOTIN;
            }

            public String getInvestorName_LIKE() {
                return investorName_LIKE;
            }

            public void setInvestorName_LIKE(String investorName_LIKE) {
                this.investorName_LIKE = investorName_LIKE;
            }

            public String getInvestorName_NOTLIKE() {
                return investorName_NOTLIKE;
            }

            public void setInvestorName_NOTLIKE(String investorName_NOTLIKE) {
                this.investorName_NOTLIKE = investorName_NOTLIKE;
            }


            public String getInvestorCode() {
                return investorCode;
            }

            public void setInvestorCode(String investorCode) {
                this.investorCode = investorCode;
            }

            public String getInvestorCode_NE() {
                return investorCode_NE;
            }

            public void setInvestorCode_NE(String investorCode_NE) {
                this.investorCode_NE = investorCode_NE;
            }

            public String getInvestorCode_IN() {
                return investorCode_IN;
            }

            public void setInvestorCode_IN(String investorCode_IN) {
                this.investorCode_IN = investorCode_IN;
            }

            public String getInvestorCode_NOTIN() {
                return investorCode_NOTIN;
            }

            public void setInvestorCode_NOTIN(String investorCode_NOTIN) {
                this.investorCode_NOTIN = investorCode_NOTIN;
            }

            public String getInvestorCode_LIKE() {
                return investorCode_LIKE;
            }

            public void setInvestorCode_LIKE(String investorCode_LIKE) {
                this.investorCode_LIKE = investorCode_LIKE;
            }

            public String getInvestorCode_NOTLIKE() {
                return investorCode_NOTLIKE;
            }

            public void setInvestorCode_NOTLIKE(String investorCode_NOTLIKE) {
                this.investorCode_NOTLIKE = investorCode_NOTLIKE;
            }

            public String getInvestorType() {
                return investorType;
            }

            public void setInvestorType(String investorType) {
                this.investorType = investorType;
            }

            public String getInvestorType_NE() {
                return investorType_NE;
            }

            public void setInvestorType_NE(String investorType_NE) {
                this.investorType_NE = investorType_NE;
            }

            public String getInvestorType_IN() {
                return investorType_IN;
            }

            public void setInvestorType_IN(String investorType_IN) {
                this.investorType_IN = investorType_IN;
            }

            public String getInvestorType_NOTIN() {
                return investorType_NOTIN;
            }

            public void setInvestorType_NOTIN(String investorType_NOTIN) {
                this.investorType_NOTIN = investorType_NOTIN;
            }



            public String getManageUserId() {
                return manageUserId;
            }

            public void setManageUserId(String manageUserId) {
                this.manageUserId = manageUserId;
            }

            public String getManageUserId_NE() {
                return manageUserId_NE;
            }

            public void setManageUserId_NE(String manageUserId_NE) {
                this.manageUserId_NE = manageUserId_NE;
            }

            public String getManageUserId_IN() {
                return manageUserId_IN;
            }

            public void setManageUserId_IN(String manageUserId_IN) {
                this.manageUserId_IN = manageUserId_IN;
            }

            public String getManageUserId_NOTIN() {
                return manageUserId_NOTIN;
            }

            public void setManageUserId_NOTIN(String manageUserId_NOTIN) {
                this.manageUserId_NOTIN = manageUserId_NOTIN;
            }

            public String getManageUserId_LIKE() {
                return manageUserId_LIKE;
            }

            public void setManageUserId_LIKE(String manageUserId_LIKE) {
                this.manageUserId_LIKE = manageUserId_LIKE;
            }

            public String getManageUserId_NOTLIKE() {
                return manageUserId_NOTLIKE;
            }

            public void setManageUserId_NOTLIKE(String manageUserId_NOTLIKE) {
                this.manageUserId_NOTLIKE = manageUserId_NOTLIKE;
            }

            public String getCardType() {
                return cardType;
            }

            public void setCardType(String cardType) {
                this.cardType = cardType;
            }

            public String getCardType_NE() {
                return cardType_NE;
            }

            public void setCardType_NE(String cardType_NE) {
                this.cardType_NE = cardType_NE;
            }

            public String getCardType_IN() {
                return cardType_IN;
            }

            public void setCardType_IN(String cardType_IN) {
                this.cardType_IN = cardType_IN;
            }

            public String getCardType_NOTIN() {
                return cardType_NOTIN;
            }

            public void setCardType_NOTIN(String cardType_NOTIN) {
                this.cardType_NOTIN = cardType_NOTIN;
            }



            public String getCardNo() {
                return cardNo;
            }

            public void setCardNo(String cardNo) {
                this.cardNo = cardNo;
            }

            public String getCardNo_NE() {
                return cardNo_NE;
            }

            public void setCardNo_NE(String cardNo_NE) {
                this.cardNo_NE = cardNo_NE;
            }

            public String getCardNo_IN() {
                return cardNo_IN;
            }

            public void setCardNo_IN(String cardNo_IN) {
                this.cardNo_IN = cardNo_IN;
            }

            public String getCardNo_NOTIN() {
                return cardNo_NOTIN;
            }

            public void setCardNo_NOTIN(String cardNo_NOTIN) {
                this.cardNo_NOTIN = cardNo_NOTIN;
            }

            public String getCardNo_LIKE() {
                return cardNo_LIKE;
            }

            public void setCardNo_LIKE(String cardNo_LIKE) {
                this.cardNo_LIKE = cardNo_LIKE;
            }

            public String getCardNo_NOTLIKE() {
                return cardNo_NOTLIKE;
            }

            public void setCardNo_NOTLIKE(String cardNo_NOTLIKE) {
                this.cardNo_NOTLIKE = cardNo_NOTLIKE;
            }


            public String getInvestorFiles() {
                return investorFiles;
            }

            public void setInvestorFiles(String investorFiles) {
                this.investorFiles = investorFiles;
            }

            public String getInvestorFiles_NE() {
                return investorFiles_NE;
            }

            public void setInvestorFiles_NE(String investorFiles_NE) {
                this.investorFiles_NE = investorFiles_NE;
            }

            public String getInvestorFiles_IN() {
                return investorFiles_IN;
            }

            public void setInvestorFiles_IN(String investorFiles_IN) {
                this.investorFiles_IN = investorFiles_IN;
            }

            public String getInvestorFiles_NOTIN() {
                return investorFiles_NOTIN;
            }

            public void setInvestorFiles_NOTIN(String investorFiles_NOTIN) {
                this.investorFiles_NOTIN = investorFiles_NOTIN;
            }

            public String getInvestorFiles_LIKE() {
                return investorFiles_LIKE;
            }

            public void setInvestorFiles_LIKE(String investorFiles_LIKE) {
                this.investorFiles_LIKE = investorFiles_LIKE;
            }

            public String getInvestorFiles_NOTLIKE() {
                return investorFiles_NOTLIKE;
            }

            public void setInvestorFiles_NOTLIKE(String investorFiles_NOTLIKE) {
                this.investorFiles_NOTLIKE = investorFiles_NOTLIKE;
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