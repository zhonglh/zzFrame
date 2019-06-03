package com.zz.bms.example.query.impl;


import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 投资协议 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-6-3 10:12:56
*/
public class TbInvestorAgreementQueryWebImpl<PK extends Serializable> extends TbInvestorAgreementAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String agreementName_IN;
            private String agreementName_NOTIN;



            private String agreementCode_IN;
            private String agreementCode_NOTIN;


            private PK fundId_IN;
            private PK fundId_NOTIN;



            private PK investorId_IN;
            private PK investorId_NOTIN;





        //todo DECIMAL amount;



        //todo DECIMAL actualAmount;


            private String sketch_IN;
            private String sketch_NOTIN;


            private PK signDepId_IN;
            private PK signDepId_NOTIN;




            private String signOrganId_IN;
            private String signOrganId_NOTIN;


            private PK signUserId_IN;
            private PK signUserId_NOTIN;





        //todo DATE signDate;


            private String agreementFiles_IN;
            private String agreementFiles_NOTIN;



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



            public String getAgreementName() {
                return agreementName;
            }

            public void setAgreementName(String agreementName) {
                this.agreementName = agreementName;
            }

            public String getAgreementName_NE() {
                return agreementName_NE;
            }

            public void setAgreementName_NE(String agreementName_NE) {
                this.agreementName_NE = agreementName_NE;
            }

            public String getAgreementName_IN() {
                return agreementName_IN;
            }

            public void setAgreementName_IN(String agreementName_IN) {
                this.agreementName_IN = agreementName_IN;
            }

            public String getAgreementName_NOTIN() {
                return agreementName_NOTIN;
            }

            public void setAgreementName_NOTIN(String agreementName_NOTIN) {
                this.agreementName_NOTIN = agreementName_NOTIN;
            }

            public String getAgreementName_LIKE() {
                return agreementName_LIKE;
            }

            public void setAgreementName_LIKE(String agreementName_LIKE) {
                this.agreementName_LIKE = agreementName_LIKE;
            }

            public String getAgreementName_NOTLIKE() {
                return agreementName_NOTLIKE;
            }

            public void setAgreementName_NOTLIKE(String agreementName_NOTLIKE) {
                this.agreementName_NOTLIKE = agreementName_NOTLIKE;
            }


            public String getAgreementCode() {
                return agreementCode;
            }

            public void setAgreementCode(String agreementCode) {
                this.agreementCode = agreementCode;
            }

            public String getAgreementCode_NE() {
                return agreementCode_NE;
            }

            public void setAgreementCode_NE(String agreementCode_NE) {
                this.agreementCode_NE = agreementCode_NE;
            }

            public String getAgreementCode_IN() {
                return agreementCode_IN;
            }

            public void setAgreementCode_IN(String agreementCode_IN) {
                this.agreementCode_IN = agreementCode_IN;
            }

            public String getAgreementCode_NOTIN() {
                return agreementCode_NOTIN;
            }

            public void setAgreementCode_NOTIN(String agreementCode_NOTIN) {
                this.agreementCode_NOTIN = agreementCode_NOTIN;
            }

            public String getAgreementCode_LIKE() {
                return agreementCode_LIKE;
            }

            public void setAgreementCode_LIKE(String agreementCode_LIKE) {
                this.agreementCode_LIKE = agreementCode_LIKE;
            }

            public String getAgreementCode_NOTLIKE() {
                return agreementCode_NOTLIKE;
            }

            public void setAgreementCode_NOTLIKE(String agreementCode_NOTLIKE) {
                this.agreementCode_NOTLIKE = agreementCode_NOTLIKE;
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


            public BigDecimal getAmount() {
                return amount;
            }

            public void setAmount(BigDecimal amount) {
                this.amount = amount;
            }

            public BigDecimal getAmount_NE() {
                return amount_NE;
            }

            public void setAmount_NE(BigDecimal amount_NE) {
                this.amount_NE = amount_NE;
            }

            public BigDecimal getAmount_GT() {
                return amount_GT;
            }

            public void setAmount_GT(BigDecimal amount_GT) {
                this.amount_GT = amount_GT;
            }

            public BigDecimal getAmount_GE() {
                return amount_GE;
            }

            public void setAmount_GE(BigDecimal amount_GE) {
                this.amount_GE = amount_GE;
            }

            public BigDecimal getAmount_LT() {
                return amount_LT;
            }

            public void setAmount_LT(BigDecimal amount_LT) {
                this.amount_LT = amount_LT;
            }

            public BigDecimal getAmount_LE() {
                return amount_LE;
            }

            public void setAmount_LE(BigDecimal amount_LE) {
                this.amount_LE = amount_LE;
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



            public String getSketch() {
                return sketch;
            }

            public void setSketch(String sketch) {
                this.sketch = sketch;
            }

            public String getSketch_NE() {
                return sketch_NE;
            }

            public void setSketch_NE(String sketch_NE) {
                this.sketch_NE = sketch_NE;
            }

            public String getSketch_IN() {
                return sketch_IN;
            }

            public void setSketch_IN(String sketch_IN) {
                this.sketch_IN = sketch_IN;
            }

            public String getSketch_NOTIN() {
                return sketch_NOTIN;
            }

            public void setSketch_NOTIN(String sketch_NOTIN) {
                this.sketch_NOTIN = sketch_NOTIN;
            }

            public String getSketch_LIKE() {
                return sketch_LIKE;
            }

            public void setSketch_LIKE(String sketch_LIKE) {
                this.sketch_LIKE = sketch_LIKE;
            }

            public String getSketch_NOTLIKE() {
                return sketch_NOTLIKE;
            }

            public void setSketch_NOTLIKE(String sketch_NOTLIKE) {
                this.sketch_NOTLIKE = sketch_NOTLIKE;
            }

            public PK getSignDepId() {
                return signDepId;
            }

            public void setSignDepId(PK signDepId) {
                this.signDepId = signDepId;
            }

            public PK getSignDepId_NE() {
                return signDepId_NE;
            }

            public void setSignDepId_NE(PK signDepId_NE) {
                this.signDepId_NE = signDepId_NE;
            }

            public PK getSignDepId_IN() {
                return signDepId_IN;
            }

            public void setSignDepId_IN(PK signDepId_IN) {
                this.signDepId_IN = signDepId_IN;
            }

            public PK getSignDepId_NOTIN() {
                return signDepId_NOTIN;
            }

            public void setSignDepId_NOTIN(PK signDepId_NOTIN) {
                this.signDepId_NOTIN = signDepId_NOTIN;
            }



            public String getSignOrganId() {
                return signOrganId;
            }

            public void setSignOrganId(String signOrganId) {
                this.signOrganId = signOrganId;
            }

            public String getSignOrganId_NE() {
                return signOrganId_NE;
            }

            public void setSignOrganId_NE(String signOrganId_NE) {
                this.signOrganId_NE = signOrganId_NE;
            }

            public String getSignOrganId_IN() {
                return signOrganId_IN;
            }

            public void setSignOrganId_IN(String signOrganId_IN) {
                this.signOrganId_IN = signOrganId_IN;
            }

            public String getSignOrganId_NOTIN() {
                return signOrganId_NOTIN;
            }

            public void setSignOrganId_NOTIN(String signOrganId_NOTIN) {
                this.signOrganId_NOTIN = signOrganId_NOTIN;
            }

            public String getSignOrganId_LIKE() {
                return signOrganId_LIKE;
            }

            public void setSignOrganId_LIKE(String signOrganId_LIKE) {
                this.signOrganId_LIKE = signOrganId_LIKE;
            }

            public String getSignOrganId_NOTLIKE() {
                return signOrganId_NOTLIKE;
            }

            public void setSignOrganId_NOTLIKE(String signOrganId_NOTLIKE) {
                this.signOrganId_NOTLIKE = signOrganId_NOTLIKE;
            }

            public PK getSignUserId() {
                return signUserId;
            }

            public void setSignUserId(PK signUserId) {
                this.signUserId = signUserId;
            }

            public PK getSignUserId_NE() {
                return signUserId_NE;
            }

            public void setSignUserId_NE(PK signUserId_NE) {
                this.signUserId_NE = signUserId_NE;
            }

            public PK getSignUserId_IN() {
                return signUserId_IN;
            }

            public void setSignUserId_IN(PK signUserId_IN) {
                this.signUserId_IN = signUserId_IN;
            }

            public PK getSignUserId_NOTIN() {
                return signUserId_NOTIN;
            }

            public void setSignUserId_NOTIN(PK signUserId_NOTIN) {
                this.signUserId_NOTIN = signUserId_NOTIN;
            }


            public Date getSignDate() {
                return signDate;
            }

            public void setSignDate(Date signDate) {
                this.signDate = signDate;
            }

            public Date getSignDate_NE() {
                return signDate_NE;
            }

            public void setSignDate_NE(Date signDate_NE) {
                this.signDate_NE = signDate_NE;
            }

            public Date getSignDate_GT() {
                return signDate_GT;
            }

            public void setSignDate_GT(Date signDate_GT) {
                this.signDate_GT = signDate_GT;
            }

            public Date getSignDate_GE() {
                return signDate_GE;
            }

            public void setSignDate_GE(Date signDate_GE) {
                this.signDate_GE = signDate_GE;
            }

            public Date getSignDate_LT() {
                return signDate_LT;
            }

            public void setSignDate_LT(Date signDate_LT) {
                this.signDate_LT = signDate_LT;
            }

            public Date getSignDate_LE() {
                return signDate_LE;
            }

            public void setSignDate_LE(Date signDate_LE) {
                this.signDate_LE = signDate_LE;
            }


            public String getAgreementFiles() {
                return agreementFiles;
            }

            public void setAgreementFiles(String agreementFiles) {
                this.agreementFiles = agreementFiles;
            }

            public String getAgreementFiles_NE() {
                return agreementFiles_NE;
            }

            public void setAgreementFiles_NE(String agreementFiles_NE) {
                this.agreementFiles_NE = agreementFiles_NE;
            }

            public String getAgreementFiles_IN() {
                return agreementFiles_IN;
            }

            public void setAgreementFiles_IN(String agreementFiles_IN) {
                this.agreementFiles_IN = agreementFiles_IN;
            }

            public String getAgreementFiles_NOTIN() {
                return agreementFiles_NOTIN;
            }

            public void setAgreementFiles_NOTIN(String agreementFiles_NOTIN) {
                this.agreementFiles_NOTIN = agreementFiles_NOTIN;
            }

            public String getAgreementFiles_LIKE() {
                return agreementFiles_LIKE;
            }

            public void setAgreementFiles_LIKE(String agreementFiles_LIKE) {
                this.agreementFiles_LIKE = agreementFiles_LIKE;
            }

            public String getAgreementFiles_NOTLIKE() {
                return agreementFiles_NOTLIKE;
            }

            public void setAgreementFiles_NOTLIKE(String agreementFiles_NOTLIKE) {
                this.agreementFiles_NOTLIKE = agreementFiles_NOTLIKE;
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