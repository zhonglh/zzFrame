package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsTenantEntity;
import com.zz.bms.system.query.TsTenantQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 企业 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:16
*/
public class TsTenantQueryImpl<PK extends Serializable> extends TsTenantAbstractQueryImpl<PK> implements TsTenantQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> tenantName_IN;
        private List<String> tenantName_NOTIN;

        private List<String> tenantCode_IN;
        private List<String> tenantCode_NOTIN;

        private List<String> tenantAddr_IN;
        private List<String> tenantAddr_NOTIN;

        private List<String> linkTel_IN;
        private List<String> linkTel_NOTIN;

        private List<String> leadUserName_IN;
        private List<String> leadUserName_NOTIN;

        private List<String> logoFile_IN;
        private List<String> logoFile_NOTIN;

        private List<String> website_IN;
        private List<String> website_NOTIN;

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


        @Override
        public TsTenantQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsTenantQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsTenantQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsTenantQuery tenantName(String tenantName) {
            if(!IdUtils.isEmpty(tenantName)){
                this.tenantName = tenantName;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantNameNot(String tenantNameNot) {
            if(!IdUtils.isEmpty(tenantNameNot)){
                this.tenantName_NE = tenantNameNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantNameLike(String tenantNameLike) {
            if(!IdUtils.isEmpty(tenantNameLike)){
                this.tenantName_LIKE = tenantNameLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantNameNotLike(String tenantNameNotLike) {
            if(!IdUtils.isEmpty(tenantNameNotLike)){
                this.tenantName_NOTLIKE = tenantNameNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantNameIn(String tenantNameIn) {
            if(!IdUtils.isEmpty(tenantNameIn)){
                if(this.tenantName_IN == null){
                    this.tenantName_IN = new ArrayList<String>();
                }
                this.tenantName_IN.add( tenantNameIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantNameNotIn(String tenantNameNotIn) {
            if(!IdUtils.isEmpty(tenantNameNotIn)){
                if(this.tenantName_NOTIN == null){
                    this.tenantName_NOTIN = new ArrayList<String>();
                }
                this.tenantName_NOTIN.add( tenantNameNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantNameIsNull() {
            this.isNulls.add("tenantName");
            return this;
        }

        @Override
        public TsTenantQuery tenantNameIsNotNull() {
            this.isNotNulls.add("tenantName");
            return this;
        }



        @Override
        public TsTenantQuery tenantCode(String tenantCode) {
            if(!IdUtils.isEmpty(tenantCode)){
                this.tenantCode = tenantCode;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantCodeNot(String tenantCodeNot) {
            if(!IdUtils.isEmpty(tenantCodeNot)){
                this.tenantCode_NE = tenantCodeNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantCodeLike(String tenantCodeLike) {
            if(!IdUtils.isEmpty(tenantCodeLike)){
                this.tenantCode_LIKE = tenantCodeLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantCodeNotLike(String tenantCodeNotLike) {
            if(!IdUtils.isEmpty(tenantCodeNotLike)){
                this.tenantCode_NOTLIKE = tenantCodeNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantCodeIn(String tenantCodeIn) {
            if(!IdUtils.isEmpty(tenantCodeIn)){
                if(this.tenantCode_IN == null){
                    this.tenantCode_IN = new ArrayList<String>();
                }
                this.tenantCode_IN.add( tenantCodeIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantCodeNotIn(String tenantCodeNotIn) {
            if(!IdUtils.isEmpty(tenantCodeNotIn)){
                if(this.tenantCode_NOTIN == null){
                    this.tenantCode_NOTIN = new ArrayList<String>();
                }
                this.tenantCode_NOTIN.add( tenantCodeNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantCodeIsNull() {
            this.isNulls.add("tenantCode");
            return this;
        }

        @Override
        public TsTenantQuery tenantCodeIsNotNull() {
            this.isNotNulls.add("tenantCode");
            return this;
        }



        @Override
        public TsTenantQuery tenantAddr(String tenantAddr) {
            if(!IdUtils.isEmpty(tenantAddr)){
                this.tenantAddr = tenantAddr;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantAddrNot(String tenantAddrNot) {
            if(!IdUtils.isEmpty(tenantAddrNot)){
                this.tenantAddr_NE = tenantAddrNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantAddrLike(String tenantAddrLike) {
            if(!IdUtils.isEmpty(tenantAddrLike)){
                this.tenantAddr_LIKE = tenantAddrLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantAddrNotLike(String tenantAddrNotLike) {
            if(!IdUtils.isEmpty(tenantAddrNotLike)){
                this.tenantAddr_NOTLIKE = tenantAddrNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantAddrIn(String tenantAddrIn) {
            if(!IdUtils.isEmpty(tenantAddrIn)){
                if(this.tenantAddr_IN == null){
                    this.tenantAddr_IN = new ArrayList<String>();
                }
                this.tenantAddr_IN.add( tenantAddrIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantAddrNotIn(String tenantAddrNotIn) {
            if(!IdUtils.isEmpty(tenantAddrNotIn)){
                if(this.tenantAddr_NOTIN == null){
                    this.tenantAddr_NOTIN = new ArrayList<String>();
                }
                this.tenantAddr_NOTIN.add( tenantAddrNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery tenantAddrIsNull() {
            this.isNulls.add("tenantAddr");
            return this;
        }

        @Override
        public TsTenantQuery tenantAddrIsNotNull() {
            this.isNotNulls.add("tenantAddr");
            return this;
        }



        @Override
        public TsTenantQuery linkTel(String linkTel) {
            if(!IdUtils.isEmpty(linkTel)){
                this.linkTel = linkTel;
            }
            return this;
        }

        @Override
        public TsTenantQuery linkTelNot(String linkTelNot) {
            if(!IdUtils.isEmpty(linkTelNot)){
                this.linkTel_NE = linkTelNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery linkTelLike(String linkTelLike) {
            if(!IdUtils.isEmpty(linkTelLike)){
                this.linkTel_LIKE = linkTelLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery linkTelNotLike(String linkTelNotLike) {
            if(!IdUtils.isEmpty(linkTelNotLike)){
                this.linkTel_NOTLIKE = linkTelNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery linkTelIn(String linkTelIn) {
            if(!IdUtils.isEmpty(linkTelIn)){
                if(this.linkTel_IN == null){
                    this.linkTel_IN = new ArrayList<String>();
                }
                this.linkTel_IN.add( linkTelIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery linkTelNotIn(String linkTelNotIn) {
            if(!IdUtils.isEmpty(linkTelNotIn)){
                if(this.linkTel_NOTIN == null){
                    this.linkTel_NOTIN = new ArrayList<String>();
                }
                this.linkTel_NOTIN.add( linkTelNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery linkTelIsNull() {
            this.isNulls.add("linkTel");
            return this;
        }

        @Override
        public TsTenantQuery linkTelIsNotNull() {
            this.isNotNulls.add("linkTel");
            return this;
        }



        @Override
        public TsTenantQuery leadUserName(String leadUserName) {
            if(!IdUtils.isEmpty(leadUserName)){
                this.leadUserName = leadUserName;
            }
            return this;
        }

        @Override
        public TsTenantQuery leadUserNameNot(String leadUserNameNot) {
            if(!IdUtils.isEmpty(leadUserNameNot)){
                this.leadUserName_NE = leadUserNameNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery leadUserNameLike(String leadUserNameLike) {
            if(!IdUtils.isEmpty(leadUserNameLike)){
                this.leadUserName_LIKE = leadUserNameLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery leadUserNameNotLike(String leadUserNameNotLike) {
            if(!IdUtils.isEmpty(leadUserNameNotLike)){
                this.leadUserName_NOTLIKE = leadUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery leadUserNameIn(String leadUserNameIn) {
            if(!IdUtils.isEmpty(leadUserNameIn)){
                if(this.leadUserName_IN == null){
                    this.leadUserName_IN = new ArrayList<String>();
                }
                this.leadUserName_IN.add( leadUserNameIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery leadUserNameNotIn(String leadUserNameNotIn) {
            if(!IdUtils.isEmpty(leadUserNameNotIn)){
                if(this.leadUserName_NOTIN == null){
                    this.leadUserName_NOTIN = new ArrayList<String>();
                }
                this.leadUserName_NOTIN.add( leadUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery leadUserNameIsNull() {
            this.isNulls.add("leadUserName");
            return this;
        }

        @Override
        public TsTenantQuery leadUserNameIsNotNull() {
            this.isNotNulls.add("leadUserName");
            return this;
        }



        @Override
        public TsTenantQuery logoFile(String logoFile) {
            if(!IdUtils.isEmpty(logoFile)){
                this.logoFile = logoFile;
            }
            return this;
        }

        @Override
        public TsTenantQuery logoFileNot(String logoFileNot) {
            if(!IdUtils.isEmpty(logoFileNot)){
                this.logoFile_NE = logoFileNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery logoFileLike(String logoFileLike) {
            if(!IdUtils.isEmpty(logoFileLike)){
                this.logoFile_LIKE = logoFileLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery logoFileNotLike(String logoFileNotLike) {
            if(!IdUtils.isEmpty(logoFileNotLike)){
                this.logoFile_NOTLIKE = logoFileNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery logoFileIn(String logoFileIn) {
            if(!IdUtils.isEmpty(logoFileIn)){
                if(this.logoFile_IN == null){
                    this.logoFile_IN = new ArrayList<String>();
                }
                this.logoFile_IN.add( logoFileIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery logoFileNotIn(String logoFileNotIn) {
            if(!IdUtils.isEmpty(logoFileNotIn)){
                if(this.logoFile_NOTIN == null){
                    this.logoFile_NOTIN = new ArrayList<String>();
                }
                this.logoFile_NOTIN.add( logoFileNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery logoFileIsNull() {
            this.isNulls.add("logoFile");
            return this;
        }

        @Override
        public TsTenantQuery logoFileIsNotNull() {
            this.isNotNulls.add("logoFile");
            return this;
        }



        @Override
        public TsTenantQuery website(String website) {
            if(!IdUtils.isEmpty(website)){
                this.website = website;
            }
            return this;
        }

        @Override
        public TsTenantQuery websiteNot(String websiteNot) {
            if(!IdUtils.isEmpty(websiteNot)){
                this.website_NE = websiteNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery websiteLike(String websiteLike) {
            if(!IdUtils.isEmpty(websiteLike)){
                this.website_LIKE = websiteLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery websiteNotLike(String websiteNotLike) {
            if(!IdUtils.isEmpty(websiteNotLike)){
                this.website_NOTLIKE = websiteNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery websiteIn(String websiteIn) {
            if(!IdUtils.isEmpty(websiteIn)){
                if(this.website_IN == null){
                    this.website_IN = new ArrayList<String>();
                }
                this.website_IN.add( websiteIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery websiteNotIn(String websiteNotIn) {
            if(!IdUtils.isEmpty(websiteNotIn)){
                if(this.website_NOTIN == null){
                    this.website_NOTIN = new ArrayList<String>();
                }
                this.website_NOTIN.add( websiteNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery websiteIsNull() {
            this.isNulls.add("website");
            return this;
        }

        @Override
        public TsTenantQuery websiteIsNotNull() {
            this.isNotNulls.add("website");
            return this;
        }



        @Override
        public TsTenantQuery remark(String remark) {
            if(!IdUtils.isEmpty(remark)){
                this.remark = remark;
            }
            return this;
        }

        @Override
        public TsTenantQuery remarkNot(String remarkNot) {
            if(!IdUtils.isEmpty(remarkNot)){
                this.remark_NE = remarkNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery remarkLike(String remarkLike) {
            if(!IdUtils.isEmpty(remarkLike)){
                this.remark_LIKE = remarkLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery remarkNotLike(String remarkNotLike) {
            if(!IdUtils.isEmpty(remarkNotLike)){
                this.remark_NOTLIKE = remarkNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery remarkIn(String remarkIn) {
            if(!IdUtils.isEmpty(remarkIn)){
                if(this.remark_IN == null){
                    this.remark_IN = new ArrayList<String>();
                }
                this.remark_IN.add( remarkIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery remarkNotIn(String remarkNotIn) {
            if(!IdUtils.isEmpty(remarkNotIn)){
                if(this.remark_NOTIN == null){
                    this.remark_NOTIN = new ArrayList<String>();
                }
                this.remark_NOTIN.add( remarkNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery remarkIsNull() {
            this.isNulls.add("remark");
            return this;
        }

        @Override
        public TsTenantQuery remarkIsNotNull() {
            this.isNotNulls.add("remark");
            return this;
        }



        @Override
        public TsTenantQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TsTenantQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TsTenantQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TsTenantQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsTenantQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsTenantQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsTenantQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsTenantQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsTenantQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsTenantQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsTenantQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsTenantQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsTenantQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsTenantQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsTenantQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsTenantQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsTenantQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsTenantQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsTenantQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsTenantQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsTenantQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsTenantQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsTenantQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsTenantQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsTenantQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsTenantQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


	
}