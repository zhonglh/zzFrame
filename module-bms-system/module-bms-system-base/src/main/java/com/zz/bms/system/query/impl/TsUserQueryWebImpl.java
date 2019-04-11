package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 用户 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:19
*/
public class TsUserQueryWebImpl<PK extends Serializable> extends TsUserAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String userName_IN;
            private String userName_NOTIN;



            private String loginName_IN;
            private String loginName_NOTIN;



            private String loginPassword_IN;
            private String loginPassword_NOTIN;



            private String salt_IN;
            private String salt_NOTIN;


            private String userStatus_IN;
            private String userStatus_NOTIN;



            private PK leadUserId_IN;
            private PK leadUserId_NOTIN;




            private String phone_IN;
            private String phone_NOTIN;



            private String email_IN;
            private String email_NOTIN;



            private String avatarImage_IN;
            private String avatarImage_NOTIN;



            private String openId_IN;
            private String openId_NOTIN;



            private String unionId_IN;
            private String unionId_NOTIN;


            private String systemAdmin_IN;
            private String systemAdmin_NOTIN;



            private PK depId_IN;
            private PK depId_NOTIN;




            private String organId_IN;
            private String organId_NOTIN;




        //todo INT pageLimit;


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



            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUserName_NE() {
                return userName_NE;
            }

            public void setUserName_NE(String userName_NE) {
                this.userName_NE = userName_NE;
            }

            public String getUserName_IN() {
                return userName_IN;
            }

            public void setUserName_IN(String userName_IN) {
                this.userName_IN = userName_IN;
            }

            public String getUserName_NOTIN() {
                return userName_NOTIN;
            }

            public void setUserName_NOTIN(String userName_NOTIN) {
                this.userName_NOTIN = userName_NOTIN;
            }

            public String getUserName_LIKE() {
                return userName_LIKE;
            }

            public void setUserName_LIKE(String userName_LIKE) {
                this.userName_LIKE = userName_LIKE;
            }

            public String getUserName_NOTLIKE() {
                return userName_NOTLIKE;
            }

            public void setUserName_NOTLIKE(String userName_NOTLIKE) {
                this.userName_NOTLIKE = userName_NOTLIKE;
            }


            public String getLoginName() {
                return loginName;
            }

            public void setLoginName(String loginName) {
                this.loginName = loginName;
            }

            public String getLoginName_NE() {
                return loginName_NE;
            }

            public void setLoginName_NE(String loginName_NE) {
                this.loginName_NE = loginName_NE;
            }

            public String getLoginName_IN() {
                return loginName_IN;
            }

            public void setLoginName_IN(String loginName_IN) {
                this.loginName_IN = loginName_IN;
            }

            public String getLoginName_NOTIN() {
                return loginName_NOTIN;
            }

            public void setLoginName_NOTIN(String loginName_NOTIN) {
                this.loginName_NOTIN = loginName_NOTIN;
            }

            public String getLoginName_LIKE() {
                return loginName_LIKE;
            }

            public void setLoginName_LIKE(String loginName_LIKE) {
                this.loginName_LIKE = loginName_LIKE;
            }

            public String getLoginName_NOTLIKE() {
                return loginName_NOTLIKE;
            }

            public void setLoginName_NOTLIKE(String loginName_NOTLIKE) {
                this.loginName_NOTLIKE = loginName_NOTLIKE;
            }


            public String getLoginPassword() {
                return loginPassword;
            }

            public void setLoginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
            }

            public String getLoginPassword_NE() {
                return loginPassword_NE;
            }

            public void setLoginPassword_NE(String loginPassword_NE) {
                this.loginPassword_NE = loginPassword_NE;
            }

            public String getLoginPassword_IN() {
                return loginPassword_IN;
            }

            public void setLoginPassword_IN(String loginPassword_IN) {
                this.loginPassword_IN = loginPassword_IN;
            }

            public String getLoginPassword_NOTIN() {
                return loginPassword_NOTIN;
            }

            public void setLoginPassword_NOTIN(String loginPassword_NOTIN) {
                this.loginPassword_NOTIN = loginPassword_NOTIN;
            }

            public String getLoginPassword_LIKE() {
                return loginPassword_LIKE;
            }

            public void setLoginPassword_LIKE(String loginPassword_LIKE) {
                this.loginPassword_LIKE = loginPassword_LIKE;
            }

            public String getLoginPassword_NOTLIKE() {
                return loginPassword_NOTLIKE;
            }

            public void setLoginPassword_NOTLIKE(String loginPassword_NOTLIKE) {
                this.loginPassword_NOTLIKE = loginPassword_NOTLIKE;
            }


            public String getSalt() {
                return salt;
            }

            public void setSalt(String salt) {
                this.salt = salt;
            }

            public String getSalt_NE() {
                return salt_NE;
            }

            public void setSalt_NE(String salt_NE) {
                this.salt_NE = salt_NE;
            }

            public String getSalt_IN() {
                return salt_IN;
            }

            public void setSalt_IN(String salt_IN) {
                this.salt_IN = salt_IN;
            }

            public String getSalt_NOTIN() {
                return salt_NOTIN;
            }

            public void setSalt_NOTIN(String salt_NOTIN) {
                this.salt_NOTIN = salt_NOTIN;
            }

            public String getSalt_LIKE() {
                return salt_LIKE;
            }

            public void setSalt_LIKE(String salt_LIKE) {
                this.salt_LIKE = salt_LIKE;
            }

            public String getSalt_NOTLIKE() {
                return salt_NOTLIKE;
            }

            public void setSalt_NOTLIKE(String salt_NOTLIKE) {
                this.salt_NOTLIKE = salt_NOTLIKE;
            }

            public String getUserStatus() {
                return userStatus;
            }

            public void setUserStatus(String userStatus) {
                this.userStatus = userStatus;
            }

            public String getUserStatus_NE() {
                return userStatus_NE;
            }

            public void setUserStatus_NE(String userStatus_NE) {
                this.userStatus_NE = userStatus_NE;
            }

            public String getUserStatus_IN() {
                return userStatus_IN;
            }

            public void setUserStatus_IN(String userStatus_IN) {
                this.userStatus_IN = userStatus_IN;
            }

            public String getUserStatus_NOTIN() {
                return userStatus_NOTIN;
            }

            public void setUserStatus_NOTIN(String userStatus_NOTIN) {
                this.userStatus_NOTIN = userStatus_NOTIN;
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



            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getPhone_NE() {
                return phone_NE;
            }

            public void setPhone_NE(String phone_NE) {
                this.phone_NE = phone_NE;
            }

            public String getPhone_IN() {
                return phone_IN;
            }

            public void setPhone_IN(String phone_IN) {
                this.phone_IN = phone_IN;
            }

            public String getPhone_NOTIN() {
                return phone_NOTIN;
            }

            public void setPhone_NOTIN(String phone_NOTIN) {
                this.phone_NOTIN = phone_NOTIN;
            }

            public String getPhone_LIKE() {
                return phone_LIKE;
            }

            public void setPhone_LIKE(String phone_LIKE) {
                this.phone_LIKE = phone_LIKE;
            }

            public String getPhone_NOTLIKE() {
                return phone_NOTLIKE;
            }

            public void setPhone_NOTLIKE(String phone_NOTLIKE) {
                this.phone_NOTLIKE = phone_NOTLIKE;
            }


            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getEmail_NE() {
                return email_NE;
            }

            public void setEmail_NE(String email_NE) {
                this.email_NE = email_NE;
            }

            public String getEmail_IN() {
                return email_IN;
            }

            public void setEmail_IN(String email_IN) {
                this.email_IN = email_IN;
            }

            public String getEmail_NOTIN() {
                return email_NOTIN;
            }

            public void setEmail_NOTIN(String email_NOTIN) {
                this.email_NOTIN = email_NOTIN;
            }

            public String getEmail_LIKE() {
                return email_LIKE;
            }

            public void setEmail_LIKE(String email_LIKE) {
                this.email_LIKE = email_LIKE;
            }

            public String getEmail_NOTLIKE() {
                return email_NOTLIKE;
            }

            public void setEmail_NOTLIKE(String email_NOTLIKE) {
                this.email_NOTLIKE = email_NOTLIKE;
            }


            public String getAvatarImage() {
                return avatarImage;
            }

            public void setAvatarImage(String avatarImage) {
                this.avatarImage = avatarImage;
            }

            public String getAvatarImage_NE() {
                return avatarImage_NE;
            }

            public void setAvatarImage_NE(String avatarImage_NE) {
                this.avatarImage_NE = avatarImage_NE;
            }

            public String getAvatarImage_IN() {
                return avatarImage_IN;
            }

            public void setAvatarImage_IN(String avatarImage_IN) {
                this.avatarImage_IN = avatarImage_IN;
            }

            public String getAvatarImage_NOTIN() {
                return avatarImage_NOTIN;
            }

            public void setAvatarImage_NOTIN(String avatarImage_NOTIN) {
                this.avatarImage_NOTIN = avatarImage_NOTIN;
            }

            public String getAvatarImage_LIKE() {
                return avatarImage_LIKE;
            }

            public void setAvatarImage_LIKE(String avatarImage_LIKE) {
                this.avatarImage_LIKE = avatarImage_LIKE;
            }

            public String getAvatarImage_NOTLIKE() {
                return avatarImage_NOTLIKE;
            }

            public void setAvatarImage_NOTLIKE(String avatarImage_NOTLIKE) {
                this.avatarImage_NOTLIKE = avatarImage_NOTLIKE;
            }


            public String getOpenId() {
                return openId;
            }

            public void setOpenId(String openId) {
                this.openId = openId;
            }

            public String getOpenId_NE() {
                return openId_NE;
            }

            public void setOpenId_NE(String openId_NE) {
                this.openId_NE = openId_NE;
            }

            public String getOpenId_IN() {
                return openId_IN;
            }

            public void setOpenId_IN(String openId_IN) {
                this.openId_IN = openId_IN;
            }

            public String getOpenId_NOTIN() {
                return openId_NOTIN;
            }

            public void setOpenId_NOTIN(String openId_NOTIN) {
                this.openId_NOTIN = openId_NOTIN;
            }

            public String getOpenId_LIKE() {
                return openId_LIKE;
            }

            public void setOpenId_LIKE(String openId_LIKE) {
                this.openId_LIKE = openId_LIKE;
            }

            public String getOpenId_NOTLIKE() {
                return openId_NOTLIKE;
            }

            public void setOpenId_NOTLIKE(String openId_NOTLIKE) {
                this.openId_NOTLIKE = openId_NOTLIKE;
            }


            public String getUnionId() {
                return unionId;
            }

            public void setUnionId(String unionId) {
                this.unionId = unionId;
            }

            public String getUnionId_NE() {
                return unionId_NE;
            }

            public void setUnionId_NE(String unionId_NE) {
                this.unionId_NE = unionId_NE;
            }

            public String getUnionId_IN() {
                return unionId_IN;
            }

            public void setUnionId_IN(String unionId_IN) {
                this.unionId_IN = unionId_IN;
            }

            public String getUnionId_NOTIN() {
                return unionId_NOTIN;
            }

            public void setUnionId_NOTIN(String unionId_NOTIN) {
                this.unionId_NOTIN = unionId_NOTIN;
            }

            public String getUnionId_LIKE() {
                return unionId_LIKE;
            }

            public void setUnionId_LIKE(String unionId_LIKE) {
                this.unionId_LIKE = unionId_LIKE;
            }

            public String getUnionId_NOTLIKE() {
                return unionId_NOTLIKE;
            }

            public void setUnionId_NOTLIKE(String unionId_NOTLIKE) {
                this.unionId_NOTLIKE = unionId_NOTLIKE;
            }

            public String getSystemAdmin() {
                return systemAdmin;
            }

            public void setSystemAdmin(String systemAdmin) {
                this.systemAdmin = systemAdmin;
            }

            public String getSystemAdmin_NE() {
                return systemAdmin_NE;
            }

            public void setSystemAdmin_NE(String systemAdmin_NE) {
                this.systemAdmin_NE = systemAdmin_NE;
            }

            public String getSystemAdmin_IN() {
                return systemAdmin_IN;
            }

            public void setSystemAdmin_IN(String systemAdmin_IN) {
                this.systemAdmin_IN = systemAdmin_IN;
            }

            public String getSystemAdmin_NOTIN() {
                return systemAdmin_NOTIN;
            }

            public void setSystemAdmin_NOTIN(String systemAdmin_NOTIN) {
                this.systemAdmin_NOTIN = systemAdmin_NOTIN;
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

            public Integer getPageLimit() {
                return pageLimit;
            }

            public void setPageLimit(Integer pageLimit) {
                this.pageLimit = pageLimit;
            }

            public Integer getPageLimit_NE() {
                return pageLimit_NE;
            }

            public void setPageLimit_NE(Integer pageLimit_NE) {
                this.pageLimit_NE = pageLimit_NE;
            }

            public Integer getPageLimit_GT() {
                return pageLimit_GT;
            }

            public void setPageLimit_GT(Integer pageLimit_GT) {
                this.pageLimit_GT = pageLimit_GT;
            }

            public Integer getPageLimit_GE() {
                return pageLimit_GE;
            }

            public void setPageLimit_GE(Integer pageLimit_GE) {
                this.pageLimit_GE = pageLimit_GE;
            }

            public Integer getPageLimit_LT() {
                return pageLimit_LT;
            }

            public void setPageLimit_LT(Integer pageLimit_LT) {
                this.pageLimit_LT = pageLimit_LT;
            }

            public Integer getPageLimit_LE() {
                return pageLimit_LE;
            }

            public void setPageLimit_LE(Integer pageLimit_LE) {
                this.pageLimit_LE = pageLimit_LE;
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