package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsFilesEntity;

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
public interface TsFilesQuery<PK extends Serializable> extends Query<TsFilesEntity,PK> {

        public TsFilesQuery id(PK id);
        public TsFilesQuery idNot(PK idNot);
        public TsFilesQuery idIn(PK idIn);
        public TsFilesQuery idNotIn(PK idNotIn);
        public TsFilesQuery idIsNull();
        public TsFilesQuery idIsNotNull();





        public TsFilesQuery accessUrlPrefix(String accessUrlPrefix);
        public TsFilesQuery accessUrlPrefixNot(String accessUrlPrefixNot);
        public TsFilesQuery accessUrlPrefixIn(String accessUrlPrefixIn);
        public TsFilesQuery accessUrlPrefixNotIn(String accessUrlPrefixNotIn);
        public TsFilesQuery accessUrlPrefixLike(String accessUrlPrefixLike);
        public TsFilesQuery accessUrlPrefixNotLike(String accessUrlPrefixNotLike);
        public TsFilesQuery accessUrlPrefixIsNull();
        public TsFilesQuery accessUrlPrefixIsNotNull();





        public TsFilesQuery accessUrl(String accessUrl);
        public TsFilesQuery accessUrlNot(String accessUrlNot);
        public TsFilesQuery accessUrlIn(String accessUrlIn);
        public TsFilesQuery accessUrlNotIn(String accessUrlNotIn);
        public TsFilesQuery accessUrlLike(String accessUrlLike);
        public TsFilesQuery accessUrlNotLike(String accessUrlNotLike);
        public TsFilesQuery accessUrlIsNull();
        public TsFilesQuery accessUrlIsNotNull();





        public TsFilesQuery fileHost(String fileHost);
        public TsFilesQuery fileHostNot(String fileHostNot);
        public TsFilesQuery fileHostIn(String fileHostIn);
        public TsFilesQuery fileHostNotIn(String fileHostNotIn);
        public TsFilesQuery fileHostLike(String fileHostLike);
        public TsFilesQuery fileHostNotLike(String fileHostNotLike);
        public TsFilesQuery fileHostIsNull();
        public TsFilesQuery fileHostIsNotNull();





        public TsFilesQuery filePath(String filePath);
        public TsFilesQuery filePathNot(String filePathNot);
        public TsFilesQuery filePathIn(String filePathIn);
        public TsFilesQuery filePathNotIn(String filePathNotIn);
        public TsFilesQuery filePathLike(String filePathLike);
        public TsFilesQuery filePathNotLike(String filePathNotLike);
        public TsFilesQuery filePathIsNull();
        public TsFilesQuery filePathIsNotNull();





        public TsFilesQuery fileName(String fileName);
        public TsFilesQuery fileNameNot(String fileNameNot);
        public TsFilesQuery fileNameIn(String fileNameIn);
        public TsFilesQuery fileNameNotIn(String fileNameNotIn);
        public TsFilesQuery fileNameLike(String fileNameLike);
        public TsFilesQuery fileNameNotLike(String fileNameNotLike);
        public TsFilesQuery fileNameIsNull();
        public TsFilesQuery fileNameIsNotNull();





        public TsFilesQuery fileSize(Long fileSize);
        public TsFilesQuery fileSizeNot(Long fileSizeNot);
        public TsFilesQuery fileSizeGreaterThan(Long fileSizeGreaterThan);
        public TsFilesQuery fileSizeGreaterEqual(Long fileSizeGreaterEqual);
        public TsFilesQuery fileSizeLessThan(Long fileSizeLessThan);
        public TsFilesQuery fileSizeLessEqual(Long fileSizeLessEqual);





        public TsFilesQuery fileSuffix(String fileSuffix);
        public TsFilesQuery fileSuffixNot(String fileSuffixNot);
        public TsFilesQuery fileSuffixIn(String fileSuffixIn);
        public TsFilesQuery fileSuffixNotIn(String fileSuffixNotIn);
        public TsFilesQuery fileSuffixLike(String fileSuffixLike);
        public TsFilesQuery fileSuffixNotLike(String fileSuffixNotLike);
        public TsFilesQuery fileSuffixIsNull();
        public TsFilesQuery fileSuffixIsNotNull();





        public TsFilesQuery fileEngine(String fileEngine);
        public TsFilesQuery fileEngineNot(String fileEngineNot);
        public TsFilesQuery fileEngineIn(String fileEngineIn);
        public TsFilesQuery fileEngineNotIn(String fileEngineNotIn);
        public TsFilesQuery fileEngineIsNull();
        public TsFilesQuery fileEngineIsNotNull();





        public TsFilesQuery md5(String md5);
        public TsFilesQuery md5Not(String md5Not);
        public TsFilesQuery md5In(String md5In);
        public TsFilesQuery md5NotIn(String md5NotIn);
        public TsFilesQuery md5Like(String md5Like);
        public TsFilesQuery md5NotLike(String md5NotLike);
        public TsFilesQuery md5IsNull();
        public TsFilesQuery md5IsNotNull();





        public TsFilesQuery contentType(String contentType);
        public TsFilesQuery contentTypeNot(String contentTypeNot);
        public TsFilesQuery contentTypeIn(String contentTypeIn);
        public TsFilesQuery contentTypeNotIn(String contentTypeNotIn);
        public TsFilesQuery contentTypeLike(String contentTypeLike);
        public TsFilesQuery contentTypeNotLike(String contentTypeNotLike);
        public TsFilesQuery contentTypeIsNull();
        public TsFilesQuery contentTypeIsNotNull();





        public TsFilesQuery useFrequency(Integer useFrequency);
        public TsFilesQuery useFrequencyNot(Integer useFrequencyNot);
        public TsFilesQuery useFrequencyGreaterThan(Integer useFrequencyGreaterThan);
        public TsFilesQuery useFrequencyGreaterEqual(Integer useFrequencyGreaterEqual);
        public TsFilesQuery useFrequencyLessThan(Integer useFrequencyLessThan);
        public TsFilesQuery useFrequencyLessEqual(Integer useFrequencyLessEqual);





        public TsFilesQuery deleteFlag(String deleteFlag);
        public TsFilesQuery deleteFlagNot(String deleteFlagNot);
        public TsFilesQuery deleteFlagIn(String deleteFlagIn);
        public TsFilesQuery deleteFlagNotIn(String deleteFlagNotIn);
        public TsFilesQuery deleteFlagLike(String deleteFlagLike);
        public TsFilesQuery deleteFlagNotLike(String deleteFlagNotLike);
        public TsFilesQuery deleteFlagIsNull();
        public TsFilesQuery deleteFlagIsNotNull();





        public TsFilesQuery createUserId(String createUserId);
        public TsFilesQuery createUserIdNot(String createUserIdNot);
        public TsFilesQuery createUserIdIn(String createUserIdIn);
        public TsFilesQuery createUserIdNotIn(String createUserIdNotIn);
        public TsFilesQuery createUserIdLike(String createUserIdLike);
        public TsFilesQuery createUserIdNotLike(String createUserIdNotLike);
        public TsFilesQuery createUserIdIsNull();
        public TsFilesQuery createUserIdIsNotNull();





        public TsFilesQuery createUserName(String createUserName);
        public TsFilesQuery createUserNameNot(String createUserNameNot);
        public TsFilesQuery createUserNameIn(String createUserNameIn);
        public TsFilesQuery createUserNameNotIn(String createUserNameNotIn);
        public TsFilesQuery createUserNameLike(String createUserNameLike);
        public TsFilesQuery createUserNameNotLike(String createUserNameNotLike);
        public TsFilesQuery createUserNameIsNull();
        public TsFilesQuery createUserNameIsNotNull();





        public TsFilesQuery createTime(Timestamp createTime);
        public TsFilesQuery createTimeNot(Timestamp createTimeNot);
        public TsFilesQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsFilesQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsFilesQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsFilesQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsFilesQuery updateUserId(String updateUserId);
        public TsFilesQuery updateUserIdNot(String updateUserIdNot);
        public TsFilesQuery updateUserIdIn(String updateUserIdIn);
        public TsFilesQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsFilesQuery updateUserIdLike(String updateUserIdLike);
        public TsFilesQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsFilesQuery updateUserIdIsNull();
        public TsFilesQuery updateUserIdIsNotNull();





        public TsFilesQuery updateUserName(String updateUserName);
        public TsFilesQuery updateUserNameNot(String updateUserNameNot);
        public TsFilesQuery updateUserNameIn(String updateUserNameIn);
        public TsFilesQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsFilesQuery updateUserNameLike(String updateUserNameLike);
        public TsFilesQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsFilesQuery updateUserNameIsNull();
        public TsFilesQuery updateUserNameIsNotNull();





        public TsFilesQuery updateTime(Timestamp updateTime);
        public TsFilesQuery updateTimeNot(Timestamp updateTimeNot);
        public TsFilesQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsFilesQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsFilesQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsFilesQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsFilesQuery versionNo(Integer versionNo);
        public TsFilesQuery versionNoNot(Integer versionNoNot);
        public TsFilesQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsFilesQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsFilesQuery versionNoLessThan(Integer versionNoLessThan);
        public TsFilesQuery versionNoLessEqual(Integer versionNoLessEqual);






	
}