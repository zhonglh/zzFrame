package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 机构 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:15
*/
public class TsOrganQueryWebImpl<PK extends Serializable> extends TsOrganAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String organName_IN;
            private String organName_NOTIN;



            private String organCode_IN;
            private String organCode_NOTIN;


            private String organType_IN;
            private String organType_NOTIN;




            private String organAddr_IN;
            private String organAddr_NOTIN;


            private PK pid_IN;
            private PK pid_NOTIN;



            private String organStatus_IN;
            private String organStatus_NOTIN;



            private PK leadUserId_IN;
            private PK leadUserId_NOTIN;




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



            public String getOrganName() {
                return organName;
            }

            public void setOrganName(String organName) {
                this.organName = organName;
            }

            public String getOrganName_NE() {
                return organName_NE;
            }

            public void setOrganName_NE(String organName_NE) {
                this.organName_NE = organName_NE;
            }

            public String getOrganName_IN() {
                return organName_IN;
            }

            public void setOrganName_IN(String organName_IN) {
                this.organName_IN = organName_IN;
            }

            public String getOrganName_NOTIN() {
                return organName_NOTIN;
            }

            public void setOrganName_NOTIN(String organName_NOTIN) {
                this.organName_NOTIN = organName_NOTIN;
            }

            public String getOrganName_LIKE() {
                return organName_LIKE;
            }

            public void setOrganName_LIKE(String organName_LIKE) {
                this.organName_LIKE = organName_LIKE;
            }

            public String getOrganName_NOTLIKE() {
                return organName_NOTLIKE;
            }

            public void setOrganName_NOTLIKE(String organName_NOTLIKE) {
                this.organName_NOTLIKE = organName_NOTLIKE;
            }


            public String getOrganCode() {
                return organCode;
            }

            public void setOrganCode(String organCode) {
                this.organCode = organCode;
            }

            public String getOrganCode_NE() {
                return organCode_NE;
            }

            public void setOrganCode_NE(String organCode_NE) {
                this.organCode_NE = organCode_NE;
            }

            public String getOrganCode_IN() {
                return organCode_IN;
            }

            public void setOrganCode_IN(String organCode_IN) {
                this.organCode_IN = organCode_IN;
            }

            public String getOrganCode_NOTIN() {
                return organCode_NOTIN;
            }

            public void setOrganCode_NOTIN(String organCode_NOTIN) {
                this.organCode_NOTIN = organCode_NOTIN;
            }

            public String getOrganCode_LIKE() {
                return organCode_LIKE;
            }

            public void setOrganCode_LIKE(String organCode_LIKE) {
                this.organCode_LIKE = organCode_LIKE;
            }

            public String getOrganCode_NOTLIKE() {
                return organCode_NOTLIKE;
            }

            public void setOrganCode_NOTLIKE(String organCode_NOTLIKE) {
                this.organCode_NOTLIKE = organCode_NOTLIKE;
            }

            public String getOrganType() {
                return organType;
            }

            public void setOrganType(String organType) {
                this.organType = organType;
            }

            public String getOrganType_NE() {
                return organType_NE;
            }

            public void setOrganType_NE(String organType_NE) {
                this.organType_NE = organType_NE;
            }

            public String getOrganType_IN() {
                return organType_IN;
            }

            public void setOrganType_IN(String organType_IN) {
                this.organType_IN = organType_IN;
            }

            public String getOrganType_NOTIN() {
                return organType_NOTIN;
            }

            public void setOrganType_NOTIN(String organType_NOTIN) {
                this.organType_NOTIN = organType_NOTIN;
            }



            public String getOrganAddr() {
                return organAddr;
            }

            public void setOrganAddr(String organAddr) {
                this.organAddr = organAddr;
            }

            public String getOrganAddr_NE() {
                return organAddr_NE;
            }

            public void setOrganAddr_NE(String organAddr_NE) {
                this.organAddr_NE = organAddr_NE;
            }

            public String getOrganAddr_IN() {
                return organAddr_IN;
            }

            public void setOrganAddr_IN(String organAddr_IN) {
                this.organAddr_IN = organAddr_IN;
            }

            public String getOrganAddr_NOTIN() {
                return organAddr_NOTIN;
            }

            public void setOrganAddr_NOTIN(String organAddr_NOTIN) {
                this.organAddr_NOTIN = organAddr_NOTIN;
            }

            public String getOrganAddr_LIKE() {
                return organAddr_LIKE;
            }

            public void setOrganAddr_LIKE(String organAddr_LIKE) {
                this.organAddr_LIKE = organAddr_LIKE;
            }

            public String getOrganAddr_NOTLIKE() {
                return organAddr_NOTLIKE;
            }

            public void setOrganAddr_NOTLIKE(String organAddr_NOTLIKE) {
                this.organAddr_NOTLIKE = organAddr_NOTLIKE;
            }

            public PK getPid() {
                return pid;
            }

            public void setPid(PK pid) {
                this.pid = pid;
            }

            public PK getPid_NE() {
                return pid_NE;
            }

            public void setPid_NE(PK pid_NE) {
                this.pid_NE = pid_NE;
            }

            public PK getPid_IN() {
                return pid_IN;
            }

            public void setPid_IN(PK pid_IN) {
                this.pid_IN = pid_IN;
            }

            public PK getPid_NOTIN() {
                return pid_NOTIN;
            }

            public void setPid_NOTIN(PK pid_NOTIN) {
                this.pid_NOTIN = pid_NOTIN;
            }


            public String getOrganStatus() {
                return organStatus;
            }

            public void setOrganStatus(String organStatus) {
                this.organStatus = organStatus;
            }

            public String getOrganStatus_NE() {
                return organStatus_NE;
            }

            public void setOrganStatus_NE(String organStatus_NE) {
                this.organStatus_NE = organStatus_NE;
            }

            public String getOrganStatus_IN() {
                return organStatus_IN;
            }

            public void setOrganStatus_IN(String organStatus_IN) {
                this.organStatus_IN = organStatus_IN;
            }

            public String getOrganStatus_NOTIN() {
                return organStatus_NOTIN;
            }

            public void setOrganStatus_NOTIN(String organStatus_NOTIN) {
                this.organStatus_NOTIN = organStatus_NOTIN;
            }


            public PK getLeadUserId() {
                return leadUserId;
            }

            public void setLeadUserId(PK leadUserId) {
                this.leadUserId = leadUserId;
            }

            public PK getLeadUserId_NE() {
                return leadUserId_NE;
            }

            public void setLeadUserId_NE(PK leadUserId_NE) {
                this.leadUserId_NE = leadUserId_NE;
            }

            public PK getLeadUserId_IN() {
                return leadUserId_IN;
            }

            public void setLeadUserId_IN(PK leadUserId_IN) {
                this.leadUserId_IN = leadUserId_IN;
            }

            public PK getLeadUserId_NOTIN() {
                return leadUserId_NOTIN;
            }

            public void setLeadUserId_NOTIN(PK leadUserId_NOTIN) {
                this.leadUserId_NOTIN = leadUserId_NOTIN;
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