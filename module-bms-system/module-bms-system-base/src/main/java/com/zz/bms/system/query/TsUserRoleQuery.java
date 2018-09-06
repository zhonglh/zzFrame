package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsUserRoleEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 用户角色关联 查询抽象类
 *
 * @author Administrator
 * @date 2018-9-6 23:56:30
 */
public interface TsUserRoleQuery<PK extends Serializable> extends Query<TsUserRoleEntity,PK> {

        public TsUserRoleQuery id(PK id);
        public TsUserRoleQuery idNot(PK idNot);
        public TsUserRoleQuery idIn(PK idIn);
        public TsUserRoleQuery idNotIn(PK idNotIn);
        public TsUserRoleQuery idIsNull();
        public TsUserRoleQuery idIsNotNull();





        public TsUserRoleQuery userId(PK userId);
        public TsUserRoleQuery userIdNot(PK userIdNot);
        public TsUserRoleQuery userIdIn(PK userIdIn);
        public TsUserRoleQuery userIdNotIn(PK userIdNotIn);
        public TsUserRoleQuery userIdIsNull();
        public TsUserRoleQuery userIdIsNotNull();





        public TsUserRoleQuery roleId(PK roleId);
        public TsUserRoleQuery roleIdNot(PK roleIdNot);
        public TsUserRoleQuery roleIdIn(PK roleIdIn);
        public TsUserRoleQuery roleIdNotIn(PK roleIdNotIn);
        public TsUserRoleQuery roleIdIsNull();
        public TsUserRoleQuery roleIdIsNotNull();






	
}