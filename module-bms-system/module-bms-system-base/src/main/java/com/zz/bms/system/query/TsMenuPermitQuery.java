package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsMenuPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 菜单许可关联 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:15
 */
public interface TsMenuPermitQuery<PK extends Serializable> extends Query<TsMenuPermitEntity,PK> {

        public TsMenuPermitQuery id(PK id);
        public TsMenuPermitQuery idNot(PK idNot);
        public TsMenuPermitQuery idIn(PK idIn);
        public TsMenuPermitQuery idNotIn(PK idNotIn);
        public TsMenuPermitQuery idIsNull();
        public TsMenuPermitQuery idIsNotNull();





        public TsMenuPermitQuery menuId(PK menuId);
        public TsMenuPermitQuery menuIdNot(PK menuIdNot);
        public TsMenuPermitQuery menuIdIn(PK menuIdIn);
        public TsMenuPermitQuery menuIdNotIn(PK menuIdNotIn);
        public TsMenuPermitQuery menuIdIsNull();
        public TsMenuPermitQuery menuIdIsNotNull();





        public TsMenuPermitQuery permitId(PK permitId);
        public TsMenuPermitQuery permitIdNot(PK permitIdNot);
        public TsMenuPermitQuery permitIdIn(PK permitIdIn);
        public TsMenuPermitQuery permitIdNotIn(PK permitIdNotIn);
        public TsMenuPermitQuery permitIdIsNull();
        public TsMenuPermitQuery permitIdIsNotNull();






	
}