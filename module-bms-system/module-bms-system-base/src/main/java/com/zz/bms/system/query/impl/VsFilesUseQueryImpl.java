package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.VsFilesUseEntity;
import com.zz.bms.system.query.VsFilesUseQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 文件使用 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class VsFilesUseQueryImpl<PK extends Serializable> extends VsFilesUseAbstractQueryImpl<PK> implements VsFilesUseQuery<PK>, Serializable  {

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

        private List<String> accessUrl_IN;
        private List<String> accessUrl_NOTIN;

        private List<String> fileHost_IN;
        private List<String> fileHost_NOTIN;

        private List<String> filePath_IN;
        private List<String> filePath_NOTIN;

        private List<String> fileName_IN;
        private List<String> fileName_NOTIN;

        private List<String> fileSuffix_IN;
        private List<String> fileSuffix_NOTIN;

        private List<String> contentType_IN;
        private List<String> contentType_NOTIN;
        private List<String> fileEngine_IN;
        private List<String> fileEngine_NOTIN;


        private List<String> md5_IN;
        private List<String> md5_NOTIN;


        @Override
        public VsFilesUseQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public VsFilesUseQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public VsFilesUseQuery fileId(String fileId) {
            if(!IdUtils.isEmpty(fileId)){
                this.fileId = fileId;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileIdNot(String fileIdNot) {
            if(!IdUtils.isEmpty(fileIdNot)){
                this.fileId_NE = fileIdNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileIdLike(String fileIdLike) {
            if(!IdUtils.isEmpty(fileIdLike)){
                this.fileId_LIKE = fileIdLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileIdNotLike(String fileIdNotLike) {
            if(!IdUtils.isEmpty(fileIdNotLike)){
                this.fileId_NOTLIKE = fileIdNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileIdIn(String fileIdIn) {
            if(!IdUtils.isEmpty(fileIdIn)){
                if(this.fileId_IN == null){
                    this.fileId_IN = new ArrayList<String>();
                }
                this.fileId_IN.add( fileIdIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileIdNotIn(String fileIdNotIn) {
            if(!IdUtils.isEmpty(fileIdNotIn)){
                if(this.fileId_NOTIN == null){
                    this.fileId_NOTIN = new ArrayList<String>();
                }
                this.fileId_NOTIN.add( fileIdNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileIdIsNull() {
            this.isNulls.add("fileId");
            return this;
        }

        @Override
        public VsFilesUseQuery fileIdIsNotNull() {
            this.isNotNulls.add("fileId");
            return this;
        }



        @Override
        public VsFilesUseQuery showName(String showName) {
            if(!IdUtils.isEmpty(showName)){
                this.showName = showName;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery showNameNot(String showNameNot) {
            if(!IdUtils.isEmpty(showNameNot)){
                this.showName_NE = showNameNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery showNameLike(String showNameLike) {
            if(!IdUtils.isEmpty(showNameLike)){
                this.showName_LIKE = showNameLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery showNameNotLike(String showNameNotLike) {
            if(!IdUtils.isEmpty(showNameNotLike)){
                this.showName_NOTLIKE = showNameNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery showNameIn(String showNameIn) {
            if(!IdUtils.isEmpty(showNameIn)){
                if(this.showName_IN == null){
                    this.showName_IN = new ArrayList<String>();
                }
                this.showName_IN.add( showNameIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery showNameNotIn(String showNameNotIn) {
            if(!IdUtils.isEmpty(showNameNotIn)){
                if(this.showName_NOTIN == null){
                    this.showName_NOTIN = new ArrayList<String>();
                }
                this.showName_NOTIN.add( showNameNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery showNameIsNull() {
            this.isNulls.add("showName");
            return this;
        }

        @Override
        public VsFilesUseQuery showNameIsNotNull() {
            this.isNotNulls.add("showName");
            return this;
        }


        @Override
        public VsFilesUseQuery businessType(String businessType) {
            if(!IdUtils.isEmpty(businessType)){
                this.businessType = businessType;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTypeNot(String businessTypeNot) {
            if(!IdUtils.isEmpty(businessTypeNot)){
                this.businessType_NE = businessTypeNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTypeIn(String businessTypeIn) {
            if(!IdUtils.isEmpty(businessTypeIn)){
                if(this.businessType_IN == null){
                    this.businessType_IN = new ArrayList<String>();
                }
                this.businessType_IN.add( businessTypeIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTypeNotIn(String businessTypeNotIn) {
            if(!IdUtils.isEmpty(businessTypeNotIn)){
                if(this.businessType_NOTIN == null){
                    this.businessType_NOTIN = new ArrayList<String>();
                }
                this.businessType_NOTIN.add( businessTypeNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTypeIsNull() {
            this.isNulls.add("businessType");
            return this;
        }

        @Override
        public VsFilesUseQuery businessTypeIsNotNull() {
            this.isNotNulls.add("businessType");
            return this;
        }



        @Override
        public VsFilesUseQuery businessTmpId(String businessTmpId) {
            if(!IdUtils.isEmpty(businessTmpId)){
                this.businessTmpId = businessTmpId;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTmpIdNot(String businessTmpIdNot) {
            if(!IdUtils.isEmpty(businessTmpIdNot)){
                this.businessTmpId_NE = businessTmpIdNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTmpIdLike(String businessTmpIdLike) {
            if(!IdUtils.isEmpty(businessTmpIdLike)){
                this.businessTmpId_LIKE = businessTmpIdLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTmpIdNotLike(String businessTmpIdNotLike) {
            if(!IdUtils.isEmpty(businessTmpIdNotLike)){
                this.businessTmpId_NOTLIKE = businessTmpIdNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTmpIdIn(String businessTmpIdIn) {
            if(!IdUtils.isEmpty(businessTmpIdIn)){
                if(this.businessTmpId_IN == null){
                    this.businessTmpId_IN = new ArrayList<String>();
                }
                this.businessTmpId_IN.add( businessTmpIdIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTmpIdNotIn(String businessTmpIdNotIn) {
            if(!IdUtils.isEmpty(businessTmpIdNotIn)){
                if(this.businessTmpId_NOTIN == null){
                    this.businessTmpId_NOTIN = new ArrayList<String>();
                }
                this.businessTmpId_NOTIN.add( businessTmpIdNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessTmpIdIsNull() {
            this.isNulls.add("businessTmpId");
            return this;
        }

        @Override
        public VsFilesUseQuery businessTmpIdIsNotNull() {
            this.isNotNulls.add("businessTmpId");
            return this;
        }



        @Override
        public VsFilesUseQuery businessId(String businessId) {
            if(!IdUtils.isEmpty(businessId)){
                this.businessId = businessId;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessIdNot(String businessIdNot) {
            if(!IdUtils.isEmpty(businessIdNot)){
                this.businessId_NE = businessIdNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessIdLike(String businessIdLike) {
            if(!IdUtils.isEmpty(businessIdLike)){
                this.businessId_LIKE = businessIdLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessIdNotLike(String businessIdNotLike) {
            if(!IdUtils.isEmpty(businessIdNotLike)){
                this.businessId_NOTLIKE = businessIdNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessIdIn(String businessIdIn) {
            if(!IdUtils.isEmpty(businessIdIn)){
                if(this.businessId_IN == null){
                    this.businessId_IN = new ArrayList<String>();
                }
                this.businessId_IN.add( businessIdIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessIdNotIn(String businessIdNotIn) {
            if(!IdUtils.isEmpty(businessIdNotIn)){
                if(this.businessId_NOTIN == null){
                    this.businessId_NOTIN = new ArrayList<String>();
                }
                this.businessId_NOTIN.add( businessIdNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery businessIdIsNull() {
            this.isNulls.add("businessId");
            return this;
        }

        @Override
        public VsFilesUseQuery businessIdIsNotNull() {
            this.isNotNulls.add("businessId");
            return this;
        }


        @Override
        public VsFilesUseQuery fileOrder(Integer fileOrder) {
            if(!IdUtils.isEmpty(fileOrder)){
                this.fileOrder = fileOrder;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileOrderNot(Integer fileOrderNot) {
            if(!IdUtils.isEmpty(fileOrderNot)){
                this.fileOrder_NE = fileOrderNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileOrderGreaterThan(Integer fileOrderGreaterThan){
            if(fileOrderGreaterThan != null){
                this.fileOrder_GT = fileOrderGreaterThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileOrderGreaterEqual(Integer fileOrderGreaterEqual){
            if(fileOrderGreaterEqual != null){
                this.fileOrder_GE = fileOrderGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileOrderLessThan(Integer fileOrderLessThan){
            if(fileOrderLessThan != null){
                this.fileOrder_LT = fileOrderLessThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileOrderLessEqual(Integer fileOrderLessEqual){
            if(fileOrderLessEqual != null){
                this.fileOrder_LE = fileOrderLessEqual;
            }
            return this;
        }


        @Override
        public VsFilesUseQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public VsFilesUseQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public VsFilesUseQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public VsFilesUseQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public VsFilesUseQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public VsFilesUseQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public VsFilesUseQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsFilesUseQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public VsFilesUseQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public VsFilesUseQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public VsFilesUseQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public VsFilesUseQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public VsFilesUseQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public VsFilesUseQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public VsFilesUseQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



        @Override
        public VsFilesUseQuery accessUrl(String accessUrl) {
            if(!IdUtils.isEmpty(accessUrl)){
                this.accessUrl = accessUrl;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery accessUrlNot(String accessUrlNot) {
            if(!IdUtils.isEmpty(accessUrlNot)){
                this.accessUrl_NE = accessUrlNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery accessUrlLike(String accessUrlLike) {
            if(!IdUtils.isEmpty(accessUrlLike)){
                this.accessUrl_LIKE = accessUrlLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery accessUrlNotLike(String accessUrlNotLike) {
            if(!IdUtils.isEmpty(accessUrlNotLike)){
                this.accessUrl_NOTLIKE = accessUrlNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery accessUrlIn(String accessUrlIn) {
            if(!IdUtils.isEmpty(accessUrlIn)){
                if(this.accessUrl_IN == null){
                    this.accessUrl_IN = new ArrayList<String>();
                }
                this.accessUrl_IN.add( accessUrlIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery accessUrlNotIn(String accessUrlNotIn) {
            if(!IdUtils.isEmpty(accessUrlNotIn)){
                if(this.accessUrl_NOTIN == null){
                    this.accessUrl_NOTIN = new ArrayList<String>();
                }
                this.accessUrl_NOTIN.add( accessUrlNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery accessUrlIsNull() {
            this.isNulls.add("accessUrl");
            return this;
        }

        @Override
        public VsFilesUseQuery accessUrlIsNotNull() {
            this.isNotNulls.add("accessUrl");
            return this;
        }



        @Override
        public VsFilesUseQuery fileHost(String fileHost) {
            if(!IdUtils.isEmpty(fileHost)){
                this.fileHost = fileHost;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileHostNot(String fileHostNot) {
            if(!IdUtils.isEmpty(fileHostNot)){
                this.fileHost_NE = fileHostNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileHostLike(String fileHostLike) {
            if(!IdUtils.isEmpty(fileHostLike)){
                this.fileHost_LIKE = fileHostLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileHostNotLike(String fileHostNotLike) {
            if(!IdUtils.isEmpty(fileHostNotLike)){
                this.fileHost_NOTLIKE = fileHostNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileHostIn(String fileHostIn) {
            if(!IdUtils.isEmpty(fileHostIn)){
                if(this.fileHost_IN == null){
                    this.fileHost_IN = new ArrayList<String>();
                }
                this.fileHost_IN.add( fileHostIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileHostNotIn(String fileHostNotIn) {
            if(!IdUtils.isEmpty(fileHostNotIn)){
                if(this.fileHost_NOTIN == null){
                    this.fileHost_NOTIN = new ArrayList<String>();
                }
                this.fileHost_NOTIN.add( fileHostNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileHostIsNull() {
            this.isNulls.add("fileHost");
            return this;
        }

        @Override
        public VsFilesUseQuery fileHostIsNotNull() {
            this.isNotNulls.add("fileHost");
            return this;
        }



        @Override
        public VsFilesUseQuery filePath(String filePath) {
            if(!IdUtils.isEmpty(filePath)){
                this.filePath = filePath;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery filePathNot(String filePathNot) {
            if(!IdUtils.isEmpty(filePathNot)){
                this.filePath_NE = filePathNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery filePathLike(String filePathLike) {
            if(!IdUtils.isEmpty(filePathLike)){
                this.filePath_LIKE = filePathLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery filePathNotLike(String filePathNotLike) {
            if(!IdUtils.isEmpty(filePathNotLike)){
                this.filePath_NOTLIKE = filePathNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery filePathIn(String filePathIn) {
            if(!IdUtils.isEmpty(filePathIn)){
                if(this.filePath_IN == null){
                    this.filePath_IN = new ArrayList<String>();
                }
                this.filePath_IN.add( filePathIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery filePathNotIn(String filePathNotIn) {
            if(!IdUtils.isEmpty(filePathNotIn)){
                if(this.filePath_NOTIN == null){
                    this.filePath_NOTIN = new ArrayList<String>();
                }
                this.filePath_NOTIN.add( filePathNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery filePathIsNull() {
            this.isNulls.add("filePath");
            return this;
        }

        @Override
        public VsFilesUseQuery filePathIsNotNull() {
            this.isNotNulls.add("filePath");
            return this;
        }



        @Override
        public VsFilesUseQuery fileName(String fileName) {
            if(!IdUtils.isEmpty(fileName)){
                this.fileName = fileName;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileNameNot(String fileNameNot) {
            if(!IdUtils.isEmpty(fileNameNot)){
                this.fileName_NE = fileNameNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileNameLike(String fileNameLike) {
            if(!IdUtils.isEmpty(fileNameLike)){
                this.fileName_LIKE = fileNameLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileNameNotLike(String fileNameNotLike) {
            if(!IdUtils.isEmpty(fileNameNotLike)){
                this.fileName_NOTLIKE = fileNameNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileNameIn(String fileNameIn) {
            if(!IdUtils.isEmpty(fileNameIn)){
                if(this.fileName_IN == null){
                    this.fileName_IN = new ArrayList<String>();
                }
                this.fileName_IN.add( fileNameIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileNameNotIn(String fileNameNotIn) {
            if(!IdUtils.isEmpty(fileNameNotIn)){
                if(this.fileName_NOTIN == null){
                    this.fileName_NOTIN = new ArrayList<String>();
                }
                this.fileName_NOTIN.add( fileNameNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileNameIsNull() {
            this.isNulls.add("fileName");
            return this;
        }

        @Override
        public VsFilesUseQuery fileNameIsNotNull() {
            this.isNotNulls.add("fileName");
            return this;
        }


        @Override
        public VsFilesUseQuery fileSize(Long fileSize) {
            if(!IdUtils.isEmpty(fileSize)){
                this.fileSize = fileSize;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSizeNot(Long fileSizeNot) {
            if(!IdUtils.isEmpty(fileSizeNot)){
                this.fileSize_NE = fileSizeNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSizeGreaterThan(Long fileSizeGreaterThan){
            if(fileSizeGreaterThan != null){
                this.fileSize_GT = fileSizeGreaterThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSizeGreaterEqual(Long fileSizeGreaterEqual){
            if(fileSizeGreaterEqual != null){
                this.fileSize_GE = fileSizeGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSizeLessThan(Long fileSizeLessThan){
            if(fileSizeLessThan != null){
                this.fileSize_LT = fileSizeLessThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSizeLessEqual(Long fileSizeLessEqual){
            if(fileSizeLessEqual != null){
                this.fileSize_LE = fileSizeLessEqual;
            }
            return this;
        }


        @Override
        public VsFilesUseQuery fileSuffix(String fileSuffix) {
            if(!IdUtils.isEmpty(fileSuffix)){
                this.fileSuffix = fileSuffix;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSuffixNot(String fileSuffixNot) {
            if(!IdUtils.isEmpty(fileSuffixNot)){
                this.fileSuffix_NE = fileSuffixNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSuffixLike(String fileSuffixLike) {
            if(!IdUtils.isEmpty(fileSuffixLike)){
                this.fileSuffix_LIKE = fileSuffixLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSuffixNotLike(String fileSuffixNotLike) {
            if(!IdUtils.isEmpty(fileSuffixNotLike)){
                this.fileSuffix_NOTLIKE = fileSuffixNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSuffixIn(String fileSuffixIn) {
            if(!IdUtils.isEmpty(fileSuffixIn)){
                if(this.fileSuffix_IN == null){
                    this.fileSuffix_IN = new ArrayList<String>();
                }
                this.fileSuffix_IN.add( fileSuffixIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSuffixNotIn(String fileSuffixNotIn) {
            if(!IdUtils.isEmpty(fileSuffixNotIn)){
                if(this.fileSuffix_NOTIN == null){
                    this.fileSuffix_NOTIN = new ArrayList<String>();
                }
                this.fileSuffix_NOTIN.add( fileSuffixNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileSuffixIsNull() {
            this.isNulls.add("fileSuffix");
            return this;
        }

        @Override
        public VsFilesUseQuery fileSuffixIsNotNull() {
            this.isNotNulls.add("fileSuffix");
            return this;
        }



        @Override
        public VsFilesUseQuery contentType(String contentType) {
            if(!IdUtils.isEmpty(contentType)){
                this.contentType = contentType;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery contentTypeNot(String contentTypeNot) {
            if(!IdUtils.isEmpty(contentTypeNot)){
                this.contentType_NE = contentTypeNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery contentTypeLike(String contentTypeLike) {
            if(!IdUtils.isEmpty(contentTypeLike)){
                this.contentType_LIKE = contentTypeLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery contentTypeNotLike(String contentTypeNotLike) {
            if(!IdUtils.isEmpty(contentTypeNotLike)){
                this.contentType_NOTLIKE = contentTypeNotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery contentTypeIn(String contentTypeIn) {
            if(!IdUtils.isEmpty(contentTypeIn)){
                if(this.contentType_IN == null){
                    this.contentType_IN = new ArrayList<String>();
                }
                this.contentType_IN.add( contentTypeIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery contentTypeNotIn(String contentTypeNotIn) {
            if(!IdUtils.isEmpty(contentTypeNotIn)){
                if(this.contentType_NOTIN == null){
                    this.contentType_NOTIN = new ArrayList<String>();
                }
                this.contentType_NOTIN.add( contentTypeNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery contentTypeIsNull() {
            this.isNulls.add("contentType");
            return this;
        }

        @Override
        public VsFilesUseQuery contentTypeIsNotNull() {
            this.isNotNulls.add("contentType");
            return this;
        }


        @Override
        public VsFilesUseQuery fileEngine(String fileEngine) {
            if(!IdUtils.isEmpty(fileEngine)){
                this.fileEngine = fileEngine;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileEngineNot(String fileEngineNot) {
            if(!IdUtils.isEmpty(fileEngineNot)){
                this.fileEngine_NE = fileEngineNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileEngineIn(String fileEngineIn) {
            if(!IdUtils.isEmpty(fileEngineIn)){
                if(this.fileEngine_IN == null){
                    this.fileEngine_IN = new ArrayList<String>();
                }
                this.fileEngine_IN.add( fileEngineIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileEngineNotIn(String fileEngineNotIn) {
            if(!IdUtils.isEmpty(fileEngineNotIn)){
                if(this.fileEngine_NOTIN == null){
                    this.fileEngine_NOTIN = new ArrayList<String>();
                }
                this.fileEngine_NOTIN.add( fileEngineNotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery fileEngineIsNull() {
            this.isNulls.add("fileEngine");
            return this;
        }

        @Override
        public VsFilesUseQuery fileEngineIsNotNull() {
            this.isNotNulls.add("fileEngine");
            return this;
        }



        @Override
        public VsFilesUseQuery md5(String md5) {
            if(!IdUtils.isEmpty(md5)){
                this.md5 = md5;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery md5Not(String md5Not) {
            if(!IdUtils.isEmpty(md5Not)){
                this.md5_NE = md5Not;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery md5Like(String md5Like) {
            if(!IdUtils.isEmpty(md5Like)){
                this.md5_LIKE = md5Like;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery md5NotLike(String md5NotLike) {
            if(!IdUtils.isEmpty(md5NotLike)){
                this.md5_NOTLIKE = md5NotLike;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery md5In(String md5In) {
            if(!IdUtils.isEmpty(md5In)){
                if(this.md5_IN == null){
                    this.md5_IN = new ArrayList<String>();
                }
                this.md5_IN.add( md5In );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery md5NotIn(String md5NotIn) {
            if(!IdUtils.isEmpty(md5NotIn)){
                if(this.md5_NOTIN == null){
                    this.md5_NOTIN = new ArrayList<String>();
                }
                this.md5_NOTIN.add( md5NotIn );
            }
            return this;
        }

        @Override
        public VsFilesUseQuery md5IsNull() {
            this.isNulls.add("md5");
            return this;
        }

        @Override
        public VsFilesUseQuery md5IsNotNull() {
            this.isNotNulls.add("md5");
            return this;
        }


        @Override
        public VsFilesUseQuery useFrequency(Integer useFrequency) {
            if(!IdUtils.isEmpty(useFrequency)){
                this.useFrequency = useFrequency;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery useFrequencyNot(Integer useFrequencyNot) {
            if(!IdUtils.isEmpty(useFrequencyNot)){
                this.useFrequency_NE = useFrequencyNot;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery useFrequencyGreaterThan(Integer useFrequencyGreaterThan){
            if(useFrequencyGreaterThan != null){
                this.useFrequency_GT = useFrequencyGreaterThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery useFrequencyGreaterEqual(Integer useFrequencyGreaterEqual){
            if(useFrequencyGreaterEqual != null){
                this.useFrequency_GE = useFrequencyGreaterEqual;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery useFrequencyLessThan(Integer useFrequencyLessThan){
            if(useFrequencyLessThan != null){
                this.useFrequency_LT = useFrequencyLessThan;
            }
            return this;
        }

        @Override
        public VsFilesUseQuery useFrequencyLessEqual(Integer useFrequencyLessEqual){
            if(useFrequencyLessEqual != null){
                this.useFrequency_LE = useFrequencyLessEqual;
            }
            return this;
        }


	
}