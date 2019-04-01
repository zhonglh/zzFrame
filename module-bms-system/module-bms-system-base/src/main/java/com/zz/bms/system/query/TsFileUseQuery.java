package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsFileUseEntity;

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
public interface TsFileUseQuery<PK extends Serializable> extends Query<TsFileUseEntity,PK> {

        public TsFileUseQuery id(PK id);
        public TsFileUseQuery idNot(PK idNot);
        public TsFileUseQuery idIn(PK idIn);
        public TsFileUseQuery idNotIn(PK idNotIn);
        public TsFileUseQuery idIsNull();
        public TsFileUseQuery idIsNotNull();





        public TsFileUseQuery fileId(String fileId);
        public TsFileUseQuery fileIdNot(String fileIdNot);
        public TsFileUseQuery fileIdIn(String fileIdIn);
        public TsFileUseQuery fileIdNotIn(String fileIdNotIn);
        public TsFileUseQuery fileIdLike(String fileIdLike);
        public TsFileUseQuery fileIdNotLike(String fileIdNotLike);
        public TsFileUseQuery fileIdIsNull();
        public TsFileUseQuery fileIdIsNotNull();





        public TsFileUseQuery showName(String showName);
        public TsFileUseQuery showNameNot(String showNameNot);
        public TsFileUseQuery showNameIn(String showNameIn);
        public TsFileUseQuery showNameNotIn(String showNameNotIn);
        public TsFileUseQuery showNameLike(String showNameLike);
        public TsFileUseQuery showNameNotLike(String showNameNotLike);
        public TsFileUseQuery showNameIsNull();
        public TsFileUseQuery showNameIsNotNull();





        public TsFileUseQuery businessType(String businessType);
        public TsFileUseQuery businessTypeNot(String businessTypeNot);
        public TsFileUseQuery businessTypeIn(String businessTypeIn);
        public TsFileUseQuery businessTypeNotIn(String businessTypeNotIn);
        public TsFileUseQuery businessTypeIsNull();
        public TsFileUseQuery businessTypeIsNotNull();





        public TsFileUseQuery businessTmpId(String businessTmpId);
        public TsFileUseQuery businessTmpIdNot(String businessTmpIdNot);
        public TsFileUseQuery businessTmpIdIn(String businessTmpIdIn);
        public TsFileUseQuery businessTmpIdNotIn(String businessTmpIdNotIn);
        public TsFileUseQuery businessTmpIdLike(String businessTmpIdLike);
        public TsFileUseQuery businessTmpIdNotLike(String businessTmpIdNotLike);
        public TsFileUseQuery businessTmpIdIsNull();
        public TsFileUseQuery businessTmpIdIsNotNull();





        public TsFileUseQuery businessId(String businessId);
        public TsFileUseQuery businessIdNot(String businessIdNot);
        public TsFileUseQuery businessIdIn(String businessIdIn);
        public TsFileUseQuery businessIdNotIn(String businessIdNotIn);
        public TsFileUseQuery businessIdLike(String businessIdLike);
        public TsFileUseQuery businessIdNotLike(String businessIdNotLike);
        public TsFileUseQuery businessIdIsNull();
        public TsFileUseQuery businessIdIsNotNull();





        public TsFileUseQuery fileOrder(Integer fileOrder);
        public TsFileUseQuery fileOrderNot(Integer fileOrderNot);
        public TsFileUseQuery fileOrderGreaterThan(Integer fileOrderGreaterThan);
        public TsFileUseQuery fileOrderGreaterEqual(Integer fileOrderGreaterEqual);
        public TsFileUseQuery fileOrderLessThan(Integer fileOrderLessThan);
        public TsFileUseQuery fileOrderLessEqual(Integer fileOrderLessEqual);





        public TsFileUseQuery remark(String remark);
        public TsFileUseQuery remarkNot(String remarkNot);
        public TsFileUseQuery remarkIn(String remarkIn);
        public TsFileUseQuery remarkNotIn(String remarkNotIn);
        public TsFileUseQuery remarkLike(String remarkLike);
        public TsFileUseQuery remarkNotLike(String remarkNotLike);
        public TsFileUseQuery remarkIsNull();
        public TsFileUseQuery remarkIsNotNull();





        public TsFileUseQuery createUserId(String createUserId);
        public TsFileUseQuery createUserIdNot(String createUserIdNot);
        public TsFileUseQuery createUserIdIn(String createUserIdIn);
        public TsFileUseQuery createUserIdNotIn(String createUserIdNotIn);
        public TsFileUseQuery createUserIdLike(String createUserIdLike);
        public TsFileUseQuery createUserIdNotLike(String createUserIdNotLike);
        public TsFileUseQuery createUserIdIsNull();
        public TsFileUseQuery createUserIdIsNotNull();





        public TsFileUseQuery createUserName(String createUserName);
        public TsFileUseQuery createUserNameNot(String createUserNameNot);
        public TsFileUseQuery createUserNameIn(String createUserNameIn);
        public TsFileUseQuery createUserNameNotIn(String createUserNameNotIn);
        public TsFileUseQuery createUserNameLike(String createUserNameLike);
        public TsFileUseQuery createUserNameNotLike(String createUserNameNotLike);
        public TsFileUseQuery createUserNameIsNull();
        public TsFileUseQuery createUserNameIsNotNull();





        public TsFileUseQuery createTime(Timestamp createTime);
        public TsFileUseQuery createTimeNot(Timestamp createTimeNot);
        public TsFileUseQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TsFileUseQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TsFileUseQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TsFileUseQuery createTimeLessEqual(Timestamp createTimeLessEqual);





        public TsFileUseQuery updateUserId(String updateUserId);
        public TsFileUseQuery updateUserIdNot(String updateUserIdNot);
        public TsFileUseQuery updateUserIdIn(String updateUserIdIn);
        public TsFileUseQuery updateUserIdNotIn(String updateUserIdNotIn);
        public TsFileUseQuery updateUserIdLike(String updateUserIdLike);
        public TsFileUseQuery updateUserIdNotLike(String updateUserIdNotLike);
        public TsFileUseQuery updateUserIdIsNull();
        public TsFileUseQuery updateUserIdIsNotNull();





        public TsFileUseQuery updateUserName(String updateUserName);
        public TsFileUseQuery updateUserNameNot(String updateUserNameNot);
        public TsFileUseQuery updateUserNameIn(String updateUserNameIn);
        public TsFileUseQuery updateUserNameNotIn(String updateUserNameNotIn);
        public TsFileUseQuery updateUserNameLike(String updateUserNameLike);
        public TsFileUseQuery updateUserNameNotLike(String updateUserNameNotLike);
        public TsFileUseQuery updateUserNameIsNull();
        public TsFileUseQuery updateUserNameIsNotNull();





        public TsFileUseQuery updateTime(Timestamp updateTime);
        public TsFileUseQuery updateTimeNot(Timestamp updateTimeNot);
        public TsFileUseQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TsFileUseQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TsFileUseQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TsFileUseQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);





        public TsFileUseQuery versionNo(Integer versionNo);
        public TsFileUseQuery versionNoNot(Integer versionNoNot);
        public TsFileUseQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TsFileUseQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TsFileUseQuery versionNoLessThan(Integer versionNoLessThan);
        public TsFileUseQuery versionNoLessEqual(Integer versionNoLessEqual);





        public TsFileUseQuery tenantId(PK tenantId);
        public TsFileUseQuery tenantIdNot(PK tenantIdNot);
        public TsFileUseQuery tenantIdIn(PK tenantIdIn);
        public TsFileUseQuery tenantIdNotIn(PK tenantIdNotIn);
        public TsFileUseQuery tenantIdIsNull();
        public TsFileUseQuery tenantIdIsNotNull();






	
}