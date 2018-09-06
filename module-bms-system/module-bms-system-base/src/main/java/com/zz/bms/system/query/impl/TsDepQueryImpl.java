package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsDepEntity;
import com.zz.bms.system.query.TsDepQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 部门 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class TsDepQueryImpl<PK extends Serializable> extends TsDepAbstractQueryImpl<PK> implements TsDepQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> depName_IN;
        private List<String> depName_NOTIN;

        private List<String> depCode_IN;
        private List<String> depCode_NOTIN;

        private List<String> depAddr_IN;
        private List<String> depAddr_NOTIN;
        private List<PK> pid_IN;
        private List<PK> pid_NOTIN;

        private List<String> depStatus_IN;
        private List<String> depStatus_NOTIN;

        private List<PK> leadUserId_IN;
        private List<PK> leadUserId_NOTIN;

        private List<PK> organId_IN;
        private List<PK> organId_NOTIN;


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
        public TsDepQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsDepQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsDepQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsDepQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsDepQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsDepQuery depName(String depName) {
            if(!IdUtils.isEmpty(depName)){
                this.depName = depName;
            }
            return this;
        }

        @Override
        public TsDepQuery depNameNot(String depNameNot) {
            if(!IdUtils.isEmpty(depNameNot)){
                this.depName_NE = depNameNot;
            }
            return this;
        }

        @Override
        public TsDepQuery depNameLike(String depNameLike) {
            if(!IdUtils.isEmpty(depNameLike)){
                this.depName_LIKE = depNameLike;
            }
            return this;
        }

        @Override
        public TsDepQuery depNameNotLike(String depNameNotLike) {
            if(!IdUtils.isEmpty(depNameNotLike)){
                this.depName_NOTLIKE = depNameNotLike;
            }
            return this;
        }

        @Override
        public TsDepQuery depNameIn(String depNameIn) {
            if(!IdUtils.isEmpty(depNameIn)){
                if(this.depName_IN == null){
                    this.depName_IN = new ArrayList<String>();
                }
                this.depName_IN.add( depNameIn );
            }
            return this;
        }

        @Override
        public TsDepQuery depNameNotIn(String depNameNotIn) {
            if(!IdUtils.isEmpty(depNameNotIn)){
                if(this.depName_NOTIN == null){
                    this.depName_NOTIN = new ArrayList<String>();
                }
                this.depName_NOTIN.add( depNameNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery depNameIsNull() {
            this.isNulls.add("depName");
            return this;
        }

        @Override
        public TsDepQuery depNameIsNotNull() {
            this.isNotNulls.add("depName");
            return this;
        }



        @Override
        public TsDepQuery depCode(String depCode) {
            if(!IdUtils.isEmpty(depCode)){
                this.depCode = depCode;
            }
            return this;
        }

        @Override
        public TsDepQuery depCodeNot(String depCodeNot) {
            if(!IdUtils.isEmpty(depCodeNot)){
                this.depCode_NE = depCodeNot;
            }
            return this;
        }

        @Override
        public TsDepQuery depCodeLike(String depCodeLike) {
            if(!IdUtils.isEmpty(depCodeLike)){
                this.depCode_LIKE = depCodeLike;
            }
            return this;
        }

        @Override
        public TsDepQuery depCodeNotLike(String depCodeNotLike) {
            if(!IdUtils.isEmpty(depCodeNotLike)){
                this.depCode_NOTLIKE = depCodeNotLike;
            }
            return this;
        }

        @Override
        public TsDepQuery depCodeIn(String depCodeIn) {
            if(!IdUtils.isEmpty(depCodeIn)){
                if(this.depCode_IN == null){
                    this.depCode_IN = new ArrayList<String>();
                }
                this.depCode_IN.add( depCodeIn );
            }
            return this;
        }

        @Override
        public TsDepQuery depCodeNotIn(String depCodeNotIn) {
            if(!IdUtils.isEmpty(depCodeNotIn)){
                if(this.depCode_NOTIN == null){
                    this.depCode_NOTIN = new ArrayList<String>();
                }
                this.depCode_NOTIN.add( depCodeNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery depCodeIsNull() {
            this.isNulls.add("depCode");
            return this;
        }

        @Override
        public TsDepQuery depCodeIsNotNull() {
            this.isNotNulls.add("depCode");
            return this;
        }



        @Override
        public TsDepQuery depAddr(String depAddr) {
            if(!IdUtils.isEmpty(depAddr)){
                this.depAddr = depAddr;
            }
            return this;
        }

        @Override
        public TsDepQuery depAddrNot(String depAddrNot) {
            if(!IdUtils.isEmpty(depAddrNot)){
                this.depAddr_NE = depAddrNot;
            }
            return this;
        }

        @Override
        public TsDepQuery depAddrLike(String depAddrLike) {
            if(!IdUtils.isEmpty(depAddrLike)){
                this.depAddr_LIKE = depAddrLike;
            }
            return this;
        }

        @Override
        public TsDepQuery depAddrNotLike(String depAddrNotLike) {
            if(!IdUtils.isEmpty(depAddrNotLike)){
                this.depAddr_NOTLIKE = depAddrNotLike;
            }
            return this;
        }

        @Override
        public TsDepQuery depAddrIn(String depAddrIn) {
            if(!IdUtils.isEmpty(depAddrIn)){
                if(this.depAddr_IN == null){
                    this.depAddr_IN = new ArrayList<String>();
                }
                this.depAddr_IN.add( depAddrIn );
            }
            return this;
        }

        @Override
        public TsDepQuery depAddrNotIn(String depAddrNotIn) {
            if(!IdUtils.isEmpty(depAddrNotIn)){
                if(this.depAddr_NOTIN == null){
                    this.depAddr_NOTIN = new ArrayList<String>();
                }
                this.depAddr_NOTIN.add( depAddrNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery depAddrIsNull() {
            this.isNulls.add("depAddr");
            return this;
        }

        @Override
        public TsDepQuery depAddrIsNotNull() {
            this.isNotNulls.add("depAddr");
            return this;
        }


        @Override
        public TsDepQuery pid(PK pid) {
            if(!IdUtils.isEmpty(pid)){
                this.pid = pid;
            }
            return this;
        }

        @Override
        public TsDepQuery pidNot(PK pidNot) {
            if(!IdUtils.isEmpty(pidNot)){
                this.pid_NE = pidNot;
            }
            return this;
        }

        @Override
        public TsDepQuery pidIn(PK pidIn) {
            if(!IdUtils.isEmpty(pidIn)){
                if(this.pid_IN == null){
                    this.pid_IN = new ArrayList<PK>();
                }
                this.pid_IN.add( pidIn );
            }
            return this;
        }

        @Override
        public TsDepQuery pidNotIn(PK pidNotIn) {
            if(!IdUtils.isEmpty(pidNotIn)){
                if(this.pid_NOTIN == null){
                    this.pid_NOTIN = new ArrayList<PK>();
                }
                this.pid_NOTIN.add( pidNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery pidIsNull() {
            this.isNulls.add("pid");
            return this;
        }

        @Override
        public TsDepQuery pidIsNotNull() {
            this.isNotNulls.add("pid");
            return this;
        }


        @Override
        public TsDepQuery depStatus(String depStatus) {
            if(!IdUtils.isEmpty(depStatus)){
                this.depStatus = depStatus;
            }
            return this;
        }

        @Override
        public TsDepQuery depStatusNot(String depStatusNot) {
            if(!IdUtils.isEmpty(depStatusNot)){
                this.depStatus_NE = depStatusNot;
            }
            return this;
        }

        @Override
        public TsDepQuery depStatusIn(String depStatusIn) {
            if(!IdUtils.isEmpty(depStatusIn)){
                if(this.depStatus_IN == null){
                    this.depStatus_IN = new ArrayList<String>();
                }
                this.depStatus_IN.add( depStatusIn );
            }
            return this;
        }

        @Override
        public TsDepQuery depStatusNotIn(String depStatusNotIn) {
            if(!IdUtils.isEmpty(depStatusNotIn)){
                if(this.depStatus_NOTIN == null){
                    this.depStatus_NOTIN = new ArrayList<String>();
                }
                this.depStatus_NOTIN.add( depStatusNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery depStatusIsNull() {
            this.isNulls.add("depStatus");
            return this;
        }

        @Override
        public TsDepQuery depStatusIsNotNull() {
            this.isNotNulls.add("depStatus");
            return this;
        }


        @Override
        public TsDepQuery leadUserId(PK leadUserId) {
            if(!IdUtils.isEmpty(leadUserId)){
                this.leadUserId = leadUserId;
            }
            return this;
        }

        @Override
        public TsDepQuery leadUserIdNot(PK leadUserIdNot) {
            if(!IdUtils.isEmpty(leadUserIdNot)){
                this.leadUserId_NE = leadUserIdNot;
            }
            return this;
        }

        @Override
        public TsDepQuery leadUserIdIn(PK leadUserIdIn) {
            if(!IdUtils.isEmpty(leadUserIdIn)){
                if(this.leadUserId_IN == null){
                    this.leadUserId_IN = new ArrayList<PK>();
                }
                this.leadUserId_IN.add( leadUserIdIn );
            }
            return this;
        }

        @Override
        public TsDepQuery leadUserIdNotIn(PK leadUserIdNotIn) {
            if(!IdUtils.isEmpty(leadUserIdNotIn)){
                if(this.leadUserId_NOTIN == null){
                    this.leadUserId_NOTIN = new ArrayList<PK>();
                }
                this.leadUserId_NOTIN.add( leadUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery leadUserIdIsNull() {
            this.isNulls.add("leadUserId");
            return this;
        }

        @Override
        public TsDepQuery leadUserIdIsNotNull() {
            this.isNotNulls.add("leadUserId");
            return this;
        }


        @Override
        public TsDepQuery organId(PK organId) {
            if(!IdUtils.isEmpty(organId)){
                this.organId = organId;
            }
            return this;
        }

        @Override
        public TsDepQuery organIdNot(PK organIdNot) {
            if(!IdUtils.isEmpty(organIdNot)){
                this.organId_NE = organIdNot;
            }
            return this;
        }

        @Override
        public TsDepQuery organIdIn(PK organIdIn) {
            if(!IdUtils.isEmpty(organIdIn)){
                if(this.organId_IN == null){
                    this.organId_IN = new ArrayList<PK>();
                }
                this.organId_IN.add( organIdIn );
            }
            return this;
        }

        @Override
        public TsDepQuery organIdNotIn(PK organIdNotIn) {
            if(!IdUtils.isEmpty(organIdNotIn)){
                if(this.organId_NOTIN == null){
                    this.organId_NOTIN = new ArrayList<PK>();
                }
                this.organId_NOTIN.add( organIdNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery organIdIsNull() {
            this.isNulls.add("organId");
            return this;
        }

        @Override
        public TsDepQuery organIdIsNotNull() {
            this.isNotNulls.add("organId");
            return this;
        }



        @Override
        public TsDepQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TsDepQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TsDepQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TsDepQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TsDepQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TsDepQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TsDepQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TsDepQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TsDepQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TsDepQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TsDepQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TsDepQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TsDepQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TsDepQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TsDepQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsDepQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsDepQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsDepQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsDepQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsDepQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsDepQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsDepQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsDepQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsDepQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsDepQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsDepQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsDepQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsDepQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsDepQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsDepQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsDepQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsDepQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsDepQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsDepQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsDepQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsDepQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsDepQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsDepQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsDepQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsDepQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsDepQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsDepQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsDepQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsDepQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsDepQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsDepQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsDepQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsDepQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsDepQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsDepQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }

        @Override
        public TsDepQuery tenantId(PK tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsDepQuery tenantIdNot(PK tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsDepQuery tenantIdIn(PK tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<PK>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsDepQuery tenantIdNotIn(PK tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<PK>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsDepQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsDepQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}