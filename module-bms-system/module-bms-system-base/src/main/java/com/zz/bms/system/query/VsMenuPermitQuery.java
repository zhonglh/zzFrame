package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.VsMenuPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 菜单许可关联 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-1 13:52:04
 */
public interface VsMenuPermitQuery<PK extends Serializable> extends Query<VsMenuPermitEntity,PK> {

        public VsMenuPermitQuery id(PK id);
        public VsMenuPermitQuery idNot(PK idNot);
        public VsMenuPermitQuery idIn(PK idIn);
        public VsMenuPermitQuery idNotIn(PK idNotIn);
        public VsMenuPermitQuery idIsNull();
        public VsMenuPermitQuery idIsNotNull();





        public VsMenuPermitQuery menuId(String menuId);
        public VsMenuPermitQuery menuIdNot(String menuIdNot);
        public VsMenuPermitQuery menuIdIn(String menuIdIn);
        public VsMenuPermitQuery menuIdNotIn(String menuIdNotIn);
        public VsMenuPermitQuery menuIdLike(String menuIdLike);
        public VsMenuPermitQuery menuIdNotLike(String menuIdNotLike);
        public VsMenuPermitQuery menuIdIsNull();
        public VsMenuPermitQuery menuIdIsNotNull();





        public VsMenuPermitQuery permitId(String permitId);
        public VsMenuPermitQuery permitIdNot(String permitIdNot);
        public VsMenuPermitQuery permitIdIn(String permitIdIn);
        public VsMenuPermitQuery permitIdNotIn(String permitIdNotIn);
        public VsMenuPermitQuery permitIdLike(String permitIdLike);
        public VsMenuPermitQuery permitIdNotLike(String permitIdNotLike);
        public VsMenuPermitQuery permitIdIsNull();
        public VsMenuPermitQuery permitIdIsNotNull();





        public VsMenuPermitQuery permitCode(String permitCode);
        public VsMenuPermitQuery permitCodeNot(String permitCodeNot);
        public VsMenuPermitQuery permitCodeIn(String permitCodeIn);
        public VsMenuPermitQuery permitCodeNotIn(String permitCodeNotIn);
        public VsMenuPermitQuery permitCodeLike(String permitCodeLike);
        public VsMenuPermitQuery permitCodeNotLike(String permitCodeNotLike);
        public VsMenuPermitQuery permitCodeIsNull();
        public VsMenuPermitQuery permitCodeIsNotNull();





        public VsMenuPermitQuery permitName(String permitName);
        public VsMenuPermitQuery permitNameNot(String permitNameNot);
        public VsMenuPermitQuery permitNameIn(String permitNameIn);
        public VsMenuPermitQuery permitNameNotIn(String permitNameNotIn);
        public VsMenuPermitQuery permitNameLike(String permitNameLike);
        public VsMenuPermitQuery permitNameNotLike(String permitNameNotLike);
        public VsMenuPermitQuery permitNameIsNull();
        public VsMenuPermitQuery permitNameIsNotNull();






	
}