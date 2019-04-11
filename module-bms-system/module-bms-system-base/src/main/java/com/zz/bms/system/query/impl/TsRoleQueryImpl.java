package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsRoleEntity;
import com.zz.bms.system.query.TsRoleQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 角色 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:16
*/
public class TsRoleQueryImpl<PK extends Serializable> extends TsRoleAbstractQueryImpl<PK> implements TsRoleQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> roleName_IN;
        private List<String> roleName_NOTIN;

        private List<String> roleCode_IN;
        private List<String> roleCode_NOTIN;
        private List<String> roleType_IN;
        private List<String> roleType_NOTIN;

        private List<PK> depId_IN;
        private List<PK> depId_NOTIN;


        private List<String> organId_IN;
        private List<String> organId_NOTIN;
        private List<String> roleStatus_IN;
        private List<String> roleStatus_NOTIN;


        private List<String> remark_IN;
        private List<String> remark_NOTIN;

        private List<String> createUserId_IN;
        private List<String> createUserId_NOTIN;

        private List<String> createUserName_IN;
        private List<String> createUserName_NOTIN;

        private List<String> updateUserId_IN;
        private List<String> updateUserId_NOTIN;

        private List<String> updateUserName_IN;
        private List<String> updateUserName_NOTIN;

        private List<String> tenantId_IN;
        private List<String> tenantId_NOTIN;


        @Override
        public TsRoleQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsRoleQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsRoleQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsRoleQuery roleName(String roleName) {
            if(!IdUtils.isEmpty(roleName)){
                this.roleName = roleName;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleNameNot(String roleNameNot) {
            if(!IdUtils.isEmpty(roleNameNot)){
                this.roleName_NE = roleNameNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleNameLike(String roleNameLike) {
            if(!IdUtils.isEmpty(roleNameLike)){
                this.roleName_LIKE = roleNameLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleNameNotLike(String roleNameNotLike) {
            if(!IdUtils.isEmpty(roleNameNotLike)){
                this.roleName_NOTLIKE = roleNameNotLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleNameIn(String roleNameIn) {
            if(!IdUtils.isEmpty(roleNameIn)){
                if(this.roleName_IN == null){
                    this.roleName_IN = new ArrayList<String>();
                }
                this.roleName_IN.add( roleNameIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery roleNameNotIn(String roleNameNotIn) {
            if(!IdUtils.isEmpty(roleNameNotIn)){
                if(this.roleName_NOTIN == null){
                    this.roleName_NOTIN = new ArrayList<String>();
                }
                this.roleName_NOTIN.add( roleNameNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery roleNameIsNull() {
            this.isNulls.add("roleName");
            return this;
        }

        @Override
        public TsRoleQuery roleNameIsNotNull() {
            this.isNotNulls.add("roleName");
            return this;
        }



        @Override
        public TsRoleQuery roleCode(String roleCode) {
            if(!IdUtils.isEmpty(roleCode)){
                this.roleCode = roleCode;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleCodeNot(String roleCodeNot) {
            if(!IdUtils.isEmpty(roleCodeNot)){
                this.roleCode_NE = roleCodeNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleCodeLike(String roleCodeLike) {
            if(!IdUtils.isEmpty(roleCodeLike)){
                this.roleCode_LIKE = roleCodeLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleCodeNotLike(String roleCodeNotLike) {
            if(!IdUtils.isEmpty(roleCodeNotLike)){
                this.roleCode_NOTLIKE = roleCodeNotLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleCodeIn(String roleCodeIn) {
            if(!IdUtils.isEmpty(roleCodeIn)){
                if(this.roleCode_IN == null){
                    this.roleCode_IN = new ArrayList<String>();
                }
                this.roleCode_IN.add( roleCodeIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery roleCodeNotIn(String roleCodeNotIn) {
            if(!IdUtils.isEmpty(roleCodeNotIn)){
                if(this.roleCode_NOTIN == null){
                    this.roleCode_NOTIN = new ArrayList<String>();
                }
                this.roleCode_NOTIN.add( roleCodeNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery roleCodeIsNull() {
            this.isNulls.add("roleCode");
            return this;
        }

        @Override
        public TsRoleQuery roleCodeIsNotNull() {
            this.isNotNulls.add("roleCode");
            return this;
        }


        @Override
        public TsRoleQuery roleType(String roleType) {
            if(!IdUtils.isEmpty(roleType)){
                this.roleType = roleType;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleTypeNot(String roleTypeNot) {
            if(!IdUtils.isEmpty(roleTypeNot)){
                this.roleType_NE = roleTypeNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleTypeIn(String roleTypeIn) {
            if(!IdUtils.isEmpty(roleTypeIn)){
                if(this.roleType_IN == null){
                    this.roleType_IN = new ArrayList<String>();
                }
                this.roleType_IN.add( roleTypeIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery roleTypeNotIn(String roleTypeNotIn) {
            if(!IdUtils.isEmpty(roleTypeNotIn)){
                if(this.roleType_NOTIN == null){
                    this.roleType_NOTIN = new ArrayList<String>();
                }
                this.roleType_NOTIN.add( roleTypeNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery roleTypeIsNull() {
            this.isNulls.add("roleType");
            return this;
        }

        @Override
        public TsRoleQuery roleTypeIsNotNull() {
            this.isNotNulls.add("roleType");
            return this;
        }


        @Override
        public TsRoleQuery depId(PK depId) {
            if(!IdUtils.isEmpty(depId)){
                this.depId = depId;
            }
            return this;
        }

        @Override
        public TsRoleQuery depIdNot(PK depIdNot) {
            if(!IdUtils.isEmpty(depIdNot)){
                this.depId_NE = depIdNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery depIdIn(PK depIdIn) {
            if(!IdUtils.isEmpty(depIdIn)){
                if(this.depId_IN == null){
                    this.depId_IN = new ArrayList<PK>();
                }
                this.depId_IN.add( depIdIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery depIdNotIn(PK depIdNotIn) {
            if(!IdUtils.isEmpty(depIdNotIn)){
                if(this.depId_NOTIN == null){
                    this.depId_NOTIN = new ArrayList<PK>();
                }
                this.depId_NOTIN.add( depIdNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery depIdIsNull() {
            this.isNulls.add("depId");
            return this;
        }

        @Override
        public TsRoleQuery depIdIsNotNull() {
            this.isNotNulls.add("depId");
            return this;
        }



        @Override
        public TsRoleQuery organId(String organId) {
            if(!IdUtils.isEmpty(organId)){
                this.organId = organId;
            }
            return this;
        }

        @Override
        public TsRoleQuery organIdNot(String organIdNot) {
            if(!IdUtils.isEmpty(organIdNot)){
                this.organId_NE = organIdNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery organIdLike(String organIdLike) {
            if(!IdUtils.isEmpty(organIdLike)){
                this.organId_LIKE = organIdLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery organIdNotLike(String organIdNotLike) {
            if(!IdUtils.isEmpty(organIdNotLike)){
                this.organId_NOTLIKE = organIdNotLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery organIdIn(String organIdIn) {
            if(!IdUtils.isEmpty(organIdIn)){
                if(this.organId_IN == null){
                    this.organId_IN = new ArrayList<String>();
                }
                this.organId_IN.add( organIdIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery organIdNotIn(String organIdNotIn) {
            if(!IdUtils.isEmpty(organIdNotIn)){
                if(this.organId_NOTIN == null){
                    this.organId_NOTIN = new ArrayList<String>();
                }
                this.organId_NOTIN.add( organIdNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery organIdIsNull() {
            this.isNulls.add("organId");
            return this;
        }

        @Override
        public TsRoleQuery organIdIsNotNull() {
            this.isNotNulls.add("organId");
            return this;
        }


        @Override
        public TsRoleQuery roleStatus(String roleStatus) {
            if(!IdUtils.isEmpty(roleStatus)){
                this.roleStatus = roleStatus;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleStatusNot(String roleStatusNot) {
            if(!IdUtils.isEmpty(roleStatusNot)){
                this.roleStatus_NE = roleStatusNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery roleStatusIn(String roleStatusIn) {
            if(!IdUtils.isEmpty(roleStatusIn)){
                if(this.roleStatus_IN == null){
                    this.roleStatus_IN = new ArrayList<String>();
                }
                this.roleStatus_IN.add( roleStatusIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery roleStatusNotIn(String roleStatusNotIn) {
            if(!IdUtils.isEmpty(roleStatusNotIn)){
                if(this.roleStatus_NOTIN == null){
                    this.roleStatus_NOTIN = new ArrayList<String>();
                }
                this.roleStatus_NOTIN.add( roleStatusNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery roleStatusIsNull() {
            this.isNulls.add("roleStatus");
            return this;
        }

        @Override
        public TsRoleQuery roleStatusIsNotNull() {
            this.isNotNulls.add("roleStatus");
            return this;
        }



        @Override
        public TsRoleQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TsRoleQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TsRoleQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TsRoleQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsRoleQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsRoleQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsRoleQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsRoleQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsRoleQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsRoleQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsRoleQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsRoleQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsRoleQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsRoleQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsRoleQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsRoleQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsRoleQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsRoleQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsRoleQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsRoleQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsRoleQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsRoleQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsRoleQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsRoleQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public TsRoleQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsRoleQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsRoleQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TsRoleQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsRoleQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsRoleQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}