package com.zz.bms.example.query.impl;


import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 出资明细 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-5-8 10:49:23
*/
public class TbOutMoneyQueryWebImpl<PK extends Serializable> extends TbOutMoneyAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK investorAgreementId_IN;
            private PK investorAgreementId_NOTIN;



            private PK fundId_IN;
            private PK fundId_NOTIN;



            private PK investorId_IN;
            private PK investorId_NOTIN;





        //todo DECIMAL actualAmount;

            private PK handleDepId_IN;
            private PK handleDepId_NOTIN;




            private String handleOrganId_IN;
            private String handleOrganId_NOTIN;


            private PK handleUserId_IN;
            private PK handleUserId_NOTIN;





        //todo DATE arrivalAccountDate;


            private String outMoneyFiles_IN;
            private String outMoneyFiles_NOTIN;



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


            public PK getInvestorAgreementId() {
                return investorAgreementId;
            }

            public void setInvestorAgreementId(PK investorAgreementId) {
                this.investorAgreementId = investorAgreementId;
            }

            public PK getInvestorAgreementId_NE() {
                return investorAgreementId_NE;
            }

            public void setInvestorAgreementId_NE(PK investorAgreementId_NE) {
                this.investorAgreementId_NE = investorAgreementId_NE;
            }

            public PK getInvestorAgreementId_IN() {
                return investorAgreementId_IN;
            }

            public void setInvestorAgreementId_IN(PK investorAgreementId_IN) {
                this.investorAgreementId_IN = investorAgreementId_IN;
            }

            public PK getInvestorAgreementId_NOTIN() {
                return investorAgreementId_NOTIN;
            }

            public void setInvestorAgreementId_NOTIN(PK investorAgreementId_NOTIN) {
                this.investorAgreementId_NOTIN = investorAgreementId_NOTIN;
            }


            public PK getFundId() {
                return fundId;
            }

            public void setFundId(PK fundId) {
                this.fundId = fundId;
            }

            public PK getFundId_NE() {
                return fundId_NE;
            }

            public void setFundId_NE(PK fundId_NE) {
                this.fundId_NE = fundId_NE;
            }

            public PK getFundId_IN() {
                return fundId_IN;
            }

            public void setFundId_IN(PK fundId_IN) {
                this.fundId_IN = fundId_IN;
            }

            public PK getFundId_NOTIN() {
                return fundId_NOTIN;
            }

            public void setFundId_NOTIN(PK fundId_NOTIN) {
                this.fundId_NOTIN = fundId_NOTIN;
            }


            public PK getInvestorId() {
                return investorId;
            }

            public void setInvestorId(PK investorId) {
                this.investorId = investorId;
            }

            public PK getInvestorId_NE() {
                return investorId_NE;
            }

            public void setInvestorId_NE(PK investorId_NE) {
                this.investorId_NE = investorId_NE;
            }

            public PK getInvestorId_IN() {
                return investorId_IN;
            }

            public void setInvestorId_IN(PK investorId_IN) {
                this.investorId_IN = investorId_IN;
            }

            public PK getInvestorId_NOTIN() {
                return investorId_NOTIN;
            }

            public void setInvestorId_NOTIN(PK investorId_NOTIN) {
                this.investorId_NOTIN = investorId_NOTIN;
            }


            public BigDecimal getActualAmount() {
                return actualAmount;
            }

            public void setActualAmount(BigDecimal actualAmount) {
                this.actualAmount = actualAmount;
            }

            public BigDecimal getActualAmount_NE() {
                return actualAmount_NE;
            }

            public void setActualAmount_NE(BigDecimal actualAmount_NE) {
                this.actualAmount_NE = actualAmount_NE;
            }

            public BigDecimal getActualAmount_GT() {
                return actualAmount_GT;
            }

            public void setActualAmount_GT(BigDecimal actualAmount_GT) {
                this.actualAmount_GT = actualAmount_GT;
            }

            public BigDecimal getActualAmount_GE() {
                return actualAmount_GE;
            }

            public void setActualAmount_GE(BigDecimal actualAmount_GE) {
                this.actualAmount_GE = actualAmount_GE;
            }

            public BigDecimal getActualAmount_LT() {
                return actualAmount_LT;
            }

            public void setActualAmount_LT(BigDecimal actualAmount_LT) {
                this.actualAmount_LT = actualAmount_LT;
            }

            public BigDecimal getActualAmount_LE() {
                return actualAmount_LE;
            }

            public void setActualAmount_LE(BigDecimal actualAmount_LE) {
                this.actualAmount_LE = actualAmount_LE;
            }


            public PK getHandleDepId() {
                return handleDepId;
            }

            public void setHandleDepId(PK handleDepId) {
                this.handleDepId = handleDepId;
            }

            public PK getHandleDepId_NE() {
                return handleDepId_NE;
            }

            public void setHandleDepId_NE(PK handleDepId_NE) {
                this.handleDepId_NE = handleDepId_NE;
            }

            public PK getHandleDepId_IN() {
                return handleDepId_IN;
            }

            public void setHandleDepId_IN(PK handleDepId_IN) {
                this.handleDepId_IN = handleDepId_IN;
            }

            public PK getHandleDepId_NOTIN() {
                return handleDepId_NOTIN;
            }

            public void setHandleDepId_NOTIN(PK handleDepId_NOTIN) {
                this.handleDepId_NOTIN = handleDepId_NOTIN;
            }



            public String getHandleOrganId() {
                return handleOrganId;
            }

            public void setHandleOrganId(String handleOrganId) {
                this.handleOrganId = handleOrganId;
            }

            public String getHandleOrganId_NE() {
                return handleOrganId_NE;
            }

            public void setHandleOrganId_NE(String handleOrganId_NE) {
                this.handleOrganId_NE = handleOrganId_NE;
            }

            public String getHandleOrganId_IN() {
                return handleOrganId_IN;
            }

            public void setHandleOrganId_IN(String handleOrganId_IN) {
                this.handleOrganId_IN = handleOrganId_IN;
            }

            public String getHandleOrganId_NOTIN() {
                return handleOrganId_NOTIN;
            }

            public void setHandleOrganId_NOTIN(String handleOrganId_NOTIN) {
                this.handleOrganId_NOTIN = handleOrganId_NOTIN;
            }

            public String getHandleOrganId_LIKE() {
                return handleOrganId_LIKE;
            }

            public void setHandleOrganId_LIKE(String handleOrganId_LIKE) {
                this.handleOrganId_LIKE = handleOrganId_LIKE;
            }

            public String getHandleOrganId_NOTLIKE() {
                return handleOrganId_NOTLIKE;
            }

            public void setHandleOrganId_NOTLIKE(String handleOrganId_NOTLIKE) {
                this.handleOrganId_NOTLIKE = handleOrganId_NOTLIKE;
            }

            public PK getHandleUserId() {
                return handleUserId;
            }

            public void setHandleUserId(PK handleUserId) {
                this.handleUserId = handleUserId;
            }

            public PK getHandleUserId_NE() {
                return handleUserId_NE;
            }

            public void setHandleUserId_NE(PK handleUserId_NE) {
                this.handleUserId_NE = handleUserId_NE;
            }

            public PK getHandleUserId_IN() {
                return handleUserId_IN;
            }

            public void setHandleUserId_IN(PK handleUserId_IN) {
                this.handleUserId_IN = handleUserId_IN;
            }

            public PK getHandleUserId_NOTIN() {
                return handleUserId_NOTIN;
            }

            public void setHandleUserId_NOTIN(PK handleUserId_NOTIN) {
                this.handleUserId_NOTIN = handleUserId_NOTIN;
            }


            public Date getArrivalAccountDate() {
                return arrivalAccountDate;
            }

            public void setArrivalAccountDate(Date arrivalAccountDate) {
                this.arrivalAccountDate = arrivalAccountDate;
            }

            public Date getArrivalAccountDate_NE() {
                return arrivalAccountDate_NE;
            }

            public void setArrivalAccountDate_NE(Date arrivalAccountDate_NE) {
                this.arrivalAccountDate_NE = arrivalAccountDate_NE;
            }

            public Date getArrivalAccountDate_GT() {
                return arrivalAccountDate_GT;
            }

            public void setArrivalAccountDate_GT(Date arrivalAccountDate_GT) {
                this.arrivalAccountDate_GT = arrivalAccountDate_GT;
            }

            public Date getArrivalAccountDate_GE() {
                return arrivalAccountDate_GE;
            }

            public void setArrivalAccountDate_GE(Date arrivalAccountDate_GE) {
                this.arrivalAccountDate_GE = arrivalAccountDate_GE;
            }

            public Date getArrivalAccountDate_LT() {
                return arrivalAccountDate_LT;
            }

            public void setArrivalAccountDate_LT(Date arrivalAccountDate_LT) {
                this.arrivalAccountDate_LT = arrivalAccountDate_LT;
            }

            public Date getArrivalAccountDate_LE() {
                return arrivalAccountDate_LE;
            }

            public void setArrivalAccountDate_LE(Date arrivalAccountDate_LE) {
                this.arrivalAccountDate_LE = arrivalAccountDate_LE;
            }


            public String getOutMoneyFiles() {
                return outMoneyFiles;
            }

            public void setOutMoneyFiles(String outMoneyFiles) {
                this.outMoneyFiles = outMoneyFiles;
            }

            public String getOutMoneyFiles_NE() {
                return outMoneyFiles_NE;
            }

            public void setOutMoneyFiles_NE(String outMoneyFiles_NE) {
                this.outMoneyFiles_NE = outMoneyFiles_NE;
            }

            public String getOutMoneyFiles_IN() {
                return outMoneyFiles_IN;
            }

            public void setOutMoneyFiles_IN(String outMoneyFiles_IN) {
                this.outMoneyFiles_IN = outMoneyFiles_IN;
            }

            public String getOutMoneyFiles_NOTIN() {
                return outMoneyFiles_NOTIN;
            }

            public void setOutMoneyFiles_NOTIN(String outMoneyFiles_NOTIN) {
                this.outMoneyFiles_NOTIN = outMoneyFiles_NOTIN;
            }

            public String getOutMoneyFiles_LIKE() {
                return outMoneyFiles_LIKE;
            }

            public void setOutMoneyFiles_LIKE(String outMoneyFiles_LIKE) {
                this.outMoneyFiles_LIKE = outMoneyFiles_LIKE;
            }

            public String getOutMoneyFiles_NOTLIKE() {
                return outMoneyFiles_NOTLIKE;
            }

            public void setOutMoneyFiles_NOTLIKE(String outMoneyFiles_NOTLIKE) {
                this.outMoneyFiles_NOTLIKE = outMoneyFiles_NOTLIKE;
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