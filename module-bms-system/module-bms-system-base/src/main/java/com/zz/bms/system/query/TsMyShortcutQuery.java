package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.TsMyShortcutEntity;

import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;

/**
 * 置顶快捷菜单 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:13
 */
public interface TsMyShortcutQuery<PK extends Serializable> extends Query<TsMyShortcutEntity,PK> {

        public TsMyShortcutQuery id(PK id);
        public TsMyShortcutQuery idNot(PK idNot);
        public TsMyShortcutQuery idIn(PK idIn);
        public TsMyShortcutQuery idNotIn(PK idNotIn);
        public TsMyShortcutQuery idIsNull();
        public TsMyShortcutQuery idIsNotNull();





        public TsMyShortcutQuery menuId(PK menuId);
        public TsMyShortcutQuery menuIdNot(PK menuIdNot);
        public TsMyShortcutQuery menuIdIn(PK menuIdIn);
        public TsMyShortcutQuery menuIdNotIn(PK menuIdNotIn);
        public TsMyShortcutQuery menuIdIsNull();
        public TsMyShortcutQuery menuIdIsNotNull();





        public TsMyShortcutQuery userId(PK userId);
        public TsMyShortcutQuery userIdNot(PK userIdNot);
        public TsMyShortcutQuery userIdIn(PK userIdIn);
        public TsMyShortcutQuery userIdNotIn(PK userIdNotIn);
        public TsMyShortcutQuery userIdIsNull();
        public TsMyShortcutQuery userIdIsNotNull();





        public TsMyShortcutQuery orderby(Integer orderby);
        public TsMyShortcutQuery orderbyNot(Integer orderbyNot);
        public TsMyShortcutQuery orderbyGreaterThan(Integer orderbyGreaterThan);
        public TsMyShortcutQuery orderbyGreaterEqual(Integer orderbyGreaterEqual);
        public TsMyShortcutQuery orderbyLessThan(Integer orderbyLessThan);
        public TsMyShortcutQuery orderbyLessEqual(Integer orderbyLessEqual);






	
}