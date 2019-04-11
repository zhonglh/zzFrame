package com.zz.bms.system.query.impl;



import com.zz.bms.util.base.java.IdUtils;
import com.zz.bms.system.domain.TsFileEntity;
import com.zz.bms.system.query.TsFileQuery;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

/**
* 文件 查询实现类
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:16
*/
public class TsFileQueryImpl<PK extends Serializable> extends TsFileAbstractQueryImpl<PK> implements TsFileQuery<PK>, Serializable  {

        private List<PK> id_IN;
        private List<PK> id_NOTIN;


        private List<String> accessUrlPrefix_IN;
        private List<String> accessUrlPrefix_NOTIN;

        private List<String> accessUrl_IN;
        private List<String> accessUrl_NOTIN;

        private List<String> fileHost_IN;
        private List<String> fileHost_NOTIN;

        private List<String> fileBasePath_IN;
        private List<String> fileBasePath_NOTIN;

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


        @Override
        public TsFileQuery id(PK id) {
            if(!IdUtils.isEmpty(id)){
                this.id = id;
            }
            return this;
        }

        @Override
        public TsFileQuery idNot(PK idNot) {
            if(!IdUtils.isEmpty(idNot)){
                this.id_NE = idNot;
            }
            return this;
        }

        @Override
        public TsFileQuery idIn(PK idIn) {
            if(!IdUtils.isEmpty(idIn)){
                if(this.id_IN == null){
                    this.id_IN = new ArrayList<PK>();
                }
                this.id_IN.add( idIn );
            }
            return this;
        }

        @Override
        public TsFileQuery idNotIn(PK idNotIn) {
            if(!IdUtils.isEmpty(idNotIn)){
                if(this.id_NOTIN == null){
                    this.id_NOTIN = new ArrayList<PK>();
                }
                this.id_NOTIN.add( idNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery idIsNull() {
            this.isNulls.add("id");
            return this;
        }

        @Override
        public TsFileQuery idIsNotNull() {
            this.isNotNulls.add("id");
            return this;
        }



        @Override
        public TsFileQuery accessUrlPrefix(String accessUrlPrefix) {
            if(!IdUtils.isEmpty(accessUrlPrefix)){
                this.accessUrlPrefix = accessUrlPrefix;
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlPrefixNot(String accessUrlPrefixNot) {
            if(!IdUtils.isEmpty(accessUrlPrefixNot)){
                this.accessUrlPrefix_NE = accessUrlPrefixNot;
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlPrefixLike(String accessUrlPrefixLike) {
            if(!IdUtils.isEmpty(accessUrlPrefixLike)){
                this.accessUrlPrefix_LIKE = accessUrlPrefixLike;
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlPrefixNotLike(String accessUrlPrefixNotLike) {
            if(!IdUtils.isEmpty(accessUrlPrefixNotLike)){
                this.accessUrlPrefix_NOTLIKE = accessUrlPrefixNotLike;
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlPrefixIn(String accessUrlPrefixIn) {
            if(!IdUtils.isEmpty(accessUrlPrefixIn)){
                if(this.accessUrlPrefix_IN == null){
                    this.accessUrlPrefix_IN = new ArrayList<String>();
                }
                this.accessUrlPrefix_IN.add( accessUrlPrefixIn );
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlPrefixNotIn(String accessUrlPrefixNotIn) {
            if(!IdUtils.isEmpty(accessUrlPrefixNotIn)){
                if(this.accessUrlPrefix_NOTIN == null){
                    this.accessUrlPrefix_NOTIN = new ArrayList<String>();
                }
                this.accessUrlPrefix_NOTIN.add( accessUrlPrefixNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlPrefixIsNull() {
            this.isNulls.add("accessUrlPrefix");
            return this;
        }

        @Override
        public TsFileQuery accessUrlPrefixIsNotNull() {
            this.isNotNulls.add("accessUrlPrefix");
            return this;
        }



        @Override
        public TsFileQuery accessUrl(String accessUrl) {
            if(!IdUtils.isEmpty(accessUrl)){
                this.accessUrl = accessUrl;
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlNot(String accessUrlNot) {
            if(!IdUtils.isEmpty(accessUrlNot)){
                this.accessUrl_NE = accessUrlNot;
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlLike(String accessUrlLike) {
            if(!IdUtils.isEmpty(accessUrlLike)){
                this.accessUrl_LIKE = accessUrlLike;
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlNotLike(String accessUrlNotLike) {
            if(!IdUtils.isEmpty(accessUrlNotLike)){
                this.accessUrl_NOTLIKE = accessUrlNotLike;
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlIn(String accessUrlIn) {
            if(!IdUtils.isEmpty(accessUrlIn)){
                if(this.accessUrl_IN == null){
                    this.accessUrl_IN = new ArrayList<String>();
                }
                this.accessUrl_IN.add( accessUrlIn );
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlNotIn(String accessUrlNotIn) {
            if(!IdUtils.isEmpty(accessUrlNotIn)){
                if(this.accessUrl_NOTIN == null){
                    this.accessUrl_NOTIN = new ArrayList<String>();
                }
                this.accessUrl_NOTIN.add( accessUrlNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery accessUrlIsNull() {
            this.isNulls.add("accessUrl");
            return this;
        }

        @Override
        public TsFileQuery accessUrlIsNotNull() {
            this.isNotNulls.add("accessUrl");
            return this;
        }



        @Override
        public TsFileQuery fileHost(String fileHost) {
            if(!IdUtils.isEmpty(fileHost)){
                this.fileHost = fileHost;
            }
            return this;
        }

        @Override
        public TsFileQuery fileHostNot(String fileHostNot) {
            if(!IdUtils.isEmpty(fileHostNot)){
                this.fileHost_NE = fileHostNot;
            }
            return this;
        }

        @Override
        public TsFileQuery fileHostLike(String fileHostLike) {
            if(!IdUtils.isEmpty(fileHostLike)){
                this.fileHost_LIKE = fileHostLike;
            }
            return this;
        }

        @Override
        public TsFileQuery fileHostNotLike(String fileHostNotLike) {
            if(!IdUtils.isEmpty(fileHostNotLike)){
                this.fileHost_NOTLIKE = fileHostNotLike;
            }
            return this;
        }

        @Override
        public TsFileQuery fileHostIn(String fileHostIn) {
            if(!IdUtils.isEmpty(fileHostIn)){
                if(this.fileHost_IN == null){
                    this.fileHost_IN = new ArrayList<String>();
                }
                this.fileHost_IN.add( fileHostIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileHostNotIn(String fileHostNotIn) {
            if(!IdUtils.isEmpty(fileHostNotIn)){
                if(this.fileHost_NOTIN == null){
                    this.fileHost_NOTIN = new ArrayList<String>();
                }
                this.fileHost_NOTIN.add( fileHostNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileHostIsNull() {
            this.isNulls.add("fileHost");
            return this;
        }

        @Override
        public TsFileQuery fileHostIsNotNull() {
            this.isNotNulls.add("fileHost");
            return this;
        }



        @Override
        public TsFileQuery fileBasePath(String fileBasePath) {
            if(!IdUtils.isEmpty(fileBasePath)){
                this.fileBasePath = fileBasePath;
            }
            return this;
        }

        @Override
        public TsFileQuery fileBasePathNot(String fileBasePathNot) {
            if(!IdUtils.isEmpty(fileBasePathNot)){
                this.fileBasePath_NE = fileBasePathNot;
            }
            return this;
        }

        @Override
        public TsFileQuery fileBasePathLike(String fileBasePathLike) {
            if(!IdUtils.isEmpty(fileBasePathLike)){
                this.fileBasePath_LIKE = fileBasePathLike;
            }
            return this;
        }

        @Override
        public TsFileQuery fileBasePathNotLike(String fileBasePathNotLike) {
            if(!IdUtils.isEmpty(fileBasePathNotLike)){
                this.fileBasePath_NOTLIKE = fileBasePathNotLike;
            }
            return this;
        }

        @Override
        public TsFileQuery fileBasePathIn(String fileBasePathIn) {
            if(!IdUtils.isEmpty(fileBasePathIn)){
                if(this.fileBasePath_IN == null){
                    this.fileBasePath_IN = new ArrayList<String>();
                }
                this.fileBasePath_IN.add( fileBasePathIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileBasePathNotIn(String fileBasePathNotIn) {
            if(!IdUtils.isEmpty(fileBasePathNotIn)){
                if(this.fileBasePath_NOTIN == null){
                    this.fileBasePath_NOTIN = new ArrayList<String>();
                }
                this.fileBasePath_NOTIN.add( fileBasePathNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileBasePathIsNull() {
            this.isNulls.add("fileBasePath");
            return this;
        }

        @Override
        public TsFileQuery fileBasePathIsNotNull() {
            this.isNotNulls.add("fileBasePath");
            return this;
        }



        @Override
        public TsFileQuery filePath(String filePath) {
            if(!IdUtils.isEmpty(filePath)){
                this.filePath = filePath;
            }
            return this;
        }

        @Override
        public TsFileQuery filePathNot(String filePathNot) {
            if(!IdUtils.isEmpty(filePathNot)){
                this.filePath_NE = filePathNot;
            }
            return this;
        }

        @Override
        public TsFileQuery filePathLike(String filePathLike) {
            if(!IdUtils.isEmpty(filePathLike)){
                this.filePath_LIKE = filePathLike;
            }
            return this;
        }

        @Override
        public TsFileQuery filePathNotLike(String filePathNotLike) {
            if(!IdUtils.isEmpty(filePathNotLike)){
                this.filePath_NOTLIKE = filePathNotLike;
            }
            return this;
        }

        @Override
        public TsFileQuery filePathIn(String filePathIn) {
            if(!IdUtils.isEmpty(filePathIn)){
                if(this.filePath_IN == null){
                    this.filePath_IN = new ArrayList<String>();
                }
                this.filePath_IN.add( filePathIn );
            }
            return this;
        }

        @Override
        public TsFileQuery filePathNotIn(String filePathNotIn) {
            if(!IdUtils.isEmpty(filePathNotIn)){
                if(this.filePath_NOTIN == null){
                    this.filePath_NOTIN = new ArrayList<String>();
                }
                this.filePath_NOTIN.add( filePathNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery filePathIsNull() {
            this.isNulls.add("filePath");
            return this;
        }

        @Override
        public TsFileQuery filePathIsNotNull() {
            this.isNotNulls.add("filePath");
            return this;
        }



        @Override
        public TsFileQuery fileName(String fileName) {
            if(!IdUtils.isEmpty(fileName)){
                this.fileName = fileName;
            }
            return this;
        }

        @Override
        public TsFileQuery fileNameNot(String fileNameNot) {
            if(!IdUtils.isEmpty(fileNameNot)){
                this.fileName_NE = fileNameNot;
            }
            return this;
        }

        @Override
        public TsFileQuery fileNameLike(String fileNameLike) {
            if(!IdUtils.isEmpty(fileNameLike)){
                this.fileName_LIKE = fileNameLike;
            }
            return this;
        }

        @Override
        public TsFileQuery fileNameNotLike(String fileNameNotLike) {
            if(!IdUtils.isEmpty(fileNameNotLike)){
                this.fileName_NOTLIKE = fileNameNotLike;
            }
            return this;
        }

        @Override
        public TsFileQuery fileNameIn(String fileNameIn) {
            if(!IdUtils.isEmpty(fileNameIn)){
                if(this.fileName_IN == null){
                    this.fileName_IN = new ArrayList<String>();
                }
                this.fileName_IN.add( fileNameIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileNameNotIn(String fileNameNotIn) {
            if(!IdUtils.isEmpty(fileNameNotIn)){
                if(this.fileName_NOTIN == null){
                    this.fileName_NOTIN = new ArrayList<String>();
                }
                this.fileName_NOTIN.add( fileNameNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileNameIsNull() {
            this.isNulls.add("fileName");
            return this;
        }

        @Override
        public TsFileQuery fileNameIsNotNull() {
            this.isNotNulls.add("fileName");
            return this;
        }


        @Override
        public TsFileQuery fileSize(Long fileSize) {
            if(!IdUtils.isEmpty(fileSize)){
                this.fileSize = fileSize;
            }
            return this;
        }

        @Override
        public TsFileQuery fileSizeNot(Long fileSizeNot) {
            if(!IdUtils.isEmpty(fileSizeNot)){
                this.fileSize_NE = fileSizeNot;
            }
            return this;
        }

        @Override
        public TsFileQuery fileSizeGreaterThan(Long fileSizeGreaterThan){
            if(fileSizeGreaterThan != null){
                this.fileSize_GT = fileSizeGreaterThan;
            }
            return this;
        }

        @Override
        public TsFileQuery fileSizeGreaterEqual(Long fileSizeGreaterEqual){
            if(fileSizeGreaterEqual != null){
                this.fileSize_GE = fileSizeGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFileQuery fileSizeLessThan(Long fileSizeLessThan){
            if(fileSizeLessThan != null){
                this.fileSize_LT = fileSizeLessThan;
            }
            return this;
        }

        @Override
        public TsFileQuery fileSizeLessEqual(Long fileSizeLessEqual){
            if(fileSizeLessEqual != null){
                this.fileSize_LE = fileSizeLessEqual;
            }
            return this;
        }


        @Override
        public TsFileQuery fileSuffix(String fileSuffix) {
            if(!IdUtils.isEmpty(fileSuffix)){
                this.fileSuffix = fileSuffix;
            }
            return this;
        }

        @Override
        public TsFileQuery fileSuffixNot(String fileSuffixNot) {
            if(!IdUtils.isEmpty(fileSuffixNot)){
                this.fileSuffix_NE = fileSuffixNot;
            }
            return this;
        }

        @Override
        public TsFileQuery fileSuffixLike(String fileSuffixLike) {
            if(!IdUtils.isEmpty(fileSuffixLike)){
                this.fileSuffix_LIKE = fileSuffixLike;
            }
            return this;
        }

        @Override
        public TsFileQuery fileSuffixNotLike(String fileSuffixNotLike) {
            if(!IdUtils.isEmpty(fileSuffixNotLike)){
                this.fileSuffix_NOTLIKE = fileSuffixNotLike;
            }
            return this;
        }

        @Override
        public TsFileQuery fileSuffixIn(String fileSuffixIn) {
            if(!IdUtils.isEmpty(fileSuffixIn)){
                if(this.fileSuffix_IN == null){
                    this.fileSuffix_IN = new ArrayList<String>();
                }
                this.fileSuffix_IN.add( fileSuffixIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileSuffixNotIn(String fileSuffixNotIn) {
            if(!IdUtils.isEmpty(fileSuffixNotIn)){
                if(this.fileSuffix_NOTIN == null){
                    this.fileSuffix_NOTIN = new ArrayList<String>();
                }
                this.fileSuffix_NOTIN.add( fileSuffixNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileSuffixIsNull() {
            this.isNulls.add("fileSuffix");
            return this;
        }

        @Override
        public TsFileQuery fileSuffixIsNotNull() {
            this.isNotNulls.add("fileSuffix");
            return this;
        }


        @Override
        public TsFileQuery fileEngine(String fileEngine) {
            if(!IdUtils.isEmpty(fileEngine)){
                this.fileEngine = fileEngine;
            }
            return this;
        }

        @Override
        public TsFileQuery fileEngineNot(String fileEngineNot) {
            if(!IdUtils.isEmpty(fileEngineNot)){
                this.fileEngine_NE = fileEngineNot;
            }
            return this;
        }

        @Override
        public TsFileQuery fileEngineIn(String fileEngineIn) {
            if(!IdUtils.isEmpty(fileEngineIn)){
                if(this.fileEngine_IN == null){
                    this.fileEngine_IN = new ArrayList<String>();
                }
                this.fileEngine_IN.add( fileEngineIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileEngineNotIn(String fileEngineNotIn) {
            if(!IdUtils.isEmpty(fileEngineNotIn)){
                if(this.fileEngine_NOTIN == null){
                    this.fileEngine_NOTIN = new ArrayList<String>();
                }
                this.fileEngine_NOTIN.add( fileEngineNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery fileEngineIsNull() {
            this.isNulls.add("fileEngine");
            return this;
        }

        @Override
        public TsFileQuery fileEngineIsNotNull() {
            this.isNotNulls.add("fileEngine");
            return this;
        }



        @Override
        public TsFileQuery md5(String md5) {
            if(!IdUtils.isEmpty(md5)){
                this.md5 = md5;
            }
            return this;
        }

        @Override
        public TsFileQuery md5Not(String md5Not) {
            if(!IdUtils.isEmpty(md5Not)){
                this.md5_NE = md5Not;
            }
            return this;
        }

        @Override
        public TsFileQuery md5Like(String md5Like) {
            if(!IdUtils.isEmpty(md5Like)){
                this.md5_LIKE = md5Like;
            }
            return this;
        }

        @Override
        public TsFileQuery md5NotLike(String md5NotLike) {
            if(!IdUtils.isEmpty(md5NotLike)){
                this.md5_NOTLIKE = md5NotLike;
            }
            return this;
        }

        @Override
        public TsFileQuery md5In(String md5In) {
            if(!IdUtils.isEmpty(md5In)){
                if(this.md5_IN == null){
                    this.md5_IN = new ArrayList<String>();
                }
                this.md5_IN.add( md5In );
            }
            return this;
        }

        @Override
        public TsFileQuery md5NotIn(String md5NotIn) {
            if(!IdUtils.isEmpty(md5NotIn)){
                if(this.md5_NOTIN == null){
                    this.md5_NOTIN = new ArrayList<String>();
                }
                this.md5_NOTIN.add( md5NotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery md5IsNull() {
            this.isNulls.add("md5");
            return this;
        }

        @Override
        public TsFileQuery md5IsNotNull() {
            this.isNotNulls.add("md5");
            return this;
        }



        @Override
        public TsFileQuery contentType(String contentType) {
            if(!IdUtils.isEmpty(contentType)){
                this.contentType = contentType;
            }
            return this;
        }

        @Override
        public TsFileQuery contentTypeNot(String contentTypeNot) {
            if(!IdUtils.isEmpty(contentTypeNot)){
                this.contentType_NE = contentTypeNot;
            }
            return this;
        }

        @Override
        public TsFileQuery contentTypeLike(String contentTypeLike) {
            if(!IdUtils.isEmpty(contentTypeLike)){
                this.contentType_LIKE = contentTypeLike;
            }
            return this;
        }

        @Override
        public TsFileQuery contentTypeNotLike(String contentTypeNotLike) {
            if(!IdUtils.isEmpty(contentTypeNotLike)){
                this.contentType_NOTLIKE = contentTypeNotLike;
            }
            return this;
        }

        @Override
        public TsFileQuery contentTypeIn(String contentTypeIn) {
            if(!IdUtils.isEmpty(contentTypeIn)){
                if(this.contentType_IN == null){
                    this.contentType_IN = new ArrayList<String>();
                }
                this.contentType_IN.add( contentTypeIn );
            }
            return this;
        }

        @Override
        public TsFileQuery contentTypeNotIn(String contentTypeNotIn) {
            if(!IdUtils.isEmpty(contentTypeNotIn)){
                if(this.contentType_NOTIN == null){
                    this.contentType_NOTIN = new ArrayList<String>();
                }
                this.contentType_NOTIN.add( contentTypeNotIn );
            }
            return this;
        }

        @Override
        public TsFileQuery contentTypeIsNull() {
            this.isNulls.add("contentType");
            return this;
        }

        @Override
        public TsFileQuery contentTypeIsNotNull() {
            this.isNotNulls.add("contentType");
            return this;
        }


        @Override
        public TsFileQuery useFrequency(Integer useFrequency) {
            if(!IdUtils.isEmpty(useFrequency)){
                this.useFrequency = useFrequency;
            }
            return this;
        }

        @Override
        public TsFileQuery useFrequencyNot(Integer useFrequencyNot) {
            if(!IdUtils.isEmpty(useFrequencyNot)){
                this.useFrequency_NE = useFrequencyNot;
            }
            return this;
        }

        @Override
        public TsFileQuery useFrequencyGreaterThan(Integer useFrequencyGreaterThan){
            if(useFrequencyGreaterThan != null){
                this.useFrequency_GT = useFrequencyGreaterThan;
            }
            return this;
        }

        @Override
        public TsFileQuery useFrequencyGreaterEqual(Integer useFrequencyGreaterEqual){
            if(useFrequencyGreaterEqual != null){
                this.useFrequency_GE = useFrequencyGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFileQuery useFrequencyLessThan(Integer useFrequencyLessThan){
            if(useFrequencyLessThan != null){
                this.useFrequency_LT = useFrequencyLessThan;
            }
            return this;
        }

        @Override
        public TsFileQuery useFrequencyLessEqual(Integer useFrequencyLessEqual){
            if(useFrequencyLessEqual != null){
                this.useFrequency_LE = useFrequencyLessEqual;
            }
            return this;
        }

        @Override
        public TsFileQuery versionNo(Integer versionNo) {
            if(!IdUtils.isEmpty(versionNo)){
                this.versionNo = versionNo;
            }
            return this;
        }

        @Override
        public TsFileQuery versionNoNot(Integer versionNoNot) {
            if(!IdUtils.isEmpty(versionNoNot)){
                this.versionNo_NE = versionNoNot;
            }
            return this;
        }

        @Override
        public TsFileQuery versionNoGreaterThan(Integer versionNoGreaterThan){
            if(versionNoGreaterThan != null){
                this.versionNo_GT = versionNoGreaterThan;
            }
            return this;
        }

        @Override
        public TsFileQuery versionNoGreaterEqual(Integer versionNoGreaterEqual){
            if(versionNoGreaterEqual != null){
                this.versionNo_GE = versionNoGreaterEqual;
            }
            return this;
        }

        @Override
        public TsFileQuery versionNoLessThan(Integer versionNoLessThan){
            if(versionNoLessThan != null){
                this.versionNo_LT = versionNoLessThan;
            }
            return this;
        }

        @Override
        public TsFileQuery versionNoLessEqual(Integer versionNoLessEqual){
            if(versionNoLessEqual != null){
                this.versionNo_LE = versionNoLessEqual;
            }
            return this;
        }


	
}