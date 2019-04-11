package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.VsUserPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * VIEW 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:18
 */
public interface VsUserPermitQuery<PK extends Serializable> extends Query<VsUserPermitEntity,PK> {

        public VsUserPermitQuery id(PK id);
        public VsUserPermitQuery idNot(PK idNot);
        public VsUserPermitQuery idIn(PK idIn);
        public VsUserPermitQuery idNotIn(PK idNotIn);
        public VsUserPermitQuery idIsNull();
        public VsUserPermitQuery idIsNotNull();





        public VsUserPermitQuery permitCode(String permitCode);
        public VsUserPermitQuery permitCodeNot(String permitCodeNot);
        public VsUserPermitQuery permitCodeIn(String permitCodeIn);
        public VsUserPermitQuery permitCodeNotIn(String permitCodeNotIn);
        public VsUserPermitQuery permitCodeLike(String permitCodeLike);
        public VsUserPermitQuery permitCodeNotLike(String permitCodeNotLike);
        public VsUserPermitQuery permitCodeIsNull();
        public VsUserPermitQuery permitCodeIsNotNull();





        public VsUserPermitQuery permitName(String permitName);
        public VsUserPermitQuery permitNameNot(String permitNameNot);
        public VsUserPermitQuery permitNameIn(String permitNameIn);
        public VsUserPermitQuery permitNameNotIn(String permitNameNotIn);
        public VsUserPermitQuery permitNameLike(String permitNameLike);
        public VsUserPermitQuery permitNameNotLike(String permitNameNotLike);
        public VsUserPermitQuery permitNameIsNull();
        public VsUserPermitQuery permitNameIsNotNull();





        public VsUserPermitQuery userName(String userName);
        public VsUserPermitQuery userNameNot(String userNameNot);
        public VsUserPermitQuery userNameIn(String userNameIn);
        public VsUserPermitQuery userNameNotIn(String userNameNotIn);
        public VsUserPermitQuery userNameLike(String userNameLike);
        public VsUserPermitQuery userNameNotLike(String userNameNotLike);
        public VsUserPermitQuery userNameIsNull();
        public VsUserPermitQuery userNameIsNotNull();





        public VsUserPermitQuery loginName(String loginName);
        public VsUserPermitQuery loginNameNot(String loginNameNot);
        public VsUserPermitQuery loginNameIn(String loginNameIn);
        public VsUserPermitQuery loginNameNotIn(String loginNameNotIn);
        public VsUserPermitQuery loginNameLike(String loginNameLike);
        public VsUserPermitQuery loginNameNotLike(String loginNameNotLike);
        public VsUserPermitQuery loginNameIsNull();
        public VsUserPermitQuery loginNameIsNotNull();





        public VsUserPermitQuery userId(PK userId);
        public VsUserPermitQuery userIdNot(PK userIdNot);
        public VsUserPermitQuery userIdIn(PK userIdIn);
        public VsUserPermitQuery userIdNotIn(PK userIdNotIn);
        public VsUserPermitQuery userIdIsNull();
        public VsUserPermitQuery userIdIsNotNull();






	
}