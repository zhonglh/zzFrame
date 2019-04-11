package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.VsMenuPermitEntity;

import java.io.Serializable;
import java.lang.String;

/**
 * 菜单许可关联 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:15
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





        public VsMenuPermitQuery menuName(String menuName);
        public VsMenuPermitQuery menuNameNot(String menuNameNot);
        public VsMenuPermitQuery menuNameIn(String menuNameIn);
        public VsMenuPermitQuery menuNameNotIn(String menuNameNotIn);
        public VsMenuPermitQuery menuNameLike(String menuNameLike);
        public VsMenuPermitQuery menuNameNotLike(String menuNameNotLike);
        public VsMenuPermitQuery menuNameIsNull();
        public VsMenuPermitQuery menuNameIsNotNull();





        public VsMenuPermitQuery menuCode(String menuCode);
        public VsMenuPermitQuery menuCodeNot(String menuCodeNot);
        public VsMenuPermitQuery menuCodeIn(String menuCodeIn);
        public VsMenuPermitQuery menuCodeNotIn(String menuCodeNotIn);
        public VsMenuPermitQuery menuCodeLike(String menuCodeLike);
        public VsMenuPermitQuery menuCodeNotLike(String menuCodeNotLike);
        public VsMenuPermitQuery menuCodeIsNull();
        public VsMenuPermitQuery menuCodeIsNotNull();






	
}