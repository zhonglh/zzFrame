package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsFileUseEntity;
import com.zz.bms.system.query.TsFileUseQuery;

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
* @date 2019-4-11 14:06:14
*/
public class TsFileUseQueryImpl<PK extends Serializable> extends TsFileUseAbstractQueryImpl<PK> implements TsFileUseQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;

        private List<PK> fileId_IN;
        private List<PK> fileId_NOTIN;


        private List<String> showName_IN;
        private List<String> showName_NOTIN;

        private List<String> businessType_IN;
        private List<String> businessType_NOTIN;

        private List<String> businessId_IN;
        private List<String> businessId_NOTIN;

        private List<String> businessFileType_IN;
        private List<String> businessFileType_NOTIN;

        private List<String> businessTempId_IN;
        private List<String> businessTempId_NOTIN;

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
        public TsFileUseQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsFileUseQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsFileUseQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }


        @Override
        public TsFileUseQuery fileId(PK fileId) {
            if(!IdUtils.isEmpty(fileId)){
                this.fileId = fileId;
            }
            return this;
        }

        @Override
        public TsFileUseQuery fileIdNot(PK fileIdNot) {
            if(!IdUtils.isEmpty(fileIdNot)){
                this.fileId_NE = fileIdNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery fileIdIn(PK fileIdIn) {
            if(!IdUtils.isEmpty(fileIdIn)){
                if(this.fileId_IN == null){
                    this.fileId_IN = new ArrayList<PK>();
                }
                this.fileId_IN.add( fileIdIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery fileIdNotIn(PK fileIdNotIn) {
            if(!IdUtils.isEmpty(fileIdNotIn)){
                if(this.fileId_NOTIN == null){
                    this.fileId_NOTIN = new ArrayList<PK>();
                }
                this.fileId_NOTIN.add( fileIdNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery fileIdIsNull() {
            this.isNulls.add("fileId");
            return this;
        }

        @Override
        public TsFileUseQuery fileIdIsNotNull() {
            this.isNotNulls.add("fileId");
            return this;
        }



        @Override
        public TsFileUseQuery showName(String showName) {
            if(!IdUtils.isEmpty(showName)){
                this.showName = showName;
            }
            return this;
        }

        @Override
        public TsFileUseQuery showNameNot(String showNameNot) {
            if(!IdUtils.isEmpty(showNameNot)){
                this.showName_NE = showNameNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery showNameLike(String showNameLike) {
            if(!IdUtils.isEmpty(showNameLike)){
                this.showName_LIKE = showNameLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery showNameNotLike(String showNameNotLike) {
            if(!IdUtils.isEmpty(showNameNotLike)){
                this.showName_NOTLIKE = showNameNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery showNameIn(String showNameIn) {
            if(!IdUtils.isEmpty(showNameIn)){
                if(this.showName_IN == null){
                    this.showName_IN = new ArrayList<String>();
                }
                this.showName_IN.add( showNameIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery showNameNotIn(String showNameNotIn) {
            if(!IdUtils.isEmpty(showNameNotIn)){
                if(this.showName_NOTIN == null){
                    this.showName_NOTIN = new ArrayList<String>();
                }
                this.showName_NOTIN.add( showNameNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery showNameIsNull() {
            this.isNulls.add("showName");
            return this;
        }

        @Override
        public TsFileUseQuery showNameIsNotNull() {
            this.isNotNulls.add("showName");
            return this;
        }



        @Override
        public TsFileUseQuery businessType(String businessType) {
            if(!IdUtils.isEmpty(businessType)){
                this.businessType = businessType;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTypeNot(String businessTypeNot) {
            if(!IdUtils.isEmpty(businessTypeNot)){
                this.businessType_NE = businessTypeNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTypeLike(String businessTypeLike) {
            if(!IdUtils.isEmpty(businessTypeLike)){
                this.businessType_LIKE = businessTypeLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTypeNotLike(String businessTypeNotLike) {
            if(!IdUtils.isEmpty(businessTypeNotLike)){
                this.businessType_NOTLIKE = businessTypeNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTypeIn(String businessTypeIn) {
            if(!IdUtils.isEmpty(businessTypeIn)){
                if(this.businessType_IN == null){
                    this.businessType_IN = new ArrayList<String>();
                }
                this.businessType_IN.add( businessTypeIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTypeNotIn(String businessTypeNotIn) {
            if(!IdUtils.isEmpty(businessTypeNotIn)){
                if(this.businessType_NOTIN == null){
                    this.businessType_NOTIN = new ArrayList<String>();
                }
                this.businessType_NOTIN.add( businessTypeNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTypeIsNull() {
            this.isNulls.add("businessType");
            return this;
        }

        @Override
        public TsFileUseQuery businessTypeIsNotNull() {
            this.isNotNulls.add("businessType");
            return this;
        }



        @Override
        public TsFileUseQuery businessId(String businessId) {
            if(!IdUtils.isEmpty(businessId)){
                this.businessId = businessId;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessIdNot(String businessIdNot) {
            if(!IdUtils.isEmpty(businessIdNot)){
                this.businessId_NE = businessIdNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessIdLike(String businessIdLike) {
            if(!IdUtils.isEmpty(businessIdLike)){
                this.businessId_LIKE = businessIdLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessIdNotLike(String businessIdNotLike) {
            if(!IdUtils.isEmpty(businessIdNotLike)){
                this.businessId_NOTLIKE = businessIdNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessIdIn(String businessIdIn) {
            if(!IdUtils.isEmpty(businessIdIn)){
                if(this.businessId_IN == null){
                    this.businessId_IN = new ArrayList<String>();
                }
                this.businessId_IN.add( businessIdIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessIdNotIn(String businessIdNotIn) {
            if(!IdUtils.isEmpty(businessIdNotIn)){
                if(this.businessId_NOTIN == null){
                    this.businessId_NOTIN = new ArrayList<String>();
                }
                this.businessId_NOTIN.add( businessIdNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessIdIsNull() {
            this.isNulls.add("businessId");
            return this;
        }

        @Override
        public TsFileUseQuery businessIdIsNotNull() {
            this.isNotNulls.add("businessId");
            return this;
        }



        @Override
        public TsFileUseQuery businessFileType(String businessFileType) {
            if(!IdUtils.isEmpty(businessFileType)){
                this.businessFileType = businessFileType;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessFileTypeNot(String businessFileTypeNot) {
            if(!IdUtils.isEmpty(businessFileTypeNot)){
                this.businessFileType_NE = businessFileTypeNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessFileTypeLike(String businessFileTypeLike) {
            if(!IdUtils.isEmpty(businessFileTypeLike)){
                this.businessFileType_LIKE = businessFileTypeLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessFileTypeNotLike(String businessFileTypeNotLike) {
            if(!IdUtils.isEmpty(businessFileTypeNotLike)){
                this.businessFileType_NOTLIKE = businessFileTypeNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessFileTypeIn(String businessFileTypeIn) {
            if(!IdUtils.isEmpty(businessFileTypeIn)){
                if(this.businessFileType_IN == null){
                    this.businessFileType_IN = new ArrayList<String>();
                }
                this.businessFileType_IN.add( businessFileTypeIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessFileTypeNotIn(String businessFileTypeNotIn) {
            if(!IdUtils.isEmpty(businessFileTypeNotIn)){
                if(this.businessFileType_NOTIN == null){
                    this.businessFileType_NOTIN = new ArrayList<String>();
                }
                this.businessFileType_NOTIN.add( businessFileTypeNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessFileTypeIsNull() {
            this.isNulls.add("businessFileType");
            return this;
        }

        @Override
        public TsFileUseQuery businessFileTypeIsNotNull() {
            this.isNotNulls.add("businessFileType");
            return this;
        }



        @Override
        public TsFileUseQuery businessTempId(String businessTempId) {
            if(!IdUtils.isEmpty(businessTempId)){
                this.businessTempId = businessTempId;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTempIdNot(String businessTempIdNot) {
            if(!IdUtils.isEmpty(businessTempIdNot)){
                this.businessTempId_NE = businessTempIdNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTempIdLike(String businessTempIdLike) {
            if(!IdUtils.isEmpty(businessTempIdLike)){
                this.businessTempId_LIKE = businessTempIdLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTempIdNotLike(String businessTempIdNotLike) {
            if(!IdUtils.isEmpty(businessTempIdNotLike)){
                this.businessTempId_NOTLIKE = businessTempIdNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTempIdIn(String businessTempIdIn) {
            if(!IdUtils.isEmpty(businessTempIdIn)){
                if(this.businessTempId_IN == null){
                    this.businessTempId_IN = new ArrayList<String>();
                }
                this.businessTempId_IN.add( businessTempIdIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTempIdNotIn(String businessTempIdNotIn) {
            if(!IdUtils.isEmpty(businessTempIdNotIn)){
                if(this.businessTempId_NOTIN == null){
                    this.businessTempId_NOTIN = new ArrayList<String>();
                }
                this.businessTempId_NOTIN.add( businessTempIdNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery businessTempIdIsNull() {
            this.isNulls.add("businessTempId");
            return this;
        }

        @Override
        public TsFileUseQuery businessTempIdIsNotNull() {
            this.isNotNulls.add("businessTempId");
            return this;
        }


        @Override
        public TsFileUseQuery fileOrder(Integer fileOrder) {
            if(!IdUtils.isEmpty(fileOrder)){
                this.fileOrder = fileOrder;
            }
            return this;
        }

        @Override
        public TsFileUseQuery fileOrderNot(Integer fileOrderNot) {
            if(!IdUtils.isEmpty(fileOrderNot)){
                this.fileOrder_NE = fileOrderNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery fileOrderGreaterThan(Integer fileOrderGreaterThan){
            if(fileOrderGreaterThan != null){
                this.fileOrder_GT = fileOrderGreaterThan;
            }
            return this;
        }

        @Override
        public TsFileUseQuery fileOrderGreaterEqual(Integer fileOrderGreaterEqual){
            if(fileOrderGreaterEqual != null){
                this.fileOrder_GE = fileOrderGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFileUseQuery fileOrderLessThan(Integer fileOrderLessThan){
            if(fileOrderLessThan != null){
                this.fileOrder_LT = fileOrderLessThan;
            }
            return this;
        }

        @Override
        public TsFileUseQuery fileOrderLessEqual(Integer fileOrderLessEqual){
            if(fileOrderLessEqual != null){
                this.fileOrder_LE = fileOrderLessEqual;
            }
            return this;
        }


        @Override
        public TsFileUseQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TsFileUseQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TsFileUseQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TsFileUseQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsFileUseQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsFileUseQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsFileUseQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsFileUseQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsFileUseQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsFileUseQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsFileUseQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsFileUseQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsFileUseQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsFileUseQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsFileUseQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsFileUseQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsFileUseQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsFileUseQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsFileUseQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsFileUseQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFileUseQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsFileUseQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


        @Override
        public TsFileUseQuery tenantId(String tenantId) {
            if(!IdUtils.isEmpty(tenantId)){
                this.tenantId = tenantId;
            }
            return this;
        }

        @Override
        public TsFileUseQuery tenantIdNot(String tenantIdNot) {
            if(!IdUtils.isEmpty(tenantIdNot)){
                this.tenantId_NE = tenantIdNot;
            }
            return this;
        }

        @Override
        public TsFileUseQuery tenantIdLike(String tenantIdLike) {
            if(!IdUtils.isEmpty(tenantIdLike)){
                this.tenantId_LIKE = tenantIdLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery tenantIdNotLike(String tenantIdNotLike) {
            if(!IdUtils.isEmpty(tenantIdNotLike)){
                this.tenantId_NOTLIKE = tenantIdNotLike;
            }
            return this;
        }

        @Override
        public TsFileUseQuery tenantIdIn(String tenantIdIn) {
            if(!IdUtils.isEmpty(tenantIdIn)){
                if(this.tenantId_IN == null){
                    this.tenantId_IN = new ArrayList<String>();
                }
                this.tenantId_IN.add( tenantIdIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery tenantIdNotIn(String tenantIdNotIn) {
            if(!IdUtils.isEmpty(tenantIdNotIn)){
                if(this.tenantId_NOTIN == null){
                    this.tenantId_NOTIN = new ArrayList<String>();
                }
                this.tenantId_NOTIN.add( tenantIdNotIn );
            }
            return this;
        }

        @Override
        public TsFileUseQuery tenantIdIsNull() {
            this.isNulls.add("tenantId");
            return this;
        }

        @Override
        public TsFileUseQuery tenantIdIsNotNull() {
            this.isNotNulls.add("tenantId");
            return this;
        }



	
}