package com.zz.bms.system.query.impl;


import java.io.Serializable;

import java.lang.String;

/**
* 菜单许可关联 用于装载用户在查询时提交的数据
* 用于链式查询
* @author Administrator
* @date 2019-4-11 14:06:15
*/
public class TsMenuPermitQueryWebImpl<PK extends Serializable> extends TsMenuPermitAbstractQueryImpl<PK> implements Serializable {


            private PK id_IN;
            private PK id_NOTIN;



            private PK menuId_IN;
            private PK menuId_NOTIN;



            private PK permitId_IN;
            private PK permitId_NOTIN;






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


            public PK getPermitId() {
                return permitId;
            }

            public void setPermitId(PK permitId) {
                this.permitId = permitId;
            }

            public PK getPermitId_NE() {
                return permitId_NE;
            }

            public void setPermitId_NE(PK permitId_NE) {
                this.permitId_NE = permitId_NE;
            }

            public PK getPermitId_IN() {
                return permitId_IN;
            }

            public void setPermitId_IN(PK permitId_IN) {
                this.permitId_IN = permitId_IN;
            }

            public PK getPermitId_NOTIN() {
                return permitId_NOTIN;
            }

            public void setPermitId_NOTIN(PK permitId_NOTIN) {
                this.permitId_NOTIN = permitId_NOTIN;
            }

}