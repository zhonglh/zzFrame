package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 消息模板 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class TsMsgTempletQueryWebImpl<PK extends Serializable> extends TsMsgTempletAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;




            private String msgTempletName_IN;
            private String msgTempletName_NOTIN;


            private String msgTempletType_IN;
            private String msgTempletType_NOTIN;




            private String msgTitle_IN;
            private String msgTitle_NOTIN;



            private String msgContent_IN;
            private String msgContent_NOTIN;


            private String msgLanguage_IN;
            private String msgLanguage_NOTIN;



            private String templetEffective_IN;
            private String templetEffective_NOTIN;



            private PK depId_IN;
            private PK depId_NOTIN;



            private PK organId_IN;
            private PK organId_NOTIN;




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



            public String getMsgTempletName() {
                return msgTempletName;
            }

            public void setMsgTempletName(String msgTempletName) {
                this.msgTempletName = msgTempletName;
            }

            public String getMsgTempletName_NE() {
                return msgTempletName_NE;
            }

            public void setMsgTempletName_NE(String msgTempletName_NE) {
                this.msgTempletName_NE = msgTempletName_NE;
            }

            public String getMsgTempletName_IN() {
                return msgTempletName_IN;
            }

            public void setMsgTempletName_IN(String msgTempletName_IN) {
                this.msgTempletName_IN = msgTempletName_IN;
            }

            public String getMsgTempletName_NOTIN() {
                return msgTempletName_NOTIN;
            }

            public void setMsgTempletName_NOTIN(String msgTempletName_NOTIN) {
                this.msgTempletName_NOTIN = msgTempletName_NOTIN;
            }

            public String getMsgTempletName_LIKE() {
                return msgTempletName_LIKE;
            }

            public void setMsgTempletName_LIKE(String msgTempletName_LIKE) {
                this.msgTempletName_LIKE = msgTempletName_LIKE;
            }

            public String getMsgTempletName_NOTLIKE() {
                return msgTempletName_NOTLIKE;
            }

            public void setMsgTempletName_NOTLIKE(String msgTempletName_NOTLIKE) {
                this.msgTempletName_NOTLIKE = msgTempletName_NOTLIKE;
            }

            public String getMsgTempletType() {
                return msgTempletType;
            }

            public void setMsgTempletType(String msgTempletType) {
                this.msgTempletType = msgTempletType;
            }

            public String getMsgTempletType_NE() {
                return msgTempletType_NE;
            }

            public void setMsgTempletType_NE(String msgTempletType_NE) {
                this.msgTempletType_NE = msgTempletType_NE;
            }

            public String getMsgTempletType_IN() {
                return msgTempletType_IN;
            }

            public void setMsgTempletType_IN(String msgTempletType_IN) {
                this.msgTempletType_IN = msgTempletType_IN;
            }

            public String getMsgTempletType_NOTIN() {
                return msgTempletType_NOTIN;
            }

            public void setMsgTempletType_NOTIN(String msgTempletType_NOTIN) {
                this.msgTempletType_NOTIN = msgTempletType_NOTIN;
            }



            public String getMsgTitle() {
                return msgTitle;
            }

            public void setMsgTitle(String msgTitle) {
                this.msgTitle = msgTitle;
            }

            public String getMsgTitle_NE() {
                return msgTitle_NE;
            }

            public void setMsgTitle_NE(String msgTitle_NE) {
                this.msgTitle_NE = msgTitle_NE;
            }

            public String getMsgTitle_IN() {
                return msgTitle_IN;
            }

            public void setMsgTitle_IN(String msgTitle_IN) {
                this.msgTitle_IN = msgTitle_IN;
            }

            public String getMsgTitle_NOTIN() {
                return msgTitle_NOTIN;
            }

            public void setMsgTitle_NOTIN(String msgTitle_NOTIN) {
                this.msgTitle_NOTIN = msgTitle_NOTIN;
            }

            public String getMsgTitle_LIKE() {
                return msgTitle_LIKE;
            }

            public void setMsgTitle_LIKE(String msgTitle_LIKE) {
                this.msgTitle_LIKE = msgTitle_LIKE;
            }

            public String getMsgTitle_NOTLIKE() {
                return msgTitle_NOTLIKE;
            }

            public void setMsgTitle_NOTLIKE(String msgTitle_NOTLIKE) {
                this.msgTitle_NOTLIKE = msgTitle_NOTLIKE;
            }


            public String getMsgContent() {
                return msgContent;
            }

            public void setMsgContent(String msgContent) {
                this.msgContent = msgContent;
            }

            public String getMsgContent_NE() {
                return msgContent_NE;
            }

            public void setMsgContent_NE(String msgContent_NE) {
                this.msgContent_NE = msgContent_NE;
            }

            public String getMsgContent_IN() {
                return msgContent_IN;
            }

            public void setMsgContent_IN(String msgContent_IN) {
                this.msgContent_IN = msgContent_IN;
            }

            public String getMsgContent_NOTIN() {
                return msgContent_NOTIN;
            }

            public void setMsgContent_NOTIN(String msgContent_NOTIN) {
                this.msgContent_NOTIN = msgContent_NOTIN;
            }

            public String getMsgContent_LIKE() {
                return msgContent_LIKE;
            }

            public void setMsgContent_LIKE(String msgContent_LIKE) {
                this.msgContent_LIKE = msgContent_LIKE;
            }

            public String getMsgContent_NOTLIKE() {
                return msgContent_NOTLIKE;
            }

            public void setMsgContent_NOTLIKE(String msgContent_NOTLIKE) {
                this.msgContent_NOTLIKE = msgContent_NOTLIKE;
            }

            public String getMsgLanguage() {
                return msgLanguage;
            }

            public void setMsgLanguage(String msgLanguage) {
                this.msgLanguage = msgLanguage;
            }

            public String getMsgLanguage_NE() {
                return msgLanguage_NE;
            }

            public void setMsgLanguage_NE(String msgLanguage_NE) {
                this.msgLanguage_NE = msgLanguage_NE;
            }

            public String getMsgLanguage_IN() {
                return msgLanguage_IN;
            }

            public void setMsgLanguage_IN(String msgLanguage_IN) {
                this.msgLanguage_IN = msgLanguage_IN;
            }

            public String getMsgLanguage_NOTIN() {
                return msgLanguage_NOTIN;
            }

            public void setMsgLanguage_NOTIN(String msgLanguage_NOTIN) {
                this.msgLanguage_NOTIN = msgLanguage_NOTIN;
            }


            public String getTempletEffective() {
                return templetEffective;
            }

            public void setTempletEffective(String templetEffective) {
                this.templetEffective = templetEffective;
            }

            public String getTempletEffective_NE() {
                return templetEffective_NE;
            }

            public void setTempletEffective_NE(String templetEffective_NE) {
                this.templetEffective_NE = templetEffective_NE;
            }

            public String getTempletEffective_IN() {
                return templetEffective_IN;
            }

            public void setTempletEffective_IN(String templetEffective_IN) {
                this.templetEffective_IN = templetEffective_IN;
            }

            public String getTempletEffective_NOTIN() {
                return templetEffective_NOTIN;
            }

            public void setTempletEffective_NOTIN(String templetEffective_NOTIN) {
                this.templetEffective_NOTIN = templetEffective_NOTIN;
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