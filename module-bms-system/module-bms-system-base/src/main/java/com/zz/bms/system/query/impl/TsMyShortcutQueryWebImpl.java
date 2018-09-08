package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.String;

/**
* 置顶快捷菜单 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2018-9-8 12:42:41
*/
public class TsMyShortcutQueryWebImpl<PK extends Serializable> extends TsMyShortcutAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK menuId_IN;
            private PK menuId_NOTIN;



            private PK userId_IN;
            private PK userId_NOTIN;






            public PK getId() {
                return id;
            }

            public void setId(PK id) {
                this.id = id;
            }

            public PK getId_NE() {
                return id_NE;
            }

            public void setId_NE(PK id_NE) {
                this.id_NE = id_NE;
            }

            public PK getId_IN() {
                return id_IN;
            }

            public void setId_IN(PK id_IN) {
                this.id_IN = id_IN;
            }

            public PK getId_NOTIN() {
                return id_NOTIN;
            }

            public void setId_NOTIN(PK id_NOTIN) {
                this.id_NOTIN = id_NOTIN;
            }


            public PK getMenuId() {
                return menuId;
            }

            public void setMenuId(PK menuId) {
                this.menuId = menuId;
            }

            public PK getMenuId_NE() {
                return menuId_NE;
            }

            public void setMenuId_NE(PK menuId_NE) {
                this.menuId_NE = menuId_NE;
            }

            public PK getMenuId_IN() {
                return menuId_IN;
            }

            public void setMenuId_IN(PK menuId_IN) {
                this.menuId_IN = menuId_IN;
            }

            public PK getMenuId_NOTIN() {
                return menuId_NOTIN;
            }

            public void setMenuId_NOTIN(PK menuId_NOTIN) {
                this.menuId_NOTIN = menuId_NOTIN;
            }


            public PK getUserId() {
                return userId;
            }

            public void setUserId(PK userId) {
                this.userId = userId;
            }

            public PK getUserId_NE() {
                return userId_NE;
            }

            public void setUserId_NE(PK userId_NE) {
                this.userId_NE = userId_NE;
            }

            public PK getUserId_IN() {
                return userId_IN;
            }

            public void setUserId_IN(PK userId_IN) {
                this.userId_IN = userId_IN;
            }

            public PK getUserId_NOTIN() {
                return userId_NOTIN;
            }

            public void setUserId_NOTIN(PK userId_NOTIN) {
                this.userId_NOTIN = userId_NOTIN;
            }

}