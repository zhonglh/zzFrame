package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 字典信息 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:15
*/
public class TsDictQueryWebImpl<PK extends Serializable> extends TsDictAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK dictTypeId_IN;
            private PK dictTypeId_NOTIN;



            private String dictVal_IN;
            private String dictVal_NOTIN;




            private String dictName_IN;
            private String dictName_NOTIN;



            private String dictI18n_IN;
            private String dictI18n_NOTIN;



            private String dictReg_IN;
            private String dictReg_NOTIN;




        //todo INT orderby;


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


            private String deleteFlag_IN;
            private String deleteFlag_NOTIN;



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


            public PK getDictTypeId() {
                return dictTypeId;
            }

            public void setDictTypeId(PK dictTypeId) {
                this.dictTypeId = dictTypeId;
            }

            public PK getDictTypeId_NE() {
                return dictTypeId_NE;
            }

            public void setDictTypeId_NE(PK dictTypeId_NE) {
                this.dictTypeId_NE = dictTypeId_NE;
            }

            public PK getDictTypeId_IN() {
                return dictTypeId_IN;
            }

            public void setDictTypeId_IN(PK dictTypeId_IN) {
                this.dictTypeId_IN = dictTypeId_IN;
            }

            public PK getDictTypeId_NOTIN() {
                return dictTypeId_NOTIN;
            }

            public void setDictTypeId_NOTIN(PK dictTypeId_NOTIN) {
                this.dictTypeId_NOTIN = dictTypeId_NOTIN;
            }


            public String getDictVal() {
                return dictVal;
            }

            public void setDictVal(String dictVal) {
                this.dictVal = dictVal;
            }

            public String getDictVal_NE() {
                return dictVal_NE;
            }

            public void setDictVal_NE(String dictVal_NE) {
                this.dictVal_NE = dictVal_NE;
            }

            public String getDictVal_IN() {
                return dictVal_IN;
            }

            public void setDictVal_IN(String dictVal_IN) {
                this.dictVal_IN = dictVal_IN;
            }

            public String getDictVal_NOTIN() {
                return dictVal_NOTIN;
            }

            public void setDictVal_NOTIN(String dictVal_NOTIN) {
                this.dictVal_NOTIN = dictVal_NOTIN;
            }



            public String getDictName() {
                return dictName;
            }

            public void setDictName(String dictName) {
                this.dictName = dictName;
            }

            public String getDictName_NE() {
                return dictName_NE;
            }

            public void setDictName_NE(String dictName_NE) {
                this.dictName_NE = dictName_NE;
            }

            public String getDictName_IN() {
                return dictName_IN;
            }

            public void setDictName_IN(String dictName_IN) {
                this.dictName_IN = dictName_IN;
            }

            public String getDictName_NOTIN() {
                return dictName_NOTIN;
            }

            public void setDictName_NOTIN(String dictName_NOTIN) {
                this.dictName_NOTIN = dictName_NOTIN;
            }

            public String getDictName_LIKE() {
                return dictName_LIKE;
            }

            public void setDictName_LIKE(String dictName_LIKE) {
                this.dictName_LIKE = dictName_LIKE;
            }

            public String getDictName_NOTLIKE() {
                return dictName_NOTLIKE;
            }

            public void setDictName_NOTLIKE(String dictName_NOTLIKE) {
                this.dictName_NOTLIKE = dictName_NOTLIKE;
            }


            public String getDictI18n() {
                return dictI18n;
            }

            public void setDictI18n(String dictI18n) {
                this.dictI18n = dictI18n;
            }

            public String getDictI18n_NE() {
                return dictI18n_NE;
            }

            public void setDictI18n_NE(String dictI18n_NE) {
                this.dictI18n_NE = dictI18n_NE;
            }

            public String getDictI18n_IN() {
                return dictI18n_IN;
            }

            public void setDictI18n_IN(String dictI18n_IN) {
                this.dictI18n_IN = dictI18n_IN;
            }

            public String getDictI18n_NOTIN() {
                return dictI18n_NOTIN;
            }

            public void setDictI18n_NOTIN(String dictI18n_NOTIN) {
                this.dictI18n_NOTIN = dictI18n_NOTIN;
            }

            public String getDictI18n_LIKE() {
                return dictI18n_LIKE;
            }

            public void setDictI18n_LIKE(String dictI18n_LIKE) {
                this.dictI18n_LIKE = dictI18n_LIKE;
            }

            public String getDictI18n_NOTLIKE() {
                return dictI18n_NOTLIKE;
            }

            public void setDictI18n_NOTLIKE(String dictI18n_NOTLIKE) {
                this.dictI18n_NOTLIKE = dictI18n_NOTLIKE;
            }


            public String getDictReg() {
                return dictReg;
            }

            public void setDictReg(String dictReg) {
                this.dictReg = dictReg;
            }

            public String getDictReg_NE() {
                return dictReg_NE;
            }

            public void setDictReg_NE(String dictReg_NE) {
                this.dictReg_NE = dictReg_NE;
            }

            public String getDictReg_IN() {
                return dictReg_IN;
            }

            public void setDictReg_IN(String dictReg_IN) {
                this.dictReg_IN = dictReg_IN;
            }

            public String getDictReg_NOTIN() {
                return dictReg_NOTIN;
            }

            public void setDictReg_NOTIN(String dictReg_NOTIN) {
                this.dictReg_NOTIN = dictReg_NOTIN;
            }

            public String getDictReg_LIKE() {
                return dictReg_LIKE;
            }

            public void setDictReg_LIKE(String dictReg_LIKE) {
                this.dictReg_LIKE = dictReg_LIKE;
            }

            public String getDictReg_NOTLIKE() {
                return dictReg_NOTLIKE;
            }

            public void setDictReg_NOTLIKE(String dictReg_NOTLIKE) {
                this.dictReg_NOTLIKE = dictReg_NOTLIKE;
            }

            public Integer getOrderby() {
                return orderby;
            }

            public void setOrderby(Integer orderby) {
                this.orderby = orderby;
            }

            public Integer getOrderby_NE() {
                return orderby_NE;
            }

            public void setOrderby_NE(Integer orderby_NE) {
                this.orderby_NE = orderby_NE;
            }

            public Integer getOrderby_GT() {
                return orderby_GT;
            }

            public void setOrderby_GT(Integer orderby_GT) {
                this.orderby_GT = orderby_GT;
            }

            public Integer getOrderby_GE() {
                return orderby_GE;
            }

            public void setOrderby_GE(Integer orderby_GE) {
                this.orderby_GE = orderby_GE;
            }

            public Integer getOrderby_LT() {
                return orderby_LT;
            }

            public void setOrderby_LT(Integer orderby_LT) {
                this.orderby_LT = orderby_LT;
            }

            public Integer getOrderby_LE() {
                return orderby_LE;
            }

            public void setOrderby_LE(Integer orderby_LE) {
                this.orderby_LE = orderby_LE;
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