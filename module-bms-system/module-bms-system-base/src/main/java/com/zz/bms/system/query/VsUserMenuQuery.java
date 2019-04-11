package com.zz.bms.system.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bms.system.domain.VsUserMenuEntity;

import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;

/**
 * 用户菜单信息 查询抽象类
 *
 * @author Administrator
 * @date 2019-4-11 14:06:18
 */
public interface VsUserMenuQuery<PK extends Serializable> extends Query<VsUserMenuEntity,PK> {

        public VsUserMenuQuery id(PK id);
        public VsUserMenuQuery idNot(PK idNot);
        public VsUserMenuQuery idIn(PK idIn);
        public VsUserMenuQuery idNotIn(PK idNotIn);
        public VsUserMenuQuery idIsNull();
        public VsUserMenuQuery idIsNotNull();





        public VsUserMenuQuery pid(PK pid);
        public VsUserMenuQuery pidNot(PK pidNot);
        public VsUserMenuQuery pidIn(PK pidIn);
        public VsUserMenuQuery pidNotIn(PK pidNotIn);
        public VsUserMenuQuery pidIsNull();
        public VsUserMenuQuery pidIsNotNull();





        public VsUserMenuQuery title(String title);
        public VsUserMenuQuery titleNot(String titleNot);
        public VsUserMenuQuery titleIn(String titleIn);
        public VsUserMenuQuery titleNotIn(String titleNotIn);
        public VsUserMenuQuery titleLike(String titleLike);
        public VsUserMenuQuery titleNotLike(String titleNotLike);
        public VsUserMenuQuery titleIsNull();
        public VsUserMenuQuery titleIsNotNull();





        public VsUserMenuQuery icon(String icon);
        public VsUserMenuQuery iconNot(String iconNot);
        public VsUserMenuQuery iconIn(String iconIn);
        public VsUserMenuQuery iconNotIn(String iconNotIn);
        public VsUserMenuQuery iconLike(String iconLike);
        public VsUserMenuQuery iconNotLike(String iconNotLike);
        public VsUserMenuQuery iconIsNull();
        public VsUserMenuQuery iconIsNotNull();





        public VsUserMenuQuery component(String component);
        public VsUserMenuQuery componentNot(String componentNot);
        public VsUserMenuQuery componentIn(String componentIn);
        public VsUserMenuQuery componentNotIn(String componentNotIn);
        public VsUserMenuQuery componentLike(String componentLike);
        public VsUserMenuQuery componentNotLike(String componentNotLike);
        public VsUserMenuQuery componentIsNull();
        public VsUserMenuQuery componentIsNotNull();





        public VsUserMenuQuery sortno(Integer sortno);
        public VsUserMenuQuery sortnoNot(Integer sortnoNot);
        public VsUserMenuQuery sortnoGreaterThan(Integer sortnoGreaterThan);
        public VsUserMenuQuery sortnoGreaterEqual(Integer sortnoGreaterEqual);
        public VsUserMenuQuery sortnoLessThan(Integer sortnoLessThan);
        public VsUserMenuQuery sortnoLessEqual(Integer sortnoLessEqual);





        public VsUserMenuQuery path(String path);
        public VsUserMenuQuery pathNot(String pathNot);
        public VsUserMenuQuery pathIn(String pathIn);
        public VsUserMenuQuery pathNotIn(String pathNotIn);
        public VsUserMenuQuery pathLike(String pathLike);
        public VsUserMenuQuery pathNotLike(String pathNotLike);
        public VsUserMenuQuery pathIsNull();
        public VsUserMenuQuery pathIsNotNull();





        public VsUserMenuQuery shortcut(String shortcut);
        public VsUserMenuQuery shortcutNot(String shortcutNot);
        public VsUserMenuQuery shortcutIn(String shortcutIn);
        public VsUserMenuQuery shortcutNotIn(String shortcutNotIn);
        public VsUserMenuQuery shortcutIsNull();
        public VsUserMenuQuery shortcutIsNotNull();





        public VsUserMenuQuery name(String name);
        public VsUserMenuQuery nameNot(String nameNot);
        public VsUserMenuQuery nameIn(String nameIn);
        public VsUserMenuQuery nameNotIn(String nameNotIn);
        public VsUserMenuQuery nameLike(String nameLike);
        public VsUserMenuQuery nameNotLike(String nameNotLike);
        public VsUserMenuQuery nameIsNull();
        public VsUserMenuQuery nameIsNotNull();





        public VsUserMenuQuery level(Integer level);
        public VsUserMenuQuery levelNot(Integer levelNot);
        public VsUserMenuQuery levelGreaterThan(Integer levelGreaterThan);
        public VsUserMenuQuery levelGreaterEqual(Integer levelGreaterEqual);
        public VsUserMenuQuery levelLessThan(Integer levelLessThan);
        public VsUserMenuQuery levelLessEqual(Integer levelLessEqual);





        public VsUserMenuQuery leaf(String leaf);
        public VsUserMenuQuery leafNot(String leafNot);
        public VsUserMenuQuery leafIn(String leafIn);
        public VsUserMenuQuery leafNotIn(String leafNotIn);
        public VsUserMenuQuery leafIsNull();
        public VsUserMenuQuery leafIsNotNull();





        public VsUserMenuQuery deleteFlag(String deleteFlag);
        public VsUserMenuQuery deleteFlagNot(String deleteFlagNot);
        public VsUserMenuQuery deleteFlagIn(String deleteFlagIn);
        public VsUserMenuQuery deleteFlagNotIn(String deleteFlagNotIn);
        public VsUserMenuQuery deleteFlagLike(String deleteFlagLike);
        public VsUserMenuQuery deleteFlagNotLike(String deleteFlagNotLike);
        public VsUserMenuQuery deleteFlagIsNull();
        public VsUserMenuQuery deleteFlagIsNotNull();





        public VsUserMenuQuery userName(String userName);
        public VsUserMenuQuery userNameNot(String userNameNot);
        public VsUserMenuQuery userNameIn(String userNameIn);
        public VsUserMenuQuery userNameNotIn(String userNameNotIn);
        public VsUserMenuQuery userNameLike(String userNameLike);
        public VsUserMenuQuery userNameNotLike(String userNameNotLike);
        public VsUserMenuQuery userNameIsNull();
        public VsUserMenuQuery userNameIsNotNull();





        public VsUserMenuQuery loginName(String loginName);
        public VsUserMenuQuery loginNameNot(String loginNameNot);
        public VsUserMenuQuery loginNameIn(String loginNameIn);
        public VsUserMenuQuery loginNameNotIn(String loginNameNotIn);
        public VsUserMenuQuery loginNameLike(String loginNameLike);
        public VsUserMenuQuery loginNameNotLike(String loginNameNotLike);
        public VsUserMenuQuery loginNameIsNull();
        public VsUserMenuQuery loginNameIsNotNull();





        public VsUserMenuQuery userId(PK userId);
        public VsUserMenuQuery userIdNot(PK userIdNot);
        public VsUserMenuQuery userIdIn(PK userIdIn);
        public VsUserMenuQuery userIdNotIn(PK userIdNotIn);
        public VsUserMenuQuery userIdIsNull();
        public VsUserMenuQuery userIdIsNotNull();






	
}