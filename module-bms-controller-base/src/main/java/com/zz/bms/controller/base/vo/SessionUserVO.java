package com.zz.bms.controller.base.vo;

import com.zz.bms.core.db.entity.BaseEntity;
import com.zz.bms.core.db.entity.ILoginUserEntity;

import java.io.Serializable;

/**
 *
 * Session 中保存的用户信息 , 用户全信息
 * 包括用户信息  ， 用户权限信息
 * @author Administrator
 */
public class SessionUserVO extends BaseEntity<String> implements ILoginUserEntity<String>, Serializable {


    private String userName;

    private String loginName;

    private String loginPassword;

    private String salt;

    private String status;

    private String leadId;

    private String leadName;

    private String phone;

    private String email;

    private String avatarUrl;

    private String depId;

    private String organId;

    private String depName;

    private String organName;


    @Override
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    @Override
    public String toString() {
        return "SessionUserVO{" +
                "userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", salt='" + salt + '\'' +
                ", status='" + status + '\'' +
                ", leadId='" + leadId + '\'' +
                ", leadName='" + leadName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", depId='" + depId + '\'' +
                ", organId='" + organId + '\'' +
                ", depName='" + depName + '\'' +
                ", organName='" + organName + '\'' +
                '}';
    }
}
