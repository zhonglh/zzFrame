package com.zz.bms.example.query.impl;


import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 基金 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-5-8 13:45:41
*/
public class TbFundQueryWebImpl<PK extends Serializable> extends TbFundAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String fundName_IN;
            private String fundName_NOTIN;



            private String fundCode_IN;
            private String fundCode_NOTIN;


            private String fundType_IN;
            private String fundType_NOTIN;



            private String fundDirection_IN;
            private String fundDirection_NOTIN;





        //todo DECIMAL startMoney;

            private String managType_IN;
            private String managType_NOTIN;





        //todo DECIMAL fundScale;

            private PK managerUserId_IN;
            private PK managerUserId_NOTIN;





        //todo DATE startDate;



        //todo DATE endDate;


            private String investmentField_IN;
            private String investmentField_NOTIN;



            private String incomeAllocation_IN;
            private String incomeAllocation_NOTIN;



            private String fundFiles_IN;
            private String fundFiles_NOTIN;



            private String remark_IN;
            private String remark_NOTIN;


            private PK depId_IN;
            private PK depId_NOTIN;




            private String organId_IN;
            private String organId_NOTIN;



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



            public String getFundName() {
                return fundName;
            }

            public void setFundName(String fundName) {
                this.fundName = fundName;
            }

            public String getFundName_NE() {
                return fundName_NE;
            }

            public void setFundName_NE(String fundName_NE) {
                this.fundName_NE = fundName_NE;
            }

            public String getFundName_IN() {
                return fundName_IN;
            }

            public void setFundName_IN(String fundName_IN) {
                this.fundName_IN = fundName_IN;
            }

            public String getFundName_NOTIN() {
                return fundName_NOTIN;
            }

            public void setFundName_NOTIN(String fundName_NOTIN) {
                this.fundName_NOTIN = fundName_NOTIN;
            }

            public String getFundName_LIKE() {
                return fundName_LIKE;
            }

            public void setFundName_LIKE(String fundName_LIKE) {
                this.fundName_LIKE = fundName_LIKE;
            }

            public String getFundName_NOTLIKE() {
                return fundName_NOTLIKE;
            }

            public void setFundName_NOTLIKE(String fundName_NOTLIKE) {
                this.fundName_NOTLIKE = fundName_NOTLIKE;
            }


            public String getFundCode() {
                return fundCode;
            }

            public void setFundCode(String fundCode) {
                this.fundCode = fundCode;
            }

            public String getFundCode_NE() {
                return fundCode_NE;
            }

            public void setFundCode_NE(String fundCode_NE) {
                this.fundCode_NE = fundCode_NE;
            }

            public String getFundCode_IN() {
                return fundCode_IN;
            }

            public void setFundCode_IN(String fundCode_IN) {
                this.fundCode_IN = fundCode_IN;
            }

            public String getFundCode_NOTIN() {
                return fundCode_NOTIN;
            }

            public void setFundCode_NOTIN(String fundCode_NOTIN) {
                this.fundCode_NOTIN = fundCode_NOTIN;
            }

            public String getFundCode_LIKE() {
                return fundCode_LIKE;
            }

            public void setFundCode_LIKE(String fundCode_LIKE) {
                this.fundCode_LIKE = fundCode_LIKE;
            }

            public String getFundCode_NOTLIKE() {
                return fundCode_NOTLIKE;
            }

            public void setFundCode_NOTLIKE(String fundCode_NOTLIKE) {
                this.fundCode_NOTLIKE = fundCode_NOTLIKE;
            }

            public String getFundType() {
                return fundType;
            }

            public void setFundType(String fundType) {
                this.fundType = fundType;
            }

            public String getFundType_NE() {
                return fundType_NE;
            }

            public void setFundType_NE(String fundType_NE) {
                this.fundType_NE = fundType_NE;
            }

            public String getFundType_IN() {
                return fundType_IN;
            }

            public void setFundType_IN(String fundType_IN) {
                this.fundType_IN = fundType_IN;
            }

            public String getFundType_NOTIN() {
                return fundType_NOTIN;
            }

            public void setFundType_NOTIN(String fundType_NOTIN) {
                this.fundType_NOTIN = fundType_NOTIN;
            }


            public String getFundDirection() {
                return fundDirection;
            }

            public void setFundDirection(String fundDirection) {
                this.fundDirection = fundDirection;
            }

            public String getFundDirection_NE() {
                return fundDirection_NE;
            }

            public void setFundDirection_NE(String fundDirection_NE) {
                this.fundDirection_NE = fundDirection_NE;
            }

            public String getFundDirection_IN() {
                return fundDirection_IN;
            }

            public void setFundDirection_IN(String fundDirection_IN) {
                this.fundDirection_IN = fundDirection_IN;
            }

            public String getFundDirection_NOTIN() {
                return fundDirection_NOTIN;
            }

            public void setFundDirection_NOTIN(String fundDirection_NOTIN) {
                this.fundDirection_NOTIN = fundDirection_NOTIN;
            }


            public BigDecimal getStartMoney() {
                return startMoney;
            }

            public void setStartMoney(BigDecimal startMoney) {
                this.startMoney = startMoney;
            }

            public BigDecimal getStartMoney_NE() {
                return startMoney_NE;
            }

            public void setStartMoney_NE(BigDecimal startMoney_NE) {
                this.startMoney_NE = startMoney_NE;
            }

            public BigDecimal getStartMoney_GT() {
                return startMoney_GT;
            }

            public void setStartMoney_GT(BigDecimal startMoney_GT) {
                this.startMoney_GT = startMoney_GT;
            }

            public BigDecimal getStartMoney_GE() {
                return startMoney_GE;
            }

            public void setStartMoney_GE(BigDecimal startMoney_GE) {
                this.startMoney_GE = startMoney_GE;
            }

            public BigDecimal getStartMoney_LT() {
                return startMoney_LT;
            }

            public void setStartMoney_LT(BigDecimal startMoney_LT) {
                this.startMoney_LT = startMoney_LT;
            }

            public BigDecimal getStartMoney_LE() {
                return startMoney_LE;
            }

            public void setStartMoney_LE(BigDecimal startMoney_LE) {
                this.startMoney_LE = startMoney_LE;
            }


            public String getManagType() {
                return managType;
            }

            public void setManagType(String managType) {
                this.managType = managType;
            }

            public String getManagType_NE() {
                return managType_NE;
            }

            public void setManagType_NE(String managType_NE) {
                this.managType_NE = managType_NE;
            }

            public String getManagType_IN() {
                return managType_IN;
            }

            public void setManagType_IN(String managType_IN) {
                this.managType_IN = managType_IN;
            }

            public String getManagType_NOTIN() {
                return managType_NOTIN;
            }

            public void setManagType_NOTIN(String managType_NOTIN) {
                this.managType_NOTIN = managType_NOTIN;
            }


            public BigDecimal getFundScale() {
                return fundScale;
            }

            public void setFundScale(BigDecimal fundScale) {
                this.fundScale = fundScale;
            }

            public BigDecimal getFundScale_NE() {
                return fundScale_NE;
            }

            public void setFundScale_NE(BigDecimal fundScale_NE) {
                this.fundScale_NE = fundScale_NE;
            }

            public BigDecimal getFundScale_GT() {
                return fundScale_GT;
            }

            public void setFundScale_GT(BigDecimal fundScale_GT) {
                this.fundScale_GT = fundScale_GT;
            }

            public BigDecimal getFundScale_GE() {
                return fundScale_GE;
            }

            public void setFundScale_GE(BigDecimal fundScale_GE) {
                this.fundScale_GE = fundScale_GE;
            }

            public BigDecimal getFundScale_LT() {
                return fundScale_LT;
            }

            public void setFundScale_LT(BigDecimal fundScale_LT) {
                this.fundScale_LT = fundScale_LT;
            }

            public BigDecimal getFundScale_LE() {
                return fundScale_LE;
            }

            public void setFundScale_LE(BigDecimal fundScale_LE) {
                this.fundScale_LE = fundScale_LE;
            }


            public PK getManagerUserId() {
                return managerUserId;
            }

            public void setManagerUserId(PK managerUserId) {
                this.managerUserId = managerUserId;
            }

            public PK getManagerUserId_NE() {
                return managerUserId_NE;
            }

            public void setManagerUserId_NE(PK managerUserId_NE) {
                this.managerUserId_NE = managerUserId_NE;
            }

            public PK getManagerUserId_IN() {
                return managerUserId_IN;
            }

            public void setManagerUserId_IN(PK managerUserId_IN) {
                this.managerUserId_IN = managerUserId_IN;
            }

            public PK getManagerUserId_NOTIN() {
                return managerUserId_NOTIN;
            }

            public void setManagerUserId_NOTIN(PK managerUserId_NOTIN) {
                this.managerUserId_NOTIN = managerUserId_NOTIN;
            }


            public Date getStartDate() {
                return startDate;
            }

            public void setStartDate(Date startDate) {
                this.startDate = startDate;
            }

            public Date getStartDate_NE() {
                return startDate_NE;
            }

            public void setStartDate_NE(Date startDate_NE) {
                this.startDate_NE = startDate_NE;
            }

            public Date getStartDate_GT() {
                return startDate_GT;
            }

            public void setStartDate_GT(Date startDate_GT) {
                this.startDate_GT = startDate_GT;
            }

            public Date getStartDate_GE() {
                return startDate_GE;
            }

            public void setStartDate_GE(Date startDate_GE) {
                this.startDate_GE = startDate_GE;
            }

            public Date getStartDate_LT() {
                return startDate_LT;
            }

            public void setStartDate_LT(Date startDate_LT) {
                this.startDate_LT = startDate_LT;
            }

            public Date getStartDate_LE() {
                return startDate_LE;
            }

            public void setStartDate_LE(Date startDate_LE) {
                this.startDate_LE = startDate_LE;
            }

            public Date getEndDate() {
                return endDate;
            }

            public void setEndDate(Date endDate) {
                this.endDate = endDate;
            }

            public Date getEndDate_NE() {
                return endDate_NE;
            }

            public void setEndDate_NE(Date endDate_NE) {
                this.endDate_NE = endDate_NE;
            }

            public Date getEndDate_GT() {
                return endDate_GT;
            }

            public void setEndDate_GT(Date endDate_GT) {
                this.endDate_GT = endDate_GT;
            }

            public Date getEndDate_GE() {
                return endDate_GE;
            }

            public void setEndDate_GE(Date endDate_GE) {
                this.endDate_GE = endDate_GE;
            }

            public Date getEndDate_LT() {
                return endDate_LT;
            }

            public void setEndDate_LT(Date endDate_LT) {
                this.endDate_LT = endDate_LT;
            }

            public Date getEndDate_LE() {
                return endDate_LE;
            }

            public void setEndDate_LE(Date endDate_LE) {
                this.endDate_LE = endDate_LE;
            }


            public String getInvestmentField() {
                return investmentField;
            }

            public void setInvestmentField(String investmentField) {
                this.investmentField = investmentField;
            }

            public String getInvestmentField_NE() {
                return investmentField_NE;
            }

            public void setInvestmentField_NE(String investmentField_NE) {
                this.investmentField_NE = investmentField_NE;
            }

            public String getInvestmentField_IN() {
                return investmentField_IN;
            }

            public void setInvestmentField_IN(String investmentField_IN) {
                this.investmentField_IN = investmentField_IN;
            }

            public String getInvestmentField_NOTIN() {
                return investmentField_NOTIN;
            }

            public void setInvestmentField_NOTIN(String investmentField_NOTIN) {
                this.investmentField_NOTIN = investmentField_NOTIN;
            }

            public String getInvestmentField_LIKE() {
                return investmentField_LIKE;
            }

            public void setInvestmentField_LIKE(String investmentField_LIKE) {
                this.investmentField_LIKE = investmentField_LIKE;
            }

            public String getInvestmentField_NOTLIKE() {
                return investmentField_NOTLIKE;
            }

            public void setInvestmentField_NOTLIKE(String investmentField_NOTLIKE) {
                this.investmentField_NOTLIKE = investmentField_NOTLIKE;
            }


            public String getIncomeAllocation() {
                return incomeAllocation;
            }

            public void setIncomeAllocation(String incomeAllocation) {
                this.incomeAllocation = incomeAllocation;
            }

            public String getIncomeAllocation_NE() {
                return incomeAllocation_NE;
            }

            public void setIncomeAllocation_NE(String incomeAllocation_NE) {
                this.incomeAllocation_NE = incomeAllocation_NE;
            }

            public String getIncomeAllocation_IN() {
                return incomeAllocation_IN;
            }

            public void setIncomeAllocation_IN(String incomeAllocation_IN) {
                this.incomeAllocation_IN = incomeAllocation_IN;
            }

            public String getIncomeAllocation_NOTIN() {
                return incomeAllocation_NOTIN;
            }

            public void setIncomeAllocation_NOTIN(String incomeAllocation_NOTIN) {
                this.incomeAllocation_NOTIN = incomeAllocation_NOTIN;
            }

            public String getIncomeAllocation_LIKE() {
                return incomeAllocation_LIKE;
            }

            public void setIncomeAllocation_LIKE(String incomeAllocation_LIKE) {
                this.incomeAllocation_LIKE = incomeAllocation_LIKE;
            }

            public String getIncomeAllocation_NOTLIKE() {
                return incomeAllocation_NOTLIKE;
            }

            public void setIncomeAllocation_NOTLIKE(String incomeAllocation_NOTLIKE) {
                this.incomeAllocation_NOTLIKE = incomeAllocation_NOTLIKE;
            }


            public String getFundFiles() {
                return fundFiles;
            }

            public void setFundFiles(String fundFiles) {
                this.fundFiles = fundFiles;
            }

            public String getFundFiles_NE() {
                return fundFiles_NE;
            }

            public void setFundFiles_NE(String fundFiles_NE) {
                this.fundFiles_NE = fundFiles_NE;
            }

            public String getFundFiles_IN() {
                return fundFiles_IN;
            }

            public void setFundFiles_IN(String fundFiles_IN) {
                this.fundFiles_IN = fundFiles_IN;
            }

            public String getFundFiles_NOTIN() {
                return fundFiles_NOTIN;
            }

            public void setFundFiles_NOTIN(String fundFiles_NOTIN) {
                this.fundFiles_NOTIN = fundFiles_NOTIN;
            }

            public String getFundFiles_LIKE() {
                return fundFiles_LIKE;
            }

            public void setFundFiles_LIKE(String fundFiles_LIKE) {
                this.fundFiles_LIKE = fundFiles_LIKE;
            }

            public String getFundFiles_NOTLIKE() {
                return fundFiles_NOTLIKE;
            }

            public void setFundFiles_NOTLIKE(String fundFiles_NOTLIKE) {
                this.fundFiles_NOTLIKE = fundFiles_NOTLIKE;
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

            public PK getDepId() {
                return depId;
            }

            public void setDepId(PK depId) {
                this.depId = depId;
            }

            public PK getDepId_NE() {
                return depId_NE;
            }

            public void setDepId_NE(PK depId_NE) {
                this.depId_NE = depId_NE;
            }

            public PK getDepId_IN() {
                return depId_IN;
            }

            public void setDepId_IN(PK depId_IN) {
                this.depId_IN = depId_IN;
            }

            public PK getDepId_NOTIN() {
                return depId_NOTIN;
            }

            public void setDepId_NOTIN(PK depId_NOTIN) {
                this.depId_NOTIN = depId_NOTIN;
            }



            public String getOrganId() {
                return organId;
            }

            public void setOrganId(String organId) {
                this.organId = organId;
            }

            public String getOrganId_NE() {
                return organId_NE;
            }

            public void setOrganId_NE(String organId_NE) {
                this.organId_NE = organId_NE;
            }

            public String getOrganId_IN() {
                return organId_IN;
            }

            public void setOrganId_IN(String organId_IN) {
                this.organId_IN = organId_IN;
            }

            public String getOrganId_NOTIN() {
                return organId_NOTIN;
            }

            public void setOrganId_NOTIN(String organId_NOTIN) {
                this.organId_NOTIN = organId_NOTIN;
            }

            public String getOrganId_LIKE() {
                return organId_LIKE;
            }

            public void setOrganId_LIKE(String organId_LIKE) {
                this.organId_LIKE = organId_LIKE;
            }

            public String getOrganId_NOTLIKE() {
                return organId_NOTLIKE;
            }

            public void setOrganId_NOTLIKE(String organId_NOTLIKE) {
                this.organId_NOTLIKE = organId_NOTLIKE;
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