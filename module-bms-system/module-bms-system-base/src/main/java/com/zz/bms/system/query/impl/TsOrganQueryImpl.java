package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsOrganEntity;
import com.zz.bms.system.query.TsOrganQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 机构 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class TsOrganQueryImpl<PK extends Serializable> extends TsOrganAbstractQueryImpl<PK> implements TsOrganQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> organName_IN;
        private List<String> organName_NOTIN;

        private List<String> organCode_IN;
        private List<String> organCode_NOTIN;
        private List<String> organType_IN;
        private List<String> organType_NOTIN;


        private List<String> organAddr_IN;
        private List<String> organAddr_NOTIN;
        private List<PK> pid_IN;
        private List<PK> pid_NOTIN;

        private List<String> organStatus_IN;
        private List<String> organStatus_NOTIN;

        private List<PK> leadUserId_IN;
        private List<PK> leadUserId_NOTIN;


        private List<String> remark_IN;
        private List<String> remark_NOTIN;

        private List<String> deleteFlag_IN;
        private List<String> deleteFlag_NOTIN;

        private List<String> createUserId_IN;
        private List<String> createUserId_NOTIN;

        private List<String> createUserName_IN;
        private List<String> createUserName_NOTIN;

        private List<String> updateUserId_IN;
        private List<String> updateUserId_NOTIN;

        private List<String> updateUserName_IN;
        private List<String> updateUserName_NOTIN;
        private List<PK> tenantId_IN;
        private List<PK> tenantId_NOTIN;



        @Override
        public TsOrganQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsOrganQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsOrganQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsOrganQuery organName(String organName) {
            if(!IdUtils.isEmpty(organName)){
                this.organName = organName;
            }
            return this;
        }

        @Override
        public TsOrganQuery organNameNot(String organNameNot) {
            if(!IdUtils.isEmpty(organNameNot)){
                this.organName_NE = organNameNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery organNameLike(String organNameLike) {
            if(!IdUtils.isEmpty(organNameLike)){
                this.organName_LIKE = organNameLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery organNameNotLike(String organNameNotLike) {
            if(!IdUtils.isEmpty(organNameNotLike)){
                this.organName_NOTLIKE = organNameNotLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery organNameIn(String organNameIn) {
            if(!IdUtils.isEmpty(organNameIn)){
                if(this.organName_IN == null){
                    this.organName_IN = new ArrayList<String>();
                }
                this.organName_IN.add( organNameIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organNameNotIn(String organNameNotIn) {
            if(!IdUtils.isEmpty(organNameNotIn)){
                if(this.organName_NOTIN == null){
                    this.organName_NOTIN = new ArrayList<String>();
                }
                this.organName_NOTIN.add( organNameNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organNameIsNull() {
            this.isNulls.add("organName");
            return this;
        }

        @Override
        public TsOrganQuery organNameIsNotNull() {
            this.isNotNulls.add("organName");
            return this;
        }



        @Override
        public TsOrganQuery organCode(String organCode) {
            if(!IdUtils.isEmpty(organCode)){
                this.organCode = organCode;
            }
            return this;
        }

        @Override
        public TsOrganQuery organCodeNot(String organCodeNot) {
            if(!IdUtils.isEmpty(organCodeNot)){
                this.organCode_NE = organCodeNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery organCodeLike(String organCodeLike) {
            if(!IdUtils.isEmpty(organCodeLike)){
                this.organCode_LIKE = organCodeLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery organCodeNotLike(String organCodeNotLike) {
            if(!IdUtils.isEmpty(organCodeNotLike)){
                this.organCode_NOTLIKE = organCodeNotLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery organCodeIn(String organCodeIn) {
            if(!IdUtils.isEmpty(organCodeIn)){
                if(this.organCode_IN == null){
                    this.organCode_IN = new ArrayList<String>();
                }
                this.organCode_IN.add( organCodeIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organCodeNotIn(String organCodeNotIn) {
            if(!IdUtils.isEmpty(organCodeNotIn)){
                if(this.organCode_NOTIN == null){
                    this.organCode_NOTIN = new ArrayList<String>();
                }
                this.organCode_NOTIN.add( organCodeNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organCodeIsNull() {
            this.isNulls.add("organCode");
            return this;
        }

        @Override
        public TsOrganQuery organCodeIsNotNull() {
            this.isNotNulls.add("organCode");
            return this;
        }


        @Override
        public TsOrganQuery organType(String organType) {
            if(!IdUtils.isEmpty(organType)){
                this.organType = organType;
            }
            return this;
        }

        @Override
        public TsOrganQuery organTypeNot(String organTypeNot) {
            if(!IdUtils.isEmpty(organTypeNot)){
                this.organType_NE = organTypeNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery organTypeIn(String organTypeIn) {
            if(!IdUtils.isEmpty(organTypeIn)){
                if(this.organType_IN == null){
                    this.organType_IN = new ArrayList<String>();
                }
                this.organType_IN.add( organTypeIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organTypeNotIn(String organTypeNotIn) {
            if(!IdUtils.isEmpty(organTypeNotIn)){
                if(this.organType_NOTIN == null){
                    this.organType_NOTIN = new ArrayList<String>();
                }
                this.organType_NOTIN.add( organTypeNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organTypeIsNull() {
            this.isNulls.add("organType");
            return this;
        }

        @Override
        public TsOrganQuery organTypeIsNotNull() {
            this.isNotNulls.add("organType");
            return this;
        }



        @Override
        public TsOrganQuery organAddr(String organAddr) {
            if(!IdUtils.isEmpty(organAddr)){
                this.organAddr = organAddr;
            }
            return this;
        }

        @Override
        public TsOrganQuery organAddrNot(String organAddrNot) {
            if(!IdUtils.isEmpty(organAddrNot)){
                this.organAddr_NE = organAddrNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery organAddrLike(String organAddrLike) {
            if(!IdUtils.isEmpty(organAddrLike)){
                this.organAddr_LIKE = organAddrLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery organAddrNotLike(String organAddrNotLike) {
            if(!IdUtils.isEmpty(organAddrNotLike)){
                this.organAddr_NOTLIKE = organAddrNotLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery organAddrIn(String organAddrIn) {
            if(!IdUtils.isEmpty(organAddrIn)){
                if(this.organAddr_IN == null){
                    this.organAddr_IN = new ArrayList<String>();
                }
                this.organAddr_IN.add( organAddrIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organAddrNotIn(String organAddrNotIn) {
            if(!IdUtils.isEmpty(organAddrNotIn)){
                if(this.organAddr_NOTIN == null){
                    this.organAddr_NOTIN = new ArrayList<String>();
                }
                this.organAddr_NOTIN.add( organAddrNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organAddrIsNull() {
            this.isNulls.add("organAddr");
            return this;
        }

        @Override
        public TsOrganQuery organAddrIsNotNull() {
            this.isNotNulls.add("organAddr");
            return this;
        }


        @Override
        public TsOrganQuery pid(PK pid) {
            if(!IdUtils.isEmpty(pid)){
                this.pid = pid;
            }
            return this;
        }

        @Override
        public TsOrganQuery pidNot(PK pidNot) {
            if(!IdUtils.isEmpty(pidNot)){
                this.pid_NE = pidNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery pidIn(PK pidIn) {
            if(!IdUtils.isEmpty(pidIn)){
                if(this.pid_IN == null){
                    this.pid_IN = new ArrayList<PK>();
                }
                this.pid_IN.add( pidIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery pidNotIn(PK pidNotIn) {
            if(!IdUtils.isEmpty(pidNotIn)){
                if(this.pid_NOTIN == null){
                    this.pid_NOTIN = new ArrayList<PK>();
                }
                this.pid_NOTIN.add( pidNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery pidIsNull() {
            this.isNulls.add("pid");
            return this;
        }

        @Override
        public TsOrganQuery pidIsNotNull() {
            this.isNotNulls.add("pid");
            return this;
        }


        @Override
        public TsOrganQuery organStatus(String organStatus) {
            if(!IdUtils.isEmpty(organStatus)){
                this.organStatus = organStatus;
            }
            return this;
        }

        @Override
        public TsOrganQuery organStatusNot(String organStatusNot) {
            if(!IdUtils.isEmpty(organStatusNot)){
                this.organStatus_NE = organStatusNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery organStatusIn(String organStatusIn) {
            if(!IdUtils.isEmpty(organStatusIn)){
                if(this.organStatus_IN == null){
                    this.organStatus_IN = new ArrayList<String>();
                }
                this.organStatus_IN.add( organStatusIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organStatusNotIn(String organStatusNotIn) {
            if(!IdUtils.isEmpty(organStatusNotIn)){
                if(this.organStatus_NOTIN == null){
                    this.organStatus_NOTIN = new ArrayList<String>();
                }
                this.organStatus_NOTIN.add( organStatusNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery organStatusIsNull() {
            this.isNulls.add("organStatus");
            return this;
        }

        @Override
        public TsOrganQuery organStatusIsNotNull() {
            this.isNotNulls.add("organStatus");
            return this;
        }


        @Override
        public TsOrganQuery leadUserId(PK leadUserId) {
            if(!IdUtils.isEmpty(leadUserId)){
                this.leadUserId = leadUserId;
            }
            return this;
        }

        @Override
        public TsOrganQuery leadUserIdNot(PK leadUserIdNot) {
            if(!IdUtils.isEmpty(leadUserIdNot)){
                this.leadUserId_NE = leadUserIdNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery leadUserIdIn(PK leadUserIdIn) {
            if(!IdUtils.isEmpty(leadUserIdIn)){
                if(this.leadUserId_IN == null){
                    this.leadUserId_IN = new ArrayList<PK>();
                }
                this.leadUserId_IN.add( leadUserIdIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery leadUserIdNotIn(PK leadUserIdNotIn) {
            if(!IdUtils.isEmpty(leadUserIdNotIn)){
                if(this.leadUserId_NOTIN == null){
                    this.leadUserId_NOTIN = new ArrayList<PK>();
                }
                this.leadUserId_NOTIN.add( leadUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery leadUserIdIsNull() {
            this.isNulls.add("leadUserId");
            return this;
        }

        @Override
        public TsOrganQuery leadUserIdIsNotNull() {
            this.isNotNulls.add("leadUserId");
            return this;
        }



        @Override
        public TsOrganQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TsOrganQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TsOrganQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TsOrganQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TsOrganQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TsOrganQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TsOrganQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsOrganQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsOrganQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsOrganQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsOrganQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsOrganQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsOrganQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsOrganQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsOrganQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsOrganQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsOrganQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsOrganQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsOrganQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsOrganQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsOrganQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsOrganQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsOrganQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsOrganQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsOrganQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsOrganQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsOrganQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }

        @Override
        public TsOrganQuery tenantId(PK tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsOrganQuery tenantIdNot(PK tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsOrganQuery tenantIdIn(PK tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<PK>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery tenantIdNotIn(PK tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<PK>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsOrganQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsOrganQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}