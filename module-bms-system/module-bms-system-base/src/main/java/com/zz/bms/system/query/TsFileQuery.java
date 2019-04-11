package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsFileEntity;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

/**
 * 文件 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:16
 */
public interface TsFileQuery<PK extends Serializable> extends Query<TsFileEntity,PK> {

        public TsFileQuery id(PK id);
        public TsFileQuery idNot(PK idNot);
        public TsFileQuery idIn(PK idIn);
        public TsFileQuery idNotIn(PK idNotIn);
        public TsFileQuery idIsNull();
        public TsFileQuery idIsNotNull();





        public TsFileQuery accessUrlPrefix(String accessUrlPrefix);
        public TsFileQuery accessUrlPrefixNot(String accessUrlPrefixNot);
        public TsFileQuery accessUrlPrefixIn(String accessUrlPrefixIn);
        public TsFileQuery accessUrlPrefixNotIn(String accessUrlPrefixNotIn);
        public TsFileQuery accessUrlPrefixLike(String accessUrlPrefixLike);
        public TsFileQuery accessUrlPrefixNotLike(String accessUrlPrefixNotLike);
        public TsFileQuery accessUrlPrefixIsNull();
        public TsFileQuery accessUrlPrefixIsNotNull();





        public TsFileQuery accessUrl(String accessUrl);
        public TsFileQuery accessUrlNot(String accessUrlNot);
        public TsFileQuery accessUrlIn(String accessUrlIn);
        public TsFileQuery accessUrlNotIn(String accessUrlNotIn);
        public TsFileQuery accessUrlLike(String accessUrlLike);
        public TsFileQuery accessUrlNotLike(String accessUrlNotLike);
        public TsFileQuery accessUrlIsNull();
        public TsFileQuery accessUrlIsNotNull();





        public TsFileQuery fileHost(String fileHost);
        public TsFileQuery fileHostNot(String fileHostNot);
        public TsFileQuery fileHostIn(String fileHostIn);
        public TsFileQuery fileHostNotIn(String fileHostNotIn);
        public TsFileQuery fileHostLike(String fileHostLike);
        public TsFileQuery fileHostNotLike(String fileHostNotLike);
        public TsFileQuery fileHostIsNull();
        public TsFileQuery fileHostIsNotNull();





        public TsFileQuery fileBasePath(String fileBasePath);
        public TsFileQuery fileBasePathNot(String fileBasePathNot);
        public TsFileQuery fileBasePathIn(String fileBasePathIn);
        public TsFileQuery fileBasePathNotIn(String fileBasePathNotIn);
        public TsFileQuery fileBasePathLike(String fileBasePathLike);
        public TsFileQuery fileBasePathNotLike(String fileBasePathNotLike);
        public TsFileQuery fileBasePathIsNull();
        public TsFileQuery fileBasePathIsNotNull();





        public TsFileQuery filePath(String filePath);
        public TsFileQuery filePathNot(String filePathNot);
        public TsFileQuery filePathIn(String filePathIn);
        public TsFileQuery filePathNotIn(String filePathNotIn);
        public TsFileQuery filePathLike(String filePathLike);
        public TsFileQuery filePathNotLike(String filePathNotLike);
        public TsFileQuery filePathIsNull();
        public TsFileQuery filePathIsNotNull();





        public TsFileQuery fileName(String fileName);
        public TsFileQuery fileNameNot(String fileNameNot);
        public TsFileQuery fileNameIn(String fileNameIn);
        public TsFileQuery fileNameNotIn(String fileNameNotIn);
        public TsFileQuery fileNameLike(String fileNameLike);
        public TsFileQuery fileNameNotLike(String fileNameNotLike);
        public TsFileQuery fileNameIsNull();
        public TsFileQuery fileNameIsNotNull();





        public TsFileQuery fileSize(Long fileSize);
        public TsFileQuery fileSizeNot(Long fileSizeNot);
        public TsFileQuery fileSizeGreaterThan(Long fileSizeGreaterThan);
        public TsFileQuery fileSizeGreaterEqual(Long fileSizeGreaterEqual);
        public TsFileQuery fileSizeLessThan(Long fileSizeLessThan);
        public TsFileQuery fileSizeLessEqual(Long fileSizeLessEqual);





        public TsFileQuery fileSuffix(String fileSuffix);
        public TsFileQuery fileSuffixNot(String fileSuffixNot);
        public TsFileQuery fileSuffixIn(String fileSuffixIn);
        public TsFileQuery fileSuffixNotIn(String fileSuffixNotIn);
        public TsFileQuery fileSuffixLike(String fileSuffixLike);
        public TsFileQuery fileSuffixNotLike(String fileSuffixNotLike);
        public TsFileQuery fileSuffixIsNull();
        public TsFileQuery fileSuffixIsNotNull();





        public TsFileQuery fileEngine(String fileEngine);
        public TsFileQuery fileEngineNot(String fileEngineNot);
        public TsFileQuery fileEngineIn(String fileEngineIn);
        public TsFileQuery fileEngineNotIn(String fileEngineNotIn);
        public TsFileQuery fileEngineIsNull();
        public TsFileQuery fileEngineIsNotNull();





        public TsFileQuery md5(String md5);
        public TsFileQuery md5Not(String md5Not);
        public TsFileQuery md5In(String md5In);
        public TsFileQuery md5NotIn(String md5NotIn);
        public TsFileQuery md5Like(String md5Like);
        public TsFileQuery md5NotLike(String md5NotLike);
        public TsFileQuery md5IsNull();
        public TsFileQuery md5IsNotNull();





        public TsFileQuery contentType(String contentType);
        public TsFileQuery contentTypeNot(String contentTypeNot);
        public TsFileQuery contentTypeIn(String contentTypeIn);
        public TsFileQuery contentTypeNotIn(String contentTypeNotIn);
        public TsFileQuery contentTypeLike(String contentTypeLike);
        public TsFileQuery contentTypeNotLike(String contentTypeNotLike);
        public TsFileQuery contentTypeIsNull();
        public TsFileQuery contentTypeIsNotNull();





        public TsFileQuery useFrequency(Integer useFrequency);
        public TsFileQuery useFrequencyNot(Integer useFrequencyNot);
        public TsFileQuery useFrequencyGreaterThan(Integer useFrequencyGreaterThan);
        public TsFileQuery useFrequencyGreaterEqual(Integer useFrequencyGreaterEqual);
        public TsFileQuery useFrequencyLessThan(Integer useFrequencyLessThan);
        public TsFileQuery useFrequencyLessEqual(Integer useFrequencyLessEqual);





        public TsFileQuery versionNo(Integer versionNo);
        public TsFileQuery versionNoNot(Integer versionNoNot);
        public TsFileQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsFileQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsFileQuery versionNoLessThan(Integer versionNoLessThan);
        public TsFileQuery versionNoLessEqual(Integer versionNoLessEqual);






	
}