package com.zz.bms.system.base.query.impl;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户查询， 用于装载用户在查询时提交的数据
 * @param <PK>
 */
public class VsUserQueryWebImpl<PK extends Serializable> extends VsUserAbstractQueryImpl<PK> {


    private PK id_IN;
    private PK id_NOTIN;


    private String loginName_IN;
    private String loginName_NOTIN;



    private String status_IN;
    private String status_NOTIN;


    private PK leadId_IN;
    private PK leadId_NOTIN;


    private String phone_IN;
    private String phone_NOTIN;


    private String email_IN;
    private String email_NOTIN;


    private String openId_IN;
    private String openId_NOTIN;


    private String unionId_IN;
    private String unionId_NOTIN;


    private String systemAdmin_IN;
    private String systemAdmin_NOTIN;


    private PK depId_IN;
    private PK depId_NOTIN;


    private PK organId_IN;
    private PK organId_NOTIN;


    private PK createUserId_IN;
    private PK createUserId_NOTIN;


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

    public String getStatus_IN() {
        return status_IN;
    }

    public void setStatus_IN(String status_IN) {
        this.status_IN = status_IN;
    }

    public String getStatus_NOTIN() {
        return status_NOTIN;
    }

    public void setStatus_NOTIN(String status_NOTIN) {
        this.status_NOTIN = status_NOTIN;
    }

    public PK getLeadId_IN() {
        return leadId_IN;
    }

    public void setLeadId_IN(PK leadId_IN) {
        this.leadId_IN = leadId_IN;
    }

    public PK getLeadId_NOTIN() {
        return leadId_NOTIN;
    }

    public void setLeadId_NOTIN(PK leadId_NOTIN) {
        this.leadId_NOTIN = leadId_NOTIN;
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

    public PK getCreateUserId_IN() {
        return createUserId_IN;
    }

    public void setCreateUserId_IN(PK createUserId_IN) {
        this.createUserId_IN = createUserId_IN;
    }

    public PK getCreateUserId_NOTIN() {
        return createUserId_NOTIN;
    }

    public void setCreateUserId_NOTIN(PK createUserId_NOTIN) {
        this.createUserId_NOTIN = createUserId_NOTIN;
    }













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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_NE() {
        return status_NE;
    }

    public void setStatus_NE(String status_NE) {
        this.status_NE = status_NE;
    }

    public PK getLeadId() {
        return leadId;
    }

    public void setLeadId(PK leadId) {
        this.leadId = leadId;
    }

    public PK getLeadId_NE() {
        return leadId_NE;
    }

    public void setLeadId_NE(PK leadId_NE) {
        this.leadId_NE = leadId_NE;
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

    public PK getOrganId() {
        return organId;
    }

    public void setOrganId(PK organId) {
        this.organId = organId;
    }

    public PK getOrganIdAdmin_NE() {
        return organIdAdmin_NE;
    }

    public void setOrganIdAdmin_NE(PK organIdAdmin_NE) {
        this.organIdAdmin_NE = organIdAdmin_NE;
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

    public PK getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(PK createUserId) {
        this.createUserId = createUserId;
    }

    public PK getCreateUserId_NE() {
        return createUserId_NE;
    }

    public void setCreateUserId_NE(PK createUserId_NE) {
        this.createUserId_NE = createUserId_NE;
    }





}
