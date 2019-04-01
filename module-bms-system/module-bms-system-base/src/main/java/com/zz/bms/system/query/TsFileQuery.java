package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsFileEntity;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 文件 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:31
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





        public TsFileQuery deleteFlag(String deleteFlag);
        public TsFileQuery deleteFlagNot(String deleteFlagNot);
        public TsFileQuery deleteFlagIn(String deleteFlagIn);
        public TsFileQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TsFileQuery deleteFlagLike(String deleteFlagLike);
        public TsFileQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TsFileQuery deleteFlagIsNull();
        public TsFileQuery deleteFlagIsNotNull();





        public TsFileQuery createUserId(String createUserId);
        public TsFileQuery createUserIdNot(String createUserIdNot);
        public TsFileQuery createUserIdIn(String createUserIdIn);
        public TsFileQuery createUserIdNotIn(String createUserIdNotIn);
        public TsFileQuery createUserIdLike(String createUserIdLike);
        public TsFileQuery createUserIdNotLike(String createUserIdNotLike);
        public TsFileQuery createUserIdIsNull();
        public TsFileQuery createUserIdIsNotNull();





        public TsFileQuery createUserName(String createUserName);
        public TsFileQuery createUserNameNot(String createUserNameNot);
        public TsFileQuery createUserNameIn(String createUserNameIn);
        public TsFileQuery createUserNameNotIn(String createUserNameNotIn);
        public TsFileQuery createUserNameLike(String createUserNameLike);
        public TsFileQuery createUserNameNotLike(String createUserNameNotLike);
        public TsFileQuery createUserNameIsNull();
        public TsFileQuery createUserNameIsNotNull();





        public TsFileQuery createTime(Timestamp createTime);
        public TsFileQuery createTimeNot(Timestamp createTimeNot);
        public TsFileQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsFileQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsFileQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsFileQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsFileQuery updateUserId(String updateUserId);
        public TsFileQuery updateUserIdNot(String updateUserIdNot);
        public TsFileQuery updateUserIdIn(String updateUserIdIn);
        public TsFileQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsFileQuery updateUserIdLike(String updateUserIdLike);
        public TsFileQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsFileQuery updateUserIdIsNull();
        public TsFileQuery updateUserIdIsNotNull();





        public TsFileQuery updateUserName(String updateUserName);
        public TsFileQuery updateUserNameNot(String updateUserNameNot);
        public TsFileQuery updateUserNameIn(String updateUserNameIn);
        public TsFileQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsFileQuery updateUserNameLike(String updateUserNameLike);
        public TsFileQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsFileQuery updateUserNameIsNull();
        public TsFileQuery updateUserNameIsNotNull();





        public TsFileQuery updateTime(Timestamp updateTime);
        public TsFileQuery updateTimeNot(Timestamp updateTimeNot);
        public TsFileQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsFileQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsFileQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsFileQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsFileQuery versionNo(Integer versionNo);
        public TsFileQuery versionNoNot(Integer versionNoNot);
        public TsFileQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsFileQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsFileQuery versionNoLessThan(Integer versionNoLessThan);
        public TsFileQuery versionNoLessEqual(Integer versionNoLessEqual);






	
}