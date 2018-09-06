package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsOperationlogEntity;
import com.zz.bms.system.query.TsOperationlogQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
* 操作日志 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:30
*/
public class TsOperationlogQueryImpl<PK extends Serializable> extends TsOperationlogAbstractQueryImpl<PK> implements TsOperationlogQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<String> operationType_IN;
        private List<String> operationType_NOTIN;

        private List<String> entityType_IN;
        private List<String> entityType_NOTIN;


        private List<String> operationlogName_IN;
        private List<String> operationlogName_NOTIN;
        private List<PK> depId_IN;
        private List<PK> depId_NOTIN;

        private List<PK> organId_IN;
        private List<PK> organId_NOTIN;

        private List<PK> operationUserId_IN;
        private List<PK> operationUserId_NOTIN;


        private List<String> operationIp_IN;
        private List<String> operationIp_NOTIN;

        private List<String> operationUserName_IN;
        private List<String> operationUserName_NOTIN;
        private List<PK> tenantId_IN;
        private List<PK> tenantId_NOTIN;



        @Override
        public TsOperationlogQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsOperationlogQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TsOperationlogQuery operationType(String operationType) {
            if(!IdUtils.isEmpty(operationType)){
                this.operationType = operationType;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationTypeNot(String operationTypeNot) {
            if(!IdUtils.isEmpty(operationTypeNot)){
                this.operationType_NE = operationTypeNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationTypeIn(String operationTypeIn) {
            if(!IdUtils.isEmpty(operationTypeIn)){
                if(this.operationType_IN == null){
                    this.operationType_IN = new ArrayList<String>();
                }
                this.operationType_IN.add( operationTypeIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationTypeNotIn(String operationTypeNotIn) {
            if(!IdUtils.isEmpty(operationTypeNotIn)){
                if(this.operationType_NOTIN == null){
                    this.operationType_NOTIN = new ArrayList<String>();
                }
                this.operationType_NOTIN.add( operationTypeNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationTypeIsNull() {
            this.isNulls.add("operationType");
            return this;
        }

        @Override
        public TsOperationlogQuery operationTypeIsNotNull() {
            this.isNotNulls.add("operationType");
            return this;
        }


        @Override
        public TsOperationlogQuery entityType(String entityType) {
            if(!IdUtils.isEmpty(entityType)){
                this.entityType = entityType;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery entityTypeNot(String entityTypeNot) {
            if(!IdUtils.isEmpty(entityTypeNot)){
                this.entityType_NE = entityTypeNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery entityTypeIn(String entityTypeIn) {
            if(!IdUtils.isEmpty(entityTypeIn)){
                if(this.entityType_IN == null){
                    this.entityType_IN = new ArrayList<String>();
                }
                this.entityType_IN.add( entityTypeIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery entityTypeNotIn(String entityTypeNotIn) {
            if(!IdUtils.isEmpty(entityTypeNotIn)){
                if(this.entityType_NOTIN == null){
                    this.entityType_NOTIN = new ArrayList<String>();
                }
                this.entityType_NOTIN.add( entityTypeNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery entityTypeIsNull() {
            this.isNulls.add("entityType");
            return this;
        }

        @Override
        public TsOperationlogQuery entityTypeIsNotNull() {
            this.isNotNulls.add("entityType");
            return this;
        }



        @Override
        public TsOperationlogQuery operationlogName(String operationlogName) {
            if(!IdUtils.isEmpty(operationlogName)){
                this.operationlogName = operationlogName;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationlogNameNot(String operationlogNameNot) {
            if(!IdUtils.isEmpty(operationlogNameNot)){
                this.operationlogName_NE = operationlogNameNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationlogNameLike(String operationlogNameLike) {
            if(!IdUtils.isEmpty(operationlogNameLike)){
                this.operationlogName_LIKE = operationlogNameLike;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationlogNameNotLike(String operationlogNameNotLike) {
            if(!IdUtils.isEmpty(operationlogNameNotLike)){
                this.operationlogName_NOTLIKE = operationlogNameNotLike;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationlogNameIn(String operationlogNameIn) {
            if(!IdUtils.isEmpty(operationlogNameIn)){
                if(this.operationlogName_IN == null){
                    this.operationlogName_IN = new ArrayList<String>();
                }
                this.operationlogName_IN.add( operationlogNameIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationlogNameNotIn(String operationlogNameNotIn) {
            if(!IdUtils.isEmpty(operationlogNameNotIn)){
                if(this.operationlogName_NOTIN == null){
                    this.operationlogName_NOTIN = new ArrayList<String>();
                }
                this.operationlogName_NOTIN.add( operationlogNameNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationlogNameIsNull() {
            this.isNulls.add("operationlogName");
            return this;
        }

        @Override
        public TsOperationlogQuery operationlogNameIsNotNull() {
            this.isNotNulls.add("operationlogName");
            return this;
        }


        @Override
        public TsOperationlogQuery depId(PK depId) {
            if(!IdUtils.isEmpty(depId)){
                this.depId = depId;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery depIdNot(PK depIdNot) {
            if(!IdUtils.isEmpty(depIdNot)){
                this.depId_NE = depIdNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery depIdIn(PK depIdIn) {
            if(!IdUtils.isEmpty(depIdIn)){
                if(this.depId_IN == null){
                    this.depId_IN = new ArrayList<PK>();
                }
                this.depId_IN.add( depIdIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery depIdNotIn(PK depIdNotIn) {
            if(!IdUtils.isEmpty(depIdNotIn)){
                if(this.depId_NOTIN == null){
                    this.depId_NOTIN = new ArrayList<PK>();
                }
                this.depId_NOTIN.add( depIdNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery depIdIsNull() {
            this.isNulls.add("depId");
            return this;
        }

        @Override
        public TsOperationlogQuery depIdIsNotNull() {
            this.isNotNulls.add("depId");
            return this;
        }


        @Override
        public TsOperationlogQuery organId(PK organId) {
            if(!IdUtils.isEmpty(organId)){
                this.organId = organId;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery organIdNot(PK organIdNot) {
            if(!IdUtils.isEmpty(organIdNot)){
                this.organId_NE = organIdNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery organIdIn(PK organIdIn) {
            if(!IdUtils.isEmpty(organIdIn)){
                if(this.organId_IN == null){
                    this.organId_IN = new ArrayList<PK>();
                }
                this.organId_IN.add( organIdIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery organIdNotIn(PK organIdNotIn) {
            if(!IdUtils.isEmpty(organIdNotIn)){
                if(this.organId_NOTIN == null){
                    this.organId_NOTIN = new ArrayList<PK>();
                }
                this.organId_NOTIN.add( organIdNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery organIdIsNull() {
            this.isNulls.add("organId");
            return this;
        }

        @Override
        public TsOperationlogQuery organIdIsNotNull() {
            this.isNotNulls.add("organId");
            return this;
        }


        @Override
        public TsOperationlogQuery operationUserId(PK operationUserId) {
            if(!IdUtils.isEmpty(operationUserId)){
                this.operationUserId = operationUserId;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserIdNot(PK operationUserIdNot) {
            if(!IdUtils.isEmpty(operationUserIdNot)){
                this.operationUserId_NE = operationUserIdNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserIdIn(PK operationUserIdIn) {
            if(!IdUtils.isEmpty(operationUserIdIn)){
                if(this.operationUserId_IN == null){
                    this.operationUserId_IN = new ArrayList<PK>();
                }
                this.operationUserId_IN.add( operationUserIdIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserIdNotIn(PK operationUserIdNotIn) {
            if(!IdUtils.isEmpty(operationUserIdNotIn)){
                if(this.operationUserId_NOTIN == null){
                    this.operationUserId_NOTIN = new ArrayList<PK>();
                }
                this.operationUserId_NOTIN.add( operationUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserIdIsNull() {
            this.isNulls.add("operationUserId");
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserIdIsNotNull() {
            this.isNotNulls.add("operationUserId");
            return this;
        }



        @Override
        public TsOperationlogQuery operationIp(String operationIp) {
            if(!IdUtils.isEmpty(operationIp)){
                this.operationIp = operationIp;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationIpNot(String operationIpNot) {
            if(!IdUtils.isEmpty(operationIpNot)){
                this.operationIp_NE = operationIpNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationIpLike(String operationIpLike) {
            if(!IdUtils.isEmpty(operationIpLike)){
                this.operationIp_LIKE = operationIpLike;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationIpNotLike(String operationIpNotLike) {
            if(!IdUtils.isEmpty(operationIpNotLike)){
                this.operationIp_NOTLIKE = operationIpNotLike;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationIpIn(String operationIpIn) {
            if(!IdUtils.isEmpty(operationIpIn)){
                if(this.operationIp_IN == null){
                    this.operationIp_IN = new ArrayList<String>();
                }
                this.operationIp_IN.add( operationIpIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationIpNotIn(String operationIpNotIn) {
            if(!IdUtils.isEmpty(operationIpNotIn)){
                if(this.operationIp_NOTIN == null){
                    this.operationIp_NOTIN = new ArrayList<String>();
                }
                this.operationIp_NOTIN.add( operationIpNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationIpIsNull() {
            this.isNulls.add("operationIp");
            return this;
        }

        @Override
        public TsOperationlogQuery operationIpIsNotNull() {
            this.isNotNulls.add("operationIp");
            return this;
        }



        @Override
        public TsOperationlogQuery operationUserName(String operationUserName) {
            if(!IdUtils.isEmpty(operationUserName)){
                this.operationUserName = operationUserName;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserNameNot(String operationUserNameNot) {
            if(!IdUtils.isEmpty(operationUserNameNot)){
                this.operationUserName_NE = operationUserNameNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserNameLike(String operationUserNameLike) {
            if(!IdUtils.isEmpty(operationUserNameLike)){
                this.operationUserName_LIKE = operationUserNameLike;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserNameNotLike(String operationUserNameNotLike) {
            if(!IdUtils.isEmpty(operationUserNameNotLike)){
                this.operationUserName_NOTLIKE = operationUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserNameIn(String operationUserNameIn) {
            if(!IdUtils.isEmpty(operationUserNameIn)){
                if(this.operationUserName_IN == null){
                    this.operationUserName_IN = new ArrayList<String>();
                }
                this.operationUserName_IN.add( operationUserNameIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserNameNotIn(String operationUserNameNotIn) {
            if(!IdUtils.isEmpty(operationUserNameNotIn)){
                if(this.operationUserName_NOTIN == null){
                    this.operationUserName_NOTIN = new ArrayList<String>();
                }
                this.operationUserName_NOTIN.add( operationUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserNameIsNull() {
            this.isNulls.add("operationUserName");
            return this;
        }

        @Override
        public TsOperationlogQuery operationUserNameIsNotNull() {
            this.isNotNulls.add("operationUserName");
            return this;
        }


        @Override
        public TsOperationlogQuery operationTime(Timestamp operationTime) {
            if(!IdUtils.isEmpty(operationTime)){
                this.operationTime = operationTime;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationTimeNot(Timestamp operationTimeNot) {
            if(!IdUtils.isEmpty(operationTimeNot)){
                this.operationTime_NE = operationTimeNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationTimeGreaterThan(Timestamp operationTimeGreaterThan){
            if(operationTimeGreaterThan != null){
                this.operationTime_GT = operationTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsOperationlogQuery operationTimeGreaterEqual(Timestamp operationTimeGreaterEqual){
            if(operationTimeGreaterEqual != null){
                this.operationTime_GE = operationTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationTimeLessThan(Timestamp operationTimeLessThan){
            if(operationTimeLessThan != null){
                this.operationTime_LT = operationTimeLessThan;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery operationTimeLessEqual(Timestamp operationTimeLessEqual){
            if(operationTimeLessEqual != null){
                this.operationTime_LE = operationTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery tenantId(PK tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery tenantIdNot(PK tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsOperationlogQuery tenantIdIn(PK tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<PK>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery tenantIdNotIn(PK tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<PK>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsOperationlogQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsOperationlogQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}