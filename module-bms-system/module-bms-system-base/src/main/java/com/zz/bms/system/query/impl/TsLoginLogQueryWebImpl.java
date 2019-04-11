package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;

/**
* 登陆日志 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:18
*/
public class TsLoginLogQueryWebImpl<PK extends Serializable> extends TsLoginLogAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private String operationType_IN;
            private String operationType_NOTIN;




            private String operationlogName_IN;
            private String operationlogName_NOTIN;


            private PK depId_IN;
            private PK depId_NOTIN;




            private String organId_IN;
            private String organId_NOTIN;



            private String operationUserId_IN;
            private String operationUserId_NOTIN;



            private String operationIp_IN;
            private String operationIp_NOTIN;



            private String operationUserName_IN;
            private String operationUserName_NOTIN;




        //todo TIMESTAMP operationTime;


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


            public String getOperationType() {
                return operationType;
            }

            public void setOperationType(String operationType) {
                this.operationType = operationType;
            }

            public String getOperationType_NE() {
                return operationType_NE;
            }

            public void setOperationType_NE(String operationType_NE) {
                this.operationType_NE = operationType_NE;
            }

            public String getOperationType_IN() {
                return operationType_IN;
            }

            public void setOperationType_IN(String operationType_IN) {
                this.operationType_IN = operationType_IN;
            }

            public String getOperationType_NOTIN() {
                return operationType_NOTIN;
            }

            public void setOperationType_NOTIN(String operationType_NOTIN) {
                this.operationType_NOTIN = operationType_NOTIN;
            }



            public String getOperationlogName() {
                return operationlogName;
            }

            public void setOperationlogName(String operationlogName) {
                this.operationlogName = operationlogName;
            }

            public String getOperationlogName_NE() {
                return operationlogName_NE;
            }

            public void setOperationlogName_NE(String operationlogName_NE) {
                this.operationlogName_NE = operationlogName_NE;
            }

            public String getOperationlogName_IN() {
                return operationlogName_IN;
            }

            public void setOperationlogName_IN(String operationlogName_IN) {
                this.operationlogName_IN = operationlogName_IN;
            }

            public String getOperationlogName_NOTIN() {
                return operationlogName_NOTIN;
            }

            public void setOperationlogName_NOTIN(String operationlogName_NOTIN) {
                this.operationlogName_NOTIN = operationlogName_NOTIN;
            }

            public String getOperationlogName_LIKE() {
                return operationlogName_LIKE;
            }

            public void setOperationlogName_LIKE(String operationlogName_LIKE) {
                this.operationlogName_LIKE = operationlogName_LIKE;
            }

            public String getOperationlogName_NOTLIKE() {
                return operationlogName_NOTLIKE;
            }

            public void setOperationlogName_NOTLIKE(String operationlogName_NOTLIKE) {
                this.operationlogName_NOTLIKE = operationlogName_NOTLIKE;
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


            public String getOperationUserId() {
                return operationUserId;
            }

            public void setOperationUserId(String operationUserId) {
                this.operationUserId = operationUserId;
            }

            public String getOperationUserId_NE() {
                return operationUserId_NE;
            }

            public void setOperationUserId_NE(String operationUserId_NE) {
                this.operationUserId_NE = operationUserId_NE;
            }

            public String getOperationUserId_IN() {
                return operationUserId_IN;
            }

            public void setOperationUserId_IN(String operationUserId_IN) {
                this.operationUserId_IN = operationUserId_IN;
            }

            public String getOperationUserId_NOTIN() {
                return operationUserId_NOTIN;
            }

            public void setOperationUserId_NOTIN(String operationUserId_NOTIN) {
                this.operationUserId_NOTIN = operationUserId_NOTIN;
            }

            public String getOperationUserId_LIKE() {
                return operationUserId_LIKE;
            }

            public void setOperationUserId_LIKE(String operationUserId_LIKE) {
                this.operationUserId_LIKE = operationUserId_LIKE;
            }

            public String getOperationUserId_NOTLIKE() {
                return operationUserId_NOTLIKE;
            }

            public void setOperationUserId_NOTLIKE(String operationUserId_NOTLIKE) {
                this.operationUserId_NOTLIKE = operationUserId_NOTLIKE;
            }


            public String getOperationIp() {
                return operationIp;
            }

            public void setOperationIp(String operationIp) {
                this.operationIp = operationIp;
            }

            public String getOperationIp_NE() {
                return operationIp_NE;
            }

            public void setOperationIp_NE(String operationIp_NE) {
                this.operationIp_NE = operationIp_NE;
            }

            public String getOperationIp_IN() {
                return operationIp_IN;
            }

            public void setOperationIp_IN(String operationIp_IN) {
                this.operationIp_IN = operationIp_IN;
            }

            public String getOperationIp_NOTIN() {
                return operationIp_NOTIN;
            }

            public void setOperationIp_NOTIN(String operationIp_NOTIN) {
                this.operationIp_NOTIN = operationIp_NOTIN;
            }

            public String getOperationIp_LIKE() {
                return operationIp_LIKE;
            }

            public void setOperationIp_LIKE(String operationIp_LIKE) {
                this.operationIp_LIKE = operationIp_LIKE;
            }

            public String getOperationIp_NOTLIKE() {
                return operationIp_NOTLIKE;
            }

            public void setOperationIp_NOTLIKE(String operationIp_NOTLIKE) {
                this.operationIp_NOTLIKE = operationIp_NOTLIKE;
            }


            public String getOperationUserName() {
                return operationUserName;
            }

            public void setOperationUserName(String operationUserName) {
                this.operationUserName = operationUserName;
            }

            public String getOperationUserName_NE() {
                return operationUserName_NE;
            }

            public void setOperationUserName_NE(String operationUserName_NE) {
                this.operationUserName_NE = operationUserName_NE;
            }

            public String getOperationUserName_IN() {
                return operationUserName_IN;
            }

            public void setOperationUserName_IN(String operationUserName_IN) {
                this.operationUserName_IN = operationUserName_IN;
            }

            public String getOperationUserName_NOTIN() {
                return operationUserName_NOTIN;
            }

            public void setOperationUserName_NOTIN(String operationUserName_NOTIN) {
                this.operationUserName_NOTIN = operationUserName_NOTIN;
            }

            public String getOperationUserName_LIKE() {
                return operationUserName_LIKE;
            }

            public void setOperationUserName_LIKE(String operationUserName_LIKE) {
                this.operationUserName_LIKE = operationUserName_LIKE;
            }

            public String getOperationUserName_NOTLIKE() {
                return operationUserName_NOTLIKE;
            }

            public void setOperationUserName_NOTLIKE(String operationUserName_NOTLIKE) {
                this.operationUserName_NOTLIKE = operationUserName_NOTLIKE;
            }

            public Timestamp getOperationTime() {
                return operationTime;
            }

            public void setOperationTime(Timestamp operationTime) {
                this.operationTime = operationTime;
            }

            public Timestamp getOperationTime_NE() {
                return operationTime_NE;
            }

            public void setOperationTime_NE(Timestamp operationTime_NE) {
                this.operationTime_NE = operationTime_NE;
            }

            public Timestamp getOperationTime_GT() {
                return operationTime_GT;
            }

            public void setOperationTime_GT(Timestamp operationTime_GT) {
                this.operationTime_GT = operationTime_GT;
            }

            public Timestamp getOperationTime_GE() {
                return operationTime_GE;
            }

            public void setOperationTime_GE(Timestamp operationTime_GE) {
                this.operationTime_GE = operationTime_GE;
            }

            public Timestamp getOperationTime_LT() {
                return operationTime_LT;
            }

            public void setOperationTime_LT(Timestamp operationTime_LT) {
                this.operationTime_LT = operationTime_LT;
            }

            public Timestamp getOperationTime_LE() {
                return operationTime_LE;
            }

            public void setOperationTime_LE(Timestamp operationTime_LE) {
                this.operationTime_LE = operationTime_LE;
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