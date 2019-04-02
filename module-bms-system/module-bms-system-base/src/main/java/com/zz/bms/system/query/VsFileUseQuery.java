package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.VsFileUseEntity;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 文件使用 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-1 13:52:03
 */
public interface VsFileUseQuery<PK extends Serializable> extends Query<VsFileUseEntity,PK> {

        public VsFileUseQuery id(PK id);
        public VsFileUseQuery idNot(PK idNot);
        public VsFileUseQuery idIn(PK idIn);
        public VsFileUseQuery idNotIn(PK idNotIn);
        public VsFileUseQuery idIsNull();
        public VsFileUseQuery idIsNotNull();





        public VsFileUseQuery fileId(String fileId);
        public VsFileUseQuery fileIdNot(String fileIdNot);
        public VsFileUseQuery fileIdIn(String fileIdIn);
        public VsFileUseQuery fileIdNotIn(String fileIdNotIn);
        public VsFileUseQuery fileIdLike(String fileIdLike);
        public VsFileUseQuery fileIdNotLike(String fileIdNotLike);
        public VsFileUseQuery fileIdIsNull();
        public VsFileUseQuery fileIdIsNotNull();





        public VsFileUseQuery showName(String showName);
        public VsFileUseQuery showNameNot(String showNameNot);
        public VsFileUseQuery showNameIn(String showNameIn);
        public VsFileUseQuery showNameNotIn(String showNameNotIn);
        public VsFileUseQuery showNameLike(String showNameLike);
        public VsFileUseQuery showNameNotLike(String showNameNotLike);
        public VsFileUseQuery showNameIsNull();
        public VsFileUseQuery showNameIsNotNull();





        public VsFileUseQuery businessType(String businessType);
        public VsFileUseQuery businessTypeNot(String businessTypeNot);
        public VsFileUseQuery businessTypeIn(String businessTypeIn);
        public VsFileUseQuery businessTypeNotIn(String businessTypeNotIn);
        public VsFileUseQuery businessTypeIsNull();
        public VsFileUseQuery businessTypeIsNotNull();





        public VsFileUseQuery businessTmpId(String businessTmpId);
        public VsFileUseQuery businessTmpIdNot(String businessTmpIdNot);
        public VsFileUseQuery businessTmpIdIn(String businessTmpIdIn);
        public VsFileUseQuery businessTmpIdNotIn(String businessTmpIdNotIn);
        public VsFileUseQuery businessTmpIdLike(String businessTmpIdLike);
        public VsFileUseQuery businessTmpIdNotLike(String businessTmpIdNotLike);
        public VsFileUseQuery businessTmpIdIsNull();
        public VsFileUseQuery businessTmpIdIsNotNull();





        public VsFileUseQuery businessId(String businessId);
        public VsFileUseQuery businessIdNot(String businessIdNot);
        public VsFileUseQuery businessIdIn(String businessIdIn);
        public VsFileUseQuery businessIdNotIn(String businessIdNotIn);
        public VsFileUseQuery businessIdLike(String businessIdLike);
        public VsFileUseQuery businessIdNotLike(String businessIdNotLike);
        public VsFileUseQuery businessIdIsNull();
        public VsFileUseQuery businessIdIsNotNull();





        public VsFileUseQuery fileOrder(Integer fileOrder);
        public VsFileUseQuery fileOrderNot(Integer fileOrderNot);
        public VsFileUseQuery fileOrderGreaterThan(Integer fileOrderGreaterThan);
        public VsFileUseQuery fileOrderGreaterEqual(Integer fileOrderGreaterEqual);
        public VsFileUseQuery fileOrderLessThan(Integer fileOrderLessThan);
        public VsFileUseQuery fileOrderLessEqual(Integer fileOrderLessEqual);





        public VsFileUseQuery remark(String remark);
        public VsFileUseQuery remarkNot(String remarkNot);
        public VsFileUseQuery remarkIn(String remarkIn);
        public VsFileUseQuery remarkNotIn(String remarkNotIn);
        public VsFileUseQuery remarkLike(String remarkLike);
        public VsFileUseQuery remarkNotLike(String remarkNotLike);
        public VsFileUseQuery remarkIsNull();
        public VsFileUseQuery remarkIsNotNull();





        public VsFileUseQuery createUserId(String createUserId);
        public VsFileUseQuery createUserIdNot(String createUserIdNot);
        public VsFileUseQuery createUserIdIn(String createUserIdIn);
        public VsFileUseQuery createUserIdNotIn(String createUserIdNotIn);
        public VsFileUseQuery createUserIdLike(String createUserIdLike);
        public VsFileUseQuery createUserIdNotLike(String createUserIdNotLike);
        public VsFileUseQuery createUserIdIsNull();
        public VsFileUseQuery createUserIdIsNotNull();





        public VsFileUseQuery createUserName(String createUserName);
        public VsFileUseQuery createUserNameNot(String createUserNameNot);
        public VsFileUseQuery createUserNameIn(String createUserNameIn);
        public VsFileUseQuery createUserNameNotIn(String createUserNameNotIn);
        public VsFileUseQuery createUserNameLike(String createUserNameLike);
        public VsFileUseQuery createUserNameNotLike(String createUserNameNotLike);
        public VsFileUseQuery createUserNameIsNull();
        public VsFileUseQuery createUserNameIsNotNull();





        public VsFileUseQuery createTime(Timestamp createTime);
        public VsFileUseQuery createTimeNot(Timestamp createTimeNot);
        public VsFileUseQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public VsFileUseQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public VsFileUseQuery createTimeLessThan(Timestamp createTimeLessThan);
        public VsFileUseQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public VsFileUseQuery updateUserId(String updateUserId);
        public VsFileUseQuery updateUserIdNot(String updateUserIdNot);
        public VsFileUseQuery updateUserIdIn(String updateUserIdIn);
        public VsFileUseQuery updateUserIdNotIn(String updateUserIdNotIn);
        public VsFileUseQuery updateUserIdLike(String updateUserIdLike);
        public VsFileUseQuery updateUserIdNotLike(String updateUserIdNotLike);
        public VsFileUseQuery updateUserIdIsNull();
        public VsFileUseQuery updateUserIdIsNotNull();





        public VsFileUseQuery updateUserName(String updateUserName);
        public VsFileUseQuery updateUserNameNot(String updateUserNameNot);
        public VsFileUseQuery updateUserNameIn(String updateUserNameIn);
        public VsFileUseQuery updateUserNameNotIn(String updateUserNameNotIn);
        public VsFileUseQuery updateUserNameLike(String updateUserNameLike);
        public VsFileUseQuery updateUserNameNotLike(String updateUserNameNotLike);
        public VsFileUseQuery updateUserNameIsNull();
        public VsFileUseQuery updateUserNameIsNotNull();





        public VsFileUseQuery updateTime(Timestamp updateTime);
        public VsFileUseQuery updateTimeNot(Timestamp updateTimeNot);
        public VsFileUseQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public VsFileUseQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public VsFileUseQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public VsFileUseQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public VsFileUseQuery versionNo(Integer versionNo);
        public VsFileUseQuery versionNoNot(Integer versionNoNot);
        public VsFileUseQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public VsFileUseQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public VsFileUseQuery versionNoLessThan(Integer versionNoLessThan);
        public VsFileUseQuery versionNoLessEqual(Integer versionNoLessEqual);





        public VsFileUseQuery tenantId(String tenantId);
        public VsFileUseQuery tenantIdNot(String tenantIdNot);
        public VsFileUseQuery tenantIdIn(String tenantIdIn);
        public VsFileUseQuery tenantIdNotIn(String tenantIdNotIn);
        public VsFileUseQuery tenantIdLike(String tenantIdLike);
        public VsFileUseQuery tenantIdNotLike(String tenantIdNotLike);
        public VsFileUseQuery tenantIdIsNull();
        public VsFileUseQuery tenantIdIsNotNull();





        public VsFileUseQuery accessUrl(Double accessUrl);
        public VsFileUseQuery accessUrlNot(Double accessUrlNot);
        public VsFileUseQuery accessUrlGreaterThan(Double accessUrlGreaterThan);
        public VsFileUseQuery accessUrlGreaterEqual(Double accessUrlGreaterEqual);
        public VsFileUseQuery accessUrlLessThan(Double accessUrlLessThan);
        public VsFileUseQuery accessUrlLessEqual(Double accessUrlLessEqual);





        public VsFileUseQuery contentType(String contentType);
        public VsFileUseQuery contentTypeNot(String contentTypeNot);
        public VsFileUseQuery contentTypeIn(String contentTypeIn);
        public VsFileUseQuery contentTypeNotIn(String contentTypeNotIn);
        public VsFileUseQuery contentTypeLike(String contentTypeLike);
        public VsFileUseQuery contentTypeNotLike(String contentTypeNotLike);
        public VsFileUseQuery contentTypeIsNull();
        public VsFileUseQuery contentTypeIsNotNull();





        public VsFileUseQuery fileEngine(String fileEngine);
        public VsFileUseQuery fileEngineNot(String fileEngineNot);
        public VsFileUseQuery fileEngineIn(String fileEngineIn);
        public VsFileUseQuery fileEngineNotIn(String fileEngineNotIn);
        public VsFileUseQuery fileEngineIsNull();
        public VsFileUseQuery fileEngineIsNotNull();





        public VsFileUseQuery fileHost(String fileHost);
        public VsFileUseQuery fileHostNot(String fileHostNot);
        public VsFileUseQuery fileHostIn(String fileHostIn);
        public VsFileUseQuery fileHostNotIn(String fileHostNotIn);
        public VsFileUseQuery fileHostLike(String fileHostLike);
        public VsFileUseQuery fileHostNotLike(String fileHostNotLike);
        public VsFileUseQuery fileHostIsNull();
        public VsFileUseQuery fileHostIsNotNull();





        public VsFileUseQuery filePullName(Double filePullName);
        public VsFileUseQuery filePullNameNot(Double filePullNameNot);
        public VsFileUseQuery filePullNameGreaterThan(Double filePullNameGreaterThan);
        public VsFileUseQuery filePullNameGreaterEqual(Double filePullNameGreaterEqual);
        public VsFileUseQuery filePullNameLessThan(Double filePullNameLessThan);
        public VsFileUseQuery filePullNameLessEqual(Double filePullNameLessEqual);





        public VsFileUseQuery fileSize(Long fileSize);
        public VsFileUseQuery fileSizeNot(Long fileSizeNot);
        public VsFileUseQuery fileSizeGreaterThan(Long fileSizeGreaterThan);
        public VsFileUseQuery fileSizeGreaterEqual(Long fileSizeGreaterEqual);
        public VsFileUseQuery fileSizeLessThan(Long fileSizeLessThan);
        public VsFileUseQuery fileSizeLessEqual(Long fileSizeLessEqual);





        public VsFileUseQuery useFrequency(Integer useFrequency);
        public VsFileUseQuery useFrequencyNot(Integer useFrequencyNot);
        public VsFileUseQuery useFrequencyGreaterThan(Integer useFrequencyGreaterThan);
        public VsFileUseQuery useFrequencyGreaterEqual(Integer useFrequencyGreaterEqual);
        public VsFileUseQuery useFrequencyLessThan(Integer useFrequencyLessThan);
        public VsFileUseQuery useFrequencyLessEqual(Integer useFrequencyLessEqual);






	
}