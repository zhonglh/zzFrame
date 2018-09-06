package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.VsFilesUseEntity;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 文件使用 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public interface VsFilesUseQuery<PK extends Serializable> extends Query<VsFilesUseEntity,PK> {

        public VsFilesUseQuery id(PK id);
        public VsFilesUseQuery idNot(PK idNot);
        public VsFilesUseQuery idIn(PK idIn);
        public VsFilesUseQuery idNotIn(PK idNotIn);
        public VsFilesUseQuery idIsNull();
        public VsFilesUseQuery idIsNotNull();





        public VsFilesUseQuery fileId(String fileId);
        public VsFilesUseQuery fileIdNot(String fileIdNot);
        public VsFilesUseQuery fileIdIn(String fileIdIn);
        public VsFilesUseQuery fileIdNotIn(String fileIdNotIn);
        public VsFilesUseQuery fileIdLike(String fileIdLike);
        public VsFilesUseQuery fileIdNotLike(String fileIdNotLike);
        public VsFilesUseQuery fileIdIsNull();
        public VsFilesUseQuery fileIdIsNotNull();





        public VsFilesUseQuery showName(String showName);
        public VsFilesUseQuery showNameNot(String showNameNot);
        public VsFilesUseQuery showNameIn(String showNameIn);
        public VsFilesUseQuery showNameNotIn(String showNameNotIn);
        public VsFilesUseQuery showNameLike(String showNameLike);
        public VsFilesUseQuery showNameNotLike(String showNameNotLike);
        public VsFilesUseQuery showNameIsNull();
        public VsFilesUseQuery showNameIsNotNull();





        public VsFilesUseQuery businessType(String businessType);
        public VsFilesUseQuery businessTypeNot(String businessTypeNot);
        public VsFilesUseQuery businessTypeIn(String businessTypeIn);
        public VsFilesUseQuery businessTypeNotIn(String businessTypeNotIn);
        public VsFilesUseQuery businessTypeIsNull();
        public VsFilesUseQuery businessTypeIsNotNull();





        public VsFilesUseQuery businessTmpId(String businessTmpId);
        public VsFilesUseQuery businessTmpIdNot(String businessTmpIdNot);
        public VsFilesUseQuery businessTmpIdIn(String businessTmpIdIn);
        public VsFilesUseQuery businessTmpIdNotIn(String businessTmpIdNotIn);
        public VsFilesUseQuery businessTmpIdLike(String businessTmpIdLike);
        public VsFilesUseQuery businessTmpIdNotLike(String businessTmpIdNotLike);
        public VsFilesUseQuery businessTmpIdIsNull();
        public VsFilesUseQuery businessTmpIdIsNotNull();





        public VsFilesUseQuery businessId(String businessId);
        public VsFilesUseQuery businessIdNot(String businessIdNot);
        public VsFilesUseQuery businessIdIn(String businessIdIn);
        public VsFilesUseQuery businessIdNotIn(String businessIdNotIn);
        public VsFilesUseQuery businessIdLike(String businessIdLike);
        public VsFilesUseQuery businessIdNotLike(String businessIdNotLike);
        public VsFilesUseQuery businessIdIsNull();
        public VsFilesUseQuery businessIdIsNotNull();





        public VsFilesUseQuery fileOrder(Integer fileOrder);
        public VsFilesUseQuery fileOrderNot(Integer fileOrderNot);
        public VsFilesUseQuery fileOrderGreaterThan(Integer fileOrderGreaterThan);
        public VsFilesUseQuery fileOrderGreaterEqual(Integer fileOrderGreaterEqual);
        public VsFilesUseQuery fileOrderLessThan(Integer fileOrderLessThan);
        public VsFilesUseQuery fileOrderLessEqual(Integer fileOrderLessEqual);





        public VsFilesUseQuery remark(String remark);
        public VsFilesUseQuery remarkNot(String remarkNot);
        public VsFilesUseQuery remarkIn(String remarkIn);
        public VsFilesUseQuery remarkNotIn(String remarkNotIn);
        public VsFilesUseQuery remarkLike(String remarkLike);
        public VsFilesUseQuery remarkNotLike(String remarkNotLike);
        public VsFilesUseQuery remarkIsNull();
        public VsFilesUseQuery remarkIsNotNull();





        public VsFilesUseQuery createUserId(String createUserId);
        public VsFilesUseQuery createUserIdNot(String createUserIdNot);
        public VsFilesUseQuery createUserIdIn(String createUserIdIn);
        public VsFilesUseQuery createUserIdNotIn(String createUserIdNotIn);
        public VsFilesUseQuery createUserIdLike(String createUserIdLike);
        public VsFilesUseQuery createUserIdNotLike(String createUserIdNotLike);
        public VsFilesUseQuery createUserIdIsNull();
        public VsFilesUseQuery createUserIdIsNotNull();





        public VsFilesUseQuery createUserName(String createUserName);
        public VsFilesUseQuery createUserNameNot(String createUserNameNot);
        public VsFilesUseQuery createUserNameIn(String createUserNameIn);
        public VsFilesUseQuery createUserNameNotIn(String createUserNameNotIn);
        public VsFilesUseQuery createUserNameLike(String createUserNameLike);
        public VsFilesUseQuery createUserNameNotLike(String createUserNameNotLike);
        public VsFilesUseQuery createUserNameIsNull();
        public VsFilesUseQuery createUserNameIsNotNull();





        public VsFilesUseQuery createTime(Timestamp createTime);
        public VsFilesUseQuery createTimeNot(Timestamp createTimeNot);
        public VsFilesUseQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public VsFilesUseQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public VsFilesUseQuery createTimeLessThan(Timestamp createTimeLessThan);
        public VsFilesUseQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public VsFilesUseQuery updateUserId(String updateUserId);
        public VsFilesUseQuery updateUserIdNot(String updateUserIdNot);
        public VsFilesUseQuery updateUserIdIn(String updateUserIdIn);
        public VsFilesUseQuery updateUserIdNotIn(String updateUserIdNotIn);
        public VsFilesUseQuery updateUserIdLike(String updateUserIdLike);
        public VsFilesUseQuery updateUserIdNotLike(String updateUserIdNotLike);
        public VsFilesUseQuery updateUserIdIsNull();
        public VsFilesUseQuery updateUserIdIsNotNull();





        public VsFilesUseQuery updateUserName(String updateUserName);
        public VsFilesUseQuery updateUserNameNot(String updateUserNameNot);
        public VsFilesUseQuery updateUserNameIn(String updateUserNameIn);
        public VsFilesUseQuery updateUserNameNotIn(String updateUserNameNotIn);
        public VsFilesUseQuery updateUserNameLike(String updateUserNameLike);
        public VsFilesUseQuery updateUserNameNotLike(String updateUserNameNotLike);
        public VsFilesUseQuery updateUserNameIsNull();
        public VsFilesUseQuery updateUserNameIsNotNull();





        public VsFilesUseQuery updateTime(Timestamp updateTime);
        public VsFilesUseQuery updateTimeNot(Timestamp updateTimeNot);
        public VsFilesUseQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public VsFilesUseQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public VsFilesUseQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public VsFilesUseQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public VsFilesUseQuery versionNo(Integer versionNo);
        public VsFilesUseQuery versionNoNot(Integer versionNoNot);
        public VsFilesUseQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public VsFilesUseQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public VsFilesUseQuery versionNoLessThan(Integer versionNoLessThan);
        public VsFilesUseQuery versionNoLessEqual(Integer versionNoLessEqual);





        public VsFilesUseQuery tenantId(String tenantId);
        public VsFilesUseQuery tenantIdNot(String tenantIdNot);
        public VsFilesUseQuery tenantIdIn(String tenantIdIn);
        public VsFilesUseQuery tenantIdNotIn(String tenantIdNotIn);
        public VsFilesUseQuery tenantIdLike(String tenantIdLike);
        public VsFilesUseQuery tenantIdNotLike(String tenantIdNotLike);
        public VsFilesUseQuery tenantIdIsNull();
        public VsFilesUseQuery tenantIdIsNotNull();





        public VsFilesUseQuery accessUrl(String accessUrl);
        public VsFilesUseQuery accessUrlNot(String accessUrlNot);
        public VsFilesUseQuery accessUrlIn(String accessUrlIn);
        public VsFilesUseQuery accessUrlNotIn(String accessUrlNotIn);
        public VsFilesUseQuery accessUrlLike(String accessUrlLike);
        public VsFilesUseQuery accessUrlNotLike(String accessUrlNotLike);
        public VsFilesUseQuery accessUrlIsNull();
        public VsFilesUseQuery accessUrlIsNotNull();





        public VsFilesUseQuery fileHost(String fileHost);
        public VsFilesUseQuery fileHostNot(String fileHostNot);
        public VsFilesUseQuery fileHostIn(String fileHostIn);
        public VsFilesUseQuery fileHostNotIn(String fileHostNotIn);
        public VsFilesUseQuery fileHostLike(String fileHostLike);
        public VsFilesUseQuery fileHostNotLike(String fileHostNotLike);
        public VsFilesUseQuery fileHostIsNull();
        public VsFilesUseQuery fileHostIsNotNull();





        public VsFilesUseQuery filePath(String filePath);
        public VsFilesUseQuery filePathNot(String filePathNot);
        public VsFilesUseQuery filePathIn(String filePathIn);
        public VsFilesUseQuery filePathNotIn(String filePathNotIn);
        public VsFilesUseQuery filePathLike(String filePathLike);
        public VsFilesUseQuery filePathNotLike(String filePathNotLike);
        public VsFilesUseQuery filePathIsNull();
        public VsFilesUseQuery filePathIsNotNull();





        public VsFilesUseQuery fileName(String fileName);
        public VsFilesUseQuery fileNameNot(String fileNameNot);
        public VsFilesUseQuery fileNameIn(String fileNameIn);
        public VsFilesUseQuery fileNameNotIn(String fileNameNotIn);
        public VsFilesUseQuery fileNameLike(String fileNameLike);
        public VsFilesUseQuery fileNameNotLike(String fileNameNotLike);
        public VsFilesUseQuery fileNameIsNull();
        public VsFilesUseQuery fileNameIsNotNull();





        public VsFilesUseQuery fileSize(Long fileSize);
        public VsFilesUseQuery fileSizeNot(Long fileSizeNot);
        public VsFilesUseQuery fileSizeGreaterThan(Long fileSizeGreaterThan);
        public VsFilesUseQuery fileSizeGreaterEqual(Long fileSizeGreaterEqual);
        public VsFilesUseQuery fileSizeLessThan(Long fileSizeLessThan);
        public VsFilesUseQuery fileSizeLessEqual(Long fileSizeLessEqual);





        public VsFilesUseQuery fileSuffix(String fileSuffix);
        public VsFilesUseQuery fileSuffixNot(String fileSuffixNot);
        public VsFilesUseQuery fileSuffixIn(String fileSuffixIn);
        public VsFilesUseQuery fileSuffixNotIn(String fileSuffixNotIn);
        public VsFilesUseQuery fileSuffixLike(String fileSuffixLike);
        public VsFilesUseQuery fileSuffixNotLike(String fileSuffixNotLike);
        public VsFilesUseQuery fileSuffixIsNull();
        public VsFilesUseQuery fileSuffixIsNotNull();





        public VsFilesUseQuery contentType(String contentType);
        public VsFilesUseQuery contentTypeNot(String contentTypeNot);
        public VsFilesUseQuery contentTypeIn(String contentTypeIn);
        public VsFilesUseQuery contentTypeNotIn(String contentTypeNotIn);
        public VsFilesUseQuery contentTypeLike(String contentTypeLike);
        public VsFilesUseQuery contentTypeNotLike(String contentTypeNotLike);
        public VsFilesUseQuery contentTypeIsNull();
        public VsFilesUseQuery contentTypeIsNotNull();





        public VsFilesUseQuery fileEngine(String fileEngine);
        public VsFilesUseQuery fileEngineNot(String fileEngineNot);
        public VsFilesUseQuery fileEngineIn(String fileEngineIn);
        public VsFilesUseQuery fileEngineNotIn(String fileEngineNotIn);
        public VsFilesUseQuery fileEngineIsNull();
        public VsFilesUseQuery fileEngineIsNotNull();





        public VsFilesUseQuery md5(String md5);
        public VsFilesUseQuery md5Not(String md5Not);
        public VsFilesUseQuery md5In(String md5In);
        public VsFilesUseQuery md5NotIn(String md5NotIn);
        public VsFilesUseQuery md5Like(String md5Like);
        public VsFilesUseQuery md5NotLike(String md5NotLike);
        public VsFilesUseQuery md5IsNull();
        public VsFilesUseQuery md5IsNotNull();





        public VsFilesUseQuery useFrequency(Integer useFrequency);
        public VsFilesUseQuery useFrequencyNot(Integer useFrequencyNot);
        public VsFilesUseQuery useFrequencyGreaterThan(Integer useFrequencyGreaterThan);
        public VsFilesUseQuery useFrequencyGreaterEqual(Integer useFrequencyGreaterEqual);
        public VsFilesUseQuery useFrequencyLessThan(Integer useFrequencyLessThan);
        public VsFilesUseQuery useFrequencyLessEqual(Integer useFrequencyLessEqual);






	
}