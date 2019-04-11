package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsLoginLogEntity;
import com.zz.bms.system.query.TsLoginLogQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;

/**
* 登陆日志 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:18
*/
public class TsLoginLogQueryImpl<PK extends Serializable> extends TsLoginLogAbstractQueryImpl<PK> implements TsLoginLogQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<String> operationType_IN;
        private List<String> operationType_NOTIN;


        private List<String> operationlogName_IN;
        private List<String> operationlogName_NOTIN;
        private List<PK> depId_IN;
        private List<PK> depId_NOTIN;


        private List<String> organId_IN;
        private List<String> organId_NOTIN;

        private List<String> operationUserId_IN;
        private List<String> operationUserId_NOTIN;

        private List<String> operationIp_IN;
        private List<String> operationIp_NOTIN;

        private List<String> operationUserName_IN;
        private List<String> operationUserName_NOTIN;

        private List<String> tenantId_IN;
        private List<String> tenantId_NOTIN;


        @Override
        public TsLoginLogQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsLoginLogQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TsLoginLogQuery operationType(String operationType) {
            if(!IdUtils.isEmpty(operationType)){
                this.operationType = operationType;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationTypeNot(String operationTypeNot) {
            if(!IdUtils.isEmpty(operationTypeNot)){
                this.operationType_NE = operationTypeNot;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationTypeIn(String operationTypeIn) {
            if(!IdUtils.isEmpty(operationTypeIn)){
                if(this.operationType_IN == null){
                    this.operationType_IN = new ArrayList<String>();
                }
                this.operationType_IN.add( operationTypeIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationTypeNotIn(String operationTypeNotIn) {
            if(!IdUtils.isEmpty(operationTypeNotIn)){
                if(this.operationType_NOTIN == null){
                    this.operationType_NOTIN = new ArrayList<String>();
                }
                this.operationType_NOTIN.add( operationTypeNotIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationTypeIsNull() {
            this.isNulls.add("operationType");
            return this;
        }

        @Override
        public TsLoginLogQuery operationTypeIsNotNull() {
            this.isNotNulls.add("operationType");
            return this;
        }




        @Override
        public TsLoginLogQuery depId(PK depId) {
            if(!IdUtils.isEmpty(depId)){
                this.depId = depId;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery depIdNot(PK depIdNot) {
            if(!IdUtils.isEmpty(depIdNot)){
                this.depId_NE = depIdNot;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery depIdIn(PK depIdIn) {
            if(!IdUtils.isEmpty(depIdIn)){
                if(this.depId_IN == null){
                    this.depId_IN = new ArrayList<PK>();
                }
                this.depId_IN.add( depIdIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery depIdNotIn(PK depIdNotIn) {
            if(!IdUtils.isEmpty(depIdNotIn)){
                if(this.depId_NOTIN == null){
                    this.depId_NOTIN = new ArrayList<PK>();
                }
                this.depId_NOTIN.add( depIdNotIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery depIdIsNull() {
            this.isNulls.add("depId");
            return this;
        }

        @Override
        public TsLoginLogQuery depIdIsNotNull() {
            this.isNotNulls.add("depId");
            return this;
        }



        @Override
        public TsLoginLogQuery organId(String organId) {
            if(!IdUtils.isEmpty(organId)){
                this.organId = organId;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery organIdNot(String organIdNot) {
            if(!IdUtils.isEmpty(organIdNot)){
                this.organId_NE = organIdNot;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery organIdLike(String organIdLike) {
            if(!IdUtils.isEmpty(organIdLike)){
                this.organId_LIKE = organIdLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery organIdNotLike(String organIdNotLike) {
            if(!IdUtils.isEmpty(organIdNotLike)){
                this.organId_NOTLIKE = organIdNotLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery organIdIn(String organIdIn) {
            if(!IdUtils.isEmpty(organIdIn)){
                if(this.organId_IN == null){
                    this.organId_IN = new ArrayList<String>();
                }
                this.organId_IN.add( organIdIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery organIdNotIn(String organIdNotIn) {
            if(!IdUtils.isEmpty(organIdNotIn)){
                if(this.organId_NOTIN == null){
                    this.organId_NOTIN = new ArrayList<String>();
                }
                this.organId_NOTIN.add( organIdNotIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery organIdIsNull() {
            this.isNulls.add("organId");
            return this;
        }

        @Override
        public TsLoginLogQuery organIdIsNotNull() {
            this.isNotNulls.add("organId");
            return this;
        }



        @Override
        public TsLoginLogQuery operationUserId(String operationUserId) {
            if(!IdUtils.isEmpty(operationUserId)){
                this.operationUserId = operationUserId;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserIdNot(String operationUserIdNot) {
            if(!IdUtils.isEmpty(operationUserIdNot)){
                this.operationUserId_NE = operationUserIdNot;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserIdLike(String operationUserIdLike) {
            if(!IdUtils.isEmpty(operationUserIdLike)){
                this.operationUserId_LIKE = operationUserIdLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserIdNotLike(String operationUserIdNotLike) {
            if(!IdUtils.isEmpty(operationUserIdNotLike)){
                this.operationUserId_NOTLIKE = operationUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserIdIn(String operationUserIdIn) {
            if(!IdUtils.isEmpty(operationUserIdIn)){
                if(this.operationUserId_IN == null){
                    this.operationUserId_IN = new ArrayList<String>();
                }
                this.operationUserId_IN.add( operationUserIdIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserIdNotIn(String operationUserIdNotIn) {
            if(!IdUtils.isEmpty(operationUserIdNotIn)){
                if(this.operationUserId_NOTIN == null){
                    this.operationUserId_NOTIN = new ArrayList<String>();
                }
                this.operationUserId_NOTIN.add( operationUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserIdIsNull() {
            this.isNulls.add("operationUserId");
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserIdIsNotNull() {
            this.isNotNulls.add("operationUserId");
            return this;
        }



        @Override
        public TsLoginLogQuery operationIp(String operationIp) {
            if(!IdUtils.isEmpty(operationIp)){
                this.operationIp = operationIp;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationIpNot(String operationIpNot) {
            if(!IdUtils.isEmpty(operationIpNot)){
                this.operationIp_NE = operationIpNot;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationIpLike(String operationIpLike) {
            if(!IdUtils.isEmpty(operationIpLike)){
                this.operationIp_LIKE = operationIpLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationIpNotLike(String operationIpNotLike) {
            if(!IdUtils.isEmpty(operationIpNotLike)){
                this.operationIp_NOTLIKE = operationIpNotLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationIpIn(String operationIpIn) {
            if(!IdUtils.isEmpty(operationIpIn)){
                if(this.operationIp_IN == null){
                    this.operationIp_IN = new ArrayList<String>();
                }
                this.operationIp_IN.add( operationIpIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationIpNotIn(String operationIpNotIn) {
            if(!IdUtils.isEmpty(operationIpNotIn)){
                if(this.operationIp_NOTIN == null){
                    this.operationIp_NOTIN = new ArrayList<String>();
                }
                this.operationIp_NOTIN.add( operationIpNotIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationIpIsNull() {
            this.isNulls.add("operationIp");
            return this;
        }

        @Override
        public TsLoginLogQuery operationIpIsNotNull() {
            this.isNotNulls.add("operationIp");
            return this;
        }



        @Override
        public TsLoginLogQuery operationUserName(String operationUserName) {
            if(!IdUtils.isEmpty(operationUserName)){
                this.operationUserName = operationUserName;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserNameNot(String operationUserNameNot) {
            if(!IdUtils.isEmpty(operationUserNameNot)){
                this.operationUserName_NE = operationUserNameNot;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserNameLike(String operationUserNameLike) {
            if(!IdUtils.isEmpty(operationUserNameLike)){
                this.operationUserName_LIKE = operationUserNameLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserNameNotLike(String operationUserNameNotLike) {
            if(!IdUtils.isEmpty(operationUserNameNotLike)){
                this.operationUserName_NOTLIKE = operationUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserNameIn(String operationUserNameIn) {
            if(!IdUtils.isEmpty(operationUserNameIn)){
                if(this.operationUserName_IN == null){
                    this.operationUserName_IN = new ArrayList<String>();
                }
                this.operationUserName_IN.add( operationUserNameIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserNameNotIn(String operationUserNameNotIn) {
            if(!IdUtils.isEmpty(operationUserNameNotIn)){
                if(this.operationUserName_NOTIN == null){
                    this.operationUserName_NOTIN = new ArrayList<String>();
                }
                this.operationUserName_NOTIN.add( operationUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserNameIsNull() {
            this.isNulls.add("operationUserName");
            return this;
        }

        @Override
        public TsLoginLogQuery operationUserNameIsNotNull() {
            this.isNotNulls.add("operationUserName");
            return this;
        }


        @Override
        public TsLoginLogQuery operationTime(Timestamp operationTime) {
            if(!IdUtils.isEmpty(operationTime)){
                this.operationTime = operationTime;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationTimeNot(Timestamp operationTimeNot) {
            if(!IdUtils.isEmpty(operationTimeNot)){
                this.operationTime_NE = operationTimeNot;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationTimeGreaterThan(Timestamp operationTimeGreaterThan){
            if(operationTimeGreaterThan != null){
                this.operationTime_GT = operationTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsLoginLogQuery operationTimeGreaterEqual(Timestamp operationTimeGreaterEqual){
            if(operationTimeGreaterEqual != null){
                this.operationTime_GE = operationTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationTimeLessThan(Timestamp operationTimeLessThan){
            if(operationTimeLessThan != null){
                this.operationTime_LT = operationTimeLessThan;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery operationTimeLessEqual(Timestamp operationTimeLessEqual){
            if(operationTimeLessEqual != null){
                this.operationTime_LE = operationTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsLoginLogQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TsLoginLogQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsLoginLogQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsLoginLogQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}