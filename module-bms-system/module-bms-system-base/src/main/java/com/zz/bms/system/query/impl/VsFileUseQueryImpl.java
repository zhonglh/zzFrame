package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.VsFileUseEntity;
import com.zz.bms.system.query.VsFileUseQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 文件使用 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-1 13:52:03
*/
public class VsFileUseQueryImpl<PK extends Serializable> extends VsFileUseAbstractQueryImpl<PK> implements VsFileUseQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> fileId_IN;
        private List<String> fileId_NOTIN;

        private List<String> showName_IN;
        private List<String> showName_NOTIN;
        private List<String> businessType_IN;
        private List<String> businessType_NOTIN;


        private List<String> businessTmpId_IN;
        private List<String> businessTmpId_NOTIN;

        private List<String> businessId_IN;
        private List<String> businessId_NOTIN;

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

        private List<String> contentType_IN;
        private List<String> contentType_NOTIN;
        private List<String> fileEngine_IN;
        private List<String> fileEngine_NOTIN;


        private List<String> fileHost_IN;
        private List<String> fileHost_NOTIN;


        @Override
        public VsFileUseQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public VsFileUseQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public VsFileUseQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public VsFileUseQuery fileId(String fileId) {
            if(!IdUtils.isEmpty(fileId)){
                this.fileId = fileId;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileIdNot(String fileIdNot) {
            if(!IdUtils.isEmpty(fileIdNot)){
                this.fileId_NE = fileIdNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileIdLike(String fileIdLike) {
            if(!IdUtils.isEmpty(fileIdLike)){
                this.fileId_LIKE = fileIdLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileIdNotLike(String fileIdNotLike) {
            if(!IdUtils.isEmpty(fileIdNotLike)){
                this.fileId_NOTLIKE = fileIdNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileIdIn(String fileIdIn) {
            if(!IdUtils.isEmpty(fileIdIn)){
                if(this.fileId_IN == null){
                    this.fileId_IN = new ArrayList<String>();
                }
                this.fileId_IN.add( fileIdIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileIdNotIn(String fileIdNotIn) {
            if(!IdUtils.isEmpty(fileIdNotIn)){
                if(this.fileId_NOTIN == null){
                    this.fileId_NOTIN = new ArrayList<String>();
                }
                this.fileId_NOTIN.add( fileIdNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileIdIsNull() {
            this.isNulls.add("fileId");
            return this;
        }

        @Override
        public VsFileUseQuery fileIdIsNotNull() {
            this.isNotNulls.add("fileId");
            return this;
        }



        @Override
        public VsFileUseQuery showName(String showName) {
            if(!IdUtils.isEmpty(showName)){
                this.showName = showName;
            }
            return this;
        }

        @Override
        public VsFileUseQuery showNameNot(String showNameNot) {
            if(!IdUtils.isEmpty(showNameNot)){
                this.showName_NE = showNameNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery showNameLike(String showNameLike) {
            if(!IdUtils.isEmpty(showNameLike)){
                this.showName_LIKE = showNameLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery showNameNotLike(String showNameNotLike) {
            if(!IdUtils.isEmpty(showNameNotLike)){
                this.showName_NOTLIKE = showNameNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery showNameIn(String showNameIn) {
            if(!IdUtils.isEmpty(showNameIn)){
                if(this.showName_IN == null){
                    this.showName_IN = new ArrayList<String>();
                }
                this.showName_IN.add( showNameIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery showNameNotIn(String showNameNotIn) {
            if(!IdUtils.isEmpty(showNameNotIn)){
                if(this.showName_NOTIN == null){
                    this.showName_NOTIN = new ArrayList<String>();
                }
                this.showName_NOTIN.add( showNameNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery showNameIsNull() {
            this.isNulls.add("showName");
            return this;
        }

        @Override
        public VsFileUseQuery showNameIsNotNull() {
            this.isNotNulls.add("showName");
            return this;
        }


        @Override
        public VsFileUseQuery businessType(String businessType) {
            if(!IdUtils.isEmpty(businessType)){
                this.businessType = businessType;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTypeNot(String businessTypeNot) {
            if(!IdUtils.isEmpty(businessTypeNot)){
                this.businessType_NE = businessTypeNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTypeIn(String businessTypeIn) {
            if(!IdUtils.isEmpty(businessTypeIn)){
                if(this.businessType_IN == null){
                    this.businessType_IN = new ArrayList<String>();
                }
                this.businessType_IN.add( businessTypeIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTypeNotIn(String businessTypeNotIn) {
            if(!IdUtils.isEmpty(businessTypeNotIn)){
                if(this.businessType_NOTIN == null){
                    this.businessType_NOTIN = new ArrayList<String>();
                }
                this.businessType_NOTIN.add( businessTypeNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTypeIsNull() {
            this.isNulls.add("businessType");
            return this;
        }

        @Override
        public VsFileUseQuery businessTypeIsNotNull() {
            this.isNotNulls.add("businessType");
            return this;
        }



        @Override
        public VsFileUseQuery businessTmpId(String businessTmpId) {
            if(!IdUtils.isEmpty(businessTmpId)){
                this.businessTmpId = businessTmpId;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTmpIdNot(String businessTmpIdNot) {
            if(!IdUtils.isEmpty(businessTmpIdNot)){
                this.businessTmpId_NE = businessTmpIdNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTmpIdLike(String businessTmpIdLike) {
            if(!IdUtils.isEmpty(businessTmpIdLike)){
                this.businessTmpId_LIKE = businessTmpIdLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTmpIdNotLike(String businessTmpIdNotLike) {
            if(!IdUtils.isEmpty(businessTmpIdNotLike)){
                this.businessTmpId_NOTLIKE = businessTmpIdNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTmpIdIn(String businessTmpIdIn) {
            if(!IdUtils.isEmpty(businessTmpIdIn)){
                if(this.businessTmpId_IN == null){
                    this.businessTmpId_IN = new ArrayList<String>();
                }
                this.businessTmpId_IN.add( businessTmpIdIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTmpIdNotIn(String businessTmpIdNotIn) {
            if(!IdUtils.isEmpty(businessTmpIdNotIn)){
                if(this.businessTmpId_NOTIN == null){
                    this.businessTmpId_NOTIN = new ArrayList<String>();
                }
                this.businessTmpId_NOTIN.add( businessTmpIdNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessTmpIdIsNull() {
            this.isNulls.add("businessTmpId");
            return this;
        }

        @Override
        public VsFileUseQuery businessTmpIdIsNotNull() {
            this.isNotNulls.add("businessTmpId");
            return this;
        }



        @Override
        public VsFileUseQuery businessId(String businessId) {
            if(!IdUtils.isEmpty(businessId)){
                this.businessId = businessId;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessIdNot(String businessIdNot) {
            if(!IdUtils.isEmpty(businessIdNot)){
                this.businessId_NE = businessIdNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessIdLike(String businessIdLike) {
            if(!IdUtils.isEmpty(businessIdLike)){
                this.businessId_LIKE = businessIdLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessIdNotLike(String businessIdNotLike) {
            if(!IdUtils.isEmpty(businessIdNotLike)){
                this.businessId_NOTLIKE = businessIdNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessIdIn(String businessIdIn) {
            if(!IdUtils.isEmpty(businessIdIn)){
                if(this.businessId_IN == null){
                    this.businessId_IN = new ArrayList<String>();
                }
                this.businessId_IN.add( businessIdIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessIdNotIn(String businessIdNotIn) {
            if(!IdUtils.isEmpty(businessIdNotIn)){
                if(this.businessId_NOTIN == null){
                    this.businessId_NOTIN = new ArrayList<String>();
                }
                this.businessId_NOTIN.add( businessIdNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery businessIdIsNull() {
            this.isNulls.add("businessId");
            return this;
        }

        @Override
        public VsFileUseQuery businessIdIsNotNull() {
            this.isNotNulls.add("businessId");
            return this;
        }


        @Override
        public VsFileUseQuery fileOrder(Integer fileOrder) {
            if(!IdUtils.isEmpty(fileOrder)){
                this.fileOrder = fileOrder;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileOrderNot(Integer fileOrderNot) {
            if(!IdUtils.isEmpty(fileOrderNot)){
                this.fileOrder_NE = fileOrderNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileOrderGreaterThan(Integer fileOrderGreaterThan){
            if(fileOrderGreaterThan != null){
                this.fileOrder_GT = fileOrderGreaterThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileOrderGreaterEqual(Integer fileOrderGreaterEqual){
            if(fileOrderGreaterEqual != null){
                this.fileOrder_GE = fileOrderGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileOrderLessThan(Integer fileOrderLessThan){
            if(fileOrderLessThan != null){
                this.fileOrder_LT = fileOrderLessThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileOrderLessEqual(Integer fileOrderLessEqual){
            if(fileOrderLessEqual != null){
                this.fileOrder_LE = fileOrderLessEqual;
            }
            return this;
        }


        @Override
        public VsFileUseQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public VsFileUseQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public VsFileUseQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public VsFileUseQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public VsFileUseQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public VsFileUseQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public VsFileUseQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public VsFileUseQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsFileUseQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public VsFileUseQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public VsFileUseQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public VsFileUseQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public VsFileUseQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public VsFileUseQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsFileUseQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public VsFileUseQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public VsFileUseQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public VsFileUseQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public VsFileUseQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }


        @Override
        public VsFileUseQuery accessUrl(Double accessUrl) {
            if(!IdUtils.isEmpty(accessUrl)){
                this.accessUrl = accessUrl;
            }
            return this;
        }

        @Override
        public VsFileUseQuery accessUrlNot(Double accessUrlNot) {
            if(!IdUtils.isEmpty(accessUrlNot)){
                this.accessUrl_NE = accessUrlNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery accessUrlGreaterThan(Double accessUrlGreaterThan){
            if(accessUrlGreaterThan != null){
                this.accessUrl_GT = accessUrlGreaterThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery accessUrlGreaterEqual(Double accessUrlGreaterEqual){
            if(accessUrlGreaterEqual != null){
                this.accessUrl_GE = accessUrlGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery accessUrlLessThan(Double accessUrlLessThan){
            if(accessUrlLessThan != null){
                this.accessUrl_LT = accessUrlLessThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery accessUrlLessEqual(Double accessUrlLessEqual){
            if(accessUrlLessEqual != null){
                this.accessUrl_LE = accessUrlLessEqual;
            }
            return this;
        }


        @Override
        public VsFileUseQuery contentType(String contentType) {
            if(!IdUtils.isEmpty(contentType)){
                this.contentType = contentType;
            }
            return this;
        }

        @Override
        public VsFileUseQuery contentTypeNot(String contentTypeNot) {
            if(!IdUtils.isEmpty(contentTypeNot)){
                this.contentType_NE = contentTypeNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery contentTypeLike(String contentTypeLike) {
            if(!IdUtils.isEmpty(contentTypeLike)){
                this.contentType_LIKE = contentTypeLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery contentTypeNotLike(String contentTypeNotLike) {
            if(!IdUtils.isEmpty(contentTypeNotLike)){
                this.contentType_NOTLIKE = contentTypeNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery contentTypeIn(String contentTypeIn) {
            if(!IdUtils.isEmpty(contentTypeIn)){
                if(this.contentType_IN == null){
                    this.contentType_IN = new ArrayList<String>();
                }
                this.contentType_IN.add( contentTypeIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery contentTypeNotIn(String contentTypeNotIn) {
            if(!IdUtils.isEmpty(contentTypeNotIn)){
                if(this.contentType_NOTIN == null){
                    this.contentType_NOTIN = new ArrayList<String>();
                }
                this.contentType_NOTIN.add( contentTypeNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery contentTypeIsNull() {
            this.isNulls.add("contentType");
            return this;
        }

        @Override
        public VsFileUseQuery contentTypeIsNotNull() {
            this.isNotNulls.add("contentType");
            return this;
        }


        @Override
        public VsFileUseQuery fileEngine(String fileEngine) {
            if(!IdUtils.isEmpty(fileEngine)){
                this.fileEngine = fileEngine;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileEngineNot(String fileEngineNot) {
            if(!IdUtils.isEmpty(fileEngineNot)){
                this.fileEngine_NE = fileEngineNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileEngineIn(String fileEngineIn) {
            if(!IdUtils.isEmpty(fileEngineIn)){
                if(this.fileEngine_IN == null){
                    this.fileEngine_IN = new ArrayList<String>();
                }
                this.fileEngine_IN.add( fileEngineIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileEngineNotIn(String fileEngineNotIn) {
            if(!IdUtils.isEmpty(fileEngineNotIn)){
                if(this.fileEngine_NOTIN == null){
                    this.fileEngine_NOTIN = new ArrayList<String>();
                }
                this.fileEngine_NOTIN.add( fileEngineNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileEngineIsNull() {
            this.isNulls.add("fileEngine");
            return this;
        }

        @Override
        public VsFileUseQuery fileEngineIsNotNull() {
            this.isNotNulls.add("fileEngine");
            return this;
        }



        @Override
        public VsFileUseQuery fileHost(String fileHost) {
            if(!IdUtils.isEmpty(fileHost)){
                this.fileHost = fileHost;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileHostNot(String fileHostNot) {
            if(!IdUtils.isEmpty(fileHostNot)){
                this.fileHost_NE = fileHostNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileHostLike(String fileHostLike) {
            if(!IdUtils.isEmpty(fileHostLike)){
                this.fileHost_LIKE = fileHostLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileHostNotLike(String fileHostNotLike) {
            if(!IdUtils.isEmpty(fileHostNotLike)){
                this.fileHost_NOTLIKE = fileHostNotLike;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileHostIn(String fileHostIn) {
            if(!IdUtils.isEmpty(fileHostIn)){
                if(this.fileHost_IN == null){
                    this.fileHost_IN = new ArrayList<String>();
                }
                this.fileHost_IN.add( fileHostIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileHostNotIn(String fileHostNotIn) {
            if(!IdUtils.isEmpty(fileHostNotIn)){
                if(this.fileHost_NOTIN == null){
                    this.fileHost_NOTIN = new ArrayList<String>();
                }
                this.fileHost_NOTIN.add( fileHostNotIn );
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileHostIsNull() {
            this.isNulls.add("fileHost");
            return this;
        }

        @Override
        public VsFileUseQuery fileHostIsNotNull() {
            this.isNotNulls.add("fileHost");
            return this;
        }


        @Override
        public VsFileUseQuery filePullName(Double filePullName) {
            if(!IdUtils.isEmpty(filePullName)){
                this.filePullName = filePullName;
            }
            return this;
        }

        @Override
        public VsFileUseQuery filePullNameNot(Double filePullNameNot) {
            if(!IdUtils.isEmpty(filePullNameNot)){
                this.filePullName_NE = filePullNameNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery filePullNameGreaterThan(Double filePullNameGreaterThan){
            if(filePullNameGreaterThan != null){
                this.filePullName_GT = filePullNameGreaterThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery filePullNameGreaterEqual(Double filePullNameGreaterEqual){
            if(filePullNameGreaterEqual != null){
                this.filePullName_GE = filePullNameGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery filePullNameLessThan(Double filePullNameLessThan){
            if(filePullNameLessThan != null){
                this.filePullName_LT = filePullNameLessThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery filePullNameLessEqual(Double filePullNameLessEqual){
            if(filePullNameLessEqual != null){
                this.filePullName_LE = filePullNameLessEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileSize(Long fileSize) {
            if(!IdUtils.isEmpty(fileSize)){
                this.fileSize = fileSize;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileSizeNot(Long fileSizeNot) {
            if(!IdUtils.isEmpty(fileSizeNot)){
                this.fileSize_NE = fileSizeNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileSizeGreaterThan(Long fileSizeGreaterThan){
            if(fileSizeGreaterThan != null){
                this.fileSize_GT = fileSizeGreaterThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileSizeGreaterEqual(Long fileSizeGreaterEqual){
            if(fileSizeGreaterEqual != null){
                this.fileSize_GE = fileSizeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileSizeLessThan(Long fileSizeLessThan){
            if(fileSizeLessThan != null){
                this.fileSize_LT = fileSizeLessThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery fileSizeLessEqual(Long fileSizeLessEqual){
            if(fileSizeLessEqual != null){
                this.fileSize_LE = fileSizeLessEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery useFrequency(Integer useFrequency) {
            if(!IdUtils.isEmpty(useFrequency)){
                this.useFrequency = useFrequency;
            }
            return this;
        }

        @Override
        public VsFileUseQuery useFrequencyNot(Integer useFrequencyNot) {
            if(!IdUtils.isEmpty(useFrequencyNot)){
                this.useFrequency_NE = useFrequencyNot;
            }
            return this;
        }

        @Override
        public VsFileUseQuery useFrequencyGreaterThan(Integer useFrequencyGreaterThan){
            if(useFrequencyGreaterThan != null){
                this.useFrequency_GT = useFrequencyGreaterThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery useFrequencyGreaterEqual(Integer useFrequencyGreaterEqual){
            if(useFrequencyGreaterEqual != null){
                this.useFrequency_GE = useFrequencyGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFileUseQuery useFrequencyLessThan(Integer useFrequencyLessThan){
            if(useFrequencyLessThan != null){
                this.useFrequency_LT = useFrequencyLessThan;
            }
            return this;
        }

        @Override
        public VsFileUseQuery useFrequencyLessEqual(Integer useFrequencyLessEqual){
            if(useFrequencyLessEqual != null){
                this.useFrequency_LE = useFrequencyLessEqual;
            }
            return this;
        }


	
}