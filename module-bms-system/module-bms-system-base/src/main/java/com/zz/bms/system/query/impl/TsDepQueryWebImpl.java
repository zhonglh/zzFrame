package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 部门 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:18
*/
public class TsDepQueryWebImpl<PK extends Serializable> extends TsDepAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String depName_IN;
            private String depName_NOTIN;



            private String depCode_IN;
            private String depCode_NOTIN;



            private String depAddr_IN;
            private String depAddr_NOTIN;


            private PK pid_IN;
            private PK pid_NOTIN;



            private String depStatus_IN;
            private String depStatus_NOTIN;



            private PK leadUserId_IN;
            private PK leadUserId_NOTIN;




            private String organId_IN;
            private String organId_NOTIN;



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



            public String getDepName() {
                return depName;
            }

            public void setDepName(String depName) {
                this.depName = depName;
            }

            public String getDepName_NE() {
                return depName_NE;
            }

            public void setDepName_NE(String depName_NE) {
                this.depName_NE = depName_NE;
            }

            public String getDepName_IN() {
                return depName_IN;
            }

            public void setDepName_IN(String depName_IN) {
                this.depName_IN = depName_IN;
            }

            public String getDepName_NOTIN() {
                return depName_NOTIN;
            }

            public void setDepName_NOTIN(String depName_NOTIN) {
                this.depName_NOTIN = depName_NOTIN;
            }

            public String getDepName_LIKE() {
                return depName_LIKE;
            }

            public void setDepName_LIKE(String depName_LIKE) {
                this.depName_LIKE = depName_LIKE;
            }

            public String getDepName_NOTLIKE() {
                return depName_NOTLIKE;
            }

            public void setDepName_NOTLIKE(String depName_NOTLIKE) {
                this.depName_NOTLIKE = depName_NOTLIKE;
            }


            public String getDepCode() {
                return depCode;
            }

            public void setDepCode(String depCode) {
                this.depCode = depCode;
            }

            public String getDepCode_NE() {
                return depCode_NE;
            }

            public void setDepCode_NE(String depCode_NE) {
                this.depCode_NE = depCode_NE;
            }

            public String getDepCode_IN() {
                return depCode_IN;
            }

            public void setDepCode_IN(String depCode_IN) {
                this.depCode_IN = depCode_IN;
            }

            public String getDepCode_NOTIN() {
                return depCode_NOTIN;
            }

            public void setDepCode_NOTIN(String depCode_NOTIN) {
                this.depCode_NOTIN = depCode_NOTIN;
            }

            public String getDepCode_LIKE() {
                return depCode_LIKE;
            }

            public void setDepCode_LIKE(String depCode_LIKE) {
                this.depCode_LIKE = depCode_LIKE;
            }

            public String getDepCode_NOTLIKE() {
                return depCode_NOTLIKE;
            }

            public void setDepCode_NOTLIKE(String depCode_NOTLIKE) {
                this.depCode_NOTLIKE = depCode_NOTLIKE;
            }


            public String getDepAddr() {
                return depAddr;
            }

            public void setDepAddr(String depAddr) {
                this.depAddr = depAddr;
            }

            public String getDepAddr_NE() {
                return depAddr_NE;
            }

            public void setDepAddr_NE(String depAddr_NE) {
                this.depAddr_NE = depAddr_NE;
            }

            public String getDepAddr_IN() {
                return depAddr_IN;
            }

            public void setDepAddr_IN(String depAddr_IN) {
                this.depAddr_IN = depAddr_IN;
            }

            public String getDepAddr_NOTIN() {
                return depAddr_NOTIN;
            }

            public void setDepAddr_NOTIN(String depAddr_NOTIN) {
                this.depAddr_NOTIN = depAddr_NOTIN;
            }

            public String getDepAddr_LIKE() {
                return depAddr_LIKE;
            }

            public void setDepAddr_LIKE(String depAddr_LIKE) {
                this.depAddr_LIKE = depAddr_LIKE;
            }

            public String getDepAddr_NOTLIKE() {
                return depAddr_NOTLIKE;
            }

            public void setDepAddr_NOTLIKE(String depAddr_NOTLIKE) {
                this.depAddr_NOTLIKE = depAddr_NOTLIKE;
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


            public String getDepStatus() {
                return depStatus;
            }

            public void setDepStatus(String depStatus) {
                this.depStatus = depStatus;
            }

            public String getDepStatus_NE() {
                return depStatus_NE;
            }

            public void setDepStatus_NE(String depStatus_NE) {
                this.depStatus_NE = depStatus_NE;
            }

            public String getDepStatus_IN() {
                return depStatus_IN;
            }

            public void setDepStatus_IN(String depStatus_IN) {
                this.depStatus_IN = depStatus_IN;
            }

            public String getDepStatus_NOTIN() {
                return depStatus_NOTIN;
            }

            public void setDepStatus_NOTIN(String depStatus_NOTIN) {
                this.depStatus_NOTIN = depStatus_NOTIN;
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