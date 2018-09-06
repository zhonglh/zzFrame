package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 角色 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class TsRoleQueryWebImpl<PK extends Serializable> extends TsRoleAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String roleName_IN;
            private String roleName_NOTIN;



            private String roleCode_IN;
            private String roleCode_NOTIN;


            private String roleType_IN;
            private String roleType_NOTIN;



            private PK depId_IN;
            private PK depId_NOTIN;



            private PK organId_IN;
            private PK organId_NOTIN;



            private String roleStatus_IN;
            private String roleStatus_NOTIN;




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

            private PK tenantId_IN;
            private PK tenantId_NOTIN;






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



            public String getRoleName() {
                return roleName;
            }

            public void setRoleName(String roleName) {
                this.roleName = roleName;
            }

            public String getRoleName_NE() {
                return roleName_NE;
            }

            public void setRoleName_NE(String roleName_NE) {
                this.roleName_NE = roleName_NE;
            }

            public String getRoleName_IN() {
                return roleName_IN;
            }

            public void setRoleName_IN(String roleName_IN) {
                this.roleName_IN = roleName_IN;
            }

            public String getRoleName_NOTIN() {
                return roleName_NOTIN;
            }

            public void setRoleName_NOTIN(String roleName_NOTIN) {
                this.roleName_NOTIN = roleName_NOTIN;
            }

            public String getRoleName_LIKE() {
                return roleName_LIKE;
            }

            public void setRoleName_LIKE(String roleName_LIKE) {
                this.roleName_LIKE = roleName_LIKE;
            }

            public String getRoleName_NOTLIKE() {
                return roleName_NOTLIKE;
            }

            public void setRoleName_NOTLIKE(String roleName_NOTLIKE) {
                this.roleName_NOTLIKE = roleName_NOTLIKE;
            }


            public String getRoleCode() {
                return roleCode;
            }

            public void setRoleCode(String roleCode) {
                this.roleCode = roleCode;
            }

            public String getRoleCode_NE() {
                return roleCode_NE;
            }

            public void setRoleCode_NE(String roleCode_NE) {
                this.roleCode_NE = roleCode_NE;
            }

            public String getRoleCode_IN() {
                return roleCode_IN;
            }

            public void setRoleCode_IN(String roleCode_IN) {
                this.roleCode_IN = roleCode_IN;
            }

            public String getRoleCode_NOTIN() {
                return roleCode_NOTIN;
            }

            public void setRoleCode_NOTIN(String roleCode_NOTIN) {
                this.roleCode_NOTIN = roleCode_NOTIN;
            }

            public String getRoleCode_LIKE() {
                return roleCode_LIKE;
            }

            public void setRoleCode_LIKE(String roleCode_LIKE) {
                this.roleCode_LIKE = roleCode_LIKE;
            }

            public String getRoleCode_NOTLIKE() {
                return roleCode_NOTLIKE;
            }

            public void setRoleCode_NOTLIKE(String roleCode_NOTLIKE) {
                this.roleCode_NOTLIKE = roleCode_NOTLIKE;
            }

            public String getRoleType() {
                return roleType;
            }

            public void setRoleType(String roleType) {
                this.roleType = roleType;
            }

            public String getRoleType_NE() {
                return roleType_NE;
            }

            public void setRoleType_NE(String roleType_NE) {
                this.roleType_NE = roleType_NE;
            }

            public String getRoleType_IN() {
                return roleType_IN;
            }

            public void setRoleType_IN(String roleType_IN) {
                this.roleType_IN = roleType_IN;
            }

            public String getRoleType_NOTIN() {
                return roleType_NOTIN;
            }

            public void setRoleType_NOTIN(String roleType_NOTIN) {
                this.roleType_NOTIN = roleType_NOTIN;
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


            public PK getOrganId() {
                return organId;
            }

            public void setOrganId(PK organId) {
                this.organId = organId;
            }

            public PK getOrganId_NE() {
                return organId_NE;
            }

            public void setOrganId_NE(PK organId_NE) {
                this.organId_NE = organId_NE;
            }

            public PK getOrganId_IN() {
                return organId_IN;
            }

            public void setOrganId_IN(PK organId_IN) {
                this.organId_IN = organId_IN;
            }

            public PK getOrganId_NOTIN() {
                return organId_NOTIN;
            }

            public void setOrganId_NOTIN(PK organId_NOTIN) {
                this.organId_NOTIN = organId_NOTIN;
            }


            public String getRoleStatus() {
                return roleStatus;
            }

            public void setRoleStatus(String roleStatus) {
                this.roleStatus = roleStatus;
            }

            public String getRoleStatus_NE() {
                return roleStatus_NE;
            }

            public void setRoleStatus_NE(String roleStatus_NE) {
                this.roleStatus_NE = roleStatus_NE;
            }

            public String getRoleStatus_IN() {
                return roleStatus_IN;
            }

            public void setRoleStatus_IN(String roleStatus_IN) {
                this.roleStatus_IN = roleStatus_IN;
            }

            public String getRoleStatus_NOTIN() {
                return roleStatus_NOTIN;
            }

            public void setRoleStatus_NOTIN(String roleStatus_NOTIN) {
                this.roleStatus_NOTIN = roleStatus_NOTIN;
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


            public PK getTenantId() {
                return tenantId;
            }

            public void setTenantId(PK tenantId) {
                this.tenantId = tenantId;
            }

            public PK getTenantId_NE() {
                return tenantId_NE;
            }

            public void setTenantId_NE(PK tenantId_NE) {
                this.tenantId_NE = tenantId_NE;
            }

            public PK getTenantId_IN() {
                return tenantId_IN;
            }

            public void setTenantId_IN(PK tenantId_IN) {
                this.tenantId_IN = tenantId_IN;
            }

            public PK getTenantId_NOTIN() {
                return tenantId_NOTIN;
            }

            public void setTenantId_NOTIN(PK tenantId_NOTIN) {
                this.tenantId_NOTIN = tenantId_NOTIN;
            }

}