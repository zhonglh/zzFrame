package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsFilesUseEntity;
import com.zz.bms.system.query.TsFilesUseQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 文件使用 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class TsFilesUseQueryImpl<PK extends Serializable> extends TsFilesUseAbstractQueryImpl<PK> implements TsFilesUseQuery<PK>, Serializable  {

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
        private List<PK> tenantId_IN;
        private List<PK> tenantId_NOTIN;



        @Override
        public TsFilesUseQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsFilesUseQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsFilesUseQuery fileId(String fileId) {
            if(!IdUtils.isEmpty(fileId)){
                this.fileId = fileId;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileIdNot(String fileIdNot) {
            if(!IdUtils.isEmpty(fileIdNot)){
                this.fileId_NE = fileIdNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileIdLike(String fileIdLike) {
            if(!IdUtils.isEmpty(fileIdLike)){
                this.fileId_LIKE = fileIdLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileIdNotLike(String fileIdNotLike) {
            if(!IdUtils.isEmpty(fileIdNotLike)){
                this.fileId_NOTLIKE = fileIdNotLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileIdIn(String fileIdIn) {
            if(!IdUtils.isEmpty(fileIdIn)){
                if(this.fileId_IN == null){
                    this.fileId_IN = new ArrayList<String>();
                }
                this.fileId_IN.add( fileIdIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileIdNotIn(String fileIdNotIn) {
            if(!IdUtils.isEmpty(fileIdNotIn)){
                if(this.fileId_NOTIN == null){
                    this.fileId_NOTIN = new ArrayList<String>();
                }
                this.fileId_NOTIN.add( fileIdNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileIdIsNull() {
            this.isNulls.add("fileId");
            return this;
        }

        @Override
        public TsFilesUseQuery fileIdIsNotNull() {
            this.isNotNulls.add("fileId");
            return this;
        }



        @Override
        public TsFilesUseQuery showName(String showName) {
            if(!IdUtils.isEmpty(showName)){
                this.showName = showName;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery showNameNot(String showNameNot) {
            if(!IdUtils.isEmpty(showNameNot)){
                this.showName_NE = showNameNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery showNameLike(String showNameLike) {
            if(!IdUtils.isEmpty(showNameLike)){
                this.showName_LIKE = showNameLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery showNameNotLike(String showNameNotLike) {
            if(!IdUtils.isEmpty(showNameNotLike)){
                this.showName_NOTLIKE = showNameNotLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery showNameIn(String showNameIn) {
            if(!IdUtils.isEmpty(showNameIn)){
                if(this.showName_IN == null){
                    this.showName_IN = new ArrayList<String>();
                }
                this.showName_IN.add( showNameIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery showNameNotIn(String showNameNotIn) {
            if(!IdUtils.isEmpty(showNameNotIn)){
                if(this.showName_NOTIN == null){
                    this.showName_NOTIN = new ArrayList<String>();
                }
                this.showName_NOTIN.add( showNameNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery showNameIsNull() {
            this.isNulls.add("showName");
            return this;
        }

        @Override
        public TsFilesUseQuery showNameIsNotNull() {
            this.isNotNulls.add("showName");
            return this;
        }


        @Override
        public TsFilesUseQuery businessType(String businessType) {
            if(!IdUtils.isEmpty(businessType)){
                this.businessType = businessType;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTypeNot(String businessTypeNot) {
            if(!IdUtils.isEmpty(businessTypeNot)){
                this.businessType_NE = businessTypeNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTypeIn(String businessTypeIn) {
            if(!IdUtils.isEmpty(businessTypeIn)){
                if(this.businessType_IN == null){
                    this.businessType_IN = new ArrayList<String>();
                }
                this.businessType_IN.add( businessTypeIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTypeNotIn(String businessTypeNotIn) {
            if(!IdUtils.isEmpty(businessTypeNotIn)){
                if(this.businessType_NOTIN == null){
                    this.businessType_NOTIN = new ArrayList<String>();
                }
                this.businessType_NOTIN.add( businessTypeNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTypeIsNull() {
            this.isNulls.add("businessType");
            return this;
        }

        @Override
        public TsFilesUseQuery businessTypeIsNotNull() {
            this.isNotNulls.add("businessType");
            return this;
        }



        @Override
        public TsFilesUseQuery businessTmpId(String businessTmpId) {
            if(!IdUtils.isEmpty(businessTmpId)){
                this.businessTmpId = businessTmpId;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTmpIdNot(String businessTmpIdNot) {
            if(!IdUtils.isEmpty(businessTmpIdNot)){
                this.businessTmpId_NE = businessTmpIdNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTmpIdLike(String businessTmpIdLike) {
            if(!IdUtils.isEmpty(businessTmpIdLike)){
                this.businessTmpId_LIKE = businessTmpIdLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTmpIdNotLike(String businessTmpIdNotLike) {
            if(!IdUtils.isEmpty(businessTmpIdNotLike)){
                this.businessTmpId_NOTLIKE = businessTmpIdNotLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTmpIdIn(String businessTmpIdIn) {
            if(!IdUtils.isEmpty(businessTmpIdIn)){
                if(this.businessTmpId_IN == null){
                    this.businessTmpId_IN = new ArrayList<String>();
                }
                this.businessTmpId_IN.add( businessTmpIdIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTmpIdNotIn(String businessTmpIdNotIn) {
            if(!IdUtils.isEmpty(businessTmpIdNotIn)){
                if(this.businessTmpId_NOTIN == null){
                    this.businessTmpId_NOTIN = new ArrayList<String>();
                }
                this.businessTmpId_NOTIN.add( businessTmpIdNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessTmpIdIsNull() {
            this.isNulls.add("businessTmpId");
            return this;
        }

        @Override
        public TsFilesUseQuery businessTmpIdIsNotNull() {
            this.isNotNulls.add("businessTmpId");
            return this;
        }



        @Override
        public TsFilesUseQuery businessId(String businessId) {
            if(!IdUtils.isEmpty(businessId)){
                this.businessId = businessId;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessIdNot(String businessIdNot) {
            if(!IdUtils.isEmpty(businessIdNot)){
                this.businessId_NE = businessIdNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessIdLike(String businessIdLike) {
            if(!IdUtils.isEmpty(businessIdLike)){
                this.businessId_LIKE = businessIdLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessIdNotLike(String businessIdNotLike) {
            if(!IdUtils.isEmpty(businessIdNotLike)){
                this.businessId_NOTLIKE = businessIdNotLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessIdIn(String businessIdIn) {
            if(!IdUtils.isEmpty(businessIdIn)){
                if(this.businessId_IN == null){
                    this.businessId_IN = new ArrayList<String>();
                }
                this.businessId_IN.add( businessIdIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessIdNotIn(String businessIdNotIn) {
            if(!IdUtils.isEmpty(businessIdNotIn)){
                if(this.businessId_NOTIN == null){
                    this.businessId_NOTIN = new ArrayList<String>();
                }
                this.businessId_NOTIN.add( businessIdNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery businessIdIsNull() {
            this.isNulls.add("businessId");
            return this;
        }

        @Override
        public TsFilesUseQuery businessIdIsNotNull() {
            this.isNotNulls.add("businessId");
            return this;
        }


        @Override
        public TsFilesUseQuery fileOrder(Integer fileOrder) {
            if(!IdUtils.isEmpty(fileOrder)){
                this.fileOrder = fileOrder;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileOrderNot(Integer fileOrderNot) {
            if(!IdUtils.isEmpty(fileOrderNot)){
                this.fileOrder_NE = fileOrderNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileOrderGreaterThan(Integer fileOrderGreaterThan){
            if(fileOrderGreaterThan != null){
                this.fileOrder_GT = fileOrderGreaterThan;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileOrderGreaterEqual(Integer fileOrderGreaterEqual){
            if(fileOrderGreaterEqual != null){
                this.fileOrder_GE = fileOrderGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileOrderLessThan(Integer fileOrderLessThan){
            if(fileOrderLessThan != null){
                this.fileOrder_LT = fileOrderLessThan;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery fileOrderLessEqual(Integer fileOrderLessEqual){
            if(fileOrderLessEqual != null){
                this.fileOrder_LE = fileOrderLessEqual;
            }
            return this;
        }


        @Override
        public TsFilesUseQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TsFilesUseQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TsFilesUseQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsFilesUseQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsFilesUseQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsFilesUseQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsFilesUseQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsFilesUseQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsFilesUseQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsFilesUseQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsFilesUseQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsFilesUseQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsFilesUseQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery tenantId(PK tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery tenantIdNot(PK tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsFilesUseQuery tenantIdIn(PK tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<PK>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery tenantIdNotIn(PK tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<PK>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsFilesUseQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsFilesUseQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}