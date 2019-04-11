package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsRolePermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 角色许可关联 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:16
 */
public interface TsRolePermitQuery<PK extends Serializable> extends Query<TsRolePermitEntity,PK> {

        public TsRolePermitQuery id(PK id);
        public TsRolePermitQuery idNot(PK idNot);
        public TsRolePermitQuery idIn(PK idIn);
        public TsRolePermitQuery idNotIn(PK idNotIn);
        public TsRolePermitQuery idIsNull();
        public TsRolePermitQuery idIsNotNull();





        public TsRolePermitQuery roleId(PK roleId);
        public TsRolePermitQuery roleIdNot(PK roleIdNot);
        public TsRolePermitQuery roleIdIn(PK roleIdIn);
        public TsRolePermitQuery roleIdNotIn(PK roleIdNotIn);
        public TsRolePermitQuery roleIdIsNull();
        public TsRolePermitQuery roleIdIsNotNull();





        public TsRolePermitQuery permitId(PK permitId);
        public TsRolePermitQuery permitIdNot(PK permitIdNot);
        public TsRolePermitQuery permitIdIn(PK permitIdIn);
        public TsRolePermitQuery permitIdNotIn(PK permitIdNotIn);
        public TsRolePermitQuery permitIdIsNull();
        public TsRolePermitQuery permitIdIsNotNull();






	
}