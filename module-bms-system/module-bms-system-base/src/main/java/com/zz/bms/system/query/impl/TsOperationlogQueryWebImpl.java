package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.sql.Timestamp;
import java.lang.String;

/**
* 操作日志 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class TsOperationlogQueryWebImpl<PK extends Serializable> extends TsOperationlogAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private String operationType_IN;
            private String operationType_NOTIN;



            private String entityType_IN;
            private String entityType_NOTIN;




            private String operationlogName_IN;
            private String operationlogName_NOTIN;


            private PK depId_IN;
            private PK depId_NOTIN;



            private PK organId_IN;
            private PK organId_NOTIN;



            private PK operationUserId_IN;
            private PK operationUserId_NOTIN;




            private String operationIp_IN;
            private String operationIp_NOTIN;



            private String operationUserName_IN;
            private String operationUserName_NOTIN;




        //todo TIMESTAMP operationTime;

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


            public String getEntityType() {
                return entityType;
            }

            public void setEntityType(String entityType) {
                this.entityType = entityType;
            }

            public String getEntityType_NE() {
                return entityType_NE;
            }

            public void setEntityType_NE(String entityType_NE) {
                this.entityType_NE = entityType_NE;
            }

            public String getEntityType_IN() {
                return entityType_IN;
            }

            public void setEntityType_IN(String entityType_IN) {
                this.entityType_IN = entityType_IN;
            }

            public String getEntityType_NOTIN() {
                return entityType_NOTIN;
            }

            public void setEntityType_NOTIN(String entityType_NOTIN) {
                this.entityType_NOTIN = entityType_NOTIN;
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


            public PK getOperationUserId() {
                return operationUserId;
            }

            public void setOperationUserId(PK operationUserId) {
                this.operationUserId = operationUserId;
            }

            public PK getOperationUserId_NE() {
                return operationUserId_NE;
            }

            public void setOperationUserId_NE(PK operationUserId_NE) {
                this.operationUserId_NE = operationUserId_NE;
            }

            public PK getOperationUserId_IN() {
                return operationUserId_IN;
            }

            public void setOperationUserId_IN(PK operationUserId_IN) {
                this.operationUserId_IN = operationUserId_IN;
            }

            public PK getOperationUserId_NOTIN() {
                return operationUserId_NOTIN;
            }

            public void setOperationUserId_NOTIN(PK operationUserId_NOTIN) {
                this.operationUserId_NOTIN = operationUserId_NOTIN;
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