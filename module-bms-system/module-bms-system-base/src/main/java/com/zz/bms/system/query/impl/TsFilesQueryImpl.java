package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsFilesEntity;
import com.zz.bms.system.query.TsFilesQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
* 文件 查询实现类
* 用于链式查询
* @author Administrator
* @date 2018-9-6 23:56:31
*/
public class TsFilesQueryImpl<PK extends Serializable> extends TsFilesAbstractQueryImpl<PK> implements TsFilesQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> accessUrlPrefix_IN;
        private List<String> accessUrlPrefix_NOTIN;

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
        private List<String> fileEngine_IN;
        private List<String> fileEngine_NOTIN;


        private List<String> md5_IN;
        private List<String> md5_NOTIN;

        private List<String> contentType_IN;
        private List<String> contentType_NOTIN;

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
        public TsFilesQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsFilesQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsFilesQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsFilesQuery accessUrlPrefix(String accessUrlPrefix) {
            if(!IdUtils.isEmpty(accessUrlPrefix)){
                this.accessUrlPrefix = accessUrlPrefix;
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlPrefixNot(String accessUrlPrefixNot) {
            if(!IdUtils.isEmpty(accessUrlPrefixNot)){
                this.accessUrlPrefix_NE = accessUrlPrefixNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlPrefixLike(String accessUrlPrefixLike) {
            if(!IdUtils.isEmpty(accessUrlPrefixLike)){
                this.accessUrlPrefix_LIKE = accessUrlPrefixLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlPrefixNotLike(String accessUrlPrefixNotLike) {
            if(!IdUtils.isEmpty(accessUrlPrefixNotLike)){
                this.accessUrlPrefix_NOTLIKE = accessUrlPrefixNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlPrefixIn(String accessUrlPrefixIn) {
            if(!IdUtils.isEmpty(accessUrlPrefixIn)){
                if(this.accessUrlPrefix_IN == null){
                    this.accessUrlPrefix_IN = new ArrayList<String>();
                }
                this.accessUrlPrefix_IN.add( accessUrlPrefixIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlPrefixNotIn(String accessUrlPrefixNotIn) {
            if(!IdUtils.isEmpty(accessUrlPrefixNotIn)){
                if(this.accessUrlPrefix_NOTIN == null){
                    this.accessUrlPrefix_NOTIN = new ArrayList<String>();
                }
                this.accessUrlPrefix_NOTIN.add( accessUrlPrefixNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlPrefixIsNull() {
            this.isNulls.add("accessUrlPrefix");
            return this;
        }

        @Override
        public TsFilesQuery accessUrlPrefixIsNotNull() {
            this.isNotNulls.add("accessUrlPrefix");
            return this;
        }



        @Override
        public TsFilesQuery accessUrl(String accessUrl) {
            if(!IdUtils.isEmpty(accessUrl)){
                this.accessUrl = accessUrl;
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlNot(String accessUrlNot) {
            if(!IdUtils.isEmpty(accessUrlNot)){
                this.accessUrl_NE = accessUrlNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlLike(String accessUrlLike) {
            if(!IdUtils.isEmpty(accessUrlLike)){
                this.accessUrl_LIKE = accessUrlLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlNotLike(String accessUrlNotLike) {
            if(!IdUtils.isEmpty(accessUrlNotLike)){
                this.accessUrl_NOTLIKE = accessUrlNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlIn(String accessUrlIn) {
            if(!IdUtils.isEmpty(accessUrlIn)){
                if(this.accessUrl_IN == null){
                    this.accessUrl_IN = new ArrayList<String>();
                }
                this.accessUrl_IN.add( accessUrlIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlNotIn(String accessUrlNotIn) {
            if(!IdUtils.isEmpty(accessUrlNotIn)){
                if(this.accessUrl_NOTIN == null){
                    this.accessUrl_NOTIN = new ArrayList<String>();
                }
                this.accessUrl_NOTIN.add( accessUrlNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery accessUrlIsNull() {
            this.isNulls.add("accessUrl");
            return this;
        }

        @Override
        public TsFilesQuery accessUrlIsNotNull() {
            this.isNotNulls.add("accessUrl");
            return this;
        }



        @Override
        public TsFilesQuery fileHost(String fileHost) {
            if(!IdUtils.isEmpty(fileHost)){
                this.fileHost = fileHost;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileHostNot(String fileHostNot) {
            if(!IdUtils.isEmpty(fileHostNot)){
                this.fileHost_NE = fileHostNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileHostLike(String fileHostLike) {
            if(!IdUtils.isEmpty(fileHostLike)){
                this.fileHost_LIKE = fileHostLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileHostNotLike(String fileHostNotLike) {
            if(!IdUtils.isEmpty(fileHostNotLike)){
                this.fileHost_NOTLIKE = fileHostNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileHostIn(String fileHostIn) {
            if(!IdUtils.isEmpty(fileHostIn)){
                if(this.fileHost_IN == null){
                    this.fileHost_IN = new ArrayList<String>();
                }
                this.fileHost_IN.add( fileHostIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery fileHostNotIn(String fileHostNotIn) {
            if(!IdUtils.isEmpty(fileHostNotIn)){
                if(this.fileHost_NOTIN == null){
                    this.fileHost_NOTIN = new ArrayList<String>();
                }
                this.fileHost_NOTIN.add( fileHostNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery fileHostIsNull() {
            this.isNulls.add("fileHost");
            return this;
        }

        @Override
        public TsFilesQuery fileHostIsNotNull() {
            this.isNotNulls.add("fileHost");
            return this;
        }



        @Override
        public TsFilesQuery filePath(String filePath) {
            if(!IdUtils.isEmpty(filePath)){
                this.filePath = filePath;
            }
            return this;
        }

        @Override
        public TsFilesQuery filePathNot(String filePathNot) {
            if(!IdUtils.isEmpty(filePathNot)){
                this.filePath_NE = filePathNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery filePathLike(String filePathLike) {
            if(!IdUtils.isEmpty(filePathLike)){
                this.filePath_LIKE = filePathLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery filePathNotLike(String filePathNotLike) {
            if(!IdUtils.isEmpty(filePathNotLike)){
                this.filePath_NOTLIKE = filePathNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery filePathIn(String filePathIn) {
            if(!IdUtils.isEmpty(filePathIn)){
                if(this.filePath_IN == null){
                    this.filePath_IN = new ArrayList<String>();
                }
                this.filePath_IN.add( filePathIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery filePathNotIn(String filePathNotIn) {
            if(!IdUtils.isEmpty(filePathNotIn)){
                if(this.filePath_NOTIN == null){
                    this.filePath_NOTIN = new ArrayList<String>();
                }
                this.filePath_NOTIN.add( filePathNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery filePathIsNull() {
            this.isNulls.add("filePath");
            return this;
        }

        @Override
        public TsFilesQuery filePathIsNotNull() {
            this.isNotNulls.add("filePath");
            return this;
        }



        @Override
        public TsFilesQuery fileName(String fileName) {
            if(!IdUtils.isEmpty(fileName)){
                this.fileName = fileName;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileNameNot(String fileNameNot) {
            if(!IdUtils.isEmpty(fileNameNot)){
                this.fileName_NE = fileNameNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileNameLike(String fileNameLike) {
            if(!IdUtils.isEmpty(fileNameLike)){
                this.fileName_LIKE = fileNameLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileNameNotLike(String fileNameNotLike) {
            if(!IdUtils.isEmpty(fileNameNotLike)){
                this.fileName_NOTLIKE = fileNameNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileNameIn(String fileNameIn) {
            if(!IdUtils.isEmpty(fileNameIn)){
                if(this.fileName_IN == null){
                    this.fileName_IN = new ArrayList<String>();
                }
                this.fileName_IN.add( fileNameIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery fileNameNotIn(String fileNameNotIn) {
            if(!IdUtils.isEmpty(fileNameNotIn)){
                if(this.fileName_NOTIN == null){
                    this.fileName_NOTIN = new ArrayList<String>();
                }
                this.fileName_NOTIN.add( fileNameNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery fileNameIsNull() {
            this.isNulls.add("fileName");
            return this;
        }

        @Override
        public TsFilesQuery fileNameIsNotNull() {
            this.isNotNulls.add("fileName");
            return this;
        }


        @Override
        public TsFilesQuery fileSize(Long fileSize) {
            if(!IdUtils.isEmpty(fileSize)){
                this.fileSize = fileSize;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSizeNot(Long fileSizeNot) {
            if(!IdUtils.isEmpty(fileSizeNot)){
                this.fileSize_NE = fileSizeNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSizeGreaterThan(Long fileSizeGreaterThan){
            if(fileSizeGreaterThan != null){
                this.fileSize_GT = fileSizeGreaterThan;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSizeGreaterEqual(Long fileSizeGreaterEqual){
            if(fileSizeGreaterEqual != null){
                this.fileSize_GE = fileSizeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSizeLessThan(Long fileSizeLessThan){
            if(fileSizeLessThan != null){
                this.fileSize_LT = fileSizeLessThan;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSizeLessEqual(Long fileSizeLessEqual){
            if(fileSizeLessEqual != null){
                this.fileSize_LE = fileSizeLessEqual;
            }
            return this;
        }


        @Override
        public TsFilesQuery fileSuffix(String fileSuffix) {
            if(!IdUtils.isEmpty(fileSuffix)){
                this.fileSuffix = fileSuffix;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSuffixNot(String fileSuffixNot) {
            if(!IdUtils.isEmpty(fileSuffixNot)){
                this.fileSuffix_NE = fileSuffixNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSuffixLike(String fileSuffixLike) {
            if(!IdUtils.isEmpty(fileSuffixLike)){
                this.fileSuffix_LIKE = fileSuffixLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSuffixNotLike(String fileSuffixNotLike) {
            if(!IdUtils.isEmpty(fileSuffixNotLike)){
                this.fileSuffix_NOTLIKE = fileSuffixNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSuffixIn(String fileSuffixIn) {
            if(!IdUtils.isEmpty(fileSuffixIn)){
                if(this.fileSuffix_IN == null){
                    this.fileSuffix_IN = new ArrayList<String>();
                }
                this.fileSuffix_IN.add( fileSuffixIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSuffixNotIn(String fileSuffixNotIn) {
            if(!IdUtils.isEmpty(fileSuffixNotIn)){
                if(this.fileSuffix_NOTIN == null){
                    this.fileSuffix_NOTIN = new ArrayList<String>();
                }
                this.fileSuffix_NOTIN.add( fileSuffixNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery fileSuffixIsNull() {
            this.isNulls.add("fileSuffix");
            return this;
        }

        @Override
        public TsFilesQuery fileSuffixIsNotNull() {
            this.isNotNulls.add("fileSuffix");
            return this;
        }


        @Override
        public TsFilesQuery fileEngine(String fileEngine) {
            if(!IdUtils.isEmpty(fileEngine)){
                this.fileEngine = fileEngine;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileEngineNot(String fileEngineNot) {
            if(!IdUtils.isEmpty(fileEngineNot)){
                this.fileEngine_NE = fileEngineNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery fileEngineIn(String fileEngineIn) {
            if(!IdUtils.isEmpty(fileEngineIn)){
                if(this.fileEngine_IN == null){
                    this.fileEngine_IN = new ArrayList<String>();
                }
                this.fileEngine_IN.add( fileEngineIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery fileEngineNotIn(String fileEngineNotIn) {
            if(!IdUtils.isEmpty(fileEngineNotIn)){
                if(this.fileEngine_NOTIN == null){
                    this.fileEngine_NOTIN = new ArrayList<String>();
                }
                this.fileEngine_NOTIN.add( fileEngineNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery fileEngineIsNull() {
            this.isNulls.add("fileEngine");
            return this;
        }

        @Override
        public TsFilesQuery fileEngineIsNotNull() {
            this.isNotNulls.add("fileEngine");
            return this;
        }



        @Override
        public TsFilesQuery md5(String md5) {
            if(!IdUtils.isEmpty(md5)){
                this.md5 = md5;
            }
            return this;
        }

        @Override
        public TsFilesQuery md5Not(String md5Not) {
            if(!IdUtils.isEmpty(md5Not)){
                this.md5_NE = md5Not;
            }
            return this;
        }

        @Override
        public TsFilesQuery md5Like(String md5Like) {
            if(!IdUtils.isEmpty(md5Like)){
                this.md5_LIKE = md5Like;
            }
            return this;
        }

        @Override
        public TsFilesQuery md5NotLike(String md5NotLike) {
            if(!IdUtils.isEmpty(md5NotLike)){
                this.md5_NOTLIKE = md5NotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery md5In(String md5In) {
            if(!IdUtils.isEmpty(md5In)){
                if(this.md5_IN == null){
                    this.md5_IN = new ArrayList<String>();
                }
                this.md5_IN.add( md5In );
            }
            return this;
        }

        @Override
        public TsFilesQuery md5NotIn(String md5NotIn) {
            if(!IdUtils.isEmpty(md5NotIn)){
                if(this.md5_NOTIN == null){
                    this.md5_NOTIN = new ArrayList<String>();
                }
                this.md5_NOTIN.add( md5NotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery md5IsNull() {
            this.isNulls.add("md5");
            return this;
        }

        @Override
        public TsFilesQuery md5IsNotNull() {
            this.isNotNulls.add("md5");
            return this;
        }



        @Override
        public TsFilesQuery contentType(String contentType) {
            if(!IdUtils.isEmpty(contentType)){
                this.contentType = contentType;
            }
            return this;
        }

        @Override
        public TsFilesQuery contentTypeNot(String contentTypeNot) {
            if(!IdUtils.isEmpty(contentTypeNot)){
                this.contentType_NE = contentTypeNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery contentTypeLike(String contentTypeLike) {
            if(!IdUtils.isEmpty(contentTypeLike)){
                this.contentType_LIKE = contentTypeLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery contentTypeNotLike(String contentTypeNotLike) {
            if(!IdUtils.isEmpty(contentTypeNotLike)){
                this.contentType_NOTLIKE = contentTypeNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery contentTypeIn(String contentTypeIn) {
            if(!IdUtils.isEmpty(contentTypeIn)){
                if(this.contentType_IN == null){
                    this.contentType_IN = new ArrayList<String>();
                }
                this.contentType_IN.add( contentTypeIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery contentTypeNotIn(String contentTypeNotIn) {
            if(!IdUtils.isEmpty(contentTypeNotIn)){
                if(this.contentType_NOTIN == null){
                    this.contentType_NOTIN = new ArrayList<String>();
                }
                this.contentType_NOTIN.add( contentTypeNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery contentTypeIsNull() {
            this.isNulls.add("contentType");
            return this;
        }

        @Override
        public TsFilesQuery contentTypeIsNotNull() {
            this.isNotNulls.add("contentType");
            return this;
        }


        @Override
        public TsFilesQuery useFrequency(Integer useFrequency) {
            if(!IdUtils.isEmpty(useFrequency)){
                this.useFrequency = useFrequency;
            }
            return this;
        }

        @Override
        public TsFilesQuery useFrequencyNot(Integer useFrequencyNot) {
            if(!IdUtils.isEmpty(useFrequencyNot)){
                this.useFrequency_NE = useFrequencyNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery useFrequencyGreaterThan(Integer useFrequencyGreaterThan){
            if(useFrequencyGreaterThan != null){
                this.useFrequency_GT = useFrequencyGreaterThan;
            }
            return this;
        }

        @Override
        public TsFilesQuery useFrequencyGreaterEqual(Integer useFrequencyGreaterEqual){
            if(useFrequencyGreaterEqual != null){
                this.useFrequency_GE = useFrequencyGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFilesQuery useFrequencyLessThan(Integer useFrequencyLessThan){
            if(useFrequencyLessThan != null){
                this.useFrequency_LT = useFrequencyLessThan;
            }
            return this;
        }

        @Override
        public TsFilesQuery useFrequencyLessEqual(Integer useFrequencyLessEqual){
            if(useFrequencyLessEqual != null){
                this.useFrequency_LE = useFrequencyLessEqual;
            }
            return this;
        }


        @Override
        public TsFilesQuery deleteFlag(String deleteFlag) {
            if(!IdUtils.isEmpty(deleteFlag)){
                this.deleteFlag = deleteFlag;
            }
            return this;
        }

        @Override
        public TsFilesQuery deleteFlagNot(String deleteFlagNot) {
            if(!IdUtils.isEmpty(deleteFlagNot)){
                this.deleteFlag_NE = deleteFlagNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery deleteFlagLike(String deleteFlagLike) {
            if(!IdUtils.isEmpty(deleteFlagLike)){
                this.deleteFlag_LIKE = deleteFlagLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery deleteFlagNotLike(String deleteFlagNotLike) {
            if(!IdUtils.isEmpty(deleteFlagNotLike)){
                this.deleteFlag_NOTLIKE = deleteFlagNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery deleteFlagIn(String deleteFlagIn) {
            if(!IdUtils.isEmpty(deleteFlagIn)){
                if(this.deleteFlag_IN == null){
                    this.deleteFlag_IN = new ArrayList<String>();
                }
                this.deleteFlag_IN.add( deleteFlagIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery deleteFlagNotIn(String deleteFlagNotIn) {
            if(!IdUtils.isEmpty(deleteFlagNotIn)){
                if(this.deleteFlag_NOTIN == null){
                    this.deleteFlag_NOTIN = new ArrayList<String>();
                }
                this.deleteFlag_NOTIN.add( deleteFlagNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery deleteFlagIsNull() {
            this.isNulls.add("deleteFlag");
            return this;
        }

        @Override
        public TsFilesQuery deleteFlagIsNotNull() {
            this.isNotNulls.add("deleteFlag");
            return this;
        }



        @Override
        public TsFilesQuery createUserId(String createUserId) {
            if(!IdUtils.isEmpty(createUserId)){
                this.createUserId = createUserId;
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserIdNot(String createUserIdNot) {
            if(!IdUtils.isEmpty(createUserIdNot)){
                this.createUserId_NE = createUserIdNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserIdLike(String createUserIdLike) {
            if(!IdUtils.isEmpty(createUserIdLike)){
                this.createUserId_LIKE = createUserIdLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserIdNotLike(String createUserIdNotLike) {
            if(!IdUtils.isEmpty(createUserIdNotLike)){
                this.createUserId_NOTLIKE = createUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserIdIn(String createUserIdIn) {
            if(!IdUtils.isEmpty(createUserIdIn)){
                if(this.createUserId_IN == null){
                    this.createUserId_IN = new ArrayList<String>();
                }
                this.createUserId_IN.add( createUserIdIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserIdNotIn(String createUserIdNotIn) {
            if(!IdUtils.isEmpty(createUserIdNotIn)){
                if(this.createUserId_NOTIN == null){
                    this.createUserId_NOTIN = new ArrayList<String>();
                }
                this.createUserId_NOTIN.add( createUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserIdIsNull() {
            this.isNulls.add("createUserId");
            return this;
        }

        @Override
        public TsFilesQuery createUserIdIsNotNull() {
            this.isNotNulls.add("createUserId");
            return this;
        }



        @Override
        public TsFilesQuery createUserName(String createUserName) {
            if(!IdUtils.isEmpty(createUserName)){
                this.createUserName = createUserName;
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserNameNot(String createUserNameNot) {
            if(!IdUtils.isEmpty(createUserNameNot)){
                this.createUserName_NE = createUserNameNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserNameLike(String createUserNameLike) {
            if(!IdUtils.isEmpty(createUserNameLike)){
                this.createUserName_LIKE = createUserNameLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserNameNotLike(String createUserNameNotLike) {
            if(!IdUtils.isEmpty(createUserNameNotLike)){
                this.createUserName_NOTLIKE = createUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserNameIn(String createUserNameIn) {
            if(!IdUtils.isEmpty(createUserNameIn)){
                if(this.createUserName_IN == null){
                    this.createUserName_IN = new ArrayList<String>();
                }
                this.createUserName_IN.add( createUserNameIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserNameNotIn(String createUserNameNotIn) {
            if(!IdUtils.isEmpty(createUserNameNotIn)){
                if(this.createUserName_NOTIN == null){
                    this.createUserName_NOTIN = new ArrayList<String>();
                }
                this.createUserName_NOTIN.add( createUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery createUserNameIsNull() {
            this.isNulls.add("createUserName");
            return this;
        }

        @Override
        public TsFilesQuery createUserNameIsNotNull() {
            this.isNotNulls.add("createUserName");
            return this;
        }


        @Override
        public TsFilesQuery createTime(Timestamp createTime) {
            if(!IdUtils.isEmpty(createTime)){
                this.createTime = createTime;
            }
            return this;
        }

        @Override
        public TsFilesQuery createTimeNot(Timestamp createTimeNot) {
            if(!IdUtils.isEmpty(createTimeNot)){
                this.createTime_NE = createTimeNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery createTimeGreaterThan(Timestamp createTimeGreaterThan){
            if(createTimeGreaterThan != null){
                this.createTime_GT = createTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsFilesQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual){
            if(createTimeGreaterEqual != null){
                this.createTime_GE = createTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFilesQuery createTimeLessThan(Timestamp createTimeLessThan){
            if(createTimeLessThan != null){
                this.createTime_LT = createTimeLessThan;
            }
            return this;
        }

        @Override
        public TsFilesQuery createTimeLessEqual(Timestamp createTimeLessEqual){
            if(createTimeLessEqual != null){
                this.createTime_LE = createTimeLessEqual;
            }
            return this;
        }


        @Override
        public TsFilesQuery updateUserId(String updateUserId) {
            if(!IdUtils.isEmpty(updateUserId)){
                this.updateUserId = updateUserId;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserIdNot(String updateUserIdNot) {
            if(!IdUtils.isEmpty(updateUserIdNot)){
                this.updateUserId_NE = updateUserIdNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserIdLike(String updateUserIdLike) {
            if(!IdUtils.isEmpty(updateUserIdLike)){
                this.updateUserId_LIKE = updateUserIdLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserIdNotLike(String updateUserIdNotLike) {
            if(!IdUtils.isEmpty(updateUserIdNotLike)){
                this.updateUserId_NOTLIKE = updateUserIdNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserIdIn(String updateUserIdIn) {
            if(!IdUtils.isEmpty(updateUserIdIn)){
                if(this.updateUserId_IN == null){
                    this.updateUserId_IN = new ArrayList<String>();
                }
                this.updateUserId_IN.add( updateUserIdIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserIdNotIn(String updateUserIdNotIn) {
            if(!IdUtils.isEmpty(updateUserIdNotIn)){
                if(this.updateUserId_NOTIN == null){
                    this.updateUserId_NOTIN = new ArrayList<String>();
                }
                this.updateUserId_NOTIN.add( updateUserIdNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserIdIsNull() {
            this.isNulls.add("updateUserId");
            return this;
        }

        @Override
        public TsFilesQuery updateUserIdIsNotNull() {
            this.isNotNulls.add("updateUserId");
            return this;
        }



        @Override
        public TsFilesQuery updateUserName(String updateUserName) {
            if(!IdUtils.isEmpty(updateUserName)){
                this.updateUserName = updateUserName;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserNameNot(String updateUserNameNot) {
            if(!IdUtils.isEmpty(updateUserNameNot)){
                this.updateUserName_NE = updateUserNameNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserNameLike(String updateUserNameLike) {
            if(!IdUtils.isEmpty(updateUserNameLike)){
                this.updateUserName_LIKE = updateUserNameLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserNameNotLike(String updateUserNameNotLike) {
            if(!IdUtils.isEmpty(updateUserNameNotLike)){
                this.updateUserName_NOTLIKE = updateUserNameNotLike;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserNameIn(String updateUserNameIn) {
            if(!IdUtils.isEmpty(updateUserNameIn)){
                if(this.updateUserName_IN == null){
                    this.updateUserName_IN = new ArrayList<String>();
                }
                this.updateUserName_IN.add( updateUserNameIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserNameNotIn(String updateUserNameNotIn) {
            if(!IdUtils.isEmpty(updateUserNameNotIn)){
                if(this.updateUserName_NOTIN == null){
                    this.updateUserName_NOTIN = new ArrayList<String>();
                }
                this.updateUserName_NOTIN.add( updateUserNameNotIn );
            }
            return this;
        }

        @Override
        public TsFilesQuery updateUserNameIsNull() {
            this.isNulls.add("updateUserName");
            return this;
        }

        @Override
        public TsFilesQuery updateUserNameIsNotNull() {
            this.isNotNulls.add("updateUserName");
            return this;
        }


        @Override
        public TsFilesQuery updateTime(Timestamp updateTime) {
            if(!IdUtils.isEmpty(updateTime)){
                this.updateTime = updateTime;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateTimeNot(Timestamp updateTimeNot) {
            if(!IdUtils.isEmpty(updateTimeNot)){
                this.updateTime_NE = updateTimeNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan){
            if(updateTimeGreaterThan != null){
                this.updateTime_GT = updateTimeGreaterThan;
            }
            return this;
        }


        @Override
        public TsFilesQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual){
            if(updateTimeGreaterEqual != null){
                this.updateTime_GE = updateTimeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateTimeLessThan(Timestamp updateTimeLessThan){
            if(updateTimeLessThan != null){
                this.updateTime_LT = updateTimeLessThan;
            }
            return this;
        }

        @Override
        public TsFilesQuery updateTimeLessEqual(Timestamp updateTimeLessEqual){
            if(updateTimeLessEqual != null){
                this.updateTime_LE = updateTimeLessEqual;
            }
            return this;
        }

        @Override
        public TsFilesQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsFilesQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsFilesQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsFilesQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFilesQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsFilesQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


	
}