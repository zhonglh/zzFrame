package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsFilesUseEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.lang.String;
import java.lang.Integer;

/**
 * 文件使用 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:31
 */
public interface TsFilesUseQuery<PK extends Serializable> extends Query<TsFilesUseEntity,PK> {

        public TsFilesUseQuery id(PK id);
        public TsFilesUseQuery idNot(PK idNot);
        public TsFilesUseQuery idIn(PK idIn);
        public TsFilesUseQuery idNotIn(PK idNotIn);
        public TsFilesUseQuery idIsNull();
        public TsFilesUseQuery idIsNotNull();





        public TsFilesUseQuery fileId(String fileId);
        public TsFilesUseQuery fileIdNot(String fileIdNot);
        public TsFilesUseQuery fileIdIn(String fileIdIn);
        public TsFilesUseQuery fileIdNotIn(String fileIdNotIn);
        public TsFilesUseQuery fileIdLike(String fileIdLike);
        public TsFilesUseQuery fileIdNotLike(String fileIdNotLike);
        public TsFilesUseQuery fileIdIsNull();
        public TsFilesUseQuery fileIdIsNotNull();





        public TsFilesUseQuery showName(String showName);
        public TsFilesUseQuery showNameNot(String showNameNot);
        public TsFilesUseQuery showNameIn(String showNameIn);
        public TsFilesUseQuery showNameNotIn(String showNameNotIn);
        public TsFilesUseQuery showNameLike(String showNameLike);
        public TsFilesUseQuery showNameNotLike(String showNameNotLike);
        public TsFilesUseQuery showNameIsNull();
        public TsFilesUseQuery showNameIsNotNull();





        public TsFilesUseQuery businessType(String businessType);
        public TsFilesUseQuery businessTypeNot(String businessTypeNot);
        public TsFilesUseQuery businessTypeIn(String businessTypeIn);
        public TsFilesUseQuery businessTypeNotIn(String businessTypeNotIn);
        public TsFilesUseQuery businessTypeIsNull();
        public TsFilesUseQuery businessTypeIsNotNull();





        public TsFilesUseQuery businessTmpId(String businessTmpId);
        public TsFilesUseQuery businessTmpIdNot(String businessTmpIdNot);
        public TsFilesUseQuery businessTmpIdIn(String businessTmpIdIn);
        public TsFilesUseQuery businessTmpIdNotIn(String businessTmpIdNotIn);
        public TsFilesUseQuery businessTmpIdLike(String businessTmpIdLike);
        public TsFilesUseQuery businessTmpIdNotLike(String businessTmpIdNotLike);
        public TsFilesUseQuery businessTmpIdIsNull();
        public TsFilesUseQuery businessTmpIdIsNotNull();





        public TsFilesUseQuery businessId(String businessId);
        public TsFilesUseQuery businessIdNot(String businessIdNot);
        public TsFilesUseQuery businessIdIn(String businessIdIn);
        public TsFilesUseQuery businessIdNotIn(String businessIdNotIn);
        public TsFilesUseQuery businessIdLike(String businessIdLike);
        public TsFilesUseQuery businessIdNotLike(String businessIdNotLike);
        public TsFilesUseQuery businessIdIsNull();
        public TsFilesUseQuery businessIdIsNotNull();





        public TsFilesUseQuery fileOrder(Integer fileOrder);
        public TsFilesUseQuery fileOrderNot(Integer fileOrderNot);
        public TsFilesUseQuery fileOrderGreaterThan(Integer fileOrderGreaterThan);
        public TsFilesUseQuery fileOrderGreaterEqual(Integer fileOrderGreaterEqual);
        public TsFilesUseQuery fileOrderLessThan(Integer fileOrderLessThan);
        public TsFilesUseQuery fileOrderLessEqual(Integer fileOrderLessEqual);





        public TsFilesUseQuery remark(String remark);
        public TsFilesUseQuery remarkNot(String remarkNot);
        public TsFilesUseQuery remarkIn(String remarkIn);
        public TsFilesUseQuery remarkNotIn(String remarkNotIn);
        public TsFilesUseQuery remarkLike(String remarkLike);
        public TsFilesUseQuery remarkNotLike(String remarkNotLike);
        public TsFilesUseQuery remarkIsNull();
        public TsFilesUseQuery remarkIsNotNull();





        public TsFilesUseQuery createUserId(String createUserId);
        public TsFilesUseQuery createUserIdNot(String createUserIdNot);
        public TsFilesUseQuery createUserIdIn(String createUserIdIn);
        public TsFilesUseQuery createUserIdNotIn(String createUserIdNotIn);
        public TsFilesUseQuery createUserIdLike(String createUserIdLike);
        public TsFilesUseQuery createUserIdNotLike(String createUserIdNotLike);
        public TsFilesUseQuery createUserIdIsNull();
        public TsFilesUseQuery createUserIdIsNotNull();





        public TsFilesUseQuery createUserName(String createUserName);
        public TsFilesUseQuery createUserNameNot(String createUserNameNot);
        public TsFilesUseQuery createUserNameIn(String createUserNameIn);
        public TsFilesUseQuery createUserNameNotIn(String createUserNameNotIn);
        public TsFilesUseQuery createUserNameLike(String createUserNameLike);
        public TsFilesUseQuery createUserNameNotLike(String createUserNameNotLike);
        public TsFilesUseQuery createUserNameIsNull();
        public TsFilesUseQuery createUserNameIsNotNull();





        public TsFilesUseQuery createTime(Timestamp createTime);
        public TsFilesUseQuery createTimeNot(Timestamp createTimeNot);
        public TsFilesUseQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsFilesUseQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsFilesUseQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsFilesUseQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsFilesUseQuery updateUserId(String updateUserId);
        public TsFilesUseQuery updateUserIdNot(String updateUserIdNot);
        public TsFilesUseQuery updateUserIdIn(String updateUserIdIn);
        public TsFilesUseQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsFilesUseQuery updateUserIdLike(String updateUserIdLike);
        public TsFilesUseQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsFilesUseQuery updateUserIdIsNull();
        public TsFilesUseQuery updateUserIdIsNotNull();





        public TsFilesUseQuery updateUserName(String updateUserName);
        public TsFilesUseQuery updateUserNameNot(String updateUserNameNot);
        public TsFilesUseQuery updateUserNameIn(String updateUserNameIn);
        public TsFilesUseQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsFilesUseQuery updateUserNameLike(String updateUserNameLike);
        public TsFilesUseQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsFilesUseQuery updateUserNameIsNull();
        public TsFilesUseQuery updateUserNameIsNotNull();





        public TsFilesUseQuery updateTime(Timestamp updateTime);
        public TsFilesUseQuery updateTimeNot(Timestamp updateTimeNot);
        public TsFilesUseQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsFilesUseQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsFilesUseQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsFilesUseQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsFilesUseQuery versionNo(Integer versionNo);
        public TsFilesUseQuery versionNoNot(Integer versionNoNot);
        public TsFilesUseQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsFilesUseQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsFilesUseQuery versionNoLessThan(Integer versionNoLessThan);
        public TsFilesUseQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TsFilesUseQuery tenantId(PK tenantId);
        public TsFilesUseQuery tenantIdNot(PK tenantIdNot);
        public TsFilesUseQuery tenantIdIn(PK tenantIdIn);
        public TsFilesUseQuery tenantIdNotIn(PK tenantIdNotIn);
        public TsFilesUseQuery tenantIdIsNull();
        public TsFilesUseQuery tenantIdIsNotNull();






	
}